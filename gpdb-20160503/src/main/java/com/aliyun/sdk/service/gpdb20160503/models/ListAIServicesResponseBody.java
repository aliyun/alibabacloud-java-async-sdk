// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link ListAIServicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIServicesResponseBody</p>
 */
public class ListAIServicesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private String pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private String totalRecordCount;

    private ListAIServicesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIServicesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return services
     */
    public java.util.List<Services> getServices() {
        return this.services;
    }

    /**
     * @return totalRecordCount
     */
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private String pageNumber; 
        private String pageRecordCount; 
        private String requestId; 
        private java.util.List<Services> services; 
        private String totalRecordCount; 

        private Builder() {
        } 

        private Builder(ListAIServicesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.services = model.services;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageRecordCount.
         */
        public Builder pageRecordCount(String pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * Services.
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * TotalRecordCount.
         */
        public Builder totalRecordCount(String totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public ListAIServicesResponseBody build() {
            return new ListAIServicesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIServicesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIServicesResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PrivateApiDevUrl")
        private String privateApiDevUrl;

        @com.aliyun.core.annotation.NameInMap("PrivateWorkbenchUrl")
        private String privateWorkbenchUrl;

        @com.aliyun.core.annotation.NameInMap("PublicApiDevUrl")
        private String publicApiDevUrl;

        @com.aliyun.core.annotation.NameInMap("PublicWorkbenchUrl")
        private String publicWorkbenchUrl;

        @com.aliyun.core.annotation.NameInMap("SecurityIpList")
        private String securityIpList;

        @com.aliyun.core.annotation.NameInMap("ServiceAccount")
        private String serviceAccount;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Services(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.privateApiDevUrl = builder.privateApiDevUrl;
            this.privateWorkbenchUrl = builder.privateWorkbenchUrl;
            this.publicApiDevUrl = builder.publicApiDevUrl;
            this.publicWorkbenchUrl = builder.publicWorkbenchUrl;
            this.securityIpList = builder.securityIpList;
            this.serviceAccount = builder.serviceAccount;
            this.serviceId = builder.serviceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return privateApiDevUrl
         */
        public String getPrivateApiDevUrl() {
            return this.privateApiDevUrl;
        }

        /**
         * @return privateWorkbenchUrl
         */
        public String getPrivateWorkbenchUrl() {
            return this.privateWorkbenchUrl;
        }

        /**
         * @return publicApiDevUrl
         */
        public String getPublicApiDevUrl() {
            return this.publicApiDevUrl;
        }

        /**
         * @return publicWorkbenchUrl
         */
        public String getPublicWorkbenchUrl() {
            return this.publicWorkbenchUrl;
        }

        /**
         * @return securityIpList
         */
        public String getSecurityIpList() {
            return this.securityIpList;
        }

        /**
         * @return serviceAccount
         */
        public String getServiceAccount() {
            return this.serviceAccount;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String privateApiDevUrl; 
            private String privateWorkbenchUrl; 
            private String publicApiDevUrl; 
            private String publicWorkbenchUrl; 
            private String securityIpList; 
            private String serviceAccount; 
            private String serviceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Services model) {
                this.createTime = model.createTime;
                this.description = model.description;
                this.privateApiDevUrl = model.privateApiDevUrl;
                this.privateWorkbenchUrl = model.privateWorkbenchUrl;
                this.publicApiDevUrl = model.publicApiDevUrl;
                this.publicWorkbenchUrl = model.publicWorkbenchUrl;
                this.securityIpList = model.securityIpList;
                this.serviceAccount = model.serviceAccount;
                this.serviceId = model.serviceId;
                this.status = model.status;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * PrivateApiDevUrl.
             */
            public Builder privateApiDevUrl(String privateApiDevUrl) {
                this.privateApiDevUrl = privateApiDevUrl;
                return this;
            }

            /**
             * PrivateWorkbenchUrl.
             */
            public Builder privateWorkbenchUrl(String privateWorkbenchUrl) {
                this.privateWorkbenchUrl = privateWorkbenchUrl;
                return this;
            }

            /**
             * PublicApiDevUrl.
             */
            public Builder publicApiDevUrl(String publicApiDevUrl) {
                this.publicApiDevUrl = publicApiDevUrl;
                return this;
            }

            /**
             * PublicWorkbenchUrl.
             */
            public Builder publicWorkbenchUrl(String publicWorkbenchUrl) {
                this.publicWorkbenchUrl = publicWorkbenchUrl;
                return this;
            }

            /**
             * SecurityIpList.
             */
            public Builder securityIpList(String securityIpList) {
                this.securityIpList = securityIpList;
                return this;
            }

            /**
             * ServiceAccount.
             */
            public Builder serviceAccount(String serviceAccount) {
                this.serviceAccount = serviceAccount;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
