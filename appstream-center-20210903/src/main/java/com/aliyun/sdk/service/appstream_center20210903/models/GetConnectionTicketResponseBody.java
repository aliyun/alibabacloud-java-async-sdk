// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210903.models;

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
        @com.aliyun.core.annotation.NameInMap("Length")
        private Integer length;

        @com.aliyun.core.annotation.NameInMap("Rank")
        private Integer rank;

        @com.aliyun.core.annotation.NameInMap("RemainingTimeMin")
        private Integer remainingTimeMin;

        @com.aliyun.core.annotation.NameInMap("RequestKey")
        private String requestKey;

        @com.aliyun.core.annotation.NameInMap("TargetId")
        private String targetId;

        @com.aliyun.core.annotation.NameInMap("WaitTimeMin")
        private Integer waitTimeMin;

        private BindQueueInfo(Builder builder) {
            this.length = builder.length;
            this.rank = builder.rank;
            this.remainingTimeMin = builder.remainingTimeMin;
            this.requestKey = builder.requestKey;
            this.targetId = builder.targetId;
            this.waitTimeMin = builder.waitTimeMin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindQueueInfo create() {
            return builder().build();
        }

        /**
         * @return length
         */
        public Integer getLength() {
            return this.length;
        }

        /**
         * @return rank
         */
        public Integer getRank() {
            return this.rank;
        }

        /**
         * @return remainingTimeMin
         */
        public Integer getRemainingTimeMin() {
            return this.remainingTimeMin;
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
         * @return waitTimeMin
         */
        public Integer getWaitTimeMin() {
            return this.waitTimeMin;
        }

        public static final class Builder {
            private Integer length; 
            private Integer rank; 
            private Integer remainingTimeMin; 
            private String requestKey; 
            private String targetId; 
            private Integer waitTimeMin; 

            /**
             * Length.
             */
            public Builder length(Integer length) {
                this.length = length;
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
             * RemainingTimeMin.
             */
            public Builder remainingTimeMin(Integer remainingTimeMin) {
                this.remainingTimeMin = remainingTimeMin;
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
             * WaitTimeMin.
             */
            public Builder waitTimeMin(Integer waitTimeMin) {
                this.waitTimeMin = waitTimeMin;
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
