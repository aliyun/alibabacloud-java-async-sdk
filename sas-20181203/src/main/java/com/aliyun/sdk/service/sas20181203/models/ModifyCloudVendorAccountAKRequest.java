// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
    private java.util.List < String > authModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Regions")
    private java.util.List < String > regions;

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
    private java.util.List < String > subscriptionIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TenantId")
    private String tenantId;

    private ModifyCloudVendorAccountAKRequest(Builder builder) {
        super(builder);
        this.authIds = builder.authIds;
        this.authModules = builder.authModules;
        this.domain = builder.domain;
        this.regions = builder.regions;
        this.secretId = builder.secretId;
        this.secretKey = builder.secretKey;
        this.status = builder.status;
        this.subscriptionIds = builder.subscriptionIds;
        this.tenantId = builder.tenantId;
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
     * @return status
     */
    public Integer getStatus() {
        return this.status;
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

    public static final class Builder extends Request.Builder<ModifyCloudVendorAccountAKRequest, Builder> {
        private String authIds; 
        private java.util.List < String > authModules; 
        private String domain; 
        private java.util.List < String > regions; 
        private String secretId; 
        private String secretKey; 
        private Integer status; 
        private java.util.List < String > subscriptionIds; 
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCloudVendorAccountAKRequest request) {
            super(request);
            this.authIds = request.authIds;
            this.authModules = request.authModules;
            this.domain = request.domain;
            this.regions = request.regions;
            this.secretId = request.secretId;
            this.secretKey = request.secretKey;
            this.status = request.status;
            this.subscriptionIds = request.subscriptionIds;
            this.tenantId = request.tenantId;
        } 

        /**
         * The unique ID of the AccessKey pair.
         * <p>
         * 
         * >  You can call the [DescribeCloudVendorAccountAKList](~~DescribeCloudVendorAccountAKList~~) operation to query the unique ID.
         */
        public Builder authIds(String authIds) {
            this.putQueryParameter("AuthIds", authIds);
            this.authIds = authIds;
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
         * <p>
         * 
         * >  You can call the [ListCloudVendorRegions](~~ListCloudVendorRegions~~) operation to query regions.
         */
        public Builder regions(java.util.List < String > regions) {
            this.putQueryParameter("Regions", regions);
            this.regions = regions;
            return this;
        }

        /**
         * The AccessKey ID.
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
         * *   **Tencent**: Specify the AccessKey secret of a primary account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Specify the AccessKey secret of a primary account on Huawei Cloud.
         * *   **Azure**: Specify the AccessKey secret of a primary account on Microsoft Azure.
         * *   **AWS**: Specifythe AccessKey secret of a primary account on Amazon Web Services (AWS).
         * 
         * 2\. If AkType is set to sub, specify this parameter based on the following description:
         * 
         * *   **Tencent**: Specify the AccessKey secret of a sub-account on Tencent Cloud.
         * *   **HUAWEICLOUD**: Specify the AccessKey secret of a sub-account on Huawei Cloud.
         * *   **Azure**: Specify the AccessKey secret of a sub-account on Microsoft Azure.
         * *   **AWS**: Specify the AccessKey secret of a sub-account on AWS.
         */
        public Builder secretKey(String secretKey) {
            this.putQueryParameter("SecretKey", secretKey);
            this.secretKey = secretKey;
            return this;
        }

        /**
         * The status of the AccessKey pair. Valid values:
         * <p>
         * 
         * *   **0**: enabled.
         * *   **1**: disabled.
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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

        @Override
        public ModifyCloudVendorAccountAKRequest build() {
            return new ModifyCloudVendorAccountAKRequest(this);
        } 

    } 

}
