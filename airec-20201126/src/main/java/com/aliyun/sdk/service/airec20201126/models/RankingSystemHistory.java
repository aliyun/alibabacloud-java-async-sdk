// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RankingSystemHistory} extends {@link TeaModel}
 *
 * <p>RankingSystemHistory</p>
 */
public class RankingSystemHistory extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Meta")
    private Meta meta;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("OperateId")
    private String operateId;

    @com.aliyun.core.annotation.NameInMap("OperateTime")
    private String operateTime;

    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    private RankingSystemHistory(Builder builder) {
        this.meta = builder.meta;
        this.name = builder.name;
        this.operateId = builder.operateId;
        this.operateTime = builder.operateTime;
        this.operateType = builder.operateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RankingSystemHistory create() {
        return builder().build();
    }

    /**
     * @return meta
     */
    public Meta getMeta() {
        return this.meta;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operateId
     */
    public String getOperateId() {
        return this.operateId;
    }

    /**
     * @return operateTime
     */
    public String getOperateTime() {
        return this.operateTime;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    public static final class Builder {
        private Meta meta; 
        private String name; 
        private String operateId; 
        private String operateTime; 
        private String operateType; 

        /**
         * Meta.
         */
        public Builder meta(Meta meta) {
            this.meta = meta;
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
         * OperateId.
         */
        public Builder operateId(String operateId) {
            this.operateId = operateId;
            return this;
        }

        /**
         * OperateTime.
         */
        public Builder operateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.operateType = operateType;
            return this;
        }

        public RankingSystemHistory build() {
            return new RankingSystemHistory(this);
        } 

    } 

    /**
     * 
     * {@link RankingSystemHistory} extends {@link TeaModel}
     *
     * <p>RankingSystemHistory</p>
     */
    public static class PredictEngine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PredictEngine(Builder builder) {
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
            private String resourceId; 
            private String version; 

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
     * {@link RankingSystemHistory} extends {@link TeaModel}
     *
     * <p>RankingSystemHistory</p>
     */
    public static class Meta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoDeploy")
        private Boolean autoDeploy;

        @com.aliyun.core.annotation.NameInMap("AutoDeployAuc")
        private String autoDeployAuc;

        @com.aliyun.core.annotation.NameInMap("Conf")
        private String conf;

        @com.aliyun.core.annotation.NameInMap("ModelTemplateName")
        private String modelTemplateName;

        @com.aliyun.core.annotation.NameInMap("PredictEngine")
        private PredictEngine predictEngine;

        @com.aliyun.core.annotation.NameInMap("PredictEngineType")
        private String predictEngineType;

        @com.aliyun.core.annotation.NameInMap("PreviousOperateId")
        private String previousOperateId;

        private Meta(Builder builder) {
            this.autoDeploy = builder.autoDeploy;
            this.autoDeployAuc = builder.autoDeployAuc;
            this.conf = builder.conf;
            this.modelTemplateName = builder.modelTemplateName;
            this.predictEngine = builder.predictEngine;
            this.predictEngineType = builder.predictEngineType;
            this.previousOperateId = builder.previousOperateId;
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
         * @return modelTemplateName
         */
        public String getModelTemplateName() {
            return this.modelTemplateName;
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

        /**
         * @return previousOperateId
         */
        public String getPreviousOperateId() {
            return this.previousOperateId;
        }

        public static final class Builder {
            private Boolean autoDeploy; 
            private String autoDeployAuc; 
            private String conf; 
            private String modelTemplateName; 
            private PredictEngine predictEngine; 
            private String predictEngineType; 
            private String previousOperateId; 

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
             * ModelTemplateName.
             */
            public Builder modelTemplateName(String modelTemplateName) {
                this.modelTemplateName = modelTemplateName;
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

            /**
             * PreviousOperateId.
             */
            public Builder previousOperateId(String previousOperateId) {
                this.previousOperateId = previousOperateId;
                return this;
            }

            public Meta build() {
                return new Meta(this);
            } 

        } 

    }
}
