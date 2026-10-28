// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link JobElasticSpec} extends {@link TeaModel}
 *
 * <p>JobElasticSpec</p>
 */
public class JobElasticSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIMasterDockerImage")
    private String AIMasterDockerImage;

    @com.aliyun.core.annotation.NameInMap("AIMasterType")
    private String AIMasterType;

    @com.aliyun.core.annotation.NameInMap("EDPMaxParallelism")
    private Integer EDPMaxParallelism;

    @com.aliyun.core.annotation.NameInMap("EDPMinParallelism")
    private Integer EDPMinParallelism;

    @com.aliyun.core.annotation.NameInMap("ElasticStrategy")
    private String elasticStrategy;

    @com.aliyun.core.annotation.NameInMap("EnableAIMaster")
    private Boolean enableAIMaster;

    @com.aliyun.core.annotation.NameInMap("EnableEDP")
    private Boolean enableEDP;

    @com.aliyun.core.annotation.NameInMap("EnableElasticTraining")
    private Boolean enableElasticTraining;

    @com.aliyun.core.annotation.NameInMap("EnablePsJobElasticPS")
    private Boolean enablePsJobElasticPS;

    @com.aliyun.core.annotation.NameInMap("EnablePsJobElasticWorker")
    private Boolean enablePsJobElasticWorker;

    @com.aliyun.core.annotation.NameInMap("EnablePsResourceEstimate")
    private Boolean enablePsResourceEstimate;

    @com.aliyun.core.annotation.NameInMap("MaxParallelism")
    private Integer maxParallelism;

    @com.aliyun.core.annotation.NameInMap("MinParallelism")
    private Integer minParallelism;

    @com.aliyun.core.annotation.NameInMap("PSMaxParallelism")
    private Integer PSMaxParallelism;

    @com.aliyun.core.annotation.NameInMap("PSMinParallelism")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(JobElasticSpec model) {
            this.AIMasterDockerImage = model.AIMasterDockerImage;
            this.AIMasterType = model.AIMasterType;
            this.EDPMaxParallelism = model.EDPMaxParallelism;
            this.EDPMinParallelism = model.EDPMinParallelism;
            this.elasticStrategy = model.elasticStrategy;
            this.enableAIMaster = model.enableAIMaster;
            this.enableEDP = model.enableEDP;
            this.enableElasticTraining = model.enableElasticTraining;
            this.enablePsJobElasticPS = model.enablePsJobElasticPS;
            this.enablePsJobElasticWorker = model.enablePsJobElasticWorker;
            this.enablePsResourceEstimate = model.enablePsResourceEstimate;
            this.maxParallelism = model.maxParallelism;
            this.minParallelism = model.minParallelism;
            this.PSMaxParallelism = model.PSMaxParallelism;
            this.PSMinParallelism = model.PSMinParallelism;
        } 

        /**
         * <p>The AIMaster Docker image.</p>
         */
        public Builder AIMasterDockerImage(String AIMasterDockerImage) {
            this.AIMasterDockerImage = AIMasterDockerImage;
            return this;
        }

        /**
         * <p>The resource specifications for the AIMaster role.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.large</p>
         */
        public Builder AIMasterType(String AIMasterType) {
            this.AIMasterType = AIMasterType;
            return this;
        }

        /**
         * <p>The maximum EDP parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder EDPMaxParallelism(Integer EDPMaxParallelism) {
            this.EDPMaxParallelism = EDPMaxParallelism;
            return this;
        }

        /**
         * <p>The minimum EDP parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder EDPMinParallelism(Integer EDPMinParallelism) {
            this.EDPMinParallelism = EDPMinParallelism;
            return this;
        }

        /**
         * <p>The elastic training strategy.</p>
         * 
         * <strong>example:</strong>
         * <p>chief</p>
         */
        public Builder elasticStrategy(String elasticStrategy) {
            this.elasticStrategy = elasticStrategy;
            return this;
        }

        /**
         * <p>Specifies whether to enable AIMaster.</p>
         */
        public Builder enableAIMaster(Boolean enableAIMaster) {
            this.enableAIMaster = enableAIMaster;
            return this;
        }

        /**
         * <p>Specifies whether to enable EDP.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableEDP(Boolean enableEDP) {
            this.enableEDP = enableEDP;
            return this;
        }

        /**
         * <p>Specifies whether to enable elastic training.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableElasticTraining(Boolean enableElasticTraining) {
            this.enableElasticTraining = enableElasticTraining;
            return this;
        }

        /**
         * <p>Specifies whether to enable the elastic PS feature.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enablePsJobElasticPS(Boolean enablePsJobElasticPS) {
            this.enablePsJobElasticPS = enablePsJobElasticPS;
            return this;
        }

        /**
         * <p>Specifies whether to enable elastic workers for PS jobs.</p>
         */
        public Builder enablePsJobElasticWorker(Boolean enablePsJobElasticWorker) {
            this.enablePsJobElasticWorker = enablePsJobElasticWorker;
            return this;
        }

        /**
         * <p>Specifies whether to enable PS resource estimation.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enablePsResourceEstimate(Boolean enablePsResourceEstimate) {
            this.enablePsResourceEstimate = enablePsResourceEstimate;
            return this;
        }

        /**
         * <p>The maximum parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        public Builder maxParallelism(Integer maxParallelism) {
            this.maxParallelism = maxParallelism;
            return this;
        }

        /**
         * <p>The minimum parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder minParallelism(Integer minParallelism) {
            this.minParallelism = minParallelism;
            return this;
        }

        /**
         * <p>The maximum PS parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder PSMaxParallelism(Integer PSMaxParallelism) {
            this.PSMaxParallelism = PSMaxParallelism;
            return this;
        }

        /**
         * <p>The minimum PS parallelism.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
