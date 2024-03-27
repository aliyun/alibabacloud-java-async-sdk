// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCheckItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemResponseBody</p>
 */
public class ListCheckItemResponseBody extends TeaModel {
    @NameInMap("CheckItems")
    private java.util.List < CheckItems> checkItems;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ListCheckItemResponseBody(Builder builder) {
        this.checkItems = builder.checkItems;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCheckItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return checkItems
     */
    public java.util.List < CheckItems> getCheckItems() {
        return this.checkItems;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CheckItems> checkItems; 
        private PageInfo pageInfo; 
        private String requestId; 

        /**
         * The check items.
         */
        public Builder checkItems(java.util.List < CheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * The pagination information.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckItemResponseBody build() {
            return new ListCheckItemResponseBody(this);
        } 

    } 

    public static class CustomConfigs extends TeaModel {
        @NameInMap("DefaultValue")
        private String defaultValue;

        @NameInMap("Name")
        private String name;

        @NameInMap("ShowName")
        private String showName;

        @NameInMap("TypeDefine")
        private String typeDefine;

        @NameInMap("Value")
        private String value;

        private CustomConfigs(Builder builder) {
            this.defaultValue = builder.defaultValue;
            this.name = builder.name;
            this.showName = builder.showName;
            this.typeDefine = builder.typeDefine;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomConfigs create() {
            return builder().build();
        }

        /**
         * @return defaultValue
         */
        public String getDefaultValue() {
            return this.defaultValue;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return showName
         */
        public String getShowName() {
            return this.showName;
        }

        /**
         * @return typeDefine
         */
        public String getTypeDefine() {
            return this.typeDefine;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String defaultValue; 
            private String name; 
            private String showName; 
            private String typeDefine; 
            private String value; 

            /**
             * The default value of the check item. The value is a string.
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The display name of the check item.
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * The type of the check item. The value is a JSON string.
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * The specified value of the check item. The value is a string.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomConfigs build() {
                return new CustomConfigs(this);
            } 

        } 

    }
    public static class Description extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Value")
        private String value;

        private Description(Builder builder) {
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Description create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String type; 
            private String value; 

            /**
             * The type of the description of the check item. Valid value:
             * <p>
             * 
             * *   **text**
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The content of the description for the check item when the Type parameter is text.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Description build() {
                return new Description(this);
            } 

        } 

    }
    public static class CheckItems extends TeaModel {
        @NameInMap("CheckId")
        private Long checkId;

        @NameInMap("CheckShowName")
        private String checkShowName;

        @NameInMap("CustomConfigs")
        private java.util.List < CustomConfigs> customConfigs;

        @NameInMap("Description")
        private Description description;

        @NameInMap("EstimatedCount")
        private Integer estimatedCount;

        @NameInMap("InstanceSubType")
        private String instanceSubType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("RiskLevel")
        private String riskLevel;

        @NameInMap("SectionIds")
        private java.util.List < Long > sectionIds;

        @NameInMap("Vendor")
        private String vendor;

        private CheckItems(Builder builder) {
            this.checkId = builder.checkId;
            this.checkShowName = builder.checkShowName;
            this.customConfigs = builder.customConfigs;
            this.description = builder.description;
            this.estimatedCount = builder.estimatedCount;
            this.instanceSubType = builder.instanceSubType;
            this.instanceType = builder.instanceType;
            this.riskLevel = builder.riskLevel;
            this.sectionIds = builder.sectionIds;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CheckItems create() {
            return builder().build();
        }

        /**
         * @return checkId
         */
        public Long getCheckId() {
            return this.checkId;
        }

        /**
         * @return checkShowName
         */
        public String getCheckShowName() {
            return this.checkShowName;
        }

        /**
         * @return customConfigs
         */
        public java.util.List < CustomConfigs> getCustomConfigs() {
            return this.customConfigs;
        }

        /**
         * @return description
         */
        public Description getDescription() {
            return this.description;
        }

        /**
         * @return estimatedCount
         */
        public Integer getEstimatedCount() {
            return this.estimatedCount;
        }

        /**
         * @return instanceSubType
         */
        public String getInstanceSubType() {
            return this.instanceSubType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return sectionIds
         */
        public java.util.List < Long > getSectionIds() {
            return this.sectionIds;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private Long checkId; 
            private String checkShowName; 
            private java.util.List < CustomConfigs> customConfigs; 
            private Description description; 
            private Integer estimatedCount; 
            private String instanceSubType; 
            private String instanceType; 
            private String riskLevel; 
            private java.util.List < Long > sectionIds; 
            private String vendor; 

            /**
             * The ID of the check item.
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * The name of the check item.
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * The check items.
             */
            public Builder customConfigs(java.util.List < CustomConfigs> customConfigs) {
                this.customConfigs = customConfigs;
                return this;
            }

            /**
             * The description of the check item.
             */
            public Builder description(Description description) {
                this.description = description;
                return this;
            }

            /**
             * EstimatedCount.
             */
            public Builder estimatedCount(Integer estimatedCount) {
                this.estimatedCount = estimatedCount;
                return this;
            }

            /**
             * The asset subtype of the cloud service. Valid value:
             * <p>
             * 
             * *   If **InstanceType** is set to **ECS**, this parameter supports the following valid values:
             * 
             *     *   **INSTANCE**
             *     *   **DISK**
             *     *   **SECURITY_GROUP**
             * 
             * *   If **InstanceType** is set to **ACR**, this parameter supports the following valid values:
             * 
             *     *   **REPOSITORY_ENTERPRISE**
             *     *   **REPOSITORY_PERSON**
             * 
             * *   If **InstanceType** is set to **RAM**, this parameter supports the following valid values:
             * 
             *     *   **ALIAS**
             *     *   **USER**
             *     *   **POLICY**
             *     *   **GROUP**
             * 
             * *   If **InstanceType** is set to **WAF**, this parameter supports the following valid values:
             * 
             *     *   **DOMAIN**
             * 
             * *   If **InstanceType** is set to other values, this parameter supports the following valid values:
             * 
             *     *   **INSTANCE**
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * The asset type of the cloud service. Valid value:
             * <p>
             * 
             * *   **ECS**: Elastic Compute Service (ECS)
             * *   **SLB**: Server Load Balancer (SLB)
             * *   **RDS**: ApsaraDB RDS
             * *   **MONGODB**: ApsaraDB for MongoDB (MongoDB)
             * *   **KVSTORE**: ApsaraDB for Redis (Redis)
             * *   **ACR**: Container Registry
             * *   **CSK**: Container Service for Kubernetes (ACK)
             * *   **VPC**: Virtual Private Cloud (VPC)
             * *   **ACTIONTRAIL**: ActionTrail
             * *   **CDN**: Alibaba Cloud CDN (CDN)
             * *   **CAS**: Certificate Management Service (formerly SSL Certificates Service)
             * *   **RDC**: Apsara Devops
             * *   **RAM**: Resource Access Management (RAM)
             * *   **DDOS**: Anti-DDoS
             * *   **WAF**: Web Application Firewall (WAF)
             * *   **OSS**: Object Storage Service (OSS)
             * *   **POLARDB**: PolarDB
             * *   **POSTGRESQL**: ApsaraDB RDS for PostgreSQL
             * *   **MSE**: Microservices Engine (MSE)
             * *   **NAS**: Apsara File Storage NAS (NAS)
             * *   **SDDP**: Sensitive Data Discovery and Protection (SDDP)
             * *   **EIP**: Elastic IP Address (EIP)
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * The risk level of the check item. Valid value:
             * <p>
             * 
             * *   **HIGH**
             * *   **MEDIUM**
             * *   **LOW**
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * The IDs of the sections associated with the check items.
             */
            public Builder sectionIds(java.util.List < Long > sectionIds) {
                this.sectionIds = sectionIds;
                return this;
            }

            /**
             * The type of the cloud asset. Valid value:
             * <p>
             * 
             * *   **0**: an asset provided by Alibaba Cloud
             * *   **1**: a third-party cloud asset
             * *   **2**: an asset in a data center
             * *   **3**, **4**, **5**, and **7**: other cloud asset
             * *   **8**: a simple application server
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public CheckItems build() {
                return new CheckItems(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Count")
        private Integer count;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private PageInfo(Builder builder) {
            this.count = builder.count;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer count; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The number of entries returned on the current page.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * The page number of the returned page.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of entries returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
