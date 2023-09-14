// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAclRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListAclRelationsRequest</p>
 */
public class ListAclRelationsRequest extends Request {
    @Query
    @NameInMap("AclIds")
    @Validation(required = true)
    private java.util.List < String > aclIds;

    private ListAclRelationsRequest(Builder builder) {
        super(builder);
        this.aclIds = builder.aclIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAclRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aclIds
     */
    public java.util.List < String > getAclIds() {
        return this.aclIds;
    }

    public static final class Builder extends Request.Builder<ListAclRelationsRequest, Builder> {
        private java.util.List < String > aclIds; 

        private Builder() {
            super();
        } 

        private Builder(ListAclRelationsRequest request) {
            super(request);
            this.aclIds = request.aclIds;
        } 

        /**
         * The ACL IDs.
         */
        public Builder aclIds(java.util.List < String > aclIds) {
            this.putQueryParameter("AclIds", aclIds);
            this.aclIds = aclIds;
            return this;
        }

        @Override
        public ListAclRelationsRequest build() {
            return new ListAclRelationsRequest(this);
        } 

    } 

}
