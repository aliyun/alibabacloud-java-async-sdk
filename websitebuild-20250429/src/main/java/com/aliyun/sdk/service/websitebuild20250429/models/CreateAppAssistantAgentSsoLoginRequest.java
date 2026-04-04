// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link CreateAppAssistantAgentSsoLoginRequest} extends {@link RequestModel}
 *
 * <p>CreateAppAssistantAgentSsoLoginRequest</p>
 */
public class CreateAppAssistantAgentSsoLoginRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformType")
    private String platformType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetUrl")
    private String targetUrl;

    private CreateAppAssistantAgentSsoLoginRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.platformType = builder.platformType;
        this.targetUrl = builder.targetUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppAssistantAgentSsoLoginRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return platformType
     */
    public String getPlatformType() {
        return this.platformType;
    }

    /**
     * @return targetUrl
     */
    public String getTargetUrl() {
        return this.targetUrl;
    }

    public static final class Builder extends Request.Builder<CreateAppAssistantAgentSsoLoginRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String platformType; 
        private String targetUrl; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppAssistantAgentSsoLoginRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.platformType = request.platformType;
            this.targetUrl = request.targetUrl;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
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
         * TargetUrl.
         */
        public Builder targetUrl(String targetUrl) {
            this.putQueryParameter("TargetUrl", targetUrl);
            this.targetUrl = targetUrl;
            return this;
        }

        @Override
        public CreateAppAssistantAgentSsoLoginRequest build() {
            return new CreateAppAssistantAgentSsoLoginRequest(this);
        } 

    } 

}
