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
 * {@link CreateStreamingDataServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateStreamingDataServiceResponseBody</p>
 */
public class CreateStreamingDataServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Integer serviceId;

    private CreateStreamingDataServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStreamingDataServiceResponseBody create() {
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
    public Integer getServiceId() {
        return this.serviceId;
    }

    public static final class Builder {
        private String requestId; 
        private Integer serviceId; 

        private Builder() {
        } 

        private Builder(CreateStreamingDataServiceResponseBody model) {
            this.requestId = model.requestId;
            this.serviceId = model.serviceId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B4CAF581-2AC7-41AD-8940-D56DF7AADF5B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The real-time data service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder serviceId(Integer serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        public CreateStreamingDataServiceResponseBody build() {
            return new CreateStreamingDataServiceResponseBody(this);
        } 

    } 

}
