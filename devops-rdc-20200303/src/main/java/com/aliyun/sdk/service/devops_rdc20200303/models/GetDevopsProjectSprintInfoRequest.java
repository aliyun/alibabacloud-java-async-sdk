// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectSprintInfoRequest} extends {@link RequestModel}
 *
 * <p>GetDevopsProjectSprintInfoRequest</p>
 */
public class GetDevopsProjectSprintInfoRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("SprintId")
    @Validation(required = true)
    private String sprintId;

    private GetDevopsProjectSprintInfoRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.sprintId = builder.sprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectSprintInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return orgId
     */
    public String getOrgId() {
        return this.orgId;
    }

    /**
     * @return sprintId
     */
    public String getSprintId() {
        return this.sprintId;
    }

    public static final class Builder extends Request.Builder<GetDevopsProjectSprintInfoRequest, Builder> {
        private String orgId; 
        private String sprintId; 

        private Builder() {
            super();
        } 

        private Builder(GetDevopsProjectSprintInfoRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.sprintId = response.sprintId;
        } 

        /**
         * OrgId.
         */
        public Builder orgId(String orgId) {
            this.putBodyParameter("OrgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * SprintId.
         */
        public Builder sprintId(String sprintId) {
            this.putBodyParameter("SprintId", sprintId);
            this.sprintId = sprintId;
            return this;
        }

        @Override
        public GetDevopsProjectSprintInfoRequest build() {
            return new GetDevopsProjectSprintInfoRequest(this);
        } 

    } 

}
