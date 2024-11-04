// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListGatewayDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayDomainsResponseBody</p>
 */
public class ListGatewayDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomDomains")
    private java.util.List < CustomDomains> customDomains;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListGatewayDomainsResponseBody(Builder builder) {
        this.customDomains = builder.customDomains;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayDomainsResponseBody create() {
        return builder().build();
    }

    /**
     * @return customDomains
     */
    public java.util.List < CustomDomains> getCustomDomains() {
        return this.customDomains;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < CustomDomains> customDomains; 
        private String message; 
        private String requestId; 

        /**
         * <p>The list of custom domain names.</p>
         */
        public Builder customDomains(java.util.List < CustomDomains> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        /**
         * <p>The message that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Successfully get custom domains</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>40325405-579C-4D82****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListGatewayDomainsResponseBody build() {
            return new ListGatewayDomainsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGatewayDomainsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGatewayDomainsResponseBody</p>
     */
    public static class CustomDomains extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private CustomDomains(Builder builder) {
            this.certificateId = builder.certificateId;
            this.domain = builder.domain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomDomains create() {
            return builder().build();
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String certificateId; 
            private String domain; 
            private String type; 

            /**
             * <p>The ID of the SSL certificate bound to the domain name. Obtain the certificate ID after you upload or purchase a certificate in the <a href="https://yundunnext.console.aliyun.com/?spm=5176.2020520163.console-base_help.2.4b3baJixaJixOc&p=cas">Certificate Management Service</a> console.</p>
             * 
             * <strong>example:</strong>
             * <p>1473**25</p>
             */
            public Builder certificateId(String certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * <p>The custom domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>test.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The domain name type.</p>
             * <p>Valid value:</p>
             * <ul>
             * <li>intranet: internal network.</li>
             * <li>internet: public network.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CustomDomains build() {
                return new CustomDomains(this);
            } 

        } 

    }
}
