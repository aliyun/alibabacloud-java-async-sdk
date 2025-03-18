// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ResultClusterValue model) {
            this.buildParallelNum = model.buildParallelNum;
            this.mergeParallelNum = model.mergeParallelNum;
        } 

        /**
         * <p>The maximum number of full indexes that can be concurrently built.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder buildParallelNum(Integer buildParallelNum) {
            this.buildParallelNum = buildParallelNum;
            return this;
        }

        /**
         * <p>The maximum number of full indexes that can be concurrently merged.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
