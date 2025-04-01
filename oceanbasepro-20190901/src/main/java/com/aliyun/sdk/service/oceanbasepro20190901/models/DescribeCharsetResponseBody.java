// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeCharsetResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCharsetResponseBody</p>
 */
public class DescribeCharsetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Charset")
    private java.util.List<Charset> charset;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return charset
     */
    public java.util.List<Charset> getCharset() {
        return this.charset;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Charset> charset; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCharsetResponseBody model) {
            this.charset = model.charset;
            this.requestId = model.requestId;
        } 

        /**
         * <pre><code>http(s)://[Endpoint]/?Action=DescribeCharset
         * &amp;TenantMode=Oracle
         * &amp;Common request parameters
         * </code></pre>
         */
        public Builder charset(java.util.List<Charset> charset) {
            this.charset = charset;
            return this;
        }

        /**
         * <p>The operation that you want to perform.<br>Set the value to <strong>DescribeCharset</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCharsetResponseBody build() {
            return new DescribeCharsetResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCharsetResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCharsetResponseBody</p>
     */
    public static class Charset extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Charset")
        private String charset;

        @com.aliyun.core.annotation.NameInMap("Collations")
        private java.util.List<String> collations;

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
        public java.util.List<String> getCollations() {
            return this.collations;
        }

        public static final class Builder {
            private String charset; 
            private java.util.List<String> collations; 

            private Builder() {
            } 

            private Builder(Charset model) {
                this.charset = model.charset;
                this.collations = model.collations;
            } 

            /**
             * <p>DescribeCharset</p>
             * 
             * <strong>example:</strong>
             * <p>utf8</p>
             */
            public Builder charset(String charset) {
                this.charset = charset;
                return this;
            }

            /**
             * Collations.
             */
            public Builder collations(java.util.List<String> collations) {
                this.collations = collations;
                return this;
            }

            public Charset build() {
                return new Charset(this);
            } 

        } 

    }
}
