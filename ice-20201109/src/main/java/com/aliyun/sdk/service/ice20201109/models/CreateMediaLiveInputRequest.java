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
 * {@link CreateMediaLiveInputRequest} extends {@link RequestModel}
 *
 * <p>CreateMediaLiveInputRequest</p>
 */
public class CreateMediaLiveInputRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputSettings")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<InputSettings> inputSettings;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecurityGroupIds")
    private java.util.List<String> securityGroupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateMediaLiveInputRequest(Builder builder) {
        super(builder);
        this.inputSettings = builder.inputSettings;
        this.name = builder.name;
        this.securityGroupIds = builder.securityGroupIds;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMediaLiveInputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMediaLiveInputRequest, Builder> {
        private java.util.List<InputSettings> inputSettings; 
        private String name; 
        private java.util.List<String> securityGroupIds; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMediaLiveInputRequest request) {
            super(request);
            this.inputSettings = request.inputSettings;
            this.name = request.name;
            this.securityGroupIds = request.securityGroupIds;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder inputSettings(java.util.List<InputSettings> inputSettings) {
            String inputSettingsShrink = shrink(inputSettings, "InputSettings", "json");
            this.putBodyParameter("InputSettings", inputSettingsShrink);
            this.inputSettings = inputSettings;
            return this;
        }

        /**
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
         * SecurityGroupIds.
         */
        public Builder securityGroupIds(java.util.List<String> securityGroupIds) {
            String securityGroupIdsShrink = shrink(securityGroupIds, "SecurityGroupIds", "json");
            this.putBodyParameter("SecurityGroupIds", securityGroupIdsShrink);
            this.securityGroupIds = securityGroupIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RTMP_PUSH</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMediaLiveInputRequest build() {
            return new CreateMediaLiveInputRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateMediaLiveInputRequest} extends {@link TeaModel}
     *
     * <p>CreateMediaLiveInputRequest</p>
     */
    public static class InputSettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowOutputName")
        private String flowOutputName;

        @com.aliyun.core.annotation.NameInMap("SourceUrl")
        private String sourceUrl;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private InputSettings(Builder builder) {
            this.flowId = builder.flowId;
            this.flowOutputName = builder.flowOutputName;
            this.sourceUrl = builder.sourceUrl;
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
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String flowId; 
            private String flowOutputName; 
            private String sourceUrl; 
            private String streamName; 

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowOutputName.
             */
            public Builder flowOutputName(String flowOutputName) {
                this.flowOutputName = flowOutputName;
                return this;
            }

            /**
             * SourceUrl.
             */
            public Builder sourceUrl(String sourceUrl) {
                this.sourceUrl = sourceUrl;
                return this;
            }

            /**
             * StreamName.
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
