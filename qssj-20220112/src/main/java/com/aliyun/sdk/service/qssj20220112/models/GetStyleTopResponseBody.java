// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStyleTopResponseBody} extends {@link TeaModel}
 *
 * <p>GetStyleTopResponseBody</p>
 */
public class GetStyleTopResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessResponse")
    private String successResponse;

    private GetStyleTopResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.successResponse = builder.successResponse;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStyleTopResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successResponse
     */
    public String getSuccessResponse() {
        return this.successResponse;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private String successResponse; 

        /**
         * Id of the request
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * SuccessResponse.
         */
        public Builder successResponse(String successResponse) {
            this.successResponse = successResponse;
            return this;
        }

        public GetStyleTopResponseBody build() {
            return new GetStyleTopResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CateName")
        private String cateName;

        @NameInMap("Color")
        private String color;

        @NameInMap("Images")
        private java.util.List < String > images;

        @NameInMap("Material")
        private String material;

        @NameInMap("ProductLink")
        private String productLink;

        @NameInMap("SalesVolume")
        private Double salesVolume;

        @NameInMap("SearchVolume")
        private Double searchVolume;

        @NameInMap("Style")
        private String style;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.cateName = builder.cateName;
            this.color = builder.color;
            this.images = builder.images;
            this.material = builder.material;
            this.productLink = builder.productLink;
            this.salesVolume = builder.salesVolume;
            this.searchVolume = builder.searchVolume;
            this.style = builder.style;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cateName
         */
        public String getCateName() {
            return this.cateName;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return images
         */
        public java.util.List < String > getImages() {
            return this.images;
        }

        /**
         * @return material
         */
        public String getMaterial() {
            return this.material;
        }

        /**
         * @return productLink
         */
        public String getProductLink() {
            return this.productLink;
        }

        /**
         * @return salesVolume
         */
        public Double getSalesVolume() {
            return this.salesVolume;
        }

        /**
         * @return searchVolume
         */
        public Double getSearchVolume() {
            return this.searchVolume;
        }

        /**
         * @return style
         */
        public String getStyle() {
            return this.style;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cateName; 
            private String color; 
            private java.util.List < String > images; 
            private String material; 
            private String productLink; 
            private Double salesVolume; 
            private Double searchVolume; 
            private String style; 
            private String title; 

            /**
             * CateName.
             */
            public Builder cateName(String cateName) {
                this.cateName = cateName;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Images.
             */
            public Builder images(java.util.List < String > images) {
                this.images = images;
                return this;
            }

            /**
             * Material.
             */
            public Builder material(String material) {
                this.material = material;
                return this;
            }

            /**
             * ProductLink.
             */
            public Builder productLink(String productLink) {
                this.productLink = productLink;
                return this;
            }

            /**
             * SalesVolume.
             */
            public Builder salesVolume(Double salesVolume) {
                this.salesVolume = salesVolume;
                return this;
            }

            /**
             * SearchVolume.
             */
            public Builder searchVolume(Double searchVolume) {
                this.searchVolume = searchVolume;
                return this;
            }

            /**
             * Style.
             */
            public Builder style(String style) {
                this.style = style;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
