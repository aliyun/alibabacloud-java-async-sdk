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
 * {@link DescribeCommodityRequest} extends {@link RequestModel}
 *
 * <p>DescribeCommodityRequest</p>
 */
public class DescribeCommodityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeCommodityRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCommodityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commodityCode
     */
    public String getCommodityCode() {
        return this.commodityCode;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeCommodityRequest, Builder> {
        private String commodityCode; 
        private String orderType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCommodityRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The commodity code.</p>
         * <p>Valid values on the China site (aliyun.com):</p>
         * <ul>
         * <li><strong>ga_gapluspre_public_cn</strong>: GA instance.</li>
         * <li><strong>ga_plusbwppre_public_cn</strong>: basic bandwidth plan.</li>
         * </ul>
         * <p>Valid values on the international site (alibabacloud.com):</p>
         * <ul>
         * <li><strong>ga_pluspre_public_intl</strong>: GA instance.</li>
         * <li><strong>ga_bwppreintl_public_intl:</strong> basic bandwidth plan.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ga_gapluspre_public_cn</p>
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * <p>The type of the order. Valid values:</p>
         * <ul>
         * <li><strong>BUY</strong>: purchase order.</li>
         * <li><strong>RENEW</strong>: renewal order.</li>
         * <li><strong>UPGRADE</strong>: upgrade order.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The ID of the region where the Global Accelerator (GA) instance is deployed. Set the value to <strong>cn-hangzhou</strong>.</p>
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
        public DescribeCommodityRequest build() {
            return new DescribeCommodityRequest(this);
        } 

    } 

}
