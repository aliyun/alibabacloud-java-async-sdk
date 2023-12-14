// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateVpcConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateVpcConnectivityResponseBody</p>
 */
public class ValidateVpcConnectivityResponseBody extends TeaModel {
    @NameInMap("Connected")
    private Boolean connected;

    @NameInMap("IpType")
    private String ipType;

    @NameInMap("RequestId")
    private String requestId;

    private ValidateVpcConnectivityResponseBody(Builder builder) {
        this.connected = builder.connected;
        this.ipType = builder.ipType;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateVpcConnectivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return connected
     */
    public Boolean getConnected() {
        return this.connected;
    }

    /**
     * @return ipType
     */
    public String getIpType() {
        return this.ipType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean connected; 
        private String ipType; 
        private String requestId; 

        /**
         * Indicates whether the API Gateway instance is connected to the port. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder connected(Boolean connected) {
            this.connected = connected;
            return this;
        }

        /**
         * Indicates whether the instance in the authorization is an ECS instance or an SLB instance when the instance ID in the authorization is an IP address. Valid values:
         * <p>
         * 
         * *   **ECS**
         * *   **SLB**
         * *   **INVALID**: The instance type corresponding to the IP address is invalid.
         */
        public Builder ipType(String ipType) {
            this.ipType = ipType;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ValidateVpcConnectivityResponseBody build() {
            return new ValidateVpcConnectivityResponseBody(this);
        } 

    } 

}
