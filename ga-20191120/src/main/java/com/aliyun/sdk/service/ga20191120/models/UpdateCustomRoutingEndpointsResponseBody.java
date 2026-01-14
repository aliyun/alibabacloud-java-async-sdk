// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link UpdateCustomRoutingEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateCustomRoutingEndpointsResponseBody</p>
 */
public class UpdateCustomRoutingEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointIds")
    private java.util.List<String> endpointIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateCustomRoutingEndpointsResponseBody(Builder builder) {
        this.endpointIds = builder.endpointIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateCustomRoutingEndpointsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointIds
     */
    public java.util.List<String> getEndpointIds() {
        return this.endpointIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> endpointIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateCustomRoutingEndpointsResponseBody model) {
            this.endpointIds = model.endpointIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the endpoints.</p>
         */
        public Builder endpointIds(java.util.List<String> endpointIds) {
            this.endpointIds = endpointIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateCustomRoutingEndpointsResponseBody build() {
            return new UpdateCustomRoutingEndpointsResponseBody(this);
        } 

    } 

}
