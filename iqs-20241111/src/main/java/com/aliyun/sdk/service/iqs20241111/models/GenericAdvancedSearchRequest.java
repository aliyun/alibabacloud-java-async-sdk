// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GenericAdvancedSearchRequest} extends {@link RequestModel}
 *
 * <p>GenericAdvancedSearchRequest</p>
 */
public class GenericAdvancedSearchRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("timeRange")
    private String timeRange;

    private GenericAdvancedSearchRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
        this.sessionId = builder.sessionId;
        this.timeRange = builder.timeRange;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenericAdvancedSearchRequest create() {
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
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return timeRange
     */
    public String getTimeRange() {
        return this.timeRange;
    }

    public static final class Builder extends Request.Builder<GenericAdvancedSearchRequest, Builder> {
        private String query; 
        private String sessionId; 
        private String timeRange; 

        private Builder() {
            super();
        } 

        private Builder(GenericAdvancedSearchRequest request) {
            super(request);
            this.query = request.query;
            this.sessionId = request.sessionId;
            this.timeRange = request.timeRange;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
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
        public GenericAdvancedSearchRequest build() {
            return new GenericAdvancedSearchRequest(this);
        } 

    } 

}
