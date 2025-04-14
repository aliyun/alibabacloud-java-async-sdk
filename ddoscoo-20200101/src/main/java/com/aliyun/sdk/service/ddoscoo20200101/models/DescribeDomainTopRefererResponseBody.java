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
 * {@link DescribeDomainTopRefererResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainTopRefererResponseBody</p>
 */
public class DescribeDomainTopRefererResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainTopReferer")
    private java.util.List<DomainTopReferer> domainTopReferer;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDomainTopRefererResponseBody(Builder builder) {
        this.domainTopReferer = builder.domainTopReferer;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainTopRefererResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainTopReferer
     */
    public java.util.List<DomainTopReferer> getDomainTopReferer() {
        return this.domainTopReferer;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DomainTopReferer> domainTopReferer; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDomainTopRefererResponseBody model) {
            this.domainTopReferer = model.domainTopReferer;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about top referers.</p>
         */
        public Builder domainTopReferer(java.util.List<DomainTopReferer> domainTopReferer) {
            this.domainTopReferer = domainTopReferer;
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

        public DescribeDomainTopRefererResponseBody build() {
            return new DescribeDomainTopRefererResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainTopRefererResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainTopRefererResponseBody</p>
     */
    public static class DomainTopReferer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Pv")
        private Long pv;

        @com.aliyun.core.annotation.NameInMap("Referer")
        private String referer;

        private DomainTopReferer(Builder builder) {
            this.domain = builder.domain;
            this.pv = builder.pv;
            this.referer = builder.referer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainTopReferer create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return pv
         */
        public Long getPv() {
            return this.pv;
        }

        /**
         * @return referer
         */
        public String getReferer() {
            return this.referer;
        }

        public static final class Builder {
            private String domain; 
            private Long pv; 
            private String referer; 

            private Builder() {
            } 

            private Builder(DomainTopReferer model) {
                this.domain = model.domain;
                this.pv = model.pv;
                this.referer = model.referer;
            } 

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
             * <p>The page views.</p>
             * 
             * <strong>example:</strong>
             * <p>257031</p>
             */
            public Builder pv(Long pv) {
                this.pv = pv;
                return this;
            }

            /**
             * <p>The Base64-encoded referer.</p>
             * 
             * <strong>example:</strong>
             * <p>aHR0cHM6Ly9zZXJ2aWNld2VjaGF0LmNvbS93eGY3ZDc5YWY0YzU4ZDH3NTEvNC9wYWdlLWZyYW1lLmh0bWw=</p>
             */
            public Builder referer(String referer) {
                this.referer = referer;
                return this;
            }

            public DomainTopReferer build() {
                return new DomainTopReferer(this);
            } 

        } 

    }
}
