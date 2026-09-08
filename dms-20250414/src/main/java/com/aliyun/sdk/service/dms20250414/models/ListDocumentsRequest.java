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
 * {@link ListDocumentsRequest} extends {@link RequestModel}
 *
 * <p>ListDocumentsRequest</p>
 */
public class ListDocumentsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Filters")
    private String filters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KbUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String kbUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamePattern")
    private String namePattern;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortFieldName")
    private String sortFieldName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
    private String sortOrder;

    private ListDocumentsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.filters = builder.filters;
        this.kbUuid = builder.kbUuid;
        this.maxResults = builder.maxResults;
        this.namePattern = builder.namePattern;
        this.nextToken = builder.nextToken;
        this.sortFieldName = builder.sortFieldName;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDocumentsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return filters
     */
    public String getFilters() {
        return this.filters;
    }

    /**
     * @return kbUuid
     */
    public String getKbUuid() {
        return this.kbUuid;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return namePattern
     */
    public String getNamePattern() {
        return this.namePattern;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return sortFieldName
     */
    public String getSortFieldName() {
        return this.sortFieldName;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListDocumentsRequest, Builder> {
        private String regionId; 
        private String filters; 
        private String kbUuid; 
        private Integer maxResults; 
        private String namePattern; 
        private String nextToken; 
        private String sortFieldName; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListDocumentsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.filters = request.filters;
            this.kbUuid = request.kbUuid;
            this.maxResults = request.maxResults;
            this.namePattern = request.namePattern;
            this.nextToken = request.nextToken;
            this.sortFieldName = request.sortFieldName;
            this.sortOrder = request.sortOrder;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The document property filter. The following properties are supported:</p>
         * <ul>
         * <li><p><code>fileExt</code>: The document extension.</p>
         * </li>
         * <li><p><code>state</code>: The document status.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;fileExt&quot;:&quot;pdf&quot;,&quot;state&quot;:0}</p>
         */
        public Builder filters(String filters) {
            this.putBodyParameter("Filters", filters);
            this.filters = filters;
            return this;
        }

        /**
         * <p>The ID of the knowledge base.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>kb-***</p>
         */
        public Builder kbUuid(String kbUuid) {
            this.putBodyParameter("KbUuid", kbUuid);
            this.kbUuid = kbUuid;
            return this;
        }

        /**
         * <p>The maximum number of documents to return per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The document name filter. Returns only documents whose names contain this value.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder namePattern(String namePattern) {
            this.putBodyParameter("NamePattern", namePattern);
            this.namePattern = namePattern;
            return this;
        }

        /**
         * <p>The pagination token to retrieve the next page of results. Omit this parameter to retrieve the first page. A <code>NextToken</code> value in the response indicates that more results are available. To fetch the next page, pass this value in a subsequent request. A <code>null</code> value indicates that all results have been retrieved.</p>
         * 
         * <strong>example:</strong>
         * <p>zCXSmY0CJbybp6FZV7vo0Wjw64X-*****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The sort field. Valid values:</p>
         * <ul>
         * <li><p><code>id</code> (default): The document ID.</p>
         * </li>
         * <li><p><code>hits</code>: The number of hits.</p>
         * </li>
         * <li><p><code>modifyTime</code>: The modification time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>hits</p>
         */
        public Builder sortFieldName(String sortFieldName) {
            this.putBodyParameter("SortFieldName", sortFieldName);
            this.sortFieldName = sortFieldName;
            return this;
        }

        /**
         * <p>The sort order. Valid values:</p>
         * <ul>
         * <li><p><strong>ASC</strong> (default): Sorts in ascending order.</p>
         * </li>
         * <li><p><strong>DESC</strong>: Sorts in descending order.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListDocumentsRequest build() {
            return new ListDocumentsRequest(this);
        } 

    } 

}
