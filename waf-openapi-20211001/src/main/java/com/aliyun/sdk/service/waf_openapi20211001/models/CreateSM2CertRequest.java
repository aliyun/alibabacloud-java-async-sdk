// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test-sm2</p>
         */
        public Builder certName(String certName) {
            this.putQueryParameter("CertName", certName);
            this.certName = certName;
            return this;
        }

        /**
         * <p>The content of the SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         * <hr>
         * <p>-----END CERTIFICATE-----</p>
         */
        public Builder encryptCertificate(String encryptCertificate) {
            this.putQueryParameter("EncryptCertificate", encryptCertificate);
            this.encryptCertificate = encryptCertificate;
            return this;
        }

        /**
         * <p>The private key of the SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----</p>
         * <hr>
         * <p>-----END PRIVATE KEY-----</p>
         */
        public Builder encryptPrivateKey(String encryptPrivateKey) {
            this.putQueryParameter("EncryptPrivateKey", encryptPrivateKey);
            this.encryptPrivateKey = encryptPrivateKey;
            return this;
        }

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region in which the WAF instance is deployed. Valid values:</p>
         * <ul>
         * <li><strong>cn-hangzhou</strong>: Chinese mainland.</li>
         * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm***q</p>
         */
        public Builder resourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
            this.putQueryParameter("ResourceManagerResourceGroupId", resourceManagerResourceGroupId);
            this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
            return this;
        }

        /**
         * <p>The content of the signing certificate for the SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----</p>
         * <hr>
         * <p>-----END CERTIFICATE-----</p>
         */
        public Builder signCertificate(String signCertificate) {
            this.putQueryParameter("SignCertificate", signCertificate);
            this.signCertificate = signCertificate;
            return this;
        }

        /**
         * <p>The private key of the signing certificate for the SM certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN PRIVATE KEY-----</p>
         * <hr>
         * <p>-----END PRIVATE KEY-----</p>
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
