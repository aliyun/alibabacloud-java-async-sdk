// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.btripopen20220520.models;

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
 * {@link DeleteEmployeesFromCustomRoleRequest} extends {@link RequestModel}
 *
 * <p>DeleteEmployeesFromCustomRoleRequest</p>
 */
public class DeleteEmployeesFromCustomRoleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("role_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("user_id_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> userIdList;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("x-acs-btrip-corp-token")
    private String xAcsBtripCorpToken;

    private DeleteEmployeesFromCustomRoleRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.userIdList = builder.userIdList;
        this.xAcsBtripCorpToken = builder.xAcsBtripCorpToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteEmployeesFromCustomRoleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return userIdList
     */
    public java.util.List<String> getUserIdList() {
        return this.userIdList;
    }

    /**
     * @return xAcsBtripCorpToken
     */
    public String getXAcsBtripCorpToken() {
        return this.xAcsBtripCorpToken;
    }

    public static final class Builder extends Request.Builder<DeleteEmployeesFromCustomRoleRequest, Builder> {
        private String roleId; 
        private java.util.List<String> userIdList; 
        private String xAcsBtripCorpToken; 

        private Builder() {
            super();
        } 

        private Builder(DeleteEmployeesFromCustomRoleRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.userIdList = request.userIdList;
            this.xAcsBtripCorpToken = request.xAcsBtripCorpToken;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder roleId(String roleId) {
            this.putBodyParameter("role_id", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userIdList(java.util.List<String> userIdList) {
            String userIdListShrink = shrink(userIdList, "user_id_list", "json");
            this.putBodyParameter("user_id_list", userIdListShrink);
            this.userIdList = userIdList;
            return this;
        }

        /**
         * x-acs-btrip-corp-token.
         */
        public Builder xAcsBtripCorpToken(String xAcsBtripCorpToken) {
            this.putHeaderParameter("x-acs-btrip-corp-token", xAcsBtripCorpToken);
            this.xAcsBtripCorpToken = xAcsBtripCorpToken;
            return this;
        }

        @Override
        public DeleteEmployeesFromCustomRoleRequest build() {
            return new DeleteEmployeesFromCustomRoleRequest(this);
        } 

    } 

}
