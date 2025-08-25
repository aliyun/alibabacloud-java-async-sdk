// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageenhan20190930.models;

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
 * {@link GenerateImageWithTextResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateImageWithTextResponseBody</p>
 */
public class GenerateImageWithTextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateImageWithTextResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateImageWithTextResponseBody create() {
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

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateImageWithTextResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GenerateImageWithTextResponseBody build() {
            return new GenerateImageWithTextResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GenerateImageWithTextResponseBody} extends {@link TeaModel}
     *
     * <p>GenerateImageWithTextResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ImageUrls")
        private java.util.List<String> imageUrls;

        private Data(Builder builder) {
            this.imageUrls = builder.imageUrls;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return imageUrls
         */
        public java.util.List<String> getImageUrls() {
            return this.imageUrls;
        }

        public static final class Builder {
            private java.util.List<String> imageUrls; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.imageUrls = model.imageUrls;
            } 

            /**
             * ImageUrls.
             */
            public Builder imageUrls(java.util.List<String> imageUrls) {
                this.imageUrls = imageUrls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
