// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIpsetsBandwidthLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpsetsBandwidthLimitResponseBody</p>
 */
public class GetIpsetsBandwidthLimitResponseBody extends TeaModel {
    @NameInMap("BandwidthAllocationType")
    private String bandwidthAllocationType;

    @NameInMap("BandwidthLimit")
    private Long bandwidthLimit;

    @NameInMap("RequestId")
    private String requestId;

    private GetIpsetsBandwidthLimitResponseBody(Builder builder) {
        this.bandwidthAllocationType = builder.bandwidthAllocationType;
        this.bandwidthLimit = builder.bandwidthLimit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIpsetsBandwidthLimitResponseBody create() {
        return builder().build();
    }

    /**
     * @return bandwidthAllocationType
     */
    public String getBandwidthAllocationType() {
        return this.bandwidthAllocationType;
    }

    /**
     * @return bandwidthLimit
     */
    public Long getBandwidthLimit() {
        return this.bandwidthLimit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String bandwidthAllocationType; 
        private Long bandwidthLimit; 
        private String requestId; 

        /**
         * The type of the bandwidth that is allocated.
         * <p>
         * 
         * *   **ShareBandwidth:** shared bandwidth.
         * *   **ExclusiveBandwidth:** dedicated bandwidth.
         */
        public Builder bandwidthAllocationType(String bandwidthAllocationType) {
            this.bandwidthAllocationType = bandwidthAllocationType;
            return this;
        }

        /**
         * The maximum bandwidth of the acceleration area. Unit: Mbit/s.
         */
        public Builder bandwidthLimit(Long bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetIpsetsBandwidthLimitResponseBody build() {
            return new GetIpsetsBandwidthLimitResponseBody(this);
        } 

    } 

}
