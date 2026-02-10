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
 * {@link StartRtcCloudTranscodeRequest} extends {@link RequestModel}
 *
 * <p>StartRtcCloudTranscodeRequest</p>
 */
public class StartRtcCloudTranscodeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private InputParam inputParam;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxIdleTime")
    private Long maxIdleTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputParams")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OutputParams> outputParams;

    private StartRtcCloudTranscodeRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.inputParam = builder.inputParam;
        this.maxIdleTime = builder.maxIdleTime;
        this.outputParams = builder.outputParams;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartRtcCloudTranscodeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<StartRtcCloudTranscodeRequest, Builder> {
        private String appId; 
        private String channelId; 
        private InputParam inputParam; 
        private Long maxIdleTime; 
        private java.util.List<OutputParams> outputParams; 

        private Builder() {
            super();
        } 

        private Builder(StartRtcCloudTranscodeRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.inputParam = request.inputParam;
            this.maxIdleTime = request.maxIdleTime;
            this.outputParams = request.outputParams;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>********-7074-<strong><strong>-9ef5-85c19a4</strong></strong>*</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myChannel</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputParam(InputParam inputParam) {
            String inputParamShrink = shrink(inputParam, "InputParam", "json");
            this.putQueryParameter("InputParam", inputParamShrink);
            this.inputParam = inputParam;
            return this;
        }

        /**
         * MaxIdleTime.
         */
        public Builder maxIdleTime(Long maxIdleTime) {
            this.putQueryParameter("MaxIdleTime", maxIdleTime);
            this.maxIdleTime = maxIdleTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder outputParams(java.util.List<OutputParams> outputParams) {
            String outputParamsShrink = shrink(outputParams, "OutputParams", "json");
            this.putQueryParameter("OutputParams", outputParamsShrink);
            this.outputParams = outputParams;
            return this;
        }

        @Override
        public StartRtcCloudTranscodeRequest build() {
            return new StartRtcCloudTranscodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link StartRtcCloudTranscodeRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudTranscodeRequest</p>
     */
    public static class SingleSubUserParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SourceType")
        private Long sourceType;

        @com.aliyun.core.annotation.NameInMap("StreamType")
        private Long streamType;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>userA</p>
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
     * {@link StartRtcCloudTranscodeRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudTranscodeRequest</p>
     */
    public static class InputParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SingleSubUserParam")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
     * {@link StartRtcCloudTranscodeRequest} extends {@link TeaModel}
     *
     * <p>StartRtcCloudTranscodeRequest</p>
     */
    public static class OutputParams extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("TranscodeTemplate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String transcodeTemplate;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserToken")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>myChannel</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>lhd</p>
             */
            public Builder transcodeTemplate(String transcodeTemplate) {
                this.transcodeTemplate = transcodeTemplate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>userA_360p</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>eyJhcHBpZCI********</p>
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
}
