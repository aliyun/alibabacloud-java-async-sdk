// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link UpsertCollectionPolicyRequest} extends {@link RequestModel}
 *
 * <p>UpsertCollectionPolicyRequest</p>
 */
public class UpsertCollectionPolicyRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("centralizeConfig")
    private CentralizeConfig centralizeConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("centralizeEnabled")
    private Boolean centralizeEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataConfig")
    private DataConfig dataConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("enabled")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private PolicyConfig policyConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("policyName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 63, minLength = 3)
    private String policyName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("productCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceDirectory")
    private ResourceDirectory resourceDirectory;

    private UpsertCollectionPolicyRequest(Builder builder) {
        super(builder);
        this.centralizeConfig = builder.centralizeConfig;
        this.centralizeEnabled = builder.centralizeEnabled;
        this.dataCode = builder.dataCode;
        this.dataConfig = builder.dataConfig;
        this.enabled = builder.enabled;
        this.policyConfig = builder.policyConfig;
        this.policyName = builder.policyName;
        this.productCode = builder.productCode;
        this.resourceDirectory = builder.resourceDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpsertCollectionPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return centralizeConfig
     */
    public CentralizeConfig getCentralizeConfig() {
        return this.centralizeConfig;
    }

    /**
     * @return centralizeEnabled
     */
    public Boolean getCentralizeEnabled() {
        return this.centralizeEnabled;
    }

    /**
     * @return dataCode
     */
    public String getDataCode() {
        return this.dataCode;
    }

    /**
     * @return dataConfig
     */
    public DataConfig getDataConfig() {
        return this.dataConfig;
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return policyConfig
     */
    public PolicyConfig getPolicyConfig() {
        return this.policyConfig;
    }

    /**
     * @return policyName
     */
    public String getPolicyName() {
        return this.policyName;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return resourceDirectory
     */
    public ResourceDirectory getResourceDirectory() {
        return this.resourceDirectory;
    }

    public static final class Builder extends Request.Builder<UpsertCollectionPolicyRequest, Builder> {
        private CentralizeConfig centralizeConfig; 
        private Boolean centralizeEnabled; 
        private String dataCode; 
        private DataConfig dataConfig; 
        private Boolean enabled; 
        private PolicyConfig policyConfig; 
        private String policyName; 
        private String productCode; 
        private ResourceDirectory resourceDirectory; 

        private Builder() {
            super();
        } 

        private Builder(UpsertCollectionPolicyRequest request) {
            super(request);
            this.centralizeConfig = request.centralizeConfig;
            this.centralizeEnabled = request.centralizeEnabled;
            this.dataCode = request.dataCode;
            this.dataConfig = request.dataConfig;
            this.enabled = request.enabled;
            this.policyConfig = request.policyConfig;
            this.policyName = request.policyName;
            this.productCode = request.productCode;
            this.resourceDirectory = request.resourceDirectory;
        } 

        /**
         * <p>The configurations of centralized storage.</p>
         */
        public Builder centralizeConfig(CentralizeConfig centralizeConfig) {
            this.putBodyParameter("centralizeConfig", centralizeConfig);
            this.centralizeConfig = centralizeConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable centralized storage. Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder centralizeEnabled(Boolean centralizeEnabled) {
            this.putBodyParameter("centralizeEnabled", centralizeEnabled);
            this.centralizeEnabled = centralizeEnabled;
            return this;
        }

        /**
         * <p>The code of the log type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>access_log</p>
         */
        public Builder dataCode(String dataCode) {
            this.putBodyParameter("dataCode", dataCode);
            this.dataCode = dataCode;
            return this;
        }

        /**
         * <p>The data configurations. The configuration is returned only for global logs. For example, if productCode is set to sls, the configuration is returned.</p>
         */
        public Builder dataConfig(DataConfig dataConfig) {
            this.putBodyParameter("dataConfig", dataConfig);
            this.dataConfig = dataConfig;
            return this;
        }

        /**
         * <p>Specifies whether to enable the policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enabled(Boolean enabled) {
            this.putBodyParameter("enabled", enabled);
            this.enabled = enabled;
            return this;
        }

        /**
         * <p>The configurations of the policy.</p>
         * <p>This parameter is required.</p>
         */
        public Builder policyConfig(PolicyConfig policyConfig) {
            this.putBodyParameter("policyConfig", policyConfig);
            this.policyConfig = policyConfig;
            return this;
        }

        /**
         * <p>The name must meet the following requirements:</p>
         * <ul>
         * <li>The name can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
         * <li>The name must start with a letter.</li>
         * <li>The name must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>your_log_policy</p>
         */
        public Builder policyName(String policyName) {
            this.putBodyParameter("policyName", policyName);
            this.policyName = policyName;
            return this;
        }

        /**
         * <p>The code of the service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("productCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The configurations of the resource directory. The account must have activated the resource directory and be a management account or a delegated administrator of the resource directory.</p>
         */
        public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
            this.putBodyParameter("resourceDirectory", resourceDirectory);
            this.resourceDirectory = resourceDirectory;
            return this;
        }

        @Override
        public UpsertCollectionPolicyRequest build() {
            return new UpsertCollectionPolicyRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpsertCollectionPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionPolicyRequest</p>
     */
    public static class CentralizeConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("destLogstore")
        private String destLogstore;

        @com.aliyun.core.annotation.NameInMap("destProject")
        private String destProject;

        @com.aliyun.core.annotation.NameInMap("destRegion")
        private String destRegion;

        @com.aliyun.core.annotation.NameInMap("destTTL")
        private Integer destTTL;

        private CentralizeConfig(Builder builder) {
            this.destLogstore = builder.destLogstore;
            this.destProject = builder.destProject;
            this.destRegion = builder.destRegion;
            this.destTTL = builder.destTTL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CentralizeConfig create() {
            return builder().build();
        }

        /**
         * @return destLogstore
         */
        public String getDestLogstore() {
            return this.destLogstore;
        }

        /**
         * @return destProject
         */
        public String getDestProject() {
            return this.destProject;
        }

        /**
         * @return destRegion
         */
        public String getDestRegion() {
            return this.destRegion;
        }

        /**
         * @return destTTL
         */
        public Integer getDestTTL() {
            return this.destTTL;
        }

        public static final class Builder {
            private String destLogstore; 
            private String destProject; 
            private String destRegion; 
            private Integer destTTL; 

            private Builder() {
            } 

            private Builder(CentralizeConfig model) {
                this.destLogstore = model.destLogstore;
                this.destProject = model.destProject;
                this.destRegion = model.destRegion;
                this.destTTL = model.destTTL;
            } 

            /**
             * <p>The destination logstore for centralized storage. Make sure that the region of the destination logstore is consistent with the region specified by destRegion and the destination logstore belongs to the destination project specified by destProject.</p>
             * 
             * <strong>example:</strong>
             * <p>your-sls-logstore-in-beijing</p>
             */
            public Builder destLogstore(String destLogstore) {
                this.destLogstore = destLogstore;
                return this;
            }

            /**
             * <p>The destination project for centralized storage. Make sure that the region of the destination project is consistent with the region specified by destRegion.</p>
             * 
             * <strong>example:</strong>
             * <p>your-sls-project-in-beijing</p>
             */
            public Builder destProject(String destProject) {
                this.destProject = destProject;
                return this;
            }

            /**
             * <p>The destination region for centralized storage.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * <p>The data retention period for centralized storage. Unit: days. This parameter takes effect only when you use an existing logstore for centralized storage.</p>
             * 
             * <strong>example:</strong>
             * <p>your-sls-logstore-ttl</p>
             */
            public Builder destTTL(Integer destTTL) {
                this.destTTL = destTTL;
                return this;
            }

            public CentralizeConfig build() {
                return new CentralizeConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertCollectionPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionPolicyRequest</p>
     */
    public static class DataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataRegion")
        private String dataRegion;

        private DataConfig(Builder builder) {
            this.dataRegion = builder.dataRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataConfig create() {
            return builder().build();
        }

        /**
         * @return dataRegion
         */
        public String getDataRegion() {
            return this.dataRegion;
        }

        public static final class Builder {
            private String dataRegion; 

            private Builder() {
            } 

            private Builder(DataConfig model) {
                this.dataRegion = model.dataRegion;
            } 

            /**
             * <p>The region for storing the global logs that are collected for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder dataRegion(String dataRegion) {
                this.dataRegion = dataRegion;
                return this;
            }

            public DataConfig build() {
                return new DataConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertCollectionPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionPolicyRequest</p>
     */
    public static class PolicyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("regions")
        private java.util.List<String> regions;

        @com.aliyun.core.annotation.NameInMap("resourceMode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String resourceMode;

        @com.aliyun.core.annotation.NameInMap("resourceTags")
        private java.util.Map<String, ?> resourceTags;

        private PolicyConfig(Builder builder) {
            this.instanceIds = builder.instanceIds;
            this.regions = builder.regions;
            this.resourceMode = builder.resourceMode;
            this.resourceTags = builder.resourceTags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyConfig create() {
            return builder().build();
        }

        /**
         * @return instanceIds
         */
        public java.util.List<String> getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return regions
         */
        public java.util.List<String> getRegions() {
            return this.regions;
        }

        /**
         * @return resourceMode
         */
        public String getResourceMode() {
            return this.resourceMode;
        }

        /**
         * @return resourceTags
         */
        public java.util.Map<String, ?> getResourceTags() {
            return this.resourceTags;
        }

        public static final class Builder {
            private java.util.List<String> instanceIds; 
            private java.util.List<String> regions; 
            private String resourceMode; 
            private java.util.Map<String, ?> resourceTags; 

            private Builder() {
            } 

            private Builder(PolicyConfig model) {
                this.instanceIds = model.instanceIds;
                this.regions = model.regions;
                this.resourceMode = model.resourceMode;
                this.resourceTags = model.resourceTags;
            } 

            /**
             * <p>The IDs of the instances. This parameter takes effect only when resourceMode is set to instanceMode. Logs are collected only from instances that use the specified IDs.</p>
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * <p>The regions of the instances. This parameter takes effect only when resourceMode is set to attributeMode. Wildcard characters are supported. If you leave this parameter empty, region-based filtering is not performed. The system considers that all instances are matched. If you specify a value for this parameter, logs of instances that reside in the specified regions are collected. Logs are collected from an instance only if the resource tags and region of the instance match the specified conditions.</p>
             */
            public Builder regions(java.util.List<String> regions) {
                this.regions = regions;
                return this;
            }

            /**
             * <p>The resource collection mode. Valid values: all, attributeMode, and instanceMode. The value all specifies that logs of all instances within your account are collected to the default logstore. The value attributeMode specifies that logs are collected based on the regions of instances and resource tags. The value instanceMode specifies that logs are collected based on instance IDs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>all</p>
             */
            public Builder resourceMode(String resourceMode) {
                this.resourceMode = resourceMode;
                return this;
            }

            /**
             * <p>The resource tags. This parameter takes effect only when resourceMode is set to attributeMode. If you leave this parameter empty, resource tag-based filtering is not performed. The system considers that all instances are matched. If you specify a value for this parameter, logs of instances that use the specified resource tags are collected. Logs are collected from an instance only if the resource tags and region of the instance match the specified conditions.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;tag1&quot;:&quot;value1&quot;,“tag2&quot;:&quot;value2&quot;}</p>
             */
            public Builder resourceTags(java.util.Map<String, ?> resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            public PolicyConfig build() {
                return new PolicyConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpsertCollectionPolicyRequest} extends {@link TeaModel}
     *
     * <p>UpsertCollectionPolicyRequest</p>
     */
    public static class ResourceDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountGroupType")
        private String accountGroupType;

        @com.aliyun.core.annotation.NameInMap("members")
        private java.util.List<String> members;

        private ResourceDirectory(Builder builder) {
            this.accountGroupType = builder.accountGroupType;
            this.members = builder.members;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDirectory create() {
            return builder().build();
        }

        /**
         * @return accountGroupType
         */
        public String getAccountGroupType() {
            return this.accountGroupType;
        }

        /**
         * @return members
         */
        public java.util.List<String> getMembers() {
            return this.members;
        }

        public static final class Builder {
            private String accountGroupType; 
            private java.util.List<String> members; 

            private Builder() {
            } 

            private Builder(ResourceDirectory model) {
                this.accountGroupType = model.accountGroupType;
                this.members = model.members;
            } 

            /**
             * <p>The mode of the resource directory. Valid values: all and custom.</p>
             * 
             * <strong>example:</strong>
             * <p>all,custom</p>
             */
            public Builder accountGroupType(String accountGroupType) {
                this.accountGroupType = accountGroupType;
                return this;
            }

            /**
             * <p>The members. If accountGroupType is set to custom, the members are returned.</p>
             */
            public Builder members(java.util.List<String> members) {
                this.members = members;
                return this;
            }

            public ResourceDirectory build() {
                return new ResourceDirectory(this);
            } 

        } 

    }
}
