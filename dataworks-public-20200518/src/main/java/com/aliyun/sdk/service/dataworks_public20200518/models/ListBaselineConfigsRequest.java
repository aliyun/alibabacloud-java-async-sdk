// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselineConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListBaselineConfigsRequest</p>
 */
public class ListBaselineConfigsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("BaselineTypes")
    private String baselineTypes;

    @Body
    @NameInMap("Owner")
    private String owner;

    @Body
    @NameInMap("PageNumber")
    @Validation(required = true)
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(required = true)
    private Integer pageSize;

    @Body
    @NameInMap("Priority")
    private String priority;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private Long projectId;

    @Body
    @NameInMap("SearchText")
    private String searchText;

    @Body
    @NameInMap("Useflag")
    private Boolean useflag;

    private ListBaselineConfigsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.baselineTypes = builder.baselineTypes;
        this.owner = builder.owner;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.priority = builder.priority;
        this.projectId = builder.projectId;
        this.searchText = builder.searchText;
        this.useflag = builder.useflag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBaselineConfigsRequest create() {
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

    /**
     * @return useflag
     */
    public Boolean getUseflag() {
        return this.useflag;
    }

    public static final class Builder extends Request.Builder<ListBaselineConfigsRequest, Builder> {
        private String regionId; 
        private String baselineTypes; 
        private String owner; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String priority; 
        private Long projectId; 
        private String searchText; 
        private Boolean useflag; 

        private Builder() {
            super();
        } 

        private Builder(ListBaselineConfigsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.baselineTypes = request.baselineTypes;
            this.owner = request.owner;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.priority = request.priority;
            this.projectId = request.projectId;
            this.searchText = request.searchText;
            this.useflag = request.useflag;
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
         * The type of the baseline. Valid values: DAILY and HOURLY. A value of DAILY indicates that the baseline is a day-level baseline. A value of HOURLY indicates that the baseline is an hour-level baseline. Separate multiple baseline types with commas (,).
         */
        public Builder baselineTypes(String baselineTypes) {
            this.putBodyParameter("BaselineTypes", baselineTypes);
            this.baselineTypes = baselineTypes;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the baseline owner.
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * The number of the page to return. Valid values: 1 to 30. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return on each page. Valid values: 1 to 100. Default value: 10.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The priority of the baseline. Valid values: 1, 3, 5, 7, and 8. Separate multiple priorities with commas (,).
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * The ID of the workspace. You can call the ListProjects operation to query the ID.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The keyword in the baseline name used to search for the baseline.
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * Specifies whether to enable the baseline. Valid values: true and false.
         */
        public Builder useflag(Boolean useflag) {
            this.putBodyParameter("Useflag", useflag);
            this.useflag = useflag;
            return this;
        }

        @Override
        public ListBaselineConfigsRequest build() {
            return new ListBaselineConfigsRequest(this);
        } 

    } 

}
