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
 * {@link AttachGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>AttachGatewayDomainRequest</p>
 */
public class AttachGatewayDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private CustomDomain customDomain;

    private AttachGatewayDomainRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
        this.customDomain = builder.customDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachGatewayDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return customDomain
     */
    public CustomDomain getCustomDomain() {
        return this.customDomain;
    }

    public static final class Builder extends Request.Builder<AttachGatewayDomainRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 
        private CustomDomain customDomain; 

        private Builder() {
            super();
        } 

        private Builder(AttachGatewayDomainRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.gatewayId = request.gatewayId;
            this.customDomain = request.customDomain;
        } 

        /**
         * <p>The region where the private gateway resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The ID of the private gateway. To obtain the private gateway ID, see the GatewayId parameter in the response parameters of the <a href="https://apiworkbench.aliyun-inc.com/document/eas/2021-07-01/ListGateway?spm=openapi-amp.newDocPublishment.0.0.765e281fL2IcjJ&ampEnv=online">ListGateway</a> operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-1uhcqmsc7x22******</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The custom domain name information.</p>
         * <p>This parameter is required.</p>
         */
        public Builder customDomain(CustomDomain customDomain) {
            String customDomainShrink = shrink(customDomain, "CustomDomain", "json");
            this.putQueryParameter("CustomDomain", customDomainShrink);
            this.customDomain = customDomain;
            return this;
        }

        @Override
        public AttachGatewayDomainRequest build() {
            return new AttachGatewayDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link AttachGatewayDomainRequest} extends {@link TeaModel}
     *
     * <p>AttachGatewayDomainRequest</p>
     */
    public static class CustomDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private String certificateId;

        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CustomDomain(Builder builder) {
            this.certificateId = builder.certificateId;
            this.domain = builder.domain;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomDomain create() {
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
             * <p>This parameter is required.</p>
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>intranet</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CustomDomain build() {
                return new CustomDomain(this);
            } 

        } 

    }
}
