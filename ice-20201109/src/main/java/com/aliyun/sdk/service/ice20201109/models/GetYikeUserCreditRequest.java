// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetYikeUserCreditRequest} extends {@link RequestModel}
 *
 * <p>GetYikeUserCreditRequest</p>
 */
public class GetYikeUserCreditRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yikeUserId;

    private GetYikeUserCreditRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.yikeUserId = builder.yikeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetYikeUserCreditRequest create() {
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
     * @return yikeUserId
     */
    public String getYikeUserId() {
        return this.yikeUserId;
    }

    public static final class Builder extends Request.Builder<GetYikeUserCreditRequest, Builder> {
        private String regionId; 
        private String yikeUserId; 

        private Builder() {
            super();
        } 

        private Builder(GetYikeUserCreditRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.yikeUserId = request.yikeUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>id</p>
         */
        public Builder yikeUserId(String yikeUserId) {
            this.putQueryParameter("YikeUserId", yikeUserId);
            this.yikeUserId = yikeUserId;
            return this;
        }

        @Override
        public GetYikeUserCreditRequest build() {
            return new GetYikeUserCreditRequest(this);
        } 

    } 

}
