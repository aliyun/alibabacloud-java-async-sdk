// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowInstanceRequest} extends {@link RequestModel}
 *
 * <p>ListTaskFlowInstanceRequest</p>
 */
public class ListTaskFlowInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dagId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageIndex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeBegin")
    private String startTimeBegin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTimeEnd")
    private String startTimeEnd;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TriggerType")
    private Integer triggerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UseBizDate")
    private Boolean useBizDate;

    private ListTaskFlowInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dagId = builder.dagId;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.startTimeBegin = builder.startTimeBegin;
        this.startTimeEnd = builder.startTimeEnd;
        this.status = builder.status;
        this.tid = builder.tid;
        this.triggerType = builder.triggerType;
        this.useBizDate = builder.useBizDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowInstanceRequest create() {
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
     * @return dagId
     */
    public Long getDagId() {
        return this.dagId;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return startTimeBegin
     */
    public String getStartTimeBegin() {
        return this.startTimeBegin;
    }

    /**
     * @return startTimeEnd
     */
    public String getStartTimeEnd() {
        return this.startTimeEnd;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return triggerType
     */
    public Integer getTriggerType() {
        return this.triggerType;
    }

    /**
     * @return useBizDate
     */
    public Boolean getUseBizDate() {
        return this.useBizDate;
    }

    public static final class Builder extends Request.Builder<ListTaskFlowInstanceRequest, Builder> {
        private String regionId; 
        private Long dagId; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String startTimeBegin; 
        private String startTimeEnd; 
        private Integer status; 
        private Long tid; 
        private Integer triggerType; 
        private Boolean useBizDate; 

        private Builder() {
            super();
        } 

        private Builder(ListTaskFlowInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dagId = request.dagId;
            this.pageIndex = request.pageIndex;
            this.pageSize = request.pageSize;
            this.startTimeBegin = request.startTimeBegin;
            this.startTimeEnd = request.startTimeEnd;
            this.status = request.status;
            this.tid = request.tid;
            this.triggerType = request.triggerType;
            this.useBizDate = request.useBizDate;
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
         * The ID of the task flow. You can call the [ListTaskFlow](~~424565~~) or [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the ID of the task flow.
         */
        public Builder dagId(Long dagId) {
            this.putQueryParameter("DagId", dagId);
            this.dagId = dagId;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.putQueryParameter("PageIndex", pageIndex);
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The beginning of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.
         */
        public Builder startTimeBegin(String startTimeBegin) {
            this.putQueryParameter("StartTimeBegin", startTimeBegin);
            this.startTimeBegin = startTimeBegin;
            return this;
        }

        /**
         * The end of the time range to query the execution records of the task flow. Specify the time in the yyyy-MM-DD format.
         */
        public Builder startTimeEnd(String startTimeEnd) {
            this.putQueryParameter("StartTimeEnd", startTimeEnd);
            this.startTimeEnd = startTimeEnd;
            return this;
        }

        /**
         * The running status of the task node. Valid values:
         * <p>
         * 
         * - **0**: Waiting for scheduling
         * 
         * - **1**: Running
         * 
         * - **2**: Suspend
         * 
         * - **3**: Failed to run
         * 
         * - **4**: Run successfully
         * 
         * - **5**: Completed
         */
        public Builder status(Integer status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        /**
         * The mode in which the task flow is triggered. Valid values:
         * <p>
         * 
         * *   **0**: The task flow is automatically triggered based on periodic scheduling.
         * *   **1**: The task flow is manually triggered.
         */
        public Builder triggerType(Integer triggerType) {
            this.putQueryParameter("TriggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        /**
         * Adjust filter conditions:
         * <p>
         * 
         * - true: StartTimeBegin and StartTimeEnd are the time range for filtering services.
         * 
         * - false: StartTimeBegin and StartTimeEnd are the time range for the task to run.
         */
        public Builder useBizDate(Boolean useBizDate) {
            this.putQueryParameter("UseBizDate", useBizDate);
            this.useBizDate = useBizDate;
            return this;
        }

        @Override
        public ListTaskFlowInstanceRequest build() {
            return new ListTaskFlowInstanceRequest(this);
        } 

    } 

}
