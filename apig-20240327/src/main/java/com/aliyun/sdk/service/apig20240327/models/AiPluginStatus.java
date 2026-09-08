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
 * {@link AiPluginStatus} extends {@link TeaModel}
 *
 * <p>AiPluginStatus</p>
 */
public class AiPluginStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorLogs")
    private java.util.List<java.util.Map<String, ?>> errorLogs;

    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.NameInMap("serviceHealthy")
    private Boolean serviceHealthy;

    private AiPluginStatus(Builder builder) {
        this.errorLogs = builder.errorLogs;
        this.pluginId = builder.pluginId;
        this.serviceHealthy = builder.serviceHealthy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiPluginStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return errorLogs
     */
    public java.util.List<java.util.Map<String, ?>> getErrorLogs() {
        return this.errorLogs;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return serviceHealthy
     */
    public Boolean getServiceHealthy() {
        return this.serviceHealthy;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, ?>> errorLogs; 
        private String pluginId; 
        private Boolean serviceHealthy; 

        private Builder() {
        } 

        private Builder(AiPluginStatus model) {
            this.errorLogs = model.errorLogs;
            this.pluginId = model.pluginId;
            this.serviceHealthy = model.serviceHealthy;
        } 

        /**
         * <p>The list of plug-in runtime error logs. Each item is a map[string]any key-value pair.</p>
         */
        public Builder errorLogs(java.util.List<java.util.Map<String, ?>> errorLogs) {
            this.errorLogs = errorLogs;
            return this;
        }

        /**
         * <p>The plug-in instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pi-xxx</p>
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Indicates whether the backend service that the plugin depends on is healthy.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder serviceHealthy(Boolean serviceHealthy) {
            this.serviceHealthy = serviceHealthy;
            return this;
        }

        public AiPluginStatus build() {
            return new AiPluginStatus(this);
        } 

    } 

}
