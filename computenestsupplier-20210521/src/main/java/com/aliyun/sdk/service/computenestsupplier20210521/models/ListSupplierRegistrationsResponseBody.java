// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link ListSupplierRegistrationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSupplierRegistrationsResponseBody</p>
 */
public class ListSupplierRegistrationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SupplierRegistrations")
    private java.util.List<SupplierRegistrations> supplierRegistrations;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListSupplierRegistrationsResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.supplierRegistrations = builder.supplierRegistrations;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSupplierRegistrationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return supplierRegistrations
     */
    public java.util.List<SupplierRegistrations> getSupplierRegistrations() {
        return this.supplierRegistrations;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<SupplierRegistrations> supplierRegistrations; 
        private Integer totalCount; 

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAdx9kBO7qKpr9My/+XQo0oY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C6CC568D-xxxx-xxxx-xxxx-08EB8E9F9F20</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The supplier registrations</p>
         */
        public Builder supplierRegistrations(java.util.List<SupplierRegistrations> supplierRegistrations) {
            this.supplierRegistrations = supplierRegistrations;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListSupplierRegistrationsResponseBody build() {
            return new ListSupplierRegistrationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSupplierRegistrationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSupplierRegistrationsResponseBody</p>
     */
    public static class SupplierRegistrations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("ContactEmail")
        private String contactEmail;

        @com.aliyun.core.annotation.NameInMap("ContactNumber")
        private String contactNumber;

        @com.aliyun.core.annotation.NameInMap("ContactPerson")
        private String contactPerson;

        @com.aliyun.core.annotation.NameInMap("ContactPersonTitle")
        private String contactPersonTitle;

        @com.aliyun.core.annotation.NameInMap("EnableResellerMode")
        private Boolean enableResellerMode;

        @com.aliyun.core.annotation.NameInMap("ProductAnnualRevenue")
        private String productAnnualRevenue;

        @com.aliyun.core.annotation.NameInMap("ProductBusiness")
        private String productBusiness;

        @com.aliyun.core.annotation.NameInMap("ProductDeliveryTypes")
        private String productDeliveryTypes;

        @com.aliyun.core.annotation.NameInMap("ProductPublishTime")
        private String productPublishTime;

        @com.aliyun.core.annotation.NameInMap("ProductSellTypes")
        private String productSellTypes;

        @com.aliyun.core.annotation.NameInMap("RegistrationId")
        private String registrationId;

        @com.aliyun.core.annotation.NameInMap("ResellBusinessDesc")
        private String resellBusinessDesc;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitTime")
        private String submitTime;

        @com.aliyun.core.annotation.NameInMap("SupplierDesc")
        private String supplierDesc;

        @com.aliyun.core.annotation.NameInMap("SupplierLogo")
        private String supplierLogo;

        @com.aliyun.core.annotation.NameInMap("SupplierName")
        private String supplierName;

        @com.aliyun.core.annotation.NameInMap("SupplierNameEn")
        private String supplierNameEn;

        @com.aliyun.core.annotation.NameInMap("SupplierUid")
        private String supplierUid;

        @com.aliyun.core.annotation.NameInMap("SupplierUrl")
        private String supplierUrl;

        private SupplierRegistrations(Builder builder) {
            this.comment = builder.comment;
            this.contactEmail = builder.contactEmail;
            this.contactNumber = builder.contactNumber;
            this.contactPerson = builder.contactPerson;
            this.contactPersonTitle = builder.contactPersonTitle;
            this.enableResellerMode = builder.enableResellerMode;
            this.productAnnualRevenue = builder.productAnnualRevenue;
            this.productBusiness = builder.productBusiness;
            this.productDeliveryTypes = builder.productDeliveryTypes;
            this.productPublishTime = builder.productPublishTime;
            this.productSellTypes = builder.productSellTypes;
            this.registrationId = builder.registrationId;
            this.resellBusinessDesc = builder.resellBusinessDesc;
            this.status = builder.status;
            this.submitTime = builder.submitTime;
            this.supplierDesc = builder.supplierDesc;
            this.supplierLogo = builder.supplierLogo;
            this.supplierName = builder.supplierName;
            this.supplierNameEn = builder.supplierNameEn;
            this.supplierUid = builder.supplierUid;
            this.supplierUrl = builder.supplierUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupplierRegistrations create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return contactEmail
         */
        public String getContactEmail() {
            return this.contactEmail;
        }

        /**
         * @return contactNumber
         */
        public String getContactNumber() {
            return this.contactNumber;
        }

        /**
         * @return contactPerson
         */
        public String getContactPerson() {
            return this.contactPerson;
        }

        /**
         * @return contactPersonTitle
         */
        public String getContactPersonTitle() {
            return this.contactPersonTitle;
        }

        /**
         * @return enableResellerMode
         */
        public Boolean getEnableResellerMode() {
            return this.enableResellerMode;
        }

        /**
         * @return productAnnualRevenue
         */
        public String getProductAnnualRevenue() {
            return this.productAnnualRevenue;
        }

        /**
         * @return productBusiness
         */
        public String getProductBusiness() {
            return this.productBusiness;
        }

        /**
         * @return productDeliveryTypes
         */
        public String getProductDeliveryTypes() {
            return this.productDeliveryTypes;
        }

        /**
         * @return productPublishTime
         */
        public String getProductPublishTime() {
            return this.productPublishTime;
        }

        /**
         * @return productSellTypes
         */
        public String getProductSellTypes() {
            return this.productSellTypes;
        }

        /**
         * @return registrationId
         */
        public String getRegistrationId() {
            return this.registrationId;
        }

        /**
         * @return resellBusinessDesc
         */
        public String getResellBusinessDesc() {
            return this.resellBusinessDesc;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitTime
         */
        public String getSubmitTime() {
            return this.submitTime;
        }

        /**
         * @return supplierDesc
         */
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        /**
         * @return supplierLogo
         */
        public String getSupplierLogo() {
            return this.supplierLogo;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supplierNameEn
         */
        public String getSupplierNameEn() {
            return this.supplierNameEn;
        }

        /**
         * @return supplierUid
         */
        public String getSupplierUid() {
            return this.supplierUid;
        }

        /**
         * @return supplierUrl
         */
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        public static final class Builder {
            private String comment; 
            private String contactEmail; 
            private String contactNumber; 
            private String contactPerson; 
            private String contactPersonTitle; 
            private Boolean enableResellerMode; 
            private String productAnnualRevenue; 
            private String productBusiness; 
            private String productDeliveryTypes; 
            private String productPublishTime; 
            private String productSellTypes; 
            private String registrationId; 
            private String resellBusinessDesc; 
            private String status; 
            private String submitTime; 
            private String supplierDesc; 
            private String supplierLogo; 
            private String supplierName; 
            private String supplierNameEn; 
            private String supplierUid; 
            private String supplierUrl; 

            /**
             * <p>The comment of this registration.</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * <p>Contact email</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@163.com">test@163.com</a></p>
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * <p>Contact number</p>
             * 
             * <strong>example:</strong>
             * <p>135xxxxxxxx</p>
             */
            public Builder contactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
                return this;
            }

            /**
             * <p>Contact person</p>
             * 
             * <strong>example:</strong>
             * <p>Mike</p>
             */
            public Builder contactPerson(String contactPerson) {
                this.contactPerson = contactPerson;
                return this;
            }

            /**
             * <p>Contact person tiltle.</p>
             * 
             * <strong>example:</strong>
             * <p>CTO</p>
             */
            public Builder contactPersonTitle(String contactPersonTitle) {
                this.contactPersonTitle = contactPersonTitle;
                return this;
            }

            /**
             * <p>Whether to enable the resell mode.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder enableResellerMode(Boolean enableResellerMode) {
                this.enableResellerMode = enableResellerMode;
                return this;
            }

            /**
             * <p>Annual product revenue</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder productAnnualRevenue(String productAnnualRevenue) {
                this.productAnnualRevenue = productAnnualRevenue;
                return this;
            }

            /**
             * <p>The business of product.</p>
             * 
             * <strong>example:</strong>
             * <p>AI</p>
             */
            public Builder productBusiness(String productBusiness) {
                this.productBusiness = productBusiness;
                return this;
            }

            /**
             * <p>Product delivery type，Valid values:</p>
             * <p>SaaS
             * License
             * API
             * DesktopSoftware
             * Others</p>
             * 
             * <strong>example:</strong>
             * <p>SaaS</p>
             */
            public Builder productDeliveryTypes(String productDeliveryTypes) {
                this.productDeliveryTypes = productDeliveryTypes;
                return this;
            }

            /**
             * <p>The publish time of product.</p>
             * 
             * <strong>example:</strong>
             * <p>2024.10.24</p>
             */
            public Builder productPublishTime(String productPublishTime) {
                this.productPublishTime = productPublishTime;
                return this;
            }

            /**
             * <p>Product sell type, Valid values:</p>
             * <ul>
             * <li>Direct</li>
             * <li>Channel</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Direct</p>
             */
            public Builder productSellTypes(String productSellTypes) {
                this.productSellTypes = productSellTypes;
                return this;
            }

            /**
             * <p>The registration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sr-xxx</p>
             */
            public Builder registrationId(String registrationId) {
                this.registrationId = registrationId;
                return this;
            }

            /**
             * <p>The description of resell business.</p>
             * 
             * <strong>example:</strong>
             * <p>empty</p>
             */
            public Builder resellBusinessDesc(String resellBusinessDesc) {
                this.resellBusinessDesc = resellBusinessDesc;
                return this;
            }

            /**
             * <p>The deployment state of the registration. Valid values:</p>
             * <ul>
             * <li>Submitted</li>
             * <li>Approved</li>
             * <li>Rejected</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Submitted</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The submit time of this registration.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-22 09:47:58</p>
             */
            public Builder submitTime(String submitTime) {
                this.submitTime = submitTime;
                return this;
            }

            /**
             * <p>The description of service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Test supplier</p>
             */
            public Builder supplierDesc(String supplierDesc) {
                this.supplierDesc = supplierDesc;
                return this;
            }

            /**
             * <p>The Logo of service provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-xxx/xxx.png">https://service-info-public.oss-cn-hangzhou.aliyuncs.com/xxx/service-xxx/xxx.png</a></p>
             */
            public Builder supplierLogo(String supplierLogo) {
                this.supplierLogo = supplierLogo;
                return this;
            }

            /**
             * <p>The name of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Aliibaba Cloud</p>
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * <p>The english name of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud ComputeNest</p>
             */
            public Builder supplierNameEn(String supplierNameEn) {
                this.supplierNameEn = supplierNameEn;
                return this;
            }

            /**
             * <p>The Alibaba Cloud account ID of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>1256xxx23434</p>
             */
            public Builder supplierUid(String supplierUid) {
                this.supplierUid = supplierUid;
                return this;
            }

            /**
             * <p>The URL of the service provider.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.guangbao-uni.com">https://www.guangbao-uni.com</a></p>
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            public SupplierRegistrations build() {
                return new SupplierRegistrations(this);
            } 

        } 

    }
}
