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
 * {@link DescribeColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeColumnsResponseBody</p>
 */
public class DescribeColumnsResponseBody extends TeaModel {
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

    private DescribeColumnsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeColumnsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeColumnsResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * <p>The data in the columns of the table.</p>
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
         * <p>769FB3C1-F4C9-4******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeColumnsResponseBody build() {
            return new DescribeColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(ModelTags model) {
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * <p>The tag ID.</p>
             * <ul>
             * <li><strong>101</strong>: sensitive personal information</li>
             * <li><strong>102</strong>: personal information</li>
             * <li><strong>103</strong>: important information</li>
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
             * <p>The tag name.</p>
             * <ul>
             * <li>Sensitive personal information</li>
             * <li>Personal information</li>
             * <li>Important information</li>
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
     * {@link DescribeColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeColumnsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private Long instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaskingStatus")
        private Integer maskingStatus;

        @com.aliyun.core.annotation.NameInMap("ModelTags")
        private java.util.List<ModelTags> modelTags;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OdpsRiskLevelName")
        private String odpsRiskLevelName;

        @com.aliyun.core.annotation.NameInMap("OdpsRiskLevelValue")
        private Integer odpsRiskLevelValue;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RevisionId")
        private Long revisionId;

        @com.aliyun.core.annotation.NameInMap("RevisionStatus")
        private Long revisionStatus;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SensLevelName")
        private String sensLevelName;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("TableId")
        private Long tableId;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dataType = builder.dataType;
            this.engineType = builder.engineType;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.maskingStatus = builder.maskingStatus;
            this.modelTags = builder.modelTags;
            this.name = builder.name;
            this.odpsRiskLevelName = builder.odpsRiskLevelName;
            this.odpsRiskLevelValue = builder.odpsRiskLevelValue;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.revisionId = builder.revisionId;
            this.revisionStatus = builder.revisionStatus;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.sensLevelName = builder.sensLevelName;
            this.sensitive = builder.sensitive;
            this.tableId = builder.tableId;
            this.tableName = builder.tableName;
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
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public Long getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return maskingStatus
         */
        public Integer getMaskingStatus() {
            return this.maskingStatus;
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
         * @return odpsRiskLevelValue
         */
        public Integer getOdpsRiskLevelValue() {
            return this.odpsRiskLevelValue;
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
        public Long getProductId() {
            return this.productId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return revisionId
         */
        public Long getRevisionId() {
            return this.revisionId;
        }

        /**
         * @return revisionStatus
         */
        public Long getRevisionStatus() {
            return this.revisionStatus;
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
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return sensLevelName
         */
        public String getSensLevelName() {
            return this.sensLevelName;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return tableId
         */
        public Long getTableId() {
            return this.tableId;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long creationTime; 
            private String dataType; 
            private String engineType; 
            private String id; 
            private Long instanceId; 
            private String instanceName; 
            private Integer maskingStatus; 
            private java.util.List<ModelTags> modelTags; 
            private String name; 
            private String odpsRiskLevelName; 
            private Integer odpsRiskLevelValue; 
            private String productCode; 
            private Long productId; 
            private String regionId; 
            private Long revisionId; 
            private Long revisionStatus; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Long ruleId; 
            private String ruleName; 
            private String sensLevelName; 
            private Boolean sensitive; 
            private Long tableId; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creationTime = model.creationTime;
                this.dataType = model.dataType;
                this.engineType = model.engineType;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
                this.maskingStatus = model.maskingStatus;
                this.modelTags = model.modelTags;
                this.name = model.name;
                this.odpsRiskLevelName = model.odpsRiskLevelName;
                this.odpsRiskLevelValue = model.odpsRiskLevelValue;
                this.productCode = model.productCode;
                this.productId = model.productId;
                this.regionId = model.regionId;
                this.revisionId = model.revisionId;
                this.revisionStatus = model.revisionStatus;
                this.riskLevelId = model.riskLevelId;
                this.riskLevelName = model.riskLevelName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.sensLevelName = model.sensLevelName;
                this.sensitive = model.sensitive;
                this.tableId = model.tableId;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The time when the data in the column of the table is created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1536751124000</p>
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The type of data in the column of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The type of the database engine.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * <p>The ID of the column of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>268</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the instance to which data in the column of the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder instanceId(Long instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The name of the instance to which data in the column of the table belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-bp17t1htja573l5i8****</p>
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * <p>The column encryption status. Valid values:</p>
             * <ul>
             * <li><strong>-1</strong>: unencrypted</li>
             * <li><strong>1</strong>: encrypted</li>
             * <li><strong>2</strong>: encryption failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder maskingStatus(Integer maskingStatus) {
                this.maskingStatus = maskingStatus;
                return this;
            }

            /**
             * <p>A list of tags for data that hits the recognition model.</p>
             */
            public Builder modelTags(java.util.List<ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * <p>The name of the column of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>gxdata</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The name of the sensitivity level for asset. Valid values:</p>
             * <ul>
             * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
             * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
             * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
             * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
             * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S3</p>
             */
            public Builder odpsRiskLevelName(String odpsRiskLevelName) {
                this.odpsRiskLevelName = odpsRiskLevelName;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level of the asset. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A</li>
             * <li><strong>2</strong>: S1</li>
             * <li><strong>3</strong>: S2</li>
             * <li><strong>4</strong>: S3</li>
             * <li><strong>5</strong>: S4</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder odpsRiskLevelValue(Integer odpsRiskLevelValue) {
                this.odpsRiskLevelValue = odpsRiskLevelValue;
                return this;
            }

            /**
             * <p>The name of the service to which data in the column of the table belongs. Valid values include <strong>MaxCompute, OSS, ADS, OTS, and RDS</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>MaxCompute</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the service to which the data object belongs. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: MaxCompute</li>
             * <li><strong>2</strong>: Object Storage Service (OSS)</li>
             * <li><strong>3</strong>: AnalyticDB for MySQL</li>
             * <li><strong>4</strong>: Tablestore (OTS)</li>
             * <li><strong>5</strong>: ApsaraDB RDS</li>
             * <li><strong>6</strong>: self-managed database</li>
             * <li><strong>7</strong>: PolarDB for Xscale (PolarDB-X)</li>
             * <li><strong>8</strong>: PolarDB</li>
             * <li><strong>9</strong>: AnalyticDB for PostgreSQL</li>
             * <li><strong>10</strong>: ApsaraDB for OceanBase</li>
             * <li><strong>11</strong>: ApsaraDB for MongoDB</li>
             * <li><strong>25</strong>: ApsaraDB for Redis</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The region in which the asset resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-***</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the revision record.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder revisionId(Long revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            /**
             * <p>Indicates whether the column is revised. Valid values:</p>
             * <ul>
             * <li>1: yes</li>
             * <li>0: no</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder revisionStatus(Long revisionStatus) {
                this.revisionStatus = revisionStatus;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level of data in the column of the table. Valid values:</p>
             * <ul>
             * <li><strong>1</strong>: N/A</li>
             * <li><strong>2</strong>: S1</li>
             * <li><strong>3</strong>: S2</li>
             * <li><strong>4</strong>: S3</li>
             * <li><strong>5</strong>: S4</li>
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
             * <p>The name of the sensitivity level for data in the column of the table. Valid values:</p>
             * <ul>
             * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
             * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
             * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
             * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
             * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The ID of the sensitive data detection rule that data in the column of the table hits.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the sensitive data detection rule that data in the column of the table hits.</p>
             * 
             * <strong>example:</strong>
             * <p>** rule</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The name of the sensitivity level. Valid values:</p>
             * <ul>
             * <li><strong>N/A</strong>: indicates that no sensitive data is detected.</li>
             * <li><strong>S1</strong>: indicates the low sensitivity level.</li>
             * <li><strong>S2</strong>: indicates the medium sensitivity level.</li>
             * <li><strong>S3</strong>: indicates the high sensitivity level.</li>
             * <li><strong>S4</strong>: indicates the highest sensitivity level.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder sensLevelName(String sensLevelName) {
                this.sensLevelName = sensLevelName;
                return this;
            }

            /**
             * <p>Indicates whether the column contains sensitive data. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * <p>The ID of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder tableId(Long tableId) {
                this.tableId = tableId;
                return this;
            }

            /**
             * <p>The name of the table to which the revised column belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>it_table</p>
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
