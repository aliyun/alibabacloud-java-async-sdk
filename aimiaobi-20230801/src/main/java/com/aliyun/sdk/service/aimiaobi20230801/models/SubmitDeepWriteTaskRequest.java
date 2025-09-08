// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link SubmitDeepWriteTaskRequest} extends {@link RequestModel}
 *
 * <p>SubmitDeepWriteTaskRequest</p>
 */
public class SubmitDeepWriteTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AgentOrchestration")
    private AgentOrchestration agentOrchestration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Files")
    private java.util.List<Files> files;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private String input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instructions")
    private String instructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private SubmitDeepWriteTaskRequest(Builder builder) {
        super(builder);
        this.agentOrchestration = builder.agentOrchestration;
        this.files = builder.files;
        this.input = builder.input;
        this.instructions = builder.instructions;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDeepWriteTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentOrchestration
     */
    public AgentOrchestration getAgentOrchestration() {
        return this.agentOrchestration;
    }

    /**
     * @return files
     */
    public java.util.List<Files> getFiles() {
        return this.files;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return instructions
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<SubmitDeepWriteTaskRequest, Builder> {
        private AgentOrchestration agentOrchestration; 
        private java.util.List<Files> files; 
        private String input; 
        private String instructions; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDeepWriteTaskRequest request) {
            super(request);
            this.agentOrchestration = request.agentOrchestration;
            this.files = request.files;
            this.input = request.input;
            this.instructions = request.instructions;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * AgentOrchestration.
         */
        public Builder agentOrchestration(AgentOrchestration agentOrchestration) {
            String agentOrchestrationShrink = shrink(agentOrchestration, "AgentOrchestration", "json");
            this.putQueryParameter("AgentOrchestration", agentOrchestrationShrink);
            this.agentOrchestration = agentOrchestration;
            return this;
        }

        /**
         * Files.
         */
        public Builder files(java.util.List<Files> files) {
            String filesShrink = shrink(files, "Files", "json");
            this.putBodyParameter("Files", filesShrink);
            this.files = files;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder input(String input) {
            this.putBodyParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * Instructions.
         */
        public Builder instructions(String instructions) {
            this.putBodyParameter("Instructions", instructions);
            this.instructions = instructions;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public SubmitDeepWriteTaskRequest build() {
            return new SubmitDeepWriteTaskRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitDeepWriteTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDeepWriteTaskRequest</p>
     */
    public static class DataAnalystAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableSearch")
        private Boolean enableSearch;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataAnalystAgent(Builder builder) {
            this.enableSearch = builder.enableSearch;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataAnalystAgent create() {
            return builder().build();
        }

        /**
         * @return enableSearch
         */
        public Boolean getEnableSearch() {
            return this.enableSearch;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean enableSearch; 
            private String name; 

            private Builder() {
            } 

            private Builder(DataAnalystAgent model) {
                this.enableSearch = model.enableSearch;
                this.name = model.name;
            } 

            /**
             * EnableSearch.
             */
            public Builder enableSearch(Boolean enableSearch) {
                this.enableSearch = enableSearch;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataAnalystAgent build() {
                return new DataAnalystAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDeepWriteTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDeepWriteTaskRequest</p>
     */
    public static class DataCollectorAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private DataCollectorAgent(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataCollectorAgent create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            private Builder() {
            } 

            private Builder(DataCollectorAgent model) {
                this.name = model.name;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public DataCollectorAgent build() {
                return new DataCollectorAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDeepWriteTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDeepWriteTaskRequest</p>
     */
    public static class ReporterAgent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnableCitation")
        private Boolean enableCitation;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ReporterAgent(Builder builder) {
            this.enableCitation = builder.enableCitation;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReporterAgent create() {
            return builder().build();
        }

        /**
         * @return enableCitation
         */
        public Boolean getEnableCitation() {
            return this.enableCitation;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean enableCitation; 
            private String name; 

            private Builder() {
            } 

            private Builder(ReporterAgent model) {
                this.enableCitation = model.enableCitation;
                this.name = model.name;
            } 

            /**
             * EnableCitation.
             */
            public Builder enableCitation(Boolean enableCitation) {
                this.enableCitation = enableCitation;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ReporterAgent build() {
                return new ReporterAgent(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDeepWriteTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDeepWriteTaskRequest</p>
     */
    public static class AgentOrchestration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataAnalystAgent")
        private DataAnalystAgent dataAnalystAgent;

        @com.aliyun.core.annotation.NameInMap("DataCollectorAgent")
        private DataCollectorAgent dataCollectorAgent;

        @com.aliyun.core.annotation.NameInMap("ReporterAgent")
        private ReporterAgent reporterAgent;

        private AgentOrchestration(Builder builder) {
            this.dataAnalystAgent = builder.dataAnalystAgent;
            this.dataCollectorAgent = builder.dataCollectorAgent;
            this.reporterAgent = builder.reporterAgent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AgentOrchestration create() {
            return builder().build();
        }

        /**
         * @return dataAnalystAgent
         */
        public DataAnalystAgent getDataAnalystAgent() {
            return this.dataAnalystAgent;
        }

        /**
         * @return dataCollectorAgent
         */
        public DataCollectorAgent getDataCollectorAgent() {
            return this.dataCollectorAgent;
        }

        /**
         * @return reporterAgent
         */
        public ReporterAgent getReporterAgent() {
            return this.reporterAgent;
        }

        public static final class Builder {
            private DataAnalystAgent dataAnalystAgent; 
            private DataCollectorAgent dataCollectorAgent; 
            private ReporterAgent reporterAgent; 

            private Builder() {
            } 

            private Builder(AgentOrchestration model) {
                this.dataAnalystAgent = model.dataAnalystAgent;
                this.dataCollectorAgent = model.dataCollectorAgent;
                this.reporterAgent = model.reporterAgent;
            } 

            /**
             * DataAnalystAgent.
             */
            public Builder dataAnalystAgent(DataAnalystAgent dataAnalystAgent) {
                this.dataAnalystAgent = dataAnalystAgent;
                return this;
            }

            /**
             * DataCollectorAgent.
             */
            public Builder dataCollectorAgent(DataCollectorAgent dataCollectorAgent) {
                this.dataCollectorAgent = dataCollectorAgent;
                return this;
            }

            /**
             * ReporterAgent.
             */
            public Builder reporterAgent(ReporterAgent reporterAgent) {
                this.reporterAgent = reporterAgent;
                return this;
            }

            public AgentOrchestration build() {
                return new AgentOrchestration(this);
            } 

        } 

    }
    /**
     * 
     * {@link SubmitDeepWriteTaskRequest} extends {@link TeaModel}
     *
     * <p>SubmitDeepWriteTaskRequest</p>
     */
    public static class Files extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileDescription")
        @com.aliyun.core.annotation.Validation(maxLength = 500)
        private String fileDescription;

        @com.aliyun.core.annotation.NameInMap("FileKey")
        @com.aliyun.core.annotation.Validation(maxLength = 500)
        private String fileKey;

        @com.aliyun.core.annotation.NameInMap("FileName")
        @com.aliyun.core.annotation.Validation(maxLength = 200)
        private String fileName;

        private Files(Builder builder) {
            this.fileDescription = builder.fileDescription;
            this.fileKey = builder.fileKey;
            this.fileName = builder.fileName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Files create() {
            return builder().build();
        }

        /**
         * @return fileDescription
         */
        public String getFileDescription() {
            return this.fileDescription;
        }

        /**
         * @return fileKey
         */
        public String getFileKey() {
            return this.fileKey;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        public static final class Builder {
            private String fileDescription; 
            private String fileKey; 
            private String fileName; 

            private Builder() {
            } 

            private Builder(Files model) {
                this.fileDescription = model.fileDescription;
                this.fileKey = model.fileKey;
                this.fileName = model.fileName;
            } 

            /**
             * FileDescription.
             */
            public Builder fileDescription(String fileDescription) {
                this.fileDescription = fileDescription;
                return this;
            }

            /**
             * FileKey.
             */
            public Builder fileKey(String fileKey) {
                this.fileKey = fileKey;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            public Files build() {
                return new Files(this);
            } 

        } 

    }
}
