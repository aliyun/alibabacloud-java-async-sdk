// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPhoneNumberRequest} extends {@link RequestModel}
 *
 * <p>ModifyPhoneNumberRequest</p>
 */
public class ModifyPhoneNumberRequest extends Request {
    @Query
    @NameInMap("ContactFlowId")
    private String contactFlowId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PhoneNumberId")
    @Validation(required = true)
    private String phoneNumberId;

    @Query
    @NameInMap("SkillGroupId")
    private java.util.List < String > skillGroupId;

    @Query
    @NameInMap("Usage")
    @Validation(required = true)
    private String usage;

    private ModifyPhoneNumberRequest(Builder builder) {
        super(builder);
        this.contactFlowId = builder.contactFlowId;
        this.instanceId = builder.instanceId;
        this.phoneNumberId = builder.phoneNumberId;
        this.skillGroupId = builder.skillGroupId;
        this.usage = builder.usage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPhoneNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactFlowId
     */
    public String getContactFlowId() {
        return this.contactFlowId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phoneNumberId
     */
    public String getPhoneNumberId() {
        return this.phoneNumberId;
    }

    /**
     * @return skillGroupId
     */
    public java.util.List < String > getSkillGroupId() {
        return this.skillGroupId;
    }

    /**
     * @return usage
     */
    public String getUsage() {
        return this.usage;
    }

    public static final class Builder extends Request.Builder<ModifyPhoneNumberRequest, Builder> {
        private String contactFlowId; 
        private String instanceId; 
        private String phoneNumberId; 
        private java.util.List < String > skillGroupId; 
        private String usage; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPhoneNumberRequest response) {
            super(response);
            this.contactFlowId = response.contactFlowId;
            this.instanceId = response.instanceId;
            this.phoneNumberId = response.phoneNumberId;
            this.skillGroupId = response.skillGroupId;
            this.usage = response.usage;
        } 

        /**
         * ContactFlowId.
         */
        public Builder contactFlowId(String contactFlowId) {
            this.putQueryParameter("ContactFlowId", contactFlowId);
            this.contactFlowId = contactFlowId;
            return this;
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
         * PhoneNumberId.
         */
        public Builder phoneNumberId(String phoneNumberId) {
            this.putQueryParameter("PhoneNumberId", phoneNumberId);
            this.phoneNumberId = phoneNumberId;
            return this;
        }

        /**
         * SkillGroupId.
         */
        public Builder skillGroupId(java.util.List < String > skillGroupId) {
            this.putQueryParameter("SkillGroupId", skillGroupId);
            this.skillGroupId = skillGroupId;
            return this;
        }

        /**
         * Usage.
         */
        public Builder usage(String usage) {
            this.putQueryParameter("Usage", usage);
            this.usage = usage;
            return this;
        }

        @Override
        public ModifyPhoneNumberRequest build() {
            return new ModifyPhoneNumberRequest(this);
        } 

    } 

}
