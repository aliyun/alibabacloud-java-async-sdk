// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yuqing20220301.models;

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
 * {@link ConsoleProxyResponseBody} extends {@link TeaModel}
 *
 * <p>ConsoleProxyResponseBody</p>
 */
public class ConsoleProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultJson")
    private String resultJson;

    private ConsoleProxyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultJson = builder.resultJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConsoleProxyResponseBody create() {
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
     * @return resultJson
     */
    public String getResultJson() {
        return this.resultJson;
    }

    public static final class Builder {
        private String requestId; 
        private String resultJson; 

        private Builder() {
        } 

        private Builder(ConsoleProxyResponseBody model) {
            this.requestId = model.requestId;
            this.resultJson = model.resultJson;
        } 

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

        public ConsoleProxyResponseBody build() {
            return new ConsoleProxyResponseBody(this);
        } 

    } 

}
