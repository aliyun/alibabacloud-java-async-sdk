// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGlobalAccelerationInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalAccelerationInstanceResponseBody</p>
 */
public class CreateGlobalAccelerationInstanceResponseBody extends TeaModel {
    @NameInMap("GlobalAccelerationInstanceId")
    private String globalAccelerationInstanceId;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("RequestId")
    private String requestId;

    private CreateGlobalAccelerationInstanceResponseBody(Builder builder) {
        this.globalAccelerationInstanceId = builder.globalAccelerationInstanceId;
        this.ipAddress = builder.ipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGlobalAccelerationInstanceResponseBody create() {
        return builder().build();
    }

    /**
     * @return globalAccelerationInstanceId
     */
    public String getGlobalAccelerationInstanceId() {
        return this.globalAccelerationInstanceId;
    }

    /**
     * @return ipAddress
     */
    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String globalAccelerationInstanceId; 
        private String ipAddress; 
        private String requestId; 

        /**
         * The ID of the GA instance.
         */
        public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }

        /**
         * The public IP address of the GA instance.
         * <p>
         * 
         * If **BandwidthType** is set to **Sharing**, this parameter is not returned.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateGlobalAccelerationInstanceResponseBody build() {
            return new CreateGlobalAccelerationInstanceResponseBody(this);
        } 

    } 

}
