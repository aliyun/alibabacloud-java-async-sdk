// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyAccountMaskingPrivilegeResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyAccountMaskingPrivilegeResponseBody</p>
 */
public class ModifyAccountMaskingPrivilegeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.Map < String, String > data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private ModifyAccountMaskingPrivilegeResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountMaskingPrivilegeResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.Map < String, String > getData() {
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private java.util.Map < String, String > data; 
        private String message; 
        private String requestId; 
        private String success; 

        /**
         * Data.
         */
        public Builder data(java.util.Map < String, String > data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
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
         * Success.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public ModifyAccountMaskingPrivilegeResponseBody build() {
            return new ModifyAccountMaskingPrivilegeResponseBody(this);
        } 

    } 

}
