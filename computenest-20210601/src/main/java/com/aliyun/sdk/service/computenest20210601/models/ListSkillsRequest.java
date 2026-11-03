// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenest20210601.models;

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
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private java.util.List<Filter> filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDownloadUrl")
    private Boolean needDownloadUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    private ListSkillsRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.maxResults = builder.maxResults;
        this.needDownloadUrl = builder.needDownloadUrl;
        this.nextToken = builder.nextToken;
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
     * @return filter
     */
    public java.util.List<Filter> getFilter() {
        return this.filter;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return needDownloadUrl
     */
    public Boolean getNeedDownloadUrl() {
        return this.needDownloadUrl;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    public static final class Builder extends Request.Builder<ListSkillsRequest, Builder> {
        private java.util.List<Filter> filter; 
        private Integer maxResults; 
        private Boolean needDownloadUrl; 
        private String nextToken; 

        private Builder() {
            super();
        } 

        private Builder(ListSkillsRequest request) {
            super(request);
            this.filter = request.filter;
            this.maxResults = request.maxResults;
            this.needDownloadUrl = request.needDownloadUrl;
            this.nextToken = request.nextToken;
        } 

        /**
         * <p>The filter.</p>
         */
        public Builder filter(java.util.List<Filter> filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in this request.</p>
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
         * <p>Specifies whether to include the download URL for the Skill package.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder needDownloadUrl(Boolean needDownloadUrl) {
            this.putQueryParameter("NeedDownloadUrl", needDownloadUrl);
            this.needDownloadUrl = needDownloadUrl;
            return this;
        }

        /**
         * <p>NextToken</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAWns8w4MmhzeptXVRG0PUEU=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        @Override
        public ListSkillsRequest build() {
            return new ListSkillsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListSkillsRequest} extends {@link TeaModel}
     *
     * <p>ListSkillsRequest</p>
     */
    public static class Filter extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private java.util.List<String> value;

        private Filter(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filter create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public java.util.List<String> getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private java.util.List<String> value; 

            private Builder() {
            } 

            private Builder(Filter model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>The filter name. You can specify one or more names for the query. Valid values:</p>
             * <ul>
             * <li><p>SkillId: the Skill ID. Exact match.</p>
             * </li>
             * <li><p>SkillSpaceId: the SkillSpace ID. Exact match.</p>
             * </li>
             * <li><p>SkillName: the Skill name.</p>
             * </li>
             * <li><p>MatchType: the match type that controls how SkillName is matched. Valid values: exact, prefix, and fuzzy.</p>
             * </li>
             * <li><p>SkillType: the Skill type. Valid values: official and custom.</p>
             * </li>
             * <li><p>Keyword: keyword match for the Skill name or Skill description. Fuzzy match.</p>
             * </li>
             * <li><p>SkillLabels: the Skill labels. Fuzzy match.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SkillId</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The list of filter values. Valid values of N: 1 to 10.</p>
             */
            public Builder value(java.util.List<String> value) {
                this.value = value;
                return this;
            }

            public Filter build() {
                return new Filter(this);
            } 

        } 

    }
}
