// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

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
 * {@link UnifiedOriginalQuery} extends {@link TeaModel}
 *
 * <p>UnifiedOriginalQuery</p>
 */
public class UnifiedOriginalQuery extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private UnifiedOriginalQuery(Builder builder) {
        this.query = builder.query;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnifiedOriginalQuery create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder {
        private String query; 
        private String timeRange; 

        private Builder() {
        } 

        private Builder(UnifiedOriginalQuery model) {
            this.query = model.query;
            this.timeRange = model.timeRange;
        } 

        /**
         * query.
         */
        public Builder query(String query) {
            this.query = query;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.timeRange = timeRange;
            return this;
        }

        public UnifiedOriginalQuery build() {
            return new UnifiedOriginalQuery(this);
        } 

    } 

}
