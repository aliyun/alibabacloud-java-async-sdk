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
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

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
        this.domain = builder.domain;
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
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
        private String domain; 
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
            this.domain = request.domain;
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
         * <p>The unique ID of the AccessKey pair.</p>
         * <blockquote>
         * <p> You can call the <a href="~~DescribeCloudVendorAccountAKList~~">DescribeCloudVendorAccountAKList</a> operation to query the unique ID.</p>
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
         * <p>The modules that are associated with the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>HOST</strong>: host.</li>
         * <li><strong>CSPM</strong>: configuration assessment.</li>
         * <li><strong>SIEM</strong>: Cloud Threat Detection and Response (CTDR).</li>
         * <li><strong>TRIAL</strong>: log audit.</li>
         * </ul>
         * <blockquote>
         * <p> You can call the <a href="~~GetSupportedModules~~">GetSupportedModules</a> operation to query the supported modules.</p>
         * </blockquote>
         */
        public Builder authModules(java.util.List<String> authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        /**
         * <p>The Active Directory (AD) domain. Valid values:</p>
         * <ul>
         * <li><strong>china</strong></li>
         * <li><strong>global</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter takes effect only when Vendor is set to Azure.</p>
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
         * <p>The language of the content within the request and response. Default value: <strong>zh</strong>. Valid values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese.</li>
         * <li><strong>en</strong>: English.</li>
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
         * <p>The regions that are examined during AccessKey pair authentication.</p>
         * <blockquote>
         * <p> This parameter takes effect only when Vendor is set to AWS. You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to query regions.</p>
         * </blockquote>
         */
        public Builder regions(java.util.List<String> regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The AccessKey ID.</p>
         * <blockquote>
         * <p> If AkType is set to <strong>primary</strong>, you must set SecretId to the AccessKey ID of the third-party master account. If AkType is set to <strong>sub</strong>, you must set SecretId to the AccessKey ID of the third-party sub-account. This parameter value does not change for a <strong>Microsoft Azure account</strong>. For an Azure account, set this parameter to the <strong>app ID</strong> that is used for authentication.</p>
         * </blockquote>
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
         * <p>The AccessKey secret.</p>
         * <blockquote>
         * <p> If AkType is set to <strong>primary</strong>, you must set SecretKey to the AccessKey secret of the third-party master account. If AkType is set to <strong>sub</strong>, you must set SecretKey to the AccessKey secret of the third-party sub-account. This parameter value does not change for a <strong>Microsoft Azure account</strong>. For an Azure account, set this parameter to the <strong>password</strong> that is used for authentication.</p>
         * </blockquote>
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
         * <p>The status of the AccessKey pair. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: enabled.</li>
         * <li><strong>1</strong>: disabled.</li>
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
         * <p>The IDs of subscriptions.</p>
         * <blockquote>
         * <p> This parameter takes effect only when Vendor is set to Azure.</p>
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
         * <p> This parameter takes effect only when Vendor is set to Azure.</p>
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
         * <p>The name of the AccessKey pair.</p>
         * <blockquote>
         * <p> The account information of the third-party cloud servers.</p>
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
