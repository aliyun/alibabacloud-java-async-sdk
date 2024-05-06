// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudAccessResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudAccessResponseBody</p>
 */
public class ListCloudAccessResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccessList")
    private java.util.List < CloudAccessList> cloudAccessList;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListCloudAccessResponseBody(Builder builder) {
        this.cloudAccessList = builder.cloudAccessList;
        this.currentPage = builder.currentPage;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudAccessResponseBody create() {
        return builder().build();
    }

    /**
     * @return cloudAccessList
     */
    public java.util.List < CloudAccessList> getCloudAccessList() {
        return this.cloudAccessList;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CloudAccessList> cloudAccessList; 
        private Integer currentPage; 
        private String requestId; 
        private Integer showSize; 
        private Integer totalCount; 

        /**
         * CloudAccessList.
         */
        public Builder cloudAccessList(java.util.List < CloudAccessList> cloudAccessList) {
            this.cloudAccessList = cloudAccessList;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
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
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCloudAccessResponseBody build() {
            return new ListCloudAccessResponseBody(this);
        } 

    } 

    public static class CloudAccessList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessId")
        private Long accessId;

        @com.aliyun.core.annotation.NameInMap("CloudName")
        private String cloudName;

        @com.aliyun.core.annotation.NameInMap("SecretId")
        private String secretId;

        @com.aliyun.core.annotation.NameInMap("ServiceStatus")
        private String serviceStatus;

        private CloudAccessList(Builder builder) {
            this.accessId = builder.accessId;
            this.cloudName = builder.cloudName;
            this.secretId = builder.secretId;
            this.serviceStatus = builder.serviceStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CloudAccessList create() {
            return builder().build();
        }

        /**
         * @return accessId
         */
        public Long getAccessId() {
            return this.accessId;
        }

        /**
         * @return cloudName
         */
        public String getCloudName() {
            return this.cloudName;
        }

        /**
         * @return secretId
         */
        public String getSecretId() {
            return this.secretId;
        }

        /**
         * @return serviceStatus
         */
        public String getServiceStatus() {
            return this.serviceStatus;
        }

        public static final class Builder {
            private Long accessId; 
            private String cloudName; 
            private String secretId; 
            private String serviceStatus; 

            /**
             * AccessId.
             */
            public Builder accessId(Long accessId) {
                this.accessId = accessId;
                return this;
            }

            /**
             * CloudName.
             */
            public Builder cloudName(String cloudName) {
                this.cloudName = cloudName;
                return this;
            }

            /**
             * SecretId.
             */
            public Builder secretId(String secretId) {
                this.secretId = secretId;
                return this;
            }

            /**
             * ServiceStatus.
             */
            public Builder serviceStatus(String serviceStatus) {
                this.serviceStatus = serviceStatus;
                return this;
            }

            public CloudAccessList build() {
                return new CloudAccessList(this);
            } 

        } 

    }
}
