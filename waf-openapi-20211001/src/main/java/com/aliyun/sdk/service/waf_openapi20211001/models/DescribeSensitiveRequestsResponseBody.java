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
 * {@link DescribeSensitiveRequestsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveRequestsResponseBody</p>
 */
public class DescribeSensitiveRequestsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveRequestsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveRequestsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSensitiveRequestsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The tracing results of the data.</p>
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
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSensitiveRequestsResponseBody build() {
            return new DescribeSensitiveRequestsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveRequestsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveRequestsResponseBody</p>
     */
    public static class InfoCount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        private InfoCount(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InfoCount create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        public static final class Builder {
            private String code; 
            private Long count; 

            private Builder() {
            } 

            private Builder(InfoCount model) {
                this.code = model.code;
                this.count = model.count;
            } 

            /**
             * <p>The type of the sensitive data.</p>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The number of sensitive data entries.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            public InfoCount build() {
                return new InfoCount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSensitiveRequestsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveRequestsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbnormalCount")
        private Long abnormalCount;

        @com.aliyun.core.annotation.NameInMap("ApiFormat")
        private String apiFormat;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("ClientIP")
        private String clientIP;

        @com.aliyun.core.annotation.NameInMap("DetectionResult")
        private String detectionResult;

        @com.aliyun.core.annotation.NameInMap("EventCount")
        private Long eventCount;

        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private java.util.List<InfoCount> infoCount;

        @com.aliyun.core.annotation.NameInMap("MatchedHost")
        private String matchedHost;

        @com.aliyun.core.annotation.NameInMap("SensitiveList")
        private java.util.List<String> sensitiveList;

        private Data(Builder builder) {
            this.abnormalCount = builder.abnormalCount;
            this.apiFormat = builder.apiFormat;
            this.apiId = builder.apiId;
            this.clientIP = builder.clientIP;
            this.detectionResult = builder.detectionResult;
            this.eventCount = builder.eventCount;
            this.infoCount = builder.infoCount;
            this.matchedHost = builder.matchedHost;
            this.sensitiveList = builder.sensitiveList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return abnormalCount
         */
        public Long getAbnormalCount() {
            return this.abnormalCount;
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
         * @return detectionResult
         */
        public String getDetectionResult() {
            return this.detectionResult;
        }

        /**
         * @return eventCount
         */
        public Long getEventCount() {
            return this.eventCount;
        }

        /**
         * @return infoCount
         */
        public java.util.List<InfoCount> getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return matchedHost
         */
        public String getMatchedHost() {
            return this.matchedHost;
        }

        /**
         * @return sensitiveList
         */
        public java.util.List<String> getSensitiveList() {
            return this.sensitiveList;
        }

        public static final class Builder {
            private Long abnormalCount; 
            private String apiFormat; 
            private String apiId; 
            private String clientIP; 
            private String detectionResult; 
            private Long eventCount; 
            private java.util.List<InfoCount> infoCount; 
            private String matchedHost; 
            private java.util.List<String> sensitiveList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.abnormalCount = model.abnormalCount;
                this.apiFormat = model.apiFormat;
                this.apiId = model.apiId;
                this.clientIP = model.clientIP;
                this.detectionResult = model.detectionResult;
                this.eventCount = model.eventCount;
                this.infoCount = model.infoCount;
                this.matchedHost = model.matchedHost;
                this.sensitiveList = model.sensitiveList;
            } 

            /**
             * <p>The number of risks in the previous 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder abnormalCount(Long abnormalCount) {
                this.abnormalCount = abnormalCount;
                return this;
            }

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
             * <p>09559c0d71ca2ffc996b81***836d8</p>
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
             * <p>The evaluation result. Valid values:</p>
             * <ul>
             * <li><strong>leak</strong>: Data leaks may occur.</li>
             * <li><strong>none</strong>: No data leak can occur.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>leak</p>
             */
            public Builder detectionResult(String detectionResult) {
                this.detectionResult = detectionResult;
                return this;
            }

            /**
             * <p>The number of events in the previous 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>679</p>
             */
            public Builder eventCount(Long eventCount) {
                this.eventCount = eventCount;
                return this;
            }

            /**
             * <p>The statistics of the sensitive data.</p>
             */
            public Builder infoCount(java.util.List<InfoCount> infoCount) {
                this.infoCount = infoCount;
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
             * <p>The sensitive data.</p>
             */
            public Builder sensitiveList(java.util.List<String> sensitiveList) {
                this.sensitiveList = sensitiveList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
