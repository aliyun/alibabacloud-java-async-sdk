// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateWmBaseImageResponseBody} extends {@link TeaModel}
 *
 * <p>CreateWmBaseImageResponseBody</p>
 */
public class CreateWmBaseImageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateWmBaseImageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWmBaseImageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateWmBaseImageResponseBody build() {
            return new CreateWmBaseImageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateWmBaseImageResponseBody} extends {@link TeaModel}
     *
     * <p>CreateWmBaseImageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageId")
        private String imageId;

        @com.aliyun.core.annotation.NameInMap("ImageUrl")
        private String imageUrl;

        @com.aliyun.core.annotation.NameInMap("ImageUrlExp")
        private Long imageUrlExp;

        private Data(Builder builder) {
            this.imageId = builder.imageId;
            this.imageUrl = builder.imageUrl;
            this.imageUrlExp = builder.imageUrlExp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        /**
         * @return imageUrl
         */
        public String getImageUrl() {
            return this.imageUrl;
        }

        /**
         * @return imageUrlExp
         */
        public Long getImageUrlExp() {
            return this.imageUrlExp;
        }

        public static final class Builder {
            private String imageId; 
            private String imageUrl; 
            private Long imageUrlExp; 

            /**
             * ImageId.
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * ImageUrl.
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * ImageUrlExp.
             */
            public Builder imageUrlExp(Long imageUrlExp) {
                this.imageUrlExp = imageUrlExp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
