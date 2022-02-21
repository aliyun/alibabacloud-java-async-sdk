// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops_rdc20200303.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDevopsProjectSprintsRequest} extends {@link RequestModel}
 *
 * <p>ListDevopsProjectSprintsRequest</p>
 */
public class ListDevopsProjectSprintsRequest extends Request {
    @Body
    @NameInMap("OrgId")
    @Validation(required = true)
    private String orgId;

    @Body
    @NameInMap("PageSize")
    private Long pageSize;

    @Body
    @NameInMap("PageToken")
    private String pageToken;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    private ListDevopsProjectSprintsRequest(Builder builder) {
        super(builder);
        this.orgId = builder.orgId;
        this.pageSize = builder.pageSize;
        this.pageToken = builder.pageToken;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevopsProjectSprintsRequest create() {
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
    public Long getPageSize() {
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

    public static final class Builder extends Request.Builder<ListDevopsProjectSprintsRequest, Builder> {
        private String orgId; 
        private Long pageSize; 
        private String pageToken; 
        private String projectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDevopsProjectSprintsRequest response) {
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
        public Builder pageSize(Long pageSize) {
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
        public ListDevopsProjectSprintsRequest build() {
            return new ListDevopsProjectSprintsRequest(this);
        } 

    } 

}
