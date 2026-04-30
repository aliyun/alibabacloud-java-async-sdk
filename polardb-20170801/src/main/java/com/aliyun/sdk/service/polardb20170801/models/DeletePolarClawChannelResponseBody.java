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
 * {@link DeletePolarClawChannelResponseBody} extends {@link TeaModel}
 *
 * <p>DeletePolarClawChannelResponseBody</p>
 */
public class DeletePolarClawChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("Ok")
    private Boolean ok;

    @com.aliyun.core.annotation.NameInMap("PluginId")
    private String pluginId;

    @com.aliyun.core.annotation.NameInMap("PluginUninstalled")
    private Boolean pluginUninstalled;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Restarted")
    private Boolean restarted;

    private DeletePolarClawChannelResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.channelId = builder.channelId;
        this.code = builder.code;
        this.message = builder.message;
        this.ok = builder.ok;
        this.pluginId = builder.pluginId;
        this.pluginUninstalled = builder.pluginUninstalled;
        this.requestId = builder.requestId;
        this.restarted = builder.restarted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePolarClawChannelResponseBody create() {
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
     * @return pluginUninstalled
     */
    public Boolean getPluginUninstalled() {
        return this.pluginUninstalled;
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
        private Boolean ok; 
        private String pluginId; 
        private Boolean pluginUninstalled; 
        private String requestId; 
        private Boolean restarted; 

        private Builder() {
        } 

        private Builder(DeletePolarClawChannelResponseBody model) {
            this.applicationId = model.applicationId;
            this.channelId = model.channelId;
            this.code = model.code;
            this.message = model.message;
            this.ok = model.ok;
            this.pluginId = model.pluginId;
            this.pluginUninstalled = model.pluginUninstalled;
            this.requestId = model.requestId;
            this.restarted = model.restarted;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
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
         * Ok.
         */
        public Builder ok(Boolean ok) {
            this.ok = ok;
            return this;
        }

        /**
         * PluginId.
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * PluginUninstalled.
         */
        public Builder pluginUninstalled(Boolean pluginUninstalled) {
            this.pluginUninstalled = pluginUninstalled;
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
         * Restarted.
         */
        public Builder restarted(Boolean restarted) {
            this.restarted = restarted;
            return this;
        }

        public DeletePolarClawChannelResponseBody build() {
            return new DeletePolarClawChannelResponseBody(this);
        } 

    } 

}
