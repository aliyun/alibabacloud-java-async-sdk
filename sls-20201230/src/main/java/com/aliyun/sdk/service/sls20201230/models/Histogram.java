// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link Histogram} extends {@link TeaModel}
 *
 * <p>Histogram</p>
 */
public class Histogram extends TeaModel {
    @NameInMap("count")
    private Long count;

    @NameInMap("from")
    private Integer from;

    @NameInMap("progress")
    private String progress;

    @NameInMap("to")
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
