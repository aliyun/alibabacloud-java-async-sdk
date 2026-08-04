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
 * {@link DepartmentRoleCmd} extends {@link TeaModel}
 *
 * <p>DepartmentRoleCmd</p>
 */
public class DepartmentRoleCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clientId")
    private Long clientId;

    @com.aliyun.core.annotation.NameInMap("roleCode")
    private String roleCode;

    private DepartmentRoleCmd(Builder builder) {
        this.clientId = builder.clientId;
        this.roleCode = builder.roleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DepartmentRoleCmd create() {
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
     * @return roleCode
     */
    public String getRoleCode() {
        return this.roleCode;
    }

    public static final class Builder {
        private Long clientId; 
        private String roleCode; 

        private Builder() {
        } 

        private Builder(DepartmentRoleCmd model) {
            this.clientId = model.clientId;
            this.roleCode = model.roleCode;
        } 

        /**
         * clientId.
         */
        public Builder clientId(Long clientId) {
            this.clientId = clientId;
            return this;
        }

        /**
         * roleCode.
         */
        public Builder roleCode(String roleCode) {
            this.roleCode = roleCode;
            return this;
        }

        public DepartmentRoleCmd build() {
            return new DepartmentRoleCmd(this);
        } 

    } 

}
