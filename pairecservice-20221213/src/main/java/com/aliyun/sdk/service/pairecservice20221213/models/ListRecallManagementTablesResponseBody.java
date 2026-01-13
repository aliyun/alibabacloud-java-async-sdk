// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListRecallManagementTablesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRecallManagementTablesResponseBody</p>
 */
public class ListRecallManagementTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RecallManagementTables")
    private java.util.List<RecallManagementTables> recallManagementTables;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListRecallManagementTablesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.recallManagementTables = builder.recallManagementTables;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecallManagementTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return recallManagementTables
     */
    public java.util.List<RecallManagementTables> getRecallManagementTables() {
        return this.recallManagementTables;
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
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<RecallManagementTables> recallManagementTables; 
        private String requestId; 
        private String totalCount; 

        private Builder() {
        } 

        private Builder(ListRecallManagementTablesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.recallManagementTables = model.recallManagementTables;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RecallManagementTables.
         */
        public Builder recallManagementTables(java.util.List<RecallManagementTables> recallManagementTables) {
            this.recallManagementTables = recallManagementTables;
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
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRecallManagementTablesResponseBody build() {
            return new ListRecallManagementTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListRecallManagementTablesResponseBody} extends {@link TeaModel}
     *
     * <p>ListRecallManagementTablesResponseBody</p>
     */
    public static class RecallManagementTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanDelete")
        private Boolean canDelete;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private String dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
        private String gmtModifiedTime;

        @com.aliyun.core.annotation.NameInMap("IndexEffectiveTime")
        private String indexEffectiveTime;

        @com.aliyun.core.annotation.NameInMap("IndexVersionId")
        private String indexVersionId;

        @com.aliyun.core.annotation.NameInMap("MaxcomputeProjectName")
        private String maxcomputeProjectName;

        @com.aliyun.core.annotation.NameInMap("MaxcomputeSchema")
        private String maxcomputeSchema;

        @com.aliyun.core.annotation.NameInMap("MaxcomputeTableName")
        private String maxcomputeTableName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PartitionFields")
        private String partitionFields;

        @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
        private String recallManagementTableId;

        @com.aliyun.core.annotation.NameInMap("RecallType")
        private String recallType;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecallManagementTables(Builder builder) {
            this.canDelete = builder.canDelete;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.gmtModifiedTime = builder.gmtModifiedTime;
            this.indexEffectiveTime = builder.indexEffectiveTime;
            this.indexVersionId = builder.indexVersionId;
            this.maxcomputeProjectName = builder.maxcomputeProjectName;
            this.maxcomputeSchema = builder.maxcomputeSchema;
            this.maxcomputeTableName = builder.maxcomputeTableName;
            this.name = builder.name;
            this.partitionFields = builder.partitionFields;
            this.recallManagementTableId = builder.recallManagementTableId;
            this.recallType = builder.recallType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecallManagementTables create() {
            return builder().build();
        }

        /**
         * @return canDelete
         */
        public Boolean getCanDelete() {
            return this.canDelete;
        }

        /**
         * @return dataSource
         */
        public String getDataSource() {
            return this.dataSource;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return gmtModifiedTime
         */
        public String getGmtModifiedTime() {
            return this.gmtModifiedTime;
        }

        /**
         * @return indexEffectiveTime
         */
        public String getIndexEffectiveTime() {
            return this.indexEffectiveTime;
        }

        /**
         * @return indexVersionId
         */
        public String getIndexVersionId() {
            return this.indexVersionId;
        }

        /**
         * @return maxcomputeProjectName
         */
        public String getMaxcomputeProjectName() {
            return this.maxcomputeProjectName;
        }

        /**
         * @return maxcomputeSchema
         */
        public String getMaxcomputeSchema() {
            return this.maxcomputeSchema;
        }

        /**
         * @return maxcomputeTableName
         */
        public String getMaxcomputeTableName() {
            return this.maxcomputeTableName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return partitionFields
         */
        public String getPartitionFields() {
            return this.partitionFields;
        }

        /**
         * @return recallManagementTableId
         */
        public String getRecallManagementTableId() {
            return this.recallManagementTableId;
        }

        /**
         * @return recallType
         */
        public String getRecallType() {
            return this.recallType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean canDelete; 
            private String dataSource; 
            private String description; 
            private String gmtCreateTime; 
            private String gmtModifiedTime; 
            private String indexEffectiveTime; 
            private String indexVersionId; 
            private String maxcomputeProjectName; 
            private String maxcomputeSchema; 
            private String maxcomputeTableName; 
            private String name; 
            private String partitionFields; 
            private String recallManagementTableId; 
            private String recallType; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecallManagementTables model) {
                this.canDelete = model.canDelete;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.gmtCreateTime = model.gmtCreateTime;
                this.gmtModifiedTime = model.gmtModifiedTime;
                this.indexEffectiveTime = model.indexEffectiveTime;
                this.indexVersionId = model.indexVersionId;
                this.maxcomputeProjectName = model.maxcomputeProjectName;
                this.maxcomputeSchema = model.maxcomputeSchema;
                this.maxcomputeTableName = model.maxcomputeTableName;
                this.name = model.name;
                this.partitionFields = model.partitionFields;
                this.recallManagementTableId = model.recallManagementTableId;
                this.recallType = model.recallType;
                this.type = model.type;
            } 

            /**
             * CanDelete.
             */
            public Builder canDelete(Boolean canDelete) {
                this.canDelete = canDelete;
                return this;
            }

            /**
             * DataSource.
             */
            public Builder dataSource(String dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * GmtModifiedTime.
             */
            public Builder gmtModifiedTime(String gmtModifiedTime) {
                this.gmtModifiedTime = gmtModifiedTime;
                return this;
            }

            /**
             * IndexEffectiveTime.
             */
            public Builder indexEffectiveTime(String indexEffectiveTime) {
                this.indexEffectiveTime = indexEffectiveTime;
                return this;
            }

            /**
             * IndexVersionId.
             */
            public Builder indexVersionId(String indexVersionId) {
                this.indexVersionId = indexVersionId;
                return this;
            }

            /**
             * MaxcomputeProjectName.
             */
            public Builder maxcomputeProjectName(String maxcomputeProjectName) {
                this.maxcomputeProjectName = maxcomputeProjectName;
                return this;
            }

            /**
             * <p>maxcompute schema。</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder maxcomputeSchema(String maxcomputeSchema) {
                this.maxcomputeSchema = maxcomputeSchema;
                return this;
            }

            /**
             * MaxcomputeTableName.
             */
            public Builder maxcomputeTableName(String maxcomputeTableName) {
                this.maxcomputeTableName = maxcomputeTableName;
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
             * PartitionFields.
             */
            public Builder partitionFields(String partitionFields) {
                this.partitionFields = partitionFields;
                return this;
            }

            /**
             * RecallManagementTableId.
             */
            public Builder recallManagementTableId(String recallManagementTableId) {
                this.recallManagementTableId = recallManagementTableId;
                return this;
            }

            /**
             * RecallType.
             */
            public Builder recallType(String recallType) {
                this.recallType = recallType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecallManagementTables build() {
                return new RecallManagementTables(this);
            } 

        } 

    }
}
