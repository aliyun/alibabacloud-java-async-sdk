// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListSkillsRequest} extends {@link RequestModel}
 *
 * <p>ListSkillsRequest</p>
 */
public class ListSkillsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Q")
    private String q;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Visibility")
    private java.util.List<String> visibility;

    private ListSkillsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.q = builder.q;
        this.visibility = builder.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return q
     */
    public String getQ() {
        return this.q;
    }

    /**
     * @return visibility
     */
    public java.util.List<String> getVisibility() {
        return this.visibility;
    }

    public static final class Builder extends Request.Builder<ListSkillsRequest, Builder> {
        private String regionId; 
        private Integer maxResults; 
        private String nextToken; 
        private String q; 
        private java.util.List<String> visibility; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.q = request.q;
            this.visibility = request.visibility;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The maximum number of results to return per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token for the next page of results. Omit this for the first request. For subsequent requests, set this to the <code>NextToken</code> from the previous response.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The search keyword for a fuzzy match on Skill names.</p>
         * 
         * <strong>example:</strong>
         * <p>analysis</p>
         */
        public Builder q(String q) {
            this.putBodyParameter("Q", q);
            this.q = q;
            return this;
        }

        /**
         * <p>Filters the results by visibility level. You can specify multiple values.</p>
         */
        public Builder visibility(java.util.List<String> visibility) {
            String visibilityShrink = shrink(visibility, "Visibility", "json");
            this.putBodyParameter("Visibility", visibilityShrink);
            this.visibility = visibility;
            return this;
        }

        @Override
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this);
        } 

    } 

}
