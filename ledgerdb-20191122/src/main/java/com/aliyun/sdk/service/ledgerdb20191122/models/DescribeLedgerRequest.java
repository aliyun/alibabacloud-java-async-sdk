// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLedgerRequest} extends {@link RequestModel}
 *
 * <p>DescribeLedgerRequest</p>
 */
public class DescribeLedgerRequest extends Request {
    @Query
    @NameInMap("LedgerId")
    @Validation(required = true)
    private String ledgerId;

    private DescribeLedgerRequest(Builder builder) {
        super(builder);
        this.ledgerId = builder.ledgerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLedgerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ledgerId
     */
    public String getLedgerId() {
        return this.ledgerId;
    }

    public static final class Builder extends Request.Builder<DescribeLedgerRequest, Builder> {
        private String ledgerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLedgerRequest response) {
            super(response);
            this.ledgerId = response.ledgerId;
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
        public DescribeLedgerRequest build() {
            return new DescribeLedgerRequest(this);
        } 

    } 

}
