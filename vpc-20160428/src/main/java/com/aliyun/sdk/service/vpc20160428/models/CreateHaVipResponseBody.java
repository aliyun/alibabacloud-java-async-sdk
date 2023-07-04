// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHaVipResponseBody} extends {@link TeaModel}
 *
 * <p>CreateHaVipResponseBody</p>
 */
public class CreateHaVipResponseBody extends TeaModel {
    @NameInMap("HaVipId")
    private String haVipId;

    @NameInMap("IpAddress")
    private String ipAddress;

    @NameInMap("RequestId")
    private String requestId;

    private CreateHaVipResponseBody(Builder builder) {
        this.haVipId = builder.haVipId;
        this.ipAddress = builder.ipAddress;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHaVipResponseBody create() {
        return builder().build();
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
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
        private String haVipId; 
        private String ipAddress; 
        private String requestId; 

        /**
         * The ID of the HAVIP.
         */
        public Builder haVipId(String haVipId) {
            this.haVipId = haVipId;
            return this;
        }

        /**
         * The IP address of the HAVIP.
         */
        public Builder ipAddress(String ipAddress) {
            this.ipAddress = ipAddress;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateHaVipResponseBody build() {
            return new CreateHaVipResponseBody(this);
        } 

    } 

}
