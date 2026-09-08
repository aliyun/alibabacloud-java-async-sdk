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
 * {@link ListColumnsResponseBody} extends {@link TeaModel}
 *
 * <p>ListColumnsResponseBody</p>
 */
public class ListColumnsResponseBody extends TeaModel {
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

    private ListColumnsResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListColumnsResponseBody create() {
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

        private Builder(ListColumnsResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListColumnsResponseBody build() {
            return new ListColumnsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListColumnsResponseBody} extends {@link TeaModel}
     *
     * <p>ListColumnsResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private Long creationTime;

        @com.aliyun.core.annotation.NameInMap("DataAssetSourceId")
        private String dataAssetSourceId;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("EngineType")
        private String engineType;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        @com.aliyun.core.annotation.NameInMap("MaskingStatus")
        private Integer maskingStatus;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductCode")
        private String productCode;

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

        @com.aliyun.core.annotation.NameInMap("SchemaName")
        private String schemaName;

        @com.aliyun.core.annotation.NameInMap("Sensitive")
        private Boolean sensitive;

        @com.aliyun.core.annotation.NameInMap("TableName")
        private String tableName;

        private Items(Builder builder) {
            this.creationTime = builder.creationTime;
            this.dataAssetSourceId = builder.dataAssetSourceId;
            this.dataSourceName = builder.dataSourceName;
            this.dataType = builder.dataType;
            this.engineType = builder.engineType;
            this.instanceName = builder.instanceName;
            this.maskingStatus = builder.maskingStatus;
            this.name = builder.name;
            this.productCode = builder.productCode;
            this.regionId = builder.regionId;
            this.revisionId = builder.revisionId;
            this.revisionStatus = builder.revisionStatus;
            this.riskLevelId = builder.riskLevelId;
            this.riskLevelName = builder.riskLevelName;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.schemaName = builder.schemaName;
            this.sensitive = builder.sensitive;
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
         * @return dataAssetSourceId
         */
        public String getDataAssetSourceId() {
            return this.dataAssetSourceId;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
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
         * @return schemaName
         */
        public String getSchemaName() {
            return this.schemaName;
        }

        /**
         * @return sensitive
         */
        public Boolean getSensitive() {
            return this.sensitive;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        public static final class Builder {
            private Long creationTime; 
            private String dataAssetSourceId; 
            private String dataSourceName; 
            private String dataType; 
            private String engineType; 
            private String instanceName; 
            private Integer maskingStatus; 
            private String name; 
            private String productCode; 
            private String regionId; 
            private Long revisionId; 
            private Long revisionStatus; 
            private Long riskLevelId; 
            private String riskLevelName; 
            private Long ruleId; 
            private String ruleName; 
            private String schemaName; 
            private Boolean sensitive; 
            private String tableName; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.creationTime = model.creationTime;
                this.dataAssetSourceId = model.dataAssetSourceId;
                this.dataSourceName = model.dataSourceName;
                this.dataType = model.dataType;
                this.engineType = model.engineType;
                this.instanceName = model.instanceName;
                this.maskingStatus = model.maskingStatus;
                this.name = model.name;
                this.productCode = model.productCode;
                this.regionId = model.regionId;
                this.revisionId = model.revisionId;
                this.revisionStatus = model.revisionStatus;
                this.riskLevelId = model.riskLevelId;
                this.riskLevelName = model.riskLevelName;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.schemaName = model.schemaName;
                this.sensitive = model.sensitive;
                this.tableName = model.tableName;
            } 

            /**
             * CreationTime.
             */
            public Builder creationTime(Long creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * DataAssetSourceId.
             */
            public Builder dataAssetSourceId(String dataAssetSourceId) {
                this.dataAssetSourceId = dataAssetSourceId;
                return this;
            }

            /**
             * DataSourceName.
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * EngineType.
             */
            public Builder engineType(String engineType) {
                this.engineType = engineType;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * MaskingStatus.
             */
            public Builder maskingStatus(Integer maskingStatus) {
                this.maskingStatus = maskingStatus;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProductCode.
             */
            public Builder productCode(String productCode) {
                this.productCode = productCode;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RevisionId.
             */
            public Builder revisionId(Long revisionId) {
                this.revisionId = revisionId;
                return this;
            }

            /**
             * RevisionStatus.
             */
            public Builder revisionStatus(Long revisionStatus) {
                this.revisionStatus = revisionStatus;
                return this;
            }

            /**
             * RiskLevelId.
             */
            public Builder riskLevelId(Long riskLevelId) {
                this.riskLevelId = riskLevelId;
                return this;
            }

            /**
             * RiskLevelName.
             */
            public Builder riskLevelName(String riskLevelName) {
                this.riskLevelName = riskLevelName;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SchemaName.
             */
            public Builder schemaName(String schemaName) {
                this.schemaName = schemaName;
                return this;
            }

            /**
             * Sensitive.
             */
            public Builder sensitive(Boolean sensitive) {
                this.sensitive = sensitive;
                return this;
            }

            /**
             * TableName.
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
