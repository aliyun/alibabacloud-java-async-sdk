// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJournalProofRequest} extends {@link RequestModel}
 *
 * <p>GetJournalProofRequest</p>
 */
public class GetJournalProofRequest extends Request {
    @Query
    @NameInMap("JournalSequence")
    @Validation(required = true)
    private Long journalSequence;

    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private GetJournalProofRequest(Builder builder) {
        super(builder);
        this.journalSequence = builder.journalSequence;
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJournalProofRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return journalSequence
     */
    public Long getJournalSequence() {
        return this.journalSequence;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<GetJournalProofRequest, Builder> {
        private Long journalSequence; 
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(GetJournalProofRequest response) {
            super(response);
            this.journalSequence = response.journalSequence;
            this.ledgerId = response.ledgerId;
        } 

        /**
         * JournalSequence.
         */
        public Builder journalSequence(Long journalSequence) {
            this.putQueryParameter("JournalSequence", journalSequence);
            this.journalSequence = journalSequence;
            return this;
        }

        /**
         * LedgerId.
         */
        public Builder ledgerId(String ledgerId) {
            this.putQueryParameter("LedgerId", ledgerId);
            this.ledgerId = ledgerId;
            return this;
        }

        @Override
        public GetJournalProofRequest build() {
            return new GetJournalProofRequest(this);
        } 

    } 

}
