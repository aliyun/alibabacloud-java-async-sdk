// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20758A-585D-4A41-A9B2-28DA8F4F534F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The VNC connection address of the server.</p>
         * 
         * <strong>example:</strong>
         * <p>wss%3A%2F%2Fhz01-vncproxy.aliyun.com%2Fwebsockify%2F%3Fs%3Dwz3L8wEMO6KMt7%252FXInEMtKVubBB%252F7rv055kOm8eUOD%252*****YlmsKjOfz6</p>
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
