// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mseap20210118.models;

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
 * {@link GetPlatformUserInfoForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetPlatformUserInfoForPartnerRequest</p>
 */
public class GetPlatformUserInfoForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private String platformType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private GetPlatformUserInfoForPartnerRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.platformType = builder.platformType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPlatformUserInfoForPartnerRequest create() {
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
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<GetPlatformUserInfoForPartnerRequest, Builder> {
        private String appId; 
        private String platformType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(GetPlatformUserInfoForPartnerRequest request) {
            super(request);
            this.appId = request.appId;
            this.platformType = request.platformType;
            this.userId = request.userId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PlatformType.
         */
        public Builder platformType(String platformType) {
            this.putQueryParameter("PlatformType", platformType);
            this.platformType = platformType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public GetPlatformUserInfoForPartnerRequest build() {
            return new GetPlatformUserInfoForPartnerRequest(this);
        } 

    } 

}
