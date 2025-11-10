// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openapiexplorer20241130.models;

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
 * {@link ListApiMcpServersRequest} extends {@link RequestModel}
 *
 * <p>ListApiMcpServersRequest</p>
 */
public class ListApiMcpServersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("skip")
    private Integer skip;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private ListApiMcpServersRequest(Builder builder) {
        super(builder);
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.id = builder.id;
        this.keyword = builder.keyword;
        this.language = builder.language;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.skip = builder.skip;
        this.sourceType = builder.sourceType;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListApiMcpServersRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
     * @return skip
     */
    public Integer getSkip() {
        return this.skip;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder extends Request.Builder<ListApiMcpServersRequest, Builder> {
        private String createTime; 
        private String description; 
        private String id; 
        private String keyword; 
        private String language; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer skip; 
        private String sourceType; 
        private String updateTime; 

        private Builder() {
            super();
        } 

        private Builder(ListApiMcpServersRequest request) {
            super(request);
            this.createTime = request.createTime;
            this.description = request.description;
            this.id = request.id;
            this.keyword = request.keyword;
            this.language = request.language;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.skip = request.skip;
            this.sourceType = request.sourceType;
            this.updateTime = request.updateTime;
        } 

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.putQueryParameter("createTime", createTime);
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putQueryParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.putQueryParameter("id", id);
            this.id = id;
            return this;
        }

        /**
         * keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * language.
         */
        public Builder language(String language) {
            this.putQueryParameter("language", language);
            this.language = language;
            return this;
        }

        /**
         * maxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * skip.
         */
        public Builder skip(Integer skip) {
            this.putQueryParameter("skip", skip);
            this.skip = skip;
            return this;
        }

        /**
         * sourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.putQueryParameter("updateTime", updateTime);
            this.updateTime = updateTime;
            return this;
        }

        @Override
        public ListApiMcpServersRequest build() {
            return new ListApiMcpServersRequest(this);
        } 

    } 

}
