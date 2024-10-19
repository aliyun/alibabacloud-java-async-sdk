// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ValidateVpcConnectivityResponseBody} extends {@link TeaModel}
 *
 * <p>ValidateVpcConnectivityResponseBody</p>
 */
public class ValidateVpcConnectivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Connected")
    private Boolean connected;

    @com.aliyun.core.annotation.NameInMap("IpType")
    private String ipType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>Indicates whether the API Gateway instance is connected to the port. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder connected(Boolean connected) {
            this.connected = connected;
            return this;
        }

        /**
         * <p>Indicates whether the instance in the authorization is an ECS instance or an SLB instance when the instance ID in the authorization is an IP address. Valid values:</p>
         * <ul>
         * <li><strong>ECS</strong></li>
         * <li><strong>SLB</strong></li>
         * <li><strong>INVALID</strong>: The instance type corresponding to the IP address is invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        public Builder ipType(String ipType) {
            this.ipType = ipType;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9A591B5B-0EC2-5463-B8B8-1984AE3AEBF1</p>
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
