// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceIdentityRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceIdentityRoleResponseBody</p>
 */
public class CreateServiceIdentityRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private CreateServiceIdentityRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceIdentityRoleResponseBody create() {
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
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private String roleName; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RoleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public CreateServiceIdentityRoleResponseBody build() {
            return new CreateServiceIdentityRoleResponseBody(this);
        } 

    } 

}
