// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDcdnSecFuncInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnSecFuncInfoResponseBody</p>
 */
public class DescribeDcdnSecFuncInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < Content> content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HttpStatus")
    private String httpStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RetCode")
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
         * <p>The parameters required by the code.</p>
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The description of HTTP responses.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatus(String httpStatus) {
            this.httpStatus = httpStatus;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>30A3A25A-86B3-4C1D-BAA8-12B8607A5CFD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return value for HTTP requests. Valid values:</p>
         * <ul>
         * <li>0: OK.</li>
         * <li>Values other than 0: an error.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder retCode(String retCode) {
            this.retCode = retCode;
            return this;
        }

        public DescribeDcdnSecFuncInfoResponseBody build() {
            return new DescribeDcdnSecFuncInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnSecFuncInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnSecFuncInfoResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Value")
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
             * <p>The language (Chinese or English).</p>
             * 
             * <strong>example:</strong>
             * <p>ai_defense</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The options in the drop-down list.</p>
             * 
             * <strong>example:</strong>
             * <p>ai_defense</p>
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
