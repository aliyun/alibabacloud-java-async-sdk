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
 * {@link CreateAIServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAIServiceResponseBody</p>
 */
public class CreateAIServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    private CreateAIServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAIServiceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private String serviceId; 

        private Builder() {
        } 

        private Builder(CreateAIServiceResponseBody model) {
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
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

        public CreateAIServiceResponseBody build() {
            return new CreateAIServiceResponseBody(this);
        } 

    } 

}
