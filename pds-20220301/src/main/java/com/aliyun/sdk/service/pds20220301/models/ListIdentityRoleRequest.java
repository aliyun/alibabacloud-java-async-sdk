// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link ListIdentityRoleRequest} extends {@link RequestModel}
 *
 * <p>ListIdentityRoleRequest</p>
 */
public class ListIdentityRoleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("identity")
    @com.aliyun.core.annotation.Validation(required = true)
    private Identity identity;

    private ListIdentityRoleRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.identity = builder.identity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIdentityRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return identity
     */
    public Identity getIdentity() {
        return this.identity;
    }

    public static final class Builder extends Request.Builder<ListIdentityRoleRequest, Builder> {
        private String domainId; 
        private Identity identity; 

        private Builder() {
            super();
        } 

        private Builder(ListIdentityRoleRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.identity = request.identity;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder identity(Identity identity) {
            this.putBodyParameter("identity", identity);
            this.identity = identity;
            return this;
        }

        @Override
        public ListIdentityRoleRequest build() {
            return new ListIdentityRoleRequest(this);
        } 

    } 

}
