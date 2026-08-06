// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20251111.models;

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
 * {@link CreateOutboundCallRestrictionRequest} extends {@link RequestModel}
 *
 * <p>CreateOutboundCallRestrictionRequest</p>
 */
public class CreateOutboundCallRestrictionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OutboundCallRestriction")
    private java.util.List<OutboundCallRestriction> outboundCallRestriction;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Policy")
    private Integer policy;

    private CreateOutboundCallRestrictionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.outboundCallRestriction = builder.outboundCallRestriction;
        this.policy = builder.policy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOutboundCallRestrictionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return outboundCallRestriction
     */
    public java.util.List<OutboundCallRestriction> getOutboundCallRestriction() {
        return this.outboundCallRestriction;
    }

    /**
     * @return policy
     */
    public Integer getPolicy() {
        return this.policy;
    }

    public static final class Builder extends Request.Builder<CreateOutboundCallRestrictionRequest, Builder> {
        private String instanceId; 
        private java.util.List<OutboundCallRestriction> outboundCallRestriction; 
        private Integer policy; 

        private Builder() {
            super();
        } 

        private Builder(CreateOutboundCallRestrictionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.outboundCallRestriction = request.outboundCallRestriction;
            this.policy = request.policy;
        } 

        /**
         * <p>实例ID</p>
         * 
         * <strong>example:</strong>
         * <p>4f9a8e2b-6c1d-4a7e-9b3f-2d5c8a1e7b04</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>外呼限制</p>
         */
        public Builder outboundCallRestriction(java.util.List<OutboundCallRestriction> outboundCallRestriction) {
            String outboundCallRestrictionShrink = shrink(outboundCallRestriction, "OutboundCallRestriction", "json");
            this.putBodyParameter("OutboundCallRestriction", outboundCallRestrictionShrink);
            this.outboundCallRestriction = outboundCallRestriction;
            return this;
        }

        /**
         * <p>策略</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder policy(Integer policy) {
            this.putBodyParameter("Policy", policy);
            this.policy = policy;
            return this;
        }

        @Override
        public CreateOutboundCallRestrictionRequest build() {
            return new CreateOutboundCallRestrictionRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOutboundCallRestrictionRequest} extends {@link TeaModel}
     *
     * <p>CreateOutboundCallRestrictionRequest</p>
     */
    public static class OutboundCallRestriction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Remark")
        private String remark;

        private OutboundCallRestriction(Builder builder) {
            this.number = builder.number;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutboundCallRestriction create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String number; 
            private String remark; 

            private Builder() {
            } 

            private Builder(OutboundCallRestriction model) {
                this.number = model.number;
                this.remark = model.remark;
            } 

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public OutboundCallRestriction build() {
                return new OutboundCallRestriction(this);
            } 

        } 

    }
}
