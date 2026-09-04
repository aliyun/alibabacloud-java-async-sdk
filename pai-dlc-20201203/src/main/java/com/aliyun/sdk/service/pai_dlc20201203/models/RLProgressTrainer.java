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
 * {@link RLProgressTrainer} extends {@link TeaModel}
 *
 * <p>RLProgressTrainer</p>
 */
public class RLProgressTrainer extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Micro")
    private RLProgressMicro micro;

    @com.aliyun.core.annotation.NameInMap("MiniIdx")
    private Integer miniIdx;

    @com.aliyun.core.annotation.NameInMap("NumMinibatches")
    private Integer numMinibatches;

    @com.aliyun.core.annotation.NameInMap("Sync")
    private RLProgressSync sync;

    private RLProgressTrainer(Builder builder) {
        this.micro = builder.micro;
        this.miniIdx = builder.miniIdx;
        this.numMinibatches = builder.numMinibatches;
        this.sync = builder.sync;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressTrainer create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return micro
     */
    public RLProgressMicro getMicro() {
        return this.micro;
    }

    /**
     * @return miniIdx
     */
    public Integer getMiniIdx() {
        return this.miniIdx;
    }

    /**
     * @return numMinibatches
     */
    public Integer getNumMinibatches() {
        return this.numMinibatches;
    }

    /**
     * @return sync
     */
    public RLProgressSync getSync() {
        return this.sync;
    }

    public static final class Builder {
        private RLProgressMicro micro; 
        private Integer miniIdx; 
        private Integer numMinibatches; 
        private RLProgressSync sync; 

        private Builder() {
        } 

        private Builder(RLProgressTrainer model) {
            this.micro = model.micro;
            this.miniIdx = model.miniIdx;
            this.numMinibatches = model.numMinibatches;
            this.sync = model.sync;
        } 

        /**
         * <p>micro-batch 进度</p>
         */
        public Builder micro(RLProgressMicro micro) {
            this.micro = micro;
            return this;
        }

        /**
         * <p>当前 mini batch 序号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder miniIdx(Integer miniIdx) {
            this.miniIdx = miniIdx;
            return this;
        }

        /**
         * <p>mini-batch 总数</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder numMinibatches(Integer numMinibatches) {
            this.numMinibatches = numMinibatches;
            return this;
        }

        /**
         * <p>参数同步状态</p>
         */
        public Builder sync(RLProgressSync sync) {
            this.sync = sync;
            return this;
        }

        public RLProgressTrainer build() {
            return new RLProgressTrainer(this);
        } 

    } 

}
