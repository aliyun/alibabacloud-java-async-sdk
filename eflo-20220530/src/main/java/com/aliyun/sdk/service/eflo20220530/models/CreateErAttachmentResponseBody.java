// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link CreateErAttachmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateErAttachmentResponseBody</p>
 */
public class CreateErAttachmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateErAttachmentResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErAttachmentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
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
        private String accessDeniedDetail; 
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateErAttachmentResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.content = model.content;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information about the failed permission verification.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The response status code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is displayed.)</p>
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
         * <p>DBAD15D6-3F47-5B36-8A92-57C2919D13D0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateErAttachmentResponseBody build() {
            return new CreateErAttachmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateErAttachmentResponseBody} extends {@link TeaModel}
     *
     * <p>CreateErAttachmentResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErAttachmentId")
        private String erAttachmentId;

        private Content(Builder builder) {
            this.erAttachmentId = builder.erAttachmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return erAttachmentId
         */
        public String getErAttachmentId() {
            return this.erAttachmentId;
        }

        public static final class Builder {
            private String erAttachmentId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.erAttachmentId = model.erAttachmentId;
            } 

            /**
             * <p>The ID of the network connection instance.</p>
             * 
             * <strong>example:</strong>
             * <p>er-attachment-ggjbfhqv</p>
             */
            public Builder erAttachmentId(String erAttachmentId) {
                this.erAttachmentId = erAttachmentId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
