// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    private String serviceName;

    @Path
    @NameInMap("functionName")
    private String functionName;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("invocationRole")
    private String invocationRole;

    @Body
    @NameInMap("qualifier")
    private String qualifier;

    @Body
    @NameInMap("sourceArn")
    private String sourceArn;

    @Body
    @NameInMap("triggerConfig")
    private String triggerConfig;

    @Body
    @NameInMap("triggerName")
    private String triggerName;

    @Body
    @NameInMap("triggerType")
    private String triggerType;


    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerRequest create() {
        return builder().build();
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
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
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
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

    public static final class Builder extends Request.Builder {
        private String serviceName; 
        private String functionName; 
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerName; 
        private String triggerType; 

        /**
         * <p>service名称</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>function名称</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>description.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>event source，如OSS，使用该role去invoke function</p>
         */
        public Builder invocationRole(String invocationRole) {
            this.putBodyParameter("invocationRole", invocationRole);
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * <p>service版本</p>
         */
        public Builder qualifier(String qualifier) {
            this.putBodyParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>event source的Aliyun Resource Name（ARN</p>
         */
        public Builder sourceArn(String sourceArn) {
            this.putBodyParameter("sourceArn", sourceArn);
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * <p>trigger配置，针对不同的trigger类型，trigger配置会有所不同</p>
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putBodyParameter("triggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>trigger名称</p>
         */
        public Builder triggerName(String triggerName) {
            this.putBodyParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic</p>
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("triggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

}
