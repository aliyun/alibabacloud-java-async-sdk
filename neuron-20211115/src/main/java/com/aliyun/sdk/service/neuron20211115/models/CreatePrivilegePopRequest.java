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
 * {@link CreatePrivilegePopRequest} extends {@link RequestModel}
 *
 * <p>CreatePrivilegePopRequest</p>
 */
public class CreatePrivilegePopRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("roleId")
    private Long roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private CreatePrivilegePopCmd body;

    private CreatePrivilegePopRequest(Builder builder) {
        super(builder);
        this.roleId = builder.roleId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePrivilegePopRequest create() {
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
    public CreatePrivilegePopCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreatePrivilegePopRequest, Builder> {
        private Long roleId; 
        private CreatePrivilegePopCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreatePrivilegePopRequest request) {
            super(request);
            this.roleId = request.roleId;
            this.body = request.body;
        } 

        /**
         * roleId.
         */
        public Builder roleId(Long roleId) {
            this.putPathParameter("roleId", roleId);
            this.roleId = roleId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(CreatePrivilegePopCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreatePrivilegePopRequest build() {
            return new CreatePrivilegePopRequest(this);
        } 

    } 

}
