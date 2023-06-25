// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectWorkitemTypesRequest} extends {@link RequestModel}
 *
 * <p>ListProjectWorkitemTypesRequest</p>
 */
public class ListProjectWorkitemTypesRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("projectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("category")
    @Validation(required = true)
    private String category;

    @Query
    @NameInMap("spaceType")
    @Validation(required = true)
    private String spaceType;

    private ListProjectWorkitemTypesRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.projectId = builder.projectId;
        this.category = builder.category;
        this.spaceType = builder.spaceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProjectWorkitemTypesRequest create() {
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
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return spaceType
     */
    public String getSpaceType() {
        return this.spaceType;
    }

    public static final class Builder extends Request.Builder<ListProjectWorkitemTypesRequest, Builder> {
        private String organizationId; 
        private String projectId; 
        private String category; 
        private String spaceType; 

        private Builder() {
            super();
        } 

        private Builder(ListProjectWorkitemTypesRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.projectId = request.projectId;
            this.category = request.category;
            this.spaceType = request.spaceType;
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
         * category.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * spaceType.
         */
        public Builder spaceType(String spaceType) {
            this.putQueryParameter("spaceType", spaceType);
            this.spaceType = spaceType;
            return this;
        }

        @Override
        public ListProjectWorkitemTypesRequest build() {
            return new ListProjectWorkitemTypesRequest(this);
        } 

    } 

}
