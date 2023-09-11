// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEndpointGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateEndpointGroupsResponseBody</p>
 */
public class UpdateEndpointGroupsResponseBody extends TeaModel {
    @NameInMap("EndpointGroupIds")
    private java.util.List < String > endpointGroupIds;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateEndpointGroupsResponseBody(Builder builder) {
        this.endpointGroupIds = builder.endpointGroupIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEndpointGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List < String > getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > endpointGroupIds; 
        private String requestId; 

        /**
         * The IDs of the endpoint groups.
         */
        public Builder endpointGroupIds(java.util.List < String > endpointGroupIds) {
            this.endpointGroupIds = endpointGroupIds;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateEndpointGroupsResponseBody build() {
            return new UpdateEndpointGroupsResponseBody(this);
        } 

    } 

}
