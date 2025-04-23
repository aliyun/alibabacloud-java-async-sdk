// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paillmtrace20240311.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetServiceIdentityRoleResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceIdentityRoleResponseBody</p>
 */
public class GetServiceIdentityRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RoleDetail")
    private String roleDetail;

    @com.aliyun.core.annotation.NameInMap("RoleName")
    private String roleName;

    private GetServiceIdentityRoleResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.roleDetail = builder.roleDetail;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceIdentityRoleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return roleDetail
     */
    public String getRoleDetail() {
        return this.roleDetail;
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
        private String roleDetail; 
        private String roleName; 

        private Builder() {
        } 

        private Builder(GetServiceIdentityRoleResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.roleDetail = model.roleDetail;
            this.roleName = model.roleName;
        } 

        /**
         * <p>The internal error code. This parameter is returned only when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>EntityNotExist</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The error message. This parameter is returned only when an error occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>Serivce role does not exit.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The role details.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForPaiLLMTrace</p>
         */
        public Builder roleDetail(String roleDetail) {
            this.roleDetail = roleDetail;
            return this;
        }

        /**
         * <p>The name of the service-linked role. Default value: AliyunServiceRoleForPaiLLMTrace.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForPaiLLMTrace</p>
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public GetServiceIdentityRoleResponseBody build() {
            return new GetServiceIdentityRoleResponseBody(this);
        } 

    } 

}
