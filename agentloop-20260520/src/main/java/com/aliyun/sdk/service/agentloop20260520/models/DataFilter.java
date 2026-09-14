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
    @com.aliyun.core.annotation.NameInMap("maxRecords")
    private Integer maxRecords;

    @com.aliyun.core.annotation.NameInMap("provided")
    private java.util.Map<String, ?> provided;

    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("samplingRate")
    private Integer samplingRate;

    @com.aliyun.core.annotation.NameInMap("serviceNames")
    private java.util.List<String> serviceNames;

    private DataFilter(Builder builder) {
        this.maxRecords = builder.maxRecords;
        this.provided = builder.provided;
        this.query = builder.query;
        this.samplingRate = builder.samplingRate;
        this.serviceNames = builder.serviceNames;
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
     * @return serviceNames
     */
    public java.util.List<String> getServiceNames() {
        return this.serviceNames;
    }

    public static final class Builder {
        private Integer maxRecords; 
        private java.util.Map<String, ?> provided; 
        private String query; 
        private Integer samplingRate; 
        private java.util.List<String> serviceNames; 

        private Builder() {
        } 

        private Builder(DataFilter model) {
            this.maxRecords = model.maxRecords;
            this.provided = model.provided;
            this.query = model.query;
            this.samplingRate = model.samplingRate;
            this.serviceNames = model.serviceNames;
        } 

        /**
         * <p>The maximum number of evaluation records. This takes effect for both backfill and continuous runs. If not specified, the backend does not write a default value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxRecords(Integer maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }

        /**
         * <p>The one-time temporary evaluation input content, primarily used for oneshot tasks. The value is stored as a string. Object or array values are serialized to a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input&quot;:&quot;用户查询订单状态&quot;,&quot;output&quot;:&quot;已查询到订单状态&quot;}</p>
         */
        public Builder provided(java.util.Map<String, ?> provided) {
            this.provided = provided;
            return this;
        }

        /**
         * <p>The data query filter condition. This takes effect together with the evaluator-level filters.query. In Trace scenarios, you can specify filter expressions such as service name, environment, or labels.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceName=\&quot;checkout-service\&quot;</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The sampling rate percentage. Valid values: 0 to 100. A value of 0 or not specified indicates no sampling. A value of 100 indicates full data. If the value is less than 100, random sampling is applied first, and then the maxRecords limit is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * serviceNames.
         */
        public Builder serviceNames(java.util.List<String> serviceNames) {
            this.serviceNames = serviceNames;
            return this;
        }

        public DataFilter build() {
            return new DataFilter(this);
        } 

    } 

}
