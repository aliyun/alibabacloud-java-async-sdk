// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link DescribeDomainTopHttpMethodResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopHttpMethodResponseBody</p>
 */
public class DescribeDomainTopHttpMethodResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTopMethod")
    private java.util.List<DomainTopMethod> domainTopMethod;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopHttpMethodResponseBody(Builder builder) {
        this.domainTopMethod = builder.domainTopMethod;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopHttpMethodResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainTopMethod
     */
    public java.util.List<DomainTopMethod> getDomainTopMethod() {
        return this.domainTopMethod;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainTopMethod> domainTopMethod; 
        private String requestId; 

        /**
         * <p>The information about top HTTP methods.</p>
         */
        public Builder domainTopMethod(java.util.List<DomainTopMethod> domainTopMethod) {
            this.domainTopMethod = domainTopMethod;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CF33B4C3-196E-4015-AADD-5CAD00057B80</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDomainTopHttpMethodResponseBody build() {
            return new DescribeDomainTopHttpMethodResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopHttpMethodResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopHttpMethodResponseBody</p>
     */
    public static class DomainTopMethod extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("HttpMethod")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        private DomainTopMethod(Builder builder) {
            this.domain = builder.domain;
            this.httpMethod = builder.httpMethod;
            this.pv = builder.pv;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTopMethod create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        public static final class Builder {
            private String domain; 
            private String httpMethod; 
            private Long pv; 

            /**
             * <p>The domain name of the website.</p>
             * 
             * <strong>example:</strong>
             * <p>example.aliyundoc.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The HTTP method.</p>
             * 
             * <strong>example:</strong>
             * <p>GET</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>The page views.</p>
             * 
             * <strong>example:</strong>
             * <p>22121</p>
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            public DomainTopMethod build() {
                return new DomainTopMethod(this);
            } 

        } 

    }
}
