// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAppsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAppsResponseBody</p>
 */
public class DescribeAppsResponseBody extends TeaModel {
    @NameInMap("Apps")
    private Apps apps;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAppsResponseBody(Builder builder) {
        this.apps = builder.apps;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return apps
     */
    public Apps getApps() {
        return this.apps;
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
        private Apps apps; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The name of the app.
         */
        public Builder apps(Apps apps) {
            this.apps = apps;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned app information. It is an array consisting of AppItem data.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAppsResponseBody build() {
            return new DescribeAppsResponseBody(this);
        } 

    } 

    public static class AppItem extends TeaModel {
        @NameInMap("AppId")
        private Long appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("Description")
        private String description;

        private AppItem(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppItem create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Long getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private Long appId; 
            private String appName; 
            private String description; 

            /**
             * *   This API is intended for API providers.
             * <p>
             * *   API providers can use the app IDs or their Apsara Stack tenant accounts to query app information.
             * *   Each provider can call this operation for a maximum of 200 times every day in a region.
             */
            public Builder appId(Long appId) {
                this.appId = appId;
                return this;
            }

            /**
             * The description of the app.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * The ID of the app.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public AppItem build() {
                return new AppItem(this);
            } 

        } 

    }
    public static class Apps extends TeaModel {
        @NameInMap("AppItem")
        private java.util.List < AppItem> appItem;

        private Apps(Builder builder) {
            this.appItem = builder.appItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Apps create() {
            return builder().build();
        }

        /**
         * @return appItem
         */
        public java.util.List < AppItem> getAppItem() {
            return this.appItem;
        }

        public static final class Builder {
            private java.util.List < AppItem> appItem; 

            /**
             * AppItem.
             */
            public Builder appItem(java.util.List < AppItem> appItem) {
                this.appItem = appItem;
                return this;
            }

            public Apps build() {
                return new Apps(this);
            } 

        } 

    }
}
