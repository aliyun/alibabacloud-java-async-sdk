// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link ListDataAgentThemeRequest} extends {@link RequestModel}
 *
 * <p>ListDataAgentThemeRequest</p>
 */
public class ListDataAgentThemeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeFrom")
    private String themeFrom;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThemeType")
    private String themeType;

    private ListDataAgentThemeRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.themeFrom = builder.themeFrom;
        this.themeType = builder.themeType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAgentThemeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
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
     * @return themeFrom
     */
    public String getThemeFrom() {
        return this.themeFrom;
    }

    /**
     * @return themeType
     */
    public String getThemeType() {
        return this.themeType;
    }

    public static final class Builder extends Request.Builder<ListDataAgentThemeRequest, Builder> {
        private String category; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String themeFrom; 
        private String themeType; 

        private Builder() {
            super();
        } 

        private Builder(ListDataAgentThemeRequest request) {
            super(request);
            this.category = request.category;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.themeFrom = request.themeFrom;
            this.themeType = request.themeType;
        } 

        /**
         * <p>The common scenarios. Valid values: report, infographic, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>report</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p><strong>[Not supported]</strong> The page size. Maximum value: 100.</p>
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
         * <p><strong>[Not supported]</strong> The pagination token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> has a return value, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>f056501ada12****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The current page number.</p>
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
         * <p>The current page size.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The source of the theme. Valid values:</p>
         * <ul>
         * <li>system</li>
         * <li>custom</li>
         * <li>derived</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>custom</p>
         */
        public Builder themeFrom(String themeFrom) {
            this.putQueryParameter("ThemeFrom", themeFrom);
            this.themeFrom = themeFrom;
            return this;
        }

        /**
         * <p>The theme stage. Valid values:</p>
         * <ul>
         * <li>design: contains only design.md.</li>
         * <li>template: complete and renderable.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>template</p>
         */
        public Builder themeType(String themeType) {
            this.putQueryParameter("ThemeType", themeType);
            this.themeType = themeType;
            return this;
        }

        @Override
        public ListDataAgentThemeRequest build() {
            return new ListDataAgentThemeRequest(this);
        } 

    } 

}
