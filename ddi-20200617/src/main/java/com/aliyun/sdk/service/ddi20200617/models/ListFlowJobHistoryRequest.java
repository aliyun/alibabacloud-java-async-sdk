// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFlowJobHistoryRequest} extends {@link RequestModel}
 *
 * <p>ListFlowJobHistoryRequest</p>
 */
public class ListFlowJobHistoryRequest extends Request {
    @Query
    @NameInMap("Id")
    private String id;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("JobType")
    private String jobType;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StatusList")
    private java.util.List < String > statusList;

    @Query
    @NameInMap("TimeRange")
    private String timeRange;

    private ListFlowJobHistoryRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.instanceId = builder.instanceId;
        this.jobType = builder.jobType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
        this.statusList = builder.statusList;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFlowJobHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
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
     * @return statusList
     */
    public java.util.List < String > getStatusList() {
        return this.statusList;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<ListFlowJobHistoryRequest, Builder> {
        private String id; 
        private String instanceId; 
        private String jobType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String projectId; 
        private String regionId; 
        private java.util.List < String > statusList; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(ListFlowJobHistoryRequest request) {
            super(request);
            this.id = request.id;
            this.instanceId = request.instanceId;
            this.jobType = request.jobType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
            this.statusList = request.statusList;
            this.timeRange = request.timeRange;
        } 

        /**
         * 作业ID。您可以调用ListFlowJob查看作业ID。
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * 作业实例ID。您可以调用DescribeFlowJob查看作业实例ID。
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 作业的类型，可能的取值有：SPARK，SPARK_STREAMING，ZEPPELIN
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * 当前页码。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 分页查询时每页行数。
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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
         * 状态列表。取值如下：SUBMITTED, RUNNING, SUCCESS, FAILED, KILL_FAILED, KILL_SUCCESS
         */
        public Builder statusList(java.util.List < String > statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * 查询的时间范围参数，参数列表：type: range，from: 开始时间（long型时间戳），to: 结束时间（long型时间戳）
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("TimeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public ListFlowJobHistoryRequest build() {
            return new ListFlowJobHistoryRequest(this);
        } 

    } 

}
