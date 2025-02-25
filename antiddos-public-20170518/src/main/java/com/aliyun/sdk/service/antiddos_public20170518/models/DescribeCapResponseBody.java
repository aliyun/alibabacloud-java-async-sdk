// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antiddos_public20170518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapResponseBody</p>
 */
public class DescribeCapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapUrl")
    private CapUrl capUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCapResponseBody(Builder builder) {
        this.capUrl = builder.capUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapResponseBody create() {
        return builder().build();
    }

    /**
     * @return capUrl
     */
    public CapUrl getCapUrl() {
        return this.capUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private CapUrl capUrl; 
        private String requestId; 

        /**
         * The download link to the traffic data that is captured when a DDoS attack event occurs.
         */
        public Builder capUrl(CapUrl capUrl) {
            this.capUrl = capUrl;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCapResponseBody build() {
            return new DescribeCapResponseBody(this);
        } 

    } 

    public static class CapUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CapUrl(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapUrl create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            /**
             * The download link to the traffic data.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CapUrl build() {
                return new CapUrl(this);
            } 

        } 

    }
}
