// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeIPRangeListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIPRangeListResponseBody</p>
 */
public class DescribeIPRangeListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeIPRangeListResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIPRangeListResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeIPRangeListResponseBody build() {
            return new DescribeIPRangeListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIPRangeListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIPRangeListResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cidr")
        private String cidr;

        @com.aliyun.core.annotation.NameInMap("IpType")
        private String ipType;

        private Content(Builder builder) {
            this.cidr = builder.cidr;
            this.ipType = builder.ipType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return cidr
         */
        public String getCidr() {
            return this.cidr;
        }

        /**
         * @return ipType
         */
        public String getIpType() {
            return this.ipType;
        }

        public static final class Builder {
            private String cidr; 
            private String ipType; 

            /**
             * Cidr.
             */
            public Builder cidr(String cidr) {
                this.cidr = cidr;
                return this;
            }

            /**
             * IpType.
             */
            public Builder ipType(String ipType) {
                this.ipType = ipType;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
