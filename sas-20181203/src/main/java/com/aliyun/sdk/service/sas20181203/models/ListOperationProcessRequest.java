// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListOperationProcessRequest} extends {@link RequestModel}
 *
 * <p>ListOperationProcessRequest</p>
 */
public class ListOperationProcessRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Realtime")
    private Boolean realtime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusCodes")
    private java.util.List<Integer> statusCodes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskIds")
    private java.util.List<String> taskIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSources")
    private java.util.List<String> taskSources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTypes")
    private java.util.List<String> taskTypes;

    private ListOperationProcessRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.currentPage = builder.currentPage;
        this.endTime = builder.endTime;
        this.instanceId = builder.instanceId;
        this.pageSize = builder.pageSize;
        this.realtime = builder.realtime;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
        this.statusCodes = builder.statusCodes;
        this.taskIds = builder.taskIds;
        this.taskSources = builder.taskSources;
        this.taskTypes = builder.taskTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationProcessRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return realtime
     */
    public Boolean getRealtime() {
        return this.realtime;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return statusCodes
     */
    public java.util.List<Integer> getStatusCodes() {
        return this.statusCodes;
    }

    /**
     * @return taskIds
     */
    public java.util.List<String> getTaskIds() {
        return this.taskIds;
    }

    /**
     * @return taskSources
     */
    public java.util.List<String> getTaskSources() {
        return this.taskSources;
    }

    /**
     * @return taskTypes
     */
    public java.util.List<String> getTaskTypes() {
        return this.taskTypes;
    }

    public static final class Builder extends Request.Builder<ListOperationProcessRequest, Builder> {
        private Long checkId; 
        private Integer currentPage; 
        private Long endTime; 
        private String instanceId; 
        private Integer pageSize; 
        private Boolean realtime; 
        private String serviceName; 
        private Long startTime; 
        private java.util.List<Integer> statusCodes; 
        private java.util.List<String> taskIds; 
        private java.util.List<String> taskSources; 
        private java.util.List<String> taskTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationProcessRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.currentPage = request.currentPage;
            this.endTime = request.endTime;
            this.instanceId = request.instanceId;
            this.pageSize = request.pageSize;
            this.realtime = request.realtime;
            this.serviceName = request.serviceName;
            this.startTime = request.startTime;
            this.statusCodes = request.statusCodes;
            this.taskIds = request.taskIds;
            this.taskSources = request.taskSources;
            this.taskTypes = request.taskTypes;
        } 

        /**
         * <p>The real-time check item ID. This parameter takes effect only when Realtime is set to true. It is used to precisely filter specified check items. The value must be greater than 0. If this parameter is not specified, check items are not filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>133</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>The page number of the current page returned during paging in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The end time of the query based on the task completion time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1635575219000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance ID of the real-time check asset. This parameter takes effect only when Realtime is set to true. An exact match is performed on the original instance ID of the asset. Fuzzy match is not supported. The value can be up to 255 characters in length. If this parameter is not specified, instances are not filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>i-example001</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>Specifies whether to query real-time check records. Valid values:</p>
         * <ul>
         * <li>true: queries independent real-time task records. Each record corresponds to one asset and one check item triggered at a time.</li>
         * <li>false or not specified: queries original periodic or manual tasks. The following real-time specific filter parameters take effect only when this parameter is set to true.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder realtime(Boolean realtime) {
            this.putQueryParameter("Realtime", realtime);
            this.realtime = realtime;
            return this;
        }

        /**
         * <p>The original identity of the cloud service that triggers the real-time check. This parameter takes effect only when Realtime is set to true. An exact match is performed on the service name in the ActionTrail event, such as Ecs. The value can be up to 128 characters in length. If this parameter is not specified, cloud services are not filtered.</p>
         * 
         * <strong>example:</strong>
         * <p>Ecs</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>The start time of the query based on the task creation time. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1680919232000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The list of task status codes.</p>
         */
        public Builder statusCodes(java.util.List<Integer> statusCodes) {
            this.putQueryParameter("StatusCodes", statusCodes);
            this.statusCodes = statusCodes;
            return this;
        }

        /**
         * <p>The list of task IDs.</p>
         */
        public Builder taskIds(java.util.List<String> taskIds) {
            this.putQueryParameter("TaskIds", taskIds);
            this.taskIds = taskIds;
            return this;
        }

        /**
         * <p>The list of task sources.</p>
         */
        public Builder taskSources(java.util.List<String> taskSources) {
            this.putQueryParameter("TaskSources", taskSources);
            this.taskSources = taskSources;
            return this;
        }

        /**
         * <p>The task types. Valid values:</p>
         * <ul>
         * <li>CHECK_ALL: full check</li>
         * <li>CHECK_POLICY: check executed based on the check items of the configured policy</li>
         * <li>CHECK_SCHEDULE: scheduled check</li>
         * <li>CHECK_ITEM: check executed based on specified check items</li>
         * <li>CHECK_INSTANCE: check executed based on specified check items and instances</li>
         * </ul>
         */
        public Builder taskTypes(java.util.List<String> taskTypes) {
            this.putQueryParameter("TaskTypes", taskTypes);
            this.taskTypes = taskTypes;
            return this;
        }

        @Override
        public ListOperationProcessRequest build() {
            return new ListOperationProcessRequest(this);
        } 

    } 

}
