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
 * {@link UpdateApplicationClientSecretExpirationTimeRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationClientSecretExpirationTimeRequest</p>
 */
public class UpdateApplicationClientSecretExpirationTimeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpirationTime")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128)
    private Long expirationTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String secretId;

    private UpdateApplicationClientSecretExpirationTimeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applicationId = builder.applicationId;
        this.expirationTime = builder.expirationTime;
        this.instanceId = builder.instanceId;
        this.secretId = builder.secretId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateApplicationClientSecretExpirationTimeRequest create() {
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
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return expirationTime
     */
    public Long getExpirationTime() {
        return this.expirationTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    public static final class Builder extends Request.Builder<UpdateApplicationClientSecretExpirationTimeRequest, Builder> {
        private String regionId; 
        private String applicationId; 
        private Long expirationTime; 
        private String instanceId; 
        private String secretId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateApplicationClientSecretExpirationTimeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applicationId = request.applicationId;
            this.expirationTime = request.expirationTime;
            this.instanceId = request.instanceId;
            this.secretId = request.secretId;
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
         * <p>client secret的有效期时间，Unix时间戳格式，单位为毫秒</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1735530123762</p>
         */
        public Builder expirationTime(Long expirationTime) {
            this.putQueryParameter("ExpirationTime", expirationTime);
            this.expirationTime = expirationTime;
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

        /**
         * <p>OIDC 场景下用于客户端身份验证的客户端密钥</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sct_11111</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        @Override
        public UpdateApplicationClientSecretExpirationTimeRequest build() {
            return new UpdateApplicationClientSecretExpirationTimeRequest(this);
        } 

    } 

}
