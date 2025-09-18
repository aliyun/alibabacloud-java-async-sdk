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
 * {@link DescribeHybridCloudUnsupportPortsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudUnsupportPortsResponseBody</p>
 */
public class DescribeHybridCloudUnsupportPortsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("HttpPorts")
    private String httpPorts;

    @com.aliyun.core.annotation.NameInMap("HttpsPorts")
    private String httpsPorts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeHybridCloudUnsupportPortsResponseBody(Builder builder) {
        this.httpPorts = builder.httpPorts;
        this.httpsPorts = builder.httpsPorts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudUnsupportPortsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return httpPorts
     */
    public String getHttpPorts() {
        return this.httpPorts;
    }

    /**
     * @return httpsPorts
     */
    public String getHttpsPorts() {
        return this.httpsPorts;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String httpPorts; 
        private String httpsPorts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeHybridCloudUnsupportPortsResponseBody model) {
            this.httpPorts = model.httpPorts;
            this.httpsPorts = model.httpsPorts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The HTTP ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>80,8080</p>
         */
        public Builder httpPorts(String httpPorts) {
            this.httpPorts = httpPorts;
            return this;
        }

        /**
         * <p>The HTTPS ports. The value is a string. If multiple ports are returned, the value is in the <strong>port1,port2,port3</strong> format.</p>
         * 
         * <strong>example:</strong>
         * <p>443,8443,8021,3443,2443,9011</p>
         */
        public Builder httpsPorts(String httpsPorts) {
            this.httpsPorts = httpsPorts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>C2E97B3F-1623-4CDF-A7E2-FD9D****027A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHybridCloudUnsupportPortsResponseBody build() {
            return new DescribeHybridCloudUnsupportPortsResponseBody(this);
        } 

    } 

}
