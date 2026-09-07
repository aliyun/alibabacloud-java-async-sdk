// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListSoftwarelibSoftwareRequest} extends {@link RequestModel}
 *
 * <p>ListSoftwarelibSoftwareRequest</p>
 */
public class ListSoftwarelibSoftwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClassifyId")
    private String classifyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Os")
    private String os;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SoftwareName")
    private String softwareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    private ListSoftwarelibSoftwareRequest(Builder builder) {
        super(builder);
        this.classifyId = builder.classifyId;
        this.currentPage = builder.currentPage;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.os = builder.os;
        this.pageSize = builder.pageSize;
        this.softwareName = builder.softwareName;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwarelibSoftwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classifyId
     */
    public String getClassifyId() {
        return this.classifyId;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
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
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return softwareName
     */
    public String getSoftwareName() {
        return this.softwareName;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListSoftwarelibSoftwareRequest, Builder> {
        private String classifyId; 
        private Long currentPage; 
        private Integer maxResults; 
        private String nextToken; 
        private String os; 
        private Long pageSize; 
        private String softwareName; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListSoftwarelibSoftwareRequest request) {
            super(request);
            this.classifyId = request.classifyId;
            this.currentPage = request.currentPage;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.os = request.os;
            this.pageSize = request.pageSize;
            this.softwareName = request.softwareName;
            this.sourceType = request.sourceType;
        } 

        /**
         * <p>The software classification ID. You can call <a href="~~ListSoftwarelibClassify~~">ListSoftwarelibClassify</a> to obtain the value.</p>
         * 
         * <strong>example:</strong>
         * <p>softwarelib-classify-61b7ccc63cae****</p>
         */
        public Builder classifyId(String classifyId) {
            this.putQueryParameter("ClassifyId", classifyId);
            this.classifyId = classifyId;
            return this;
        }

        /**
         * <p>The page number of the current page in a paging query. Valid values: 1 to 10000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The maximum number of entries per page. This parameter is not supported by this operation. Use CurrentPage and PageSize for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. This parameter is not supported by this operation. Use CurrentPage and PageSize for pagination.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAARbaCuN6hiD08qrLdwJ9Fh27/Jy4SXvlU9WgqeV7az+t</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The operating system to which the software package applies. Valid values:</p>
         * <ul>
         * <li><strong>Windows</strong>: Windows.</li>
         * <li><strong>Mac(Apple)</strong>: macOS with Apple silicon.</li>
         * <li><strong>Mac(Intel)</strong>: macOS with Intel processors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        public Builder os(String os) {
            this.putQueryParameter("Os", os);
            this.os = os;
            return this;
        }

        /**
         * <p>The number of entries per page in a paging query. Valid values: 1 to 500.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The software name. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Thunder</p>
         */
        public Builder softwareName(String softwareName) {
            this.putQueryParameter("SoftwareName", softwareName);
            this.softwareName = softwareName;
            return this;
        }

        /**
         * <p>The software source. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: custom software.</li>
         * <li><strong>builtin</strong>: built-in software library.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>builtin</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListSoftwarelibSoftwareRequest build() {
            return new ListSoftwarelibSoftwareRequest(this);
        } 

    } 

}
