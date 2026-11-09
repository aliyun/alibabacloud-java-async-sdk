// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListBrowserRestrictedURLsRequest} extends {@link RequestModel}
 *
 * <p>ListBrowserRestrictedURLsRequest</p>
 */
public class ListBrowserRestrictedURLsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupId")
    private String browserInstanceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BrowserInstanceGroupSetId")
    private String browserInstanceGroupSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    private ListBrowserRestrictedURLsRequest(Builder builder) {
        super(builder);
        this.browserInstanceGroupId = builder.browserInstanceGroupId;
        this.browserInstanceGroupSetId = builder.browserInstanceGroupSetId;
        this.keyword = builder.keyword;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrowserRestrictedURLsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return browserInstanceGroupId
     */
    public String getBrowserInstanceGroupId() {
        return this.browserInstanceGroupId;
    }

    /**
     * @return browserInstanceGroupSetId
     */
    public String getBrowserInstanceGroupSetId() {
        return this.browserInstanceGroupSetId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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

    public static final class Builder extends Request.Builder<ListBrowserRestrictedURLsRequest, Builder> {
        private String browserInstanceGroupId; 
        private String browserInstanceGroupSetId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListBrowserRestrictedURLsRequest request) {
            super(request);
            this.browserInstanceGroupId = request.browserInstanceGroupId;
            this.browserInstanceGroupSetId = request.browserInstanceGroupSetId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the browser delivery group. You must specify either this parameter or BrowserInstanceGroupSetId, but not both. If you specify this parameter, the restricted URLs configured for the delivery group are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>big-3jm9d0abc00example</p>
         */
        public Builder browserInstanceGroupId(String browserInstanceGroupId) {
            this.putQueryParameter("BrowserInstanceGroupId", browserInstanceGroupId);
            this.browserInstanceGroupId = browserInstanceGroupId;
            return this;
        }

        /**
         * <p>The ID of the browser delivery group set. You must specify either this parameter or BrowserInstanceGroupId, but not both.</p>
         * 
         * <strong>example:</strong>
         * <p>set-3jm9d0abc00example</p>
         */
        public Builder browserInstanceGroupSetId(String browserInstanceGroupSetId) {
            this.putQueryParameter("BrowserInstanceGroupSetId", browserInstanceGroupSetId);
            this.browserInstanceGroupSetId = browserInstanceGroupSetId;
            return this;
        }

        /**
         * <p>The keyword used to filter access control URLs by using a contains match. The match is case-insensitive for English characters. The keyword can be up to 1,024 characters in length after leading and trailing spaces are removed. If you do not specify this parameter or specify only spaces, no filtering is performed. Special characters are matched literally.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The page number during paging. Default value: 0. If the value is less than 1, such as 0, the first page is returned. If the value is less than 0, a parameter error is returned. Set this parameter to 1 or greater.</p>
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
         * <p>The number of records to return on each page during paging. Valid values: 1 to 200. Default value: 200. If the value is less than or equal to 0 or greater than 200, a parameter error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListBrowserRestrictedURLsRequest build() {
            return new ListBrowserRestrictedURLsRequest(this);
        } 

    } 

}
