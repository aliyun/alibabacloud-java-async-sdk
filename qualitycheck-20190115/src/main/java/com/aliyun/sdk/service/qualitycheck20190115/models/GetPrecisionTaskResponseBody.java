// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

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
 * {@link GetPrecisionTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetPrecisionTaskResponseBody</p>
 */
public class GetPrecisionTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPrecisionTaskResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPrecisionTaskResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPrecisionTaskResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        public GetPrecisionTaskResponseBody build() {
            return new GetPrecisionTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPrecisionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrecisionTaskResponseBody</p>
     */
    public static class Precision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelId")
        private Long modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("Precision")
        private Float precision;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Precision(Builder builder) {
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
            private Long modelId; 
            private String modelName; 
            private Float precision; 
            private Integer status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Precision model) {
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.precision = model.precision;
                this.status = model.status;
                this.taskId = model.taskId;
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
    /**
     * 
     * {@link GetPrecisionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrecisionTaskResponseBody</p>
     */
    public static class Precisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Precision")
        private java.util.List<Precision> precision;

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
        public java.util.List<Precision> getPrecision() {
            return this.precision;
        }

        public static final class Builder {
            private java.util.List<Precision> precision; 

            private Builder() {
            } 

            private Builder(Precisions model) {
                this.precision = model.precision;
            } 

            /**
             * Precision.
             */
            public Builder precision(java.util.List<Precision> precision) {
                this.precision = precision;
                return this;
            }

            public Precisions build() {
                return new Precisions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetPrecisionTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetPrecisionTaskResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataSetId")
        private Long dataSetId;

        @com.aliyun.core.annotation.NameInMap("DataSetName")
        private String dataSetName;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("IncorrectWords")
        private Integer incorrectWords;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Precisions")
        private Precisions precisions;

        @com.aliyun.core.annotation.NameInMap("Source")
        private Integer source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("VerifiedCount")
        private Integer verifiedCount;

        private Data(Builder builder) {
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

        public static Data create() {
            return builder().build();
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.dataSetId = model.dataSetId;
                this.dataSetName = model.dataSetName;
                this.duration = model.duration;
                this.incorrectWords = model.incorrectWords;
                this.name = model.name;
                this.precisions = model.precisions;
                this.source = model.source;
                this.status = model.status;
                this.taskId = model.taskId;
                this.totalCount = model.totalCount;
                this.updateTime = model.updateTime;
                this.verifiedCount = model.verifiedCount;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
