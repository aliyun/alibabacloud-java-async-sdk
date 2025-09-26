// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link MCPServiceConfig} extends {@link TeaModel}
 *
 * <p>MCPServiceConfig</p>
 */
public class MCPServiceConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("serviceId")
    private String serviceId;

    private MCPServiceConfig(Builder builder) {
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MCPServiceConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String serviceId; 

        private Builder() {
        } 

        private Builder(MCPServiceConfig model) {
            this.serviceId = model.serviceId;
        } 

        /**
         * serviceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public MCPServiceConfig build() {
            return new MCPServiceConfig(this);
        } 

    } 

}
