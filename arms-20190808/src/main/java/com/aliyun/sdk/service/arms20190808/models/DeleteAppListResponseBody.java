// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAppListResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteAppListResponseBody</p>
 */
public class DeleteAppListResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteAppListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAppListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
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
        private Long code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code. 2XX indicates that the request was successful. 3XX indicates that the request was redirected. 4XX indicates that a request error occurred. 5XX indicates that a server error occurred.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned when the request parameters are invalid.
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
         * Indicates whether the specified applications are deleted. Valid values:
         * <p>
         * 
         * *   `true`: The applications are deleted.
         * *   `false`: The applications failed to be deleted.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteAppListResponseBody build() {
            return new DeleteAppListResponseBody(this);
        } 

    } 

}
