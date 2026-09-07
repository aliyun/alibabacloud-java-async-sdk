// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(CreateWmBaseImageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The transparent image information.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>58D6B23E-E5DA-5418-8F61-51A3B5A30049</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.imageId = model.imageId;
                this.imageUrl = model.imageUrl;
                this.imageUrlExp = model.imageUrlExp;
            } 

            /**
             * <p>The transparent image ID. The same ID indicates that the image content is identical.</p>
             * 
             * <strong>example:</strong>
             * <p>fafb432cdede9b20640e12105845386e-496883833-8242409229217337*****</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            /**
             * <p>The temporary URL for downloading the image.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/test-*****.png">https://example.com/test-*****.png</a></p>
             */
            public Builder imageUrl(String imageUrl) {
                this.imageUrl = imageUrl;
                return this;
            }

            /**
             * <p>The expiration time of the temporary image URL, in UNIX timestamp format. Unit: seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>17185*****</p>
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
