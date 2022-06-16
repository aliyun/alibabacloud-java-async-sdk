// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncPodInfoRequest} extends {@link RequestModel}
 *
 * <p>SyncPodInfoRequest</p>
 */
public class SyncPodInfoRequest extends Request {
    @Query
    @NameInMap("PodName")
    private String podName;

    @Query
    @NameInMap("Reason")
    private String reason;

    @Query
    @NameInMap("RequestId")
    private String requestId;

    @Query
    @NameInMap("SideCarType")
    @Validation(required = true)
    private String sideCarType;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private Boolean status;

    @Query
    @NameInMap("TaskId")
    @Validation(required = true)
    private Long taskId;

    private SyncPodInfoRequest(Builder builder) {
        super(builder);
        this.podName = builder.podName;
        this.reason = builder.reason;
        this.requestId = builder.requestId;
        this.sideCarType = builder.sideCarType;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncPodInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return podName
     */
    public String getPodName() {
        return this.podName;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sideCarType
     */
    public String getSideCarType() {
        return this.sideCarType;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public Long getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<SyncPodInfoRequest, Builder> {
        private String podName; 
        private String reason; 
        private String requestId; 
        private String sideCarType; 
        private Boolean status; 
        private Long taskId; 

        private Builder() {
            super();
        } 

        private Builder(SyncPodInfoRequest request) {
            super(request);
            this.podName = request.podName;
            this.reason = request.reason;
            this.requestId = request.requestId;
            this.sideCarType = request.sideCarType;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * PodName.
         */
        public Builder podName(String podName) {
            this.putQueryParameter("PodName", podName);
            this.podName = podName;
            return this;
        }

        /**
         * Reason.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.putQueryParameter("RequestId", requestId);
            this.requestId = requestId;
            return this;
        }

        /**
         * SideCarType.
         */
        public Builder sideCarType(String sideCarType) {
            this.putQueryParameter("SideCarType", sideCarType);
            this.sideCarType = sideCarType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(Boolean status) {
            this.putQueryParameter("Status", status);
            this.status = status;
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
        public SyncPodInfoRequest build() {
            return new SyncPodInfoRequest(this);
        } 

    } 

}
