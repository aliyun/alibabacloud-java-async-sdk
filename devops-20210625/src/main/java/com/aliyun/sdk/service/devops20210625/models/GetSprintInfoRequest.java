// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSprintInfoRequest} extends {@link RequestModel}
 *
 * <p>GetSprintInfoRequest</p>
 */
public class GetSprintInfoRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("sprintId")
    @Validation(required = true)
    private String sprintId;

    private GetSprintInfoRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.sprintId = builder.sprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSprintInfoRequest create() {
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

    /**
     * @return sprintId
     */
    public String getSprintId() {
        return this.sprintId;
    }

    public static final class Builder extends Request.Builder<GetSprintInfoRequest, Builder> {
        private String organizationId; 
        private String sprintId; 

        private Builder() {
            super();
        } 

        private Builder(GetSprintInfoRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.sprintId = request.sprintId;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * sprintId.
         */
        public Builder sprintId(String sprintId) {
            this.putPathParameter("sprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        @Override
        public GetSprintInfoRequest build() {
            return new GetSprintInfoRequest(this);
        } 

    } 

}
