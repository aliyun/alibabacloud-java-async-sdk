// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListJoinedOrganizationsRequest} extends {@link RequestModel}
 *
 * <p>ListJoinedOrganizationsRequest</p>
 */
public class ListJoinedOrganizationsRequest extends Request {
    private ListJoinedOrganizationsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListJoinedOrganizationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListJoinedOrganizationsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListJoinedOrganizationsRequest request) {
            super(request);
        } 

        @Override
        public ListJoinedOrganizationsRequest build() {
            return new ListJoinedOrganizationsRequest(this);
        } 

    } 

}
