// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateCenBandwidthPackageResponseBody model) {
            this.cenBandwidthPackageId = model.cenBandwidthPackageId;
            this.cenBandwidthPackageOrderId = model.cenBandwidthPackageOrderId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>cenbwp-4c2zaavbvh5fx****</p>
         */
        public Builder cenBandwidthPackageId(String cenBandwidthPackageId) {
            this.cenBandwidthPackageId = cenBandwidthPackageId;
            return this;
        }

        /**
         * <p>The ID of the order for the bandwidth plan.</p>
         * 
         * <strong>example:</strong>
         * <p>20156420004****</p>
         */
        public Builder cenBandwidthPackageOrderId(String cenBandwidthPackageOrderId) {
            this.cenBandwidthPackageOrderId = cenBandwidthPackageOrderId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E4B345CD-2CBA-4881-AF6D-E5D9BAE1CA7B</p>
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
