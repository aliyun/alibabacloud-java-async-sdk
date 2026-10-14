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
         * <p>The maximum number of evaluation records. This parameter takes effect for both backfill and continuous runs. If this parameter is not specified, the backend does not apply an additional default value.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxRecords(Integer maxRecords) {
            this.maxRecords = maxRecords;
            return this;
        }

        /**
         * <p>The single-shot input content for temporary evaluation, which is primarily used for one-shot tasks. Values are saved as strings. Object or array values are serialized into JSON strings.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;input&quot;:&quot;User queries order status&quot;,&quot;output&quot;:&quot;Order status queried&quot;}</p>
         */
        public Builder provided(java.util.Map<String, ?> provided) {
            this.provided = provided;
            return this;
        }

        /**
         * <p>The data query filter conditions that take effect together with the evaluator-level filters.query. For trace scenarios, you can specify filter expressions such as service name, environment, and tags.</p>
         * 
         * <strong>example:</strong>
         * <p>serviceName=\&quot;checkout-service\&quot;</p>
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * <p>The sampling rate percentage. Valid values: 0 to 100. A value of 0 or an unspecified value indicates no sampling. A value of 100 indicates full sampling. If the value is less than 100, random sampling is performed first, and then the maxRecords limit is applied.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder samplingRate(Integer samplingRate) {
            this.samplingRate = samplingRate;
            return this;
        }

        /**
         * <p>The list of service names used to restrict the services involved in data filtering.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;checkout-service&quot;]</p>
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
