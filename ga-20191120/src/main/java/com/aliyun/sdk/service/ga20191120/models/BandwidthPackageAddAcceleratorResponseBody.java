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
 * {@link BandwidthPackageAddAcceleratorResponseBody} extends {@link TeaModel}
 *
 * <p>BandwidthPackageAddAcceleratorResponseBody</p>
 */
public class BandwidthPackageAddAcceleratorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accelerators")
    private java.util.List<String> accelerators;

    @com.aliyun.core.annotation.NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accelerators
     */
    public java.util.List<String> getAccelerators() {
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
        private java.util.List<String> accelerators; 
        private String bandwidthPackageId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(BandwidthPackageAddAcceleratorResponseBody model) {
            this.accelerators = model.accelerators;
            this.bandwidthPackageId = model.bandwidthPackageId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The GA instance IDs.</p>
         */
        public Builder accelerators(java.util.List<String> accelerators) {
            this.accelerators = accelerators;
            return this;
        }

        /**
         * <p>The bandwidth plan ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gbwp-bp1sgzldyj6b4q7cx****</p>
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B7770CB9-9745-4FE5-9EDA-D14B01A12A50</p>
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
