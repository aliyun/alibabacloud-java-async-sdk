// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateComputeClusterRequest} extends {@link RequestModel}
 *
 * <p>CreateComputeClusterRequest</p>
 */
public class CreateComputeClusterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClusterConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private ClusterConfig clusterConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateComputeClusterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterConfig = builder.clusterConfig;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateComputeClusterRequest create() {
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
     * @return clusterConfig
     */
    public ClusterConfig getClusterConfig() {
        return this.clusterConfig;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreateComputeClusterRequest, Builder> {
        private String regionId; 
        private ClusterConfig clusterConfig; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateComputeClusterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterConfig = request.clusterConfig;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>This parameter is required.</p>
         */
        public Builder clusterConfig(ClusterConfig clusterConfig) {
            String clusterConfigShrink = shrink(clusterConfig, "ClusterConfig", "json");
            this.putBodyParameter("ClusterConfig", clusterConfigShrink);
            this.clusterConfig = clusterConfig;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateComputeClusterRequest build() {
            return new CreateComputeClusterRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateComputeClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeClusterRequest</p>
     */
    public static class ClusterSafetyControl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterSafetyAuthType")
        private String clusterSafetyAuthType;

        @com.aliyun.core.annotation.NameInMap("UserGroupIds")
        private java.util.List<String> userGroupIds;

        @com.aliyun.core.annotation.NameInMap("UserIds")
        private java.util.List<String> userIds;

        private ClusterSafetyControl(Builder builder) {
            this.clusterSafetyAuthType = builder.clusterSafetyAuthType;
            this.userGroupIds = builder.userGroupIds;
            this.userIds = builder.userIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterSafetyControl create() {
            return builder().build();
        }

        /**
         * @return clusterSafetyAuthType
         */
        public String getClusterSafetyAuthType() {
            return this.clusterSafetyAuthType;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<String> getUserGroupIds() {
            return this.userGroupIds;
        }

        /**
         * @return userIds
         */
        public java.util.List<String> getUserIds() {
            return this.userIds;
        }

        public static final class Builder {
            private String clusterSafetyAuthType; 
            private java.util.List<String> userGroupIds; 
            private java.util.List<String> userIds; 

            private Builder() {
            } 

            private Builder(ClusterSafetyControl model) {
                this.clusterSafetyAuthType = model.clusterSafetyAuthType;
                this.userGroupIds = model.userGroupIds;
                this.userIds = model.userIds;
            } 

            /**
             * <p>管控模式。CREATE_COMPUTE_SOURCE：有创建计算源权限即可使用；USER_DEFINE：仅白名单用户/用户组可用</p>
             * 
             * <strong>example:</strong>
             * <p>CREATE_COMPUTE_SOURCE</p>
             */
            public Builder clusterSafetyAuthType(String clusterSafetyAuthType) {
                this.clusterSafetyAuthType = clusterSafetyAuthType;
                return this;
            }

            /**
             * UserGroupIds.
             */
            public Builder userGroupIds(java.util.List<String> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            /**
             * UserIds.
             */
            public Builder userIds(java.util.List<String> userIds) {
                this.userIds = userIds;
                return this;
            }

            public ClusterSafetyControl build() {
                return new ClusterSafetyControl(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateComputeClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeClusterRequest</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        @com.aliyun.core.annotation.Validation(required = true)
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private ConfigList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateComputeClusterRequest} extends {@link TeaModel}
     *
     * <p>CreateComputeClusterRequest</p>
     */
    public static class ClusterConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterAdmins")
        private java.util.List<String> clusterAdmins;

        @com.aliyun.core.annotation.NameInMap("ClusterSafetyControl")
        private ClusterSafetyControl clusterSafetyControl;

        @com.aliyun.core.annotation.NameInMap("ConfigList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<ConfigList> configList;

        @com.aliyun.core.annotation.NameInMap("Des")
        private String des;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("TypeVersion")
        private String typeVersion;

        private ClusterConfig(Builder builder) {
            this.clusterAdmins = builder.clusterAdmins;
            this.clusterSafetyControl = builder.clusterSafetyControl;
            this.configList = builder.configList;
            this.des = builder.des;
            this.name = builder.name;
            this.type = builder.type;
            this.typeVersion = builder.typeVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterConfig create() {
            return builder().build();
        }

        /**
         * @return clusterAdmins
         */
        public java.util.List<String> getClusterAdmins() {
            return this.clusterAdmins;
        }

        /**
         * @return clusterSafetyControl
         */
        public ClusterSafetyControl getClusterSafetyControl() {
            return this.clusterSafetyControl;
        }

        /**
         * @return configList
         */
        public java.util.List<ConfigList> getConfigList() {
            return this.configList;
        }

        /**
         * @return des
         */
        public String getDes() {
            return this.des;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return typeVersion
         */
        public String getTypeVersion() {
            return this.typeVersion;
        }

        public static final class Builder {
            private java.util.List<String> clusterAdmins; 
            private ClusterSafetyControl clusterSafetyControl; 
            private java.util.List<ConfigList> configList; 
            private String des; 
            private String name; 
            private String type; 
            private String typeVersion; 

            private Builder() {
            } 

            private Builder(ClusterConfig model) {
                this.clusterAdmins = model.clusterAdmins;
                this.clusterSafetyControl = model.clusterSafetyControl;
                this.configList = model.configList;
                this.des = model.des;
                this.name = model.name;
                this.type = model.type;
                this.typeVersion = model.typeVersion;
            } 

            /**
             * ClusterAdmins.
             */
            public Builder clusterAdmins(java.util.List<String> clusterAdmins) {
                this.clusterAdmins = clusterAdmins;
                return this;
            }

            /**
             * ClusterSafetyControl.
             */
            public Builder clusterSafetyControl(ClusterSafetyControl clusterSafetyControl) {
                this.clusterSafetyControl = clusterSafetyControl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder configList(java.util.List<ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * Des.
             */
            public Builder des(String des) {
                this.des = des;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster_test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>MAX_COMPUTE</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * TypeVersion.
             */
            public Builder typeVersion(String typeVersion) {
                this.typeVersion = typeVersion;
                return this;
            }

            public ClusterConfig build() {
                return new ClusterConfig(this);
            } 

        } 

    }
}
