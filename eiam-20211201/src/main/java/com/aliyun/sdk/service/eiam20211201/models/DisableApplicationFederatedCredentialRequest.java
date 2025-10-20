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
 * {@link DisableApplicationFederatedCredentialRequest} extends {@link RequestModel}
 *
 * <p>DisableApplicationFederatedCredentialRequest</p>
 */
public class DisableApplicationFederatedCredentialRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationFederatedCredentialId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationFederatedCredentialId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private DisableApplicationFederatedCredentialRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
        this.applicationId = builder.applicationId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableApplicationFederatedCredentialRequest create() {
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
     * @return applicationFederatedCredentialId
     */
    public String getApplicationFederatedCredentialId() {
        return this.applicationFederatedCredentialId;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DisableApplicationFederatedCredentialRequest, Builder> {
        private String regionId; 
        private String applicationFederatedCredentialId; 
        private String applicationId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DisableApplicationFederatedCredentialRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationFederatedCredentialId = request.applicationFederatedCredentialId;
            this.applicationId = request.applicationId;
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
         * <p>应用联邦凭证Id</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>afc_aaaaa1111</p>
         */
        public Builder applicationFederatedCredentialId(String applicationFederatedCredentialId) {
            this.putQueryParameter("ApplicationFederatedCredentialId", applicationFederatedCredentialId);
            this.applicationFederatedCredentialId = applicationFederatedCredentialId;
            return this;
        }

        /**
         * <p>IDaaS的应用资源ID。</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
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
        public DisableApplicationFederatedCredentialRequest build() {
            return new DisableApplicationFederatedCredentialRequest(this);
        } 

    } 

}
