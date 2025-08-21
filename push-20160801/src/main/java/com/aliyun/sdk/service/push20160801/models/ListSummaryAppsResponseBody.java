// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link ListSummaryAppsResponseBody} extends {@link TeaModel}
 *
 * <p>ListSummaryAppsResponseBody</p>
 */
public class ListSummaryAppsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SummaryAppInfos")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListSummaryAppsResponseBody model) {
            this.requestId = model.requestId;
            this.summaryAppInfos = model.summaryAppInfos;
        } 

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

    /**
     * 
     * {@link ListSummaryAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSummaryAppsResponseBody</p>
     */
    public static class SummaryAppInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppKey")
        private Long appKey;

        @com.aliyun.core.annotation.NameInMap("AppName")
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

            private Builder() {
            } 

            private Builder(SummaryAppInfo model) {
                this.appKey = model.appKey;
                this.appName = model.appName;
            } 

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
    /**
     * 
     * {@link ListSummaryAppsResponseBody} extends {@link TeaModel}
     *
     * <p>ListSummaryAppsResponseBody</p>
     */
    public static class SummaryAppInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SummaryAppInfo")
        private java.util.List<SummaryAppInfo> summaryAppInfo;

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
        public java.util.List<SummaryAppInfo> getSummaryAppInfo() {
            return this.summaryAppInfo;
        }

        public static final class Builder {
            private java.util.List<SummaryAppInfo> summaryAppInfo; 

            private Builder() {
            } 

            private Builder(SummaryAppInfos model) {
                this.summaryAppInfo = model.summaryAppInfo;
            } 

            /**
             * SummaryAppInfo.
             */
            public Builder summaryAppInfo(java.util.List<SummaryAppInfo> summaryAppInfo) {
                this.summaryAppInfo = summaryAppInfo;
                return this;
            }

            public SummaryAppInfos build() {
                return new SummaryAppInfos(this);
            } 

        } 

    }
}
