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
 * {@link ModifySaasServiceDeletionProtectionResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySaasServiceDeletionProtectionResponseBody</p>
 */
public class ModifySaasServiceDeletionProtectionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private ModifySaasServiceDeletionProtectionResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySaasServiceDeletionProtectionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String message; 
        private String requestId; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(ModifySaasServiceDeletionProtectionResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
        } 

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7565770E-7C45-462D-BA4A-8A5396F2CAD1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agdb-xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public ModifySaasServiceDeletionProtectionResponseBody build() {
            return new ModifySaasServiceDeletionProtectionResponseBody(this);
        } 

    } 

}
