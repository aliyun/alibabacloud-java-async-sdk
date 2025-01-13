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
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who creates the deployment packages.</p>
         * 
         * <strong>example:</strong>
         * <p>20030****</p>
         */
        public Builder creator(String creator) {
            this.putBodyParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The time when the deployment packages to be queried are created. This value must be a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        public Builder endCreateTime(Long endCreateTime) {
            this.putBodyParameter("EndCreateTime", endCreateTime);
            this.endCreateTime = endCreateTime;
            return this;
        }

        /**
         * <p>The time when the deployment packages are run. This value must be a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1593877765000</p>
         */
        public Builder endExecuteTime(Long endExecuteTime) {
            this.putBodyParameter("EndExecuteTime", endExecuteTime);
            this.endExecuteTime = endExecuteTime;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account used by the user who runs the deployment packages.</p>
         * 
         * <strong>example:</strong>
         * <p>2003****</p>
         */
        public Builder executor(String executor) {
            this.putBodyParameter("Executor", executor);
            this.executor = executor;
            return this;
        }

        /**
         * <p>The keyword that is contained in the names of the deployment packages. A fuzzy search is supported. After you enter a keyword, all deployment packages whose names contain the keyword are displayed.</p>
         * 
         * <strong>example:</strong>
         * <p>hello</p>
         */
        public Builder keyword(String keyword) {
            this.putBodyParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace ID.</p>
         * <p>You must configure either this parameter or the ProjectIdentifier parameter to determine the DataWorks workspace to which the operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the DataWorks workspace. You can log on to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Workspace page to obtain the workspace name.</p>
         * <p>You must configure either this parameter or the ProjectId parameter to determine the DataWorks workspace to which the operation is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>dw_project</p>
         */
        public Builder projectIdentifier(String projectIdentifier) {
            this.putBodyParameter("ProjectIdentifier", projectIdentifier);
            this.projectIdentifier = projectIdentifier;
            return this;
        }

        /**
         * <p>The status of the deployment packages. Valid values:</p>
         * <ul>
         * <li>0: The deployment packages are ready.</li>
         * <li>1: The deployment packages are deployed.</li>
         * <li>2: The deployment packages fail to be deployed.</li>
         * <li>6: The deployment packages are rejected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
