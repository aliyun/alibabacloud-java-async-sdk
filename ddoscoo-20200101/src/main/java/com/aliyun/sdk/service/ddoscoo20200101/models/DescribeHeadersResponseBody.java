// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeHeadersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHeadersResponseBody</p>
 */
public class DescribeHeadersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomHeader")
    private CustomHeader customHeader;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the custom header.</p>
         */
        public Builder customHeader(CustomHeader customHeader) {
            this.customHeader = customHeader;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>48BC7BA5-69BE-5C31-A080-AFF2431AE48D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHeadersResponseBody build() {
            return new DescribeHeadersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHeadersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHeadersResponseBody</p>
     */
    public static class CustomHeader extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Headers")
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
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The header of the response.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;X-Forwarded-ClientSrcPort&quot;:&quot;&quot;,&quot;header1&quot;:&quot;hLeLele&quot;}</p>
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
