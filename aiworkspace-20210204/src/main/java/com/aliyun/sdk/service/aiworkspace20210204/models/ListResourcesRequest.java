// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListResourcesRequest</p>
 */
public class ListResourcesRequest extends Request {
    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("Option")
    private String option;

    @Query
    @NameInMap("PageNumber")
    private Long pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductTypes")
    private String productTypes;

    @Query
    @NameInMap("ResourceName")
    private String resourceName;

    @Query
    @NameInMap("ResourceTypes")
    private String resourceTypes;

    @Query
    @NameInMap("Verbose")
    private Boolean verbose;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private ListResourcesRequest(Builder builder) {
        super(builder);
        this.groupName = builder.groupName;
        this.option = builder.option;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.productTypes = builder.productTypes;
        this.resourceName = builder.resourceName;
        this.resourceTypes = builder.resourceTypes;
        this.verbose = builder.verbose;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListResourcesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return option
     */
    public String getOption() {
        return this.option;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productTypes
     */
    public String getProductTypes() {
        return this.productTypes;
    }

    /**
     * @return resourceName
     */
    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * @return resourceTypes
     */
    public String getResourceTypes() {
        return this.resourceTypes;
    }

    /**
     * @return verbose
     */
    public Boolean getVerbose() {
        return this.verbose;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<ListResourcesRequest, Builder> {
        private String groupName; 
        private String option; 
        private Long pageNumber; 
        private Integer pageSize; 
        private String productTypes; 
        private String resourceName; 
        private String resourceTypes; 
        private Boolean verbose; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListResourcesRequest request) {
            super(request);
            this.groupName = request.groupName;
            this.option = request.option;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.productTypes = request.productTypes;
            this.resourceName = request.resourceName;
            this.resourceTypes = request.resourceTypes;
            this.verbose = request.verbose;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * Option.
         */
        public Builder option(String option) {
            this.putQueryParameter("Option", option);
            this.option = option;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductTypes.
         */
        public Builder productTypes(String productTypes) {
            this.putQueryParameter("ProductTypes", productTypes);
            this.productTypes = productTypes;
            return this;
        }

        /**
         * ResourceName.
         */
        public Builder resourceName(String resourceName) {
            this.putQueryParameter("ResourceName", resourceName);
            this.resourceName = resourceName;
            return this;
        }

        /**
         * ResourceTypes.
         */
        public Builder resourceTypes(String resourceTypes) {
            this.putQueryParameter("ResourceTypes", resourceTypes);
            this.resourceTypes = resourceTypes;
            return this;
        }

        /**
         * Verbose.
         */
        public Builder verbose(Boolean verbose) {
            this.putQueryParameter("Verbose", verbose);
            this.verbose = verbose;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public ListResourcesRequest build() {
            return new ListResourcesRequest(this);
        } 

    } 

}
