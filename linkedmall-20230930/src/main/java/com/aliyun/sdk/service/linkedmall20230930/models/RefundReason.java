// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefundReason} extends {@link TeaModel}
 *
 * <p>RefundReason</p>
 */
public class RefundReason extends TeaModel {
    @NameInMap("proofRequired")
    private Boolean proofRequired;

    @NameInMap("reasonTextId")
    private String reasonTextId;

    @NameInMap("reasonTips")
    private String reasonTips;

    @NameInMap("refundDescRequired")
    private Boolean refundDescRequired;

    private RefundReason(Builder builder) {
        this.proofRequired = builder.proofRequired;
        this.reasonTextId = builder.reasonTextId;
        this.reasonTips = builder.reasonTips;
        this.refundDescRequired = builder.refundDescRequired;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefundReason create() {
        return builder().build();
    }

    /**
     * @return proofRequired
     */
    public Boolean getProofRequired() {
        return this.proofRequired;
    }

    /**
     * @return reasonTextId
     */
    public String getReasonTextId() {
        return this.reasonTextId;
    }

    /**
     * @return reasonTips
     */
    public String getReasonTips() {
        return this.reasonTips;
    }

    /**
     * @return refundDescRequired
     */
    public Boolean getRefundDescRequired() {
        return this.refundDescRequired;
    }

    public static final class Builder {
        private Boolean proofRequired; 
        private String reasonTextId; 
        private String reasonTips; 
        private Boolean refundDescRequired; 

        /**
         * proofRequired.
         */
        public Builder proofRequired(Boolean proofRequired) {
            this.proofRequired = proofRequired;
            return this;
        }

        /**
         * reasonTextId.
         */
        public Builder reasonTextId(String reasonTextId) {
            this.reasonTextId = reasonTextId;
            return this;
        }

        /**
         * reasonTips.
         */
        public Builder reasonTips(String reasonTips) {
            this.reasonTips = reasonTips;
            return this;
        }

        /**
         * refundDescRequired.
         */
        public Builder refundDescRequired(Boolean refundDescRequired) {
            this.refundDescRequired = refundDescRequired;
            return this;
        }

        public RefundReason build() {
            return new RefundReason(this);
        } 

    } 

}
