// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDevopsProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>GetDevopsProjectMembersRequest</p>
 */
public class GetDevopsProjectMembersRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("PageToken")
    private String pageToken;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private GetDevopsProjectMembersRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDevopsProjectMembersRequest create() {
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
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return pageToken
     */
    public String getPageToken() {
        return this.pageToken;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<GetDevopsProjectMembersRequest, Builder> {
        private String orgId; 
        private Integer pageSize; 
        private String pageToken; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(GetDevopsProjectMembersRequest response) {
            super(response);
            this.orgId = response.orgId;
            this.pageSize = response.pageSize;
            this.pageToken = response.pageToken;
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
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PageToken.
         */
        public Builder pageToken(String pageToken) {
            this.putBodyParameter("PageToken", pageToken);
            this.pageToken = pageToken;
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
        public GetDevopsProjectMembersRequest build() {
            return new GetDevopsProjectMembersRequest(this);
        } 

    } 

}
