// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenBandwidthPackageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCenBandwidthPackageResponseBody</p>
 */
public class CreateCenBandwidthPackageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageId")
    private String cenBandwidthPackageId;

    @com.aliyun.core.annotation.NameInMap("CenBandwidthPackageOrderId")
    private String cenBandwidthPackageOrderId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCenBandwidthPackageResponseBody(Builder builder) {
        this.cenBandwidthPackageId = builder.cenBandwidthPackageId;
        this.cenBandwidthPackageOrderId = builder.cenBandwidthPackageOrderId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCenBandwidthPackageResponseBody create() {
        return builder().build();
    }

    /**
     * @return cenBandwidthPackageId
     */
    public String getCenBandwidthPackageId() {
        return this.cenBandwidthPackageId;
    }

    /**
     * @return cenBandwidthPackageOrderId
     */
    public String getCenBandwidthPackageOrderId() {
        return this.cenBandwidthPackageOrderId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cenBandwidthPackageId; 
        private String cenBandwidthPackageOrderId; 
        private String requestId; 

        /**
         * The ID of the bandwidth plan.
         */
        public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }

        /**
         * The ID of the order for the bandwidth plan.
         */
        public Builder cenBandwidthPackageOrderId(String cenBandwidthPackageOrderId) {
            this.cenBandwidthPackageOrderId = cenBandwidthPackageOrderId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCenBandwidthPackageResponseBody build() {
            return new CreateCenBandwidthPackageResponseBody(this);
        } 

    } 

}
