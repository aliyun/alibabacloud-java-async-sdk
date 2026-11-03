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
    @com.aliyun.core.annotation.NameInMap("Exact")
    private Boolean exact;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Limit")
    private Integer limit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    private SearchPolarClawSkillsRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.exact = builder.exact;
        this.limit = builder.limit;
        this.query = builder.query;
        this.source = builder.source;
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
     * @return exact
     */
    public Boolean getExact() {
        return this.exact;
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

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<SearchPolarClawSkillsRequest, Builder> {
        private String applicationId; 
        private Boolean exact; 
        private Integer limit; 
        private String query; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(SearchPolarClawSkillsRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.exact = request.exact;
            this.limit = request.limit;
            this.query = request.query;
            this.source = request.source;
        } 

        /**
         * <p>The application ID.</p>
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
         * <p>Specifies whether to perform an exact search by matching the slug.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder exact(Boolean exact) {
            this.putQueryParameter("Exact", exact);
            this.exact = exact;
            return this;
        }

        /**
         * <p>The maximum number of results to return. Valid values: 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("Limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * <p>The search keyword. If this parameter is not specified, popular or recommended skills are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>rds</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The source of the skill. Valid values: clawhub and polarhub.</p>
         * 
         * <strong>example:</strong>
         * <p>polarhub</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public SearchPolarClawSkillsRequest build() {
            return new SearchPolarClawSkillsRequest(this);
        } 

    } 

}
