// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > authModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < String > regions;

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
    private java.util.List < String > subscriptionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private AddCloudVendorAccountAKRequest(Builder builder) {
        super(builder);
        this.akType = builder.akType;
        this.authModules = builder.authModules;
        this.domain = builder.domain;
        this.regions = builder.regions;
        this.secretId = builder.secretId;
        this.secretKey = builder.secretKey;
        this.subscriptionIds = builder.subscriptionIds;
        this.tenantId = builder.tenantId;
        this.vendor = builder.vendor;
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
    public java.util.List < String > getAuthModules() {
        return this.authModules;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return regions
     */
    public java.util.List < String > getRegions() {
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
    public java.util.List < String > getSubscriptionIds() {
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

    public static final class Builder extends Request.Builder<AddCloudVendorAccountAKRequest, Builder> {
        private String akType; 
        private java.util.List < String > authModules; 
        private String domain; 
        private java.util.List < String > regions; 
        private String secretId; 
        private String secretKey; 
        private java.util.List < String > subscriptionIds; 
        private String tenantId; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(AddCloudVendorAccountAKRequest request) {
            super(request);
            this.akType = request.akType;
            this.authModules = request.authModules;
            this.domain = request.domain;
            this.regions = request.regions;
            this.secretId = request.secretId;
            this.secretKey = request.secretKey;
            this.subscriptionIds = request.subscriptionIds;
            this.tenantId = request.tenantId;
            this.vendor = request.vendor;
        } 

        /**
         * The type of the account to which the AccessKey pair belongs. Valid values:
         * <p>
         * 
         * *   **primary**: a primary account
         * *   **sub**: a sub-account
         */
        public Builder akType(String akType) {
            this.putQueryParameter("AkType", akType);
            this.akType = akType;
            return this;
        }

        /**
         * The modules that are associated with the AccessKey pair.
         */
        public Builder authModules(java.util.List < String > authModules) {
            this.putQueryParameter("AuthModules", authModules);
            this.authModules = authModules;
            return this;
        }

        /**
         * The Active Directory (AD) domain. This parameter takes effect only when Vendor is set to Azure. Valid values:
         * <p>
         * 
         * *   **china**
         * *   **global**
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The regions that are examined during AccessKey pair authentication. This parameter takes effect only when Vendor is set to AWS.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The AccessKey ID. Valid values:
         * <p>
         * 
         * 1\. If AkType is set to primary, specify this parameter based on the following description:
         * 
         * *   **Tencent**: Enter the AccessKey ID of a primary account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Enter the AccessKey ID of a primary account on Huawei Cloud.
         * *   **Azure**: Enter the AccessKey ID of a primary account on Microsoft Azure.
         * *   **AWS**: Enter the AccessKey ID of a primary account on AWS.
         * 
         * 2\. If AkType is set to sub, specify this parameter based on the following description:
         * 
         * *   **Tencent**: Enter the AccessKey ID of a sub-account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Enter the AccessKey ID of a sub-account on Huawei Cloud.
         * *   **Azure**: Enter the AccessKey ID of a sub-account on Microsoft Azure.
         * *   **AWS**: Enter the AccessKey ID of a sub-account on AWS.
         */
        public Builder secretId(String secretId) {
            this.putQueryParameter("SecretId", secretId);
            this.secretId = secretId;
            return this;
        }

        /**
         * The AccessKey secret. Valid values:
         * <p>
         * 
         * 1\. If AkType is set to primary, specify this parameter based on the following description:
         * 
         * *   **Tencent**: Enter the AccessKey secret of a primary account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Enter the AccessKey secret of a primary account on Huawei Cloud.
         * *   **Azure**: Enter the AccessKey secret of a primary account on Microsoft Azure.
         * *   **AWS**: Enter the AccessKey secret of a primary account on AWS.
         * 
         * 2\. If AkType is set to sub, specify this parameter based on the following description:
         * 
         * *   **Tencent**: Enter the AccessKey secret of a sub-account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Enter the AccessKey secret of a sub-account on Huawei Cloud.
         * *   **Azure**: Enter the AccessKey secret of a sub-account on Microsoft Azure.
         * *   **AWS**: Enter the AccessKey secret of a sub-account on AWS.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * The subscription IDs. This parameter takes effect only when Vendor is set to Azure.
         */
        public Builder subscriptionIds(java.util.List < String > subscriptionIds) {
            this.putQueryParameter("SubscriptionIds", subscriptionIds);
            this.subscriptionIds = subscriptionIds;
            return this;
        }

        /**
         * The tenant ID. This parameter takes effect only when Vendor is set to Azure.
         */
        public Builder tenantId(String tenantId) {
            this.putQueryParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * The cloud service provider. Valid values:
         * <p>
         * 
         * *   **Tencent**: Tencent Cloud
         * *   **HUAWEICLOUD**: Huawei Cloud
         * *   **Azure**: Microsoft Azure
         * *   **AWS**: Amazon Web Services (AWS)
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public AddCloudVendorAccountAKRequest build() {
            return new AddCloudVendorAccountAKRequest(this);
        } 

    } 

}
