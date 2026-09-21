// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link AddCloudVendorAccountAKRequest} extends {@link RequestModel}
 *
 * <p>AddCloudVendorAccountAKRequest</p>
 */
public class AddCloudVendorAccountAKRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String akType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthModules")
    private java.util.List<String> authModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CtdrCloudUserId")
    private String ctdrCloudUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExtendInfo")
    private String extendInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List<String> regions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionIds")
    private java.util.List<String> subscriptionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorAuthAlias")
    private String vendorAuthAlias;

    private AddCloudVendorAccountAKRequest(Builder builder) {
        super(builder);
        this.akType = builder.akType;
        this.authModules = builder.authModules;
        this.ctdrCloudUserId = builder.ctdrCloudUserId;
        this.domain = builder.domain;
        this.extendInfo = builder.extendInfo;
        this.lang = builder.lang;
        this.regions = builder.regions;
        this.secretId = builder.secretId;
        this.secretKey = builder.secretKey;
        this.subscriptionIds = builder.subscriptionIds;
        this.tenantId = builder.tenantId;
        this.vendor = builder.vendor;
        this.vendorAuthAlias = builder.vendorAuthAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddCloudVendorAccountAKRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return akType
     */
    public String getAkType() {
        return this.akType;
    }

    /**
     * @return authModules
     */
    public java.util.List<String> getAuthModules() {
        return this.authModules;
    }

    /**
     * @return ctdrCloudUserId
     */
    public String getCtdrCloudUserId() {
        return this.ctdrCloudUserId;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return extendInfo
     */
    public String getExtendInfo() {
        return this.extendInfo;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regions
     */
    public java.util.List<String> getRegions() {
        return this.regions;
    }

    /**
     * @return secretId
     */
    public String getSecretId() {
        return this.secretId;
    }

    /**
     * @return secretKey
     */
    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * @return subscriptionIds
     */
    public java.util.List<String> getSubscriptionIds() {
        return this.subscriptionIds;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    /**
     * @return vendorAuthAlias
     */
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

    public static final class Builder extends Request.Builder<AddCloudVendorAccountAKRequest, Builder> {
        private String akType; 
        private java.util.List<String> authModules; 
        private String ctdrCloudUserId; 
        private String domain; 
        private String extendInfo; 
        private String lang; 
        private java.util.List<String> regions; 
        private String secretId; 
        private String secretKey; 
        private java.util.List<String> subscriptionIds; 
        private String tenantId; 
        private String vendor; 
        private String vendorAuthAlias; 

        private Builder() {
            super();
        } 

        private Builder(AddCloudVendorAccountAKRequest request) {
            super(request);
            this.akType = request.akType;
            this.authModules = request.authModules;
            this.ctdrCloudUserId = request.ctdrCloudUserId;
            this.domain = request.domain;
            this.extendInfo = request.extendInfo;
            this.lang = request.lang;
            this.regions = request.regions;
            this.secretId = request.secretId;
            this.secretKey = request.secretKey;
            this.subscriptionIds = request.subscriptionIds;
            this.tenantId = request.tenantId;
            this.vendor = request.vendor;
            this.vendorAuthAlias = request.vendorAuthAlias;
        } 

        /**
         * <p>The AccessKey (AK) type. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: Primary account.</li>
         * <li><strong>sub</strong>: Sub-account.</li>
         * <li><strong>ctdr</strong>: Agentic SOC.<blockquote>
         * <p>Warning: If the vendor is <strong>CHAITIN</strong>, <strong>FORTINET</strong>, <strong>THREATBOOK</strong>, or <strong>WIZ</strong>, set this parameter to ctdr.</warning></p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder akType(String akType) {
            this.putQueryParameter("AkType", akType);
            this.akType = akType;
            return this;
        }

        /**
         * <p>The list of AK-associated modules.</p>
         * <p>If AkType is set to ctdr, this parameter is required. Specify at least one module, such as SIEM, HOST, or CSPM. If this parameter is not specified, the API returns HTTP 400 with error code -101.</p>
         */
        public Builder authModules(java.util.List<String> authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * <blockquote>
         * <p>The account ID of the connected cloud vendor. This parameter is required when the permission description includes Cloud Threat Detection and Response (CTDR).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>azure_demo_1</p>
         */
        public Builder ctdrCloudUserId(String ctdrCloudUserId) {
            this.putQueryParameter("CtdrCloudUserId", ctdrCloudUserId);
            this.ctdrCloudUserId = ctdrCloudUserId;
            return this;
        }

        /**
         * <p>The account domain for connection. Valid values:</p>
         * <ul>
         * <li><strong>china</strong>: China</li>
         * <li><strong>global</strong>: Global</li>
         * <li><strong>europe</strong>: Huawei Cloud Europe</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only when <strong>Vendor</strong> is set to <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, <strong>AWS</strong>, <strong>VOLCENGINE</strong>, <strong>KingsoftCloud</strong>, <strong>UCloud</strong>, or <strong>BaiduCloud</strong>, and is required. For KingsoftCloud and BaiduCloud, set this parameter to <strong>china</strong>. For UCloud, set this parameter to <strong>global</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>global</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The extended information.</p>
         * <blockquote>
         * <p>Used to store extended information for different vendors.
         * Google Cloud is connected through a service account. ExtendInfo stores the JSON-formatted service key file, excluding the private_key_id and private_key fields. The file contains the following fields: type, project_id, client_email, client_id, auth_uri, token_uri, auth_provider_x509_cert_url, client_x509_cert_url, and universe_domain.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;product\&quot;:\&quot;webFirewall\&quot;,\&quot;remark\&quot;:\&quot;remark\&quot;}</p>
         */
        public Builder extendInfo(String extendInfo) {
            this.putQueryParameter("ExtendInfo", extendInfo);
            this.extendInfo = extendInfo;
            return this;
        }

        /**
         * <p>The language type for the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The list of regions used for AK information verification. This parameter is valid only when Vendor is set to AWS.</p>
         * <blockquote>
         * <p>Call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder regions(java.util.List<String> regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The AK parameter ID. Valid values:</p>
         * <ol>
         * <li>If AkType is set to primary:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: AccessKeyId of the primary account</li>
         * <li><strong>HUAWEICLOUD</strong>: AccessKeyId of the primary account</li>
         * <li><strong>Azure</strong>: ClientId</li>
         * <li><strong>AWS</strong>: AccessKeyId of the primary account</li>
         * <li><strong>VOLCENGINE</strong>: AccessKeyId of the primary account</li>
         * </ul>
         * <ol start="2">
         * <li>If AkType is set to sub:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: AccessKeyId of the sub-account</li>
         * <li><strong>HUAWEICLOUD</strong>: AccessKeyId of the sub-account</li>
         * <li><strong>Azure</strong>: ClientId</li>
         * <li><strong>AWS</strong>: AccessKeyId of the sub-account</li>
         * <li><strong>VOLCENGINE</strong>: AccessKeyId of the sub-account</li>
         * <li><strong>google</strong>: private_key_id</li>
         * </ul>
         * <blockquote>
         * <p>If AkType is set to <strong>primary</strong>, this value is the SecretID of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Access Key ID of the sub-account on the third-party cloud. For <strong>Azure</strong>, no distinction is made. This value is the <strong>appId</strong> in the authentication information. Google Cloud is connected through a service account. AkType defaults to sub, and this value is the private_key_id property value from the JSON-formatted service key file.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>45GLRV4SOT0YFB****</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * <p>The AK parameter secret. Valid values:</p>
         * <ol>
         * <li>If AkType is set to primary:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: SecretAccessKey of the primary account</li>
         * <li><strong>HUAWEICLOUD</strong>: SecretAccessKey of the primary account</li>
         * <li><strong>Azure</strong>: ClientSecret</li>
         * <li><strong>AWS</strong>: SecretAccessKey of the primary account</li>
         * </ul>
         * <ol start="2">
         * <li>If AkType is set to sub:</li>
         * </ol>
         * <ul>
         * <li><strong>Tencent</strong>: SecretAccessKey of the sub-account</li>
         * <li><strong>HUAWEICLOUD</strong>: SecretAccessKey of the sub-account</li>
         * <li><strong>Azure</strong>: ClientSecret</li>
         * <li><strong>AWS</strong>: SecretAccessKey of the sub-account</li>
         * <li><strong>google</strong>: private_key<blockquote>
         * <p>If AkType is set to <strong>primary</strong>, this value is the Secret Access Key of the primary account on the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Secret Access Key of the sub-account on the third-party cloud. For <strong>Azure</strong>, no distinction is made. This value is the <strong>password</strong> in the authentication information. Google Cloud is connected through a service account. AkType defaults to sub, and this value is the private_key property value from the JSON-formatted service key file.</p>
         * </blockquote>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AE6SLd****</p>
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * <p>The list of subscription IDs.</p>
         * <blockquote>
         * <p>This parameter is no longer valid.</p>
         * </blockquote>
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.putQueryParameter("SubscriptionIds", subscriptionIds);
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * <p>The tenant ID. This parameter is valid only when Vendor is set to Azure.</p>
         * 
         * <strong>example:</strong>
         * <p>95304a97-339b-4de5-9a7d-cdbffaf****</p>
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * <p>The cloud asset vendor. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Azure</strong>: Azure</li>
         * <li><strong>AWS</strong>: AWS</li>
         * <li><strong>VOLCENGINE</strong>: Volcengine</li>
         * <li><strong>google</strong>: Google Cloud</li>
         * <li><strong>CHAITIN</strong>: Chaitin Technology</li>
         * <li><strong>FORTINET</strong>: Fortinet</li>
         * <li><strong>THREATBOOK</strong>: ThreatBook</li>
         * <li><strong>KingsoftCloud</strong>: Kingsoft Cloud</li>
         * <li><strong>UCloud</strong>: UCloud</li>
         * <li><strong>BaiduCloud</strong>: Baidu AI Cloud</li>
         * <li><strong>WIZ</strong>: Wiz Security</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AWS</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        /**
         * <p>The AK account name.</p>
         * <blockquote>
         * <p>Used to identify the account to which third-party host assets belong.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder vendorAuthAlias(String vendorAuthAlias) {
            this.putQueryParameter("VendorAuthAlias", vendorAuthAlias);
            this.vendorAuthAlias = vendorAuthAlias;
            return this;
        }

        @Override
        public AddCloudVendorAccountAKRequest build() {
            return new AddCloudVendorAccountAKRequest(this);
        } 

    } 

}
