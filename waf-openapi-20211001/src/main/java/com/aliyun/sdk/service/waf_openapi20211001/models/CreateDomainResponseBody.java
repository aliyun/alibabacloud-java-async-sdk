// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDomainResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDomainResponseBody</p>
 */
public class CreateDomainResponseBody extends TeaModel {
    @NameInMap("DomainInfo")
    private DomainInfo domainInfo;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDomainResponseBody(Builder builder) {
        this.domainInfo = builder.domainInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDomainResponseBody create() {
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
         * $.parameters[3].schema.example
         */
        public Builder domainInfo(DomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * $.parameters[3].schema.description
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDomainResponseBody build() {
            return new CreateDomainResponseBody(this);
        } 

    } 

    public static class DomainInfo extends TeaModel {
        @NameInMap("Cname")
        private String cname;

        @NameInMap("Domain")
        private String domain;

        private DomainInfo(Builder builder) {
            this.cname = builder.cname;
            this.domain = builder.domain;
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

        public static final class Builder {
            private String cname; 
            private String domain; 

            /**
             * $.parameters[3].schema.enumValueTitles
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * $.parameters[4].schema.properties.Backends.items.description
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
}
