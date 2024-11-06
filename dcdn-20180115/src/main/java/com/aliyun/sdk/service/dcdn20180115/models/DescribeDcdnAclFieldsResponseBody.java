// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The details about the rules.</p>
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30A3A25A-86B3-4C1D-BAA8-12B8607A5CFD</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnAclFieldsResponseBody build() {
            return new DescribeDcdnAclFieldsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnAclFieldsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnAclFieldsResponseBody</p>
     */
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
             * <p>The rules and policies that were configured. The JSON string is decoded.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;fieldList&quot;:[{&quot;name&quot;:&quot;alert&quot;,&quot;display&quot;:&quot;observe&quot;,&quot;tip&quot;:&quot;mark the request in the log without blocking it&quot;},{&quot;name&quot;:&quot;bypass&quot;,&quot;display&quot;:&quot;bypass&quot;,&quot;tip&quot;:&quot;bypass security modules&quot;}],&quot;module&quot;:[{&quot;name&quot;:&quot;cc&quot;,&quot;display&quot;:&quot;Rate Limit&quot;,&quot;tip&quot;:&quot;bypass Rate Limit&quot;},{&quot;name&quot;:&quot;bot&quot;,&quot;display&quot;:&quot;Bot Traffic Management&quot;,&quot;tip&quot;:&quot;bypass Bot Manager&quot;}]</p>
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
