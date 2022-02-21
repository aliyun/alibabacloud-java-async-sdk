// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsScenarioFieldConfigRequest} extends {@link RequestModel}
 *
 * <p>ListDevopsScenarioFieldConfigRequest</p>
 */
public class ListDevopsScenarioFieldConfigRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private ListDevopsScenarioFieldConfigRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsScenarioFieldConfigRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ListDevopsScenarioFieldConfigRequest, Builder> {
        private String orgId; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDevopsScenarioFieldConfigRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.projectId = response.projectId;
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
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ListDevopsScenarioFieldConfigRequest build() {
            return new ListDevopsScenarioFieldConfigRequest(this);
        } 

    } 

}
