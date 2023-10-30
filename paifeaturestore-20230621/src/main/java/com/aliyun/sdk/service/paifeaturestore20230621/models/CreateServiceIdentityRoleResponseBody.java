// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceIdentityRoleResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceIdentityRoleResponseBody</p>
 */
public class CreateServiceIdentityRoleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RoleName")
    private String roleName;

    private CreateServiceIdentityRoleResponseBody(Builder builder) {
        this.code = builder.code;
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
         * RequestId.
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
