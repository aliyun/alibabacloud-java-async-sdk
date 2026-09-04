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
 * {@link RLProgressBufferDetail} extends {@link TeaModel}
 *
 * <p>RLProgressBufferDetail</p>
 */
public class RLProgressBufferDetail extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Consumed")
    private Integer consumed;

    @com.aliyun.core.annotation.NameInMap("Finished")
    private Integer finished;

    @com.aliyun.core.annotation.NameInMap("Ready")
    private Integer ready;

    @com.aliyun.core.annotation.NameInMap("Tag")
    private Integer tag;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private RLProgressBufferDetail(Builder builder) {
        this.consumed = builder.consumed;
        this.finished = builder.finished;
        this.ready = builder.ready;
        this.tag = builder.tag;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RLProgressBufferDetail create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumed
     */
    public Integer getConsumed() {
        return this.consumed;
    }

    /**
     * @return finished
     */
    public Integer getFinished() {
        return this.finished;
    }

    /**
     * @return ready
     */
    public Integer getReady() {
        return this.ready;
    }

    /**
     * @return tag
     */
    public Integer getTag() {
        return this.tag;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer consumed; 
        private Integer finished; 
        private Integer ready; 
        private Integer tag; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(RLProgressBufferDetail model) {
            this.consumed = model.consumed;
            this.finished = model.finished;
            this.ready = model.ready;
            this.tag = model.tag;
            this.total = model.total;
        } 

        /**
         * <p>已被 trainer 消费的样本数</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder consumed(Integer consumed) {
            this.consumed = consumed;
            return this;
        }

        /**
         * <p>已完成样本数</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder finished(Integer finished) {
            this.finished = finished;
            return this;
        }

        /**
         * <p>已就绪样本数</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder ready(Integer ready) {
            this.ready = ready;
            return this;
        }

        /**
         * <p>buffer 标签，即 global batch 序号</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder tag(Integer tag) {
            this.tag = tag;
            return this;
        }

        /**
         * <p>目标样本数</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public RLProgressBufferDetail build() {
            return new RLProgressBufferDetail(this);
        } 

    } 

}
