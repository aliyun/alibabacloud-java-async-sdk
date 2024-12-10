// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayIntranetSupportedZoneResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayIntranetSupportedZoneResponseBody</p>
 */
public class ListGatewayIntranetSupportedZoneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Zones")
    private java.util.List < String > zones;

    private ListGatewayIntranetSupportedZoneResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zones = builder.zones;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayIntranetSupportedZoneResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zones
     */
    public java.util.List < String > getZones() {
        return this.zones;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < String > zones; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Zones.
         */
        public Builder zones(java.util.List < String > zones) {
            this.zones = zones;
            return this;
        }

        public ListGatewayIntranetSupportedZoneResponseBody build() {
            return new ListGatewayIntranetSupportedZoneResponseBody(this);
        } 

    } 

}
