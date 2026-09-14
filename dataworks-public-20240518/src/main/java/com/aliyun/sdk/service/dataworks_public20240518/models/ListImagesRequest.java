// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListImagesRequest} extends {@link RequestModel}
 *
 * <p>ListImagesRequest</p>
 */
public class ListImagesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Official")
    private Boolean official;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List<Long> projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProviderTypes")
    private java.util.List<String> providerTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchAll")
    private Boolean searchAll;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stages")
    private java.util.List<String> stages;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Statuses")
    private java.util.List<String> statuses;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedModules")
    private java.util.List<String> supportedModules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedTaskTypes")
    private java.util.List<String> supportedTaskTypes;

    private ListImagesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.accessibility = builder.accessibility;
        this.name = builder.name;
        this.official = builder.official;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectIds = builder.projectIds;
        this.providerTypes = builder.providerTypes;
        this.searchAll = builder.searchAll;
        this.sortBy = builder.sortBy;
        this.stages = builder.stages;
        this.statuses = builder.statuses;
        this.supportedModules = builder.supportedModules;
        this.supportedTaskTypes = builder.supportedTaskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListImagesRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return official
     */
    public Boolean getOfficial() {
        return this.official;
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
     * @return projectIds
     */
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return providerTypes
     */
    public java.util.List<String> getProviderTypes() {
        return this.providerTypes;
    }

    /**
     * @return searchAll
     */
    public Boolean getSearchAll() {
        return this.searchAll;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return stages
     */
    public java.util.List<String> getStages() {
        return this.stages;
    }

    /**
     * @return statuses
     */
    public java.util.List<String> getStatuses() {
        return this.statuses;
    }

    /**
     * @return supportedModules
     */
    public java.util.List<String> getSupportedModules() {
        return this.supportedModules;
    }

    /**
     * @return supportedTaskTypes
     */
    public java.util.List<String> getSupportedTaskTypes() {
        return this.supportedTaskTypes;
    }

    public static final class Builder extends Request.Builder<ListImagesRequest, Builder> {
        private String regionId; 
        private String accessibility; 
        private String name; 
        private Boolean official; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private java.util.List<Long> projectIds; 
        private java.util.List<String> providerTypes; 
        private Boolean searchAll; 
        private String sortBy; 
        private java.util.List<String> stages; 
        private java.util.List<String> statuses; 
        private java.util.List<String> supportedModules; 
        private java.util.List<String> supportedTaskTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListImagesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.accessibility = request.accessibility;
            this.name = request.name;
            this.official = request.official;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectIds = request.projectIds;
            this.providerTypes = request.providerTypes;
            this.searchAll = request.searchAll;
            this.sortBy = request.sortBy;
            this.stages = request.stages;
            this.statuses = request.statuses;
            this.supportedModules = request.supportedModules;
            this.supportedTaskTypes = request.supportedTaskTypes;
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
         * <p>The accessibility:</p>
         * <ul>
         * <li><p>Public: Visible to all members.</p>
         * </li>
         * <li><p>Private: Visible only to the creator.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Public</p>
         */
        public Builder accessibility(String accessibility) {
            this.putQueryParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The image name, used for fuzzy search.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Specifies whether the image is an official image.</p>
         */
        public Builder official(Boolean official) {
            this.putQueryParameter("Official", official);
            this.official = official;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The list of workspace IDs.</p>
         */
        public Builder projectIds(java.util.List<Long> projectIds) {
            String projectIdsShrink = shrink(projectIds, "ProjectIds", "json");
            this.putQueryParameter("ProjectIds", projectIdsShrink);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * <p>The list of image provider types.</p>
         */
        public Builder providerTypes(java.util.List<String> providerTypes) {
            String providerTypesShrink = shrink(providerTypes, "ProviderTypes", "json");
            this.putQueryParameter("ProviderTypes", providerTypesShrink);
            this.providerTypes = providerTypes;
            return this;
        }

        /**
         * <p>Specifies whether to search all images.</p>
         */
        public Builder searchAll(Boolean searchAll) {
            this.putQueryParameter("SearchAll", searchAll);
            this.searchAll = searchAll;
            return this;
        }

        /**
         * <p>The list of sort fields. You can sort by scheduled time, start time, and other fields. The format is &quot;SortField+SortOrder(Desc/Asc)&quot;, where Asc is the default and can be omitted. Valid values of sort fields:</p>
         * <ul>
         * <li><p>CreateTime (Desc/Asc): The creation time.</p>
         * </li>
         * <li><p>Name (Desc/Asc): The image name.
         * Default value: CreateTime Asc.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CreatedTime Desc</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The list of image publish stages to query.</p>
         */
        public Builder stages(java.util.List<String> stages) {
            String stagesShrink = shrink(stages, "Stages", "json");
            this.putQueryParameter("Stages", stagesShrink);
            this.stages = stages;
            return this;
        }

        /**
         * <p>The list of image statuses to query.</p>
         */
        public Builder statuses(java.util.List<String> statuses) {
            String statusesShrink = shrink(statuses, "Statuses", "json");
            this.putQueryParameter("Statuses", statusesShrink);
            this.statuses = statuses;
            return this;
        }

        /**
         * <p>The list of supported modules.</p>
         */
        public Builder supportedModules(java.util.List<String> supportedModules) {
            String supportedModulesShrink = shrink(supportedModules, "SupportedModules", "json");
            this.putQueryParameter("SupportedModules", supportedModulesShrink);
            this.supportedModules = supportedModules;
            return this;
        }

        /**
         * <p>The list of supported task types.</p>
         */
        public Builder supportedTaskTypes(java.util.List<String> supportedTaskTypes) {
            String supportedTaskTypesShrink = shrink(supportedTaskTypes, "SupportedTaskTypes", "json");
            this.putQueryParameter("SupportedTaskTypes", supportedTaskTypesShrink);
            this.supportedTaskTypes = supportedTaskTypes;
            return this;
        }

        @Override
        public ListImagesRequest build() {
            return new ListImagesRequest(this);
        } 

    } 

}
