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
 * {@link UpdateSaasServiceVersionResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSaasServiceVersionResponseBody</p>
 */
public class UpdateSaasServiceVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private UpdateSaasServiceVersionResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSaasServiceVersionResponseBody create() {
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

        private Builder(UpdateSaasServiceVersionResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
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

        public UpdateSaasServiceVersionResponseBody build() {
            return new UpdateSaasServiceVersionResponseBody(this);
        } 

    } 

}
