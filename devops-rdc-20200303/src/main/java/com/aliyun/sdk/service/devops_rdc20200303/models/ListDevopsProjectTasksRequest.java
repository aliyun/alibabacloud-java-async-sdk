// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectTasksRequest} extends {@link RequestModel}
 *
 * <p>ListDevopsProjectTasksRequest</p>
 */
public class ListDevopsProjectTasksRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectIds")
    @Validation(required = true)
    private String projectIds;

    private ListDevopsProjectTasksRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.projectIds = builder.projectIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectTasksRequest create() {
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
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    public static final class Builder extends Request.Builder<ListDevopsProjectTasksRequest, Builder> {
        private String orgId; 
        private String projectIds; 

        private Builder() {
            super();
        } 

        private Builder(ListDevopsProjectTasksRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.projectIds = response.projectIds;
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
         * ProjectIds.
         */
        public Builder projectIds(String projectIds) {
            this.putBodyParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        @Override
        public ListDevopsProjectTasksRequest build() {
            return new ListDevopsProjectTasksRequest(this);
        } 

    } 

}
