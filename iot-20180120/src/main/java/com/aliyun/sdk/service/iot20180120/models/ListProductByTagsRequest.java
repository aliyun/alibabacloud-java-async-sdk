// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link ListProductByTagsRequest} extends {@link RequestModel}
 *
 * <p>ListProductByTagsRequest</p>
 */
public class ListProductByTagsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ProductTag> productTag;

    private ListProductByTagsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.productTag = builder.productTag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductByTagsRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productTag
     */
    public java.util.List<ProductTag> getProductTag() {
        return this.productTag;
    }

    public static final class Builder extends Request.Builder<ListProductByTagsRequest, Builder> {
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private java.util.List<ProductTag> productTag; 

        private Builder() {
            super();
        } 

        private Builder(ListProductByTagsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.productTag = request.productTag;
        } 

        /**
         * <p>The number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-v64***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Maximum value: 50.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder productTag(java.util.List<ProductTag> productTag) {
            this.putQueryParameter("ProductTag", productTag);
            this.productTag = productTag;
            return this;
        }

        @Override
        public ListProductByTagsRequest build() {
            return new ListProductByTagsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListProductByTagsRequest} extends {@link TeaModel}
     *
     * <p>ListProductByTagsRequest</p>
     */
    public static class ProductTag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagKey")
        @com.aliyun.core.annotation.Validation(required = true)
        private String tagKey;

        @com.aliyun.core.annotation.NameInMap("TagValue")
        private String tagValue;

        private ProductTag(Builder builder) {
            this.tagKey = builder.tagKey;
            this.tagValue = builder.tagValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductTag create() {
            return builder().build();
        }

        /**
         * @return tagKey
         */
        public String getTagKey() {
            return this.tagKey;
        }

        /**
         * @return tagValue
         */
        public String getTagValue() {
            return this.tagValue;
        }

        public static final class Builder {
            private String tagKey; 
            private String tagValue; 

            private Builder() {
            } 

            private Builder(ProductTag model) {
                this.tagKey = model.tagKey;
                this.tagValue = model.tagValue;
            } 

            /**
             * <p>The keys of the product tags.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>room</p>
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * <p>The values of the product tags.</p>
             * 
             * <strong>example:</strong>
             * <p>102</p>
             */
            public Builder tagValue(String tagValue) {
                this.tagValue = tagValue;
                return this;
            }

            public ProductTag build() {
                return new ProductTag(this);
            } 

        } 

    }
}
