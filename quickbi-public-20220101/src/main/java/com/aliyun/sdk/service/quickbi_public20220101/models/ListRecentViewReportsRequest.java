// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRecentViewReportsRequest} extends {@link RequestModel}
 *
 * <p>ListRecentViewReportsRequest</p>
 */
public class ListRecentViewReportsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OffsetDay")
    private Integer offsetDay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QueryMode")
    private String queryMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TreeType")
    private String treeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private ListRecentViewReportsRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.offsetDay = builder.offsetDay;
        this.pageSize = builder.pageSize;
        this.queryMode = builder.queryMode;
        this.treeType = builder.treeType;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRecentViewReportsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return offsetDay
     */
    public Integer getOffsetDay() {
        return this.offsetDay;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return queryMode
     */
    public String getQueryMode() {
        return this.queryMode;
    }

    /**
     * @return treeType
     */
    public String getTreeType() {
        return this.treeType;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<ListRecentViewReportsRequest, Builder> {
        private String keyword; 
        private Integer offsetDay; 
        private Integer pageSize; 
        private String queryMode; 
        private String treeType; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(ListRecentViewReportsRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.offsetDay = request.offsetDay;
            this.pageSize = request.pageSize;
            this.queryMode = request.queryMode;
            this.treeType = request.treeType;
            this.userId = request.userId;
        } 

        /**
         * Keyword.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * OffsetDay.
         */
        public Builder offsetDay(Integer offsetDay) {
            this.putQueryParameter("OffsetDay", offsetDay);
            this.offsetDay = offsetDay;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * QueryMode.
         */
        public Builder queryMode(String queryMode) {
            this.putQueryParameter("QueryMode", queryMode);
            this.queryMode = queryMode;
            return this;
        }

        /**
         * TreeType.
         */
        public Builder treeType(String treeType) {
            this.putQueryParameter("TreeType", treeType);
            this.treeType = treeType;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public ListRecentViewReportsRequest build() {
            return new ListRecentViewReportsRequest(this);
        } 

    } 

}
