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
 * {@link ListNormalizationRuleCapacitiesRequest} extends {@link RequestModel}
 *
 * <p>ListNormalizationRuleCapacitiesRequest</p>
 */
public class ListNormalizationRuleCapacitiesRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
    private String normalizationRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NormalizationRuleIds")
    private java.util.List<String> normalizationRuleIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    private ListNormalizationRuleCapacitiesRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.normalizationRuleId = builder.normalizationRuleId;
        this.normalizationRuleIds = builder.normalizationRuleIds;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNormalizationRuleCapacitiesRequest create() {
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
     * @return normalizationRuleId
     */
    public String getNormalizationRuleId() {
        return this.normalizationRuleId;
    }

    /**
     * @return normalizationRuleIds
     */
    public java.util.List<String> getNormalizationRuleIds() {
        return this.normalizationRuleIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    public static final class Builder extends Request.Builder<ListNormalizationRuleCapacitiesRequest, Builder> {
        private String lang; 
        private Integer maxResults; 
        private String nextToken; 
        private String normalizationRuleId; 
        private java.util.List<String> normalizationRuleIds; 
        private String regionId; 
        private Long roleFor; 

        private Builder() {
            super();
        } 

        private Builder(ListNormalizationRuleCapacitiesRequest request) {
            super(request);
            this.lang = request.lang;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.normalizationRuleId = request.normalizationRuleId;
            this.normalizationRuleIds = request.normalizationRuleIds;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
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
         * NormalizationRuleId.
         */
        public Builder normalizationRuleId(String normalizationRuleId) {
            this.putBodyParameter("NormalizationRuleId", normalizationRuleId);
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }

        /**
         * NormalizationRuleIds.
         */
        public Builder normalizationRuleIds(java.util.List<String> normalizationRuleIds) {
            String normalizationRuleIdsShrink = shrink(normalizationRuleIds, "NormalizationRuleIds", "simple");
            this.putBodyParameter("NormalizationRuleIds", normalizationRuleIdsShrink);
            this.normalizationRuleIds = normalizationRuleIds;
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
         * RoleFor.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        @Override
        public ListNormalizationRuleCapacitiesRequest build() {
            return new ListNormalizationRuleCapacitiesRequest(this);
        } 

    } 

}
