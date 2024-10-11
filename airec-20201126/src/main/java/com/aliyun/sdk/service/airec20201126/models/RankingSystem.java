// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RankingSystem} extends {@link TeaModel}
 *
 * <p>RankingSystem</p>
 */
public class RankingSystem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyStatus")
    private String applyStatus;

    @com.aliyun.core.annotation.NameInMap("DeployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("ModelTemplateId")
    private String modelTemplateId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("SceneIdList")
    private java.util.List < Long > sceneIdList;

    private RankingSystem(Builder builder) {
        this.applyStatus = builder.applyStatus;
        this.deployStatus = builder.deployStatus;
        this.meta = builder.meta;
        this.modelTemplateId = builder.modelTemplateId;
        this.name = builder.name;
        this.sceneIdList = builder.sceneIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RankingSystem create() {
        return builder().build();
    }

    /**
     * @return applyStatus
     */
    public String getApplyStatus() {
        return this.applyStatus;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return modelTemplateId
     */
    public String getModelTemplateId() {
        return this.modelTemplateId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return sceneIdList
     */
    public java.util.List < Long > getSceneIdList() {
        return this.sceneIdList;
    }

    public static final class Builder {
        private String applyStatus; 
        private String deployStatus; 
        private Meta meta; 
        private String modelTemplateId; 
        private String name; 
        private java.util.List < Long > sceneIdList; 

        /**
         * ApplyStatus.
         */
        public Builder applyStatus(String applyStatus) {
            this.applyStatus = applyStatus;
            return this;
        }

        /**
         * DeployStatus.
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * Meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
            return this;
        }

        /**
         * ModelTemplateId.
         */
        public Builder modelTemplateId(String modelTemplateId) {
            this.modelTemplateId = modelTemplateId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * SceneIdList.
         */
        public Builder sceneIdList(java.util.List < Long > sceneIdList) {
            this.sceneIdList = sceneIdList;
            return this;
        }

        public RankingSystem build() {
            return new RankingSystem(this);
        } 

    } 

    /**
     * 
     * {@link RankingSystem} extends {@link TeaModel}
     *
     * <p>RankingSystem</p>
     */
    public static class PredictEngine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PredictEngine(Builder builder) {
            this.clusterId = builder.clusterId;
            this.resourceId = builder.resourceId;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PredictEngine create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String clusterId; 
            private String resourceId; 
            private String version; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PredictEngine build() {
                return new PredictEngine(this);
            } 

        } 

    }
    /**
     * 
     * {@link RankingSystem} extends {@link TeaModel}
     *
     * <p>RankingSystem</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDeploy")
        private Boolean autoDeploy;

        @com.aliyun.core.annotation.NameInMap("AutoDeployAuc")
        private String autoDeployAuc;

        @com.aliyun.core.annotation.NameInMap("Conf")
        private String conf;

        @com.aliyun.core.annotation.NameInMap("FailMsg")
        private String failMsg;

        @com.aliyun.core.annotation.NameInMap("ModelVersionName")
        private String modelVersionName;

        @com.aliyun.core.annotation.NameInMap("PredictEngine")
        private PredictEngine predictEngine;

        @com.aliyun.core.annotation.NameInMap("PredictEngineType")
        private String predictEngineType;

        private Meta(Builder builder) {
            this.autoDeploy = builder.autoDeploy;
            this.autoDeployAuc = builder.autoDeployAuc;
            this.conf = builder.conf;
            this.failMsg = builder.failMsg;
            this.modelVersionName = builder.modelVersionName;
            this.predictEngine = builder.predictEngine;
            this.predictEngineType = builder.predictEngineType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Meta create() {
            return builder().build();
        }

        /**
         * @return autoDeploy
         */
        public Boolean getAutoDeploy() {
            return this.autoDeploy;
        }

        /**
         * @return autoDeployAuc
         */
        public String getAutoDeployAuc() {
            return this.autoDeployAuc;
        }

        /**
         * @return conf
         */
        public String getConf() {
            return this.conf;
        }

        /**
         * @return failMsg
         */
        public String getFailMsg() {
            return this.failMsg;
        }

        /**
         * @return modelVersionName
         */
        public String getModelVersionName() {
            return this.modelVersionName;
        }

        /**
         * @return predictEngine
         */
        public PredictEngine getPredictEngine() {
            return this.predictEngine;
        }

        /**
         * @return predictEngineType
         */
        public String getPredictEngineType() {
            return this.predictEngineType;
        }

        public static final class Builder {
            private Boolean autoDeploy; 
            private String autoDeployAuc; 
            private String conf; 
            private String failMsg; 
            private String modelVersionName; 
            private PredictEngine predictEngine; 
            private String predictEngineType; 

            /**
             * AutoDeploy.
             */
            public Builder autoDeploy(Boolean autoDeploy) {
                this.autoDeploy = autoDeploy;
                return this;
            }

            /**
             * AutoDeployAuc.
             */
            public Builder autoDeployAuc(String autoDeployAuc) {
                this.autoDeployAuc = autoDeployAuc;
                return this;
            }

            /**
             * Conf.
             */
            public Builder conf(String conf) {
                this.conf = conf;
                return this;
            }

            /**
             * FailMsg.
             */
            public Builder failMsg(String failMsg) {
                this.failMsg = failMsg;
                return this;
            }

            /**
             * ModelVersionName.
             */
            public Builder modelVersionName(String modelVersionName) {
                this.modelVersionName = modelVersionName;
                return this;
            }

            /**
             * PredictEngine.
             */
            public Builder predictEngine(PredictEngine predictEngine) {
                this.predictEngine = predictEngine;
                return this;
            }

            /**
             * PredictEngineType.
             */
            public Builder predictEngineType(String predictEngineType) {
                this.predictEngineType = predictEngineType;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
