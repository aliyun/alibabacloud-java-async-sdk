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
 * {@link ListBrowserBookmarksRequest} extends {@link RequestModel}
 *
 * <p>ListBrowserBookmarksRequest</p>
 */
public class ListBrowserBookmarksRequest extends Request {
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

    private ListBrowserBookmarksRequest(Builder builder) {
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

    public static ListBrowserBookmarksRequest create() {
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

    public static final class Builder extends Request.Builder<ListBrowserBookmarksRequest, Builder> {
        private String browserInstanceGroupId; 
        private String browserInstanceGroupSetId; 
        private String keyword; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListBrowserBookmarksRequest request) {
            super(request);
            this.browserInstanceGroupId = request.browserInstanceGroupId;
            this.browserInstanceGroupSetId = request.browserInstanceGroupSetId;
            this.keyword = request.keyword;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The ID of the cloud browser group. You must specify either this parameter or BrowserInstanceGroupSetId, but not both.</p>
         * 
         * <strong>example:</strong>
         * <p>big-0c7loey7fzjq****</p>
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
         * <p>The keyword used for substring matching in bookmark names or URLs. The matching is case-insensitive for English characters. The keyword can be up to 1,024 characters in length after leading and trailing spaces are removed. If this parameter is not specified or contains only spaces, no filtering is applied. Special characters are matched literally.</p>
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
         * <p>The page number of the page to return. Pages start from page 1.</p>
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
         * <p>The number of entries to return on each page. Valid values: 1 to 200.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListBrowserBookmarksRequest build() {
            return new ListBrowserBookmarksRequest(this);
        } 

    } 

}
