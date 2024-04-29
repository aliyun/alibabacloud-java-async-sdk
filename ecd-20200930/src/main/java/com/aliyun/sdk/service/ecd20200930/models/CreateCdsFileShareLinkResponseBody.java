// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCdsFileShareLinkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCdsFileShareLinkResponseBody</p>
 */
public class CreateCdsFileShareLinkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private CdsFileShareLinkModel data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateCdsFileShareLinkResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCdsFileShareLinkResponseBody create() {
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
    public CdsFileShareLinkModel getData() {
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
        private CdsFileShareLinkModel data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The operation result. The value success indicates that the operation is successful. If the operation failed, an error message is returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data information.
         */
        public Builder data(CdsFileShareLinkModel data) {
            this.data = data;
            return this;
        }

        /**
         * The error message that is returned. This parameter is not returned if the value of Code is success.
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
         * Indicates whether the request is successful.
         * <p>
         * 
         * Valid values:
         * 
         * *   true
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         *     <!-- -->
         * 
         * *   false
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

        public CreateCdsFileShareLinkResponseBody build() {
            return new CreateCdsFileShareLinkResponseBody(this);
        } 

    } 

}
