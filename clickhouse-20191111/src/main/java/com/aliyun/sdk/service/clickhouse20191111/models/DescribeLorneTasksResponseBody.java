// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneTasksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLorneTasksResponseBody</p>
 */
public class DescribeLorneTasksResponseBody extends TeaModel {
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TaskDetails")
    private java.util.List < TaskDetails> taskDetails;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLorneTasksResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.taskDetails = builder.taskDetails;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLorneTasksResponseBody create() {
        return builder().build();
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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
     * @return taskDetails
     */
    public java.util.List < TaskDetails> getTaskDetails() {
        return this.taskDetails;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private java.util.List < TaskDetails> taskDetails; 
        private Integer totalCount; 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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
         * TaskDetails.
         */
        public Builder taskDetails(java.util.List < TaskDetails> taskDetails) {
            this.taskDetails = taskDetails;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeLorneTasksResponseBody build() {
            return new DescribeLorneTasksResponseBody(this);
        } 

    } 

    public static class TaskDetails extends TeaModel {
        @NameInMap("Checkpoint")
        private String checkpoint;

        @NameInMap("ColumnMapper")
        private String columnMapper;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("SinkInstance")
        private String sinkInstance;

        @NameInMap("SinkRegion")
        private String sinkRegion;

        @NameInMap("SinkSchema")
        private String sinkSchema;

        @NameInMap("SinkTable")
        private String sinkTable;

        @NameInMap("SinkType")
        private String sinkType;

        @NameInMap("SinkUser")
        private String sinkUser;

        @NameInMap("SinkVpcId")
        private String sinkVpcId;

        @NameInMap("SourceProject")
        private String sourceProject;

        @NameInMap("SourceRegion")
        private String sourceRegion;

        @NameInMap("SourceTopic")
        private String sourceTopic;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("State")
        private String state;

        @NameInMap("Strict")
        private String strict;

        private TaskDetails(Builder builder) {
            this.checkpoint = builder.checkpoint;
            this.columnMapper = builder.columnMapper;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.message = builder.message;
            this.name = builder.name;
            this.sinkInstance = builder.sinkInstance;
            this.sinkRegion = builder.sinkRegion;
            this.sinkSchema = builder.sinkSchema;
            this.sinkTable = builder.sinkTable;
            this.sinkType = builder.sinkType;
            this.sinkUser = builder.sinkUser;
            this.sinkVpcId = builder.sinkVpcId;
            this.sourceProject = builder.sourceProject;
            this.sourceRegion = builder.sourceRegion;
            this.sourceTopic = builder.sourceTopic;
            this.sourceType = builder.sourceType;
            this.state = builder.state;
            this.strict = builder.strict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskDetails create() {
            return builder().build();
        }

        /**
         * @return checkpoint
         */
        public String getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return columnMapper
         */
        public String getColumnMapper() {
            return this.columnMapper;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sinkInstance
         */
        public String getSinkInstance() {
            return this.sinkInstance;
        }

        /**
         * @return sinkRegion
         */
        public String getSinkRegion() {
            return this.sinkRegion;
        }

        /**
         * @return sinkSchema
         */
        public String getSinkSchema() {
            return this.sinkSchema;
        }

        /**
         * @return sinkTable
         */
        public String getSinkTable() {
            return this.sinkTable;
        }

        /**
         * @return sinkType
         */
        public String getSinkType() {
            return this.sinkType;
        }

        /**
         * @return sinkUser
         */
        public String getSinkUser() {
            return this.sinkUser;
        }

        /**
         * @return sinkVpcId
         */
        public String getSinkVpcId() {
            return this.sinkVpcId;
        }

        /**
         * @return sourceProject
         */
        public String getSourceProject() {
            return this.sourceProject;
        }

        /**
         * @return sourceRegion
         */
        public String getSourceRegion() {
            return this.sourceRegion;
        }

        /**
         * @return sourceTopic
         */
        public String getSourceTopic() {
            return this.sourceTopic;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return strict
         */
        public String getStrict() {
            return this.strict;
        }

        public static final class Builder {
            private String checkpoint; 
            private String columnMapper; 
            private String createTime; 
            private String description; 
            private String id; 
            private String message; 
            private String name; 
            private String sinkInstance; 
            private String sinkRegion; 
            private String sinkSchema; 
            private String sinkTable; 
            private String sinkType; 
            private String sinkUser; 
            private String sinkVpcId; 
            private String sourceProject; 
            private String sourceRegion; 
            private String sourceTopic; 
            private String sourceType; 
            private String state; 
            private String strict; 

            /**
             * Checkpoint.
             */
            public Builder checkpoint(String checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * ColumnMapper.
             */
            public Builder columnMapper(String columnMapper) {
                this.columnMapper = columnMapper;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * SinkInstance.
             */
            public Builder sinkInstance(String sinkInstance) {
                this.sinkInstance = sinkInstance;
                return this;
            }

            /**
             * SinkRegion.
             */
            public Builder sinkRegion(String sinkRegion) {
                this.sinkRegion = sinkRegion;
                return this;
            }

            /**
             * SinkSchema.
             */
            public Builder sinkSchema(String sinkSchema) {
                this.sinkSchema = sinkSchema;
                return this;
            }

            /**
             * SinkTable.
             */
            public Builder sinkTable(String sinkTable) {
                this.sinkTable = sinkTable;
                return this;
            }

            /**
             * SinkType.
             */
            public Builder sinkType(String sinkType) {
                this.sinkType = sinkType;
                return this;
            }

            /**
             * SinkUser.
             */
            public Builder sinkUser(String sinkUser) {
                this.sinkUser = sinkUser;
                return this;
            }

            /**
             * SinkVpcId.
             */
            public Builder sinkVpcId(String sinkVpcId) {
                this.sinkVpcId = sinkVpcId;
                return this;
            }

            /**
             * SourceProject.
             */
            public Builder sourceProject(String sourceProject) {
                this.sourceProject = sourceProject;
                return this;
            }

            /**
             * SourceRegion.
             */
            public Builder sourceRegion(String sourceRegion) {
                this.sourceRegion = sourceRegion;
                return this;
            }

            /**
             * SourceTopic.
             */
            public Builder sourceTopic(String sourceTopic) {
                this.sourceTopic = sourceTopic;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Strict.
             */
            public Builder strict(String strict) {
                this.strict = strict;
                return this;
            }

            public TaskDetails build() {
                return new TaskDetails(this);
            } 

        } 

    }
}
