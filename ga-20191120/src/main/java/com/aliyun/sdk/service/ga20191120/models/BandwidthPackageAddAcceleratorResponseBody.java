// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BandwidthPackageAddAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>BandwidthPackageAddAcceleratorResponseBody</p>
 */
public class BandwidthPackageAddAcceleratorResponseBody extends TeaModel {
    @NameInMap("Accelerators")
    private java.util.List < String > accelerators;

    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("RequestId")
    private String requestId;

    private BandwidthPackageAddAcceleratorResponseBody(Builder builder) {
        this.accelerators = builder.accelerators;
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BandwidthPackageAddAcceleratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return accelerators
     */
    public java.util.List < String > getAccelerators() {
        return this.accelerators;
    }

    /**
     * @return bandwidthPackageId
     */
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > accelerators; 
        private String bandwidthPackageId; 
        private String requestId; 

        /**
         * The GA instance IDs.
         */
        public Builder accelerators(java.util.List < String > accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * The bandwidth plan ID.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BandwidthPackageAddAcceleratorResponseBody build() {
            return new BandwidthPackageAddAcceleratorResponseBody(this);
        } 

    } 

}
