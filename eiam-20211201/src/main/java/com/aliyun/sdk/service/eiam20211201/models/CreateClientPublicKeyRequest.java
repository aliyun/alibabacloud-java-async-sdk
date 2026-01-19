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
 * {@link CreateClientPublicKeyRequest} extends {@link RequestModel}
 *
 * <p>CreateClientPublicKeyRequest</p>
 */
public class CreateClientPublicKeyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlgorithmType")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String algorithmType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PublicKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String publicKey;

    private CreateClientPublicKeyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.algorithmType = builder.algorithmType;
        this.applicationId = builder.applicationId;
        this.clientToken = builder.clientToken;
        this.instanceId = builder.instanceId;
        this.publicKey = builder.publicKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateClientPublicKeyRequest create() {
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
     * @return algorithmType
     */
    public String getAlgorithmType() {
        return this.algorithmType;
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return publicKey
     */
    public String getPublicKey() {
        return this.publicKey;
    }

    public static final class Builder extends Request.Builder<CreateClientPublicKeyRequest, Builder> {
        private String regionId; 
        private String algorithmType; 
        private String applicationId; 
        private String clientToken; 
        private String instanceId; 
        private String publicKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateClientPublicKeyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.algorithmType = request.algorithmType;
            this.applicationId = request.applicationId;
            this.clientToken = request.clientToken;
            this.instanceId = request.instanceId;
            this.publicKey = request.publicKey;
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
         * <p>IDaaS的应用ClientpublicKey算法类型</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA-2048</p>
         */
        public Builder algorithmType(String algorithmType) {
            this.putQueryParameter("AlgorithmType", algorithmType);
            this.algorithmType = algorithmType;
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
         * <p>应用ClientpublicKey的公钥，只接收 PEM 格式</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PUBLIC KEY-----
         * MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmnWMdp9FU3vXljeIqpgR
         * 05E6jEgzIfKsFaLkv+07e2Lg8luTaJh8Q2nkbxdNpTfqBnMMyTgml88WktP45F78
         * La7hQtR3vz0Eu1yA92gXwD5Oob7ay4JYQZ0C80o2tB3FsbXG2jUvr31MNkf/0oBY
         * qUKK5Hnlk1TdrnZ5VkzgLGHKlj+NJHHF/57DbT64C2qpAWeKHAr9umJ8++0hKqG/
         * oRSOpb7oWK4t5c39ulp1j5JJ6cwqrKVCXvsHfWHywOHkcyus+ZNPTQvpwjRnEmRz
         * Vy3NWrjT7JlIa8vS1aUU+FxeFd2MLQzxFxquFLwi05su2faRexaeYwWW6IWAI3tX
         * twxxxxxx
         * -----END PUBLIC KEY-----</p>
         */
        public Builder publicKey(String publicKey) {
            this.putQueryParameter("PublicKey", publicKey);
            this.publicKey = publicKey;
            return this;
        }

        @Override
        public CreateClientPublicKeyRequest build() {
            return new CreateClientPublicKeyRequest(this);
        } 

    } 

}
