// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RestartCollectorResponseBody} extends {@link TeaModel}
 *
 * <p>RestartCollectorResponseBody</p>
 */
public class RestartCollectorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Boolean result;

    private RestartCollectorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartCollectorResponseBody create() {
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
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean result; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the shipper is restarted. Valid values:
         * <p>
         * 
         * *   true: The shipper is restarted.
         * *   false: The shipper fails to be restarted.
         */
        public Builder result(Boolean result) {
            this.result = result;
            return this;
        }

        public RestartCollectorResponseBody build() {
            return new RestartCollectorResponseBody(this);
        } 

    } 

}
