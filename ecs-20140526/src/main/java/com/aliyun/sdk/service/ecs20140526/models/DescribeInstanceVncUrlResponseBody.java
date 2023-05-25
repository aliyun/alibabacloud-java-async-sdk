// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceVncUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceVncUrlResponseBody</p>
 */
public class DescribeInstanceVncUrlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VncUrl")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VncUrl.
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
