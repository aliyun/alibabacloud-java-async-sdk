// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airegistry20260317.models;

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
 * {@link ListPromptsRequest} extends {@link RequestModel}
 *
 * <p>ListPromptsRequest</p>
 */
public class ListPromptsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizTags")
    private String bizTags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PromptKey")
    private String promptKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Search")
    private String search;

    private ListPromptsRequest(Builder builder) {
        super(builder);
        this.bizTags = builder.bizTags;
        this.namespaceId = builder.namespaceId;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.promptKey = builder.promptKey;
        this.search = builder.search;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPromptsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizTags
     */
    public String getBizTags() {
        return this.bizTags;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return promptKey
     */
    public String getPromptKey() {
        return this.promptKey;
    }

    /**
     * @return search
     */
    public String getSearch() {
        return this.search;
    }

    public static final class Builder extends Request.Builder<ListPromptsRequest, Builder> {
        private String bizTags; 
        private String namespaceId; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String promptKey; 
        private String search; 

        private Builder() {
            super();
        } 

        private Builder(ListPromptsRequest request) {
            super(request);
            this.bizTags = request.bizTags;
            this.namespaceId = request.namespaceId;
            this.pageNo = request.pageNo;
            this.pageSize = request.pageSize;
            this.promptKey = request.promptKey;
            this.search = request.search;
        } 

        /**
         * <p>The business tags used to filter prompts. Separate multiple tags with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>cs,qa</p>
         */
        public Builder bizTags(String bizTags) {
            this.putQueryParameter("BizTags", bizTags);
            this.bizTags = bizTags;
            return this;
        }

        /**
         * <p>The namespace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>550e8400-e29b-41d4-a716-446655440000</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The page number. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNo(Integer pageNo) {
            this.putQueryParameter("PageNo", pageNo);
            this.pageNo = pageNo;
            return this;
        }

        /**
         * <p>The number of entries per page. Default value: 10. Maximum value: 50.</p>
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
         * <p>The identifier of the prompt to search for. This parameter is optional.</p>
         * 
         * <strong>example:</strong>
         * <p>customer</p>
         */
        public Builder promptKey(String promptKey) {
            this.putQueryParameter("PromptKey", promptKey);
            this.promptKey = promptKey;
            return this;
        }

        /**
         * <p>The search mode. Valid values:</p>
         * <ul>
         * <li>accurate: exact match.</li>
         * <li>blur: fuzzy match.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>blur</p>
         */
        public Builder search(String search) {
            this.putQueryParameter("Search", search);
            this.search = search;
            return this;
        }

        @Override
        public ListPromptsRequest build() {
            return new ListPromptsRequest(this);
        } 

    } 

}
