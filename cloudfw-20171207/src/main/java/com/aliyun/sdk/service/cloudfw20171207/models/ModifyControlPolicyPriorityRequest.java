// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link ModifyControlPolicyPriorityRequest} extends {@link RequestModel}
 *
 * <p>ModifyControlPolicyPriorityRequest</p>
 */
public class ModifyControlPolicyPriorityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AclUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String aclUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    @com.aliyun.core.annotation.Validation(required = true)
    private String order;

    private ModifyControlPolicyPriorityRequest(Builder builder) {
        super(builder);
        this.aclUuid = builder.aclUuid;
        this.order = builder.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyControlPolicyPriorityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclUuid
     */
    public String getAclUuid() {
        return this.aclUuid;
    }

    /**
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    public static final class Builder extends Request.Builder<ModifyControlPolicyPriorityRequest, Builder> {
        private String aclUuid; 
        private String order; 

        private Builder() {
            super();
        } 

        private Builder(ModifyControlPolicyPriorityRequest request) {
            super(request);
            this.aclUuid = request.aclUuid;
            this.order = request.order;
        } 

        /**
         * <p>The UUID of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3770d603-3534-4878-b845-f00095ee5048</p>
         */
        public Builder aclUuid(String aclUuid) {
            this.putQueryParameter("AclUuid", aclUuid);
            this.aclUuid = aclUuid;
            return this;
        }

        /**
         * <p>The priority of the access control policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        @Override
        public ModifyControlPolicyPriorityRequest build() {
            return new ModifyControlPolicyPriorityRequest(this);
        } 

    } 

}
