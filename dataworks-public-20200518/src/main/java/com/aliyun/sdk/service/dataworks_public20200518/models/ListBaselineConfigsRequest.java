// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListBaselineConfigsRequest} extends {@link RequestModel}
 *
 * <p>ListBaselineConfigsRequest</p>
 */
public class ListBaselineConfigsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BaselineTypes")
    private String baselineTypes;

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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Useflag")
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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of the baseline. Valid values: DAILY and HOURLY. Separate multiple baseline types with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>DAILY,HOURLY</p>
         */
        public Builder baselineTypes(String baselineTypes) {
            this.putBodyParameter("BaselineTypes", baselineTypes);
            this.baselineTypes = baselineTypes;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the baseline owner.</p>
         * 
         * <strong>example:</strong>
         * <p>95279527****</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 30. Default value: 1.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The priority of the baseline. Valid values: {1,3,5,7,8}. Separate multiple priorities with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1,3,5,7,8</p>
         */
        public Builder priority(String priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The workspace ID. You can call the ListProjects operation to query the ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The keyword in the baseline name, which is used to search for the baseline.</p>
         * 
         * <strong>example:</strong>
         * <p>Baseline name search keywords</p>
         */
        public Builder searchText(String searchText) {
            this.putBodyParameter("SearchText", searchText);
            this.searchText = searchText;
            return this;
        }

        /**
         * <p>Specifies whether to enable the baseline. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
