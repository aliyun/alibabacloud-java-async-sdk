// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteMessageAppRequest} extends {@link RequestModel}
 *
 * <p>DeleteMessageAppRequest</p>
 */
public class DeleteMessageAppRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    private DeleteMessageAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMessageAppRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    public static final class Builder extends Request.Builder<DeleteMessageAppRequest, Builder> {
        private String regionId; 
        private String appId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMessageAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
        } 

        /**
         * cn-shanghai
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        @Override
        public DeleteMessageAppRequest build() {
            return new DeleteMessageAppRequest(this);
        } 

    } 

}
