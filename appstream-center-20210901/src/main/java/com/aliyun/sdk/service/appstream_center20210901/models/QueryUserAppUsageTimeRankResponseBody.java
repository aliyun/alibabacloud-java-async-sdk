// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link QueryUserAppUsageTimeRankResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserAppUsageTimeRankResponseBody</p>
 */
public class QueryUserAppUsageTimeRankResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexData")
    private java.util.List<IndexData> indexData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryUserAppUsageTimeRankResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexData = builder.indexData;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserAppUsageTimeRankResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return indexData
     */
    public java.util.List<IndexData> getIndexData() {
        return this.indexData;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<IndexData> indexData; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryUserAppUsageTimeRankResponseBody model) {
            this.code = model.code;
            this.indexData = model.indexData;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of <code>200</code> indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The ranking list of user application usage duration, sorted in descending order of cumulative usage duration.</p>
         */
        public Builder indexData(java.util.List<IndexData> indexData) {
            this.indexData = indexData;
            return this;
        }

        /**
         * <p>The description of the request processing result. If the request is successful, <code>success</code> is usually returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request, which can be used to troubleshoot request issues.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryUserAppUsageTimeRankResponseBody build() {
            return new QueryUserAppUsageTimeRankResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserAppUsageTimeRankResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserAppUsageTimeRankResponseBody</p>
     */
    public static class IndexData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppTimeCnt")
        private String appTimeCnt;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        private IndexData(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appTimeCnt = builder.appTimeCnt;
            this.appVersion = builder.appVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexData create() {
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
         * @return appTimeCnt
         */
        public String getAppTimeCnt() {
            return this.appTimeCnt;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appTimeCnt; 
            private String appVersion; 

            private Builder() {
            } 

            private Builder(IndexData model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appTimeCnt = model.appTimeCnt;
                this.appVersion = model.appVersion;
            } 

            /**
             * <p>The application ID.</p>
             * 
             * <strong>example:</strong>
             * <p>app-9ciijz60n4xsv****</p>
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>The application name.</p>
             * 
             * <strong>example:</strong>
             * <p>Visual Studio Code</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The cumulative usage duration of the application within the statistical range. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder appTimeCnt(String appTimeCnt) {
                this.appTimeCnt = appTimeCnt;
                return this;
            }

            /**
             * <p>The application version. The current version may not return this value, and callers should not rely on this field. A non-empty value indicates the application version.</p>
             * 
             * <strong>example:</strong>
             * <p>1.96.0</p>
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            public IndexData build() {
                return new IndexData(this);
            } 

        } 

    }
}
