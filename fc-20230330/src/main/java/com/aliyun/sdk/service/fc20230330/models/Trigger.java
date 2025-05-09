// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link Trigger} extends {@link TeaModel}
 *
 * <p>Trigger</p>
 */
public class Trigger extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("httpTrigger")
    private HTTPTrigger httpTrigger;

    @com.aliyun.core.annotation.NameInMap("invocationRole")
    private String invocationRole;

    @com.aliyun.core.annotation.NameInMap("lastModifiedTime")
    private String lastModifiedTime;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sourceArn")
    private String sourceArn;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("targetArn")
    private String targetArn;

    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    private String triggerConfig;

    @com.aliyun.core.annotation.NameInMap("triggerId")
    private String triggerId;

    @com.aliyun.core.annotation.NameInMap("triggerName")
    private String triggerName;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    private String triggerType;

    private Trigger(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.httpTrigger = builder.httpTrigger;
        this.invocationRole = builder.invocationRole;
        this.lastModifiedTime = builder.lastModifiedTime;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.status = builder.status;
        this.targetArn = builder.targetArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerId = builder.triggerId;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Trigger create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return httpTrigger
     */
    public HTTPTrigger getHttpTrigger() {
        return this.httpTrigger;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * @return lastModifiedTime
     */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return targetArn
     */
    public String getTargetArn() {
        return this.targetArn;
    }

    /**
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerId
     */
    public String getTriggerId() {
        return this.triggerId;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private HTTPTrigger httpTrigger; 
        private String invocationRole; 
        private String lastModifiedTime; 
        private String qualifier; 
        private String sourceArn; 
        private String status; 
        private String targetArn; 
        private String triggerConfig; 
        private String triggerId; 
        private String triggerName; 
        private String triggerType; 

        private Builder() {
        } 

        private Builder(Trigger model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.httpTrigger = model.httpTrigger;
            this.invocationRole = model.invocationRole;
            this.lastModifiedTime = model.lastModifiedTime;
            this.qualifier = model.qualifier;
            this.sourceArn = model.sourceArn;
            this.status = model.status;
            this.targetArn = model.targetArn;
            this.triggerConfig = model.triggerConfig;
            this.triggerId = model.triggerId;
            this.triggerName = model.triggerName;
            this.triggerType = model.triggerType;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
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
         * httpTrigger.
         */
        public Builder httpTrigger(HTTPTrigger httpTrigger) {
            this.httpTrigger = httpTrigger;
            return this;
        }

        /**
         * invocationRole.
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * lastModifiedTime.
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * qualifier.
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * sourceArn.
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * targetArn.
         */
        public Builder targetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        /**
         * triggerConfig.
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * triggerId.
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * triggerName.
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * triggerType.
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public Trigger build() {
            return new Trigger(this);
        } 

    } 

}
