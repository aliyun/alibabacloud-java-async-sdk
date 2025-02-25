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
 * {@link DescribeDomainsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDomainsRequest</p>
 */
public class DescribeDomainsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Long pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SearchMode")
    private String searchMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Starmark")
    private Boolean starmark;

    private DescribeDomainsRequest(Builder builder) {
        super(builder);
        this.groupId = builder.groupId;
        this.keyWord = builder.keyWord;
        this.lang = builder.lang;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.searchMode = builder.searchMode;
        this.starmark = builder.starmark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return searchMode
     */
    public String getSearchMode() {
        return this.searchMode;
    }

    /**
     * @return starmark
     */
    public Boolean getStarmark() {
        return this.starmark;
    }

    public static final class Builder extends Request.Builder<DescribeDomainsRequest, Builder> {
        private String groupId; 
        private String keyWord; 
        private String lang; 
        private Long pageNumber; 
        private Long pageSize; 
        private String resourceGroupId; 
        private String searchMode; 
        private Boolean starmark; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDomainsRequest request) {
            super(request);
            this.groupId = request.groupId;
            this.keyWord = request.keyWord;
            this.lang = request.lang;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.searchMode = request.searchMode;
            this.starmark = request.starmark;
        } 

        /**
         * <p>The ID of the domain name group. If you do not specify this parameter, all domain names are queried by default.</p>
         * 
         * <strong>example:</strong>
         * <p>2223</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The keyword for searches in &quot;%KeyWord%&quot; mode. The value is not case-sensitive.</p>
         * 
         * <strong>example:</strong>
         * <p>com</p>
         */
        public Builder keyWord(String keyWord) {
            this.putQueryParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The language type.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The number of the page to return. Pages start from page <strong>1</strong>. Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: <strong>100</strong>. Default value: <strong>20</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-resourcegroupid01</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The search mode. Valid values:</p>
         * <ul>
         * <li><strong>LIKE</strong>: fuzzy match.</li>
         * <li><strong>EXACT</strong>: exact match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>LIKE</p>
         */
        public Builder searchMode(String searchMode) {
            this.putQueryParameter("SearchMode", searchMode);
            this.searchMode = searchMode;
            return this;
        }

        /**
         * <p>Specifies whether to query the starmark of the domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder starmark(Boolean starmark) {
            this.putQueryParameter("Starmark", starmark);
            this.starmark = starmark;
            return this;
        }

        @Override
        public DescribeDomainsRequest build() {
            return new DescribeDomainsRequest(this);
        } 

    } 

}
