// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SearchRecursionZonesRequest} extends {@link RequestModel}
 *
 * <p>SearchRecursionZonesRequest</p>
 */
public class SearchRecursionZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectiveScopes")
    private java.util.List<EffectiveScopes> effectiveScopes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderBy")
    private String orderBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ZoneName")
    private String zoneName;

    private SearchRecursionZonesRequest(Builder builder) {
        super(builder);
        this.direction = builder.direction;
        this.effectiveScopes = builder.effectiveScopes;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.orderBy = builder.orderBy;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.remark = builder.remark;
        this.zoneName = builder.zoneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRecursionZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return effectiveScopes
     */
    public java.util.List<EffectiveScopes> getEffectiveScopes() {
        return this.effectiveScopes;
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
     * @return orderBy
     */
    public String getOrderBy() {
        return this.orderBy;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return zoneName
     */
    public String getZoneName() {
        return this.zoneName;
    }

    public static final class Builder extends Request.Builder<SearchRecursionZonesRequest, Builder> {
        private String direction; 
        private java.util.List<EffectiveScopes> effectiveScopes; 
        private Integer maxResults; 
        private String nextToken; 
        private String orderBy; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String remark; 
        private String zoneName; 

        private Builder() {
            super();
        } 

        private Builder(SearchRecursionZonesRequest request) {
            super(request);
            this.direction = request.direction;
            this.effectiveScopes = request.effectiveScopes;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.orderBy = request.orderBy;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.remark = request.remark;
            this.zoneName = request.zoneName;
        } 

        /**
         * Direction.
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * EffectiveScopes.
         */
        public Builder effectiveScopes(java.util.List<EffectiveScopes> effectiveScopes) {
            String effectiveScopesShrink = shrink(effectiveScopes, "EffectiveScopes", "json");
            this.putQueryParameter("EffectiveScopes", effectiveScopesShrink);
            this.effectiveScopes = effectiveScopes;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * OrderBy.
         */
        public Builder orderBy(String orderBy) {
            this.putQueryParameter("OrderBy", orderBy);
            this.orderBy = orderBy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Remark.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ZoneName.
         */
        public Builder zoneName(String zoneName) {
            this.putQueryParameter("ZoneName", zoneName);
            this.zoneName = zoneName;
            return this;
        }

        @Override
        public SearchRecursionZonesRequest build() {
            return new SearchRecursionZonesRequest(this);
        } 

    } 

    /**
     * 
     * {@link SearchRecursionZonesRequest} extends {@link TeaModel}
     *
     * <p>SearchRecursionZonesRequest</p>
     */
    public static class EffectiveScopes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EffectiveType")
        private String effectiveType;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private java.util.List<String> scope;

        private EffectiveScopes(Builder builder) {
            this.effectiveType = builder.effectiveType;
            this.scope = builder.scope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EffectiveScopes create() {
            return builder().build();
        }

        /**
         * @return effectiveType
         */
        public String getEffectiveType() {
            return this.effectiveType;
        }

        /**
         * @return scope
         */
        public java.util.List<String> getScope() {
            return this.scope;
        }

        public static final class Builder {
            private String effectiveType; 
            private java.util.List<String> scope; 

            private Builder() {
            } 

            private Builder(EffectiveScopes model) {
                this.effectiveType = model.effectiveType;
                this.scope = model.scope;
            } 

            /**
             * EffectiveType.
             */
            public Builder effectiveType(String effectiveType) {
                this.effectiveType = effectiveType;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(java.util.List<String> scope) {
                this.scope = scope;
                return this;
            }

            public EffectiveScopes build() {
                return new EffectiveScopes(this);
            } 

        } 

    }
}
