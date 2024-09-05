// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDdTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>ListDdTaskOrderRequest</p>
 */
public class ListDdTaskOrderRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerParentId")
    private Long callerParentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerType")
    private String callerType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CallerUid")
    private Long callerUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CreateRealName")
    private String createRealName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpenGroupId")
    private String openGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderId")
    private String orderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private String pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    private ListDdTaskOrderRequest(Builder builder) {
        super(builder);
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
        this.createRealName = builder.createRealName;
        this.endTime = builder.endTime;
        this.openGroupId = builder.openGroupId;
        this.orderId = builder.orderId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.taskStatus = builder.taskStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDdTaskOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callerParentId
     */
    public Long getCallerParentId() {
        return this.callerParentId;
    }

    /**
     * @return callerType
     */
    public String getCallerType() {
        return this.callerType;
    }

    /**
     * @return callerUid
     */
    public Long getCallerUid() {
        return this.callerUid;
    }

    /**
     * @return createRealName
     */
    public String getCreateRealName() {
        return this.createRealName;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return openGroupId
     */
    public String getOpenGroupId() {
        return this.openGroupId;
    }

    /**
     * @return orderId
     */
    public String getOrderId() {
        return this.orderId;
    }

    /**
     * @return pageNo
     */
    public String getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    public static final class Builder extends Request.Builder<ListDdTaskOrderRequest, Builder> {
        private Long callerParentId; 
        private String callerType; 
        private Long callerUid; 
        private String createRealName; 
        private String endTime; 
        private String openGroupId; 
        private String orderId; 
        private String pageNo; 
        private String pageSize; 
        private String requestId; 
        private String startTime; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListDdTaskOrderRequest request) {
            super(request);
            this.callerParentId = request.callerParentId;
            this.callerType = request.callerType;
            this.callerUid = request.callerUid;
            this.createRealName = request.createRealName;
            this.endTime = request.endTime;
            this.openGroupId = request.openGroupId;
            this.orderId = request.orderId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.requestId = request.requestId;
            this.startTime = request.startTime;
            this.taskStatus = request.taskStatus;
        } 

        /**
         * callerParentId
         */
        public Builder callerParentId(Long callerParentId) {
            this.putQueryParameter("CallerParentId", callerParentId);
            this.callerParentId = callerParentId;
            return this;
        }

        /**
         * callerType
         */
        public Builder callerType(String callerType) {
            this.putQueryParameter("CallerType", callerType);
            this.callerType = callerType;
            return this;
        }

        /**
         * callerUid
         */
        public Builder callerUid(Long callerUid) {
            this.putQueryParameter("CallerUid", callerUid);
            this.callerUid = callerUid;
            return this;
        }

        /**
         * createRealName
         */
        public Builder createRealName(String createRealName) {
            this.putQueryParameter("CreateRealName", createRealName);
            this.createRealName = createRealName;
            return this;
        }

        /**
         * endTime
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * openGroupId
         */
        public Builder openGroupId(String openGroupId) {
            this.putQueryParameter("OpenGroupId", openGroupId);
            this.openGroupId = openGroupId;
            return this;
        }

        /**
         * orderId
         */
        public Builder orderId(String orderId) {
            this.putQueryParameter("OrderId", orderId);
            this.orderId = orderId;
            return this;
        }

        /**
         * pageNo
         */
        public Builder pageNo(String pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * startTime
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * taskStatus
         */
        public Builder taskStatus(String taskStatus) {
            this.putQueryParameter("TaskStatus", taskStatus);
            this.taskStatus = taskStatus;
            return this;
        }

        @Override
        public ListDdTaskOrderRequest build() {
            return new ListDdTaskOrderRequest(this);
        } 

    } 

}
