// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserBuyStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserBuyStatusRequest</p>
 */
public class DescribeUserBuyStatusRequest extends Request {
    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SubUserId")
    private Long subUserId;

    private DescribeUserBuyStatusRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.subUserId = builder.subUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserBuyStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subUserId
     */
    public Long getSubUserId() {
        return this.subUserId;
    }

    public static final class Builder extends Request.Builder<DescribeUserBuyStatusRequest, Builder> {
        private String regionId; 
        private Long subUserId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserBuyStatusRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.subUserId = request.subUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubUserId.
         */
        public Builder subUserId(Long subUserId) {
            this.putBodyParameter("SubUserId", subUserId);
            this.subUserId = subUserId;
            return this;
        }

        @Override
        public DescribeUserBuyStatusRequest build() {
            return new DescribeUserBuyStatusRequest(this);
        } 

    } 

}
