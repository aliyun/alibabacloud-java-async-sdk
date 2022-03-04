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
    @NameInMap("VncUrl")
    private String vncUrl;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceVncUrlResponseBody(Builder builder) {
        this.vncUrl = builder.vncUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceVncUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return vncUrl
     */
    public String getVncUrl() {
        return this.vncUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String vncUrl; 
        private String requestId; 

        /**
         * Manage the terminal Url.
         */
        public Builder vncUrl(String vncUrl) {
            this.vncUrl = vncUrl;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceVncUrlResponseBody build() {
            return new DescribeInstanceVncUrlResponseBody(this);
        } 

    } 

}
