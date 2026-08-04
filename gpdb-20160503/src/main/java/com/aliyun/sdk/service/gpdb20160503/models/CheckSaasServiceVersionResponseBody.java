// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link CheckSaasServiceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>CheckSaasServiceVersionResponseBody</p>
 */
public class CheckSaasServiceVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanUpgrade")
    private Boolean canUpgrade;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private CheckSaasServiceVersionResponseBody(Builder builder) {
        this.canUpgrade = builder.canUpgrade;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSaasServiceVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canUpgrade
     */
    public Boolean getCanUpgrade() {
        return this.canUpgrade;
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

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private Boolean canUpgrade; 
        private String message; 
        private String requestId; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(CheckSaasServiceVersionResponseBody model) {
            this.canUpgrade = model.canUpgrade;
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
        } 

        /**
         * CanUpgrade.
         */
        public Builder canUpgrade(Boolean canUpgrade) {
            this.canUpgrade = canUpgrade;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public CheckSaasServiceVersionResponseBody build() {
            return new CheckSaasServiceVersionResponseBody(this);
        } 

    } 

}
