// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mhub20170825.models;

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
 * {@link ListProductsResponseBody} extends {@link TeaModel}
 *
 * <p>ListProductsResponseBody</p>
 */
public class ListProductsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductInfos")
    private ProductInfos productInfos;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("UbsmsStatus")
    private String ubsmsStatus;

    private ListProductsResponseBody(Builder builder) {
        this.productInfos = builder.productInfos;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.ubsmsStatus = builder.ubsmsStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductsResponseBody create() {
        return builder().build();
    }

    /**
     * @return productInfos
     */
    public ProductInfos getProductInfos() {
        return this.productInfos;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return ubsmsStatus
     */
    public String getUbsmsStatus() {
        return this.ubsmsStatus;
    }

    public static final class Builder {
        private ProductInfos productInfos; 
        private String requestId; 
        private Integer total; 
        private String ubsmsStatus; 

        /**
         * ProductInfos.
         */
        public Builder productInfos(ProductInfos productInfos) {
            this.productInfos = productInfos;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * UbsmsStatus.
         */
        public Builder ubsmsStatus(String ubsmsStatus) {
            this.ubsmsStatus = ubsmsStatus;
            return this;
        }

        public ListProductsResponseBody build() {
            return new ListProductsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EncodedIcon")
        private String encodedIcon;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Integer industryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Platforms")
        private String platforms;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private Integer productId;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        private ProductInfo(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.encodedIcon = builder.encodedIcon;
            this.industryId = builder.industryId;
            this.name = builder.name;
            this.platforms = builder.platforms;
            this.productId = builder.productId;
            this.readonly = builder.readonly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return encodedIcon
         */
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        /**
         * @return industryId
         */
        public Integer getIndustryId() {
            return this.industryId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return platforms
         */
        public String getPlatforms() {
            return this.platforms;
        }

        /**
         * @return productId
         */
        public Integer getProductId() {
            return this.productId;
        }

        /**
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String encodedIcon; 
            private Integer industryId; 
            private String name; 
            private String platforms; 
            private Integer productId; 
            private Boolean readonly; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EncodedIcon.
             */
            public Builder encodedIcon(String encodedIcon) {
                this.encodedIcon = encodedIcon;
                return this;
            }

            /**
             * IndustryId.
             */
            public Builder industryId(Integer industryId) {
                this.industryId = industryId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Platforms.
             */
            public Builder platforms(String platforms) {
                this.platforms = platforms;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(Integer productId) {
                this.productId = productId;
                return this;
            }

            /**
             * Readonly.
             */
            public Builder readonly(Boolean readonly) {
                this.readonly = readonly;
                return this;
            }

            public ProductInfo build() {
                return new ProductInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListProductsResponseBody} extends {@link TeaModel}
     *
     * <p>ListProductsResponseBody</p>
     */
    public static class ProductInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProductInfo")
        private java.util.List<ProductInfo> productInfo;

        private ProductInfos(Builder builder) {
            this.productInfo = builder.productInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfos create() {
            return builder().build();
        }

        /**
         * @return productInfo
         */
        public java.util.List<ProductInfo> getProductInfo() {
            return this.productInfo;
        }

        public static final class Builder {
            private java.util.List<ProductInfo> productInfo; 

            /**
             * ProductInfo.
             */
            public Builder productInfo(java.util.List<ProductInfo> productInfo) {
                this.productInfo = productInfo;
                return this;
            }

            public ProductInfos build() {
                return new ProductInfos(this);
            } 

        } 

    }
}
