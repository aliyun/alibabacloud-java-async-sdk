// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListCollectionPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCollectionPoliciesResponseBody</p>
 */
public class ListCollectionPoliciesResponseBody extends TeaModel {
    @NameInMap("currentCount")
    private Integer currentCount;

    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("totalCount")
    private Integer totalCount;

    private ListCollectionPoliciesResponseBody(Builder builder) {
        this.currentCount = builder.currentCount;
        this.data = builder.data;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCollectionPoliciesResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentCount; 
        private java.util.List < Data> data; 
        private Integer totalCount; 

        /**
         * currentCount.
         */
        public Builder currentCount(Integer currentCount) {
            this.currentCount = currentCount;
            return this;
        }

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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

    public static class Attribute extends TeaModel {
        @NameInMap("app")
        private String app;

        @NameInMap("policyGroup")
        private String policyGroup;

        private Attribute(Builder builder) {
            this.app = builder.app;
            this.policyGroup = builder.policyGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attribute create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return policyGroup
         */
        public String getPolicyGroup() {
            return this.policyGroup;
        }

        public static final class Builder {
            private String app; 
            private String policyGroup; 

            /**
             * app.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * policyGroup.
             */
            public Builder policyGroup(String policyGroup) {
                this.policyGroup = policyGroup;
                return this;
            }

            public Attribute build() {
                return new Attribute(this);
            } 

        } 

    }
    public static class CentralizeConfig extends TeaModel {
        @NameInMap("destLogstore")
        private String destLogstore;

        @NameInMap("destProject")
        private String destProject;

        @NameInMap("destRegion")
        private String destRegion;

        @NameInMap("destTTL")
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
    public static class PolicyConfig extends TeaModel {
        @NameInMap("instanceIds")
        private java.util.List < String > instanceIds;

        @NameInMap("regions")
        private java.util.List < String > regions;

        @NameInMap("resourceMode")
        private String resourceMode;

        @NameInMap("resourceTags")
        private java.util.Map < String, ? > resourceTags;

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
        public java.util.List < String > getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return regions
         */
        public java.util.List < String > getRegions() {
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
        public java.util.Map < String, ? > getResourceTags() {
            return this.resourceTags;
        }

        public static final class Builder {
            private java.util.List < String > instanceIds; 
            private java.util.List < String > regions; 
            private String resourceMode; 
            private java.util.Map < String, ? > resourceTags; 

            /**
             * instanceIds.
             */
            public Builder instanceIds(java.util.List < String > instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * regions.
             */
            public Builder regions(java.util.List < String > regions) {
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
            public Builder resourceTags(java.util.Map < String, ? > resourceTags) {
                this.resourceTags = resourceTags;
                return this;
            }

            public PolicyConfig build() {
                return new PolicyConfig(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("attribute")
        private Attribute attribute;

        @NameInMap("centralizeConfig")
        private CentralizeConfig centralizeConfig;

        @NameInMap("centralizeEnabled")
        private Boolean centralizeEnabled;

        @NameInMap("dataCode")
        private String dataCode;

        @NameInMap("enabled")
        private Boolean enabled;

        @NameInMap("policyConfig")
        private PolicyConfig policyConfig;

        @NameInMap("policyName")
        private String policyName;

        @NameInMap("productCode")
        private String productCode;

        private Data(Builder builder) {
            this.attribute = builder.attribute;
            this.centralizeConfig = builder.centralizeConfig;
            this.centralizeEnabled = builder.centralizeEnabled;
            this.dataCode = builder.dataCode;
            this.enabled = builder.enabled;
            this.policyConfig = builder.policyConfig;
            this.policyName = builder.policyName;
            this.productCode = builder.productCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return attribute
         */
        public Attribute getAttribute() {
            return this.attribute;
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

        public static final class Builder {
            private Attribute attribute; 
            private CentralizeConfig centralizeConfig; 
            private Boolean centralizeEnabled; 
            private String dataCode; 
            private Boolean enabled; 
            private PolicyConfig policyConfig; 
            private String policyName; 
            private String productCode; 

            /**
             * attribute.
             */
            public Builder attribute(Attribute attribute) {
                this.attribute = attribute;
                return this;
            }

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
             * enabled.
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
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
             * productCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
