// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ServiceStatus} extends {@link TeaModel}
 *
 * <p>ServiceStatus</p>
 */
public class ServiceStatus extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enabled")
    private Boolean enabled;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private ServiceStatus(Builder builder) {
        this.enabled = builder.enabled;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceStatus create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enabled
     */
    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private Boolean enabled; 
        private String status; 

        private Builder() {
        } 

        private Builder(ServiceStatus model) {
            this.enabled = model.enabled;
            this.status = model.status;
        } 

        /**
         * enabled.
         */
        public Builder enabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public ServiceStatus build() {
            return new ServiceStatus(this);
        } 

    } 

}
