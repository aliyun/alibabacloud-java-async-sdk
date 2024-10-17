// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20190103.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDataAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAssetsResponseBody</p>
 */
public class DescribeDataAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List < Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDataAssetsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAssetsResponseBody create() {
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
         * <p>An array that consists of data assets.</p>
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
         * <p>The total number of queried data assets that contain sensitive data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDataAssetsResponseBody build() {
            return new DescribeDataAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAssetsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Acl")
        private String acl;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Labelsec")
        private Boolean labelsec;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ObjectKey")
        private String objectKey;

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

        @com.aliyun.core.annotation.NameInMap("SensitiveRatio")
        private String sensitiveRatio;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Items(Builder builder) {
            this.acl = builder.acl;
            this.creationTime = builder.creationTime;
            this.dataType = builder.dataType;
            this.id = builder.id;
            this.labelsec = builder.labelsec;
            this.name = builder.name;
            this.objectKey = builder.objectKey;
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
            this.sensitiveRatio = builder.sensitiveRatio;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return acl
         */
        public String getAcl() {
            return this.acl;
        }

        /**
         * @return creationTime
         */
        public Long getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return labelsec
         */
        public Boolean getLabelsec() {
            return this.labelsec;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return objectKey
         */
        public String getObjectKey() {
            return this.objectKey;
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
         * @return sensitiveRatio
         */
        public String getSensitiveRatio() {
            return this.sensitiveRatio;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String acl; 
            private Long creationTime; 
            private String dataType; 
            private String id; 
            private Boolean labelsec; 
            private String name; 
            private String objectKey; 
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
            private String sensitiveRatio; 
            private Integer totalCount; 

            /**
             * <p>The access control list (ACL) that controls the access permissions on the OSS bucket.</p>
             * <blockquote>
             * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>21</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder acl(String acl) {
                this.acl = acl;
                return this;
            }

            /**
             * <p>The time when the data asset was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1536751124000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The data type of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS_BUCKET</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The ID of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>268</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The sensitivity tag of the data. The value is fixed as <strong>0</strong>. <strong>0</strong>, <strong>1</strong>, <strong>2</strong>, or <strong>3</strong> is returned for this parameter only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
             * <ul>
             * <li><strong>0</strong>: unclassified</li>
             * <li><strong>1</strong>: confidential</li>
             * <li><strong>2</strong>: sensitive</li>
             * <li><strong>3</strong>: highly sensitive</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder labelsec(Boolean labelsec) {
                this.labelsec = labelsec;
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
             * <p>The key value of the OSS object.</p>
             * <blockquote>
             * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>22</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Internal</p>
             */
            public Builder objectKey(String objectKey) {
                this.objectKey = objectKey;
                return this;
            }

            /**
             * <p>The sensitivity level of the MaxCompute data asset. Valid values:</p>
             * <ul>
             * <li><strong>S1</strong>: low sensitivity level</li>
             * <li><strong>S2</strong>: medium sensitivity level</li>
             * <li><strong>S3</strong>: high sensitivity level</li>
             * <li><strong>S4</strong>: highest sensitivity level</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>S4</p>
             */
            public Builder odpsRiskLevelName(String odpsRiskLevelName) {
                this.odpsRiskLevelName = odpsRiskLevelName;
                return this;
            }

            /**
             * <p>The account that owns the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>dtdep-239-******</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the service to which the data asset belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the service to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: OSS</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>Indicates whether the data protection mechanism is enabled for the data asset. The value is fixed as <strong>false</strong>. <strong>true</strong> or <strong>false</strong> is returned for this parameter only when you set the parameter <strong>RangeId</strong> to <strong>1</strong>.</p>
             * <ul>
             * <li><strong>false</strong>: The data protection mechanism is disabled.</li>
             * <li><strong>true</strong>: The data protection mechanism is enabled. Only data inbound is supported. Data outbound is not supported.</li>
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
             * <p>The sensitivity level of the data asset. A higher sensitivity level indicates that the identified data is more sensitive. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: No sensitive data is identified.</li>
             * <li><strong>2</strong>: sensitive data at level 1.</li>
             * <li><strong>3</strong>: sensitive data at level 2.</li>
             * <li><strong>3</strong>: sensitive data at level 3.</li>
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
             * <p>Medium sensitivity level</p>
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
             * <li><strong>true</strong>: yes</li>
             * <li><strong>false</strong>: no</li>
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
             * <p>The total number of sensitive data assets. For example, the value can be the total number of sensitive MaxCompute projects, packages, or tables, the total number of sensitive ApsaraDB RDS databases or tables, or the total number of sensitive OSS buckets or objects.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder sensitiveCount(Integer sensitiveCount) {
                this.sensitiveCount = sensitiveCount;
                return this;
            }

            /**
             * <p>The percentage of sensitive data in all data assets.</p>
             * 
             * <strong>example:</strong>
             * <p>45%</p>
             */
            public Builder sensitiveRatio(String sensitiveRatio) {
                this.sensitiveRatio = sensitiveRatio;
                return this;
            }

            /**
             * <p>The total number of data assets. For example, the value can be the total number of MaxCompute projects, packages, or tables, the total number of ApsaraDB RDS databases or tables, or the total number of OSS buckets or objects.</p>
             * 
             * <strong>example:</strong>
             * <p>432</p>
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
