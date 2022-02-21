// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDeployedAlgorithmModelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeployedAlgorithmModelsResponseBody</p>
 */
public class ListDeployedAlgorithmModelsResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    @NameInMap("result")
    private java.util.List < Result> result;

    private ListDeployedAlgorithmModelsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeployedAlgorithmModelsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListDeployedAlgorithmModelsResponseBody build() {
            return new ListDeployedAlgorithmModelsResponseBody(this);
        } 

    } 

    public static class Models extends TeaModel {
        @NameInMap("algorithmType")
        private String algorithmType;

        @NameInMap("modelId")
        private Integer modelId;

        @NameInMap("modelName")
        private String modelName;

        @NameInMap("progress")
        private Integer progress;

        @NameInMap("projectId")
        private Integer projectId;

        @NameInMap("status")
        private String status;

        private Models(Builder builder) {
            this.algorithmType = builder.algorithmType;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.progress = builder.progress;
            this.projectId = builder.projectId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return algorithmType
         */
        public String getAlgorithmType() {
            return this.algorithmType;
        }

        /**
         * @return modelId
         */
        public Integer getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return projectId
         */
        public Integer getProjectId() {
            return this.projectId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String algorithmType; 
            private Integer modelId; 
            private String modelName; 
            private Integer progress; 
            private Integer projectId; 
            private String status; 

            /**
             * algorithmType.
             */
            public Builder algorithmType(String algorithmType) {
                this.algorithmType = algorithmType;
                return this;
            }

            /**
             * modelId.
             */
            public Builder modelId(Integer modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * modelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * progress.
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * projectId.
             */
            public Builder projectId(Integer projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("appGroupName")
        private String appGroupName;

        @NameInMap("apps")
        private java.util.List < String > apps;

        @NameInMap("desc")
        private String desc;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("id")
        private String id;

        @NameInMap("models")
        private java.util.List < Models> models;

        @NameInMap("scene")
        private String scene;

        @NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.appGroupName = builder.appGroupName;
            this.apps = builder.apps;
            this.desc = builder.desc;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.models = builder.models;
            this.scene = builder.scene;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return appGroupName
         */
        public String getAppGroupName() {
            return this.appGroupName;
        }

        /**
         * @return apps
         */
        public java.util.List < String > getApps() {
            return this.apps;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return models
         */
        public java.util.List < Models> getModels() {
            return this.models;
        }

        /**
         * @return scene
         */
        public String getScene() {
            return this.scene;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String appGroupName; 
            private java.util.List < String > apps; 
            private String desc; 
            private String gmtCreate; 
            private String gmtModified; 
            private String id; 
            private java.util.List < Models> models; 
            private String scene; 
            private String status; 

            /**
             * appGroupName.
             */
            public Builder appGroupName(String appGroupName) {
                this.appGroupName = appGroupName;
                return this;
            }

            /**
             * apps.
             */
            public Builder apps(java.util.List < String > apps) {
                this.apps = apps;
                return this;
            }

            /**
             * desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * models.
             */
            public Builder models(java.util.List < Models> models) {
                this.models = models;
                return this;
            }

            /**
             * scene.
             */
            public Builder scene(String scene) {
                this.scene = scene;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
