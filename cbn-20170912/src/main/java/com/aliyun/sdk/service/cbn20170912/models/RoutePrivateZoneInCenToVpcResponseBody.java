// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RoutePrivateZoneInCenToVpcResponseBody} extends {@link TeaModel}
 *
 * <p>RoutePrivateZoneInCenToVpcResponseBody</p>
 */
public class RoutePrivateZoneInCenToVpcResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RoutePrivateZoneInCenToVpcResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutePrivateZoneInCenToVpcResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C0245BEF-52AC-44A8-A776-EF96FD26A5CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RoutePrivateZoneInCenToVpcResponseBody build() {
            return new RoutePrivateZoneInCenToVpcResponseBody(this);
        } 

    } 

}
