// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link RunSynchronizationJobRequest} extends {@link RequestModel}
 *
 * <p>RunSynchronizationJobRequest</p>
 */
public class RunSynchronizationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordInitialization")
    private Boolean passwordInitialization;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationScopeConfig")
    private SynchronizationScopeConfig synchronizationScopeConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private String targetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserIdentityTypes")
    private java.util.List<String> userIdentityTypes;

    private RunSynchronizationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.passwordInitialization = builder.passwordInitialization;
        this.synchronizationScopeConfig = builder.synchronizationScopeConfig;
        this.targetId = builder.targetId;
        this.targetType = builder.targetType;
        this.userIdentityTypes = builder.userIdentityTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunSynchronizationJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return passwordInitialization
     */
    public Boolean getPasswordInitialization() {
        return this.passwordInitialization;
    }

    /**
     * @return synchronizationScopeConfig
     */
    public SynchronizationScopeConfig getSynchronizationScopeConfig() {
        return this.synchronizationScopeConfig;
    }

    /**
     * @return targetId
     */
    public String getTargetId() {
        return this.targetId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return userIdentityTypes
     */
    public java.util.List<String> getUserIdentityTypes() {
        return this.userIdentityTypes;
    }

    public static final class Builder extends Request.Builder<RunSynchronizationJobRequest, Builder> {
        private String regionId; 
        private String description; 
        private String instanceId; 
        private Boolean passwordInitialization; 
        private SynchronizationScopeConfig synchronizationScopeConfig; 
        private String targetId; 
        private String targetType; 
        private java.util.List<String> userIdentityTypes; 

        private Builder() {
            super();
        } 

        private Builder(RunSynchronizationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.passwordInitialization = request.passwordInitialization;
            this.synchronizationScopeConfig = request.synchronizationScopeConfig;
            this.targetId = request.targetId;
            this.targetType = request.targetType;
            this.userIdentityTypes = request.userIdentityTypes;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * PasswordInitialization.
         */
        public Builder passwordInitialization(Boolean passwordInitialization) {
            this.putQueryParameter("PasswordInitialization", passwordInitialization);
            this.passwordInitialization = passwordInitialization;
            return this;
        }

        /**
         * SynchronizationScopeConfig.
         */
        public Builder synchronizationScopeConfig(SynchronizationScopeConfig synchronizationScopeConfig) {
            this.putQueryParameter("SynchronizationScopeConfig", synchronizationScopeConfig);
            this.synchronizationScopeConfig = synchronizationScopeConfig;
            return this;
        }

        /**
         * <p>同步目标ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3ngxxxxx</p>
         */
        public Builder targetId(String targetId) {
            this.putQueryParameter("TargetId", targetId);
            this.targetId = targetId;
            return this;
        }

        /**
         * <p>同步目标类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>identity_provider</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * UserIdentityTypes.
         */
        public Builder userIdentityTypes(java.util.List<String> userIdentityTypes) {
            this.putQueryParameter("UserIdentityTypes", userIdentityTypes);
            this.userIdentityTypes = userIdentityTypes;
            return this;
        }

        @Override
        public RunSynchronizationJobRequest build() {
            return new RunSynchronizationJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link RunSynchronizationJobRequest} extends {@link TeaModel}
     *
     * <p>RunSynchronizationJobRequest</p>
     */
    public static class SynchronizationScopeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupIds")
        private java.util.List<String> groupIds;

        @com.aliyun.core.annotation.NameInMap("OrganizationalUnitIds")
        private java.util.List<String> organizationalUnitIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private SynchronizationScopeConfig(Builder builder) {
            this.groupIds = builder.groupIds;
            this.organizationalUnitIds = builder.organizationalUnitIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SynchronizationScopeConfig create() {
            return builder().build();
        }

        /**
         * @return groupIds
         */
        public java.util.List<String> getGroupIds() {
            return this.groupIds;
        }

        /**
         * @return organizationalUnitIds
         */
        public java.util.List<String> getOrganizationalUnitIds() {
            return this.organizationalUnitIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private java.util.List<String> groupIds; 
            private java.util.List<String> organizationalUnitIds; 
            private java.util.List<String> userIds; 

            /**
             * GroupIds.
             */
            public Builder groupIds(java.util.List<String> groupIds) {
                this.groupIds = groupIds;
                return this;
            }

            /**
             * OrganizationalUnitIds.
             */
            public Builder organizationalUnitIds(java.util.List<String> organizationalUnitIds) {
                this.organizationalUnitIds = organizationalUnitIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public SynchronizationScopeConfig build() {
                return new SynchronizationScopeConfig(this);
            } 

        } 

    }
}
