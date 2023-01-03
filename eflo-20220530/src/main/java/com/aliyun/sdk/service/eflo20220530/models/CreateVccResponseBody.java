// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVccResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVccResponseBody</p>
 */
public class CreateVccResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVccResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVccResponseBody create() {
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
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
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

        public CreateVccResponseBody build() {
            return new CreateVccResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("VccId")
        private String vccId;

        private Content(Builder builder) {
            this.vccId = builder.vccId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return vccId
         */
        public String getVccId() {
            return this.vccId;
        }

        public static final class Builder {
            private String vccId; 

            /**
             * VccId.
             */
            public Builder vccId(String vccId) {
                this.vccId = vccId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
