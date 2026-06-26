// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link TimedPoolConfig} extends {@link TeaModel}
 *
 * <p>TimedPoolConfig</p>
 */
public class TimedPoolConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("effectiveEndDate")
    private String effectiveEndDate;

    @com.aliyun.core.annotation.NameInMap("effectiveStartDate")
    private String effectiveStartDate;

    @com.aliyun.core.annotation.NameInMap("elasticIntervals")
    private java.util.List<ElasticInterval> elasticIntervals;

    @com.aliyun.core.annotation.NameInMap("timeZone")
    private String timeZone;

    private TimedPoolConfig(Builder builder) {
        this.effectiveEndDate = builder.effectiveEndDate;
        this.effectiveStartDate = builder.effectiveStartDate;
        this.elasticIntervals = builder.elasticIntervals;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TimedPoolConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return effectiveEndDate
     */
    public String getEffectiveEndDate() {
        return this.effectiveEndDate;
    }

    /**
     * @return effectiveStartDate
     */
    public String getEffectiveStartDate() {
        return this.effectiveStartDate;
    }

    /**
     * @return elasticIntervals
     */
    public java.util.List<ElasticInterval> getElasticIntervals() {
        return this.elasticIntervals;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder {
        private String effectiveEndDate; 
        private String effectiveStartDate; 
        private java.util.List<ElasticInterval> elasticIntervals; 
        private String timeZone; 

        private Builder() {
        } 

        private Builder(TimedPoolConfig model) {
            this.effectiveEndDate = model.effectiveEndDate;
            this.effectiveStartDate = model.effectiveStartDate;
            this.elasticIntervals = model.elasticIntervals;
            this.timeZone = model.timeZone;
        } 

        /**
         * effectiveEndDate.
         */
        public Builder effectiveEndDate(String effectiveEndDate) {
            this.effectiveEndDate = effectiveEndDate;
            return this;
        }

        /**
         * effectiveStartDate.
         */
        public Builder effectiveStartDate(String effectiveStartDate) {
            this.effectiveStartDate = effectiveStartDate;
            return this;
        }

        /**
         * elasticIntervals.
         */
        public Builder elasticIntervals(java.util.List<ElasticInterval> elasticIntervals) {
            this.elasticIntervals = elasticIntervals;
            return this;
        }

        /**
         * timeZone.
         */
        public Builder timeZone(String timeZone) {
            this.timeZone = timeZone;
            return this;
        }

        public TimedPoolConfig build() {
            return new TimedPoolConfig(this);
        } 

    } 

}
