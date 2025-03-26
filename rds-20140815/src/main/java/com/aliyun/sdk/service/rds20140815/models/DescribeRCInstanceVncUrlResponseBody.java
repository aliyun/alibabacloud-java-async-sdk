// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeRCInstanceVncUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRCInstanceVncUrlResponseBody</p>
 */
public class DescribeRCInstanceVncUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginUrl")
    private String loginUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeRCInstanceVncUrlResponseBody(Builder builder) {
        this.loginUrl = builder.loginUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRCInstanceVncUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return loginUrl
     */
    public String getLoginUrl() {
        return this.loginUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String loginUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeRCInstanceVncUrlResponseBody model) {
            this.loginUrl = model.loginUrl;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The VNC logon address.</p>
         * <blockquote>
         * <p> The address returned is valid only for 15 seconds. If you do not use the returned address to establish a connection within 15 seconds, the address expires and you must call the operation again to obtain a new address.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><a href="https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=****&instanceId=i-2vcb1qjj8z5dl8iw****&isWindows=false">https://g.alicdn.com/aliyun/ecs-console-vnc2/0.0.8/index.html?vncUrl=****&amp;instanceId=i-2vcb1qjj8z5dl8iw****&amp;isWindows=false</a></p>
         */
        public Builder loginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F2911788-25E8-42E5-A3A3-1B38D263F01E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeRCInstanceVncUrlResponseBody build() {
            return new DescribeRCInstanceVncUrlResponseBody(this);
        } 

    } 

}
