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
 * {@link DescribeSensitiveDetectionResultResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveDetectionResultResponseBody</p>
 */
public class DescribeSensitiveDetectionResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSensitiveDetectionResultResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveDetectionResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeSensitiveDetectionResultResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The compliance check results.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSensitiveDetectionResultResponseBody build() {
            return new DescribeSensitiveDetectionResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveDetectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveDetectionResultResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private Long infoCount;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private Long sensitiveCode;

        private List(Builder builder) {
            this.infoCount = builder.infoCount;
            this.outboundCount = builder.outboundCount;
            this.sensitiveCode = builder.sensitiveCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Long getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return outboundCount
         */
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        /**
         * @return sensitiveCode
         */
        public Long getSensitiveCode() {
            return this.sensitiveCode;
        }

        public static final class Builder {
            private Long infoCount; 
            private Long outboundCount; 
            private Long sensitiveCode; 

            private Builder() {
            } 

            private Builder(List model) {
                this.infoCount = model.infoCount;
                this.outboundCount = model.outboundCount;
                this.sensitiveCode = model.sensitiveCode;
            } 

            /**
             * <p>The number of personal information records.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder infoCount(Long infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * <p>The number of sensitive personal information records that are involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder outboundCount(Long outboundCount) {
                this.outboundCount = outboundCount;
                return this;
            }

            /**
             * <p>The sensitive data type.</p>
             * 
             * <strong>example:</strong>
             * <p>1002</p>
             */
            public Builder sensitiveCode(Long sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSensitiveDetectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveDetectionResultResponseBody</p>
     */
    public static class Max extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private Long infoCount;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private Long sensitiveCode;

        private Max(Builder builder) {
            this.infoCount = builder.infoCount;
            this.outboundCount = builder.outboundCount;
            this.sensitiveCode = builder.sensitiveCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Max create() {
            return builder().build();
        }

        /**
         * @return infoCount
         */
        public Long getInfoCount() {
            return this.infoCount;
        }

        /**
         * @return outboundCount
         */
        public Long getOutboundCount() {
            return this.outboundCount;
        }

        /**
         * @return sensitiveCode
         */
        public Long getSensitiveCode() {
            return this.sensitiveCode;
        }

        public static final class Builder {
            private Long infoCount; 
            private Long outboundCount; 
            private Long sensitiveCode; 

            private Builder() {
            } 

            private Builder(Max model) {
                this.infoCount = model.infoCount;
                this.outboundCount = model.outboundCount;
                this.sensitiveCode = model.sensitiveCode;
            } 

            /**
             * <p>The number of sensitive personal information records that are of the most frequent sensitive data type.</p>
             * 
             * <strong>example:</strong>
             * <p>187</p>
             */
            public Builder infoCount(Long infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * <p>The number of sensitive personal information records that are of the most frequent sensitive data type and are involved in cross-border data transfer.</p>
             * 
             * <strong>example:</strong>
             * <p>54</p>
             */
            public Builder outboundCount(Long outboundCount) {
                this.outboundCount = outboundCount;
                return this;
            }

            /**
             * <p>The most frequent sensitive data type.</p>
             * 
             * <strong>example:</strong>
             * <p>1003</p>
             */
            public Builder sensitiveCode(Long sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            public Max build() {
                return new Max(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSensitiveDetectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveDetectionResultResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectionResult")
        private String detectionResult;

        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("Max")
        private Max max;

        private Result(Builder builder) {
            this.detectionResult = builder.detectionResult;
            this.list = builder.list;
            this.max = builder.max;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return detectionResult
         */
        public String getDetectionResult() {
            return this.detectionResult;
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        /**
         * @return max
         */
        public Max getMax() {
            return this.max;
        }

        public static final class Builder {
            private String detectionResult; 
            private java.util.List<List> list; 
            private Max max; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.detectionResult = model.detectionResult;
                this.list = model.list;
                this.max = model.max;
            } 

            /**
             * <p>The compliance check results. Valid values:</p>
             * <ul>
             * <li><strong>report</strong>: Risks exist in cross-border data transfer.</li>
             * <li><strong>none</strong>: No risks exist in cross-border data transfer.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>report</p>
             */
            public Builder detectionResult(String detectionResult) {
                this.detectionResult = detectionResult;
                return this;
            }

            /**
             * <p>The sensitive information check results by sensitive data type.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The maximum values in the statistics of sensitive data types.</p>
             */
            public Builder max(Max max) {
                this.max = max;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSensitiveDetectionResultResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveDetectionResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Result")
        private java.util.List<Result> result;

        private Data(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.result = model.result;
            } 

            /**
             * <p>The compliance checks.</p>
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
