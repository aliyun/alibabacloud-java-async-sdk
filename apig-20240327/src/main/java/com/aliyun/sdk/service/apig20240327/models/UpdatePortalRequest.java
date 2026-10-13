// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link UpdatePortalRequest} extends {@link RequestModel}
 *
 * <p>UpdatePortalRequest</p>
 */
public class UpdatePortalRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("portalId")
    private String portalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("portalSettingConfig")
    private HiMarketPortalSettingConfig portalSettingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    private UpdatePortalRequest(Builder builder) {
        super(builder);
        this.portalId = builder.portalId;
        this.description = builder.description;
        this.name = builder.name;
        this.portalSettingConfig = builder.portalSettingConfig;
        this.clientToken = builder.clientToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePortalRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portalId
     */
    public String getPortalId() {
        return this.portalId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return portalSettingConfig
     */
    public HiMarketPortalSettingConfig getPortalSettingConfig() {
        return this.portalSettingConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    public static final class Builder extends Request.Builder<UpdatePortalRequest, Builder> {
        private String portalId; 
        private String description; 
        private String name; 
        private HiMarketPortalSettingConfig portalSettingConfig; 
        private String clientToken; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePortalRequest request) {
            super(request);
            this.portalId = request.portalId;
            this.description = request.description;
            this.name = request.name;
            this.portalSettingConfig = request.portalSettingConfig;
            this.clientToken = request.clientToken;
        } 

        /**
         * <p>The ID of the portal to update. This is the primary ID of the portal resource. You can obtain the portal ID from the response of the CreatePortal operation or from a portal item in the response of the ListPortals operation. This ID is used in the /himarket/v1/portals/{portalId} path to locate the portal, which is the same path used by the GetPortal, UpdatePortal, and DeletePortal operations.</p>
         * 
         * <strong>example:</strong>
         * <p>portal-xxxxxxxx</p>
         */
        public Builder portalId(String portalId) {
            this.putPathParameter("portalId", portalId);
            this.portalId = portalId;
            return this;
        }

        /**
         * <p>The description of the portal.</p>
         * 
         * <strong>example:</strong>
         * <p>HiMarket portal for internal developers</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the portal.</p>
         * 
         * <strong>example:</strong>
         * <p>developer-portal</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The portal configurations, including whether to enable username and password authentication, whether to automatically approve developer registrations, and whether to automatically approve subscription requests.</p>
         */
        public Builder portalSettingConfig(HiMarketPortalSettingConfig portalSettingConfig) {
            this.putBodyParameter("portalSettingConfig", portalSettingConfig);
            this.portalSettingConfig = portalSettingConfig;
            return this;
        }

        /**
         * <p>The idempotency token. The token is generated by the caller and must be unique. It is used to prevent duplicate submissions of the same update request.</p>
         * 
         * <strong>example:</strong>
         * <p>5f7a2c1e-9b3d-4e8f-a1c6-0d2b8e4f7a13</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        @Override
        public UpdatePortalRequest build() {
            return new UpdatePortalRequest(this);
        } 

    } 

}
