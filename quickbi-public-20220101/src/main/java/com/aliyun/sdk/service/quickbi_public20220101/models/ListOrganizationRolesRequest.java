// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListOrganizationRolesRequest} extends {@link RequestModel}
 *
 * <p>ListOrganizationRolesRequest</p>
 */
public class ListOrganizationRolesRequest extends Request {
    private ListOrganizationRolesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationRolesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListOrganizationRolesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListOrganizationRolesRequest request) {
            super(request);
        } 

        @Override
        public ListOrganizationRolesRequest build() {
            return new ListOrganizationRolesRequest(this);
        } 

    } 

}
