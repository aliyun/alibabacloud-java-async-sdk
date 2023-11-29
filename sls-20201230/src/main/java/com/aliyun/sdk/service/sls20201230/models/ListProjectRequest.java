// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ListProjectRequest} extends {@link RequestModel}
 *
 * <p>ListProjectRequest</p>
 */
public class ListProjectRequest extends Request {
    @Query
    @NameInMap("offset")
    private Integer offset;

    @Query
    @NameInMap("projectName")
    private String projectName;

    @Query
    @NameInMap("resourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("size")
    private Integer size;

    private ListProjectRequest(Builder builder) {
        super(builder);
        this.offset = builder.offset;
        this.projectName = builder.projectName;
        this.resourceGroupId = builder.resourceGroupId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return offset
     */
    public Integer getOffset() {
        return this.offset;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListProjectRequest, Builder> {
        private Integer offset; 
        private String projectName; 
        private String resourceGroupId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectRequest request) {
            super(request);
            this.offset = request.offset;
            this.projectName = request.projectName;
            this.resourceGroupId = request.resourceGroupId;
            this.size = request.size;
        } 

        /**
         * The line from which the query starts. Default value: 0.
         */
        public Builder offset(Integer offset) {
            this.putQueryParameter("offset", offset);
            this.offset = offset;
            return this;
        }

        /**
         * The name of the project.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * resourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The number of entries per page. Default value: 100. This operation can return up to 500 projects.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListProjectRequest build() {
            return new ListProjectRequest(this);
        } 

    } 

}
