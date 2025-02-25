// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeKeywordRequest} extends {@link RequestModel}
 *
 * <p>DescribeKeywordRequest</p>
 */
public class DescribeKeywordRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("Keyword")
    private String keyword;

    @Query
    @NameInMap("KeywordLibId")
    @Validation(required = true)
    private Integer keywordLibId;

    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SourceIp")
    private String sourceIp;

    @Query
    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeKeywordRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.keyword = builder.keyword;
        this.keywordLibId = builder.keywordLibId;
        this.lang = builder.lang;
        this.pageSize = builder.pageSize;
        this.sourceIp = builder.sourceIp;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeKeywordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
    }

    /**
     * @return keywordLibId
     */
    public Integer getKeywordLibId() {
        return this.keywordLibId;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder extends Request.Builder<DescribeKeywordRequest, Builder> {
        private Integer currentPage; 
        private String keyword; 
        private Integer keywordLibId; 
        private String lang; 
        private Integer pageSize; 
        private String sourceIp; 
        private Integer totalCount; 

        private Builder() {
            super();
        } 

        private Builder(DescribeKeywordRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.keyword = request.keyword;
            this.keywordLibId = request.keywordLibId;
            this.lang = request.lang;
            this.pageSize = request.pageSize;
            this.sourceIp = request.sourceIp;
            this.totalCount = request.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
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
         * KeywordLibId.
         */
        public Builder keywordLibId(Integer keywordLibId) {
            this.putQueryParameter("KeywordLibId", keywordLibId);
            this.keywordLibId = keywordLibId;
            return this;
        }

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
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
         * SourceIp.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.putQueryParameter("TotalCount", totalCount);
            this.totalCount = totalCount;
            return this;
        }

        @Override
        public DescribeKeywordRequest build() {
            return new DescribeKeywordRequest(this);
        } 

    } 

}
