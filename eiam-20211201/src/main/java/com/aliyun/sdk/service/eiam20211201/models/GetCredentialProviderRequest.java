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
 * {@link GetCredentialProviderRequest} extends {@link RequestModel}
 *
 * <p>GetCredentialProviderRequest</p>
 */
public class GetCredentialProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CredentialProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String credentialProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private GetCredentialProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.credentialProviderId = builder.credentialProviderId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCredentialProviderRequest create() {
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
     * @return credentialProviderId
     */
    public String getCredentialProviderId() {
        return this.credentialProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetCredentialProviderRequest, Builder> {
        private String regionId; 
        private String credentialProviderId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCredentialProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.credentialProviderId = request.credentialProviderId;
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
         * <p>认证令牌提供商ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>atp_01kr2cmj5gxxx4fvmls2e93dxxxxx</p>
         */
        public Builder credentialProviderId(String credentialProviderId) {
            this.putQueryParameter("CredentialProviderId", credentialProviderId);
            this.credentialProviderId = credentialProviderId;
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
        public GetCredentialProviderRequest build() {
            return new GetCredentialProviderRequest(this);
        } 

    } 

}
