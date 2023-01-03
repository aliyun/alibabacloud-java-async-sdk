// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVpdResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVpdResponseBody</p>
 */
public class CreateVpdResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Content")
    private Content content;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private CreateVpdResponseBody(Builder builder) {
        this.code = builder.code;
        this.content = builder.content;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVpdResponseBody create() {
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

        public CreateVpdResponseBody build() {
            return new CreateVpdResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("SubnetIds")
        private java.util.List < String > subnetIds;

        @NameInMap("VpdId")
        private String vpdId;

        private Content(Builder builder) {
            this.subnetIds = builder.subnetIds;
            this.vpdId = builder.vpdId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return subnetIds
         */
        public java.util.List < String > getSubnetIds() {
            return this.subnetIds;
        }

        /**
         * @return vpdId
         */
        public String getVpdId() {
            return this.vpdId;
        }

        public static final class Builder {
            private java.util.List < String > subnetIds; 
            private String vpdId; 

            /**
             * SubnetIds.
             */
            public Builder subnetIds(java.util.List < String > subnetIds) {
                this.subnetIds = subnetIds;
                return this;
            }

            /**
             * VpdId.
             */
            public Builder vpdId(String vpdId) {
                this.vpdId = vpdId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
