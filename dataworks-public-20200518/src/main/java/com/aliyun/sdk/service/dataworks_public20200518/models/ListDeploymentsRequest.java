// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeploymentsRequest} extends {@link RequestModel}
 *
 * <p>ListDeploymentsRequest</p>
 */
public class ListDeploymentsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("Region")
    private String region;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndCreateTime")
    private Long endCreateTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndExecuteTime")
    private Long endExecuteTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Executor")
    private String executor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIdentifier")
    private String projectIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private ListDeploymentsRequest(Builder builder) {
        super(builder);
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.creator = builder.creator;
        this.endCreateTime = builder.endCreateTime;
        this.endExecuteTime = builder.endExecuteTime;
        this.executor = builder.executor;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.projectIdentifier = builder.projectIdentifier;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeploymentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return endCreateTime
     */
    public Long getEndCreateTime() {
        return this.endCreateTime;
    }

    /**
     * @return endExecuteTime
     */
    public Long getEndExecuteTime() {
        return this.endExecuteTime;
    }

    /**
     * @return executor
     */
    public String getExecutor() {
        return this.executor;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectIdentifier
     */
    public String getProjectIdentifier() {
        return this.projectIdentifier;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListDeploymentsRequest, Builder> {
        private String region; 
        private String regionId; 
        private String creator; 
        private Long endCreateTime; 
        private Long endExecuteTime; 
        private String executor; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String projectIdentifier; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListDeploymentsRequest request) {
            super(request);
            this.region = request.region;
            this.regionId = request.regionId;
            this.creator = request.creator;
            this.endCreateTime = request.endCreateTime;
            this.endExecuteTime = request.endExecuteTime;
            this.executor = request.executor;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.projectIdentifier = request.projectIdentifier;
            this.status = request.status;
        } 

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putHostParameter("Region", region);
            this.region = region;
            return this;
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
         * The ID of the Alibaba Cloud account used by the user who creates the deployment packages.
         */
        public Builder creator(String creator) {
            this.putBodyParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * The time when the deployment packages to be queried are created. This value must be a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putBodyParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * The time when the deployment packages are run. This value must be a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.
         */
        public Builder endExecuteTime(Long endExecuteTime) {
            this.putBodyParameter("EndExecuteTime", endExecuteTime);
            this.endExecuteTime = endExecuteTime;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account used by the user who runs the deployment packages.
         */
        public Builder executor(String executor) {
            this.putBodyParameter("Executor", executor);
            this.executor = executor;
            return this;
        }

        /**
         * The keyword that is contained in the names of the deployment packages. A fuzzy search is supported. After you enter a keyword, all deployment packages whose names contain the keyword are displayed.
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The page number.
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
         * The DataWorks workspace ID. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace ID.
         * <p>
         * 
         * You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace page to obtain the workspace name.
         * <p>
         * 
         * You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * The status of the deployment packages. Valid values:
         * <p>
         * 
         * *   0: The deployment packages are ready.
         * *   1: The deployment packages are deployed.
         * *   2: The deployment packages fail to be deployed.
         * *   6: The deployment packages are rejected.
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListDeploymentsRequest build() {
            return new ListDeploymentsRequest(this);
        } 

    } 

}
