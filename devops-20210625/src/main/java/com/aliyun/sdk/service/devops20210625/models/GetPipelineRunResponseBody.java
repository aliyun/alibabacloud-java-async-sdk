// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPipelineRunResponseBody} extends {@link TeaModel}
 *
 * <p>GetPipelineRunResponseBody</p>
 */
public class GetPipelineRunResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMessage")
    private String errorMessage;

    @NameInMap("pipelineRun")
    private PipelineRun pipelineRun;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetPipelineRunResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.pipelineRun = builder.pipelineRun;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPipelineRunResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return pipelineRun
     */
    public PipelineRun getPipelineRun() {
        return this.pipelineRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private PipelineRun pipelineRun; 
        private String requestId; 
        private Boolean success; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * pipelineRun.
         */
        public Builder pipelineRun(PipelineRun pipelineRun) {
            this.pipelineRun = pipelineRun;
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
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPipelineRunResponseBody build() {
            return new GetPipelineRunResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("branch")
        private String branch;

        @NameInMap("commint")
        private String commint;

        @NameInMap("repo")
        private String repo;

        private Data(Builder builder) {
            this.branch = builder.branch;
            this.commint = builder.commint;
            this.repo = builder.repo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return branch
         */
        public String getBranch() {
            return this.branch;
        }

        /**
         * @return commint
         */
        public String getCommint() {
            return this.commint;
        }

        /**
         * @return repo
         */
        public String getRepo() {
            return this.repo;
        }

        public static final class Builder {
            private String branch; 
            private String commint; 
            private String repo; 

            /**
             * branch.
             */
            public Builder branch(String branch) {
                this.branch = branch;
                return this;
            }

            /**
             * commint.
             */
            public Builder commint(String commint) {
                this.commint = commint;
                return this;
            }

            /**
             * repo.
             */
            public Builder repo(String repo) {
                this.repo = repo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class Sources extends TeaModel {
        @NameInMap("data")
        private Data data;

        @NameInMap("sign")
        private String sign;

        @NameInMap("type")
        private String type;

        private Sources(Builder builder) {
            this.data = builder.data;
            this.sign = builder.sign;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sources create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Data getData() {
            return this.data;
        }

        /**
         * @return sign
         */
        public String getSign() {
            return this.sign;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Data data; 
            private String sign; 
            private String type; 

            /**
             * data.
             */
            public Builder data(Data data) {
                this.data = data;
                return this;
            }

            /**
             * sign.
             */
            public Builder sign(String sign) {
                this.sign = sign;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Sources build() {
                return new Sources(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @NameInMap("disable")
        private Boolean disable;

        @NameInMap("params")
        private java.util.Map < String, ? > params;

        @NameInMap("type")
        private String type;

        private Actions(Builder builder) {
            this.disable = builder.disable;
            this.params = builder.params;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return disable
         */
        public Boolean getDisable() {
            return this.disable;
        }

        /**
         * @return params
         */
        public java.util.Map < String, ? > getParams() {
            return this.params;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Boolean disable; 
            private java.util.Map < String, ? > params; 
            private String type; 

            /**
             * disable.
             */
            public Builder disable(Boolean disable) {
                this.disable = disable;
                return this;
            }

            /**
             * params.
             */
            public Builder params(java.util.Map < String, ? > params) {
                this.params = params;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class Jobs extends TeaModel {
        @NameInMap("actions")
        private java.util.List < Actions> actions;

        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("id")
        private Long id;

        @NameInMap("name")
        private String name;

        @NameInMap("params")
        private String params;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("status")
        private String status;

        private Jobs(Builder builder) {
            this.actions = builder.actions;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.name = builder.name;
            this.params = builder.params;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Jobs create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return params
         */
        public String getParams() {
            return this.params;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private Long endTime; 
            private Long id; 
            private String name; 
            private String params; 
            private Long startTime; 
            private String status; 

            /**
             * actions.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * params.
             */
            public Builder params(String params) {
                this.params = params;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Jobs build() {
                return new Jobs(this);
            } 

        } 

    }
    public static class StageInfo extends TeaModel {
        @NameInMap("endTime")
        private Long endTime;

        @NameInMap("jobs")
        private java.util.List < Jobs> jobs;

        @NameInMap("name")
        private String name;

        @NameInMap("startTime")
        private Long startTime;

        @NameInMap("status")
        private String status;

        private StageInfo(Builder builder) {
            this.endTime = builder.endTime;
            this.jobs = builder.jobs;
            this.name = builder.name;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StageInfo create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return jobs
         */
        public java.util.List < Jobs> getJobs() {
            return this.jobs;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long endTime; 
            private java.util.List < Jobs> jobs; 
            private String name; 
            private Long startTime; 
            private String status; 

            /**
             * endTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * jobs.
             */
            public Builder jobs(java.util.List < Jobs> jobs) {
                this.jobs = jobs;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public StageInfo build() {
                return new StageInfo(this);
            } 

        } 

    }
    public static class Stages extends TeaModel {
        @NameInMap("name")
        private String name;

        @NameInMap("stageInfo")
        private StageInfo stageInfo;

        private Stages(Builder builder) {
            this.name = builder.name;
            this.stageInfo = builder.stageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stages create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return stageInfo
         */
        public StageInfo getStageInfo() {
            return this.stageInfo;
        }

        public static final class Builder {
            private String name; 
            private StageInfo stageInfo; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * stageInfo.
             */
            public Builder stageInfo(StageInfo stageInfo) {
                this.stageInfo = stageInfo;
                return this;
            }

            public Stages build() {
                return new Stages(this);
            } 

        } 

    }
    public static class PipelineRun extends TeaModel {
        @NameInMap("createTime")
        private Long createTime;

        @NameInMap("creatorAccountId")
        private String creatorAccountId;

        @NameInMap("modifierAccountId")
        private String modifierAccountId;

        @NameInMap("pipelineId")
        private Long pipelineId;

        @NameInMap("pipelineRunId")
        private Long pipelineRunId;

        @NameInMap("sources")
        private java.util.List < Sources> sources;

        @NameInMap("stageGroup")
        private java.util.List < java.util.List < String > > stageGroup;

        @NameInMap("stages")
        private java.util.List < Stages> stages;

        @NameInMap("status")
        private String status;

        @NameInMap("triggerMode")
        private Integer triggerMode;

        @NameInMap("updateTime")
        private Long updateTime;

        private PipelineRun(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.modifierAccountId = builder.modifierAccountId;
            this.pipelineId = builder.pipelineId;
            this.pipelineRunId = builder.pipelineRunId;
            this.sources = builder.sources;
            this.stageGroup = builder.stageGroup;
            this.stages = builder.stages;
            this.status = builder.status;
            this.triggerMode = builder.triggerMode;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PipelineRun create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return modifierAccountId
         */
        public String getModifierAccountId() {
            return this.modifierAccountId;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineRunId
         */
        public Long getPipelineRunId() {
            return this.pipelineRunId;
        }

        /**
         * @return sources
         */
        public java.util.List < Sources> getSources() {
            return this.sources;
        }

        /**
         * @return stageGroup
         */
        public java.util.List < java.util.List < String > > getStageGroup() {
            return this.stageGroup;
        }

        /**
         * @return stages
         */
        public java.util.List < Stages> getStages() {
            return this.stages;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return triggerMode
         */
        public Integer getTriggerMode() {
            return this.triggerMode;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorAccountId; 
            private String modifierAccountId; 
            private Long pipelineId; 
            private Long pipelineRunId; 
            private java.util.List < Sources> sources; 
            private java.util.List < java.util.List < String > > stageGroup; 
            private java.util.List < Stages> stages; 
            private String status; 
            private Integer triggerMode; 
            private Long updateTime; 

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * modifierAccountId.
             */
            public Builder modifierAccountId(String modifierAccountId) {
                this.modifierAccountId = modifierAccountId;
                return this;
            }

            /**
             * pipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * pipelineRunId.
             */
            public Builder pipelineRunId(Long pipelineRunId) {
                this.pipelineRunId = pipelineRunId;
                return this;
            }

            /**
             * sources.
             */
            public Builder sources(java.util.List < Sources> sources) {
                this.sources = sources;
                return this;
            }

            /**
             * stageGroup.
             */
            public Builder stageGroup(java.util.List < java.util.List < String > > stageGroup) {
                this.stageGroup = stageGroup;
                return this;
            }

            /**
             * stages.
             */
            public Builder stages(java.util.List < Stages> stages) {
                this.stages = stages;
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
             * triggerMode.
             */
            public Builder triggerMode(Integer triggerMode) {
                this.triggerMode = triggerMode;
                return this;
            }

            /**
             * updateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public PipelineRun build() {
                return new PipelineRun(this);
            } 

        } 

    }
}
