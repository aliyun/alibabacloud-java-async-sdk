// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sddp20260120.models;

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
 * {@link ListDataMaskingColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataMaskingColumnsResponseBody</p>
 */
public class ListDataMaskingColumnsResponseBody extends TeaModel {
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

    private ListDataMaskingColumnsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataMaskingColumnsResponseBody create() {
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

        private Builder(ListDataMaskingColumnsResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The page number of the returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The list of records returned by the current query.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of records per page for the current query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request. It can be used to locate the current API call.</p>
         * 
         * <strong>example:</strong>
         * <p>7C6D8E9F-1234-5678-ABCD-0123456789AB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that meet the current statistics or query scope.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDataMaskingColumnsResponseBody build() {
            return new ListDataMaskingColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataMaskingColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataMaskingColumnsResponseBody</p>
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
             * <p>The ID of the model tag.</p>
             * 
             * <strong>example:</strong>
             * <p>101</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the model tag.</p>
             * 
             * <strong>example:</strong>
             * <p>Personal information</p>
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
     * {@link ListDataMaskingColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataMaskingColumnsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MaskingStatus")
        private String maskingStatus;

        @com.aliyun.core.annotation.NameInMap("ModelTags")
        private java.util.List<ModelTags> modelTags;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Long productId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelId")
        private Long riskLevelId;

        @com.aliyun.core.annotation.NameInMap("RiskLevelName")
        private String riskLevelName;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Items(Builder builder) {
            this.dataType = builder.dataType;
            this.dbName = builder.dbName;
            this.engineType = builder.engineType;
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.maskingStatus = builder.maskingStatus;
            this.modelTags = builder.modelTags;
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.productId = builder.productId;
            this.regionId = builder.regionId;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.tableName = builder.tableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return engineType
         */
        public String getEngineType() {
            return this.engineType;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return maskingStatus
         */
        public String getMaskingStatus() {
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
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private String dataType; 
            private String dbName; 
            private String engineType; 
            private String errorCode; 
            private String errorMessage; 
            private String id; 
            private String instanceId; 
            private String maskingStatus; 
            private java.util.List<ModelTags> modelTags; 
            private String name; 
            private String productCode; 
            private Long productId; 
            private String regionId; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Long ruleId; 
            private String ruleName; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.dataType = model.dataType;
                this.dbName = model.dbName;
                this.engineType = model.engineType;
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.id = model.id;
                this.instanceId = model.instanceId;
                this.maskingStatus = model.maskingStatus;
                this.modelTags = model.modelTags;
                this.name = model.name;
                this.productCode = model.productCode;
                this.productId = model.productId;
                this.regionId = model.regionId;
                this.riskLevelId = model.riskLevelId;
                this.riskLevelName = model.riskLevelName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.tableName = model.tableName;
            } 

            /**
             * <p>The data type of the database column.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>business_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
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
             * <p>The business error code of the record or operation. It can be empty if no error occurs. Evaluate it together with ErrorMessage.</p>
             * 
             * <strong>example:</strong>
             * <p>data_masking_not_running</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The business error message of the record or operation.</p>
             * 
             * <strong>example:</strong>
             * <p>The instance is not in the running state</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the column record.</p>
             * 
             * <strong>example:</strong>
             * <p>column-example-001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The database instance identity.</p>
             * 
             * <strong>example:</strong>
             * <p>rm-2ze1abcdefgh****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The column encryption status. Valid values: NotEncrypted: not encrypted; Processing: processing; Success: encrypted successfully; Failed: encryption failed; Deleting: disabling; DeleteFailed: disabling failed.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder maskingStatus(String maskingStatus) {
                this.maskingStatus = maskingStatus;
                return this;
            }

            /**
             * <p>The list of matched model tags.</p>
             */
            public Builder modelTags(java.util.List<ModelTags> modelTags) {
                this.modelTags = modelTags;
                return this;
            }

            /**
             * <p>The name of the data column.</p>
             * 
             * <strong>example:</strong>
             * <p>phone</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The code of the cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>RDS</p>
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * <p>The ID of the cloud service type. Valid values: 5: RDS; 8: POLARDB; 27: PolarDBX2.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder productId(Long productId) {
                this.productId = productId;
                return this;
            }

            /**
             * <p>The ID of the region where the asset is located.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the sensitivity level.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * <p>The name of the sensitivity level.</p>
             * 
             * <strong>example:</strong>
             * <p>S2</p>
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * <p>The ID of the matched detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The name of the matched detection rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Mobile phone number</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The name of the table.</p>
             * 
             * <strong>example:</strong>
             * <p>customer</p>
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
