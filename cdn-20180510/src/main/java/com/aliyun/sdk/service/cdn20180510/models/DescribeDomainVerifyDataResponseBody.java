// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeDomainVerifyDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainVerifyDataResponseBody</p>
 */
public class DescribeDomainVerifyDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainVerifyDataResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainVerifyDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainVerifyDataResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The verification content.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;verifiCode&quot;: &quot;uy0-DbxL4HBmUtSUXpkXctaSnCAUKhhNH6WKl-JnJY4&quot;,
         *     &quot;verifyKey&quot;: &quot;_acme-challenge&quot;
         *   }</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainVerifyDataResponseBody build() {
            return new DescribeDomainVerifyDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainVerifyDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainVerifyDataResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RootDomain")
        private String rootDomain;

        @com.aliyun.core.annotation.NameInMap("verifyCode")
        private String verifyCode;

        @com.aliyun.core.annotation.NameInMap("verifyKey")
        private String verifyKey;

        private Content(Builder builder) {
            this.rootDomain = builder.rootDomain;
            this.verifyCode = builder.verifyCode;
            this.verifyKey = builder.verifyKey;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return rootDomain
         */
        public String getRootDomain() {
            return this.rootDomain;
        }

        /**
         * @return verifyCode
         */
        public String getVerifyCode() {
            return this.verifyCode;
        }

        /**
         * @return verifyKey
         */
        public String getVerifyKey() {
            return this.verifyKey;
        }

        public static final class Builder {
            private String rootDomain; 
            private String verifyCode; 
            private String verifyKey; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.rootDomain = model.rootDomain;
                this.verifyCode = model.verifyCode;
                this.verifyKey = model.verifyKey;
            } 

            /**
             * RootDomain.
             */
            public Builder rootDomain(String rootDomain) {
                this.rootDomain = rootDomain;
                return this;
            }

            /**
             * verifyCode.
             */
            public Builder verifyCode(String verifyCode) {
                this.verifyCode = verifyCode;
                return this;
            }

            /**
             * verifyKey.
             */
            public Builder verifyKey(String verifyKey) {
                this.verifyKey = verifyKey;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
