// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UpdateInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateInstanceRequest</p>
 */
public class UpdateInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoReissue")
    private String autoReissue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("City")
    private String city;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CompanyId")
    private Long companyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactIdList")
    private java.util.List<Long> contactIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CountryCode")
    private String countryCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Csr")
    private String csr;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateCsrMethod")
    private String generateCsrMethod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
    private String keyAlgorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Province")
    private String province;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<Tags> tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidationMethod")
    private String validationMethod;

    private UpdateInstanceRequest(Builder builder) {
        super(builder);
        this.autoReissue = builder.autoReissue;
        this.certificateName = builder.certificateName;
        this.city = builder.city;
        this.companyId = builder.companyId;
        this.contactIdList = builder.contactIdList;
        this.countryCode = builder.countryCode;
        this.csr = builder.csr;
        this.domain = builder.domain;
        this.generateCsrMethod = builder.generateCsrMethod;
        this.instanceId = builder.instanceId;
        this.keyAlgorithm = builder.keyAlgorithm;
        this.province = builder.province;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.validationMethod = builder.validationMethod;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoReissue
     */
    public String getAutoReissue() {
        return this.autoReissue;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return city
     */
    public String getCity() {
        return this.city;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return contactIdList
     */
    public java.util.List<Long> getContactIdList() {
        return this.contactIdList;
    }

    /**
     * @return countryCode
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * @return csr
     */
    public String getCsr() {
        return this.csr;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return generateCsrMethod
     */
    public String getGenerateCsrMethod() {
        return this.generateCsrMethod;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return keyAlgorithm
     */
    public String getKeyAlgorithm() {
        return this.keyAlgorithm;
    }

    /**
     * @return province
     */
    public String getProvince() {
        return this.province;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List<Tags> getTags() {
        return this.tags;
    }

    /**
     * @return validationMethod
     */
    public String getValidationMethod() {
        return this.validationMethod;
    }

    public static final class Builder extends Request.Builder<UpdateInstanceRequest, Builder> {
        private String autoReissue; 
        private String certificateName; 
        private String city; 
        private Long companyId; 
        private java.util.List<Long> contactIdList; 
        private String countryCode; 
        private String csr; 
        private String domain; 
        private String generateCsrMethod; 
        private String instanceId; 
        private String keyAlgorithm; 
        private String province; 
        private String resourceGroupId; 
        private java.util.List<Tags> tags; 
        private String validationMethod; 

        private Builder() {
            super();
        } 

        private Builder(UpdateInstanceRequest request) {
            super(request);
            this.autoReissue = request.autoReissue;
            this.certificateName = request.certificateName;
            this.city = request.city;
            this.companyId = request.companyId;
            this.contactIdList = request.contactIdList;
            this.countryCode = request.countryCode;
            this.csr = request.csr;
            this.domain = request.domain;
            this.generateCsrMethod = request.generateCsrMethod;
            this.instanceId = request.instanceId;
            this.keyAlgorithm = request.keyAlgorithm;
            this.province = request.province;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.validationMethod = request.validationMethod;
        } 

        /**
         * <p>Specifies whether to enable automatic hosting. Valid values:</p>
         * <ul>
         * <li>enable: Enabled.</li>
         * <li>disable: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder autoReissue(String autoReissue) {
            this.putQueryParameter("AutoReissue", autoReissue);
            this.autoReissue = autoReissue;
            return this;
        }

        /**
         * <p>The name of the instance. When a certificate is issued, this name is used as the default name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder certificateName(String certificateName) {
            this.putQueryParameter("CertificateName", certificateName);
            this.certificateName = certificateName;
            return this;
        }

        /**
         * <p>The city where the company or organization of the certificate purchaser is located. This field is required when generating a CSR for a DV certificate. Default value: Beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder city(String city) {
            this.putQueryParameter("City", city);
            this.city = city;
            return this;
        }

        /**
         * <p>The company information ID. This parameter is required for OV and EV certificates. Otherwise, you cannot call the ApplyCertificate operation to apply for a certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>44211</p>
         */
        public Builder companyId(Long companyId) {
            this.putQueryParameter("CompanyId", companyId);
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>The list of contact IDs. If a contact already exists, you do not need to specify this parameter. If no contact has been configured, specify at least one contact ID. Otherwise, you cannot call the ApplyCertificate operation to apply for a certificate.</p>
         */
        public Builder contactIdList(java.util.List<Long> contactIdList) {
            this.putQueryParameter("ContactIdList", contactIdList);
            this.contactIdList = contactIdList;
            return this;
        }

        /**
         * <p>The country or region code of the certificate organization. For example, CN indicates China and US indicates the United States. This field is required when generating a CSR for a DV certificate. Default value: CN.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        public Builder countryCode(String countryCode) {
            this.putQueryParameter("CountryCode", countryCode);
            this.countryCode = countryCode;
            return this;
        }

        /**
         * <p>The CSR content. You can use OpenSSL or Keytool to generate a CSR. For more information, see <a href="https://help.aliyun.com/document_detail/42218.html">How do I create a CSR file?</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE REQUEST----- ...... -----END CERTIFICATE REQUEST-----</p>
         */
        public Builder csr(String csr) {
            this.putQueryParameter("Csr", csr);
            this.csr = csr;
            return this;
        }

        /**
         * <p>The domain name to which the certificate is bound. Requirements:</p>
         * <ul>
         * <li>You can specify a single domain name or a wildcard domain name (for example, <code>*.aliyundoc.com</code>).</li>
         * <li>You can specify multiple domain names. Separate multiple domain names with commas (,). Whether a free domain name is included is determined based on the first domain name.</li>
         * </ul>
         * <blockquote>
         * <p>Notice:  </p>
         * </blockquote>
         * <p>When the certificate is bound to multiple domain names, this parameter is required. This parameter and the <strong>Csr</strong> parameter cannot both be empty. If you specify both this parameter and the <strong>Csr</strong> parameter, the <strong>CN</strong> field value in the <strong>Csr</strong> parameter is used as the domain name to which the certificate is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The method used to generate the certificate signing request (CSR). Default value: online. Valid values:</p>
         * <ul>
         * <li>online: The system generates the CSR. The Csr parameter is ignored.</li>
         * <li>upload: You upload the CSR. The Csr parameter is required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>online</p>
         */
        public Builder generateCsrMethod(String generateCsrMethod) {
            this.putQueryParameter("GenerateCsrMethod", generateCsrMethod);
            this.generateCsrMethod = generateCsrMethod;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-cn-68n1mm16****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The certificate algorithm. Default value: RSA_2048. Valid values:</p>
         * <ul>
         * <li><strong>RSA_2048</strong></li>
         * <li><strong>RSA_3072</strong></li>
         * <li><strong>RSA_4096</strong></li>
         * <li><strong>ECC_256</strong></li>
         * <li><strong>SM2</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA_2048</p>
         */
        public Builder keyAlgorithm(String keyAlgorithm) {
            this.putQueryParameter("KeyAlgorithm", keyAlgorithm);
            this.keyAlgorithm = keyAlgorithm;
            return this;
        }

        /**
         * <p>The province or region where the company is located. This field is required when generating a CSR for a DV certificate. Default value: Beijing.</p>
         * 
         * <strong>example:</strong>
         * <p>Beijing</p>
         */
        public Builder province(String province) {
            this.putQueryParameter("Province", province);
            this.province = province;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-ae******4wia</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The list of tags.</p>
         */
        public Builder tags(java.util.List<Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The validation method for the certificate application. Valid values:</p>
         * <ul>
         * <li>DNS: DNS validation, which uses TXT or CNAME records.</li>
         * <li>HTTP: File validation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DNS</p>
         */
        public Builder validationMethod(String validationMethod) {
            this.putQueryParameter("ValidationMethod", validationMethod);
            this.validationMethod = validationMethod;
            return this;
        }

        @Override
        public UpdateInstanceRequest build() {
            return new UpdateInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateInstanceRequest} extends {@link TeaModel}
     *
     * <p>UpdateInstanceRequest</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private Tags(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The tag key of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, the value cannot be an empty string.</p>
             * <p>The tag key can be up to 64 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The tag value of the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>. If you specify this parameter, the value can be an empty string.</p>
             * <p>The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
