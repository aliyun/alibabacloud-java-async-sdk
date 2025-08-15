// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link UpdateMediaLiveInputRequest} extends {@link RequestModel}
 *
 * <p>UpdateMediaLiveInputRequest</p>
 */
public class UpdateMediaLiveInputRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String inputId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<InputSettings> inputSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List<String> securityGroupIds;

    private UpdateMediaLiveInputRequest(Builder builder) {
        super(builder);
        this.inputId = builder.inputId;
        this.inputSettings = builder.inputSettings;
        this.name = builder.name;
        this.securityGroupIds = builder.securityGroupIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMediaLiveInputRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inputId
     */
    public String getInputId() {
        return this.inputId;
    }

    /**
     * @return inputSettings
     */
    public java.util.List<InputSettings> getInputSettings() {
        return this.inputSettings;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return securityGroupIds
     */
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public static final class Builder extends Request.Builder<UpdateMediaLiveInputRequest, Builder> {
        private String inputId; 
        private java.util.List<InputSettings> inputSettings; 
        private String name; 
        private java.util.List<String> securityGroupIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMediaLiveInputRequest request) {
            super(request);
            this.inputId = request.inputId;
            this.inputSettings = request.inputSettings;
            this.name = request.name;
            this.securityGroupIds = request.securityGroupIds;
        } 

        /**
         * <p>The ID of the input.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SEGK5KA6KYKAWQQH</p>
         */
        public Builder inputId(String inputId) {
            this.putBodyParameter("InputId", inputId);
            this.inputId = inputId;
            return this;
        }

        /**
         * <p>The input settings. An input can have up to two sources: primary and backup sources.</p>
         * <p>This parameter is required.</p>
         */
        public Builder inputSettings(java.util.List<InputSettings> inputSettings) {
            String inputSettingsShrink = shrink(inputSettings, "InputSettings", "json");
            this.putQueryParameter("InputSettings", inputSettingsShrink);
            this.inputSettings = inputSettings;
            return this;
        }

        /**
         * <p>The name of the input. Letters, digits, hyphens (-), and underscores (_) are supported. It can be up to 64 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>myinput</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The IDs of the security groups to be associated with the input. This parameter is required for PUSH inputs.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;G6G4X5T4SZYPSTT5&quot;]</p>
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            String securityGroupIdsShrink = shrink(securityGroupIds, "SecurityGroupIds", "json");
            this.putQueryParameter("SecurityGroupIds", securityGroupIdsShrink);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        @Override
        public UpdateMediaLiveInputRequest build() {
            return new UpdateMediaLiveInputRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateMediaLiveInputRequest} extends {@link TeaModel}
     *
     * <p>UpdateMediaLiveInputRequest</p>
     */
    public static class InputSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowOutputName")
        private String flowOutputName;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("SrtLatency")
        private Integer srtLatency;

        @com.aliyun.core.annotation.NameInMap("SrtMaxBitrate")
        private Integer srtMaxBitrate;

        @com.aliyun.core.annotation.NameInMap("SrtPassphrase")
        private String srtPassphrase;

        @com.aliyun.core.annotation.NameInMap("SrtPbKeyLen")
        private Integer srtPbKeyLen;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private InputSettings(Builder builder) {
            this.flowId = builder.flowId;
            this.flowOutputName = builder.flowOutputName;
            this.sourceUrl = builder.sourceUrl;
            this.srtLatency = builder.srtLatency;
            this.srtMaxBitrate = builder.srtMaxBitrate;
            this.srtPassphrase = builder.srtPassphrase;
            this.srtPbKeyLen = builder.srtPbKeyLen;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputSettings create() {
            return builder().build();
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowOutputName
         */
        public String getFlowOutputName() {
            return this.flowOutputName;
        }

        /**
         * @return sourceUrl
         */
        public String getSourceUrl() {
            return this.sourceUrl;
        }

        /**
         * @return srtLatency
         */
        public Integer getSrtLatency() {
            return this.srtLatency;
        }

        /**
         * @return srtMaxBitrate
         */
        public Integer getSrtMaxBitrate() {
            return this.srtMaxBitrate;
        }

        /**
         * @return srtPassphrase
         */
        public String getSrtPassphrase() {
            return this.srtPassphrase;
        }

        /**
         * @return srtPbKeyLen
         */
        public Integer getSrtPbKeyLen() {
            return this.srtPbKeyLen;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String flowId; 
            private String flowOutputName; 
            private String sourceUrl; 
            private Integer srtLatency; 
            private Integer srtMaxBitrate; 
            private String srtPassphrase; 
            private Integer srtPbKeyLen; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(InputSettings model) {
                this.flowId = model.flowId;
                this.flowOutputName = model.flowOutputName;
                this.sourceUrl = model.sourceUrl;
                this.srtLatency = model.srtLatency;
                this.srtMaxBitrate = model.srtMaxBitrate;
                this.srtPassphrase = model.srtPassphrase;
                this.srtPbKeyLen = model.srtPbKeyLen;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The ID of the flow from MediaConnect. This parameter is required when Type is set to MEDIA_CONNECT.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>81-9693-40dc-bbab-db5e49</strong></strong></strong></p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The output name of the MediaConnect flow. This parameter is required when Type is set to MEDIA_CONNECT.</p>
             * 
             * <strong>example:</strong>
             * <p>myFlowOutputName</p>
             */
            public Builder flowOutputName(String flowOutputName) {
                this.flowOutputName = flowOutputName;
                return this;
            }

            /**
             * <p>The source URL from which the stream is pulled. This parameter is required for PULL inputs.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://domain/app/stream</p>
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * SrtLatency.
             */
            public Builder srtLatency(Integer srtLatency) {
                this.srtLatency = srtLatency;
                return this;
            }

            /**
             * SrtMaxBitrate.
             */
            public Builder srtMaxBitrate(Integer srtMaxBitrate) {
                this.srtMaxBitrate = srtMaxBitrate;
                return this;
            }

            /**
             * SrtPassphrase.
             */
            public Builder srtPassphrase(String srtPassphrase) {
                this.srtPassphrase = srtPassphrase;
                return this;
            }

            /**
             * SrtPbKeyLen.
             */
            public Builder srtPbKeyLen(Integer srtPbKeyLen) {
                this.srtPbKeyLen = srtPbKeyLen;
                return this;
            }

            /**
             * <p>The name of the pushed stream. This parameter is required for PUSH inputs. It can be up to 255 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>mystream</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public InputSettings build() {
                return new InputSettings(this);
            } 

        } 

    }
}
