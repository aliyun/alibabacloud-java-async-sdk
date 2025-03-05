// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

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
 * {@link CreateIpamResourceDiscoveryResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIpamResourceDiscoveryResponseBody</p>
 */
public class CreateIpamResourceDiscoveryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpamResourceDiscoveryId")
    private String ipamResourceDiscoveryId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIpamResourceDiscoveryResponseBody(Builder builder) {
        this.ipamResourceDiscoveryId = builder.ipamResourceDiscoveryId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIpamResourceDiscoveryResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipamResourceDiscoveryId
     */
    public String getIpamResourceDiscoveryId() {
        return this.ipamResourceDiscoveryId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String ipamResourceDiscoveryId; 
        private String requestId; 

        /**
         * IpamResourceDiscoveryId.
         */
        public Builder ipamResourceDiscoveryId(String ipamResourceDiscoveryId) {
            this.ipamResourceDiscoveryId = ipamResourceDiscoveryId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIpamResourceDiscoveryResponseBody build() {
            return new CreateIpamResourceDiscoveryResponseBody(this);
        } 

    } 

}
