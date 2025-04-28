// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeRefundPriceRequest} extends {@link RequestModel}
 *
 * <p>DescribeRefundPriceRequest</p>
 */
public class DescribeRefundPriceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesktopId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> desktopId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RefundType")
    private String refundType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellerOwnerUid")
    private Long resellerOwnerUid;

    private DescribeRefundPriceRequest(Builder builder) {
        super(builder);
        this.desktopId = builder.desktopId;
        this.refundType = builder.refundType;
        this.regionId = builder.regionId;
        this.resellerOwnerUid = builder.resellerOwnerUid;
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
    public java.util.List<String> getDesktopId() {
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

    /**
     * @return resellerOwnerUid
     */
    public Long getResellerOwnerUid() {
        return this.resellerOwnerUid;
    }

    public static final class Builder extends Request.Builder<DescribeRefundPriceRequest, Builder> {
        private java.util.List<String> desktopId; 
        private String refundType; 
        private String regionId; 
        private Long resellerOwnerUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRefundPriceRequest request) {
            super(request);
            this.desktopId = request.desktopId;
            this.refundType = request.refundType;
            this.regionId = request.regionId;
            this.resellerOwnerUid = request.resellerOwnerUid;
        } 

        /**
         * <p>ID of cloud computer N. Valid values of N: 1 to 20.</p>
         * <p>This parameter is required.</p>
         */
        public Builder desktopId(java.util.List<String> desktopId) {
            this.putQueryParameter("DesktopId", desktopId);
            this.desktopId = desktopId;
            return this;
        }

        /**
         * <p>The unsubscription type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>RemainRefund: refunds the remaining balance and releases resources.</li>
         * <li>RenewRefund: refunds only the renewal fee and adjusts the expiration date accordingly.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RemainRefund</p>
         */
        public Builder refundType(String refundType) {
            this.putQueryParameter("RefundType", refundType);
            this.refundType = refundType;
            return this;
        }

        /**
         * <p>The ID of the region. You can call the <a href="~~DescribeRegions~~">DescribeRegions</a> operation to query the list of regions where Elastic Desktop Service (EDS) Enterprise is available.</p>
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

        /**
         * ResellerOwnerUid.
         */
        public Builder resellerOwnerUid(Long resellerOwnerUid) {
            this.putQueryParameter("ResellerOwnerUid", resellerOwnerUid);
            this.resellerOwnerUid = resellerOwnerUid;
            return this;
        }

        @Override
        public DescribeRefundPriceRequest build() {
            return new DescribeRefundPriceRequest(this);
        } 

    } 

}
