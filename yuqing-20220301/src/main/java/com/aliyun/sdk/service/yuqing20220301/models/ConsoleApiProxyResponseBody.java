// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConsoleApiProxyResponseBody} extends {@link TeaModel}
 *
 * <p>ConsoleApiProxyResponseBody</p>
 */
public class ConsoleApiProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultJson")
    private String resultJson;

    private ConsoleApiProxyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultJson = builder.resultJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsoleApiProxyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultJson
     */
    public String getResultJson() {
        return this.resultJson;
    }

    public static final class Builder {
        private String requestId; 
        private String resultJson; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultJson.
         */
        public Builder resultJson(String resultJson) {
            this.resultJson = resultJson;
            return this;
        }

        public ConsoleApiProxyResponseBody build() {
            return new ConsoleApiProxyResponseBody(this);
        } 

    } 

}
