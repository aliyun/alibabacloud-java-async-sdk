// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMapDataRequest} extends {@link RequestModel}
 *
 * <p>GetMapDataRequest</p>
 */
public class GetMapDataRequest extends Request {
    @Body
    @NameInMap("AppId")
    private String appId;

    @Body
    @NameInMap("JwtToken")
    private String jwtToken;

    private GetMapDataRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMapDataRequest create() {
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
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<GetMapDataRequest, Builder> {
        private String appId; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(GetMapDataRequest request) {
            super(request);
            this.appId = request.appId;
            this.jwtToken = request.jwtToken;
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
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putBodyParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public GetMapDataRequest build() {
            return new GetMapDataRequest(this);
        } 

    } 

}
