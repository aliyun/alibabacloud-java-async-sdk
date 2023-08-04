// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRetcodeAppResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteRetcodeAppResponseBody</p>
 */
public class DeleteRetcodeAppResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private String data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DeleteRetcodeAppResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRetcodeAppResponseBody create() {
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
         * The status code. The status code 200 indicates that the request was successful. If another status code is returned, the request failed.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Indicates whether the Browser Monitoring task was deleted. Valid values:
         * <p>
         * 
         * *   `true`
         * *   `false`
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned for the operation. Valid values:
         * <p>
         * 
         * *   **Success** is returned if the operation is successful.
         * *   An error message is returned if the operation fails.
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
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * true: The request was successful.
         * 
         * false: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteRetcodeAppResponseBody build() {
            return new DeleteRetcodeAppResponseBody(this);
        } 

    } 

}
