// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ListGatewayDomainsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGatewayDomainsResponseBody</p>
 */
public class ListGatewayDomainsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CustomDomains")
    private java.util.List<CustomDomains> customDomains;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customDomains
     */
    public java.util.List<CustomDomains> getCustomDomains() {
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
        private java.util.List<CustomDomains> customDomains; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListGatewayDomainsResponseBody model) {
            this.customDomains = model.customDomains;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of custom domain names.</p>
         */
        public Builder customDomains(java.util.List<CustomDomains> customDomains) {
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
        @com.aliyun.core.annotation.NameInMap("CertificateEndDate")
        private String certificateEndDate;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateStartDate")
        private String certificateStartDate;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private CustomDomains(Builder builder) {
            this.certificateEndDate = builder.certificateEndDate;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateStartDate = builder.certificateStartDate;
            this.certificateStatus = builder.certificateStatus;
            this.createTime = builder.createTime;
            this.domain = builder.domain;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomDomains create() {
            return builder().build();
        }

        /**
         * @return certificateEndDate
         */
        public String getCertificateEndDate() {
            return this.certificateEndDate;
        }

        /**
         * @return certificateId
         */
        public String getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateStartDate
         */
        public String getCertificateStartDate() {
            return this.certificateStartDate;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String certificateEndDate; 
            private String certificateId; 
            private String certificateName; 
            private String certificateStartDate; 
            private String certificateStatus; 
            private String createTime; 
            private String domain; 
            private String type; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(CustomDomains model) {
                this.certificateEndDate = model.certificateEndDate;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
                this.certificateStartDate = model.certificateStartDate;
                this.certificateStatus = model.certificateStatus;
                this.createTime = model.createTime;
                this.domain = model.domain;
                this.type = model.type;
                this.updateTime = model.updateTime;
            } 

            /**
             * CertificateEndDate.
             */
            public Builder certificateEndDate(String certificateEndDate) {
                this.certificateEndDate = certificateEndDate;
                return this;
            }

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
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * CertificateStartDate.
             */
            public Builder certificateStartDate(String certificateStartDate) {
                this.certificateStartDate = certificateStartDate;
                return this;
            }

            /**
             * CertificateStatus.
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public CustomDomains build() {
                return new CustomDomains(this);
            } 

        } 

    }
}
