// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWechatOpenPlatformConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteWechatOpenPlatformConfigRequest</p>
 */
public class DeleteWechatOpenPlatformConfigRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DeleteWechatOpenPlatformConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWechatOpenPlatformConfigRequest create() {
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DeleteWechatOpenPlatformConfigRequest, Builder> {
        private String appId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWechatOpenPlatformConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.spaceId = request.spaceId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DeleteWechatOpenPlatformConfigRequest build() {
            return new DeleteWechatOpenPlatformConfigRequest(this);
        } 

    } 

}
