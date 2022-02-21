// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnSecFuncInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSecFuncInfoResponseBody</p>
 */
public class DescribeDcdnSecFuncInfoResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("Description")
    private String description;

    @NameInMap("HttpStatus")
    private String httpStatus;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RetCode")
    private String retCode;

    private DescribeDcdnSecFuncInfoResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.httpStatus = builder.httpStatus;
        this.requestId = builder.requestId;
        this.retCode = builder.retCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnSecFuncInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return httpStatus
     */
    public String getHttpStatus() {
        return this.httpStatus;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return retCode
     */
    public String getRetCode() {
        return this.retCode;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String description; 
        private String httpStatus; 
        private String requestId; 
        private String retCode; 

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * HttpStatus.
         */
        public Builder httpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RetCode.
         */
        public Builder retCode(String retCode) {
            this.retCode = retCode;
            return this;
        }

        public DescribeDcdnSecFuncInfoResponseBody build() {
            return new DescribeDcdnSecFuncInfoResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("Label")
        private String label;

        @NameInMap("Value")
        private String value;

        private Content(Builder builder) {
            this.label = builder.label;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String label; 
            private String value; 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
