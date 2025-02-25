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
 * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetCollectionPolicyResponseBody</p>
 */
public class GetCollectionPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("collectionPolicy")
    private CollectionPolicy collectionPolicy;

    private GetCollectionPolicyResponseBody(Builder builder) {
        this.collectionPolicy = builder.collectionPolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCollectionPolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return collectionPolicy
     */
    public CollectionPolicy getCollectionPolicy() {
        return this.collectionPolicy;
    }

    public static final class Builder {
        private CollectionPolicy collectionPolicy; 

        /**
         * collectionPolicy.
         */
        public Builder collectionPolicy(CollectionPolicy collectionPolicy) {
            this.collectionPolicy = collectionPolicy;
            return this;
        }

        public GetCollectionPolicyResponseBody build() {
            return new GetCollectionPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCollectionPolicyResponseBody</p>
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

            /**
             * destLogstore.
             */
            public Builder destLogstore(String destLogstore) {
                this.destLogstore = destLogstore;
                return this;
            }

            /**
             * destProject.
             */
            public Builder destProject(String destProject) {
                this.destProject = destProject;
                return this;
            }

            /**
             * destRegion.
             */
            public Builder destRegion(String destRegion) {
                this.destRegion = destRegion;
                return this;
            }

            /**
             * destTTL.
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
     * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCollectionPolicyResponseBody</p>
     */
    public static class DataConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dataProject")
        private String dataProject;

        @com.aliyun.core.annotation.NameInMap("dataRegion")
        private String dataRegion;

        private DataConfig(Builder builder) {
            this.dataProject = builder.dataProject;
            this.dataRegion = builder.dataRegion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataConfig create() {
            return builder().build();
        }

        /**
         * @return dataProject
         */
        public String getDataProject() {
            return this.dataProject;
        }

        /**
         * @return dataRegion
         */
        public String getDataRegion() {
            return this.dataRegion;
        }

        public static final class Builder {
            private String dataProject; 
            private String dataRegion; 

            /**
             * dataProject.
             */
            public Builder dataProject(String dataProject) {
                this.dataProject = dataProject;
                return this;
            }

            /**
             * dataRegion.
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
     * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCollectionPolicyResponseBody</p>
     */
    public static class PolicyConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceIds")
        private java.util.List<String> instanceIds;

        @com.aliyun.core.annotation.NameInMap("regions")
        private java.util.List<String> regions;

        @com.aliyun.core.annotation.NameInMap("resourceMode")
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

            /**
             * instanceIds.
             */
            public Builder instanceIds(java.util.List<String> instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * regions.
             */
            public Builder regions(java.util.List<String> regions) {
                this.regions = regions;
                return this;
            }

            /**
             * resourceMode.
             */
            public Builder resourceMode(String resourceMode) {
                this.resourceMode = resourceMode;
                return this;
            }

            /**
             * resourceTags.
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
     * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCollectionPolicyResponseBody</p>
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

            /**
             * accountGroupType.
             */
            public Builder accountGroupType(String accountGroupType) {
                this.accountGroupType = accountGroupType;
                return this;
            }

            /**
             * members.
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
    /**
     * 
     * {@link GetCollectionPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>GetCollectionPolicyResponseBody</p>
     */
    public static class CollectionPolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("centralizeConfig")
        private CentralizeConfig centralizeConfig;

        @com.aliyun.core.annotation.NameInMap("centralizeEnabled")
        private Boolean centralizeEnabled;

        @com.aliyun.core.annotation.NameInMap("dataCode")
        private String dataCode;

        @com.aliyun.core.annotation.NameInMap("dataConfig")
        private DataConfig dataConfig;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("internalPolicy")
        private Boolean internalPolicy;

        @com.aliyun.core.annotation.NameInMap("policyConfig")
        private PolicyConfig policyConfig;

        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("policyUid")
        private String policyUid;

        @com.aliyun.core.annotation.NameInMap("productCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("resourceDirectory")
        private ResourceDirectory resourceDirectory;

        private CollectionPolicy(Builder builder) {
            this.centralizeConfig = builder.centralizeConfig;
            this.centralizeEnabled = builder.centralizeEnabled;
            this.dataCode = builder.dataCode;
            this.dataConfig = builder.dataConfig;
            this.enabled = builder.enabled;
            this.internalPolicy = builder.internalPolicy;
            this.policyConfig = builder.policyConfig;
            this.policyName = builder.policyName;
            this.policyUid = builder.policyUid;
            this.productCode = builder.productCode;
            this.resourceDirectory = builder.resourceDirectory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CollectionPolicy create() {
            return builder().build();
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
         * @return internalPolicy
         */
        public Boolean getInternalPolicy() {
            return this.internalPolicy;
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
         * @return policyUid
         */
        public String getPolicyUid() {
            return this.policyUid;
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

        public static final class Builder {
            private CentralizeConfig centralizeConfig; 
            private Boolean centralizeEnabled; 
            private String dataCode; 
            private DataConfig dataConfig; 
            private Boolean enabled; 
            private Boolean internalPolicy; 
            private PolicyConfig policyConfig; 
            private String policyName; 
            private String policyUid; 
            private String productCode; 
            private ResourceDirectory resourceDirectory; 

            /**
             * centralizeConfig.
             */
            public Builder centralizeConfig(CentralizeConfig centralizeConfig) {
                this.centralizeConfig = centralizeConfig;
                return this;
            }

            /**
             * centralizeEnabled.
             */
            public Builder centralizeEnabled(Boolean centralizeEnabled) {
                this.centralizeEnabled = centralizeEnabled;
                return this;
            }

            /**
             * dataCode.
             */
            public Builder dataCode(String dataCode) {
                this.dataCode = dataCode;
                return this;
            }

            /**
             * dataConfig.
             */
            public Builder dataConfig(DataConfig dataConfig) {
                this.dataConfig = dataConfig;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * internalPolicy.
             */
            public Builder internalPolicy(Boolean internalPolicy) {
                this.internalPolicy = internalPolicy;
                return this;
            }

            /**
             * policyConfig.
             */
            public Builder policyConfig(PolicyConfig policyConfig) {
                this.policyConfig = policyConfig;
                return this;
            }

            /**
             * policyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * policyUid.
             */
            public Builder policyUid(String policyUid) {
                this.policyUid = policyUid;
                return this;
            }

            /**
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * resourceDirectory.
             */
            public Builder resourceDirectory(ResourceDirectory resourceDirectory) {
                this.resourceDirectory = resourceDirectory;
                return this;
            }

            public CollectionPolicy build() {
                return new CollectionPolicy(this);
            } 

        } 

    }
}
