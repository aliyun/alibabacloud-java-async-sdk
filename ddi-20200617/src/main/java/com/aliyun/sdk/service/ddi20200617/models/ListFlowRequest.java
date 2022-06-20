// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowRequest} extends {@link RequestModel}
 *
 * <p>ListFlowRequest</p>
 */
public class ListFlowRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("JobId")
    private String jobId;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("Periodic")
    private Boolean periodic;

    @Query
    @NameInMap("ProjectId")
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Status")
    private String status;

    private ListFlowRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.id = builder.id;
        this.jobId = builder.jobId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.periodic = builder.periodic;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return periodic
     */
    public Boolean getPeriodic() {
        return this.periodic;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListFlowRequest, Builder> {
        private String clusterId; 
        private String id; 
        private String jobId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Boolean periodic; 
        private String projectId; 
        private String regionId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.id = request.id;
            this.jobId = request.jobId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.periodic = request.periodic;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.status = request.status;
        } 

        /**
         * 集群ID。您可以调用ListClusters查看集群的ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 工作流ID。您可以调用ListFlowInstance查看工作流ID。
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 作业ID。您可以调用ListFlowJob查看。
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 工作流名称。您可以调用ListFlowInstance查看。
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页查询数量。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 是否调度。
         */
        public Builder periodic(Boolean periodic) {
            this.putQueryParameter("Periodic", periodic);
            this.periodic = periodic;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * 状态：  STOP_SCHEDULE（停止调度） UNDER_SCHEDULE（调度中）
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListFlowRequest build() {
            return new ListFlowRequest(this);
        } 

    } 

}
