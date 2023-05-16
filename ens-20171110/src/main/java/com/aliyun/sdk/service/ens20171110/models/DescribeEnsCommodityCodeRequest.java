// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEnsCommodityCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeEnsCommodityCodeRequest</p>
 */
public class DescribeEnsCommodityCodeRequest extends Request {
    @Query
    @NameInMap("CommodityCode")
    private String commodityCode;

    private DescribeEnsCommodityCodeRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEnsCommodityCodeRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeEnsCommodityCodeRequest, Builder> {
        private String commodityCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeEnsCommodityCodeRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putQueryParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        @Override
        public DescribeEnsCommodityCodeRequest build() {
            return new DescribeEnsCommodityCodeRequest(this);
        } 

    } 

}
