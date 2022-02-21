// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySkillGroupOutboundNumbersRequest} extends {@link RequestModel}
 *
 * <p>ModifySkillGroupOutboundNumbersRequest</p>
 */
public class ModifySkillGroupOutboundNumbersRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OperationType")
    @Validation(required = true)
    private Integer operationType;

    @Query
    @NameInMap("OutboundPhoneNumberId")
    @Validation(required = true)
    private java.util.List < String > outboundPhoneNumberId;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
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
    public java.util.List < String > getOutboundPhoneNumberId() {
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
        private java.util.List < String > outboundPhoneNumberId; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifySkillGroupOutboundNumbersRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.operationType = response.operationType;
            this.outboundPhoneNumberId = response.outboundPhoneNumberId;
            this.skillGroupId = response.skillGroupId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperationType.
         */
        public Builder operationType(Integer operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * OutboundPhoneNumberId.
         */
        public Builder outboundPhoneNumberId(java.util.List < String > outboundPhoneNumberId) {
            this.putQueryParameter("OutboundPhoneNumberId", outboundPhoneNumberId);
            this.outboundPhoneNumberId = outboundPhoneNumberId;
            return this;
        }

        /**
         * SkillGroupId.
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
