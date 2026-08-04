// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link RevokeApiKeyRequest} extends {@link RequestModel}
 *
 * <p>RevokeApiKeyRequest</p>
 */
public class RevokeApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> serviceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private RevokeApiKeyRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.regionId = builder.regionId;
        this.serviceIds = builder.serviceIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return serviceIds
     */
    public java.util.List<String> getServiceIds() {
        return this.serviceIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RevokeApiKeyRequest, Builder> {
        private String keyId; 
        private String regionId; 
        private java.util.List<String> serviceIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeApiKeyRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.regionId = request.regionId;
            this.serviceIds = request.serviceIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>API KEY ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>api-xxxxxx</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder serviceIds(java.util.List<String> serviceIds) {
            String serviceIdsShrink = shrink(serviceIds, "ServiceIds", "json");
            this.putQueryParameter("ServiceIds", serviceIdsShrink);
            this.serviceIds = serviceIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-*****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RevokeApiKeyRequest build() {
            return new RevokeApiKeyRequest(this);
        } 

    } 

}
