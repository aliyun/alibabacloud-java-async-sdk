// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link AddYikeProductionMembersRequest} extends {@link RequestModel}
 *
 * <p>AddYikeProductionMembersRequest</p>
 */
public class AddYikeProductionMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yikeUserIds;

    private AddYikeProductionMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.productionId = builder.productionId;
        this.yikeUserIds = builder.yikeUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddYikeProductionMembersRequest create() {
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
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return yikeUserIds
     */
    public String getYikeUserIds() {
        return this.yikeUserIds;
    }

    public static final class Builder extends Request.Builder<AddYikeProductionMembersRequest, Builder> {
        private String regionId; 
        private String productionId; 
        private String yikeUserIds; 

        private Builder() {
            super();
        } 

        private Builder(AddYikeProductionMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.productionId = request.productionId;
            this.yikeUserIds = request.yikeUserIds;
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
         * <p>pd_061716***</p>
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21*****</p>
         */
        public Builder yikeUserIds(String yikeUserIds) {
            this.putQueryParameter("YikeUserIds", yikeUserIds);
            this.yikeUserIds = yikeUserIds;
            return this;
        }

        @Override
        public AddYikeProductionMembersRequest build() {
            return new AddYikeProductionMembersRequest(this);
        } 

    } 

}
