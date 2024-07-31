// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCloudResourceAccessedPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCloudResourceAccessedPortsResponseBody</p>
 */
public class DescribeCloudResourceAccessedPortsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Http")
    private java.util.List < Integer > http;

    @com.aliyun.core.annotation.NameInMap("Https")
    private java.util.List < Integer > https;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCloudResourceAccessedPortsResponseBody(Builder builder) {
        this.http = builder.http;
        this.https = builder.https;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCloudResourceAccessedPortsResponseBody create() {
        return builder().build();
    }

    /**
     * @return http
     */
    public java.util.List < Integer > getHttp() {
        return this.http;
    }

    /**
     * @return https
     */
    public java.util.List < Integer > getHttps() {
        return this.https;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Integer > http; 
        private java.util.List < Integer > https; 
        private String requestId; 

        /**
         * Http.
         */
        public Builder http(java.util.List < Integer > http) {
            this.http = http;
            return this;
        }

        /**
         * Https.
         */
        public Builder https(java.util.List < Integer > https) {
            this.https = https;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCloudResourceAccessedPortsResponseBody build() {
            return new DescribeCloudResourceAccessedPortsResponseBody(this);
        } 

    } 

}
