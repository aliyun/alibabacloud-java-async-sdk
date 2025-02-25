// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ChangeZoneDnsGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ChangeZoneDnsGroupResponseBody</p>
 */
public class ChangeZoneDnsGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ZoneId")
    private String zoneId;

    private ChangeZoneDnsGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.zoneId = builder.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ChangeZoneDnsGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return zoneId
     */
    public String getZoneId() {
        return this.zoneId;
    }

    public static final class Builder {
        private String requestId; 
        private String zoneId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6F1D541-E7A6-447A-A2B5-9F7A20B2A8FB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The global ID of the zone.</p>
         * 
         * <strong>example:</strong>
         * <p>e0cff188756b1d4579b25e54b66cb830</p>
         */
        public Builder zoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }

        public ChangeZoneDnsGroupResponseBody build() {
            return new ChangeZoneDnsGroupResponseBody(this);
        } 

    } 

}
