// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link PublishProductResponseBody} extends {@link TeaModel}
 *
 * <p>PublishProductResponseBody</p>
 */
public class PublishProductResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PublishProductResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishProductResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PublishProductResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Ok</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The response message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>393E2630-DBE7-5221-AB35-9E740675491A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PublishProductResponseBody build() {
            return new PublishProductResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PublishProductResponseBody} extends {@link TeaModel}
     *
     * <p>PublishProductResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("publicationId")
        private String publicationId;

        private Data(Builder builder) {
            this.publicationId = builder.publicationId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return publicationId
         */
        public String getPublicationId() {
            return this.publicationId;
        }

        public static final class Builder {
            private String publicationId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.publicationId = model.publicationId;
            } 

            /**
             * <p>The publication record ID, which identifies the publication relationship between the published API product and the target portal. You can query this ID in the response of ListProductPublications at /himarket/v1/products/{productId}/publications. You can also use this ID as the publicationId path parameter in UnpublishProduct to unpublish the record.</p>
             * 
             * <strong>example:</strong>
             * <p>publication-xxxxxxxx</p>
             */
            public Builder publicationId(String publicationId) {
                this.publicationId = publicationId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
