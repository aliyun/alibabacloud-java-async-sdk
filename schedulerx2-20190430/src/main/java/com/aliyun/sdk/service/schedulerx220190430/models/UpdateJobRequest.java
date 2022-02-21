// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateJobRequest} extends {@link RequestModel}
 *
 * <p>UpdateJobRequest</p>
 */
public class UpdateJobRequest extends Request {
    @Body
    @NameInMap("AttemptInterval")
    private Integer attemptInterval;

    @Body
    @NameInMap("Calendar")
    private String calendar;

    @Body
    @NameInMap("ClassName")
    private String className;

    @Body
    @NameInMap("ConsumerSize")
    private Integer consumerSize;

    @Body
    @NameInMap("ContactInfo")
    private java.util.List < ContactInfo> contactInfo;

    @Body
    @NameInMap("Content")
    private String content;

    @Body
    @NameInMap("DataOffset")
    private Integer dataOffset;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DispatcherSize")
    private Integer dispatcherSize;

    @Body
    @NameInMap("ExecuteMode")
    @Validation(required = true)
    private String executeMode;

    @Body
    @NameInMap("FailEnable")
    private Boolean failEnable;

    @Body
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Body
    @NameInMap("JarUrl")
    private String jarUrl;

    @Body
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Body
    @NameInMap("MaxAttempt")
    private Integer maxAttempt;

    @Body
    @NameInMap("MaxConcurrency")
    @Validation(maximum = 200, minimum = 1)
    private Integer maxConcurrency;

    @Body
    @NameInMap("MissWorkerEnable")
    private Boolean missWorkerEnable;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Body
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Body
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("Parameters")
    private String parameters;

    @Body
    @NameInMap("QueueSize")
    private Integer queueSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("SendChannel")
    private String sendChannel;

    @Body
    @NameInMap("TaskAttemptInterval")
    private Integer taskAttemptInterval;

    @Body
    @NameInMap("TaskMaxAttempt")
    @Validation(maximum = 10)
    private Integer taskMaxAttempt;

    @Body
    @NameInMap("TimeExpression")
    private String timeExpression;

    @Body
    @NameInMap("TimeType")
    @Validation(required = true)
    private Integer timeType;

    @Body
    @NameInMap("Timeout")
    private Long timeout;

    @Body
    @NameInMap("TimeoutEnable")
    private Boolean timeoutEnable;

    @Body
    @NameInMap("TimeoutKillEnable")
    private Boolean timeoutKillEnable;

    private UpdateJobRequest(Builder builder) {
        super(builder);
        this.attemptInterval = builder.attemptInterval;
        this.calendar = builder.calendar;
        this.className = builder.className;
        this.consumerSize = builder.consumerSize;
        this.contactInfo = builder.contactInfo;
        this.content = builder.content;
        this.dataOffset = builder.dataOffset;
        this.description = builder.description;
        this.dispatcherSize = builder.dispatcherSize;
        this.executeMode = builder.executeMode;
        this.failEnable = builder.failEnable;
        this.groupId = builder.groupId;
        this.jarUrl = builder.jarUrl;
        this.jobId = builder.jobId;
        this.maxAttempt = builder.maxAttempt;
        this.maxConcurrency = builder.maxConcurrency;
        this.missWorkerEnable = builder.missWorkerEnable;
        this.name = builder.name;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.pageSize = builder.pageSize;
        this.parameters = builder.parameters;
        this.queueSize = builder.queueSize;
        this.regionId = builder.regionId;
        this.sendChannel = builder.sendChannel;
        this.taskAttemptInterval = builder.taskAttemptInterval;
        this.taskMaxAttempt = builder.taskMaxAttempt;
        this.timeExpression = builder.timeExpression;
        this.timeType = builder.timeType;
        this.timeout = builder.timeout;
        this.timeoutEnable = builder.timeoutEnable;
        this.timeoutKillEnable = builder.timeoutKillEnable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attemptInterval
     */
    public Integer getAttemptInterval() {
        return this.attemptInterval;
    }

    /**
     * @return calendar
     */
    public String getCalendar() {
        return this.calendar;
    }

    /**
     * @return className
     */
    public String getClassName() {
        return this.className;
    }

    /**
     * @return consumerSize
     */
    public Integer getConsumerSize() {
        return this.consumerSize;
    }

    /**
     * @return contactInfo
     */
    public java.util.List < ContactInfo> getContactInfo() {
        return this.contactInfo;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataOffset
     */
    public Integer getDataOffset() {
        return this.dataOffset;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dispatcherSize
     */
    public Integer getDispatcherSize() {
        return this.dispatcherSize;
    }

    /**
     * @return executeMode
     */
    public String getExecuteMode() {
        return this.executeMode;
    }

    /**
     * @return failEnable
     */
    public Boolean getFailEnable() {
        return this.failEnable;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return jarUrl
     */
    public String getJarUrl() {
        return this.jarUrl;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return maxAttempt
     */
    public Integer getMaxAttempt() {
        return this.maxAttempt;
    }

    /**
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
    }

    /**
     * @return missWorkerEnable
     */
    public Boolean getMissWorkerEnable() {
        return this.missWorkerEnable;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return queueSize
     */
    public Integer getQueueSize() {
        return this.queueSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sendChannel
     */
    public String getSendChannel() {
        return this.sendChannel;
    }

    /**
     * @return taskAttemptInterval
     */
    public Integer getTaskAttemptInterval() {
        return this.taskAttemptInterval;
    }

    /**
     * @return taskMaxAttempt
     */
    public Integer getTaskMaxAttempt() {
        return this.taskMaxAttempt;
    }

    /**
     * @return timeExpression
     */
    public String getTimeExpression() {
        return this.timeExpression;
    }

    /**
     * @return timeType
     */
    public Integer getTimeType() {
        return this.timeType;
    }

    /**
     * @return timeout
     */
    public Long getTimeout() {
        return this.timeout;
    }

    /**
     * @return timeoutEnable
     */
    public Boolean getTimeoutEnable() {
        return this.timeoutEnable;
    }

    /**
     * @return timeoutKillEnable
     */
    public Boolean getTimeoutKillEnable() {
        return this.timeoutKillEnable;
    }

    public static final class Builder extends Request.Builder<UpdateJobRequest, Builder> {
        private Integer attemptInterval; 
        private String calendar; 
        private String className; 
        private Integer consumerSize; 
        private java.util.List < ContactInfo> contactInfo; 
        private String content; 
        private Integer dataOffset; 
        private String description; 
        private Integer dispatcherSize; 
        private String executeMode; 
        private Boolean failEnable; 
        private String groupId; 
        private String jarUrl; 
        private Long jobId; 
        private Integer maxAttempt; 
        private Integer maxConcurrency; 
        private Boolean missWorkerEnable; 
        private String name; 
        private String namespace; 
        private String namespaceSource; 
        private Integer pageSize; 
        private String parameters; 
        private Integer queueSize; 
        private String regionId; 
        private String sendChannel; 
        private Integer taskAttemptInterval; 
        private Integer taskMaxAttempt; 
        private String timeExpression; 
        private Integer timeType; 
        private Long timeout; 
        private Boolean timeoutEnable; 
        private Boolean timeoutKillEnable; 

        private Builder() {
            super();
        } 

        private Builder(UpdateJobRequest response) {
            super(response);
            this.attemptInterval = response.attemptInterval;
            this.calendar = response.calendar;
            this.className = response.className;
            this.consumerSize = response.consumerSize;
            this.contactInfo = response.contactInfo;
            this.content = response.content;
            this.dataOffset = response.dataOffset;
            this.description = response.description;
            this.dispatcherSize = response.dispatcherSize;
            this.executeMode = response.executeMode;
            this.failEnable = response.failEnable;
            this.groupId = response.groupId;
            this.jarUrl = response.jarUrl;
            this.jobId = response.jobId;
            this.maxAttempt = response.maxAttempt;
            this.maxConcurrency = response.maxConcurrency;
            this.missWorkerEnable = response.missWorkerEnable;
            this.name = response.name;
            this.namespace = response.namespace;
            this.namespaceSource = response.namespaceSource;
            this.pageSize = response.pageSize;
            this.parameters = response.parameters;
            this.queueSize = response.queueSize;
            this.regionId = response.regionId;
            this.sendChannel = response.sendChannel;
            this.taskAttemptInterval = response.taskAttemptInterval;
            this.taskMaxAttempt = response.taskMaxAttempt;
            this.timeExpression = response.timeExpression;
            this.timeType = response.timeType;
            this.timeout = response.timeout;
            this.timeoutEnable = response.timeoutEnable;
            this.timeoutKillEnable = response.timeoutKillEnable;
        } 

        /**
         * AttemptInterval.
         */
        public Builder attemptInterval(Integer attemptInterval) {
            this.putBodyParameter("AttemptInterval", attemptInterval);
            this.attemptInterval = attemptInterval;
            return this;
        }

        /**
         * Calendar.
         */
        public Builder calendar(String calendar) {
            this.putBodyParameter("Calendar", calendar);
            this.calendar = calendar;
            return this;
        }

        /**
         * ClassName.
         */
        public Builder className(String className) {
            this.putBodyParameter("ClassName", className);
            this.className = className;
            return this;
        }

        /**
         * ConsumerSize.
         */
        public Builder consumerSize(Integer consumerSize) {
            this.putBodyParameter("ConsumerSize", consumerSize);
            this.consumerSize = consumerSize;
            return this;
        }

        /**
         * ContactInfo.
         */
        public Builder contactInfo(java.util.List < ContactInfo> contactInfo) {
            this.putBodyParameter("ContactInfo", contactInfo);
            this.contactInfo = contactInfo;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DataOffset.
         */
        public Builder dataOffset(Integer dataOffset) {
            this.putBodyParameter("DataOffset", dataOffset);
            this.dataOffset = dataOffset;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DispatcherSize.
         */
        public Builder dispatcherSize(Integer dispatcherSize) {
            this.putBodyParameter("DispatcherSize", dispatcherSize);
            this.dispatcherSize = dispatcherSize;
            return this;
        }

        /**
         * ExecuteMode.
         */
        public Builder executeMode(String executeMode) {
            this.putBodyParameter("ExecuteMode", executeMode);
            this.executeMode = executeMode;
            return this;
        }

        /**
         * FailEnable.
         */
        public Builder failEnable(Boolean failEnable) {
            this.putBodyParameter("FailEnable", failEnable);
            this.failEnable = failEnable;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * JarUrl.
         */
        public Builder jarUrl(String jarUrl) {
            this.putBodyParameter("JarUrl", jarUrl);
            this.jarUrl = jarUrl;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putBodyParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * MaxAttempt.
         */
        public Builder maxAttempt(Integer maxAttempt) {
            this.putBodyParameter("MaxAttempt", maxAttempt);
            this.maxAttempt = maxAttempt;
            return this;
        }

        /**
         * MaxConcurrency.
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putBodyParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * MissWorkerEnable.
         */
        public Builder missWorkerEnable(Boolean missWorkerEnable) {
            this.putBodyParameter("MissWorkerEnable", missWorkerEnable);
            this.missWorkerEnable = missWorkerEnable;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putBodyParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putBodyParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * QueueSize.
         */
        public Builder queueSize(Integer queueSize) {
            this.putBodyParameter("QueueSize", queueSize);
            this.queueSize = queueSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SendChannel.
         */
        public Builder sendChannel(String sendChannel) {
            this.putBodyParameter("SendChannel", sendChannel);
            this.sendChannel = sendChannel;
            return this;
        }

        /**
         * TaskAttemptInterval.
         */
        public Builder taskAttemptInterval(Integer taskAttemptInterval) {
            this.putBodyParameter("TaskAttemptInterval", taskAttemptInterval);
            this.taskAttemptInterval = taskAttemptInterval;
            return this;
        }

        /**
         * TaskMaxAttempt.
         */
        public Builder taskMaxAttempt(Integer taskMaxAttempt) {
            this.putBodyParameter("TaskMaxAttempt", taskMaxAttempt);
            this.taskMaxAttempt = taskMaxAttempt;
            return this;
        }

        /**
         * TimeExpression.
         */
        public Builder timeExpression(String timeExpression) {
            this.putBodyParameter("TimeExpression", timeExpression);
            this.timeExpression = timeExpression;
            return this;
        }

        /**
         * TimeType.
         */
        public Builder timeType(Integer timeType) {
            this.putBodyParameter("TimeType", timeType);
            this.timeType = timeType;
            return this;
        }

        /**
         * Timeout.
         */
        public Builder timeout(Long timeout) {
            this.putBodyParameter("Timeout", timeout);
            this.timeout = timeout;
            return this;
        }

        /**
         * TimeoutEnable.
         */
        public Builder timeoutEnable(Boolean timeoutEnable) {
            this.putBodyParameter("TimeoutEnable", timeoutEnable);
            this.timeoutEnable = timeoutEnable;
            return this;
        }

        /**
         * TimeoutKillEnable.
         */
        public Builder timeoutKillEnable(Boolean timeoutKillEnable) {
            this.putBodyParameter("TimeoutKillEnable", timeoutKillEnable);
            this.timeoutKillEnable = timeoutKillEnable;
            return this;
        }

        @Override
        public UpdateJobRequest build() {
            return new UpdateJobRequest(this);
        } 

    } 

    public static class ContactInfo extends TeaModel {
        @NameInMap("Ding")
        private String ding;

        @NameInMap("UserMail")
        private String userMail;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserPhone")
        private String userPhone;

        private ContactInfo(Builder builder) {
            this.ding = builder.ding;
            this.userMail = builder.userMail;
            this.userName = builder.userName;
            this.userPhone = builder.userPhone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ContactInfo create() {
            return builder().build();
        }

        /**
         * @return ding
         */
        public String getDing() {
            return this.ding;
        }

        /**
         * @return userMail
         */
        public String getUserMail() {
            return this.userMail;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userPhone
         */
        public String getUserPhone() {
            return this.userPhone;
        }

        public static final class Builder {
            private String ding; 
            private String userMail; 
            private String userName; 
            private String userPhone; 

            /**
             * Ding.
             */
            public Builder ding(String ding) {
                this.ding = ding;
                return this;
            }

            /**
             * UserMail.
             */
            public Builder userMail(String userMail) {
                this.userMail = userMail;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserPhone.
             */
            public Builder userPhone(String userPhone) {
                this.userPhone = userPhone;
                return this;
            }

            public ContactInfo build() {
                return new ContactInfo(this);
            } 

        } 

    }
}
