// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateWorkFlowByJsonRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkFlowByJsonRequest</p>
 */
public class CreateWorkFlowByJsonRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Context")
    @com.aliyun.core.annotation.Validation(required = true)
    private Context context;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateWorkFlowByJsonRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.context = builder.context;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkFlowByJsonRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return context
     */
    public Context getContext() {
        return this.context;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreateWorkFlowByJsonRequest, Builder> {
        private String regionId; 
        private Context context; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkFlowByJsonRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.context = request.context;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder context(Context context) {
            String contextShrink = shrink(context, "Context", "json");
            this.putBodyParameter("Context", contextShrink);
            this.context = context;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateWorkFlowByJsonRequest build() {
            return new CreateWorkFlowByJsonRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateWorkFlowByJsonRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkFlowByJsonRequest</p>
     */
    public static class Context extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        private Context(Builder builder) {
            this.env = builder.env;
            this.projectId = builder.projectId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Context create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        public static final class Builder {
            private String env; 
            private Long projectId; 

            private Builder() {
            } 

            private Builder(Context model) {
                this.env = model.env;
                this.projectId = model.projectId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PROD</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>789</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            public Context build() {
                return new Context(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateWorkFlowByJsonRequest} extends {@link TeaModel}
     *
     * <p>CreateWorkFlowByJsonRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Directory")
        private String directory;

        @com.aliyun.core.annotation.NameInMap("ScheduleConfig")
        private String scheduleConfig;

        @com.aliyun.core.annotation.NameInMap("Submit")
        private Boolean submit;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer taskType;

        @com.aliyun.core.annotation.NameInMap("WorkFlowJson")
        @com.aliyun.core.annotation.Validation(required = true)
        private String workFlowJson;

        private CreateCommand(Builder builder) {
            this.description = builder.description;
            this.directory = builder.directory;
            this.scheduleConfig = builder.scheduleConfig;
            this.submit = builder.submit;
            this.taskName = builder.taskName;
            this.taskType = builder.taskType;
            this.workFlowJson = builder.workFlowJson;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return directory
         */
        public String getDirectory() {
            return this.directory;
        }

        /**
         * @return scheduleConfig
         */
        public String getScheduleConfig() {
            return this.scheduleConfig;
        }

        /**
         * @return submit
         */
        public Boolean getSubmit() {
            return this.submit;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskType
         */
        public Integer getTaskType() {
            return this.taskType;
        }

        /**
         * @return workFlowJson
         */
        public String getWorkFlowJson() {
            return this.workFlowJson;
        }

        public static final class Builder {
            private String description; 
            private String directory; 
            private String scheduleConfig; 
            private Boolean submit; 
            private String taskName; 
            private Integer taskType; 
            private String workFlowJson; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.description = model.description;
                this.directory = model.directory;
                this.scheduleConfig = model.scheduleConfig;
                this.submit = model.submit;
                this.taskName = model.taskName;
                this.taskType = model.taskType;
                this.workFlowJson = model.workFlowJson;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Directory.
             */
            public Builder directory(String directory) {
                this.directory = directory;
                return this;
            }

            /**
             * ScheduleConfig.
             */
            public Builder scheduleConfig(String scheduleConfig) {
                this.scheduleConfig = scheduleConfig;
                return this;
            }

            /**
             * Submit.
             */
            public Builder submit(Boolean submit) {
                this.submit = submit;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>workflow_name</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>5372881</p>
             */
            public Builder taskType(Integer taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;pipelineDTO&quot;:{&quot;hops&quot;:[],&quot;steps&quot;:[{&quot;name&quot;:&quot;xxx&quot;,&quot;x&quot;:305,&quot;y&quot;:144,&quot;id&quot;:&quot;c404a7c6-8a75-4ed8-b348-0785423ad859&quot;,&quot;webConfig&quot;:{},&quot;type&quot;:&quot;text&quot;,&quot;key&quot;:&quot;special_character_removal&quot;,&quot;pluginConfig&quot;:{&quot;neuronParameters&quot;:{},&quot;neuronInput&quot;:{},&quot;neuronOutput&quot;:{},&quot;setting&quot;:{}}}]}}</p>
             */
            public Builder workFlowJson(String workFlowJson) {
                this.workFlowJson = workFlowJson;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
