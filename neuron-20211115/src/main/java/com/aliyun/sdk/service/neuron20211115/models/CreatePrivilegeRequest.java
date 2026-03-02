// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CreatePrivilegeRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivilegeRequest</p>
 */
public class CreatePrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePrivilegeCmd body;

    private CreatePrivilegeRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivilegeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return roleId
     */
    public Long getRoleId() {
        return this.roleId;
    }

    /**
     * @return body
     */
    public CreatePrivilegeCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePrivilegeRequest, Builder> {
        private Long roleId; 
        private CreatePrivilegeCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivilegeRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder roleId(Long roleId) {
            this.putPathParameter("roleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreatePrivilegeCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePrivilegeRequest build() {
            return new CreatePrivilegeRequest(this);
        } 

    } 

}
