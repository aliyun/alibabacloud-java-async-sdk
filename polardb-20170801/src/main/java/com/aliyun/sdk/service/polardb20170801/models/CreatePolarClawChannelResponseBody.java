// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawChannelResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePolarClawChannelResponseBody</p>
 */
public class CreatePolarClawChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NpmPackage")
    private String npmPackage;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.NameInMap("PluginInstalled")
    private Boolean pluginInstalled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Restarted")
    private Boolean restarted;

    private CreatePolarClawChannelResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.channelId = builder.channelId;
        this.code = builder.code;
        this.message = builder.message;
        this.npmPackage = builder.npmPackage;
        this.ok = builder.ok;
        this.pluginId = builder.pluginId;
        this.pluginInstalled = builder.pluginInstalled;
        this.requestId = builder.requestId;
        this.restarted = builder.restarted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawChannelResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return npmPackage
     */
    public String getNpmPackage() {
        return this.npmPackage;
    }

    /**
     * @return ok
     */
    public Boolean getOk() {
        return this.ok;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return pluginInstalled
     */
    public Boolean getPluginInstalled() {
        return this.pluginInstalled;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restarted
     */
    public Boolean getRestarted() {
        return this.restarted;
    }

    public static final class Builder {
        private String applicationId; 
        private String channelId; 
        private Integer code; 
        private String message; 
        private String npmPackage; 
        private Boolean ok; 
        private String pluginId; 
        private Boolean pluginInstalled; 
        private String requestId; 
        private Boolean restarted; 

        private Builder() {
        } 

        private Builder(CreatePolarClawChannelResponseBody model) {
            this.applicationId = model.applicationId;
            this.channelId = model.channelId;
            this.code = model.code;
            this.message = model.message;
            this.npmPackage = model.npmPackage;
            this.ok = model.ok;
            this.pluginId = model.pluginId;
            this.pluginInstalled = model.pluginInstalled;
            this.requestId = model.requestId;
            this.restarted = model.restarted;
        } 

        /**
         * <p><strong>The application ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The ID of the channel that was created.</p>
         * 
         * <strong>example:</strong>
         * <p>feishu</p>
         */
        public Builder channelId(String channelId) {
            this.channelId = channelId;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the installed npm package.</p>
         * 
         * <strong>example:</strong>
         * <p>@larksuite/<a href="mailto:openclaw-lark@2026.4.7">openclaw-lark@2026.4.7</a></p>
         */
        public Builder npmPackage(String npmPackage) {
            this.npmPackage = npmPackage;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * <p><strong>The plugin ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>openclaw-lark</p>
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Indicates whether a new plugin was installed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pluginInstalled(Boolean pluginInstalled) {
            this.pluginInstalled = pluginInstalled;
            return this;
        }

        /**
         * <p><strong>The request ID.</strong></p>
         * 
         * <strong>example:</strong>
         * <p>2281C6C9-CBAB-1AFD-8400-670750CF6025_2212</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the gateway was restarted.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder restarted(Boolean restarted) {
            this.restarted = restarted;
            return this;
        }

        public CreatePolarClawChannelResponseBody build() {
            return new CreatePolarClawChannelResponseBody(this);
        } 

    } 

}
