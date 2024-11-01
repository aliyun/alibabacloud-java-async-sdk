// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmallretrieval20240501.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenericSearchRequest} extends {@link RequestModel}
 *
 * <p>GenericSearchRequest</p>
 */
public class GenericSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private GenericSearchRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenericSearchRequest create() {
        return builder().build();
    }

    @Override
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

    public static final class Builder extends Request.Builder<GenericSearchRequest, Builder> {
        private String query; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GenericSearchRequest request) {
            super(request);
            this.query = request.query;
            this.timeRange = request.timeRange;
        } 

        /**
         * query.
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * timeRange.
         */
        public Builder timeRange(String timeRange) {
            this.putQueryParameter("timeRange", timeRange);
            this.timeRange = timeRange;
            return this;
        }

        @Override
        public GenericSearchRequest build() {
            return new GenericSearchRequest(this);
        } 

    } 

}
