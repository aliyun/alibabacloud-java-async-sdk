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
 * {@link DescribeSensitiveOutboundStatisticResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSensitiveOutboundStatisticResponseBody</p>
 */
public class DescribeSensitiveOutboundStatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeSensitiveOutboundStatisticResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSensitiveOutboundStatisticResponseBody create() {
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
         * <p>The data types of personal information involved in cross-border data transfer.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2EFCFE18-78F8-5079-B312-07***48B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSensitiveOutboundStatisticResponseBody build() {
            return new DescribeSensitiveOutboundStatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSensitiveOutboundStatisticResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSensitiveOutboundStatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetectionResult")
        private String detectionResult;

        @com.aliyun.core.annotation.NameInMap("InfoCount")
        private Long infoCount;

        @com.aliyun.core.annotation.NameInMap("OutboundCount")
        private Long outboundCount;

        @com.aliyun.core.annotation.NameInMap("SensitiveCode")
        private Long sensitiveCode;

        @com.aliyun.core.annotation.NameInMap("SensitiveLevel")
        private String sensitiveLevel;

        @com.aliyun.core.annotation.NameInMap("SensitiveType")
        private String sensitiveType;

        private Data(Builder builder) {
            this.detectionResult = builder.detectionResult;
            this.infoCount = builder.infoCount;
            this.outboundCount = builder.outboundCount;
            this.sensitiveCode = builder.sensitiveCode;
            this.sensitiveLevel = builder.sensitiveLevel;
            this.sensitiveType = builder.sensitiveType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return detectionResult
         */
        public String getDetectionResult() {
            return this.detectionResult;
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

        /**
         * @return sensitiveLevel
         */
        public String getSensitiveLevel() {
            return this.sensitiveLevel;
        }

        /**
         * @return sensitiveType
         */
        public String getSensitiveType() {
            return this.sensitiveType;
        }

        public static final class Builder {
            private String detectionResult; 
            private Long infoCount; 
            private Long outboundCount; 
            private Long sensitiveCode; 
            private String sensitiveLevel; 
            private String sensitiveType; 

            /**
             * <p>The evaluation result. Valid values:</p>
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>546</p>
             */
            public Builder infoCount(Long infoCount) {
                this.infoCount = infoCount;
                return this;
            }

            /**
             * <p>The number of data entries that are transferred across borders.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder outboundCount(Long outboundCount) {
                this.outboundCount = outboundCount;
                return this;
            }

            /**
             * <p>The type of the sensitive data.</p>
             * <blockquote>
             * <p> You can call the <a href="https://help.aliyun.com/document_detail/2859155.html">DescribeApisecRules</a> operation to query the supported types of sensitive data.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1001</p>
             */
            public Builder sensitiveCode(Long sensitiveCode) {
                this.sensitiveCode = sensitiveCode;
                return this;
            }

            /**
             * <p>The sensitivity level. Valid values:</p>
             * <ul>
             * <li><strong>high</strong></li>
             * <li><strong>medium</strong></li>
             * <li><strong>low</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>high</p>
             */
            public Builder sensitiveLevel(String sensitiveLevel) {
                this.sensitiveLevel = sensitiveLevel;
                return this;
            }

            /**
             * <p>The type of the information. Valid values:</p>
             * <ul>
             * <li><strong>info</strong>: full personal information</li>
             * <li><strong>sensitive</strong>: sensitive personal information</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder sensitiveType(String sensitiveType) {
                this.sensitiveType = sensitiveType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
