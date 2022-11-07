// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemTimeTypeListRequest} extends {@link RequestModel}
 *
 * <p>GetWorkitemTimeTypeListRequest</p>
 */
public class GetWorkitemTimeTypeListRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    private GetWorkitemTimeTypeListRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemTimeTypeListRequest create() {
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

    public static final class Builder extends Request.Builder<GetWorkitemTimeTypeListRequest, Builder> {
        private String organizationId; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkitemTimeTypeListRequest request) {
            super(request);
            this.organizationId = request.organizationId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        @Override
        public GetWorkitemTimeTypeListRequest build() {
            return new GetWorkitemTimeTypeListRequest(this);
        } 

    } 

}
