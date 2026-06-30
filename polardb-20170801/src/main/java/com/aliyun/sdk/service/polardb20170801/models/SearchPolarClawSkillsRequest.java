// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link SearchPolarClawSkillsRequest} extends {@link RequestModel}
 *
 * <p>SearchPolarClawSkillsRequest</p>
 */
public class SearchPolarClawSkillsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    private SearchPolarClawSkillsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.limit = builder.limit;
        this.query = builder.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchPolarClawSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    public static final class Builder extends Request.Builder<SearchPolarClawSkillsRequest, Builder> {
        private String applicationId; 
        private Integer limit; 
        private String query; 

        private Builder() {
            super();
        } 

        private Builder(SearchPolarClawSkillsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.limit = request.limit;
            this.query = request.query;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * Query.
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        @Override
        public SearchPolarClawSkillsRequest build() {
            return new SearchPolarClawSkillsRequest(this);
        } 

    } 

}
