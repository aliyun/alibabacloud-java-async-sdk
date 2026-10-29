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
 * {@link ModifyCloudVendorAccountAKRequest} extends {@link RequestModel}
 *
 * <p>ModifyCloudVendorAccountAKRequest</p>
 */
public class ModifyCloudVendorAccountAKRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authIds;

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
    private String secretId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretKey")
    private String secretKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubscriptionIds")
    private java.util.List<String> subscriptionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VendorAuthAlias")
    private String vendorAuthAlias;

    private ModifyCloudVendorAccountAKRequest(Builder builder) {
        super(builder);
        this.authIds = builder.authIds;
        this.authModules = builder.authModules;
        this.ctdrCloudUserId = builder.ctdrCloudUserId;
        this.domain = builder.domain;
        this.extendInfo = builder.extendInfo;
        this.lang = builder.lang;
        this.regions = builder.regions;
        this.secretId = builder.secretId;
        this.secretKey = builder.secretKey;
        this.status = builder.status;
        this.subscriptionIds = builder.subscriptionIds;
        this.tenantId = builder.tenantId;
        this.vendorAuthAlias = builder.vendorAuthAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCloudVendorAccountAKRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authIds
     */
    public String getAuthIds() {
        return this.authIds;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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
     * @return vendorAuthAlias
     */
    public String getVendorAuthAlias() {
        return this.vendorAuthAlias;
    }

    public static final class Builder extends Request.Builder<ModifyCloudVendorAccountAKRequest, Builder> {
        private String authIds; 
        private java.util.List<String> authModules; 
        private String ctdrCloudUserId; 
        private String domain; 
        private String extendInfo; 
        private String lang; 
        private java.util.List<String> regions; 
        private String secretId; 
        private String secretKey; 
        private Integer status; 
        private java.util.List<String> subscriptionIds; 
        private String tenantId; 
        private String vendorAuthAlias; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudVendorAccountAKRequest request) {
            super(request);
            this.authIds = request.authIds;
            this.authModules = request.authModules;
            this.ctdrCloudUserId = request.ctdrCloudUserId;
            this.domain = request.domain;
            this.extendInfo = request.extendInfo;
            this.lang = request.lang;
            this.regions = request.regions;
            this.secretId = request.secretId;
            this.secretKey = request.secretKey;
            this.status = request.status;
            this.subscriptionIds = request.subscriptionIds;
            this.tenantId = request.tenantId;
            this.vendorAuthAlias = request.vendorAuthAlias;
        } 

        /**
         * <p>The unique ID of the AccessKey (AK).</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2832</p>
         */
        public Builder authIds(String authIds) {
            this.putQueryParameter("AuthIds", authIds);
            this.authIds = authIds;
            return this;
        }

        /**
         * <p>The list of codes for the modules associated with the AK. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: host</li>
         * <li><strong>CSPM</strong>: cloud product configuration check</li>
         * <li><strong>SIEM</strong>: threat analysis and response</li>
         * <li><strong>TRIAL</strong>: log audit<blockquote>
         * <p>You can call the <a href="~~GetSupportedModules~~">GetSupportedModules</a> operation to obtain the supported modules.</p>
         * </blockquote>
         * </li>
         * </ul>
         */
        public Builder authModules(java.util.List<String> authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * <blockquote>
         * <p>The account ID of the connected cloud vendor. This parameter is required when the permission description includes threat analysis and response.</p>
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
         * <p>The domain to which the connected account belongs. Valid values:</p>
         * <ul>
         * <li><strong>china</strong>: China</li>
         * <li><strong>global</strong>: global</li>
         * <li><strong>europe</strong>: Huawei Cloud Europe site</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when <strong>Vendor</strong> is set to <strong>HUAWEICLOUD</strong>, <strong>Azure</strong>, <strong>AWS</strong>, <strong>VOLCENGINE</strong>, <strong>KingsoftCloud</strong>, <strong>UCloud</strong>, <strong>BaiduCloud</strong>, or <strong>OracleCloud</strong>. For <strong>KingsoftCloud</strong> and <strong>BaiduCloud</strong>, this parameter is fixed to <strong>china</strong>. For <strong>OracleCloud</strong>, this parameter is fixed to <strong>global</strong>.</p>
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
         * <p>This parameter is used to record the extended information of different vendors.
         * Google Cloud is accessed through a service account. ExtendInfo stores the JSON-formatted service key file, excluding the private_key_id and zprivate_key fields. The file contains the following fields: type, project_id, client_email, client_id, auth_uri, token_uri, auth_provider_x509_cert_url, client_x509_cert_url, and universe_domain. If the vendor is <strong>OracleCloud</strong>, this parameter contains the <strong>fingerprint</strong> key, which indicates the fingerprint.</p>
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
         * <p>The language type of the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The list of regions used for AK information verification. This parameter is valid only when <strong>Vendor</strong> is set to <strong>AWS</strong> or <strong>OracleCloud</strong>.</p>
         * <blockquote>
         * <p>You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to obtain this parameter.</p>
         * </blockquote>
         */
        public Builder regions(java.util.List<String> regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The ID of the AK parameter. Valid values:</p>
         * <ul>
         * <li>If AkType is set to primary:</li>
         * <li><ul>
         * <li><strong>Tencent</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>HUAWEICLOUD</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>Azure</strong>: the client ID</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>AWS</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>VOLCENGINE</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>KingsoftCloud</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>UCloud</strong>: the AccessKey ID of the primary account</li>
         * </ul>
         * </li>
         * <li>If AkType is set to sub:</li>
         * <li><ul>
         * <li><strong>Tencent</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>HUAWEICLOUD</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>Azure</strong>: the client ID</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>AWS</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>VOLCENGINE</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>google</strong>: the private key ID</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>OracleCloud</strong>: the Oracle Cloud Identifier (OCID) of the sub-user</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>BaiduCloud</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>KingsoftCloud</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>UCloud</strong>: the AccessKey ID of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>StateCloud</strong>: the AccessKey ID of the sub-account<blockquote>
         * <p>If AkType is set to <strong>primary</strong>, this value is the SecretID of the primary account of the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the AccessKey ID of the sub-account of the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>appId</strong> of the authentication information. Google Cloud is accessed through a service account. By default, AkType is set to sub, and this value is obtained from the private_key_id property of the JSON-formatted service key file. If the vendor is <strong>OracleCloud</strong>, this value is the OCID of the sub-user.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S3D6c4O***</p>
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * <p>The secret of the AK parameter. Valid values:</p>
         * <ul>
         * <li>If AkType is set to primary:</li>
         * <li><ul>
         * <li><strong>Tencent</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>Azure</strong>: the client secret</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>AWS</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>VOLCENGINE</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>KingsoftCloud</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>UCloud</strong>: the SecretAccessKey of the primary account</li>
         * </ul>
         * </li>
         * <li>If AkType is set to sub:</li>
         * <li><ul>
         * <li><strong>Tencent</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>HUAWEICLOUD</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>Azure</strong>: the client secret</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>AWS</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>google</strong>: the private key</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>OracleCloud</strong>: the private key of the sub-user</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>BaiduCloud</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>KingsoftCloud</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>UCloud</strong>: the SecretAccessKey of the sub-account</li>
         * </ul>
         * </li>
         * <li><ul>
         * <li><strong>StateCloud</strong>: the SecretAccessKey of the sub-account<blockquote>
         * <p>If AkType is set to <strong>primary</strong>, this value is the Secret Access Key of the primary account of the third-party cloud. If AkType is set to <strong>sub</strong>, this value is the Secret Access Key of the sub-account of the third-party cloud. For <strong>Azure</strong>, no distinction is made, and this value is the <strong>password</strong> of the authentication information. Google Cloud is accessed through a service account. By default, AkType is set to sub, and this value is obtained from the private_key property of the JSON-formatted service key file. For <strong>OracleCloud</strong>, this value is obtained from the content of the corresponding private key file.</p>
         * </blockquote>
         * </li>
         * </ul>
         * </li>
         * </ul>
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
         * <p>The usage status of the AK. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled</li>
         * <li><strong>1</strong>: disabled</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The list of subscription IDs.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong> This parameter is no longer valid.</p>
         * </blockquote>
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.putQueryParameter("SubscriptionIds", subscriptionIds);
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p>This parameter is valid only when Vendor is set to <strong>Azure</strong> or <strong>OracleCloud</strong>.</p>
         * </blockquote>
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
         * <p>The name of the AK account.</p>
         * <blockquote>
         * <p>This parameter is used to identify the account information to which the third-party host assets belong.</p>
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
        public ModifyCloudVendorAccountAKRequest build() {
            return new ModifyCloudVendorAccountAKRequest(this);
        } 

    } 

}
