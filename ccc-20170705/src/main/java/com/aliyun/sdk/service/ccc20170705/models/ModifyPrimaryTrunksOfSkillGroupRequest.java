// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyPrimaryTrunksOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrimaryTrunksOfSkillGroupRequest</p>
 */
public class ModifyPrimaryTrunksOfSkillGroupRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("PrimaryProviderName")
    private java.util.List < String > primaryProviderName;

    @Query
    @NameInMap("SkillGroupId")
    @Validation(required = true)
    private String skillGroupId;

    private ModifyPrimaryTrunksOfSkillGroupRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.primaryProviderName = builder.primaryProviderName;
        this.skillGroupId = builder.skillGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyPrimaryTrunksOfSkillGroupRequest create() {
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
     * @return primaryProviderName
     */
    public java.util.List < String > getPrimaryProviderName() {
        return this.primaryProviderName;
    }

    /**
     * @return skillGroupId
     */
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public static final class Builder extends Request.Builder<ModifyPrimaryTrunksOfSkillGroupRequest, Builder> {
        private String instanceId; 
        private java.util.List < String > primaryProviderName; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrimaryTrunksOfSkillGroupRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.primaryProviderName = response.primaryProviderName;
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
         * PrimaryProviderName.
         */
        public Builder primaryProviderName(java.util.List < String > primaryProviderName) {
            this.putQueryParameter("PrimaryProviderName", primaryProviderName);
            this.primaryProviderName = primaryProviderName;
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
        public ModifyPrimaryTrunksOfSkillGroupRequest build() {
            return new ModifyPrimaryTrunksOfSkillGroupRequest(this);
        } 

    } 

}
