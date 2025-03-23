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
 * {@link QueryProductInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryProductInfoResponseBody</p>
 */
public class QueryProductInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ProductInfo")
    private ProductInfo productInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryProductInfoResponseBody(Builder builder) {
        this.productInfo = builder.productInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryProductInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return productInfo
     */
    public ProductInfo getProductInfo() {
        return this.productInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ProductInfo productInfo; 
        private String requestId; 

        /**
         * ProductInfo.
         */
        public Builder productInfo(ProductInfo productInfo) {
            this.productInfo = productInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryProductInfoResponseBody build() {
            return new QueryProductInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryProductInfoResponseBody} extends {@link TeaModel}
     *
     * <p>QueryProductInfoResponseBody</p>
     */
    public static class ProductInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EncodedIcon")
        private String encodedIcon;

        @com.aliyun.core.annotation.NameInMap("IconName")
        private String iconName;

        @com.aliyun.core.annotation.NameInMap("IndustryId")
        private Integer industryId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Readonly")
        private Boolean readonly;

        private ProductInfo(Builder builder) {
            this.encodedIcon = builder.encodedIcon;
            this.iconName = builder.iconName;
            this.industryId = builder.industryId;
            this.name = builder.name;
            this.readonly = builder.readonly;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProductInfo create() {
            return builder().build();
        }

        /**
         * @return encodedIcon
         */
        public String getEncodedIcon() {
            return this.encodedIcon;
        }

        /**
         * @return iconName
         */
        public String getIconName() {
            return this.iconName;
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
         * @return readonly
         */
        public Boolean getReadonly() {
            return this.readonly;
        }

        public static final class Builder {
            private String encodedIcon; 
            private String iconName; 
            private Integer industryId; 
            private String name; 
            private Boolean readonly; 

            /**
             * EncodedIcon.
             */
            public Builder encodedIcon(String encodedIcon) {
                this.encodedIcon = encodedIcon;
                return this;
            }

            /**
             * IconName.
             */
            public Builder iconName(String iconName) {
                this.iconName = iconName;
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
}
