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
 * {@link ListCrossProjectPipelineRunsRequest} extends {@link RequestModel}
 *
 * <p>ListCrossProjectPipelineRunsRequest</p>
 */
public class ListCrossProjectPipelineRunsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeFrom")
    private Long createTimeFrom;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateTimeTo")
    private Long createTimeTo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeploymentEnvironmentId")
    private Long deploymentEnvironmentId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Executor")
    private String executor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private ListCrossProjectPipelineRunsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createTimeFrom = builder.createTimeFrom;
        this.createTimeTo = builder.createTimeTo;
        this.creator = builder.creator;
        this.deploymentEnvironmentId = builder.deploymentEnvironmentId;
        this.executor = builder.executor;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCrossProjectPipelineRunsRequest create() {
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
     * @return createTimeFrom
     */
    public Long getCreateTimeFrom() {
        return this.createTimeFrom;
    }

    /**
     * @return createTimeTo
     */
    public Long getCreateTimeTo() {
        return this.createTimeTo;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return deploymentEnvironmentId
     */
    public Long getDeploymentEnvironmentId() {
        return this.deploymentEnvironmentId;
    }

    /**
     * @return executor
     */
    public String getExecutor() {
        return this.executor;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListCrossProjectPipelineRunsRequest, Builder> {
        private String regionId; 
        private Long createTimeFrom; 
        private Long createTimeTo; 
        private String creator; 
        private Long deploymentEnvironmentId; 
        private String executor; 
        private String objectId; 
        private String objectType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long projectId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListCrossProjectPipelineRunsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createTimeFrom = request.createTimeFrom;
            this.createTimeTo = request.createTimeTo;
            this.creator = request.creator;
            this.deploymentEnvironmentId = request.deploymentEnvironmentId;
            this.executor = request.executor;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.status = request.status;
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
         * <p>The start of the creation time range. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788739200000</p>
         */
        public Builder createTimeFrom(Long createTimeFrom) {
            this.putBodyParameter("CreateTimeFrom", createTimeFrom);
            this.createTimeFrom = createTimeFrom;
            return this;
        }

        /**
         * <p>The end of the creation time range. This value is a UNIX timestamp in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1788825599999</p>
         */
        public Builder createTimeTo(Long createTimeTo) {
            this.putBodyParameter("CreateTimeTo", createTimeTo);
            this.createTimeTo = createTimeTo;
            return this;
        }

        /**
         * <p>The creator.</p>
         * 
         * <strong>example:</strong>
         * <p>creator</p>
         */
        public Builder creator(String creator) {
            this.putBodyParameter("Creator", creator);
            this.creator = creator;
            return this;
        }

        /**
         * <p>The cross-workspace publish environment ID.</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        public Builder deploymentEnvironmentId(Long deploymentEnvironmentId) {
            this.putBodyParameter("DeploymentEnvironmentId", deploymentEnvironmentId);
            this.deploymentEnvironmentId = deploymentEnvironmentId;
            return this;
        }

        /**
         * <p>The executor.</p>
         * 
         * <strong>example:</strong>
         * <p>executor</p>
         */
        public Builder executor(String executor) {
            this.putBodyParameter("Executor", executor);
            this.executor = executor;
            return this;
        }

        /**
         * <p>The publish object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder objectId(String objectId) {
            this.putBodyParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The publish object type.</p>
         * 
         * <strong>example:</strong>
         * <p>ODPS_SQL</p>
         */
        public Builder objectType(String objectType) {
            this.putBodyParameter("ObjectType", objectType);
            this.objectType = objectType;
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
         * <p>The number of entries per page.</p>
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
         * <p>The workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The publish flow status. Valid values:</p>
         * <ul>
         * <li>Building: Building.</li>
         * <li>Ready: Ready and waiting for execution.</li>
         * <li>Running: Running.</li>
         * <li>Termination: Terminated.</li>
         * <li>Success: Succeeded.</li>
         * <li>Fail: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Ready</p>
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListCrossProjectPipelineRunsRequest build() {
            return new ListCrossProjectPipelineRunsRequest(this);
        } 

    } 

}
