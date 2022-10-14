// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetRoleResponseBody</p>
 */
public class GetRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Role")
    private Role role;

    @NameInMap("Success")
    private Boolean success;

    private GetRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.role = builder.role;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRoleResponseBody create() {
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
     * @return role
     */
    public Role getRole() {
        return this.role;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private Role role; 
        private Boolean success; 

        /**
         * code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * role
         */
        public Builder role(Role role) {
            this.role = role;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRoleResponseBody build() {
            return new GetRoleResponseBody(this);
        } 

    } 

}
