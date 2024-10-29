// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeRefundPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRefundPriceRequest</p>
 */
public class DescribeRefundPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefundType")
    private String refundType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeRefundPriceRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.refundType = builder.refundType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRefundPriceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return desktopId
     */
    public java.util.List < String > getDesktopId() {
        return this.desktopId;
    }

    /**
     * @return refundType
     */
    public String getRefundType() {
        return this.refundType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeRefundPriceRequest, Builder> {
        private java.util.List < String > desktopId; 
        private String refundType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRefundPriceRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.refundType = request.refundType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List < String > desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * RefundType.
         */
        public Builder refundType(String refundType) {
            this.putQueryParameter("RefundType", refundType);
            this.refundType = refundType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeRefundPriceRequest build() {
            return new DescribeRefundPriceRequest(this);
        } 

    } 

}
