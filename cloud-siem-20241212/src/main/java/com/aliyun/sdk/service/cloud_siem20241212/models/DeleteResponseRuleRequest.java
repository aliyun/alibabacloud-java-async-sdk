// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link DeleteResponseRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteResponseRuleRequest</p>
 */
public class DeleteResponseRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResponseRuleId")
    private String responseRuleId;

    private DeleteResponseRuleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.regionId = builder.regionId;
        this.responseRuleId = builder.responseRuleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteResponseRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return responseRuleId
     */
    public String getResponseRuleId() {
        return this.responseRuleId;
    }

    public static final class Builder extends Request.Builder<DeleteResponseRuleRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String regionId; 
        private String responseRuleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteResponseRuleRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.regionId = request.regionId;
            this.responseRuleId = request.responseRuleId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResponseRuleId.
         */
        public Builder responseRuleId(String responseRuleId) {
            this.putBodyParameter("ResponseRuleId", responseRuleId);
            this.responseRuleId = responseRuleId;
            return this;
        }

        @Override
        public DeleteResponseRuleRequest build() {
            return new DeleteResponseRuleRequest(this);
        } 

    } 

}
