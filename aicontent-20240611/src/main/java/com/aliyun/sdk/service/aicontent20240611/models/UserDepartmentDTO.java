// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link UserDepartmentDTO} extends {@link TeaModel}
 *
 * <p>UserDepartmentDTO</p>
 */
public class UserDepartmentDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("clientName")
    private String clientName;

    @com.aliyun.core.annotation.NameInMap("roleCode")
    private String roleCode;

    @com.aliyun.core.annotation.NameInMap("roleName")
    private String roleName;

    private UserDepartmentDTO(Builder builder) {
        this.clientId = builder.clientId;
        this.clientName = builder.clientName;
        this.roleCode = builder.roleCode;
        this.roleName = builder.roleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UserDepartmentDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public Long getClientId() {
        return this.clientId;
    }

    /**
     * @return clientName
     */
    public String getClientName() {
        return this.clientName;
    }

    /**
     * @return roleCode
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    /**
     * @return roleName
     */
    public String getRoleName() {
        return this.roleName;
    }

    public static final class Builder {
        private Long clientId; 
        private String clientName; 
        private String roleCode; 
        private String roleName; 

        private Builder() {
        } 

        private Builder(UserDepartmentDTO model) {
            this.clientId = model.clientId;
            this.clientName = model.clientName;
            this.roleCode = model.roleCode;
            this.roleName = model.roleName;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * clientName.
         */
        public Builder clientName(String clientName) {
            this.clientName = clientName;
            return this;
        }

        /**
         * roleCode.
         */
        public Builder roleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }

        /**
         * roleName.
         */
        public Builder roleName(String roleName) {
            this.roleName = roleName;
            return this;
        }

        public UserDepartmentDTO build() {
            return new UserDepartmentDTO(this);
        } 

    } 

}
