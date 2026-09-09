// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starops20260428.models;

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
 * {@link ConnectorRuntime} extends {@link TeaModel}
 *
 * <p>ConnectorRuntime</p>
 */
public class ConnectorRuntime extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    @com.aliyun.core.annotation.NameInMap("pluginId")
    private String pluginId;

    @com.aliyun.core.annotation.NameInMap("satelliteId")
    private String satelliteId;

    private ConnectorRuntime(Builder builder) {
        this.mode = builder.mode;
        this.pluginId = builder.pluginId;
        this.satelliteId = builder.satelliteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConnectorRuntime create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return pluginId
     */
    public String getPluginId() {
        return this.pluginId;
    }

    /**
     * @return satelliteId
     */
    public String getSatelliteId() {
        return this.satelliteId;
    }

    public static final class Builder {
        private String mode; 
        private String pluginId; 
        private String satelliteId; 

        private Builder() {
        } 

        private Builder(ConnectorRuntime model) {
            this.mode = model.mode;
            this.pluginId = model.pluginId;
            this.satelliteId = model.satelliteId;
        } 

        /**
         * <p>Runtime mode</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>STAROPS_MANAGED</p>
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * <p>Plugin ID</p>
         * 
         * <strong>example:</strong>
         * <p>gitlab</p>
         */
        public Builder pluginId(String pluginId) {
            this.pluginId = pluginId;
            return this;
        }

        /**
         * <p>Satellite ID</p>
         * 
         * <strong>example:</strong>
         * <p>satellite-private-runtime</p>
         */
        public Builder satelliteId(String satelliteId) {
            this.satelliteId = satelliteId;
            return this;
        }

        public ConnectorRuntime build() {
            return new ConnectorRuntime(this);
        } 

    } 

}
