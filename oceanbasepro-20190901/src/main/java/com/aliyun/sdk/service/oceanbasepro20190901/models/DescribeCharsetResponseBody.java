// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCharsetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCharsetResponseBody</p>
 */
public class DescribeCharsetResponseBody extends TeaModel {
    @NameInMap("Charset")
    private java.util.List < Charset> charset;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeCharsetResponseBody(Builder builder) {
        this.charset = builder.charset;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCharsetResponseBody create() {
        return builder().build();
    }

    /**
     * @return charset
     */
    public java.util.List < Charset> getCharset() {
        return this.charset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Charset> charset; 
        private String requestId; 

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DescribeCharset
         * &TenantMode=Oracle
         * &Common request parameters
         * ```
         */
        public Builder charset(java.util.List < Charset> charset) {
            this.charset = charset;
            return this;
        }

        /**
         * The operation that you want to perform.   
         * <p>
         * Set the value to **DescribeCharset**.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCharsetResponseBody build() {
            return new DescribeCharsetResponseBody(this);
        } 

    } 

    public static class Charset extends TeaModel {
        @NameInMap("Charset")
        private String charset;

        @NameInMap("Collations")
        private java.util.List < String > collations;

        private Charset(Builder builder) {
            this.charset = builder.charset;
            this.collations = builder.collations;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Charset create() {
            return builder().build();
        }

        /**
         * @return charset
         */
        public String getCharset() {
            return this.charset;
        }

        /**
         * @return collations
         */
        public java.util.List < String > getCollations() {
            return this.collations;
        }

        public static final class Builder {
            private String charset; 
            private java.util.List < String > collations; 

            /**
             * DescribeCharset
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Collations.
             */
            public Builder collations(java.util.List < String > collations) {
                this.collations = collations;
                return this;
            }

            public Charset build() {
                return new Charset(this);
            } 

        } 

    }
}
