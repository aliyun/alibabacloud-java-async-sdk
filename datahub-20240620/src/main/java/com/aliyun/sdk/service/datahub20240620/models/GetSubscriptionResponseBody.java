// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datahub20240620.models;

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
 * {@link GetSubscriptionResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubscriptionResponseBody</p>
 */
public class GetSubscriptionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Application")
    private String application;

    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private Integer state;

    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private Long updateTime;

    private GetSubscriptionResponseBody(Builder builder) {
        this.application = builder.application;
        this.comment = builder.comment;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.state = builder.state;
        this.subscriptionId = builder.subscriptionId;
        this.success = builder.success;
        this.topicName = builder.topicName;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubscriptionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return application
     */
    public String getApplication() {
        return this.application;
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public Integer getState() {
        return this.state;
    }

    /**
     * @return subscriptionId
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return topicName
     */
    public String getTopicName() {
        return this.topicName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String application; 
        private String comment; 
        private Long createTime; 
        private String creator; 
        private String projectName; 
        private String requestId; 
        private Integer state; 
        private String subscriptionId; 
        private Boolean success; 
        private String topicName; 
        private String type; 
        private Long updateTime; 

        private Builder() {
        } 

        private Builder(GetSubscriptionResponseBody model) {
            this.application = model.application;
            this.comment = model.comment;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.state = model.state;
            this.subscriptionId = model.subscriptionId;
            this.success = model.success;
            this.topicName = model.topicName;
            this.type = model.type;
            this.updateTime = model.updateTime;
        } 

        /**
         * Application.
         */
        public Builder application(String application) {
            this.application = application;
            return this;
        }

        /**
         * Comment.
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Creator.
         */
        public Builder creator(String creator) {
            this.creator = creator;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * State.
         */
        public Builder state(Integer state) {
            this.state = state;
            return this;
        }

        /**
         * SubscriptionId.
         */
        public Builder subscriptionId(String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TopicName.
         */
        public Builder topicName(String topicName) {
            this.topicName = topicName;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetSubscriptionResponseBody build() {
            return new GetSubscriptionResponseBody(this);
        } 

    } 

}
