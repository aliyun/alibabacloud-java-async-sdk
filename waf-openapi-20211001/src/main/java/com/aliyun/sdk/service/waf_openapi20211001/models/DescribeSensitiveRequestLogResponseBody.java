// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeSensitiveRequestLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveRequestLogResponseBody</p>
 */
public class DescribeSensitiveRequestLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveRequestLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveRequestLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The access logs.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>26E46541-7AAB-5565-801D-F14DBDC5****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSensitiveRequestLogResponseBody build() {
            return new DescribeSensitiveRequestLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveRequestLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveRequestLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("RemoteCountryId")
        private String remoteCountryId;

        @com.aliyun.core.annotation.NameInMap("RequestTime")
        private Long requestTime;

        @com.aliyun.core.annotation.NameInMap("SensitiveList")
        private String sensitiveList;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private Data(Builder builder) {
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.clientIP = builder.clientIP;
            this.count = builder.count;
            this.matchedHost = builder.matchedHost;
            this.remoteCountryId = builder.remoteCountryId;
            this.requestTime = builder.requestTime;
            this.sensitiveList = builder.sensitiveList;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return apiFormat
         */
        public String getApiFormat() {
            return this.apiFormat;
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return clientIP
         */
        public String getClientIP() {
            return this.clientIP;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return remoteCountryId
         */
        public String getRemoteCountryId() {
            return this.remoteCountryId;
        }

        /**
         * @return requestTime
         */
        public Long getRequestTime() {
            return this.requestTime;
        }

        /**
         * @return sensitiveList
         */
        public String getSensitiveList() {
            return this.sensitiveList;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String apiFormat; 
            private String apiId; 
            private String clientIP; 
            private Long count; 
            private String matchedHost; 
            private String remoteCountryId; 
            private Long requestTime; 
            private String sensitiveList; 
            private String traceId; 

            /**
             * <p>The API.</p>
             * 
             * <strong>example:</strong>
             * <p>/api/users/login</p>
             */
            public Builder apiFormat(String apiFormat) {
                this.apiFormat = apiFormat;
                return this;
            }

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>197b52abcd81d6a8bd4***e477</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The IP address.</p>
             * 
             * <strong>example:</strong>
             * <p>103.118.55.**</p>
             */
            public Builder clientIP(String clientIP) {
                this.clientIP = clientIP;
                return this;
            }

            /**
             * <p>The number of sensitive data records involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The domain name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>a.****.com</p>
             */
            public Builder matchedHost(String matchedHost) {
                this.matchedHost = matchedHost;
                return this;
            }

            /**
             * <p>IP region, formatted as a region code.</p>
             * 
             * <strong>example:</strong>
             * <p>CN</p>
             */
            public Builder remoteCountryId(String remoteCountryId) {
                this.remoteCountryId = remoteCountryId;
                return this;
            }

            /**
             * <p>The time when the request was initiated. The value is a UNIX timestamp displayed in UTC. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1723392000</p>
             */
            public Builder requestTime(Long requestTime) {
                this.requestTime = requestTime;
                return this;
            }

            /**
             * <p>The sensitive data. The value of this parameter is a JSON string that contains multiple parameters. The Key of JSON is the sensitive information type identifier (including default and custom types), and the Value is the sensitive information data list.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of sensitive data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *           &quot;1000&quot;:[ 
             *               &quot;90.88.49.19&quot;,
             *               &quot;90.88.49.19&quot;
             *           ],
             *           &quot;835436&quot;:[ 
             *               &quot;<a href="http://www.abc.com">www.abc.com</a>&quot;
             *           ]
             * }</p>
             */
            public Builder sensitiveList(String sensitiveList) {
                this.sensitiveList = sensitiveList;
                return this;
            }

            /**
             * <p>The trace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>0a3d455b17027784870843933dce3d</p>
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
