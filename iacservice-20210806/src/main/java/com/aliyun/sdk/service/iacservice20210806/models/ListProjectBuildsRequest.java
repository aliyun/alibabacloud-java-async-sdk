// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectBuildsRequest} extends {@link RequestModel}
 *
 * <p>ListProjectBuildsRequest</p>
 */
public class ListProjectBuildsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("projectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("groupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("projectBuildAction")
    private String projectBuildAction;

    private ListProjectBuildsRequest(Builder builder) {
        super(builder);
        this.projectId = builder.projectId;
        this.groupId = builder.groupId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectBuildAction = builder.projectBuildAction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectBuildsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return projectBuildAction
     */
    public String getProjectBuildAction() {
        return this.projectBuildAction;
    }

    public static final class Builder extends Request.Builder<ListProjectBuildsRequest, Builder> {
        private String projectId; 
        private String groupId; 
        private String pageNumber; 
        private String pageSize; 
        private String projectBuildAction; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectBuildsRequest request) {
            super(request);
            this.projectId = request.projectId;
            this.groupId = request.groupId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectBuildAction = request.projectBuildAction;
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
         * groupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("groupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * projectBuildAction.
         */
        public Builder projectBuildAction(String projectBuildAction) {
            this.putQueryParameter("projectBuildAction", projectBuildAction);
            this.projectBuildAction = projectBuildAction;
            return this;
        }

        @Override
        public ListProjectBuildsRequest build() {
            return new ListProjectBuildsRequest(this);
        } 

    } 

}
