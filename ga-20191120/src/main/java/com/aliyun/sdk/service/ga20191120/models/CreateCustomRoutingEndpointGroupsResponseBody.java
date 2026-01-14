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
 * {@link CreateCustomRoutingEndpointGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCustomRoutingEndpointGroupsResponseBody</p>
 */
public class CreateCustomRoutingEndpointGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EndpointGroupIds")
    private java.util.List<String> endpointGroupIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCustomRoutingEndpointGroupsResponseBody(Builder builder) {
        this.endpointGroupIds = builder.endpointGroupIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomRoutingEndpointGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List<String> getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> endpointGroupIds; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCustomRoutingEndpointGroupsResponseBody model) {
            this.endpointGroupIds = model.endpointGroupIds;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The IDs of the endpoint groups.</p>
         */
        public Builder endpointGroupIds(java.util.List<String> endpointGroupIds) {
            this.endpointGroupIds = endpointGroupIds;
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

        public CreateCustomRoutingEndpointGroupsResponseBody build() {
            return new CreateCustomRoutingEndpointGroupsResponseBody(this);
        } 

    } 

}
