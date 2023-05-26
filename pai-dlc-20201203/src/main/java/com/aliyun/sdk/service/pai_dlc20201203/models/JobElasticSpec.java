// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link JobElasticSpec} extends {@link TeaModel}
 *
 * <p>JobElasticSpec</p>
 */
public class JobElasticSpec extends TeaModel {
    @NameInMap("AIMasterDockerImage")
    private String AIMasterDockerImage;

    @NameInMap("AIMasterType")
    private String AIMasterType;

    @NameInMap("EDPMaxParallelism")
    private Integer EDPMaxParallelism;

    @NameInMap("EDPMinParallelism")
    private Integer EDPMinParallelism;

    @NameInMap("ElasticStrategy")
    private String elasticStrategy;

    @NameInMap("EnableAIMaster")
    private Boolean enableAIMaster;

    @NameInMap("EnableEDP")
    private Boolean enableEDP;

    @NameInMap("EnableElasticTraining")
    private Boolean enableElasticTraining;

    @NameInMap("EnablePsJobElasticPS")
    private Boolean enablePsJobElasticPS;

    @NameInMap("EnablePsJobElasticWorker")
    private Boolean enablePsJobElasticWorker;

    @NameInMap("EnablePsResourceEstimate")
    private Boolean enablePsResourceEstimate;

    @NameInMap("MaxParallelism")
    private Integer maxParallelism;

    @NameInMap("MinParallelism")
    private Integer minParallelism;

    @NameInMap("PSMaxParallelism")
    private Integer PSMaxParallelism;

    @NameInMap("PSMinParallelism")
    private Integer PSMinParallelism;

    private JobElasticSpec(Builder builder) {
        this.AIMasterDockerImage = builder.AIMasterDockerImage;
        this.AIMasterType = builder.AIMasterType;
        this.EDPMaxParallelism = builder.EDPMaxParallelism;
        this.EDPMinParallelism = builder.EDPMinParallelism;
        this.elasticStrategy = builder.elasticStrategy;
        this.enableAIMaster = builder.enableAIMaster;
        this.enableEDP = builder.enableEDP;
        this.enableElasticTraining = builder.enableElasticTraining;
        this.enablePsJobElasticPS = builder.enablePsJobElasticPS;
        this.enablePsJobElasticWorker = builder.enablePsJobElasticWorker;
        this.enablePsResourceEstimate = builder.enablePsResourceEstimate;
        this.maxParallelism = builder.maxParallelism;
        this.minParallelism = builder.minParallelism;
        this.PSMaxParallelism = builder.PSMaxParallelism;
        this.PSMinParallelism = builder.PSMinParallelism;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static JobElasticSpec create() {
        return builder().build();
    }

    /**
     * @return AIMasterDockerImage
     */
    public String getAIMasterDockerImage() {
        return this.AIMasterDockerImage;
    }

    /**
     * @return AIMasterType
     */
    public String getAIMasterType() {
        return this.AIMasterType;
    }

    /**
     * @return EDPMaxParallelism
     */
    public Integer getEDPMaxParallelism() {
        return this.EDPMaxParallelism;
    }

    /**
     * @return EDPMinParallelism
     */
    public Integer getEDPMinParallelism() {
        return this.EDPMinParallelism;
    }

    /**
     * @return elasticStrategy
     */
    public String getElasticStrategy() {
        return this.elasticStrategy;
    }

    /**
     * @return enableAIMaster
     */
    public Boolean getEnableAIMaster() {
        return this.enableAIMaster;
    }

    /**
     * @return enableEDP
     */
    public Boolean getEnableEDP() {
        return this.enableEDP;
    }

    /**
     * @return enableElasticTraining
     */
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
    }

    /**
     * @return enablePsJobElasticPS
     */
    public Boolean getEnablePsJobElasticPS() {
        return this.enablePsJobElasticPS;
    }

    /**
     * @return enablePsJobElasticWorker
     */
    public Boolean getEnablePsJobElasticWorker() {
        return this.enablePsJobElasticWorker;
    }

    /**
     * @return enablePsResourceEstimate
     */
    public Boolean getEnablePsResourceEstimate() {
        return this.enablePsResourceEstimate;
    }

    /**
     * @return maxParallelism
     */
    public Integer getMaxParallelism() {
        return this.maxParallelism;
    }

    /**
     * @return minParallelism
     */
    public Integer getMinParallelism() {
        return this.minParallelism;
    }

    /**
     * @return PSMaxParallelism
     */
    public Integer getPSMaxParallelism() {
        return this.PSMaxParallelism;
    }

    /**
     * @return PSMinParallelism
     */
    public Integer getPSMinParallelism() {
        return this.PSMinParallelism;
    }

    public static final class Builder {
        private String AIMasterDockerImage; 
        private String AIMasterType; 
        private Integer EDPMaxParallelism; 
        private Integer EDPMinParallelism; 
        private String elasticStrategy; 
        private Boolean enableAIMaster; 
        private Boolean enableEDP; 
        private Boolean enableElasticTraining; 
        private Boolean enablePsJobElasticPS; 
        private Boolean enablePsJobElasticWorker; 
        private Boolean enablePsResourceEstimate; 
        private Integer maxParallelism; 
        private Integer minParallelism; 
        private Integer PSMaxParallelism; 
        private Integer PSMinParallelism; 

        /**
         * aimaster docker镜像
         */
        public Builder AIMasterDockerImage(String AIMasterDockerImage) {
            this.AIMasterDockerImage = AIMasterDockerImage;
            return this;
        }

        /**
         * aimaster角色使用的资源规格
         */
        public Builder AIMasterType(String AIMasterType) {
            this.AIMasterType = AIMasterType;
            return this;
        }

        /**
         * EDP最大并行度
         */
        public Builder EDPMaxParallelism(Integer EDPMaxParallelism) {
            this.EDPMaxParallelism = EDPMaxParallelism;
            return this;
        }

        /**
         * EDP最小并行度
         */
        public Builder EDPMinParallelism(Integer EDPMinParallelism) {
            this.EDPMinParallelism = EDPMinParallelism;
            return this;
        }

        /**
         * 弹性训练策略
         */
        public Builder elasticStrategy(String elasticStrategy) {
            this.elasticStrategy = elasticStrategy;
            return this;
        }

        /**
         * 是否打开AIMaster
         */
        public Builder enableAIMaster(Boolean enableAIMaster) {
            this.enableAIMaster = enableAIMaster;
            return this;
        }

        /**
         * 是否打开EDP
         */
        public Builder enableEDP(Boolean enableEDP) {
            this.enableEDP = enableEDP;
            return this;
        }

        /**
         * 打开弹性训练
         */
        public Builder enableElasticTraining(Boolean enableElasticTraining) {
            this.enableElasticTraining = enableElasticTraining;
            return this;
        }

        /**
         * 是否打开弹性PS功能
         */
        public Builder enablePsJobElasticPS(Boolean enablePsJobElasticPS) {
            this.enablePsJobElasticPS = enablePsJobElasticPS;
            return this;
        }

        /**
         * 是否开启弹性Worker对于PS作业
         */
        public Builder enablePsJobElasticWorker(Boolean enablePsJobElasticWorker) {
            this.enablePsJobElasticWorker = enablePsJobElasticWorker;
            return this;
        }

        /**
         * 是否打开PS资源预估
         */
        public Builder enablePsResourceEstimate(Boolean enablePsResourceEstimate) {
            this.enablePsResourceEstimate = enablePsResourceEstimate;
            return this;
        }

        /**
         * 最大并行度
         */
        public Builder maxParallelism(Integer maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }

        /**
         * 最小并行度
         */
        public Builder minParallelism(Integer minParallelism) {
            this.minParallelism = minParallelism;
            return this;
        }

        /**
         * PS最大并行度
         */
        public Builder PSMaxParallelism(Integer PSMaxParallelism) {
            this.PSMaxParallelism = PSMaxParallelism;
            return this;
        }

        /**
         * PS最小并行度
         */
        public Builder PSMinParallelism(Integer PSMinParallelism) {
            this.PSMinParallelism = PSMinParallelism;
            return this;
        }

        public JobElasticSpec build() {
            return new JobElasticSpec(this);
        } 

    } 

}
