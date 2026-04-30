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
 * {@link UpgradePolarClawChannelResponseBody} extends {@link TeaModel}
 *
 * <p>UpgradePolarClawChannelResponseBody</p>
 */
public class UpgradePolarClawChannelResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("PluginUpgraded")
    private Boolean pluginUpgraded;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Restarted")
    private Boolean restarted;

    private UpgradePolarClawChannelResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.channelId = builder.channelId;
        this.code = builder.code;
        this.message = builder.message;
        this.npmPackage = builder.npmPackage;
        this.ok = builder.ok;
        this.pluginId = builder.pluginId;
        this.pluginUpgraded = builder.pluginUpgraded;
        this.requestId = builder.requestId;
        this.restarted = builder.restarted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradePolarClawChannelResponseBody create() {
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
     * @return pluginUpgraded
     */
    public Boolean getPluginUpgraded() {
        return this.pluginUpgraded;
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
        private Boolean pluginUpgraded; 
        private String requestId; 
        private Boolean restarted; 

        private Builder() {
        } 

        private Builder(UpgradePolarClawChannelResponseBody model) {
            this.applicationId = model.applicationId;
            this.channelId = model.channelId;
            this.code = model.code;
            this.message = model.message;
            this.npmPackage = model.npmPackage;
            this.ok = model.ok;
            this.pluginId = model.pluginId;
            this.pluginUpgraded = model.pluginUpgraded;
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
         * NpmPackage.
         */
        public Builder npmPackage(String npmPackage) {
            this.npmPackage = npmPackage;
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
         * PluginUpgraded.
         */
        public Builder pluginUpgraded(Boolean pluginUpgraded) {
            this.pluginUpgraded = pluginUpgraded;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
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

        public UpgradePolarClawChannelResponseBody build() {
            return new UpgradePolarClawChannelResponseBody(this);
        } 

    } 

}
