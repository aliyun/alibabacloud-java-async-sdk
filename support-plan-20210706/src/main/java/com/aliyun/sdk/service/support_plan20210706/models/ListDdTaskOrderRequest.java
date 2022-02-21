// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.support_plan20210706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDdTaskOrderRequest} extends {@link RequestModel}
 *
 * <p>ListDdTaskOrderRequest</p>
 */
public class ListDdTaskOrderRequest extends Request {
    @Query
    @NameInMap("CallerParentId")
    private Long callerParentId;

    @Query
    @NameInMap("CallerType")
    private String callerType;

    @Query
    @NameInMap("CallerUid")
    private Long callerUid;

    @Query
    @NameInMap("OpenGroupId")
    private String openGroupId;

    @Query
    @NameInMap("OrderId")
    private String orderId;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("TaskStatus")
    private String taskStatus;

    private ListDdTaskOrderRequest(Builder builder) {
        super(builder);
        this.callerParentId = builder.callerParentId;
        this.callerType = builder.callerType;
        this.callerUid = builder.callerUid;
        this.openGroupId = builder.openGroupId;
        this.orderId = builder.orderId;
        this.requestId = builder.requestId;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String openGroupId; 
        private String orderId; 
        private String requestId; 
        private String taskStatus; 

        private Builder() {
            super();
        } 

        private Builder(ListDdTaskOrderRequest response) {
            super(response);
            this.callerParentId = response.callerParentId;
            this.callerType = response.callerType;
            this.callerUid = response.callerUid;
            this.openGroupId = response.openGroupId;
            this.orderId = response.orderId;
            this.requestId = response.requestId;
            this.taskStatus = response.taskStatus;
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
         * requestId
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
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
