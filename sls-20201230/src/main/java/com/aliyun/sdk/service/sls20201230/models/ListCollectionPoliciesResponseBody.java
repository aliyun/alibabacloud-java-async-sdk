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
 * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionPoliciesResponseBody</p>
 */
public class ListCollectionPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("currentCount")
    private Integer currentCount;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("statistics")
    private java.util.List<Statistics> statistics;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListCollectionPoliciesResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.data = builder.data;
        this.statistics = builder.statistics;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentCount
     */
    public Integer getCurrentCount() {
        return this.currentCount;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return statistics
     */
    public java.util.List<Statistics> getStatistics() {
        return this.statistics;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentCount; 
        private java.util.List<Data> data; 
        private java.util.List<Statistics> statistics; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListCollectionPoliciesResponseBody model) {
            this.currentCount = model.currentCount;
            this.data = model.data;
            this.statistics = model.statistics;
            this.totalCount = model.totalCount;
        } 

        /**
         * currentCount.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * <p>The data of the policies that are matched against the query conditions. The data is returned based on paginated results.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * statistics.
         */
        public Builder statistics(java.util.List<Statistics> statistics) {
            this.statistics = statistics;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCollectionPoliciesResponseBody build() {
            return new ListCollectionPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
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
             * <p>The data retention period for centralized storage. Unit: days.</p>
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
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(DataConfig model) {
                this.dataProject = model.dataProject;
                this.dataRegion = model.dataRegion;
            } 

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
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(PolicyConfig model) {
                this.instanceIds = model.instanceIds;
                this.regions = model.regions;
                this.resourceMode = model.resourceMode;
                this.resourceTags = model.resourceTags;
            } 

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
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
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
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
     */
    public static class Data extends TeaModel {
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

        private Data(Builder builder) {
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

        public static Data create() {
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.centralizeConfig = model.centralizeConfig;
                this.centralizeEnabled = model.centralizeEnabled;
                this.dataCode = model.dataCode;
                this.dataConfig = model.dataConfig;
                this.enabled = model.enabled;
                this.internalPolicy = model.internalPolicy;
                this.policyConfig = model.policyConfig;
                this.policyName = model.policyName;
                this.policyUid = model.policyUid;
                this.productCode = model.productCode;
                this.resourceDirectory = model.resourceDirectory;
            } 

            /**
             * <p>The configuration for centralized storage.</p>
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
     */
    public static class PolicySourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("policyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("policyUid")
        private String policyUid;

        private PolicySourceList(Builder builder) {
            this.policyName = builder.policyName;
            this.policyUid = builder.policyUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicySourceList create() {
            return builder().build();
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

        public static final class Builder {
            private String policyName; 
            private String policyUid; 

            private Builder() {
            } 

            private Builder(PolicySourceList model) {
                this.policyName = model.policyName;
                this.policyUid = model.policyUid;
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

            public PolicySourceList build() {
                return new PolicySourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListCollectionPoliciesResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("policySourceList")
        private java.util.List<PolicySourceList> policySourceList;

        @com.aliyun.core.annotation.NameInMap("productCode")
        private String productCode;

        private Statistics(Builder builder) {
            this.policySourceList = builder.policySourceList;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return policySourceList
         */
        public java.util.List<PolicySourceList> getPolicySourceList() {
            return this.policySourceList;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        public static final class Builder {
            private java.util.List<PolicySourceList> policySourceList; 
            private String productCode; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.policySourceList = model.policySourceList;
                this.productCode = model.productCode;
            } 

            /**
             * policySourceList.
             */
            public Builder policySourceList(java.util.List<PolicySourceList> policySourceList) {
                this.policySourceList = policySourceList;
                return this;
            }

            /**
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
}
