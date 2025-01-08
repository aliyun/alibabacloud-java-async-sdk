// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link Histogram} extends {@link TeaModel}
 *
 * <p>Histogram</p>
 */
public class Histogram extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("from")
    private Integer from;

    @com.aliyun.core.annotation.NameInMap("progress")
    private String progress;

    @com.aliyun.core.annotation.NameInMap("to")
    private Integer to;

    private Histogram(Builder builder) {
        this.count = builder.count;
        this.from = builder.from;
        this.progress = builder.progress;
        this.to = builder.to;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Histogram create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return from
     */
    public Integer getFrom() {
        return this.from;
    }

    /**
     * @return progress
     */
    public String getProgress() {
        return this.progress;
    }

    /**
     * @return to
     */
    public Integer getTo() {
        return this.to;
    }

    public static final class Builder {
        private Long count; 
        private Integer from; 
        private String progress; 
        private Integer to; 

        /**
         * count.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * from.
         */
        public Builder from(Integer from) {
            this.from = from;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(String progress) {
            this.progress = progress;
            return this;
        }

        /**
         * to.
         */
        public Builder to(Integer to) {
            this.to = to;
            return this;
        }

        public Histogram build() {
            return new Histogram(this);
        } 

    } 

}
