// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteAppRequest</p>
 */
public class DeleteAppRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteAppRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAppRequest, Builder> {
        private String appId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAppRequest request) {
            super(request);
            this.appId = request.appId;
            this.regionId = request.regionId;
        } 

        /**
         * 应用唯一标识
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteAppRequest build() {
            return new DeleteAppRequest(this);
        } 

    } 

}
