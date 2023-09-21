// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListServiceUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceUsagesResponseBody</p>
 */
public class ListServiceUsagesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServiceUsages")
    private java.util.List < ServiceUsages> serviceUsages;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListServiceUsagesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceUsages = builder.serviceUsages;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceUsagesResponseBody create() {
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
     * @return serviceUsages
     */
    public java.util.List < ServiceUsages> getServiceUsages() {
        return this.serviceUsages;
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
        private java.util.List < ServiceUsages> serviceUsages; 
        private Integer totalCount; 

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceUsages.
         */
        public Builder serviceUsages(java.util.List < ServiceUsages> serviceUsages) {
            this.serviceUsages = serviceUsages;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListServiceUsagesResponseBody build() {
            return new ListServiceUsagesResponseBody(this);
        } 

    } 

    public static class UserInformation extends TeaModel {
        @NameInMap("Company")
        private String company;

        @NameInMap("ContactEmail")
        private String contactEmail;

        @NameInMap("ContactNumber")
        private String contactNumber;

        @NameInMap("ContactPerson")
        private String contactPerson;

        @NameInMap("ContactPersonTitle")
        private String contactPersonTitle;

        @NameInMap("Country")
        private String country;

        @NameInMap("EmailAddress")
        private String emailAddress;

        @NameInMap("Industry")
        private String industry;

        @NameInMap("Name")
        private String name;

        @NameInMap("ProductBusiness")
        private String productBusiness;

        @NameInMap("ProductDeliveryTypes")
        private String productDeliveryTypes;

        @NameInMap("ProductSellTypes")
        private String productSellTypes;

        @NameInMap("Source")
        private String source;

        @NameInMap("SupplierDesc")
        private String supplierDesc;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("SupplierUrl")
        private String supplierUrl;

        @NameInMap("Telephone")
        private String telephone;

        @NameInMap("Title")
        private String title;

        private UserInformation(Builder builder) {
            this.company = builder.company;
            this.contactEmail = builder.contactEmail;
            this.contactNumber = builder.contactNumber;
            this.contactPerson = builder.contactPerson;
            this.contactPersonTitle = builder.contactPersonTitle;
            this.country = builder.country;
            this.emailAddress = builder.emailAddress;
            this.industry = builder.industry;
            this.name = builder.name;
            this.productBusiness = builder.productBusiness;
            this.productDeliveryTypes = builder.productDeliveryTypes;
            this.productSellTypes = builder.productSellTypes;
            this.source = builder.source;
            this.supplierDesc = builder.supplierDesc;
            this.supplierName = builder.supplierName;
            this.supplierUrl = builder.supplierUrl;
            this.telephone = builder.telephone;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserInformation create() {
            return builder().build();
        }

        /**
         * @return company
         */
        public String getCompany() {
            return this.company;
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
         * @return country
         */
        public String getCountry() {
            return this.country;
        }

        /**
         * @return emailAddress
         */
        public String getEmailAddress() {
            return this.emailAddress;
        }

        /**
         * @return industry
         */
        public String getIndustry() {
            return this.industry;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
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
         * @return productSellTypes
         */
        public String getProductSellTypes() {
            return this.productSellTypes;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return supplierDesc
         */
        public String getSupplierDesc() {
            return this.supplierDesc;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return supplierUrl
         */
        public String getSupplierUrl() {
            return this.supplierUrl;
        }

        /**
         * @return telephone
         */
        public String getTelephone() {
            return this.telephone;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String company; 
            private String contactEmail; 
            private String contactNumber; 
            private String contactPerson; 
            private String contactPersonTitle; 
            private String country; 
            private String emailAddress; 
            private String industry; 
            private String name; 
            private String productBusiness; 
            private String productDeliveryTypes; 
            private String productSellTypes; 
            private String source; 
            private String supplierDesc; 
            private String supplierName; 
            private String supplierUrl; 
            private String telephone; 
            private String title; 

            /**
             * Company.
             */
            public Builder company(String company) {
                this.company = company;
                return this;
            }

            /**
             * ContactEmail.
             */
            public Builder contactEmail(String contactEmail) {
                this.contactEmail = contactEmail;
                return this;
            }

            /**
             * ContactNumber.
             */
            public Builder contactNumber(String contactNumber) {
                this.contactNumber = contactNumber;
                return this;
            }

            /**
             * ContactPerson.
             */
            public Builder contactPerson(String contactPerson) {
                this.contactPerson = contactPerson;
                return this;
            }

            /**
             * ContactPersonTitle.
             */
            public Builder contactPersonTitle(String contactPersonTitle) {
                this.contactPersonTitle = contactPersonTitle;
                return this;
            }

            /**
             * Country.
             */
            public Builder country(String country) {
                this.country = country;
                return this;
            }

            /**
             * EmailAddress.
             */
            public Builder emailAddress(String emailAddress) {
                this.emailAddress = emailAddress;
                return this;
            }

            /**
             * Industry.
             */
            public Builder industry(String industry) {
                this.industry = industry;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ProductBusiness.
             */
            public Builder productBusiness(String productBusiness) {
                this.productBusiness = productBusiness;
                return this;
            }

            /**
             * ProductDeliveryTypes.
             */
            public Builder productDeliveryTypes(String productDeliveryTypes) {
                this.productDeliveryTypes = productDeliveryTypes;
                return this;
            }

            /**
             * ProductSellTypes.
             */
            public Builder productSellTypes(String productSellTypes) {
                this.productSellTypes = productSellTypes;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * SupplierDesc.
             */
            public Builder supplierDesc(String supplierDesc) {
                this.supplierDesc = supplierDesc;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * SupplierUrl.
             */
            public Builder supplierUrl(String supplierUrl) {
                this.supplierUrl = supplierUrl;
                return this;
            }

            /**
             * Telephone.
             */
            public Builder telephone(String telephone) {
                this.telephone = telephone;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public UserInformation build() {
                return new UserInformation(this);
            } 

        } 

    }
    public static class ServiceUsages extends TeaModel {
        @NameInMap("Comments")
        private String comments;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Status")
        private String status;

        @NameInMap("SupplierName")
        private String supplierName;

        @NameInMap("UpdateTime")
        private String updateTime;

        @NameInMap("UserAliUid")
        private Long userAliUid;

        @NameInMap("UserInformation")
        private UserInformation userInformation;

        private ServiceUsages(Builder builder) {
            this.comments = builder.comments;
            this.createTime = builder.createTime;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.supplierName = builder.supplierName;
            this.updateTime = builder.updateTime;
            this.userAliUid = builder.userAliUid;
            this.userInformation = builder.userInformation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceUsages create() {
            return builder().build();
        }

        /**
         * @return comments
         */
        public String getComments() {
            return this.comments;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return supplierName
         */
        public String getSupplierName() {
            return this.supplierName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return userAliUid
         */
        public Long getUserAliUid() {
            return this.userAliUid;
        }

        /**
         * @return userInformation
         */
        public UserInformation getUserInformation() {
            return this.userInformation;
        }

        public static final class Builder {
            private String comments; 
            private String createTime; 
            private String serviceId; 
            private String serviceName; 
            private String status; 
            private String supplierName; 
            private String updateTime; 
            private Long userAliUid; 
            private UserInformation userInformation; 

            /**
             * Comments.
             */
            public Builder comments(String comments) {
                this.comments = comments;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ServiceId.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * SupplierName.
             */
            public Builder supplierName(String supplierName) {
                this.supplierName = supplierName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * UserAliUid.
             */
            public Builder userAliUid(Long userAliUid) {
                this.userAliUid = userAliUid;
                return this;
            }

            /**
             * UserInformation.
             */
            public Builder userInformation(UserInformation userInformation) {
                this.userInformation = userInformation;
                return this;
            }

            public ServiceUsages build() {
                return new ServiceUsages(this);
            } 

        } 

    }
}
