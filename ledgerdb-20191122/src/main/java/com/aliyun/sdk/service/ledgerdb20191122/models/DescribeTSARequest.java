// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTSARequest} extends {@link RequestModel}
 *
 * <p>DescribeTSARequest</p>
 */
public class DescribeTSARequest extends Request {
    @Query
    @NameInMap("SequenceWithinLedger")
    @Validation(required = true, minimum = 1)
    private Long sequenceWithinLedger;

    private DescribeTSARequest(Builder builder) {
        super(builder);
        this.sequenceWithinLedger = builder.sequenceWithinLedger;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTSARequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sequenceWithinLedger
     */
    public Long getSequenceWithinLedger() {
        return this.sequenceWithinLedger;
    }

    public static final class Builder extends Request.Builder<DescribeTSARequest, Builder> {
        private Long sequenceWithinLedger; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTSARequest response) {
            super(response);
            this.sequenceWithinLedger = response.sequenceWithinLedger;
        } 

        /**
         * SequenceWithinLedger.
         */
        public Builder sequenceWithinLedger(Long sequenceWithinLedger) {
            this.putQueryParameter("SequenceWithinLedger", sequenceWithinLedger);
            this.sequenceWithinLedger = sequenceWithinLedger;
            return this;
        }

        @Override
        public DescribeTSARequest build() {
            return new DescribeTSARequest(this);
        } 

    } 

}
