// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeResponseCodeTrendGraphResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeResponseCodeTrendGraphResponseBody</p>
 */
public class DescribeResponseCodeTrendGraphResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResponseCodes")
    private java.util.List < ResponseCodes> responseCodes;

    private DescribeResponseCodeTrendGraphResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.responseCodes = builder.responseCodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResponseCodeTrendGraphResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return responseCodes
     */
    public java.util.List < ResponseCodes> getResponseCodes() {
        return this.responseCodes;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResponseCodes> responseCodes; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>7D46493E-84DD-58CE-80A7-8643****9ECC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the statistics of the error codes.</p>
         */
        public Builder responseCodes(java.util.List < ResponseCodes> responseCodes) {
            this.responseCodes = responseCodes;
            return this;
        }

        public DescribeResponseCodeTrendGraphResponseBody build() {
            return new DescribeResponseCodeTrendGraphResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeResponseCodeTrendGraphResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeResponseCodeTrendGraphResponseBody</p>
     */
    public static class ResponseCodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("302Pv")
        private Long code302Pv;

        @com.aliyun.core.annotation.NameInMap("405Pv")
        private Long code405Pv;

        @com.aliyun.core.annotation.NameInMap("444Pv")
        private Long code444Pv;

        @com.aliyun.core.annotation.NameInMap("499Pv")
        private Long code499Pv;

        @com.aliyun.core.annotation.NameInMap("5xxPv")
        private Long code5xxPv;

        @com.aliyun.core.annotation.NameInMap("Index")
        private Long index;

        private ResponseCodes(Builder builder) {
            this.code302Pv = builder.code302Pv;
            this.code405Pv = builder.code405Pv;
            this.code444Pv = builder.code444Pv;
            this.code499Pv = builder.code499Pv;
            this.code5xxPv = builder.code5xxPv;
            this.index = builder.index;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResponseCodes create() {
            return builder().build();
        }

        /**
         * @return code302Pv
         */
        public Long getCode302Pv() {
            return this.code302Pv;
        }

        /**
         * @return code405Pv
         */
        public Long getCode405Pv() {
            return this.code405Pv;
        }

        /**
         * @return code444Pv
         */
        public Long getCode444Pv() {
            return this.code444Pv;
        }

        /**
         * @return code499Pv
         */
        public Long getCode499Pv() {
            return this.code499Pv;
        }

        /**
         * @return code5xxPv
         */
        public Long getCode5xxPv() {
            return this.code5xxPv;
        }

        /**
         * @return index
         */
        public Long getIndex() {
            return this.index;
        }

        public static final class Builder {
            private Long code302Pv; 
            private Long code405Pv; 
            private Long code444Pv; 
            private Long code499Pv; 
            private Long code5xxPv; 
            private Long index; 

            /**
             * <p>The number of 302 error codes that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code302Pv(Long code302Pv) {
                this.code302Pv = code302Pv;
                return this;
            }

            /**
             * <p>The number of 405 error codes that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>121645464</p>
             */
            public Builder code405Pv(Long code405Pv) {
                this.code405Pv = code405Pv;
                return this;
            }

            /**
             * <p>The number of 444 error codes that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code444Pv(Long code444Pv) {
                this.code444Pv = code444Pv;
                return this;
            }

            /**
             * <p>The number of 499 error codes that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code499Pv(Long code499Pv) {
                this.code499Pv = code499Pv;
                return this;
            }

            /**
             * <p>The number of 5xx error codes that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>2932</p>
             */
            public Builder code5xxPv(Long code5xxPv) {
                this.code5xxPv = code5xxPv;
                return this;
            }

            /**
             * <p>The serial number of the time interval. The serial numbers are arranged in chronological order.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder index(Long index) {
                this.index = index;
                return this;
            }

            public ResponseCodes build() {
                return new ResponseCodes(this);
            } 

        } 

    }
}
