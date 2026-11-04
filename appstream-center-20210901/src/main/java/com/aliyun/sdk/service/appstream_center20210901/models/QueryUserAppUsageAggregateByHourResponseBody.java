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
 * {@link QueryUserAppUsageAggregateByHourResponseBody} extends {@link TeaModel}
 *
 * <p>QueryUserAppUsageAggregateByHourResponseBody</p>
 */
public class QueryUserAppUsageAggregateByHourResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("IndexData")
    private java.util.List<IndexData> indexData;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryUserAppUsageAggregateByHourResponseBody(Builder builder) {
        this.code = builder.code;
        this.indexData = builder.indexData;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUserAppUsageAggregateByHourResponseBody create() {
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

        private Builder(QueryUserAppUsageAggregateByHourResponseBody model) {
            this.code = model.code;
            this.indexData = model.indexData;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The business status code. A value of 200 indicates that the request is processed successfully. Other values indicate that the processing failed.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The list of hourly aggregated user application usage data. A maximum of five records are returned for each hour.</p>
         */
        public Builder indexData(java.util.List<IndexData> indexData) {
            this.indexData = indexData;
            return this;
        }

        /**
         * <p>The description of the request processing result. A value of success is usually returned when the request is successful.</p>
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

        public QueryUserAppUsageAggregateByHourResponseBody build() {
            return new QueryUserAppUsageAggregateByHourResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryUserAppUsageAggregateByHourResponseBody} extends {@link TeaModel}
     *
     * <p>QueryUserAppUsageAggregateByHourResponseBody</p>
     */
    public static class IndexData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("AppTimeCnt")
        private String appTimeCnt;

        @com.aliyun.core.annotation.NameInMap("Hh")
        private String hh;

        private IndexData(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appTimeCnt = builder.appTimeCnt;
            this.hh = builder.hh;
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
         * @return hh
         */
        public String getHh() {
            return this.hh;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appTimeCnt; 
            private String hh; 

            private Builder() {
            } 

            private Builder(IndexData model) {
                this.appId = model.appId;
                this.appName = model.appName;
                this.appTimeCnt = model.appTimeCnt;
                this.hh = model.hh;
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
             * <p>The statistical hour, which is a two-digit 24-hour format string with values ranging from 00 to 23. Hour boundaries are divided based on the Asia/Shanghai (UTC+8) time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>02</p>
             */
            public Builder hh(String hh) {
                this.hh = hh;
                return this;
            }

            public IndexData build() {
                return new IndexData(this);
            } 

        } 

    }
}
