// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHeadersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHeadersResponseBody</p>
 */
public class DescribeHeadersResponseBody extends TeaModel {
    @NameInMap("CustomHeader")
    private CustomHeader customHeader;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHeadersResponseBody(Builder builder) {
        this.customHeader = builder.customHeader;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHeadersResponseBody create() {
        return builder().build();
    }

    /**
     * @return customHeader
     */
    public CustomHeader getCustomHeader() {
        return this.customHeader;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CustomHeader customHeader; 
        private String requestId; 

        /**
         * The information about the custom header.
         */
        public Builder customHeader(CustomHeader customHeader) {
            this.customHeader = customHeader;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHeadersResponseBody build() {
            return new DescribeHeadersResponseBody(this);
        } 

    } 

    public static class CustomHeader extends TeaModel {
        @NameInMap("Domain")
        private String domain;

        @NameInMap("Headers")
        private String headers;

        private CustomHeader(Builder builder) {
            this.domain = builder.domain;
            this.headers = builder.headers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomHeader create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return headers
         */
        public String getHeaders() {
            return this.headers;
        }

        public static final class Builder {
            private String domain; 
            private String headers; 

            /**
             * The domain name of the website.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The header of the response.
             */
            public Builder headers(String headers) {
                this.headers = headers;
                return this;
            }

            public CustomHeader build() {
                return new CustomHeader(this);
            } 

        } 

    }
}
