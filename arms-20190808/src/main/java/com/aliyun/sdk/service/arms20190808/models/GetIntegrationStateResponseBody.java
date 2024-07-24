// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegrationStateResponseBody</p>
 */
public class GetIntegrationStateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private Boolean state;

    private GetIntegrationStateResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegrationStateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
     * @return state
     */
    public Boolean getState() {
        return this.state;
    }

    public static final class Builder {
        private Integer code; 
        private String message; 
        private String requestId; 
        private Boolean state; 

        /**
         * Status code. 200 means success, other status codes are exceptions.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The prompt information of the returned result.
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
         * The integration state of Prometheus dashboards and collection rules. Valid values:
         * <p>
         * 
         * *   `true`: The Prometheus dashboards and collection rules that monitor the software are integrated.
         * *   `false`: The Prometheus dashboards and collection rules that monitor the software are not integrated.
         */
        public Builder state(Boolean state) {
            this.state = state;
            return this;
        }

        public GetIntegrationStateResponseBody build() {
            return new GetIntegrationStateResponseBody(this);
        } 

    } 

}
