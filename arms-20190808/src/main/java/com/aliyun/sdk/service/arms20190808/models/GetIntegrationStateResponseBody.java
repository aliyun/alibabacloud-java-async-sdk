// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationStateResponseBody} extends {@link TeaModel}
 *
 * <p>GetIntegrationStateResponseBody</p>
 */
public class GetIntegrationStateResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("State")
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
         * 状态码。200为成功，其他状态码为异常。
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * 返回结果的提示信息。
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
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
