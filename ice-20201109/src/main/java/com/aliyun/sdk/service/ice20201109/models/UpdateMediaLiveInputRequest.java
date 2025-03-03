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
         * <p>This parameter is required.</p>
         */
        public Builder inputSettings(java.util.List<InputSettings> inputSettings) {
            String inputSettingsShrink = shrink(inputSettings, "InputSettings", "json");
            this.putQueryParameter("InputSettings", inputSettingsShrink);
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
