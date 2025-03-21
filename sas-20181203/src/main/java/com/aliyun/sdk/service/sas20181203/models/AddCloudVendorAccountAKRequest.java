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
        this.domain = builder.domain;
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
        private String domain; 
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
            this.domain = request.domain;
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
         * <p>The type of the account to which the AccessKey pair belongs. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: a primary account</li>
         * <li><strong>sub</strong>: a sub-account</li>
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
         * <p>The modules that are associated with the AccessKey pair.</p>
         */
        public Builder authModules(java.util.List<String> authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        /**
         * <p>The Active Directory (AD) domain. This parameter takes effect only when Vendor is set to Azure. Valid values:</p>
         * <ul>
         * <li><strong>china</strong></li>
         * <li><strong>global</strong></li>
         * </ul>
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
         * <p>The language of the content in the request and response messages. Default value: <strong>zh</strong>. Valid values:</p>
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
         * <p>The regions that are examined during AccessKey pair authentication. This parameter takes effect only when Vendor is set to AWS.</p>
         * <blockquote>
         * <p> You can call the <a href="~~ListCloudVendorRegions~~">ListCloudVendorRegions</a> operation to query regions.</p>
         * </blockquote>
         */
        public Builder regions(java.util.List<String> regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * <p>The AccessKey ID. Valid values:</p>
         * <p>1. If AkType is set to primary, specify this parameter based on the following description:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Enter the AccessKey ID of a primary account on Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey ID of a primary account on Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Enter the AccessKey ID of a primary account on Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Enter the AccessKey ID of a primary account on AWS.</li>
         * </ul>
         * <p>2. If AkType is set to sub, specify this parameter based on the following description:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Enter the AccessKey ID of a sub-account on Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey ID of a sub-account on Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Enter the AccessKey ID of a sub-account on Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Enter the AccessKey ID of a sub-account on AWS.</li>
         * </ul>
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
         * <p>The AccessKey secret. Valid values:</p>
         * <p>1. If AkType is set to primary, specify this parameter based on the following description:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Enter the AccessKey secret of a primary account on Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey secret of a primary account on Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Enter the AccessKey secret of a primary account on Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Enter the AccessKey secret of a primary account on AWS.</li>
         * </ul>
         * <p>2. If AkType is set to sub, specify this parameter based on the following description:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Enter the AccessKey secret of a sub-account on Tencent Cloud.</li>
         * <li><strong>HUAWEICLOUD</strong>: Enter the AccessKey secret of a sub-account on Huawei Cloud.</li>
         * <li><strong>Azure</strong>: Enter the AccessKey secret of a sub-account on Microsoft Azure.</li>
         * <li><strong>AWS</strong>: Enter the AccessKey secret of a sub-account on AWS.</li>
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
         * <p>The subscription IDs. This parameter takes effect only when Vendor is set to Azure.</p>
         */
        public Builder subscriptionIds(java.util.List<String> subscriptionIds) {
            this.putQueryParameter("SubscriptionIds", subscriptionIds);
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * <p>The tenant ID. This parameter takes effect only when Vendor is set to Azure.</p>
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
         * <p>The cloud service provider. Valid values:</p>
         * <ul>
         * <li><strong>Tencent</strong>: Tencent Cloud</li>
         * <li><strong>HUAWEICLOUD</strong>: Huawei Cloud</li>
         * <li><strong>Azure</strong>: Microsoft Azure</li>
         * <li><strong>AWS</strong>: Amazon Web Services (AWS)</li>
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
        public AddCloudVendorAccountAKRequest build() {
            return new AddCloudVendorAccountAKRequest(this);
        } 

    } 

}
