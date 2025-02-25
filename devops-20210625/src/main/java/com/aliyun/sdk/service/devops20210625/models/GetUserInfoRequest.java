// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link GetUserInfoRequest} extends {@link RequestModel}
 *
 * <p>GetUserInfoRequest</p>
 */
public class GetUserInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("organizationId")
    private String organizationId;

    private GetUserInfoRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    public static final class Builder extends Request.Builder<GetUserInfoRequest, Builder> {
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetUserInfoRequest request) {
            super(request);
            this.organizationId = request.organizationId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putQueryParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetUserInfoRequest build() {
            return new GetUserInfoRequest(this);
        } 

    } 

}
