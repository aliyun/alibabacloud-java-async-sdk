// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVisitUasResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVisitUasResponseBody</p>
 */
public class DescribeVisitUasResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Uas")
    private java.util.List < Uas> uas;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uas
     */
    public java.util.List < Uas> getUas() {
        return this.uas;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Uas> uas; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Uas.
         */
        public Builder uas(java.util.List < Uas> uas) {
            this.uas = uas;
            return this;
        }

        public DescribeVisitUasResponseBody build() {
            return new DescribeVisitUasResponseBody(this);
        } 

    } 

    public static class Uas extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Ua")
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

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Ua.
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
