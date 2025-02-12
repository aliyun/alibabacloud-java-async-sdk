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
 * {@link DescribeL7UsKeepaliveResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeL7UsKeepaliveResponseBody</p>
 */
public class DescribeL7UsKeepaliveResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RsKeepalive")
    private RsKeepalive rsKeepalive;

    private DescribeL7UsKeepaliveResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.rsKeepalive = builder.rsKeepalive;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeL7UsKeepaliveResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rsKeepalive
     */
    public RsKeepalive getRsKeepalive() {
        return this.rsKeepalive;
    }

    public static final class Builder {
        private String requestId; 
        private RsKeepalive rsKeepalive; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>39499F01-19D9-4EA4-A0E9-C6014BA5CDBE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The value of the Back-to-origin Persistent Connections parameter.</p>
         */
        public Builder rsKeepalive(RsKeepalive rsKeepalive) {
            this.rsKeepalive = rsKeepalive;
            return this;
        }

        public DescribeL7UsKeepaliveResponseBody build() {
            return new DescribeL7UsKeepaliveResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeL7UsKeepaliveResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeL7UsKeepaliveResponseBody</p>
     */
    public static class RsKeepalive extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("KeepaliveRequests")
        private Long keepaliveRequests;

        @com.aliyun.core.annotation.NameInMap("KeepaliveTimeout")
        private Long keepaliveTimeout;

        private RsKeepalive(Builder builder) {
            this.enabled = builder.enabled;
            this.keepaliveRequests = builder.keepaliveRequests;
            this.keepaliveTimeout = builder.keepaliveTimeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RsKeepalive create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return keepaliveRequests
         */
        public Long getKeepaliveRequests() {
            return this.keepaliveRequests;
        }

        /**
         * @return keepaliveTimeout
         */
        public Long getKeepaliveTimeout() {
            return this.keepaliveTimeout;
        }

        public static final class Builder {
            private Boolean enabled; 
            private Long keepaliveRequests; 
            private Long keepaliveTimeout; 

            /**
             * <p>Indicates whether Back-to-origin Persistent Connections is turned on. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>The number of requests that reuse persistent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder keepaliveRequests(Long keepaliveRequests) {
                this.keepaliveRequests = keepaliveRequests;
                return this;
            }

            /**
             * <p>The timeout period of idle persistent connections.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder keepaliveTimeout(Long keepaliveTimeout) {
                this.keepaliveTimeout = keepaliveTimeout;
                return this;
            }

            public RsKeepalive build() {
                return new RsKeepalive(this);
            } 

        } 

    }
}
