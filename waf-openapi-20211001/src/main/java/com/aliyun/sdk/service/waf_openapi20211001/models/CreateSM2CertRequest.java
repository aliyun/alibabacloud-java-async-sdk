// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSM2CertRequest} extends {@link RequestModel}
 *
 * <p>CreateSM2CertRequest</p>
 */
public class CreateSM2CertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertName")
    private String certName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptCertificate")
    private String encryptCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EncryptPrivateKey")
    private String encryptPrivateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceManagerResourceGroupId")
    private String resourceManagerResourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignCertificate")
    private String signCertificate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SignPrivateKey")
    private String signPrivateKey;

    private CreateSM2CertRequest(Builder builder) {
        super(builder);
        this.certName = builder.certName;
        this.encryptCertificate = builder.encryptCertificate;
        this.encryptPrivateKey = builder.encryptPrivateKey;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.resourceManagerResourceGroupId = builder.resourceManagerResourceGroupId;
        this.signCertificate = builder.signCertificate;
        this.signPrivateKey = builder.signPrivateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSM2CertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certName
     */
    public String getCertName() {
        return this.certName;
    }

    /**
     * @return encryptCertificate
     */
    public String getEncryptCertificate() {
        return this.encryptCertificate;
    }

    /**
     * @return encryptPrivateKey
     */
    public String getEncryptPrivateKey() {
        return this.encryptPrivateKey;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceManagerResourceGroupId
     */
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    /**
     * @return signCertificate
     */
    public String getSignCertificate() {
        return this.signCertificate;
    }

    /**
     * @return signPrivateKey
     */
    public String getSignPrivateKey() {
        return this.signPrivateKey;
    }

    public static final class Builder extends Request.Builder<CreateSM2CertRequest, Builder> {
        private String certName; 
        private String encryptCertificate; 
        private String encryptPrivateKey; 
        private String instanceId; 
        private String regionId; 
        private String resourceManagerResourceGroupId; 
        private String signCertificate; 
        private String signPrivateKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateSM2CertRequest request) {
            super(request);
            this.certName = request.certName;
            this.encryptCertificate = request.encryptCertificate;
            this.encryptPrivateKey = request.encryptPrivateKey;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.resourceManagerResourceGroupId = request.resourceManagerResourceGroupId;
            this.signCertificate = request.signCertificate;
            this.signPrivateKey = request.signPrivateKey;
        } 

        /**
         * The name of the SM certificate.
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * The content of the SM certificate.
         */
        public Builder encryptCertificate(String encryptCertificate) {
            this.putQueryParameter("EncryptCertificate", encryptCertificate);
            this.encryptCertificate = encryptCertificate;
            return this;
        }

        /**
         * The private key of the SM certificate.
         */
        public Builder encryptPrivateKey(String encryptPrivateKey) {
            this.putQueryParameter("EncryptPrivateKey", encryptPrivateKey);
            this.encryptPrivateKey = encryptPrivateKey;
            return this;
        }

        /**
         * The ID of the WAF instance.
         * <p>
         * 
         * >  You can call the [DescribeInstance](~~433756~~) operation to query the ID of the WAF instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The region in which the WAF instance is deployed. Valid values:
         * <p>
         * 
         * *   **cn-hangzhou**: Chinese mainland.
         * *   **ap-southeast-1**: outside the Chinese mainland.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud resource group.
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * The content of the signing certificate for the SM certificate.
         */
        public Builder signCertificate(String signCertificate) {
            this.putQueryParameter("SignCertificate", signCertificate);
            this.signCertificate = signCertificate;
            return this;
        }

        /**
         * The private key of the signing certificate for the SM certificate.
         */
        public Builder signPrivateKey(String signPrivateKey) {
            this.putQueryParameter("SignPrivateKey", signPrivateKey);
            this.signPrivateKey = signPrivateKey;
            return this;
        }

        @Override
        public CreateSM2CertRequest build() {
            return new CreateSM2CertRequest(this);
        } 

    } 

}
