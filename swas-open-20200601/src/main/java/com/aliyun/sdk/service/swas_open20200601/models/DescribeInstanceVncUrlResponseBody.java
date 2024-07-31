// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceVncUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceVncUrlResponseBody</p>
 */
public class DescribeInstanceVncUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VncUrl")
    private String vncUrl;

    private DescribeInstanceVncUrlResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vncUrl = builder.vncUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceVncUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vncUrl
     */
    public String getVncUrl() {
        return this.vncUrl;
    }

    public static final class Builder {
        private String requestId; 
        private String vncUrl; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The VNC connection address of the server.
         */
        public Builder vncUrl(String vncUrl) {
            this.vncUrl = vncUrl;
            return this;
        }

        public DescribeInstanceVncUrlResponseBody build() {
            return new DescribeInstanceVncUrlResponseBody(this);
        } 

    } 

}
