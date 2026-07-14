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
 * {@link CreateApiKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateApiKeyRequest</p>
 */
public class CreateApiKeyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String keyName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIds")
    private java.util.List<String> serviceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateApiKeyRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.keyName = builder.keyName;
        this.regionId = builder.regionId;
        this.serviceIds = builder.serviceIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApiKeyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return keyName
     */
    public String getKeyName() {
        return this.keyName;
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

    public static final class Builder extends Request.Builder<CreateApiKeyRequest, Builder> {
        private String description; 
        private String keyName; 
        private String regionId; 
        private java.util.List<String> serviceIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateApiKeyRequest request) {
            super(request);
            this.description = request.description;
            this.keyName = request.keyName;
            this.regionId = request.regionId;
            this.serviceIds = request.serviceIds;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my api key</p>
         */
        public Builder keyName(String keyName) {
            this.putQueryParameter("KeyName", keyName);
            this.keyName = keyName;
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
         * ServiceIds.
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
        public CreateApiKeyRequest build() {
            return new CreateApiKeyRequest(this);
        } 

    } 

}
