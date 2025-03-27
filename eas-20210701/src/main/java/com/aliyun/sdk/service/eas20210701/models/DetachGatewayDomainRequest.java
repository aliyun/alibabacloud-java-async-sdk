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
 * {@link DetachGatewayDomainRequest} extends {@link RequestModel}
 *
 * <p>DetachGatewayDomainRequest</p>
 */
public class DetachGatewayDomainRequest extends Request {
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

    private DetachGatewayDomainRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.gatewayId = builder.gatewayId;
        this.customDomain = builder.customDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachGatewayDomainRequest create() {
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

    public static final class Builder extends Request.Builder<DetachGatewayDomainRequest, Builder> {
        private String clusterId; 
        private String gatewayId; 
        private CustomDomain customDomain; 

        private Builder() {
            super();
        } 

        private Builder(DetachGatewayDomainRequest request) {
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
        public DetachGatewayDomainRequest build() {
            return new DetachGatewayDomainRequest(this);
        } 

    } 

    /**
     * 
     * {@link DetachGatewayDomainRequest} extends {@link TeaModel}
     *
     * <p>DetachGatewayDomainRequest</p>
     */
    public static class CustomDomain extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domain")
        @com.aliyun.core.annotation.Validation(required = true)
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private CustomDomain(Builder builder) {
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
            private String domain; 
            private String type; 

            private Builder() {
            } 

            private Builder(CustomDomain model) {
                this.domain = model.domain;
                this.type = model.type;
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
