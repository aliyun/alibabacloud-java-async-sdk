// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link GetPluginAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetPluginAttachmentResponseBody</p>
 */
public class GetPluginAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetPluginAttachmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginAttachmentResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetPluginAttachmentResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>C61E30D3-579A-5B43-994E-31E02EDC9129</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetPluginAttachmentResponseBody build() {
            return new GetPluginAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPluginAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>GetPluginAttachmentResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enable")
        private Boolean enable;

        @com.aliyun.core.annotation.NameInMap("environmentInfo")
        private EnvironmentInfo environmentInfo;

        @com.aliyun.core.annotation.NameInMap("gatewayInfo")
        private GatewayInfo gatewayInfo;

        @com.aliyun.core.annotation.NameInMap("parentResourceInfo")
        private ParentResourceInfo parentResourceInfo;

        @com.aliyun.core.annotation.NameInMap("pluginAttachmentId")
        private String pluginAttachmentId;

        @com.aliyun.core.annotation.NameInMap("pluginClassInfo")
        private PluginClassInfo pluginClassInfo;

        @com.aliyun.core.annotation.NameInMap("pluginConfig")
        private String pluginConfig;

        @com.aliyun.core.annotation.NameInMap("pluginId")
        private String pluginId;

        @com.aliyun.core.annotation.NameInMap("resourceInfos")
        private java.util.List<ResourceInfo> resourceInfos;

        private Data(Builder builder) {
            this.enable = builder.enable;
            this.environmentInfo = builder.environmentInfo;
            this.gatewayInfo = builder.gatewayInfo;
            this.parentResourceInfo = builder.parentResourceInfo;
            this.pluginAttachmentId = builder.pluginAttachmentId;
            this.pluginClassInfo = builder.pluginClassInfo;
            this.pluginConfig = builder.pluginConfig;
            this.pluginId = builder.pluginId;
            this.resourceInfos = builder.resourceInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enable
         */
        public Boolean getEnable() {
            return this.enable;
        }

        /**
         * @return environmentInfo
         */
        public EnvironmentInfo getEnvironmentInfo() {
            return this.environmentInfo;
        }

        /**
         * @return gatewayInfo
         */
        public GatewayInfo getGatewayInfo() {
            return this.gatewayInfo;
        }

        /**
         * @return parentResourceInfo
         */
        public ParentResourceInfo getParentResourceInfo() {
            return this.parentResourceInfo;
        }

        /**
         * @return pluginAttachmentId
         */
        public String getPluginAttachmentId() {
            return this.pluginAttachmentId;
        }

        /**
         * @return pluginClassInfo
         */
        public PluginClassInfo getPluginClassInfo() {
            return this.pluginClassInfo;
        }

        /**
         * @return pluginConfig
         */
        public String getPluginConfig() {
            return this.pluginConfig;
        }

        /**
         * @return pluginId
         */
        public String getPluginId() {
            return this.pluginId;
        }

        /**
         * @return resourceInfos
         */
        public java.util.List<ResourceInfo> getResourceInfos() {
            return this.resourceInfos;
        }

        public static final class Builder {
            private Boolean enable; 
            private EnvironmentInfo environmentInfo; 
            private GatewayInfo gatewayInfo; 
            private ParentResourceInfo parentResourceInfo; 
            private String pluginAttachmentId; 
            private PluginClassInfo pluginClassInfo; 
            private String pluginConfig; 
            private String pluginId; 
            private java.util.List<ResourceInfo> resourceInfos; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enable = model.enable;
                this.environmentInfo = model.environmentInfo;
                this.gatewayInfo = model.gatewayInfo;
                this.parentResourceInfo = model.parentResourceInfo;
                this.pluginAttachmentId = model.pluginAttachmentId;
                this.pluginClassInfo = model.pluginClassInfo;
                this.pluginConfig = model.pluginConfig;
                this.pluginId = model.pluginId;
                this.resourceInfos = model.resourceInfos;
            } 

            /**
             * enable.
             */
            public Builder enable(Boolean enable) {
                this.enable = enable;
                return this;
            }

            /**
             * environmentInfo.
             */
            public Builder environmentInfo(EnvironmentInfo environmentInfo) {
                this.environmentInfo = environmentInfo;
                return this;
            }

            /**
             * gatewayInfo.
             */
            public Builder gatewayInfo(GatewayInfo gatewayInfo) {
                this.gatewayInfo = gatewayInfo;
                return this;
            }

            /**
             * parentResourceInfo.
             */
            public Builder parentResourceInfo(ParentResourceInfo parentResourceInfo) {
                this.parentResourceInfo = parentResourceInfo;
                return this;
            }

            /**
             * pluginAttachmentId.
             */
            public Builder pluginAttachmentId(String pluginAttachmentId) {
                this.pluginAttachmentId = pluginAttachmentId;
                return this;
            }

            /**
             * pluginClassInfo.
             */
            public Builder pluginClassInfo(PluginClassInfo pluginClassInfo) {
                this.pluginClassInfo = pluginClassInfo;
                return this;
            }

            /**
             * pluginConfig.
             */
            public Builder pluginConfig(String pluginConfig) {
                this.pluginConfig = pluginConfig;
                return this;
            }

            /**
             * pluginId.
             */
            public Builder pluginId(String pluginId) {
                this.pluginId = pluginId;
                return this;
            }

            /**
             * resourceInfos.
             */
            public Builder resourceInfos(java.util.List<ResourceInfo> resourceInfos) {
                this.resourceInfos = resourceInfos;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
