// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

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
 * {@link GetIpsetsBandwidthLimitResponseBody} extends {@link TeaModel}
 *
 * <p>GetIpsetsBandwidthLimitResponseBody</p>
 */
public class GetIpsetsBandwidthLimitResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BandwidthAllocationType")
    private String bandwidthAllocationType;

    @com.aliyun.core.annotation.NameInMap("BandwidthLimit")
    private Long bandwidthLimit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetIpsetsBandwidthLimitResponseBody model) {
            this.bandwidthAllocationType = model.bandwidthAllocationType;
            this.bandwidthLimit = model.bandwidthLimit;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The type of the bandwidth that is allocated.</p>
         * <ul>
         * <li><strong>ShareBandwidth:</strong> shared bandwidth.</li>
         * <li><strong>ExclusiveBandwidth:</strong> dedicated bandwidth.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ShareBandwidth</p>
         */
        public Builder bandwidthAllocationType(String bandwidthAllocationType) {
            this.bandwidthAllocationType = bandwidthAllocationType;
            return this;
        }

        /**
         * <p>The maximum bandwidth of the acceleration area. Unit: Mbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder bandwidthLimit(Long bandwidthLimit) {
            this.bandwidthLimit = bandwidthLimit;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
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
