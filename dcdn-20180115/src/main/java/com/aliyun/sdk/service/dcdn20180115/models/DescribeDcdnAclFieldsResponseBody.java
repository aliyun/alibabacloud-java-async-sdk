// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnAclFieldsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnAclFieldsResponseBody</p>
 */
public class DescribeDcdnAclFieldsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List < Content> content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnAclFieldsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnAclFieldsResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String requestId; 

        /**
         * The details about the rules.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnAclFieldsResponseBody build() {
            return new DescribeDcdnAclFieldsResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Fields")
        private String fields;

        private Content(Builder builder) {
            this.fields = builder.fields;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return fields
         */
        public String getFields() {
            return this.fields;
        }

        public static final class Builder {
            private String fields; 

            /**
             * The rules and policies that were configured. The JSON string is decoded.
             */
            public Builder fields(String fields) {
                this.fields = fields;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
