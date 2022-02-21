// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSummaryAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSummaryAppsResponseBody</p>
 */
public class ListSummaryAppsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SummaryAppInfos")
    private SummaryAppInfos summaryAppInfos;

    private ListSummaryAppsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.summaryAppInfos = builder.summaryAppInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSummaryAppsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return summaryAppInfos
     */
    public SummaryAppInfos getSummaryAppInfos() {
        return this.summaryAppInfos;
    }

    public static final class Builder {
        private String requestId; 
        private SummaryAppInfos summaryAppInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SummaryAppInfos.
         */
        public Builder summaryAppInfos(SummaryAppInfos summaryAppInfos) {
            this.summaryAppInfos = summaryAppInfos;
            return this;
        }

        public ListSummaryAppsResponseBody build() {
            return new ListSummaryAppsResponseBody(this);
        } 

    } 

    public static class SummaryAppInfo extends TeaModel {
        @NameInMap("AppKey")
        private Long appKey;

        @NameInMap("AppName")
        private String appName;

        private SummaryAppInfo(Builder builder) {
            this.appKey = builder.appKey;
            this.appName = builder.appName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryAppInfo create() {
            return builder().build();
        }

        /**
         * @return appKey
         */
        public Long getAppKey() {
            return this.appKey;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        public static final class Builder {
            private Long appKey; 
            private String appName; 

            /**
             * AppKey.
             */
            public Builder appKey(Long appKey) {
                this.appKey = appKey;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            public SummaryAppInfo build() {
                return new SummaryAppInfo(this);
            } 

        } 

    }
    public static class SummaryAppInfos extends TeaModel {
        @NameInMap("SummaryAppInfo")
        private java.util.List < SummaryAppInfo> summaryAppInfo;

        private SummaryAppInfos(Builder builder) {
            this.summaryAppInfo = builder.summaryAppInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SummaryAppInfos create() {
            return builder().build();
        }

        /**
         * @return summaryAppInfo
         */
        public java.util.List < SummaryAppInfo> getSummaryAppInfo() {
            return this.summaryAppInfo;
        }

        public static final class Builder {
            private java.util.List < SummaryAppInfo> summaryAppInfo; 

            /**
             * SummaryAppInfo.
             */
            public Builder summaryAppInfo(java.util.List < SummaryAppInfo> summaryAppInfo) {
                this.summaryAppInfo = summaryAppInfo;
                return this;
            }

            public SummaryAppInfos build() {
                return new SummaryAppInfos(this);
            } 

        } 

    }
}
