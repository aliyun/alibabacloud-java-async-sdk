// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ServiceStatus} extends {@link TeaModel}
 *
 * <p>ServiceStatus</p>
 */
public class ServiceStatus extends TeaModel {
    @NameInMap("enabled")
    private Boolean enabled;

    @NameInMap("status")
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
