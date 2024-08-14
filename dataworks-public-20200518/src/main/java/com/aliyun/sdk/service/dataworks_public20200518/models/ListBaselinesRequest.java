// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselinesRequest} extends {@link RequestModel}
 *
 * <p>ListBaselinesRequest</p>
 */
public class ListBaselinesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineTypes")
    private String baselineTypes;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Enable")
    private Boolean enable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private String priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SearchText")
    private String searchText;

    private ListBaselinesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineTypes = builder.baselineTypes;
        this.enable = builder.enable;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.searchText = builder.searchText;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaselinesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return baselineTypes
     */
    public String getBaselineTypes() {
        return this.baselineTypes;
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return searchText
     */
    public String getSearchText() {
        return this.searchText;
    }

    public static final class Builder extends Request.Builder<ListBaselinesRequest, Builder> {
        private String regionId; 
        private String baselineTypes; 
        private Boolean enable; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String priority; 
        private Long projectId; 
        private String searchText; 

        private Builder() {
            super();
        } 

        private Builder(ListBaselinesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineTypes = request.baselineTypes;
            this.enable = request.enable;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.priority = request.priority;
            this.projectId = request.projectId;
            this.searchText = request.searchText;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the baseline. Valid values: DAILY and HOURLY. You can specify multiple types. Separate multiple types with commas (,).
         */
        public Builder baselineTypes(String baselineTypes) {
            this.putBodyParameter("BaselineTypes", baselineTypes);
            this.baselineTypes = baselineTypes;
            return this;
        }

        /**
         * Specifies whether to enable the baseline. Valid values: true and false.
         */
        public Builder enable(Boolean enable) {
            this.putBodyParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * The owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The page number. Pages start from page 1. Default value: 1. Maximum value: 30.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 10. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The priority of the baseline. Valid values: {1,3,5,7,8}.
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to query the ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The keyword in the baseline name, which is used to search for the baseline.
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        @Override
        public ListBaselinesRequest build() {
            return new ListBaselinesRequest(this);
        } 

    } 

}
