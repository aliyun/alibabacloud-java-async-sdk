// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDomainResponseBody</p>
 */
public class ModifyDomainResponseBody extends TeaModel {
    @NameInMap("DomainInfo")
    private DomainInfo domainInfo;

    @NameInMap("RequestId")
    private String requestId;

    private ModifyDomainResponseBody(Builder builder) {
        this.domainInfo = builder.domainInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDomainResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainInfo
     */
    public DomainInfo getDomainInfo() {
        return this.domainInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DomainInfo domainInfo; 
        private String requestId; 

        /**
         * The information about the domain name.
         */
        public Builder domainInfo(DomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDomainResponseBody build() {
            return new ModifyDomainResponseBody(this);
        } 

    } 

    public static class DomainInfo extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("DomainId")
        private String domainId;

        private DomainInfo(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
            this.domainId = builder.domainId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return cname
         */
        public String getCname() {
            return this.cname;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return domainId
         */
        public String getDomainId() {
            return this.domainId;
        }

        public static final class Builder {
            private String cname; 
            private String domain; 
            private String domainId; 

            /**
             * The CNAME that is assigned by WAF to the domain name.
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * The domain name whose access configurations you modified.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * The ID of the domain name.
             */
            public Builder domainId(String domainId) {
                this.domainId = domainId;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
}
