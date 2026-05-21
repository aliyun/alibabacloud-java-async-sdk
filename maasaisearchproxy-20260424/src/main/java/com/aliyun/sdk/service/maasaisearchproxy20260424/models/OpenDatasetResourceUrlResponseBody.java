// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maasaisearchproxy20260424.models;

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
 * {@link OpenDatasetResourceUrlResponseBody} extends {@link TeaModel}
 *
 * <p>OpenDatasetResourceUrlResponseBody</p>
 */
public class OpenDatasetResourceUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private OpenDatasetResourceUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenDatasetResourceUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
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
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(OpenDatasetResourceUrlResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public OpenDatasetResourceUrlResponseBody build() {
            return new OpenDatasetResourceUrlResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link OpenDatasetResourceUrlResponseBody} extends {@link TeaModel}
     *
     * <p>OpenDatasetResourceUrlResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Data(Builder builder) {
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String url; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.url = model.url;
            } 

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
