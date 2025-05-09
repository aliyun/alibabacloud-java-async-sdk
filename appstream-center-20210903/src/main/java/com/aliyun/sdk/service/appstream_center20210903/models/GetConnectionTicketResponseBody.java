// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
 * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectionTicketResponseBody</p>
 */
public class GetConnectionTicketResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppInstanceGroupId")
    private String appInstanceGroupId;

    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    private String appInstanceId;

    @com.aliyun.core.annotation.NameInMap("AppInstancePersistentId")
    private String appInstancePersistentId;

    @com.aliyun.core.annotation.NameInMap("BindQueueInfo")
    private BindQueueInfo bindQueueInfo;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("LoginToken")
    private String loginToken;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OsType")
    private String osType;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private Policy policy;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetryTimes")
    private Integer retryTimes;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskStatus")
    private String taskStatus;

    @com.aliyun.core.annotation.NameInMap("TenantId")
    private Long tenantId;

    @com.aliyun.core.annotation.NameInMap("Ticket")
    private String ticket;

    private GetConnectionTicketResponseBody(Builder builder) {
        this.appInstanceGroupId = builder.appInstanceGroupId;
        this.appInstanceId = builder.appInstanceId;
        this.appInstancePersistentId = builder.appInstancePersistentId;
        this.bindQueueInfo = builder.bindQueueInfo;
        this.code = builder.code;
        this.loginToken = builder.loginToken;
        this.message = builder.message;
        this.osType = builder.osType;
        this.policy = builder.policy;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.retryTimes = builder.retryTimes;
        this.taskId = builder.taskId;
        this.taskStatus = builder.taskStatus;
        this.tenantId = builder.tenantId;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConnectionTicketResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceGroupId
     */
    public String getAppInstanceGroupId() {
        return this.appInstanceGroupId;
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return appInstancePersistentId
     */
    public String getAppInstancePersistentId() {
        return this.appInstancePersistentId;
    }

    /**
     * @return bindQueueInfo
     */
    public BindQueueInfo getBindQueueInfo() {
        return this.bindQueueInfo;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return loginToken
     */
    public String getLoginToken() {
        return this.loginToken;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return osType
     */
    public String getOsType() {
        return this.osType;
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retryTimes
     */
    public Integer getRetryTimes() {
        return this.retryTimes;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskStatus
     */
    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * @return tenantId
     */
    public Long getTenantId() {
        return this.tenantId;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder {
        private String appInstanceGroupId; 
        private String appInstanceId; 
        private String appInstancePersistentId; 
        private BindQueueInfo bindQueueInfo; 
        private String code; 
        private String loginToken; 
        private String message; 
        private String osType; 
        private Policy policy; 
        private String regionId; 
        private String requestId; 
        private Integer retryTimes; 
        private String taskId; 
        private String taskStatus; 
        private Long tenantId; 
        private String ticket; 

        private Builder() {
        } 

        private Builder(GetConnectionTicketResponseBody model) {
            this.appInstanceGroupId = model.appInstanceGroupId;
            this.appInstanceId = model.appInstanceId;
            this.appInstancePersistentId = model.appInstancePersistentId;
            this.bindQueueInfo = model.bindQueueInfo;
            this.code = model.code;
            this.loginToken = model.loginToken;
            this.message = model.message;
            this.osType = model.osType;
            this.policy = model.policy;
            this.regionId = model.regionId;
            this.requestId = model.requestId;
            this.retryTimes = model.retryTimes;
            this.taskId = model.taskId;
            this.taskStatus = model.taskStatus;
            this.tenantId = model.tenantId;
            this.ticket = model.ticket;
        } 

        /**
         * AppInstanceGroupId.
         */
        public Builder appInstanceGroupId(String appInstanceGroupId) {
            this.appInstanceGroupId = appInstanceGroupId;
            return this;
        }

        /**
         * AppInstanceId.
         */
        public Builder appInstanceId(String appInstanceId) {
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * AppInstancePersistentId.
         */
        public Builder appInstancePersistentId(String appInstancePersistentId) {
            this.appInstancePersistentId = appInstancePersistentId;
            return this;
        }

        /**
         * BindQueueInfo.
         */
        public Builder bindQueueInfo(BindQueueInfo bindQueueInfo) {
            this.bindQueueInfo = bindQueueInfo;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * LoginToken.
         */
        public Builder loginToken(String loginToken) {
            this.loginToken = loginToken;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * OsType.
         */
        public Builder osType(String osType) {
            this.osType = osType;
            return this;
        }

        /**
         * Policy.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>AD2D0761-1FE5-549D-B169-D3F8D19C6CDD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetryTimes.
         */
        public Builder retryTimes(Integer retryTimes) {
            this.retryTimes = retryTimes;
            return this;
        }

        /**
         * TaskId.
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * TaskStatus.
         */
        public Builder taskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Ticket.
         */
        public Builder ticket(String ticket) {
            this.ticket = ticket;
            return this;
        }

        public GetConnectionTicketResponseBody build() {
            return new GetConnectionTicketResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectionTicketResponseBody</p>
     */
    public static class BindQueueInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("QueueStatus")
        private String queueStatus;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private Integer rank;

        @com.aliyun.core.annotation.NameInMap("ReadyTimeout")
        private Long readyTimeout;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private Long remainingTime;

        @com.aliyun.core.annotation.NameInMap("RequestKey")
        private String requestKey;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("WaitTime")
        private Long waitTime;

        private BindQueueInfo(Builder builder) {
            this.queueStatus = builder.queueStatus;
            this.rank = builder.rank;
            this.readyTimeout = builder.readyTimeout;
            this.remainingTime = builder.remainingTime;
            this.requestKey = builder.requestKey;
            this.targetId = builder.targetId;
            this.waitTime = builder.waitTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindQueueInfo create() {
            return builder().build();
        }

        /**
         * @return queueStatus
         */
        public String getQueueStatus() {
            return this.queueStatus;
        }

        /**
         * @return rank
         */
        public Integer getRank() {
            return this.rank;
        }

        /**
         * @return readyTimeout
         */
        public Long getReadyTimeout() {
            return this.readyTimeout;
        }

        /**
         * @return remainingTime
         */
        public Long getRemainingTime() {
            return this.remainingTime;
        }

        /**
         * @return requestKey
         */
        public String getRequestKey() {
            return this.requestKey;
        }

        /**
         * @return targetId
         */
        public String getTargetId() {
            return this.targetId;
        }

        /**
         * @return waitTime
         */
        public Long getWaitTime() {
            return this.waitTime;
        }

        public static final class Builder {
            private String queueStatus; 
            private Integer rank; 
            private Long readyTimeout; 
            private Long remainingTime; 
            private String requestKey; 
            private String targetId; 
            private Long waitTime; 

            private Builder() {
            } 

            private Builder(BindQueueInfo model) {
                this.queueStatus = model.queueStatus;
                this.rank = model.rank;
                this.readyTimeout = model.readyTimeout;
                this.remainingTime = model.remainingTime;
                this.requestKey = model.requestKey;
                this.targetId = model.targetId;
                this.waitTime = model.waitTime;
            } 

            /**
             * QueueStatus.
             */
            public Builder queueStatus(String queueStatus) {
                this.queueStatus = queueStatus;
                return this;
            }

            /**
             * Rank.
             */
            public Builder rank(Integer rank) {
                this.rank = rank;
                return this;
            }

            /**
             * ReadyTimeout.
             */
            public Builder readyTimeout(Long readyTimeout) {
                this.readyTimeout = readyTimeout;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(Long remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            /**
             * RequestKey.
             */
            public Builder requestKey(String requestKey) {
                this.requestKey = requestKey;
                return this;
            }

            /**
             * TargetId.
             */
            public Builder targetId(String targetId) {
                this.targetId = targetId;
                return this;
            }

            /**
             * WaitTime.
             */
            public Builder waitTime(Long waitTime) {
                this.waitTime = waitTime;
                return this;
            }

            public BindQueueInfo build() {
                return new BindQueueInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetConnectionTicketResponseBody} extends {@link TeaModel}
     *
     * <p>GetConnectionTicketResponseBody</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResolutionAdaptive")
        private String resolutionAdaptive;

        @com.aliyun.core.annotation.NameInMap("ResolutionHeight")
        private Integer resolutionHeight;

        @com.aliyun.core.annotation.NameInMap("ResolutionWidth")
        private Integer resolutionWidth;

        private Policy(Builder builder) {
            this.resolutionAdaptive = builder.resolutionAdaptive;
            this.resolutionHeight = builder.resolutionHeight;
            this.resolutionWidth = builder.resolutionWidth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return resolutionAdaptive
         */
        public String getResolutionAdaptive() {
            return this.resolutionAdaptive;
        }

        /**
         * @return resolutionHeight
         */
        public Integer getResolutionHeight() {
            return this.resolutionHeight;
        }

        /**
         * @return resolutionWidth
         */
        public Integer getResolutionWidth() {
            return this.resolutionWidth;
        }

        public static final class Builder {
            private String resolutionAdaptive; 
            private Integer resolutionHeight; 
            private Integer resolutionWidth; 

            private Builder() {
            } 

            private Builder(Policy model) {
                this.resolutionAdaptive = model.resolutionAdaptive;
                this.resolutionHeight = model.resolutionHeight;
                this.resolutionWidth = model.resolutionWidth;
            } 

            /**
             * ResolutionAdaptive.
             */
            public Builder resolutionAdaptive(String resolutionAdaptive) {
                this.resolutionAdaptive = resolutionAdaptive;
                return this;
            }

            /**
             * ResolutionHeight.
             */
            public Builder resolutionHeight(Integer resolutionHeight) {
                this.resolutionHeight = resolutionHeight;
                return this;
            }

            /**
             * ResolutionWidth.
             */
            public Builder resolutionWidth(Integer resolutionWidth) {
                this.resolutionWidth = resolutionWidth;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
