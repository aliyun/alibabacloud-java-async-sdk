// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTaskDetail} extends {@link TeaModel}
 *
 * <p>CreateTaskDetail</p>
 */
public class CreateTaskDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Admins")
    private Admins admins;

    @com.aliyun.core.annotation.NameInMap("AllowAppendData")
    private Boolean allowAppendData;

    @com.aliyun.core.annotation.NameInMap("AssignConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private TaskAssginConfig assignConfig;

    @com.aliyun.core.annotation.NameInMap("DatasetProxyRelations")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DatasetProxyConfig > datasetProxyRelations;

    @com.aliyun.core.annotation.NameInMap("Exif")
    private java.util.Map < String, ? > exif;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < String > tags;

    @com.aliyun.core.annotation.NameInMap("TaskName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskName;

    @com.aliyun.core.annotation.NameInMap("TaskTemplateConfig")
    private TaskTemplateConfig taskTemplateConfig;

    @com.aliyun.core.annotation.NameInMap("TaskWorkflow")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < TaskWorkflow> taskWorkflow;

    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    @com.aliyun.core.annotation.NameInMap("UUID")
    @com.aliyun.core.annotation.Validation(required = true)
    private String UUID;

    @com.aliyun.core.annotation.NameInMap("VoteConfigs")
    private java.util.Map < String, CreateTaskDetailVoteInfo > voteConfigs;

    private CreateTaskDetail(Builder builder) {
        this.admins = builder.admins;
        this.allowAppendData = builder.allowAppendData;
        this.assignConfig = builder.assignConfig;
        this.datasetProxyRelations = builder.datasetProxyRelations;
        this.exif = builder.exif;
        this.tags = builder.tags;
        this.taskName = builder.taskName;
        this.taskTemplateConfig = builder.taskTemplateConfig;
        this.taskWorkflow = builder.taskWorkflow;
        this.templateId = builder.templateId;
        this.UUID = builder.UUID;
        this.voteConfigs = builder.voteConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTaskDetail create() {
        return builder().build();
    }

    /**
     * @return admins
     */
    public Admins getAdmins() {
        return this.admins;
    }

    /**
     * @return allowAppendData
     */
    public Boolean getAllowAppendData() {
        return this.allowAppendData;
    }

    /**
     * @return assignConfig
     */
    public TaskAssginConfig getAssignConfig() {
        return this.assignConfig;
    }

    /**
     * @return datasetProxyRelations
     */
    public java.util.List < DatasetProxyConfig > getDatasetProxyRelations() {
        return this.datasetProxyRelations;
    }

    /**
     * @return exif
     */
    public java.util.Map < String, ? > getExif() {
        return this.exif;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return taskTemplateConfig
     */
    public TaskTemplateConfig getTaskTemplateConfig() {
        return this.taskTemplateConfig;
    }

    /**
     * @return taskWorkflow
     */
    public java.util.List < TaskWorkflow> getTaskWorkflow() {
        return this.taskWorkflow;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return UUID
     */
    public String getUUID() {
        return this.UUID;
    }

    /**
     * @return voteConfigs
     */
    public java.util.Map < String, CreateTaskDetailVoteInfo > getVoteConfigs() {
        return this.voteConfigs;
    }

    public static final class Builder {
        private Admins admins; 
        private Boolean allowAppendData; 
        private TaskAssginConfig assignConfig; 
        private java.util.List < DatasetProxyConfig > datasetProxyRelations; 
        private java.util.Map < String, ? > exif; 
        private java.util.List < String > tags; 
        private String taskName; 
        private TaskTemplateConfig taskTemplateConfig; 
        private java.util.List < TaskWorkflow> taskWorkflow; 
        private String templateId; 
        private String UUID; 
        private java.util.Map < String, CreateTaskDetailVoteInfo > voteConfigs; 

        /**
         * Admins.
         */
        public Builder admins(Admins admins) {
            this.admins = admins;
            return this;
        }

        /**
         * AllowAppendData.
         */
        public Builder allowAppendData(Boolean allowAppendData) {
            this.allowAppendData = allowAppendData;
            return this;
        }

        /**
         * AssignConfig.
         */
        public Builder assignConfig(TaskAssginConfig assignConfig) {
            this.assignConfig = assignConfig;
            return this;
        }

        /**
         * DatasetProxyRelations.
         */
        public Builder datasetProxyRelations(java.util.List < DatasetProxyConfig > datasetProxyRelations) {
            this.datasetProxyRelations = datasetProxyRelations;
            return this;
        }

        /**
         * Exif.
         */
        public Builder exif(java.util.Map < String, ? > exif) {
            this.exif = exif;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.tags = tags;
            return this;
        }

        /**
         * TaskName.
         */
        public Builder taskName(String taskName) {
            this.taskName = taskName;
            return this;
        }

        /**
         * TaskTemplateConfig.
         */
        public Builder taskTemplateConfig(TaskTemplateConfig taskTemplateConfig) {
            this.taskTemplateConfig = taskTemplateConfig;
            return this;
        }

        /**
         * TaskWorkflow.
         */
        public Builder taskWorkflow(java.util.List < TaskWorkflow> taskWorkflow) {
            this.taskWorkflow = taskWorkflow;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.templateId = templateId;
            return this;
        }

        /**
         * UUID.
         */
        public Builder UUID(String UUID) {
            this.UUID = UUID;
            return this;
        }

        /**
         * VoteConfigs.
         */
        public Builder voteConfigs(java.util.Map < String, CreateTaskDetailVoteInfo > voteConfigs) {
            this.voteConfigs = voteConfigs;
            return this;
        }

        public CreateTaskDetail build() {
            return new CreateTaskDetail(this);
        } 

    } 

    public static class Admins extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Users")
        private java.util.List < SimpleUser > users;

        private Admins(Builder builder) {
            this.users = builder.users;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Admins create() {
            return builder().build();
        }

        /**
         * @return users
         */
        public java.util.List < SimpleUser > getUsers() {
            return this.users;
        }

        public static final class Builder {
            private java.util.List < SimpleUser > users; 

            /**
             * Users.
             */
            public Builder users(java.util.List < SimpleUser > users) {
                this.users = users;
                return this;
            }

            public Admins build() {
                return new Admins(this);
            } 

        } 

    }
    public static class TaskWorkflow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private TaskWorkflow(Builder builder) {
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TaskWorkflow create() {
            return builder().build();
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        public static final class Builder {
            private String nodeName; 

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public TaskWorkflow build() {
                return new TaskWorkflow(this);
            } 

        } 

    }
}
