// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReleasePublicIpAddressResponseBody} extends {@link TeaModel}
 *
 * <p>ReleasePublicIpAddressResponseBody</p>
 */
public class ReleasePublicIpAddressResponseBody extends TeaModel {
    @NameInMap("RemainTimes")
    private String remainTimes;

    @NameInMap("RequestId")
    private String requestId;

    private ReleasePublicIpAddressResponseBody(Builder builder) {
        this.remainTimes = builder.remainTimes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleasePublicIpAddressResponseBody create() {
        return builder().build();
    }

    /**
     * @return remainTimes
     */
    public String getRemainTimes() {
        return this.remainTimes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String remainTimes; 
        private String requestId; 

        /**
         * > This parameter is unavailable.
         */
        public Builder remainTimes(String remainTimes) {
            this.remainTimes = remainTimes;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ReleasePublicIpAddressResponseBody build() {
            return new ReleasePublicIpAddressResponseBody(this);
        } 

    } 

}
