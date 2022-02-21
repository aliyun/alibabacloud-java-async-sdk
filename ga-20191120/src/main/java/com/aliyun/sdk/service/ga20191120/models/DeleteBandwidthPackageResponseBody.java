// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteBandwidthPackageResponseBody</p>
 */
public class DeleteBandwidthPackageResponseBody extends TeaModel {
    @NameInMap("BandwidthPackageId")
    private String bandwidthPackageId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteBandwidthPackageResponseBody(Builder builder) {
        this.bandwidthPackageId = builder.bandwidthPackageId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBandwidthPackageResponseBody create() {
        return builder().build();
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
        private String bandwidthPackageId; 
        private String requestId; 

        /**
         * BandwidthPackageId.
         */
        public Builder bandwidthPackageId(String bandwidthPackageId) {
            this.bandwidthPackageId = bandwidthPackageId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteBandwidthPackageResponseBody build() {
            return new DeleteBandwidthPackageResponseBody(this);
        } 

    } 

}
