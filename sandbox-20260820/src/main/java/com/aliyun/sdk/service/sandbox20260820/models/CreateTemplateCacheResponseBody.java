// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sandbox20260820.models;

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
 * {@link CreateTemplateCacheResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTemplateCacheResponseBody</p>
 */
public class CreateTemplateCacheResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("templateCache")
    private PublicTemplateCache templateCache;

    private CreateTemplateCacheResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.templateCache = builder.templateCache;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateCacheResponseBody create() {
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
     * @return templateCache
     */
    public PublicTemplateCache getTemplateCache() {
        return this.templateCache;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private PublicTemplateCache templateCache; 

        private Builder() {
        } 

        private Builder(CreateTemplateCacheResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
            this.templateCache = model.templateCache;
        } 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * templateCache.
         */
        public Builder templateCache(PublicTemplateCache templateCache) {
            this.templateCache = templateCache;
            return this;
        }

        public CreateTemplateCacheResponseBody build() {
            return new CreateTemplateCacheResponseBody(this);
        } 

    } 

}
