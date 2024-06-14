// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResultClusterValue} extends {@link TeaModel}
 *
 * <p>ResultClusterValue</p>
 */
public class ResultClusterValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("buildParallelNum")
    private Integer buildParallelNum;

    @com.aliyun.core.annotation.NameInMap("mergeParallelNum")
    private Integer mergeParallelNum;

    private ResultClusterValue(Builder builder) {
        this.buildParallelNum = builder.buildParallelNum;
        this.mergeParallelNum = builder.mergeParallelNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultClusterValue create() {
        return builder().build();
    }

    /**
     * @return buildParallelNum
     */
    public Integer getBuildParallelNum() {
        return this.buildParallelNum;
    }

    /**
     * @return mergeParallelNum
     */
    public Integer getMergeParallelNum() {
        return this.mergeParallelNum;
    }

    public static final class Builder {
        private Integer buildParallelNum; 
        private Integer mergeParallelNum; 

        /**
         * buildParallelNum.
         */
        public Builder buildParallelNum(Integer buildParallelNum) {
            this.buildParallelNum = buildParallelNum;
            return this;
        }

        /**
         * mergeParallelNum.
         */
        public Builder mergeParallelNum(Integer mergeParallelNum) {
            this.mergeParallelNum = mergeParallelNum;
            return this;
        }

        public ResultClusterValue build() {
            return new ResultClusterValue(this);
        } 

    } 

}
