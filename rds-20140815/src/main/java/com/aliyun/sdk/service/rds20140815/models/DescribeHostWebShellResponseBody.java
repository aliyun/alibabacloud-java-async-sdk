// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHostWebShellResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostWebShellResponseBody</p>
 */
public class DescribeHostWebShellResponseBody extends TeaModel {
    @NameInMap("LoginUrl")
    private String loginUrl;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeHostWebShellResponseBody(Builder builder) {
        this.loginUrl = builder.loginUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHostWebShellResponseBody create() {
        return builder().build();
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

        /**
         * The URL of the webshell.
         */
        public Builder loginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeHostWebShellResponseBody build() {
            return new DescribeHostWebShellResponseBody(this);
        } 

    } 

}
