// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTriggerResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTriggerResponseBody</p>
 */
public class DescribeTriggerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private Integer errorCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeTriggerResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTriggerResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeTriggerResponseBody build() {
            return new DescribeTriggerResponseBody(this);
        } 

    } 

    public static class Checkpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCount")
        private Long errorCount;

        @com.aliyun.core.annotation.NameInMap("Height")
        private Long height;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Checkpoint(Builder builder) {
            this.errorCount = builder.errorCount;
            this.height = builder.height;
            this.index = builder.index;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Checkpoint create() {
            return builder().build();
        }

        /**
         * @return errorCount
         */
        public Long getErrorCount() {
            return this.errorCount;
        }

        /**
         * @return height
         */
        public Long getHeight() {
            return this.height;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long errorCount; 
            private Long height; 
            private Long index; 
            private String type; 

            /**
             * ErrorCount.
             */
            public Builder errorCount(Long errorCount) {
                this.errorCount = errorCount;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(Long height) {
                this.height = height;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Checkpoint build() {
                return new Checkpoint(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("Checkpoint")
        private Checkpoint checkpoint;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Options")
        private String options;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.checkpoint = builder.checkpoint;
            this.createTime = builder.createTime;
            this.errorMessage = builder.errorMessage;
            this.name = builder.name;
            this.options = builder.options;
            this.source = builder.source;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return checkpoint
         */
        public Checkpoint getCheckpoint() {
            return this.checkpoint;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return options
         */
        public String getOptions() {
            return this.options;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channelId; 
            private String channelName; 
            private Checkpoint checkpoint; 
            private Long createTime; 
            private String errorMessage; 
            private String name; 
            private String options; 
            private String source; 
            private Integer status; 
            private String type; 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * Checkpoint.
             */
            public Builder checkpoint(Checkpoint checkpoint) {
                this.checkpoint = checkpoint;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * Options.
             */
            public Builder options(String options) {
                this.options = options;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
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
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
