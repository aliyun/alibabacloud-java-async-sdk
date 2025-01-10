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
 * {@link CreateErRouteMapResponseBody} extends {@link TeaModel}
 *
 * <p>CreateErRouteMapResponseBody</p>
 */
public class CreateErRouteMapResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateErRouteMapResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateErRouteMapResponseBody create() {
        return builder().build();
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
        private Integer code; 
        private Content content; 
        private String message; 
        private String requestId; 

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
         * <p>The response parameters.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The error message. (If the instance is in the Exception state, the exception cause is prompted.)</p>
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
         * <p>039C3C3A-3C37-5672-80D5-D8CD48C676D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateErRouteMapResponseBody build() {
            return new CreateErRouteMapResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateErRouteMapResponseBody} extends {@link TeaModel}
     *
     * <p>CreateErRouteMapResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErRouteMapId")
        private String erRouteMapId;

        private Content(Builder builder) {
            this.erRouteMapId = builder.erRouteMapId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return erRouteMapId
         */
        public String getErRouteMapId() {
            return this.erRouteMapId;
        }

        public static final class Builder {
            private String erRouteMapId; 

            /**
             * <p>routing policy ID</p>
             * 
             * <strong>example:</strong>
             * <p>er-rmap-uwglhzom</p>
             */
            public Builder erRouteMapId(String erRouteMapId) {
                this.erRouteMapId = erRouteMapId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
