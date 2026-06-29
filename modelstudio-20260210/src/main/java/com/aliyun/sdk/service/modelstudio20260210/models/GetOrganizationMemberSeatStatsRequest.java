// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.modelstudio20260210.models;

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
 * {@link GetOrganizationMemberSeatStatsRequest} extends {@link RequestModel}
 *
 * <p>GetOrganizationMemberSeatStatsRequest</p>
 */
public class GetOrganizationMemberSeatStatsRequest extends Request {
    private GetOrganizationMemberSeatStatsRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOrganizationMemberSeatStatsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetOrganizationMemberSeatStatsRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetOrganizationMemberSeatStatsRequest request) {
            super(request);
        } 

        @Override
        public GetOrganizationMemberSeatStatsRequest build() {
            return new GetOrganizationMemberSeatStatsRequest(this);
        } 

    } 

}
