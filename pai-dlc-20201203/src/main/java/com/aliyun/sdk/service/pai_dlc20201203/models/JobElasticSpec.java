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
    @NameInMap("AIMasterType")
    private String AIMasterType;

    @NameInMap("EnableElasticTraining")
    private Boolean enableElasticTraining;

    @NameInMap("MaxParallelism")
    private Integer maxParallelism;

    @NameInMap("MinParallelism")
    private Integer minParallelism;

    private JobElasticSpec(Builder builder) {
        this.AIMasterType = builder.AIMasterType;
        this.enableElasticTraining = builder.enableElasticTraining;
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
     * @return AIMasterType
     */
    public String getAIMasterType() {
        return this.AIMasterType;
    }

    /**
     * @return enableElasticTraining
     */
    public Boolean getEnableElasticTraining() {
        return this.enableElasticTraining;
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
        private String AIMasterType; 
        private Boolean enableElasticTraining; 
        private Integer maxParallelism; 
        private Integer minParallelism; 

        /**
         * aimaster角色使用的资源规格
         */
        public Builder AIMasterType(String AIMasterType) {
            this.AIMasterType = AIMasterType;
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
