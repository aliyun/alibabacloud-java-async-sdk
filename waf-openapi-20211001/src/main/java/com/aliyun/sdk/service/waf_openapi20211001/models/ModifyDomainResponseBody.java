// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyDomainResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyDomainResponseBody</p>
 */
public class ModifyDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInfo")
    private DomainInfo domainInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The information about the domain name.</p>
         */
        public Builder domainInfo(DomainInfo domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D7861F61-5B61-46CE-A47C-6B19160D5EB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyDomainResponseBody build() {
            return new ModifyDomainResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ModifyDomainResponseBody} extends {@link TeaModel}
     *
     * <p>ModifyDomainResponseBody</p>
     */
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cname")
        private String cname;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("DomainId")
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
             * <p>The CNAME that is assigned by WAF to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxcvdaf.****.com</p>
             */
            public Builder cname(String cname) {
                this.cname = cname;
                return this;
            }

            /**
             * <p>The domain name whose access configurations you modified.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com">www.aliyundoc.com</a></p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The ID of the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://www.aliyundoc.com-waf">www.aliyundoc.com-waf</a></p>
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
