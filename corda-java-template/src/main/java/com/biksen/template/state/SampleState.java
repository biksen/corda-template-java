package com.biksen.template.state;

import com.biksen.template.contract.SampleContract;
import net.corda.core.contracts.ContractState;
import net.corda.core.crypto.CompositeKey;

import java.util.Collections;
import java.util.List;

/**
 * Define your state object here.
 */
public class SampleState implements ContractState {
    private final SampleContract contract;

    public SampleState(SampleContract contract) { this.contract = contract; }

    @Override public SampleContract getContract() { return contract; }

    /** The public keys of the involved parties. */
    @Override public List<CompositeKey> getParticipants() { return Collections.emptyList(); }
}