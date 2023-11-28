// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartLogstashResponseBody} extends {@link TeaModel}
 *
 * <p>RestartLogstashResponseBody</p>
 */
public class RestartLogstashResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Logstash result;

    private RestartLogstashResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartLogstashResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Logstash getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Logstash result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Logstash result) {
            this.result = result;
            return this;
        }

        public RestartLogstashResponseBody build() {
            return new RestartLogstashResponseBody(this);
        } 

    } 

}
