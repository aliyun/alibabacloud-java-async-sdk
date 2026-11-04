// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

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
 * {@link ModifySkillGroupOutboundNumbersRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillGroupOutboundNumbersRequest</p>
 */
public class ModifySkillGroupOutboundNumbersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundPhoneNumberId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> outboundPhoneNumberId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillGroupId;

    private ModifySkillGroupOutboundNumbersRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operationType = builder.operationType;
        this.outboundPhoneNumberId = builder.outboundPhoneNumberId;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySkillGroupOutboundNumbersRequest create() {
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
     * @return operationType
     */
    public Integer getOperationType() {
        return this.operationType;
    }

    /**
     * @return outboundPhoneNumberId
     */
    public java.util.List<String> getOutboundPhoneNumberId() {
        return this.outboundPhoneNumberId;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ModifySkillGroupOutboundNumbersRequest, Builder> {
        private String instanceId; 
        private Integer operationType; 
        private java.util.List<String> outboundPhoneNumberId; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillGroupOutboundNumbersRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operationType = request.operationType;
            this.outboundPhoneNumberId = request.outboundPhoneNumberId;
            this.skillGroupId = request.skillGroupId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder operationType(Integer operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outboundPhoneNumberId(java.util.List<String> outboundPhoneNumberId) {
            this.putQueryParameter("OutboundPhoneNumberId", outboundPhoneNumberId);
            this.outboundPhoneNumberId = outboundPhoneNumberId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder skillGroupId(String skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        @Override
        public ModifySkillGroupOutboundNumbersRequest build() {
            return new ModifySkillGroupOutboundNumbersRequest(this);
        } 

    } 

}
