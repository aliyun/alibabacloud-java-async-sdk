// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @Path
    @NameInMap("serviceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

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
    @Validation(required = true)
    private String triggerConfig;

    @Body
    @NameInMap("triggerName")
    @Validation(required = true)
    private String triggerName;

    @Body
    @NameInMap("triggerType")
    @Validation(required = true)
    private String triggerType;

    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
        this.functionName = builder.functionName;
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
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

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
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

    public static final class Builder extends Request.Builder<CreateTriggerRequest, Builder> {
        private String serviceName; 
        private String functionName; 
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerName; 
        private String triggerType; 

        private Builder() {
            super();
        } 

        private Builder(CreateTriggerRequest response) {
            super(response);
            this.serviceName = response.serviceName;
            this.functionName = response.functionName;
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcTraceId = response.xFcTraceId;
            this.description = response.description;
            this.invocationRole = response.invocationRole;
            this.qualifier = response.qualifier;
            this.sourceArn = response.sourceArn;
            this.triggerConfig = response.triggerConfig;
            this.triggerName = response.triggerName;
            this.triggerType = response.triggerType;
        } 

        /**
         * service名称
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("serviceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * function名称
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * event source，如OSS，使用该role去invoke function
         */
        public Builder invocationRole(String invocationRole) {
            this.putBodyParameter("invocationRole", invocationRole);
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * service版本
         */
        public Builder qualifier(String qualifier) {
            this.putBodyParameter("qualifier", qualifier);
            this.qualifier = qualifier;
            return this;
        }

        /**
         * event source的Aliyun Resource Name（ARN
         */
        public Builder sourceArn(String sourceArn) {
            this.putBodyParameter("sourceArn", sourceArn);
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * trigger配置，针对不同的trigger类型，trigger配置会有所不同
         */
        public Builder triggerConfig(String triggerConfig) {
            this.putBodyParameter("triggerConfig", triggerConfig);
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * trigger名称
         */
        public Builder triggerName(String triggerName) {
            this.putBodyParameter("triggerName", triggerName);
            this.triggerName = triggerName;
            return this;
        }

        /**
         * trigger类型，如 oss, log, tablestore, timer, http, cdn_events, mns_topic
         */
        public Builder triggerType(String triggerType) {
            this.putBodyParameter("triggerType", triggerType);
            this.triggerType = triggerType;
            return this;
        }

        @Override
        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

}
