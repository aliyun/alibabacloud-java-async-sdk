// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketplaceintl20220726.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImageCommodityInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeImageCommodityInfoRequest</p>
 */
public class DescribeImageCommodityInfoRequest extends Request {
    @Body
    @NameInMap("CommodityCode")
    private String commodityCode;

    @Body
    @NameInMap("RequestId")
    private String requestId;

    @Body
    @NameInMap("Uid")
    private String uid;

    private DescribeImageCommodityInfoRequest(Builder builder) {
        super(builder);
        this.commodityCode = builder.commodityCode;
        this.requestId = builder.requestId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImageCommodityInfoRequest create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<DescribeImageCommodityInfoRequest, Builder> {
        private String commodityCode; 
        private String requestId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImageCommodityInfoRequest request) {
            super(request);
            this.commodityCode = request.commodityCode;
            this.requestId = request.requestId;
            this.uid = request.uid;
        } 

        /**
         * CommodityCode.
         */
        public Builder commodityCode(String commodityCode) {
            this.putBodyParameter("CommodityCode", commodityCode);
            this.commodityCode = commodityCode;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putBodyParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * Uid.
         */
        public Builder uid(String uid) {
            this.putBodyParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public DescribeImageCommodityInfoRequest build() {
            return new DescribeImageCommodityInfoRequest(this);
        } 

    } 

}
