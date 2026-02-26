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
 * {@link CreateCloudAccountRequest} extends {@link RequestModel}
 *
 * <p>CreateCloudAccountRequest</p>
 */
public class CreateCloudAccountRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountExternalId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String cloudAccountExternalId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountName")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String cloudAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountProviderName")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String cloudAccountProviderName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CloudAccountVendorType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 32)
    private String cloudAccountVendorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(maxLength = 128)
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    private CreateCloudAccountRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clientToken = builder.clientToken;
        this.cloudAccountExternalId = builder.cloudAccountExternalId;
        this.cloudAccountName = builder.cloudAccountName;
        this.cloudAccountProviderName = builder.cloudAccountProviderName;
        this.cloudAccountVendorType = builder.cloudAccountVendorType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return cloudAccountExternalId
     */
    public String getCloudAccountExternalId() {
        return this.cloudAccountExternalId;
    }

    /**
     * @return cloudAccountName
     */
    public String getCloudAccountName() {
        return this.cloudAccountName;
    }

    /**
     * @return cloudAccountProviderName
     */
    public String getCloudAccountProviderName() {
        return this.cloudAccountProviderName;
    }

    /**
     * @return cloudAccountVendorType
     */
    public String getCloudAccountVendorType() {
        return this.cloudAccountVendorType;
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

    public static final class Builder extends Request.Builder<CreateCloudAccountRequest, Builder> {
        private String regionId; 
        private String clientToken; 
        private String cloudAccountExternalId; 
        private String cloudAccountName; 
        private String cloudAccountProviderName; 
        private String cloudAccountVendorType; 
        private String description; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCloudAccountRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clientToken = request.clientToken;
            this.cloudAccountExternalId = request.cloudAccountExternalId;
            this.cloudAccountName = request.cloudAccountName;
            this.cloudAccountProviderName = request.cloudAccountProviderName;
            this.cloudAccountVendorType = request.cloudAccountVendorType;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>client-token-example</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>云账号唯一标识</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder cloudAccountExternalId(String cloudAccountExternalId) {
            this.putQueryParameter("CloudAccountExternalId", cloudAccountExternalId);
            this.cloudAccountExternalId = cloudAccountExternalId;
            return this;
        }

        /**
         * <p>云账号名称</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_xxxx</p>
         */
        public Builder cloudAccountName(String cloudAccountName) {
            this.putQueryParameter("CloudAccountName", cloudAccountName);
            this.cloudAccountName = cloudAccountName;
            return this;
        }

        /**
         * <p>云账号提供商名称</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-eiam-oidc-provider</p>
         */
        public Builder cloudAccountProviderName(String cloudAccountProviderName) {
            this.putQueryParameter("CloudAccountProviderName", cloudAccountProviderName);
            this.cloudAccountProviderName = cloudAccountProviderName;
            return this;
        }

        /**
         * <p>云账号类型</p>
         * <p>This parameter is required.</p>
         */
        public Builder cloudAccountVendorType(String cloudAccountVendorType) {
            this.putQueryParameter("CloudAccountVendorType", cloudAccountVendorType);
            this.cloudAccountVendorType = cloudAccountVendorType;
            return this;
        }

        /**
         * <p>云账号描述</p>
         * 
         * <strong>example:</strong>
         * <p>cloud_accout_description</p>
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
        public CreateCloudAccountRequest build() {
            return new CreateCloudAccountRequest(this);
        } 

    } 

}
