// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPrecisionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrecisionTaskResponseBody</p>
 */
public class ListPrecisionTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Count")
    private Integer count;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListPrecisionTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.count = builder.count;
        this.data = builder.data;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrecisionTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer count; 
        private Data data; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPrecisionTaskResponseBody build() {
            return new ListPrecisionTaskResponseBody(this);
        } 

    } 

    public static class Precision extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ModelId")
        private Long modelId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("Precision")
        private Float precision;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        private Precision(Builder builder) {
            this.createTime = builder.createTime;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.precision = builder.precision;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Precision create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return modelId
         */
        public Long getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return precision
         */
        public Float getPrecision() {
            return this.precision;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String createTime; 
            private Long modelId; 
            private String modelName; 
            private Float precision; 
            private Integer status; 
            private String taskId; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(Long modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * Precision.
             */
            public Builder precision(Float precision) {
                this.precision = precision;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Precision build() {
                return new Precision(this);
            } 

        } 

    }
    public static class Precisions extends TeaModel {
        @NameInMap("Precision")
        private java.util.List < Precision> precision;

        private Precisions(Builder builder) {
            this.precision = builder.precision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Precisions create() {
            return builder().build();
        }

        /**
         * @return precision
         */
        public java.util.List < Precision> getPrecision() {
            return this.precision;
        }

        public static final class Builder {
            private java.util.List < Precision> precision; 

            /**
             * Precision.
             */
            public Builder precision(java.util.List < Precision> precision) {
                this.precision = precision;
                return this;
            }

            public Precisions build() {
                return new Precisions(this);
            } 

        } 

    }
    public static class PrecisionTask extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataSetId")
        private Long dataSetId;

        @NameInMap("DataSetName")
        private String dataSetName;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("IncorrectWords")
        private Integer incorrectWords;

        @NameInMap("Name")
        private String name;

        @NameInMap("Precisions")
        private Precisions precisions;

        @NameInMap("Source")
        private Integer source;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TotalCount")
        private Integer totalCount;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("VerifiedCount")
        private Integer verifiedCount;

        private PrecisionTask(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSetId = builder.dataSetId;
            this.dataSetName = builder.dataSetName;
            this.duration = builder.duration;
            this.incorrectWords = builder.incorrectWords;
            this.name = builder.name;
            this.precisions = builder.precisions;
            this.source = builder.source;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.totalCount = builder.totalCount;
            this.updateTime = builder.updateTime;
            this.verifiedCount = builder.verifiedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecisionTask create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSetId
         */
        public Long getDataSetId() {
            return this.dataSetId;
        }

        /**
         * @return dataSetName
         */
        public String getDataSetName() {
            return this.dataSetName;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return incorrectWords
         */
        public Integer getIncorrectWords() {
            return this.incorrectWords;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return precisions
         */
        public Precisions getPrecisions() {
            return this.precisions;
        }

        /**
         * @return source
         */
        public Integer getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return verifiedCount
         */
        public Integer getVerifiedCount() {
            return this.verifiedCount;
        }

        public static final class Builder {
            private String createTime; 
            private Long dataSetId; 
            private String dataSetName; 
            private Integer duration; 
            private Integer incorrectWords; 
            private String name; 
            private Precisions precisions; 
            private Integer source; 
            private Integer status; 
            private String taskId; 
            private Integer totalCount; 
            private String updateTime; 
            private Integer verifiedCount; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataSetId.
             */
            public Builder dataSetId(Long dataSetId) {
                this.dataSetId = dataSetId;
                return this;
            }

            /**
             * DataSetName.
             */
            public Builder dataSetName(String dataSetName) {
                this.dataSetName = dataSetName;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * IncorrectWords.
             */
            public Builder incorrectWords(Integer incorrectWords) {
                this.incorrectWords = incorrectWords;
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
             * Precisions.
             */
            public Builder precisions(Precisions precisions) {
                this.precisions = precisions;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(Integer source) {
                this.source = source;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * VerifiedCount.
             */
            public Builder verifiedCount(Integer verifiedCount) {
                this.verifiedCount = verifiedCount;
                return this;
            }

            public PrecisionTask build() {
                return new PrecisionTask(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("PrecisionTask")
        private java.util.List < PrecisionTask> precisionTask;

        private Data(Builder builder) {
            this.precisionTask = builder.precisionTask;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return precisionTask
         */
        public java.util.List < PrecisionTask> getPrecisionTask() {
            return this.precisionTask;
        }

        public static final class Builder {
            private java.util.List < PrecisionTask> precisionTask; 

            /**
             * PrecisionTask.
             */
            public Builder precisionTask(java.util.List < PrecisionTask> precisionTask) {
                this.precisionTask = precisionTask;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
