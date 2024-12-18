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
 * {@link DescribeHostWebShellResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHostWebShellResponseBody</p>
 */
public class DescribeHostWebShellResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LoginUrl")
    private String loginUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The webshell URL.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder loginUrl(String loginUrl) {
            this.loginUrl = loginUrl;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>842B73C8-5776-4BD9-9872-69C8C46DD7D3</p>
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
