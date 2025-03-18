// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeInstanceVncUrlResponseBody model) {
            this.requestId = model.requestId;
            this.vncUrl = model.vncUrl;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL of the VNC management terminal.</p>
         * 
         * <strong>example:</strong>
         * <p>wss%3A%2F%2Fhz01-vncproxy.aliyun.com%2Fwebsockify%2F%3Fs%3DDvh%252FIA%252BYc73gWO48cBx2gBxUDVzaAnSKr74pq30mzqUYgeUMcB%252FbkNixDxdEA996</p>
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
