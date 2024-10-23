// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetTodoTaskResponseBody} extends {@link TeaModel}
 *
 * <p>GetTodoTaskResponseBody</p>
 */
public class GetTodoTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bizTag")
    private String bizTag;

    @com.aliyun.core.annotation.NameInMap("cardTypeId")
    private String cardTypeId;

    @com.aliyun.core.annotation.NameInMap("createdTime")
    private Long createdTime;

    @com.aliyun.core.annotation.NameInMap("creatorId")
    private String creatorId;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("detailUrl")
    private DetailUrl detailUrl;

    @com.aliyun.core.annotation.NameInMap("done")
    private Boolean done;

    @com.aliyun.core.annotation.NameInMap("dueTime")
    private Long dueTime;

    @com.aliyun.core.annotation.NameInMap("executorIds")
    private java.util.List < String > executorIds;

    @com.aliyun.core.annotation.NameInMap("finishTime")
    private Long finishTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("isOnlyShowExecutor")
    private Boolean isOnlyShowExecutor;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private Long modifiedTime;

    @com.aliyun.core.annotation.NameInMap("modifierId")
    private String modifierId;

    @com.aliyun.core.annotation.NameInMap("participantIds")
    private java.util.List < String > participantIds;

    @com.aliyun.core.annotation.NameInMap("priority")
    private Integer priority;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("sourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    @com.aliyun.core.annotation.NameInMap("subject")
    private String subject;

    @com.aliyun.core.annotation.NameInMap("tenantId")
    private String tenantId;

    @com.aliyun.core.annotation.NameInMap("tenantType")
    private String tenantType;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetTodoTaskResponseBody(Builder builder) {
        this.bizTag = builder.bizTag;
        this.cardTypeId = builder.cardTypeId;
        this.createdTime = builder.createdTime;
        this.creatorId = builder.creatorId;
        this.description = builder.description;
        this.detailUrl = builder.detailUrl;
        this.done = builder.done;
        this.dueTime = builder.dueTime;
        this.executorIds = builder.executorIds;
        this.finishTime = builder.finishTime;
        this.id = builder.id;
        this.isOnlyShowExecutor = builder.isOnlyShowExecutor;
        this.modifiedTime = builder.modifiedTime;
        this.modifierId = builder.modifierId;
        this.participantIds = builder.participantIds;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.source = builder.source;
        this.sourceId = builder.sourceId;
        this.startTime = builder.startTime;
        this.subject = builder.subject;
        this.tenantId = builder.tenantId;
        this.tenantType = builder.tenantType;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTodoTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return bizTag
     */
    public String getBizTag() {
        return this.bizTag;
    }

    /**
     * @return cardTypeId
     */
    public String getCardTypeId() {
        return this.cardTypeId;
    }

    /**
     * @return createdTime
     */
    public Long getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return creatorId
     */
    public String getCreatorId() {
        return this.creatorId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return detailUrl
     */
    public DetailUrl getDetailUrl() {
        return this.detailUrl;
    }

    /**
     * @return done
     */
    public Boolean getDone() {
        return this.done;
    }

    /**
     * @return dueTime
     */
    public Long getDueTime() {
        return this.dueTime;
    }

    /**
     * @return executorIds
     */
    public java.util.List < String > getExecutorIds() {
        return this.executorIds;
    }

    /**
     * @return finishTime
     */
    public Long getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isOnlyShowExecutor
     */
    public Boolean getIsOnlyShowExecutor() {
        return this.isOnlyShowExecutor;
    }

    /**
     * @return modifiedTime
     */
    public Long getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return modifierId
     */
    public String getModifierId() {
        return this.modifierId;
    }

    /**
     * @return participantIds
     */
    public java.util.List < String > getParticipantIds() {
        return this.participantIds;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return subject
     */
    public String getSubject() {
        return this.subject;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return tenantType
     */
    public String getTenantType() {
        return this.tenantType;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String bizTag; 
        private String cardTypeId; 
        private Long createdTime; 
        private String creatorId; 
        private String description; 
        private DetailUrl detailUrl; 
        private Boolean done; 
        private Long dueTime; 
        private java.util.List < String > executorIds; 
        private Long finishTime; 
        private String id; 
        private Boolean isOnlyShowExecutor; 
        private Long modifiedTime; 
        private String modifierId; 
        private java.util.List < String > participantIds; 
        private Integer priority; 
        private String requestId; 
        private String source; 
        private String sourceId; 
        private Long startTime; 
        private String subject; 
        private String tenantId; 
        private String tenantType; 
        private String vendorRequestId; 
        private String vendorType; 

        /**
         * bizTag.
         */
        public Builder bizTag(String bizTag) {
            this.bizTag = bizTag;
            return this;
        }

        /**
         * cardTypeId.
         */
        public Builder cardTypeId(String cardTypeId) {
            this.cardTypeId = cardTypeId;
            return this;
        }

        /**
         * createdTime.
         */
        public Builder createdTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * creatorId.
         */
        public Builder creatorId(String creatorId) {
            this.creatorId = creatorId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * detailUrl.
         */
        public Builder detailUrl(DetailUrl detailUrl) {
            this.detailUrl = detailUrl;
            return this;
        }

        /**
         * done.
         */
        public Builder done(Boolean done) {
            this.done = done;
            return this;
        }

        /**
         * dueTime.
         */
        public Builder dueTime(Long dueTime) {
            this.dueTime = dueTime;
            return this;
        }

        /**
         * executorIds.
         */
        public Builder executorIds(java.util.List < String > executorIds) {
            this.executorIds = executorIds;
            return this;
        }

        /**
         * finishTime.
         */
        public Builder finishTime(Long finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * isOnlyShowExecutor.
         */
        public Builder isOnlyShowExecutor(Boolean isOnlyShowExecutor) {
            this.isOnlyShowExecutor = isOnlyShowExecutor;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(Long modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * modifierId.
         */
        public Builder modifierId(String modifierId) {
            this.modifierId = modifierId;
            return this;
        }

        /**
         * participantIds.
         */
        public Builder participantIds(java.util.List < String > participantIds) {
            this.participantIds = participantIds;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * source.
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * sourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        /**
         * tenantId.
         */
        public Builder tenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }

        /**
         * tenantType.
         */
        public Builder tenantType(String tenantType) {
            this.tenantType = tenantType;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetTodoTaskResponseBody build() {
            return new GetTodoTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTodoTaskResponseBody} extends {@link TeaModel}
     *
     * <p>GetTodoTaskResponseBody</p>
     */
    public static class DetailUrl extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppUrl")
        private String appUrl;

        @com.aliyun.core.annotation.NameInMap("PcUrl")
        private String pcUrl;

        private DetailUrl(Builder builder) {
            this.appUrl = builder.appUrl;
            this.pcUrl = builder.pcUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailUrl create() {
            return builder().build();
        }

        /**
         * @return appUrl
         */
        public String getAppUrl() {
            return this.appUrl;
        }

        /**
         * @return pcUrl
         */
        public String getPcUrl() {
            return this.pcUrl;
        }

        public static final class Builder {
            private String appUrl; 
            private String pcUrl; 

            /**
             * AppUrl.
             */
            public Builder appUrl(String appUrl) {
                this.appUrl = appUrl;
                return this;
            }

            /**
             * PcUrl.
             */
            public Builder pcUrl(String pcUrl) {
                this.pcUrl = pcUrl;
                return this;
            }

            public DetailUrl build() {
                return new DetailUrl(this);
            } 

        } 

    }
}
