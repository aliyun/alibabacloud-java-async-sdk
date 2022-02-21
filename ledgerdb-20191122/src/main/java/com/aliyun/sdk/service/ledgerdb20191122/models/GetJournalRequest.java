// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJournalRequest} extends {@link RequestModel}
 *
 * <p>GetJournalRequest</p>
 */
public class GetJournalRequest extends Request {
    @Query
    @NameInMap("JournalId")
    @Validation(required = true)
    private Long journalId;

    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private GetJournalRequest(Builder builder) {
        super(builder);
        this.journalId = builder.journalId;
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJournalRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return journalId
     */
    public Long getJournalId() {
        return this.journalId;
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<GetJournalRequest, Builder> {
        private Long journalId; 
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(GetJournalRequest response) {
            super(response);
            this.journalId = response.journalId;
            this.ledgerId = response.ledgerId;
        } 

        /**
         * JournalId.
         */
        public Builder journalId(Long journalId) {
            this.putQueryParameter("JournalId", journalId);
            this.journalId = journalId;
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
        public GetJournalRequest build() {
            return new GetJournalRequest(this);
        } 

    } 

}
