// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskDetailRequest</p>
 */
public class QueryTaskDetailRequest extends Request {
    @Query
    @NameInMap("Ani")
    private String ani;

    @Query
    @NameInMap("CurrentPage")
    @Validation(maximum = 10000)
    private Integer currentPage;

    @Query
    @NameInMap("DepartmentIdList")
    private String departmentIdList;

    @Query
    @NameInMap("Dnis")
    private String dnis;

    @Query
    @NameInMap("EndReasonList")
    private String endReasonList;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("OutboundTaskId")
    private String outboundTaskId;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("PriorityList")
    private String priorityList;

    @Query
    @NameInMap("ServicerId")
    private String servicerId;

    @Query
    @NameInMap("ServicerName")
    private String servicerName;

    @Query
    @NameInMap("Sid")
    private String sid;

    @Query
    @NameInMap("SkillGroup")
    private String skillGroup;

    @Query
    @NameInMap("StatusList")
    private String statusList;

    @Query
    @NameInMap("TaskId")
    @Validation()
    private Long taskId;

    private QueryTaskDetailRequest(Builder builder) {
        super(builder);
        this.ani = builder.ani;
        this.currentPage = builder.currentPage;
        this.departmentIdList = builder.departmentIdList;
        this.dnis = builder.dnis;
        this.endReasonList = builder.endReasonList;
        this.instanceId = builder.instanceId;
        this.outboundTaskId = builder.outboundTaskId;
        this.pageSize = builder.pageSize;
        this.priorityList = builder.priorityList;
        this.servicerId = builder.servicerId;
        this.servicerName = builder.servicerName;
        this.sid = builder.sid;
        this.skillGroup = builder.skillGroup;
        this.statusList = builder.statusList;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTaskDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ani
     */
    public String getAni() {
        return this.ani;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return departmentIdList
     */
    public String getDepartmentIdList() {
        return this.departmentIdList;
    }

    /**
     * @return dnis
     */
    public String getDnis() {
        return this.dnis;
    }

    /**
     * @return endReasonList
     */
    public String getEndReasonList() {
        return this.endReasonList;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return outboundTaskId
     */
    public String getOutboundTaskId() {
        return this.outboundTaskId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return priorityList
     */
    public String getPriorityList() {
        return this.priorityList;
    }

    /**
     * @return servicerId
     */
    public String getServicerId() {
        return this.servicerId;
    }

    /**
     * @return servicerName
     */
    public String getServicerName() {
        return this.servicerName;
    }

    /**
     * @return sid
     */
    public String getSid() {
        return this.sid;
    }

    /**
     * @return skillGroup
     */
    public String getSkillGroup() {
        return this.skillGroup;
    }

    /**
     * @return statusList
     */
    public String getStatusList() {
        return this.statusList;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<QueryTaskDetailRequest, Builder> {
        private String ani; 
        private Integer currentPage; 
        private String departmentIdList; 
        private String dnis; 
        private String endReasonList; 
        private String instanceId; 
        private String outboundTaskId; 
        private Integer pageSize; 
        private String priorityList; 
        private String servicerId; 
        private String servicerName; 
        private String sid; 
        private String skillGroup; 
        private String statusList; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(QueryTaskDetailRequest request) {
            super(request);
            this.ani = request.ani;
            this.currentPage = request.currentPage;
            this.departmentIdList = request.departmentIdList;
            this.dnis = request.dnis;
            this.endReasonList = request.endReasonList;
            this.instanceId = request.instanceId;
            this.outboundTaskId = request.outboundTaskId;
            this.pageSize = request.pageSize;
            this.priorityList = request.priorityList;
            this.servicerId = request.servicerId;
            this.servicerName = request.servicerName;
            this.sid = request.sid;
            this.skillGroup = request.skillGroup;
            this.statusList = request.statusList;
            this.taskId = request.taskId;
        } 

        /**
         * Ani.
         */
        public Builder ani(String ani) {
            this.putQueryParameter("Ani", ani);
            this.ani = ani;
            return this;
        }

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DepartmentIdList.
         */
        public Builder departmentIdList(String departmentIdList) {
            this.putQueryParameter("DepartmentIdList", departmentIdList);
            this.departmentIdList = departmentIdList;
            return this;
        }

        /**
         * Dnis.
         */
        public Builder dnis(String dnis) {
            this.putQueryParameter("Dnis", dnis);
            this.dnis = dnis;
            return this;
        }

        /**
         * EndReasonList.
         */
        public Builder endReasonList(String endReasonList) {
            this.putQueryParameter("EndReasonList", endReasonList);
            this.endReasonList = endReasonList;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OutboundTaskId.
         */
        public Builder outboundTaskId(String outboundTaskId) {
            this.putQueryParameter("OutboundTaskId", outboundTaskId);
            this.outboundTaskId = outboundTaskId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PriorityList.
         */
        public Builder priorityList(String priorityList) {
            this.putQueryParameter("PriorityList", priorityList);
            this.priorityList = priorityList;
            return this;
        }

        /**
         * ServicerId.
         */
        public Builder servicerId(String servicerId) {
            this.putQueryParameter("ServicerId", servicerId);
            this.servicerId = servicerId;
            return this;
        }

        /**
         * ServicerName.
         */
        public Builder servicerName(String servicerName) {
            this.putQueryParameter("ServicerName", servicerName);
            this.servicerName = servicerName;
            return this;
        }

        /**
         * Sid.
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * SkillGroup.
         */
        public Builder skillGroup(String skillGroup) {
            this.putQueryParameter("SkillGroup", skillGroup);
            this.skillGroup = skillGroup;
            return this;
        }

        /**
         * StatusList.
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(Long taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public QueryTaskDetailRequest build() {
            return new QueryTaskDetailRequest(this);
        } 

    } 

}
