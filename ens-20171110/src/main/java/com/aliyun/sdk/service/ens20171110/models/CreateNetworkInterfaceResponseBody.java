// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateNetworkInterfaceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkInterfaceResponseBody</p>
 */
public class CreateNetworkInterfaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
    private java.util.List<String> networkInterfaceIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateNetworkInterfaceResponseBody(Builder builder) {
        this.networkInterfaceIds = builder.networkInterfaceIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkInterfaceResponseBody create() {
        return builder().build();
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<String> networkInterfaceIds; 
        private String requestId; 

        /**
         * NetworkInterfaceIds.
         */
        public Builder networkInterfaceIds(java.util.List<String> networkInterfaceIds) {
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkInterfaceResponseBody build() {
            return new CreateNetworkInterfaceResponseBody(this);
        } 

    } 

}
