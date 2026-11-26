// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link QueryTaskDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryTaskDetailRequest</p>
 */
public class QueryTaskDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ani")
    private String ani;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(maximum = 10000)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DepartmentIdList")
    private String departmentIdList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Dnis")
    private String dnis;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndReasonList")
    private String endReasonList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutboundTaskId")
    private String outboundTaskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PriorityList")
    private String priorityList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerId")
    private String servicerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServicerName")
    private String servicerName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Sid")
    private String sid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillGroup")
    private String skillGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StatusList")
    private String statusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation()
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
         * <p>The caller number.</p>
         * 
         * <strong>example:</strong>
         * <p>130****0000</p>
         */
        public Builder ani(String ani) {
            this.putQueryParameter("Ani", ani);
            this.ani = ani;
            return this;
        }

        /**
         * <p>The current page number. Default value: <strong>1</strong>.</p>
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
         * <p>The list of department IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder departmentIdList(String departmentIdList) {
            this.putQueryParameter("DepartmentIdList", departmentIdList);
            this.departmentIdList = departmentIdList;
            return this;
        }

        /**
         * <p>The called number.</p>
         * 
         * <strong>example:</strong>
         * <p>0571456****</p>
         */
        public Builder dnis(String dnis) {
            this.putQueryParameter("Dnis", dnis);
            this.dnis = dnis;
            return this;
        }

        /**
         * <p>The call end reasons.</p>
         * 
         * <strong>example:</strong>
         * <p>110</p>
         */
        public Builder endReasonList(String endReasonList) {
            this.putQueryParameter("EndReasonList", endReasonList);
            this.endReasonList = endReasonList;
            return this;
        }

        /**
         * <p>Instance ID of the AICCS instance. You can obtain instance ID in the <a href="https://aiccs.console.aliyun.com/overview">Artificial Intelligence Cloud Call Service console</a> by choosing Instances.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc_xp_pre***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the outbound task.</p>
         * 
         * <strong>example:</strong>
         * <p>120001</p>
         */
        public Builder outboundTaskId(String outboundTaskId) {
            this.putQueryParameter("OutboundTaskId", outboundTaskId);
            this.outboundTaskId = outboundTaskId;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: <strong>1</strong>.</p>
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
         * <p>The list of priorities. Valid values: <strong>1</strong> to <strong>100</strong>. A larger value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,5]</p>
         */
        public Builder priorityList(String priorityList) {
            this.putQueryParameter("PriorityList", priorityList);
            this.priorityList = priorityList;
            return this;
        }

        /**
         * <p>The ID of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>1212</p>
         */
        public Builder servicerId(String servicerId) {
            this.putQueryParameter("ServicerId", servicerId);
            this.servicerId = servicerId;
            return this;
        }

        /**
         * <p>The name of the agent.</p>
         * 
         * <strong>example:</strong>
         * <p>John Doe</p>
         */
        public Builder servicerName(String servicerName) {
            this.putQueryParameter("ServicerName", servicerName);
            this.servicerName = servicerName;
            return this;
        }

        /**
         * <p>The ID of the session.</p>
         * 
         * <strong>example:</strong>
         * <p>1004849</p>
         */
        public Builder sid(String sid) {
            this.putQueryParameter("Sid", sid);
            this.sid = sid;
            return this;
        }

        /**
         * <p>The ID of the skill group.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder skillGroup(String skillGroup) {
            this.putQueryParameter("SkillGroup", skillGroup);
            this.skillGroup = skillGroup;
            return this;
        }

        /**
         * <p>The list of task statuses. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Not started.</li>
         * <li><strong>2</strong>: In progress.</li>
         * <li><strong>3</strong>: Paused.</li>
         * <li><strong>4</strong>: Expired.</li>
         * <li><strong>5</strong>: Completed.</li>
         * <li><strong>6</strong>: Deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[1,2,3,5]</p>
         */
        public Builder statusList(String statusList) {
            this.putQueryParameter("StatusList", statusList);
            this.statusList = statusList;
            return this;
        }

        /**
         * <p>The ID of the task detail.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
