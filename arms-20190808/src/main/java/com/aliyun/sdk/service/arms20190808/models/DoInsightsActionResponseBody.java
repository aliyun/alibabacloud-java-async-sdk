// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoInsightsActionResponseBody} extends {@link TeaModel}
 *
 * <p>DoInsightsActionResponseBody</p>
 */
public class DoInsightsActionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DoInsightsActionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DoInsightsActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Status code. 200 means success, other status codes are exceptions.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The response parameters vary with the value of module.
         * <p>
         * 
         * *   QueryTopo
         * 
         *         {
         *          "nodes": [Node] # The collection of nodes. For more information, see the "Node" section of this topic.
         *          "edges": [Edge] # The collection of edges. For more information, see the "Edge" section of this topic.
         *         }
         * 
         * *   QueryTopoRed
         * 
         *         {
         *           "nodeRed": {
         *           	"nodeId": {
         *           		"count": double, # The total number of requests in the specified time range.
         *           		"error": double, # The total number of errors in the specified time range.
         *           		"rt": double, # The average response time in the specified time range. Unit: milliseconds.
         *           	}
         *           },
         *           "edgeRed": {
         *           	"edgeId": {
         *           	    "count": double, # The total number of requests in the specified time range.
         *           		"error": double, # The total number of errors in the specified time range.
         *           		"rt": double, # The average response time in the specified time range. Unit: milliseconds.
         *           	}
         *           }
         * 
         * }
         * 
         * ```
         * ```
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * Information returned when the call fails.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Whether the query is successful:
         * <p>
         * 
         * - true
         * - false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DoInsightsActionResponseBody build() {
            return new DoInsightsActionResponseBody(this);
        } 

    } 

}
