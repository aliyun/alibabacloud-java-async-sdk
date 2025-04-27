// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListTagResourcesRequest} extends {@link RequestModel}
 *
 * <p>ListTagResourcesRequest</p>
 */
public class ListTagResourcesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @Deprecated
    private Integer page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceIds")
    private String resourceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @Deprecated
    private Integer size;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    private ListTagResourcesRequest(Builder builder) {
        super(builder);
        this.nextToken = builder.nextToken;
        this.page = builder.page;
        this.resourceIds = builder.resourceIds;
        this.resourceType = builder.resourceType;
        this.size = builder.size;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTagResourcesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<ListTagResourcesRequest, Builder> {
        private String nextToken; 
        private Integer page; 
        private String resourceIds; 
        private String resourceType; 
        private Integer size; 
        private String tags; 

        private Builder() {
            super();
        } 

        private Builder(ListTagResourcesRequest request) {
            super(request);
            this.nextToken = request.nextToken;
            this.page = request.page;
            this.resourceIds = request.resourceIds;
            this.resourceType = request.resourceType;
            this.size = request.size;
            this.tags = request.tags;
        } 

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1d2db86sca4384811e0b5e8707e******</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>1d2db86sca4384811e0b5e8707e******</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;es-cn-aaa&quot;,&quot;es-cn-bbb&quot;]</p>
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;,&quot;dev&quot;},{&quot;key&quot;:&quot;dev&quot;, &quot;value&quot;:&quot;IT&quot;}]</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>INSTANCE</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>[&quot;es-cn-aaa&quot;,&quot;es-cn-bbb&quot;]</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * <p>The header of the response. This parameter is empty and is for reference only. You cannot force this parameter to be relied on in the program.</p>
         * <blockquote>
         * <p> The return examples does not contain this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;key&quot;:&quot;env&quot;,&quot;value&quot;,&quot;dev&quot;},{&quot;key&quot;:&quot;dev&quot;,  &quot;value&quot;:&quot;IT&quot;}]</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        @Override
        public ListTagResourcesRequest build() {
            return new ListTagResourcesRequest(this);
        } 

    } 

}
