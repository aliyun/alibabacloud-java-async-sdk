// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetDeploymentResponseBody</p>
 */
public class GetDeploymentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Pipeline")
    private Pipeline pipeline;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDeploymentResponseBody(Builder builder) {
        this.pipeline = builder.pipeline;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeploymentResponseBody create() {
        return builder().build();
    }

    /**
     * @return pipeline
     */
    public Pipeline getPipeline() {
        return this.pipeline;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Pipeline pipeline; 
        private String requestId; 

        /**
         * Pipeline.
         */
        public Builder pipeline(Pipeline pipeline) {
            this.pipeline = pipeline;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDeploymentResponseBody build() {
            return new GetDeploymentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentResponseBody</p>
     */
    public static class Stages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private java.util.Map < String, ? > detail;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Step")
        private Integer step;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Stages(Builder builder) {
            this.code = builder.code;
            this.description = builder.description;
            this.detail = builder.detail;
            this.message = builder.message;
            this.name = builder.name;
            this.status = builder.status;
            this.step = builder.step;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stages create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return detail
         */
        public java.util.Map < String, ? > getDetail() {
            return this.detail;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return step
         */
        public Integer getStep() {
            return this.step;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String description; 
            private java.util.Map < String, ? > detail; 
            private String message; 
            private String name; 
            private String status; 
            private Integer step; 
            private String type; 

            /**
             * <p>阶段代号</p>
             * 
             * <strong>example:</strong>
             * <p>DEV_CHECK</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>阶段描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(java.util.Map < String, ? > detail) {
                this.detail = detail;
                return this;
            }

            /**
             * <p>阶段信息</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>阶段名称</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>阶段状态</p>
             * 
             * <strong>example:</strong>
             * <p>INIT</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>步骤</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder step(Integer step) {
                this.step = step;
                return this;
            }

            /**
             * <p>阶段类型</p>
             * 
             * <strong>example:</strong>
             * <p>BUILD</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Stages build() {
                return new Stages(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDeploymentResponseBody} extends {@link TeaModel}
     *
     * <p>GetDeploymentResponseBody</p>
     */
    public static class Pipeline extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Stages")
        private java.util.List < Stages> stages;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Pipeline(Builder builder) {
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.id = builder.id;
            this.message = builder.message;
            this.modifyTime = builder.modifyTime;
            this.projectId = builder.projectId;
            this.stages = builder.stages;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipeline create() {
            return builder().build();
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
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

        public static final class Builder {
            private Long createTime; 
            private String creator; 
            private String id; 
            private String message; 
            private Long modifyTime; 
            private String projectId; 
            private java.util.List < Stages> stages; 
            private String status; 

            /**
             * <p>发布包创建时间戳</p>
             * 
             * <strong>example:</strong>
             * <p>1724984066000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>创建人</p>
             * 
             * <strong>example:</strong>
             * <p>137946317766XXXX</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>发布流程Id</p>
             * 
             * <strong>example:</strong>
             * <p>a7ef0634-20ec-4a7c-a214-54020f91XXXX</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>阶段信息</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>修改时间</p>
             * 
             * <strong>example:</strong>
             * <p>1724984066000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>步骤详情</p>
             */
            public Builder stages(java.util.List < Stages> stages) {
                this.stages = stages;
                return this;
            }

            /**
             * <p>发布流程状态</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Pipeline build() {
                return new Pipeline(this);
            } 

        } 

    }
}
