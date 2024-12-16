// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteIdentityProviderRequest} extends {@link RequestModel}
 *
 * <p>DeleteIdentityProviderRequest</p>
 */
public class DeleteIdentityProviderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdentityProviderId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String identityProviderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private DeleteIdentityProviderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.identityProviderId = builder.identityProviderId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteIdentityProviderRequest create() {
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
     * @return identityProviderId
     */
    public String getIdentityProviderId() {
        return this.identityProviderId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DeleteIdentityProviderRequest, Builder> {
        private String regionId; 
        private String identityProviderId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteIdentityProviderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.identityProviderId = request.identityProviderId;
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
         * <p>IDaaS的身份提供方主键id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idp_my664lwkhpicbyzirog3xxxxx</p>
         */
        public Builder identityProviderId(String identityProviderId) {
            this.putQueryParameter("IdentityProviderId", identityProviderId);
            this.identityProviderId = identityProviderId;
            return this;
        }

        /**
         * <p>IDaaS EIAM的实例id</p>
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
        public DeleteIdentityProviderRequest build() {
            return new DeleteIdentityProviderRequest(this);
        } 

    } 

}
