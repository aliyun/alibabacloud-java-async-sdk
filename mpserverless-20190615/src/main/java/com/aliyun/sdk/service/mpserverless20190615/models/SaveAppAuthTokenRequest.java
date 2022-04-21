// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveAppAuthTokenRequest} extends {@link RequestModel}
 *
 * <p>SaveAppAuthTokenRequest</p>
 */
public class SaveAppAuthTokenRequest extends Request {
    @Body
    @NameInMap("AppAuthToken")
    @Validation(required = true)
    private String appAuthToken;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("IsvAppId")
    @Validation(required = true)
    private String isvAppId;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private SaveAppAuthTokenRequest(Builder builder) {
        super(builder);
        this.appAuthToken = builder.appAuthToken;
        this.appId = builder.appId;
        this.isvAppId = builder.isvAppId;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveAppAuthTokenRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appAuthToken
     */
    public String getAppAuthToken() {
        return this.appAuthToken;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return isvAppId
     */
    public String getIsvAppId() {
        return this.isvAppId;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<SaveAppAuthTokenRequest, Builder> {
        private String appAuthToken; 
        private String appId; 
        private String isvAppId; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveAppAuthTokenRequest request) {
            super(request);
            this.appAuthToken = request.appAuthToken;
            this.appId = request.appId;
            this.isvAppId = request.isvAppId;
            this.spaceId = request.spaceId;
        } 

        /**
         * AppAuthToken.
         */
        public Builder appAuthToken(String appAuthToken) {
            this.putBodyParameter("AppAuthToken", appAuthToken);
            this.appAuthToken = appAuthToken;
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

        /**
         * IsvAppId.
         */
        public Builder isvAppId(String isvAppId) {
            this.putBodyParameter("IsvAppId", isvAppId);
            this.isvAppId = isvAppId;
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
        public SaveAppAuthTokenRequest build() {
            return new SaveAppAuthTokenRequest(this);
        } 

    } 

}
