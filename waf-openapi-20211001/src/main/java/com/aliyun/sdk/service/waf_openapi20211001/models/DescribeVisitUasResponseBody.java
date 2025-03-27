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
 * {@link DescribeVisitUasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVisitUasResponseBody</p>
 */
public class DescribeVisitUasResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Uas")
    private java.util.List<Uas> uas;

    private DescribeVisitUasResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uas = builder.uas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVisitUasResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uas
     */
    public java.util.List<Uas> getUas() {
        return this.uas;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Uas> uas; 

        private Builder() {
        } 

        private Builder(DescribeVisitUasResponseBody model) {
            this.requestId = model.requestId;
            this.uas = model.uas;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>2847CE98-AFAE-5A64-B80E-60461717F9DE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The array of the top 10 user agents that are used to initiate requests.</p>
         */
        public Builder uas(java.util.List<Uas> uas) {
            this.uas = uas;
            return this;
        }

        public DescribeVisitUasResponseBody build() {
            return new DescribeVisitUasResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVisitUasResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVisitUasResponseBody</p>
     */
    public static class Uas extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Ua")
        private String ua;

        private Uas(Builder builder) {
            this.count = builder.count;
            this.ua = builder.ua;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Uas create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return ua
         */
        public String getUa() {
            return this.ua;
        }

        public static final class Builder {
            private Long count; 
            private String ua; 

            private Builder() {
            } 

            private Builder(Uas model) {
                this.count = model.count;
                this.ua = model.ua;
            } 

            /**
             * <p>The number of requests that use the user agent.</p>
             * 
             * <strong>example:</strong>
             * <p>698455</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The user agent.</p>
             * 
             * <strong>example:</strong>
             * <p>chrome</p>
             */
            public Builder ua(String ua) {
                this.ua = ua;
                return this;
            }

            public Uas build() {
                return new Uas(this);
            } 

        } 

    }
}
