// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckServiceStatusResponseBody} extends {@link TeaModel}
 *
 * <p>CheckServiceStatusResponseBody</p>
 */
public class CheckServiceStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CheckServiceStatusResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckServiceStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true.
         * *   false.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The request ID. You can use the ID to find logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CheckServiceStatusResponseBody build() {
            return new CheckServiceStatusResponseBody(this);
        } 

    } 

}
