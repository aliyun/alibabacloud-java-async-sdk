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

    @NameInMap("EnableAIMaster")
    private Boolean enableAIMaster;

    @NameInMap("EnableElasticTraining")
    private Boolean enableElasticTraining;

    @NameInMap("EnablePsJobElasticWorker")
    private Boolean enablePsJobElasticWorker;

    @NameInMap("MaxParallelism")
    private Integer maxParallelism;

    @NameInMap("MinParallelism")
    private Integer minParallelism;

    private JobElasticSpec(Builder builder) {
        this.AIMasterDockerImage = builder.AIMasterDockerImage;
        this.AIMasterType = builder.AIMasterType;
        this.enableAIMaster = builder.enableAIMaster;
        this.enableElasticTraining = builder.enableElasticTraining;
        this.enablePsJobElasticWorker = builder.enablePsJobElasticWorker;
        this.maxParallelism = builder.maxParallelism;
        this.minParallelism = builder.minParallelism;
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
     * @return enableAIMaster
     */
    public Boolean getEnableAIMaster() {
        return this.enableAIMaster;
    }

    /**
     * @return enableElasticTraining
     */
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
    }

    /**
     * @return enablePsJobElasticWorker
     */
    public Boolean getEnablePsJobElasticWorker() {
        return this.enablePsJobElasticWorker;
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

    public static final class Builder {
        private String AIMasterDockerImage; 
        private String AIMasterType; 
        private Boolean enableAIMaster; 
        private Boolean enableElasticTraining; 
        private Boolean enablePsJobElasticWorker; 
        private Integer maxParallelism; 
        private Integer minParallelism; 

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
         * 是否打开AIMaster
         */
        public Builder enableAIMaster(Boolean enableAIMaster) {
            this.enableAIMaster = enableAIMaster;
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
         * 是否开启弹性Worker对于PS作业
         */
        public Builder enablePsJobElasticWorker(Boolean enablePsJobElasticWorker) {
            this.enablePsJobElasticWorker = enablePsJobElasticWorker;
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

        public JobElasticSpec build() {
            return new JobElasticSpec(this);
        } 

    } 

}
