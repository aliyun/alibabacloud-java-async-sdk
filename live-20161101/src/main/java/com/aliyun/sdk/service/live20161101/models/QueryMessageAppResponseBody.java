// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMessageAppResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMessageAppResponseBody</p>
 */
public class QueryMessageAppResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private QueryMessageAppResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMessageAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public QueryMessageAppResponseBody build() {
            return new QueryMessageAppResponseBody(this);
        } 

    } 

    public static class AppList extends TeaModel {
        @NameInMap("AppConfig")
        private java.util.Map < String, String > appConfig;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("Extension")
        private java.util.Map < String, String > extension;

        @NameInMap("Status")
        private Integer status;

        private AppList(Builder builder) {
            this.appConfig = builder.appConfig;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.createTime = builder.createTime;
            this.extension = builder.extension;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppList create() {
            return builder().build();
        }

        /**
         * @return appConfig
         */
        public java.util.Map < String, String > getAppConfig() {
            return this.appConfig;
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
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return extension
         */
        public java.util.Map < String, String > getExtension() {
            return this.extension;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.Map < String, String > appConfig; 
            private String appId; 
            private String appName; 
            private Long createTime; 
            private java.util.Map < String, String > extension; 
            private Integer status; 

            /**
             * AppConfig.
             */
            public Builder appConfig(java.util.Map < String, String > appConfig) {
                this.appConfig = appConfig;
                return this;
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
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Extension.
             */
            public Builder extension(java.util.Map < String, String > extension) {
                this.extension = extension;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public AppList build() {
                return new AppList(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AppList")
        private java.util.List < AppList> appList;

        @NameInMap("HasMore")
        private Boolean hasMore;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Result(Builder builder) {
            this.appList = builder.appList;
            this.hasMore = builder.hasMore;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appList
         */
        public java.util.List < AppList> getAppList() {
            return this.appList;
        }

        /**
         * @return hasMore
         */
        public Boolean getHasMore() {
            return this.hasMore;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < AppList> appList; 
            private Boolean hasMore; 
            private Integer totalCount; 

            /**
             * AppList.
             */
            public Builder appList(java.util.List < AppList> appList) {
                this.appList = appList;
                return this;
            }

            /**
             * HasMore.
             */
            public Builder hasMore(Boolean hasMore) {
                this.hasMore = hasMore;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
