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
         * <p>The time when the trigger was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-08-20T02:28:21Z</p>
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * <p>The description of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>test_description</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The information about the HTTP trigger.</p>
         */
        public Builder httpTrigger(HTTPTrigger httpTrigger) {
            this.httpTrigger = httpTrigger;
            return this;
        }

        /**
         * <p>The role that is used by the event source such as OSS to invoke the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::151641468453****:role/my-role</p>
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * <p>The time when the trigger was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-04-23T06:32:43Z</p>
         */
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = lastModifiedTime;
            return this;
        }

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the event source for the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:151641468453****:my-bucket</p>
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * <p>The status of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The ARN of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-hangzhou:151641468453****:my-bucket</p>
         */
        public Builder targetArn(String targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        /**
         * <p>The configurations of the trigger. The configurations vary based on trigger types.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;events&quot;: [
         *             &quot;oss:ObjectCreated:*&quot;
         *       ],
         *       &quot;filter&quot;: {
         *             &quot;key&quot;: {
         *                   &quot;prefix&quot;: &quot;/prefix&quot;,
         *                   &quot;suffix&quot;: &quot;.zip&quot;
         *             }
         *       }
         * }</p>
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>The unique ID of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>546959b5-ce1a-4991-8891-df7a02b25086</p>
         */
        public Builder triggerId(String triggerId) {
            this.triggerId = triggerId;
            return this;
        }

        /**
         * <p>The name of the trigger. The name contains only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or hyphen (-).</p>
         * 
         * <strong>example:</strong>
         * <p>defaultTrigger</p>
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>The type of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
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
