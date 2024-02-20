// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imageenhan20190930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateImageWithTextResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateImageWithTextResponseBody</p>
 */
public class GenerateImageWithTextResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

    public static class Data extends TeaModel {
        @NameInMap("ImageUrls")
        private java.util.List < String > imageUrls;

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
        public java.util.List < String > getImageUrls() {
            return this.imageUrls;
        }

        public static final class Builder {
            private java.util.List < String > imageUrls; 

            /**
             * ImageUrls.
             */
            public Builder imageUrls(java.util.List < String > imageUrls) {
                this.imageUrls = imageUrls;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
