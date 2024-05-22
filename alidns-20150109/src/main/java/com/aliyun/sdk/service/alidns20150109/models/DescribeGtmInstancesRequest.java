// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmInstancesRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmInstancesRequest</p>
 */
public class DescribeGtmInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NeedDetailAttributes")
    private Boolean needDetailAttributes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DescribeGtmInstancesRequest(Builder builder) {
        super(builder);
        this.keyword = builder.keyword;
        this.lang = builder.lang;
        this.needDetailAttributes = builder.needDetailAttributes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmInstancesRequest create() {
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
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return needDetailAttributes
     */
    public Boolean getNeedDetailAttributes() {
        return this.needDetailAttributes;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DescribeGtmInstancesRequest, Builder> {
        private String keyword; 
        private String lang; 
        private Boolean needDetailAttributes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmInstancesRequest request) {
            super(request);
            this.keyword = request.keyword;
            this.lang = request.lang;
            this.needDetailAttributes = request.needDetailAttributes;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * The keyword that you use for query. Exact match is supported by instance ID or instance name.
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("Keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * The language in which you want the values of some response parameters to be returned. These response parameters support multiple languages.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * Specifies whether additional information is required. Default value: **false**.
         */
        public Builder needDetailAttributes(Boolean needDetailAttributes) {
            this.putQueryParameter("NeedDetailAttributes", needDetailAttributes);
            this.needDetailAttributes = needDetailAttributes;
            return this;
        }

        /**
         * The page number to return.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries to return per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the resource group.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DescribeGtmInstancesRequest build() {
            return new DescribeGtmInstancesRequest(this);
        } 

    } 

}
