// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListCheckItemResponseBody} extends {@link TeaModel}
 *
 * <p>ListCheckItemResponseBody</p>
 */
public class ListCheckItemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CheckItems")
    private java.util.List<CheckItems> checkItems;

    @com.aliyun.core.annotation.NameInMap("PageInfo")
    private PageInfo pageInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkItems
     */
    public java.util.List<CheckItems> getCheckItems() {
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
        private java.util.List<CheckItems> checkItems; 
        private PageInfo pageInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCheckItemResponseBody model) {
            this.checkItems = model.checkItems;
            this.pageInfo = model.pageInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The check items.</p>
         */
        public Builder checkItems(java.util.List<CheckItems> checkItems) {
            this.checkItems = checkItems;
            return this;
        }

        /**
         * <p>The pagination information.</p>
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9F4E6157-9600-5588-86B9-38F09067****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCheckItemResponseBody build() {
            return new ListCheckItemResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCheckItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemResponseBody</p>
     */
    public static class CustomConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultValue")
        private String defaultValue;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShowName")
        private String showName;

        @com.aliyun.core.annotation.NameInMap("TypeDefine")
        private String typeDefine;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(CustomConfigs model) {
                this.defaultValue = model.defaultValue;
                this.name = model.name;
                this.showName = model.showName;
                this.typeDefine = model.typeDefine;
                this.value = model.value;
            } 

            /**
             * <p>The default value of the check item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder defaultValue(String defaultValue) {
                this.defaultValue = defaultValue;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>IPList</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The display name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Ensure RAM password policy prevents password reuse</p>
             */
            public Builder showName(String showName) {
                this.showName = showName;
                return this;
            }

            /**
             * <p>The type of the check item. The value is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;LIST&quot;,&quot;range&quot;:[1,512],&quot;listType&quot;:{&quot;type&quot;:&quot;STRING&quot;,&quot;range&quot;:[0,22]}}</p>
             */
            public Builder typeDefine(String typeDefine) {
                this.typeDefine = typeDefine;
                return this;
            }

            /**
             * <p>The specified value of the check item. The value is a string.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
    /**
     * 
     * {@link ListCheckItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemResponseBody</p>
     */
    public static class Description extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Description model) {
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The type of the description of the check item. Valid value:</p>
             * <ul>
             * <li><strong>text</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>text</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The content of the description for the check item when the Type parameter is text.</p>
             * 
             * <strong>example:</strong>
             * <p>The download of query results that are returned by SELECT statements in DataStudio must be prohibited at the MaxCompute level.</p>
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
    /**
     * 
     * {@link ListCheckItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemResponseBody</p>
     */
    public static class CheckItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckId")
        private Long checkId;

        @com.aliyun.core.annotation.NameInMap("CheckShowName")
        private String checkShowName;

        @com.aliyun.core.annotation.NameInMap("CustomConfigs")
        private java.util.List<CustomConfigs> customConfigs;

        @com.aliyun.core.annotation.NameInMap("Description")
        private Description description;

        @com.aliyun.core.annotation.NameInMap("EstimatedCount")
        private Integer estimatedCount;

        @com.aliyun.core.annotation.NameInMap("InstanceSubType")
        private String instanceSubType;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("SectionIds")
        private java.util.List<Long> sectionIds;

        @com.aliyun.core.annotation.NameInMap("Vendor")
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
        public java.util.List<CustomConfigs> getCustomConfigs() {
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
        public java.util.List<Long> getSectionIds() {
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
            private java.util.List<CustomConfigs> customConfigs; 
            private Description description; 
            private Integer estimatedCount; 
            private String instanceSubType; 
            private String instanceType; 
            private String riskLevel; 
            private java.util.List<Long> sectionIds; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(CheckItems model) {
                this.checkId = model.checkId;
                this.checkShowName = model.checkShowName;
                this.customConfigs = model.customConfigs;
                this.description = model.description;
                this.estimatedCount = model.estimatedCount;
                this.instanceSubType = model.instanceSubType;
                this.instanceType = model.instanceType;
                this.riskLevel = model.riskLevel;
                this.sectionIds = model.sectionIds;
                this.vendor = model.vendor;
            } 

            /**
             * <p>The ID of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder checkId(Long checkId) {
                this.checkId = checkId;
                return this;
            }

            /**
             * <p>The name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Enable deletion protection</p>
             */
            public Builder checkShowName(String checkShowName) {
                this.checkShowName = checkShowName;
                return this;
            }

            /**
             * <p>The check items.</p>
             */
            public Builder customConfigs(java.util.List<CustomConfigs> customConfigs) {
                this.customConfigs = customConfigs;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             */
            public Builder description(Description description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The estimated quota that will be consumed by this check item.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder estimatedCount(Integer estimatedCount) {
                this.estimatedCount = estimatedCount;
                return this;
            }

            /**
             * <p>The asset subtype of the cloud service. Valid values:</p>
             * <ul>
             * <li><p>If <strong>InstanceType</strong> is set to <strong>ECS</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong></li>
             * <li><strong>DISK</strong></li>
             * <li><strong>SECURITY_GROUP</strong></li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceType</strong> is set to <strong>ACR</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>REPOSITORY_ENTERPRISE</strong></li>
             * <li><strong>REPOSITORY_PERSON</strong></li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceType</strong> is set to <strong>RAM</strong>, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>ALIAS</strong></li>
             * <li><strong>USER</strong></li>
             * <li><strong>POLICY</strong></li>
             * <li><strong>GROUP</strong></li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceType</strong> is set to <strong>WAF</strong>, this parameter supports the following valid value:</p>
             * <ul>
             * <li><strong>DOMAIN</strong></li>
             * </ul>
             * </li>
             * <li><p>If <strong>InstanceType</strong> is set to other values, this parameter supports the following valid values:</p>
             * <ul>
             * <li><strong>INSTANCE</strong></li>
             * </ul>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ECS</p>
             */
            public Builder instanceSubType(String instanceSubType) {
                this.instanceSubType = instanceSubType;
                return this;
            }

            /**
             * <p>The asset type of the cloud service. Valid values:</p>
             * <ul>
             * <li><strong>ECS</strong>: Elastic Compute Service (ECS).</li>
             * <li><strong>SLB</strong>: Server Load Balancer (SLB).</li>
             * <li><strong>RDS</strong>: ApsaraDB RDS.</li>
             * <li><strong>MONGODB</strong>: ApsaraDB for MongoDB (MongoDB).</li>
             * <li><strong>KVSTORE</strong>: ApsaraDB for Redis (Redis).</li>
             * <li><strong>ACR</strong>: Container Registry.</li>
             * <li><strong>CSK</strong>: Container Service for Kubernetes (ACK).</li>
             * <li><strong>VPC</strong>: Virtual Private Cloud (VPC).</li>
             * <li><strong>ACTIONTRAIL</strong>: ActionTrail.</li>
             * <li><strong>CDN</strong>: Alibaba Cloud CDN (CDN).</li>
             * <li><strong>CAS</strong>: Certificate Management Service (formerly SSL Certificates Service).</li>
             * <li><strong>RDC</strong>: Apsara Devops.</li>
             * <li><strong>RAM</strong>: Resource Access Management (RAM).</li>
             * <li><strong>DDOS</strong>: Anti-DDoS.</li>
             * <li><strong>WAF</strong>: Web Application Firewall (WAF).</li>
             * <li><strong>OSS</strong>: Object Storage Service (OSS).</li>
             * <li><strong>POLARDB</strong>: PolarDB.</li>
             * <li><strong>POSTGRESQL</strong>: ApsaraDB RDS for PostgreSQL.</li>
             * <li><strong>MSE</strong>: Microservices Engine (MSE).</li>
             * <li><strong>NAS</strong>: File Storage NAS (NAS).</li>
             * <li><strong>SDDP</strong>: Sensitive Data Discovery and Protection (SDDP).</li>
             * <li><strong>EIP</strong>: Elastic IP Address (EIP).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * <p>The risk level of the check item. Valid values:</p>
             * <ul>
             * <li><strong>HIGH</strong></li>
             * <li><strong>MEDIUM</strong></li>
             * <li><strong>LOW</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>HIGH</p>
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * <p>The IDs of the sections associated with the check items.</p>
             */
            public Builder sectionIds(java.util.List<Long> sectionIds) {
                this.sectionIds = sectionIds;
                return this;
            }

            /**
             * <p>The type of the cloud asset. Valid values:</p>
             * <ul>
             * <li><strong>0</strong>: an asset provided by Alibaba Cloud.</li>
             * <li><strong>1</strong>: an asset outside Alibaba Cloud.</li>
             * <li><strong>2</strong>: an asset in a data center.</li>
             * <li><strong>3</strong>, <strong>4</strong>, <strong>5</strong>, and <strong>7</strong>: other cloud asset.</li>
             * <li><strong>8</strong>: a simple application server.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link ListCheckItemResponseBody} extends {@link TeaModel}
     *
     * <p>ListCheckItemResponseBody</p>
     */
    public static class PageInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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

            private Builder() {
            } 

            private Builder(PageInfo model) {
                this.count = model.count;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The number of entries returned on the current page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>149</p>
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
