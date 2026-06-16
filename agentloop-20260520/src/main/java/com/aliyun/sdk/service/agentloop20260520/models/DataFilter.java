// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DataFilter} extends {@link TeaModel}
 *
 * <p>DataFilter</p>
 */
public class DataFilter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("maxRecords")
    private Integer maxRecords;

    @com.aliyun.core.annotation.NameInMap("provided")
    private java.util.Map<String, ?> provided;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("samplingRate")
    private Integer samplingRate;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private DataFilter(Builder builder) {
        this.endTime = builder.endTime;
        this.maxRecords = builder.maxRecords;
        this.provided = builder.provided;
        this.query = builder.query;
        this.samplingRate = builder.samplingRate;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataFilter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return maxRecords
     */
    public Integer getMaxRecords() {
        return this.maxRecords;
    }

    /**
     * @return provided
     */
    public java.util.Map<String, ?> getProvided() {
        return this.provided;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return samplingRate
     */
    public Integer getSamplingRate() {
        return this.samplingRate;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private Long endTime; 
        private Integer maxRecords; 
        private java.util.Map<String, ?> provided; 
        private String query; 
        private Integer samplingRate; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(DataFilter model) {
            this.endTime = model.endTime;
            this.maxRecords = model.maxRecords;
            this.provided = model.provided;
            this.query = model.query;
            this.samplingRate = model.samplingRate;
            this.startTime = model.startTime;
        } 

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * maxRecords.
         */
        public Builder maxRecords(Integer maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }

        /**
         * provided.
         */
        public Builder provided(java.util.Map<String, ?> provided) {
            this.provided = provided;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * samplingRate.
         */
        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public DataFilter build() {
            return new DataFilter(this);
        } 

    } 

}
