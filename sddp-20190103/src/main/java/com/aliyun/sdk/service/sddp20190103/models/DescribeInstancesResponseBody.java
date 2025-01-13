// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

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
 * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstancesResponseBody</p>
 */
public class DescribeInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
    public java.util.List<Items> getItems() {
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
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

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
         * <p>An array that consists of the data assets.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>71064826-726F-4ADA-B879-05D8055476FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of data assets.</p>
         * 
         * <strong>example:</strong>
         * <p>231</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeInstancesResponseBody build() {
            return new DescribeInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class ModelTags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
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
             * <p>The ID of the tag. Valid values:</p>
             * <ul>
             * <li><strong>101</strong>: personal sensitive information</li>
             * <li><strong>102</strong>: personal information</li>
             * <li><strong>107</strong>: general information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the tag. Valid values:</p>
             * <ul>
             * <li>Personal sensitive information</li>
             * <li>Personal information</li>
             * <li>General information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>personal sensitive data</p>
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
    /**
     * 
     * {@link DescribeInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInstancesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DepartName")
        private String departName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("InstanceDescription")
        private String instanceDescription;

        @com.aliyun.core.annotation.NameInMap("Labelsec")
        private Boolean labelsec;

        @com.aliyun.core.annotation.NameInMap("LastFinishTime")
        private Long lastFinishTime;

        @com.aliyun.core.annotation.NameInMap("MemberAliUid")
        private String memberAliUid;

        @com.aliyun.core.annotation.NameInMap("ModelTags")
        private java.util.List<ModelTags> modelTags;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OdpsRiskLevelName")
        private String odpsRiskLevelName;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("Protection")
        private Boolean protection;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("SensitiveCount")
        private Integer sensitiveCount;

        @com.aliyun.core.annotation.NameInMap("TenantName")
        private String tenantName;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.departName = builder.departName;
            this.id = builder.id;
            this.instanceDescription = builder.instanceDescription;
            this.labelsec = builder.labelsec;
            this.lastFinishTime = builder.lastFinishTime;
            this.memberAliUid = builder.memberAliUid;
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
         * @return memberAliUid
         */
        public String getMemberAliUid() {
            return this.memberAliUid;
        }

        /**
         * @return modelTags
         */
        public java.util.List<ModelTags> getModelTags() {
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
            private String memberAliUid; 
            private java.util.List<ModelTags> modelTags; 
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
             * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637226782000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The name of the department to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>***DemoCenter</p>
             */
            public Builder departName(String departName) {
                this.departName = departName;
                return this;
            }

            /**
             * <p>The unique ID of the data asset in DSC.</p>
             * 
             * <strong>example:</strong>
             * <p>11111</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The description of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Data asset Information 1</p>
             */
            public Builder instanceDescription(String instanceDescription) {
                this.instanceDescription = instanceDescription;
                return this;
            }

            /**
             * <p>The security status of the data asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The data asset is secure.</li>
             * <li><strong>false</strong>: The data asset is insecure.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder labelsec(Boolean labelsec) {
                this.labelsec = labelsec;
                return this;
            }

            /**
             * <p>The time when the data asset was last scanned. The value is a UNIX timestamp. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1637622793000</p>
             */
            public Builder lastFinishTime(Long lastFinishTime) {
                this.lastFinishTime = lastFinishTime;
                return this;
            }

            /**
             * MemberAliUid.
             */
            public Builder memberAliUid(String memberAliUid) {
                this.memberAliUid = memberAliUid;
                return this;
            }

            /**
             * <p>A list of tags.</p>
             */
            public Builder modelTags(java.util.List<ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * <p>The name of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>gxdata</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is deprecated.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder odpsRiskLevelName(String odpsRiskLevelName) {
                this.odpsRiskLevelName = odpsRiskLevelName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>dtdep-239-******</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the service to which the data asset belongs, such as MaxCompute, OSS, and ApsaraDB RDS. For more information about the types of data assets that DSC can scan to detect sensitive data, see <a href="https://help.aliyun.com/document_detail/212906.html">Supported data assets</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the service to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The protection status of the data asset. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: The data asset is being protected.</li>
             * <li><strong>false</strong>: The data asset is not protected.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder protection(Boolean protection) {
                this.protection = protection;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level for the data asset. A higher sensitivity level ID indicates that the identified data is more sensitive.</p>
             * <ul>
             * <li><strong>1</strong>: No sensitive data is detected.</li>
             * <li><strong>2</strong>: sensitive data at level 1.</li>
             * <li><strong>3</strong>: sensitive data at level 2.</li>
             * <li><strong>4</strong>: sensitive data at level 3.</li>
             * <li><strong>5</strong>: sensitive data at level 4.</li>
             * <li><strong>6</strong>: sensitive data at level 5.</li>
             * <li><strong>7</strong>: sensitive data at level 6.</li>
             * <li><strong>8</strong>: sensitive data at level 7.</li>
             * <li><strong>9</strong>: sensitive data at level 8.</li>
             * <li><strong>10</strong>: sensitive data at level 9.</li>
             * <li><strong>11</strong>: sensitive data at level 10.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The name of the sensitivity level for the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>Sensitive data at level 1</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The name of the sensitive data detection rule that the data asset hits.</p>
             * 
             * <strong>example:</strong>
             * <p>*** rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>Indicates whether the data asset contains sensitive data. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The number of sensitive data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the number of sensitive tables in all databases of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The name of the tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>Tenant 1</p>
             */
            public Builder tenantName(String tenantName) {
                this.tenantName = tenantName;
                return this;
            }

            /**
             * <p>The total number of data objects in the data asset. For example, if the data asset is an ApsaraDB RDS instance, the value indicates the total number of tables in all databases of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>231</p>
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
