// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dytnsapi20200217.models;

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
 * {@link DescribePhoneNumberAnalysisAIResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePhoneNumberAnalysisAIResponseBody</p>
 */
public class DescribePhoneNumberAnalysisAIResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribePhoneNumberAnalysisAIResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePhoneNumberAnalysisAIResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribePhoneNumberAnalysisAIResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response code. Valid values:</p>
         * <ul>
         * <li>OK: The request is successful.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response parameters.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>68A40250-50CD-034C-B728-0BD******177</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePhoneNumberAnalysisAIResponseBody build() {
            return new DescribePhoneNumberAnalysisAIResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePhoneNumberAnalysisAIResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePhoneNumberAnalysisAIResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        private Data(Builder builder) {
            this.code = builder.code;
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        public static final class Builder {
            private String code; 
            private String number; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.code = model.code;
                this.number = model.number;
            } 

            /**
             * <p>The returned code.</p>
             * <ul>
             * <li>YES: The specified phone number is valid.</li>
             * <li>NO: The specified phone number is invalid.</li>
             * <li>UNKNOWN: The specified phone number is unknown</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>YES</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The specified phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>187****5620</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
