// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
 * {@link DeleteImageCacheResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteImageCacheResponseBody</p>
 */
public class DeleteImageCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    @com.aliyun.core.annotation.Validation(required = true)
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean success;

    private DeleteImageCacheResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageCacheResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteImageCacheResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business response code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of deleting the image cache.</p>
         * <p>This parameter is required.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which is used for troubleshooting.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>req-example</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. This does not mean that the cache creation is complete.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteImageCacheResponseBody build() {
            return new DeleteImageCacheResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteImageCacheResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteImageCacheResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deletionPending")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean deletionPending;

        @com.aliyun.core.annotation.NameInMap("imageId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String imageId;

        private Data(Builder builder) {
            this.deletionPending = builder.deletionPending;
            this.imageId = builder.imageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deletionPending
         */
        public Boolean getDeletionPending() {
            return this.deletionPending;
        }

        /**
         * @return imageId
         */
        public String getImageId() {
            return this.imageId;
        }

        public static final class Builder {
            private Boolean deletionPending; 
            private String imageId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deletionPending = model.deletionPending;
                this.imageId = model.imageId;
            } 

            /**
             * <p>Indicates whether the deletion is still in progress. A value of true indicates that the deletion is accepted but not yet complete, and a Get request returns DELETING until ImageCacheNotFound is explicitly returned. A value of false indicates that the current workspace is deleted or no longer exists.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deletionPending(Boolean deletionPending) {
                this.deletionPending = deletionPending;
                return this;
            }

            /**
             * <p>The image cache ID, which matches the request. The requested ID is still returned even if the current workspace no longer exists.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>img-example</p>
             */
            public Builder imageId(String imageId) {
                this.imageId = imageId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
