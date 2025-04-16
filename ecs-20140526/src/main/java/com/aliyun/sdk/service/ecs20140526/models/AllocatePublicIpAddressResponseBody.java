// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

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
 * {@link AllocatePublicIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>AllocatePublicIpAddressResponseBody</p>
 */
public class AllocatePublicIpAddressResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpAddress")
    private String ipAddress;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AllocatePublicIpAddressResponseBody(Builder builder) {
        this.ipAddress = builder.ipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AllocatePublicIpAddressResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String ipAddress; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AllocatePublicIpAddressResponseBody model) {
            this.ipAddress = model.ipAddress;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The public IP address.</p>
         * 
         * <strong>example:</strong>
         * <p><code>112.124.**.**</code></p>
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AllocatePublicIpAddressResponseBody build() {
            return new AllocatePublicIpAddressResponseBody(this);
        } 

    } 

}
