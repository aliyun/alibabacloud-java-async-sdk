// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResultValue} extends {@link TeaModel}
 *
 * <p>ResultValue</p>
 */
public class ResultValue extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("pauseAll")
    private Boolean pauseAll;

    @com.aliyun.core.annotation.NameInMap("pauseIndex")
    private Boolean pauseIndex;

    @com.aliyun.core.annotation.NameInMap("pauseIndexBatch")
    private Boolean pauseIndexBatch;

    @com.aliyun.core.annotation.NameInMap("pauseBiz")
    private Boolean pauseBiz;

    @com.aliyun.core.annotation.NameInMap("pauseRuntime")
    private Boolean pauseRuntime;

    private ResultValue(Builder builder) {
        this.pauseAll = builder.pauseAll;
        this.pauseIndex = builder.pauseIndex;
        this.pauseIndexBatch = builder.pauseIndexBatch;
        this.pauseBiz = builder.pauseBiz;
        this.pauseRuntime = builder.pauseRuntime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResultValue create() {
        return builder().build();
    }

    /**
     * @return pauseAll
     */
    public Boolean getPauseAll() {
        return this.pauseAll;
    }

    /**
     * @return pauseIndex
     */
    public Boolean getPauseIndex() {
        return this.pauseIndex;
    }

    /**
     * @return pauseIndexBatch
     */
    public Boolean getPauseIndexBatch() {
        return this.pauseIndexBatch;
    }

    /**
     * @return pauseBiz
     */
    public Boolean getPauseBiz() {
        return this.pauseBiz;
    }

    /**
     * @return pauseRuntime
     */
    public Boolean getPauseRuntime() {
        return this.pauseRuntime;
    }

    public static final class Builder {
        private Boolean pauseAll; 
        private Boolean pauseIndex; 
        private Boolean pauseIndexBatch; 
        private Boolean pauseBiz; 
        private Boolean pauseRuntime; 

        /**
         * pauseAll.
         */
        public Builder pauseAll(Boolean pauseAll) {
            this.pauseAll = pauseAll;
            return this;
        }

        /**
         * pauseIndex.
         */
        public Builder pauseIndex(Boolean pauseIndex) {
            this.pauseIndex = pauseIndex;
            return this;
        }

        /**
         * pauseIndexBatch.
         */
        public Builder pauseIndexBatch(Boolean pauseIndexBatch) {
            this.pauseIndexBatch = pauseIndexBatch;
            return this;
        }

        /**
         * pauseBiz.
         */
        public Builder pauseBiz(Boolean pauseBiz) {
            this.pauseBiz = pauseBiz;
            return this;
        }

        /**
         * pauseRuntime.
         */
        public Builder pauseRuntime(Boolean pauseRuntime) {
            this.pauseRuntime = pauseRuntime;
            return this;
        }

        public ResultValue build() {
            return new ResultValue(this);
        } 

    } 

}
