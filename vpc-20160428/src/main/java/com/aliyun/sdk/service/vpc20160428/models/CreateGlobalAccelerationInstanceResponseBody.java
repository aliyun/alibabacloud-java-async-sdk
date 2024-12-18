// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link CreateGlobalAccelerationInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateGlobalAccelerationInstanceResponseBody</p>
 */
public class CreateGlobalAccelerationInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GlobalAccelerationInstanceId")
    private String globalAccelerationInstanceId;

    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the GA instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ga-bp1fi6sq7npnicmjj****</p>
         */
        public Builder globalAccelerationInstanceId(String globalAccelerationInstanceId) {
            this.globalAccelerationInstanceId = globalAccelerationInstanceId;
            return this;
        }

        /**
         * <p>The public IP address of the GA instance.</p>
         * <p>If <strong>BandwidthType</strong> is set to <strong>Sharing</strong>, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>12.xx.xx.78</p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
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
