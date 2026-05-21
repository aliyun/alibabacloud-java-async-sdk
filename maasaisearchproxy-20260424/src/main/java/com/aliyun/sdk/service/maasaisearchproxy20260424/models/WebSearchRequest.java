// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasaisearchproxy20260424.models;

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
 * {@link WebSearchRequest} extends {@link RequestModel}
 *
 * <p>WebSearchRequest</p>
 */
public class WebSearchRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private String endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("excludeDomain")
    private java.util.List<String> excludeDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("includeDomain")
    private java.util.List<String> includeDomain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("limit")
    private Integer limit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("query")
    private String query;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private String startTime;

    private WebSearchRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.excludeDomain = builder.excludeDomain;
        this.includeDomain = builder.includeDomain;
        this.limit = builder.limit;
        this.query = builder.query;
        this.region = builder.region;
        this.searchType = builder.searchType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WebSearchRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return excludeDomain
     */
    public java.util.List<String> getExcludeDomain() {
        return this.excludeDomain;
    }

    /**
     * @return includeDomain
     */
    public java.util.List<String> getIncludeDomain() {
        return this.includeDomain;
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<WebSearchRequest, Builder> {
        private String endTime; 
        private java.util.List<String> excludeDomain; 
        private java.util.List<String> includeDomain; 
        private Integer limit; 
        private String query; 
        private String region; 
        private String searchType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(WebSearchRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.excludeDomain = request.excludeDomain;
            this.includeDomain = request.includeDomain;
            this.limit = request.limit;
            this.query = request.query;
            this.region = request.region;
            this.searchType = request.searchType;
            this.startTime = request.startTime;
        } 

        /**
         * endTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * excludeDomain.
         */
        public Builder excludeDomain(java.util.List<String> excludeDomain) {
            this.putBodyParameter("excludeDomain", excludeDomain);
            this.excludeDomain = excludeDomain;
            return this;
        }

        /**
         * includeDomain.
         */
        public Builder includeDomain(java.util.List<String> includeDomain) {
            this.putBodyParameter("includeDomain", includeDomain);
            this.includeDomain = includeDomain;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putBodyParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * query.
         */
        public Builder query(String query) {
            this.putBodyParameter("query", query);
            this.query = query;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.putBodyParameter("region", region);
            this.region = region;
            return this;
        }

        /**
         * searchType.
         */
        public Builder searchType(String searchType) {
            this.putBodyParameter("searchType", searchType);
            this.searchType = searchType;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(String startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public WebSearchRequest build() {
            return new WebSearchRequest(this);
        } 

    } 

}
