// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecurityPolicyRelationsRequest} extends {@link RequestModel}
 *
 * <p>ListSecurityPolicyRelationsRequest</p>
 */
public class ListSecurityPolicyRelationsRequest extends Request {
    @Query
    @NameInMap("SecurityPolicyIds")
    @Validation(required = true)
    private java.util.List < String > securityPolicyIds;

    private ListSecurityPolicyRelationsRequest(Builder builder) {
        super(builder);
        this.securityPolicyIds = builder.securityPolicyIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSecurityPolicyRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return securityPolicyIds
     */
    public java.util.List < String > getSecurityPolicyIds() {
        return this.securityPolicyIds;
    }

    public static final class Builder extends Request.Builder<ListSecurityPolicyRelationsRequest, Builder> {
        private java.util.List < String > securityPolicyIds; 

        private Builder() {
            super();
        } 

        private Builder(ListSecurityPolicyRelationsRequest request) {
            super(request);
            this.securityPolicyIds = request.securityPolicyIds;
        } 

        /**
         * The security policy IDs. You can specify up to five IDs.
         */
        public Builder securityPolicyIds(java.util.List < String > securityPolicyIds) {
            this.putQueryParameter("SecurityPolicyIds", securityPolicyIds);
            this.securityPolicyIds = securityPolicyIds;
            return this;
        }

        @Override
        public ListSecurityPolicyRelationsRequest build() {
            return new ListSecurityPolicyRelationsRequest(this);
        } 

    } 

}
