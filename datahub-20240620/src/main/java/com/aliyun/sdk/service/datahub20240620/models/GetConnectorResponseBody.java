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
 * {@link GetConnectorResponseBody} extends {@link TeaModel}
 *
 * <p>GetConnectorResponseBody</p>
 */
public class GetConnectorResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ColumnFields")
    private String columnFields;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    private String connectorId;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Creator")
    private String creator;

    @com.aliyun.core.annotation.NameInMap("DoneTime")
    private String doneTime;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("SubscriptionId")
    private String subscriptionId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TopicName")
    private String topicName;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private GetConnectorResponseBody(Builder builder) {
        this.columnFields = builder.columnFields;
        this.config = builder.config;
        this.connectorId = builder.connectorId;
        this.createTime = builder.createTime;
        this.creator = builder.creator;
        this.doneTime = builder.doneTime;
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

    public static GetConnectorResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return columnFields
     */
    public String getColumnFields() {
        return this.columnFields;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return creator
     */
    public String getCreator() {
        return this.creator;
    }

    /**
     * @return doneTime
     */
    public String getDoneTime() {
        return this.doneTime;
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
    public String getState() {
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
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String columnFields; 
        private String config; 
        private String connectorId; 
        private String createTime; 
        private String creator; 
        private String doneTime; 
        private String projectName; 
        private String requestId; 
        private String state; 
        private String subscriptionId; 
        private Boolean success; 
        private String topicName; 
        private String type; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(GetConnectorResponseBody model) {
            this.columnFields = model.columnFields;
            this.config = model.config;
            this.connectorId = model.connectorId;
            this.createTime = model.createTime;
            this.creator = model.creator;
            this.doneTime = model.doneTime;
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
         * ColumnFields.
         */
        public Builder columnFields(String columnFields) {
            this.columnFields = columnFields;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * ConnectorId.
         */
        public Builder connectorId(String connectorId) {
            this.connectorId = connectorId;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
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
         * DoneTime.
         */
        public Builder doneTime(String doneTime) {
            this.doneTime = doneTime;
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
        public Builder state(String state) {
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
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetConnectorResponseBody build() {
            return new GetConnectorResponseBody(this);
        } 

    } 

}
