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
 * {@link BodyValue} extends {@link TeaModel}
 *
 * <p>BodyValue</p>
 */
public class BodyValue extends TeaModel {
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

    private BodyValue(Builder builder) {
        this.pauseAll = builder.pauseAll;
        this.pauseIndex = builder.pauseIndex;
        this.pauseIndexBatch = builder.pauseIndexBatch;
        this.pauseBiz = builder.pauseBiz;
        this.pauseRuntime = builder.pauseRuntime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BodyValue create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(BodyValue model) {
            this.pauseAll = model.pauseAll;
            this.pauseIndex = model.pauseIndex;
            this.pauseIndexBatch = model.pauseIndexBatch;
            this.pauseBiz = model.pauseBiz;
            this.pauseRuntime = model.pauseRuntime;
        } 

        /**
         * <p>Specifies whether to suspend all pushes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pauseAll(Boolean pauseAll) {
            this.pauseAll = pauseAll;
            return this;
        }

        /**
         * <p>Specifies whether to suspend the push for the new full index version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pauseIndex(Boolean pauseIndex) {
            this.pauseIndex = pauseIndex;
            return this;
        }

        /**
         * <p>Specifies whether to suspend the push for the incremental indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pauseIndexBatch(Boolean pauseIndexBatch) {
            this.pauseIndexBatch = pauseIndexBatch;
            return this;
        }

        /**
         * <p>Specifies whether to suspend the push for the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pauseBiz(Boolean pauseBiz) {
            this.pauseBiz = pauseBiz;
            return this;
        }

        /**
         * <p>Specifies whether to suspend the push for the real-time incremental indexes.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder pauseRuntime(Boolean pauseRuntime) {
            this.pauseRuntime = pauseRuntime;
            return this;
        }

        public BodyValue build() {
            return new BodyValue(this);
        } 

    } 

}
