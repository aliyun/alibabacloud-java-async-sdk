// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyCdsFileResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyCdsFileResponseBody</p>
 */
public class ModifyCdsFileResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ModifyCdsFileResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCdsFileResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
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
        private String code; 
        private String data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The modification result. The value success indicates that the modification is successful. If the modification failed, an error message is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Specifies whether data is returned.
         * <p>
         * 
         * Valid values:
         * 
         * *   false: Data fails to be returned.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     : Data is returned.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned if the request failed.
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
         * Indicates whether the request was successful.
         * <p>
         * 
         * Valid values:
         * 
         * *   true: The request is successful.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false: The request fails.
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ModifyCdsFileResponseBody build() {
            return new ModifyCdsFileResponseBody(this);
        } 

    } 

}
