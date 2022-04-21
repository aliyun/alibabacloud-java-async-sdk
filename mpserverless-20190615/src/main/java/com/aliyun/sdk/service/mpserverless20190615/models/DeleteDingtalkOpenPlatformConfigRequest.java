// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDingtalkOpenPlatformConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteDingtalkOpenPlatformConfigRequest</p>
 */
public class DeleteDingtalkOpenPlatformConfigRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DeleteDingtalkOpenPlatformConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDingtalkOpenPlatformConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteDingtalkOpenPlatformConfigRequest, Builder> {
        private String appId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDingtalkOpenPlatformConfigRequest request) {
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
        public DeleteDingtalkOpenPlatformConfigRequest build() {
            return new DeleteDingtalkOpenPlatformConfigRequest(this);
        } 

    } 

}
