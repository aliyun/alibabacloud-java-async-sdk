// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link OpenServiceGroupForServiceResponseBody} extends {@link TeaModel}
 *
 * <p>OpenServiceGroupForServiceResponseBody</p>
 */
public class OpenServiceGroupForServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("serviceIds")
    private java.util.List<Long> serviceIds;

    private OpenServiceGroupForServiceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceIds = builder.serviceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenServiceGroupForServiceResponseBody create() {
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
     * @return serviceIds
     */
    public java.util.List<Long> getServiceIds() {
        return this.serviceIds;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Long> serviceIds; 

        private Builder() {
        } 

        private Builder(OpenServiceGroupForServiceResponseBody model) {
            this.requestId = model.requestId;
            this.serviceIds = model.serviceIds;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * serviceIds.
         */
        public Builder serviceIds(java.util.List<Long> serviceIds) {
            this.serviceIds = serviceIds;
            return this;
        }

        public OpenServiceGroupForServiceResponseBody build() {
            return new OpenServiceGroupForServiceResponseBody(this);
        } 

    } 

}
