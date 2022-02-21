// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPipelineConfigurationResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelineConfigurationResponseBody</p>
 */
public class ListPipelineConfigurationResponseBody extends TeaModel {
    @NameInMap("Headers")
    private Headers headers;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private ListPipelineConfigurationResponseBody(Builder builder) {
        this.headers = builder.headers;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineConfigurationResponseBody create() {
        return builder().build();
    }

    /**
     * @return headers
     */
    public Headers getHeaders() {
        return this.headers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private Headers headers; 
        private String requestId; 
        private Result result; 

        /**
         * Headers.
         */
        public Builder headers(Headers headers) {
            this.headers = headers;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public ListPipelineConfigurationResponseBody build() {
            return new ListPipelineConfigurationResponseBody(this);
        } 

    } 

    public static class Headers extends TeaModel {
        @NameInMap("XTotalCount")
        private Integer XTotalCount;

        private Headers(Builder builder) {
            this.XTotalCount = builder.XTotalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return XTotalCount
         */
        public Integer getXTotalCount() {
            return this.XTotalCount;
        }

        public static final class Builder {
            private Integer XTotalCount; 

            /**
             * XTotalCount.
             */
            public Builder XTotalCount(Integer XTotalCount) {
                this.XTotalCount = XTotalCount;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class Fields extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Primary")
        private Boolean primary;

        @NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.name = builder.name;
            this.primary = builder.primary;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return primary
         */
        public Boolean getPrimary() {
            return this.primary;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private Boolean primary; 
            private String type; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Primary.
             */
            public Builder primary(Boolean primary) {
                this.primary = primary;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
    public static class ResultFields extends TeaModel {
        @NameInMap("Fields")
        private java.util.List < Fields> fields;

        private ResultFields(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultFields create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public java.util.List < Fields> getFields() {
            return this.fields;
        }

        public static final class Builder {
            private java.util.List < Fields> fields; 

            /**
             * Fields.
             */
            public Builder fields(java.util.List < Fields> fields) {
                this.fields = fields;
                return this;
            }

            public ResultFields build() {
                return new ResultFields(this);
            } 

        } 

    }
    public static class Target extends TeaModel {
        @NameInMap("AccessId")
        private String accessId;

        @NameInMap("DbName")
        private String dbName;

        @NameInMap("Mapping")
        private String mapping;

        @NameInMap("NewIndex")
        private Boolean newIndex;

        @NameInMap("Setting")
        private String setting;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("TargetType")
        private String targetType;

        @NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.accessId = builder.accessId;
            this.dbName = builder.dbName;
            this.mapping = builder.mapping;
            this.newIndex = builder.newIndex;
            this.setting = builder.setting;
            this.tableName = builder.tableName;
            this.targetType = builder.targetType;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public String getAccessId() {
            return this.accessId;
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return mapping
         */
        public String getMapping() {
            return this.mapping;
        }

        /**
         * @return newIndex
         */
        public Boolean getNewIndex() {
            return this.newIndex;
        }

        /**
         * @return setting
         */
        public String getSetting() {
            return this.setting;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return targetType
         */
        public String getTargetType() {
            return this.targetType;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessId; 
            private String dbName; 
            private String mapping; 
            private Boolean newIndex; 
            private String setting; 
            private String tableName; 
            private String targetType; 
            private String type; 

            /**
             * AccessId.
             */
            public Builder accessId(String accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * DbName.
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * Mapping.
             */
            public Builder mapping(String mapping) {
                this.mapping = mapping;
                return this;
            }

            /**
             * NewIndex.
             */
            public Builder newIndex(Boolean newIndex) {
                this.newIndex = newIndex;
                return this;
            }

            /**
             * Setting.
             */
            public Builder setting(String setting) {
                this.setting = setting;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * TargetType.
             */
            public Builder targetType(String targetType) {
                this.targetType = targetType;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    public static class ResultResult extends TeaModel {
        @NameInMap("ComputeUnit")
        private Integer computeUnit;

        @NameInMap("DataSourceId")
        private String dataSourceId;

        @NameInMap("Fields")
        private ResultFields fields;

        @NameInMap("Id")
        private String id;

        @NameInMap("Name")
        private String name;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Partition")
        private String partition;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("ProjectId")
        private String projectId;

        @NameInMap("Status")
        private String status;

        @NameInMap("TableName")
        private String tableName;

        @NameInMap("Target")
        private Target target;

        @NameInMap("Type")
        private String type;

        private ResultResult(Builder builder) {
            this.computeUnit = builder.computeUnit;
            this.dataSourceId = builder.dataSourceId;
            this.fields = builder.fields;
            this.id = builder.id;
            this.name = builder.name;
            this.ownerId = builder.ownerId;
            this.partition = builder.partition;
            this.pipelineId = builder.pipelineId;
            this.projectId = builder.projectId;
            this.status = builder.status;
            this.tableName = builder.tableName;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultResult create() {
            return builder().build();
        }

        /**
         * @return computeUnit
         */
        public Integer getComputeUnit() {
            return this.computeUnit;
        }

        /**
         * @return dataSourceId
         */
        public String getDataSourceId() {
            return this.dataSourceId;
        }

        /**
         * @return fields
         */
        public ResultFields getFields() {
            return this.fields;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return partition
         */
        public String getPartition() {
            return this.partition;
        }

        /**
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tableName
         */
        public String getTableName() {
            return this.tableName;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer computeUnit; 
            private String dataSourceId; 
            private ResultFields fields; 
            private String id; 
            private String name; 
            private String ownerId; 
            private String partition; 
            private String pipelineId; 
            private String projectId; 
            private String status; 
            private String tableName; 
            private Target target; 
            private String type; 

            /**
             * ComputeUnit.
             */
            public Builder computeUnit(Integer computeUnit) {
                this.computeUnit = computeUnit;
                return this;
            }

            /**
             * DataSourceId.
             */
            public Builder dataSourceId(String dataSourceId) {
                this.dataSourceId = dataSourceId;
                return this;
            }

            /**
             * Fields.
             */
            public Builder fields(ResultFields fields) {
                this.fields = fields;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Partition.
             */
            public Builder partition(String partition) {
                this.partition = partition;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TableName.
             */
            public Builder tableName(String tableName) {
                this.tableName = tableName;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultResult build() {
                return new ResultResult(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Result")
        private java.util.List < ResultResult> result;

        private Result(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List < ResultResult> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List < ResultResult> result; 

            /**
             * Result.
             */
            public Builder result(java.util.List < ResultResult> result) {
                this.result = result;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
