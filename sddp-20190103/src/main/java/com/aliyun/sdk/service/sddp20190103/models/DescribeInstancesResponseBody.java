// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeInstancesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * An array that consists of the data assets.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of data assets.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    public static class ModelTags extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        private ModelTags(Builder builder) {
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelTags create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private String name; 

            /**
             * The ID of the tag. Valid values:
             * <p>
             * 
             * *   **101**: personal sensitive information
             * *   **102**: personal information
             * *   **107**: general information
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the tag. Valid values:
             * <p>
             * 
             * *   Personal sensitive information
             * *   Personal information
             * *   General information
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ModelTags build() {
                return new ModelTags(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("CreationTime")
        private Long creationTime;

        @NameInMap("DepartName")
        private String departName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceDescription")
        private String instanceDescription;

        @NameInMap("Labelsec")
        private Boolean labelsec;

        @NameInMap("LastFinishTime")
        private Long lastFinishTime;

        @NameInMap("ModelTags")
        private java.util.List < ModelTags> modelTags;

        @NameInMap("Name")
        private String name;

        @NameInMap("OdpsRiskLevelName")
        private String odpsRiskLevelName;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("ProductCode")
        private String productCode;

        @NameInMap("ProductId")
        private String productId;

        @NameInMap("Protection")
        private Boolean protection;

        @NameInMap("RiskLevelId")
        private Long riskLevelId;

        @NameInMap("RiskLevelName")
        private String riskLevelName;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("Sensitive")
        private Boolean sensitive;

        @NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @NameInMap("TenantName")
        private String tenantName;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.departName = builder.departName;
            this.id = builder.id;
            this.instanceDescription = builder.instanceDescription;
            this.labelsec = builder.labelsec;
            this.lastFinishTime = builder.lastFinishTime;
            this.modelTags = builder.modelTags;
            this.name = builder.name;
            this.odpsRiskLevelName = builder.odpsRiskLevelName;
            this.owner = builder.owner;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.protection = builder.protection;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleName = builder.ruleName;
            this.sensitive = builder.sensitive;
            this.sensitiveCount = builder.sensitiveCount;
            this.tenantName = builder.tenantName;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return departName
         */
        public String getDepartName() {
            return this.departName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceDescription
         */
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        /**
         * @return labelsec
         */
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        /**
         * @return lastFinishTime
         */
        public Long getLastFinishTime() {
            return this.lastFinishTime;
        }

        /**
         * @return modelTags
         */
        public java.util.List < ModelTags> getModelTags() {
            return this.modelTags;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return odpsRiskLevelName
         */
        public String getOdpsRiskLevelName() {
            return this.odpsRiskLevelName;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return productCode
         */
        public String getProductCode() {
            return this.productCode;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return protection
         */
        public Boolean getProtection() {
            return this.protection;
        }

        /**
         * @return riskLevelId
         */
        public Long getRiskLevelId() {
            return this.riskLevelId;
        }

        /**
         * @return riskLevelName
         */
        public String getRiskLevelName() {
            return this.riskLevelName;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return sensitiveCount
         */
        public Integer getSensitiveCount() {
            return this.sensitiveCount;
        }

        /**
         * @return tenantName
         */
        public String getTenantName() {
            return this.tenantName;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long creationTime; 
            private String departName; 
            private Long id; 
            private String instanceDescription; 
            private Boolean labelsec; 
            private Long lastFinishTime; 
            private java.util.List < ModelTags> modelTags; 
            private String name; 
            private String odpsRiskLevelName; 
            private String owner; 
            private String productCode; 
            private String productId; 
            private Boolean protection; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private String ruleName; 
            private Boolean sensitive; 
            private Integer sensitiveCount; 
            private String tenantName; 
            private Integer totalCount; 

            /**
             * The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The name of the department to which the data asset belongs.
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * The unique ID of the data asset in DSC.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The description of the data asset.
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * The security status of the data asset. Valid values:
             * <p>
             * 
             * *   **true**: The data asset is secure.
             * *   **false**: The data asset is insecure.
             */
            public Builder labelsec(Boolean labelsec) {
                this.labelsec = labelsec;
                return this;
            }

            /**
             * The time when the data asset was last scanned. The value is a UNIX timestamp. Unit: milliseconds.
             */
            public Builder lastFinishTime(Long lastFinishTime) {
                this.lastFinishTime = lastFinishTime;
                return this;
            }

            /**
             * A list of tags.
             */
            public Builder modelTags(java.util.List < ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * The name of the data asset.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * This parameter is deprecated.
             */
            public Builder odpsRiskLevelName(String odpsRiskLevelName) {
                this.odpsRiskLevelName = odpsRiskLevelName;
                return this;
            }

            /**
             * The Alibaba Cloud account to which the data asset belongs.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The name of the service to which the data asset belongs, such as MaxCompute, OSS, and ApsaraDB RDS. For more information about the types of data assets that DSC can scan to detect sensitive data, see [Supported data assets](~~212906~~).
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * The ID of the service to which the data asset belongs.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * The protection status of the data asset. Valid values:
             * <p>
             * 
             * *   **true**: The data asset is being protected.
             * *   **false**: The data asset is not protected.
             */
            public Builder protection(Boolean protection) {
                this.protection = protection;
                return this;
            }

            /**
             * The ID of the sensitivity level for the data asset. A higher sensitivity level ID indicates that the identified data is more sensitive.
             * <p>
             * 
             * *   **1**: No sensitive data is detected.
             * *   **2**: sensitive data at level 1.
             * *   **3**: sensitive data at level 2.
             * *   **4**: sensitive data at level 3.
             * *   **5**: sensitive data at level 4.
             * *   **6**: sensitive data at level 5.
             * *   **7**: sensitive data at level 6.
             * *   **8**: sensitive data at level 7.
             * *   **9**: sensitive data at level 8.
             * *   **10**: sensitive data at level 9.
             * *   **11**: sensitive data at level 10.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * The name of the sensitivity level for the data asset.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * The name of the sensitive data detection rule that the data asset hits.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * Indicates whether the data asset contains sensitive data. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false**
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * The number of sensitive data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the number of sensitive tables in all databases of the instance.
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * The name of the tenant.
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * The total number of data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the total number of tables in all databases of the instance.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
