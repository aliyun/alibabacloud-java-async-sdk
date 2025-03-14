// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefundReason} extends {@link TeaModel}
 *
 * <p>RefundReason</p>
 */
public class RefundReason extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("proofRequired")
    private Boolean proofRequired;

    @com.aliyun.core.annotation.NameInMap("reasonTextId")
    private String reasonTextId;

    @com.aliyun.core.annotation.NameInMap("reasonTips")
    private String reasonTips;

    @com.aliyun.core.annotation.NameInMap("refundDescRequired")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(RefundReason model) {
            this.proofRequired = model.proofRequired;
            this.reasonTextId = model.reasonTextId;
            this.reasonTips = model.reasonTips;
            this.refundDescRequired = model.refundDescRequired;
        } 

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
