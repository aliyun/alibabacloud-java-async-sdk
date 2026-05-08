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
 * {@link UpdateYikeProductionMemberAuthRequest} extends {@link RequestModel}
 *
 * <p>UpdateYikeProductionMemberAuthRequest</p>
 */
public class UpdateYikeProductionMemberAuthRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Auth")
    @com.aliyun.core.annotation.Validation(required = true)
    private String auth;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("YikeUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String yikeUserId;

    private UpdateYikeProductionMemberAuthRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.auth = builder.auth;
        this.productionId = builder.productionId;
        this.yikeUserId = builder.yikeUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateYikeProductionMemberAuthRequest create() {
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
     * @return auth
     */
    public String getAuth() {
        return this.auth;
    }

    /**
     * @return productionId
     */
    public String getProductionId() {
        return this.productionId;
    }

    /**
     * @return yikeUserId
     */
    public String getYikeUserId() {
        return this.yikeUserId;
    }

    public static final class Builder extends Request.Builder<UpdateYikeProductionMemberAuthRequest, Builder> {
        private String regionId; 
        private String auth; 
        private String productionId; 
        private String yikeUserId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateYikeProductionMemberAuthRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.auth = request.auth;
            this.productionId = request.productionId;
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
         * <p>Manage</p>
         */
        public Builder auth(String auth) {
            this.putQueryParameter("Auth", auth);
            this.auth = auth;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pd_061716****</p>
         */
        public Builder productionId(String productionId) {
            this.putQueryParameter("ProductionId", productionId);
            this.productionId = productionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder yikeUserId(String yikeUserId) {
            this.putQueryParameter("YikeUserId", yikeUserId);
            this.yikeUserId = yikeUserId;
            return this;
        }

        @Override
        public UpdateYikeProductionMemberAuthRequest build() {
            return new UpdateYikeProductionMemberAuthRequest(this);
        } 

    } 

}
