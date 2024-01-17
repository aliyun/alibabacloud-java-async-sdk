// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListApplicationResponseBody} extends {@link TeaModel}
 *
 * <p>ListApplicationResponseBody</p>
 */
public class ListApplicationResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    @NameInMap("vendorRequestId")
    private String vendorRequestId;

    @NameInMap("vendorType")
    private String vendorType;

    private ListApplicationResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApplicationResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private String requestId; 
        private Long totalCount; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public ListApplicationResponseBody build() {
            return new ListApplicationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AppConfig")
        private String appConfig;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("ApplicationStatus")
        private String applicationStatus;

        @NameInMap("CorpId")
        private String corpId;

        @NameInMap("CreatorUserId")
        private String creatorUserId;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("Inexistence")
        private String inexistence;

        @NameInMap("Name")
        private String name;

        @NameInMap("SubCorpId")
        private String subCorpId;

        private Data(Builder builder) {
            this.appConfig = builder.appConfig;
            this.appType = builder.appType;
            this.applicationStatus = builder.applicationStatus;
            this.corpId = builder.corpId;
            this.creatorUserId = builder.creatorUserId;
            this.description = builder.description;
            this.icon = builder.icon;
            this.inexistence = builder.inexistence;
            this.name = builder.name;
            this.subCorpId = builder.subCorpId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appConfig
         */
        public String getAppConfig() {
            return this.appConfig;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return applicationStatus
         */
        public String getApplicationStatus() {
            return this.applicationStatus;
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return creatorUserId
         */
        public String getCreatorUserId() {
            return this.creatorUserId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return inexistence
         */
        public String getInexistence() {
            return this.inexistence;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return subCorpId
         */
        public String getSubCorpId() {
            return this.subCorpId;
        }

        public static final class Builder {
            private String appConfig; 
            private String appType; 
            private String applicationStatus; 
            private String corpId; 
            private String creatorUserId; 
            private String description; 
            private String icon; 
            private String inexistence; 
            private String name; 
            private String subCorpId; 

            /**
             * AppConfig.
             */
            public Builder appConfig(String appConfig) {
                this.appConfig = appConfig;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * ApplicationStatus.
             */
            public Builder applicationStatus(String applicationStatus) {
                this.applicationStatus = applicationStatus;
                return this;
            }

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * CreatorUserId.
             */
            public Builder creatorUserId(String creatorUserId) {
                this.creatorUserId = creatorUserId;
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
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * Inexistence.
             */
            public Builder inexistence(String inexistence) {
                this.inexistence = inexistence;
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
             * SubCorpId.
             */
            public Builder subCorpId(String subCorpId) {
                this.subCorpId = subCorpId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
