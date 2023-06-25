// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectMembersRequest} extends {@link RequestModel}
 *
 * <p>ListProjectMembersRequest</p>
 */
public class ListProjectMembersRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("targetType")
    @Validation(required = true)
    private String targetType;

    private ListProjectMembersRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.projectId = builder.projectId;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectMembersRequest create() {
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
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ListProjectMembersRequest, Builder> {
        private String organizationId; 
        private String projectId; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectMembersRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.projectId = request.projectId;
            this.targetType = request.targetType;
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
         * projectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("projectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * targetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("targetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ListProjectMembersRequest build() {
            return new ListProjectMembersRequest(this);
        } 

    } 

}
