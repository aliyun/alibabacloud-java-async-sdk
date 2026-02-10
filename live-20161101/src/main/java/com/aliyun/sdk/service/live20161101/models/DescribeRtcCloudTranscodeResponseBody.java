// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DescribeRtcCloudTranscodeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRtcCloudTranscodeResponseBody</p>
 */
public class DescribeRtcCloudTranscodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TaskInfo")
    private TaskInfo taskInfo;

    private DescribeRtcCloudTranscodeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.taskInfo = builder.taskInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRtcCloudTranscodeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return taskInfo
     */
    public TaskInfo getTaskInfo() {
        return this.taskInfo;
    }

    public static final class Builder {
        private String requestId; 
        private TaskInfo taskInfo; 

        private Builder() {
        } 

        private Builder(DescribeRtcCloudTranscodeResponseBody model) {
            this.requestId = model.requestId;
            this.taskInfo = model.taskInfo;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TaskInfo.
         */
        public Builder taskInfo(TaskInfo taskInfo) {
            this.taskInfo = taskInfo;
            return this;
        }

        public DescribeRtcCloudTranscodeResponseBody build() {
            return new DescribeRtcCloudTranscodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeRtcCloudTranscodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudTranscodeResponseBody</p>
     */
    public static class SingleSubUserParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Long sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Long streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private SingleSubUserParam(Builder builder) {
            this.sourceType = builder.sourceType;
            this.streamType = builder.streamType;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SingleSubUserParam create() {
            return builder().build();
        }

        /**
         * @return sourceType
         */
        public Long getSourceType() {
            return this.sourceType;
        }

        /**
         * @return streamType
         */
        public Long getStreamType() {
            return this.streamType;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long sourceType; 
            private Long streamType; 
            private String userId; 

            private Builder() {
            } 

            private Builder(SingleSubUserParam model) {
                this.sourceType = model.sourceType;
                this.streamType = model.streamType;
                this.userId = model.userId;
            } 

            /**
             * SourceType.
             */
            public Builder sourceType(Long sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * StreamType.
             */
            public Builder streamType(Long streamType) {
                this.streamType = streamType;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public SingleSubUserParam build() {
                return new SingleSubUserParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcCloudTranscodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudTranscodeResponseBody</p>
     */
    public static class InputParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SingleSubUserParam")
        private SingleSubUserParam singleSubUserParam;

        private InputParam(Builder builder) {
            this.singleSubUserParam = builder.singleSubUserParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParam create() {
            return builder().build();
        }

        /**
         * @return singleSubUserParam
         */
        public SingleSubUserParam getSingleSubUserParam() {
            return this.singleSubUserParam;
        }

        public static final class Builder {
            private SingleSubUserParam singleSubUserParam; 

            private Builder() {
            } 

            private Builder(InputParam model) {
                this.singleSubUserParam = model.singleSubUserParam;
            } 

            /**
             * SingleSubUserParam.
             */
            public Builder singleSubUserParam(SingleSubUserParam singleSubUserParam) {
                this.singleSubUserParam = singleSubUserParam;
                return this;
            }

            public InputParam build() {
                return new InputParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcCloudTranscodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudTranscodeResponseBody</p>
     */
    public static class OutputParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplate")
        private String transcodeTemplate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserToken")
        private String userToken;

        private OutputParams(Builder builder) {
            this.channelId = builder.channelId;
            this.transcodeTemplate = builder.transcodeTemplate;
            this.userId = builder.userId;
            this.userToken = builder.userToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputParams create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return transcodeTemplate
         */
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userToken
         */
        public String getUserToken() {
            return this.userToken;
        }

        public static final class Builder {
            private String channelId; 
            private String transcodeTemplate; 
            private String userId; 
            private String userToken; 

            private Builder() {
            } 

            private Builder(OutputParams model) {
                this.channelId = model.channelId;
                this.transcodeTemplate = model.transcodeTemplate;
                this.userId = model.userId;
                this.userToken = model.userToken;
            } 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * TranscodeTemplate.
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserToken.
             */
            public Builder userToken(String userToken) {
                this.userToken = userToken;
                return this;
            }

            public OutputParams build() {
                return new OutputParams(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeRtcCloudTranscodeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeRtcCloudTranscodeResponseBody</p>
     */
    public static class TaskInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("InputParam")
        private InputParam inputParam;

        @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
        private Long maxIdleTime;

        @com.aliyun.core.annotation.NameInMap("OutputParams")
        private java.util.List<OutputParams> outputParams;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private TaskInfo(Builder builder) {
            this.appId = builder.appId;
            this.channelId = builder.channelId;
            this.inputParam = builder.inputParam;
            this.maxIdleTime = builder.maxIdleTime;
            this.outputParams = builder.outputParams;
            this.status = builder.status;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskInfo create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return inputParam
         */
        public InputParam getInputParam() {
            return this.inputParam;
        }

        /**
         * @return maxIdleTime
         */
        public Long getMaxIdleTime() {
            return this.maxIdleTime;
        }

        /**
         * @return outputParams
         */
        public java.util.List<OutputParams> getOutputParams() {
            return this.outputParams;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private String appId; 
            private String channelId; 
            private InputParam inputParam; 
            private Long maxIdleTime; 
            private java.util.List<OutputParams> outputParams; 
            private String status; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(TaskInfo model) {
                this.appId = model.appId;
                this.channelId = model.channelId;
                this.inputParam = model.inputParam;
                this.maxIdleTime = model.maxIdleTime;
                this.outputParams = model.outputParams;
                this.status = model.status;
                this.taskId = model.taskId;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * InputParam.
             */
            public Builder inputParam(InputParam inputParam) {
                this.inputParam = inputParam;
                return this;
            }

            /**
             * MaxIdleTime.
             */
            public Builder maxIdleTime(Long maxIdleTime) {
                this.maxIdleTime = maxIdleTime;
                return this;
            }

            /**
             * OutputParams.
             */
            public Builder outputParams(java.util.List<OutputParams> outputParams) {
                this.outputParams = outputParams;
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
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public TaskInfo build() {
                return new TaskInfo(this);
            } 

        } 

    }
}
