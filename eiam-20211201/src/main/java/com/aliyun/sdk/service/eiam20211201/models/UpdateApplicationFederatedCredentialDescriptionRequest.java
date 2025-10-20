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
 * {@link UpdateApplicationFederatedCredentialDescriptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationFederatedCredentialDescriptionRequest</p>
 */
public class UpdateApplicationFederatedCredentialDescriptionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private UpdateApplicationFederatedCredentialDescriptionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationFederatedCredentialId = builder.applicationFederatedCredentialId;
        this.applicationId = builder.applicationId;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationFederatedCredentialDescriptionRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationFederatedCredentialDescriptionRequest, Builder> {
        private String regionId; 
        private String applicationFederatedCredentialId; 
        private String applicationId; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationFederatedCredentialDescriptionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationFederatedCredentialId = request.applicationFederatedCredentialId;
            this.applicationId = request.applicationId;
            this.description = request.description;
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
         * <p>联邦凭证描述</p>
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
        public UpdateApplicationFederatedCredentialDescriptionRequest build() {
            return new UpdateApplicationFederatedCredentialDescriptionRequest(this);
        } 

    } 

}
