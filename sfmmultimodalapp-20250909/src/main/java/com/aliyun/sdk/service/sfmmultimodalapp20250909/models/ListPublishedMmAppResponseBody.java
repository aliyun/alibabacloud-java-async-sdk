// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link ListPublishedMmAppResponseBody} extends {@link TeaModel}
 *
 * <p>ListPublishedMmAppResponseBody</p>
 */
public class ListPublishedMmAppResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PublishedVersionInfoList")
    private java.util.List<PublishedVersionInfoList> publishedVersionInfoList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListPublishedMmAppResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publishedVersionInfoList = builder.publishedVersionInfoList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPublishedMmAppResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return publishedVersionInfoList
     */
    public java.util.List<PublishedVersionInfoList> getPublishedVersionInfoList() {
        return this.publishedVersionInfoList;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<PublishedVersionInfoList> publishedVersionInfoList; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListPublishedMmAppResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.publishedVersionInfoList = model.publishedVersionInfoList;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PublishedVersionInfoList.
         */
        public Builder publishedVersionInfoList(java.util.List<PublishedVersionInfoList> publishedVersionInfoList) {
            this.publishedVersionInfoList = publishedVersionInfoList;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPublishedMmAppResponseBody build() {
            return new ListPublishedMmAppResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPublishedMmAppResponseBody} extends {@link TeaModel}
     *
     * <p>ListPublishedMmAppResponseBody</p>
     */
    public static class PublishedVersionInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("CreateUserId")
        private String createUserId;

        @com.aliyun.core.annotation.NameInMap("CreateUserName")
        private String createUserName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private PublishedVersionInfoList(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createUserId = builder.createUserId;
            this.createUserName = builder.createUserName;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.publishTime = builder.publishTime;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedVersionInfoList create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return createUserId
         */
        public String getCreateUserId() {
            return this.createUserId;
        }

        /**
         * @return createUserName
         */
        public String getCreateUserName() {
            return this.createUserName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String createUserId; 
            private String createUserName; 
            private String description; 
            private String gmtCreate; 
            private String publishTime; 
            private Long version; 

            private Builder() {
            } 

            private Builder(PublishedVersionInfoList model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.createUserId = model.createUserId;
                this.createUserName = model.createUserName;
                this.description = model.description;
                this.gmtCreate = model.gmtCreate;
                this.publishTime = model.publishTime;
                this.version = model.version;
            } 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * CreateUserId.
             */
            public Builder createUserId(String createUserId) {
                this.createUserId = createUserId;
                return this;
            }

            /**
             * CreateUserName.
             */
            public Builder createUserName(String createUserName) {
                this.createUserName = createUserName;
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
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public PublishedVersionInfoList build() {
                return new PublishedVersionInfoList(this);
            } 

        } 

    }
}
