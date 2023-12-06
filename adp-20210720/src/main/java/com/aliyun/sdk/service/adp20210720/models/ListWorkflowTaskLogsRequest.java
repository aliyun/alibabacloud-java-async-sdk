// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkflowTaskLogsRequest} extends {@link RequestModel}
 *
 * <p>ListWorkflowTaskLogsRequest</p>
 */
public class ListWorkflowTaskLogsRequest extends Request {
    @Path
    @NameInMap("stepName")
    @Validation(required = true)
    private String stepName;

    @Path
    @NameInMap("taskName")
    @Validation(required = true)
    private String taskName;

    @Query
    @NameInMap("filterValues")
    private java.util.List < String > filterValues;

    @Query
    @NameInMap("orderType")
    private String orderType;

    @Query
    @NameInMap("pageNum")
    @Validation(maximum = 10000, minimum = 1)
    private Long pageNum;

    @Query
    @NameInMap("pageSize")
    @Validation(maximum = 100)
    private Long pageSize;

    @Query
    @NameInMap("workflowType")
    @Validation(required = true)
    private String workflowType;

    @Query
    @NameInMap("xuid")
    @Validation(required = true)
    private String xuid;

    private ListWorkflowTaskLogsRequest(Builder builder) {
        super(builder);
        this.stepName = builder.stepName;
        this.taskName = builder.taskName;
        this.filterValues = builder.filterValues;
        this.orderType = builder.orderType;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.workflowType = builder.workflowType;
        this.xuid = builder.xuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkflowTaskLogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return filterValues
     */
    public java.util.List < String > getFilterValues() {
        return this.filterValues;
    }

    /**
     * @return orderType
     */
    public String getOrderType() {
        return this.orderType;
    }

    /**
     * @return pageNum
     */
    public Long getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return workflowType
     */
    public String getWorkflowType() {
        return this.workflowType;
    }

    /**
     * @return xuid
     */
    public String getXuid() {
        return this.xuid;
    }

    public static final class Builder extends Request.Builder<ListWorkflowTaskLogsRequest, Builder> {
        private String stepName; 
        private String taskName; 
        private java.util.List < String > filterValues; 
        private String orderType; 
        private Long pageNum; 
        private Long pageSize; 
        private String workflowType; 
        private String xuid; 

        private Builder() {
            super();
        } 

        private Builder(ListWorkflowTaskLogsRequest request) {
            super(request);
            this.stepName = request.stepName;
            this.taskName = request.taskName;
            this.filterValues = request.filterValues;
            this.orderType = request.orderType;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.workflowType = request.workflowType;
            this.xuid = request.xuid;
        } 

        /**
         * stepName.
         */
        public Builder stepName(String stepName) {
            this.putPathParameter("stepName", stepName);
            this.stepName = stepName;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * filterValues.
         */
        public Builder filterValues(java.util.List < String > filterValues) {
            String filterValuesShrink = shrink(filterValues, "filterValues", "json");
            this.putQueryParameter("filterValues", filterValuesShrink);
            this.filterValues = filterValues;
            return this;
        }

        /**
         * orderType.
         */
        public Builder orderType(String orderType) {
            this.putQueryParameter("orderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * pageNum.
         */
        public Builder pageNum(Long pageNum) {
            this.putQueryParameter("pageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * workflowType.
         */
        public Builder workflowType(String workflowType) {
            this.putQueryParameter("workflowType", workflowType);
            this.workflowType = workflowType;
            return this;
        }

        /**
         * xuid.
         */
        public Builder xuid(String xuid) {
            this.putQueryParameter("xuid", xuid);
            this.xuid = xuid;
            return this;
        }

        @Override
        public ListWorkflowTaskLogsRequest build() {
            return new ListWorkflowTaskLogsRequest(this);
        } 

    } 

}
