// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductByTagsRequest} extends {@link RequestModel}
 *
 * <p>ListProductByTagsRequest</p>
 */
public class ListProductByTagsRequest extends Request {
    @Query
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ProductTag")
    @Validation(required = true)
    private java.util.List < ProductTag> productTag;

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
    public java.util.List < ProductTag> getProductTag() {
        return this.productTag;
    }

    public static final class Builder extends Request.Builder<ListProductByTagsRequest, Builder> {
        private Integer currentPage; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private java.util.List < ProductTag> productTag; 

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
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
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
         * ProductTag.
         */
        public Builder productTag(java.util.List < ProductTag> productTag) {
            this.putQueryParameter("ProductTag", productTag);
            this.productTag = productTag;
            return this;
        }

        @Override
        public ListProductByTagsRequest build() {
            return new ListProductByTagsRequest(this);
        } 

    } 

    public static class ProductTag extends TeaModel {
        @NameInMap("TagKey")
        @Validation(required = true)
        private String tagKey;

        @NameInMap("TagValue")
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

            /**
             * TagKey.
             */
            public Builder tagKey(String tagKey) {
                this.tagKey = tagKey;
                return this;
            }

            /**
             * TagValue.
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
