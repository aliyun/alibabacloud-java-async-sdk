// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeElasticsearchHealthResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeElasticsearchHealthResponseBody</p>
 */
public class DescribeElasticsearchHealthResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private String result;

    private DescribeElasticsearchHealthResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeElasticsearchHealthResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
    public String getResult() {
        return this.result;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String result; 

        /**
         * The response code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The response message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The color that indicates the health status of the cluster.
         */
        public Builder result(String result) {
            this.result = result;
            return this;
        }

        public DescribeElasticsearchHealthResponseBody build() {
            return new DescribeElasticsearchHealthResponseBody(this);
        } 

    } 

}
