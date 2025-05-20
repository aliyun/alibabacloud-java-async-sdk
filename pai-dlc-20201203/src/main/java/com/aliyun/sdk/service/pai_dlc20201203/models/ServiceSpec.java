// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link ServiceSpec} extends {@link TeaModel}
 *
 * <p>ServiceSpec</p>
 */
public class ServiceSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultPort")
    private Integer defaultPort;

    @com.aliyun.core.annotation.NameInMap("ExtraPorts")
    private Integer extraPorts;

    @com.aliyun.core.annotation.NameInMap("ServiceMode")
    private String serviceMode;

    private ServiceSpec(Builder builder) {
        this.defaultPort = builder.defaultPort;
        this.extraPorts = builder.extraPorts;
        this.serviceMode = builder.serviceMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceSpec create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultPort
     */
    public Integer getDefaultPort() {
        return this.defaultPort;
    }

    /**
     * @return extraPorts
     */
    public Integer getExtraPorts() {
        return this.extraPorts;
    }

    /**
     * @return serviceMode
     */
    public String getServiceMode() {
        return this.serviceMode;
    }

    public static final class Builder {
        private Integer defaultPort; 
        private Integer extraPorts; 
        private String serviceMode; 

        private Builder() {
        } 

        private Builder(ServiceSpec model) {
            this.defaultPort = model.defaultPort;
            this.extraPorts = model.extraPorts;
            this.serviceMode = model.serviceMode;
        } 

        /**
         * DefaultPort.
         */
        public Builder defaultPort(Integer defaultPort) {
            this.defaultPort = defaultPort;
            return this;
        }

        /**
         * ExtraPorts.
         */
        public Builder extraPorts(Integer extraPorts) {
            this.extraPorts = extraPorts;
            return this;
        }

        /**
         * ServiceMode.
         */
        public Builder serviceMode(String serviceMode) {
            this.serviceMode = serviceMode;
            return this;
        }

        public ServiceSpec build() {
            return new ServiceSpec(this);
        } 

    } 

}
