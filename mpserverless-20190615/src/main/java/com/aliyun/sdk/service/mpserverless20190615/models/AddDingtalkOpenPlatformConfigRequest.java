// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDingtalkOpenPlatformConfigRequest} extends {@link RequestModel}
 *
 * <p>AddDingtalkOpenPlatformConfigRequest</p>
 */
public class AddDingtalkOpenPlatformConfigRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true, maxLength = 64)
    private String appId;

    @Body
    @NameInMap("AppSecret")
    @Validation(required = true, maxLength = 200)
    private String appSecret;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private AddDingtalkOpenPlatformConfigRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.appSecret = builder.appSecret;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDingtalkOpenPlatformConfigRequest create() {
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
     * @return appSecret
     */
    public String getAppSecret() {
        return this.appSecret;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<AddDingtalkOpenPlatformConfigRequest, Builder> {
        private String appId; 
        private String appSecret; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(AddDingtalkOpenPlatformConfigRequest request) {
            super(request);
            this.appId = request.appId;
            this.appSecret = request.appSecret;
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
         * AppSecret.
         */
        public Builder appSecret(String appSecret) {
            this.putBodyParameter("AppSecret", appSecret);
            this.appSecret = appSecret;
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
        public AddDingtalkOpenPlatformConfigRequest build() {
            return new AddDingtalkOpenPlatformConfigRequest(this);
        } 

    } 

}
