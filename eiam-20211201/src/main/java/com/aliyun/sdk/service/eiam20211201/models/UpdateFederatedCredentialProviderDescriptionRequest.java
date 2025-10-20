// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link UpdateFederatedCredentialProviderDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateFederatedCredentialProviderDescriptionRequest</p>
 */
public class UpdateFederatedCredentialProviderDescriptionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String federatedCredentialProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateFederatedCredentialProviderDescriptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFederatedCredentialProviderDescriptionRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return federatedCredentialProviderId
     */
    public String getFederatedCredentialProviderId() {
        return this.federatedCredentialProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateFederatedCredentialProviderDescriptionRequest, Builder> {
        private String regionId; 
        private String description; 
        private String federatedCredentialProviderId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFederatedCredentialProviderDescriptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.federatedCredentialProviderId = request.federatedCredentialProviderId;
            this.instanceId = request.instanceId;
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
         * <p>联邦凭证提供方描述</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>联邦凭证提供方ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fcp_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder federatedCredentialProviderId(String federatedCredentialProviderId) {
            this.putQueryParameter("FederatedCredentialProviderId", federatedCredentialProviderId);
            this.federatedCredentialProviderId = federatedCredentialProviderId;
            return this;
        }

        /**
         * <p>IDaaS EIAM实例的ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UpdateFederatedCredentialProviderDescriptionRequest build() {
            return new UpdateFederatedCredentialProviderDescriptionRequest(this);
        } 

    } 

}
