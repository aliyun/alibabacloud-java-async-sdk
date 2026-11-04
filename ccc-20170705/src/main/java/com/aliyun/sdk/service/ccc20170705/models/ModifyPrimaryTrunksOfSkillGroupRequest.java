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
 * {@link ModifyPrimaryTrunksOfSkillGroupRequest} extends {@link RequestModel}
 *
 * <p>ModifyPrimaryTrunksOfSkillGroupRequest</p>
 */
public class ModifyPrimaryTrunksOfSkillGroupRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryProviderName")
    private java.util.List<String> primaryProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
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
    public java.util.List<String> getPrimaryProviderName() {
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
        private java.util.List<String> primaryProviderName; 
        private String skillGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyPrimaryTrunksOfSkillGroupRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.primaryProviderName = request.primaryProviderName;
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
         * PrimaryProviderName.
         */
        public Builder primaryProviderName(java.util.List<String> primaryProviderName) {
            this.putQueryParameter("PrimaryProviderName", primaryProviderName);
            this.primaryProviderName = primaryProviderName;
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
        public ModifyPrimaryTrunksOfSkillGroupRequest build() {
            return new ModifyPrimaryTrunksOfSkillGroupRequest(this);
        } 

    } 

}
