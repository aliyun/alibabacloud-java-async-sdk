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
 * {@link DeletePrivilegeRequest} extends {@link RequestModel}
 *
 * <p>DeletePrivilegeRequest</p>
 */
public class DeletePrivilegeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("privilegeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long privilegeId;

    private DeletePrivilegeRequest(Builder builder) {
        super(builder);
        this.privilegeId = builder.privilegeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePrivilegeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return privilegeId
     */
    public Long getPrivilegeId() {
        return this.privilegeId;
    }

    public static final class Builder extends Request.Builder<DeletePrivilegeRequest, Builder> {
        private Long privilegeId; 

        private Builder() {
            super();
        } 

        private Builder(DeletePrivilegeRequest request) {
            super(request);
            this.privilegeId = request.privilegeId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder privilegeId(Long privilegeId) {
            this.putPathParameter("privilegeId", privilegeId);
            this.privilegeId = privilegeId;
            return this;
        }

        @Override
        public DeletePrivilegeRequest build() {
            return new DeletePrivilegeRequest(this);
        } 

    } 

}
