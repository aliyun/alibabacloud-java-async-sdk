// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteGatewayServiceVersionRequest} extends {@link RequestModel}
 *
 * <p>DeleteGatewayServiceVersionRequest</p>
 */
public class DeleteGatewayServiceVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private Long serviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    private DeleteGatewayServiceVersionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.serviceId = builder.serviceId;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGatewayServiceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return serviceId
     */
    public Long getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<DeleteGatewayServiceVersionRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Long serviceId; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGatewayServiceVersionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.serviceId = request.serviceId;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-b6988bd16920479d9104e1729f97****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>777</p>
         */
        public Builder serviceId(Long serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The version of the service.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;name&quot;:&quot;app&quot;,&quot;labels&quot;:[{&quot;key&quot;:&quot;app&quot;,&quot;value&quot;:&quot;demo-server&quot;}]}</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public DeleteGatewayServiceVersionRequest build() {
            return new DeleteGatewayServiceVersionRequest(this);
        } 

    } 

}
