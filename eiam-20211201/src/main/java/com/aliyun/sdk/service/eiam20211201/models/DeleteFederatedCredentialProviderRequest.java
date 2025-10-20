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
 * {@link DeleteFederatedCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteFederatedCredentialProviderRequest</p>
 */
public class DeleteFederatedCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FederatedCredentialProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String federatedCredentialProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private DeleteFederatedCredentialProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.federatedCredentialProviderId = builder.federatedCredentialProviderId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFederatedCredentialProviderRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFederatedCredentialProviderRequest, Builder> {
        private String regionId; 
        private String federatedCredentialProviderId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFederatedCredentialProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public DeleteFederatedCredentialProviderRequest build() {
            return new DeleteFederatedCredentialProviderRequest(this);
        } 

    } 

}
