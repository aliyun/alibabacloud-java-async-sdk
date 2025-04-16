// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link QuotaJob} extends {@link TeaModel}
 *
 * <p>QuotaJob</p>
 */
public class QuotaJob extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Queuing")
    private Long queuing;

    @com.aliyun.core.annotation.NameInMap("Running")
    private Long running;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuotaJob(Builder builder) {
        this.queuing = builder.queuing;
        this.running = builder.running;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuotaJob create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return queuing
     */
    public Long getQueuing() {
        return this.queuing;
    }

    /**
     * @return running
     */
    public Long getRunning() {
        return this.running;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Long queuing; 
        private Long running; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuotaJob model) {
            this.queuing = model.queuing;
            this.running = model.running;
            this.total = model.total;
        } 

        /**
         * Queuing.
         */
        public Builder queuing(Long queuing) {
            this.queuing = queuing;
            return this;
        }

        /**
         * Running.
         */
        public Builder running(Long running) {
            this.running = running;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuotaJob build() {
            return new QuotaJob(this);
        } 

    } 

}
