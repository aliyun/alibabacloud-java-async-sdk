// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGatewayOptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayOptionRequest</p>
 */
public class UpdateGatewayOptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayOption")
    private GatewayOption gatewayOption;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    private UpdateGatewayOptionRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayOption = builder.gatewayOption;
        this.gatewayUniqueId = builder.gatewayUniqueId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayOptionRequest create() {
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
     * @return gatewayId
     */
    public Long getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return gatewayOption
     */
    public GatewayOption getGatewayOption() {
        return this.gatewayOption;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayOptionRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private GatewayOption gatewayOption; 
        private String gatewayUniqueId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayOptionRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayOption = request.gatewayOption;
            this.gatewayUniqueId = request.gatewayUniqueId;
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
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>421</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The detailed configurations of the gateway.</p>
         * <ul>
         * <li><strong>TraceDetails</strong>: the sampling description of Managed Service for OpenTelemetry. Content: TraceEnabled indicates whether Managed Service for OpenTelemetry is activated. Sample indicates the sampling rate of Managed Service for OpenTelemetry.</li>
         * <li><strong>LogConfigDetails</strong>: the description of Simple Log Service. Content: LogEnabled indicates whether Simple Log Service is activated. ProjectName indicates the Simple Log Service project to which logs are delivered. LogStoreName indicates the name of the Logstore.</li>
         * <li><strong>EnableHardwareAcceleration</strong>: indicates whether hardware acceleration is enabled.</li>
         * <li><strong>DisableHttp2Alpn</strong>: indicates whether the HTTP/2 protocol is disabled.</li>
         * <li><strong>EnableWaf</strong>: indicates whether Web Application Firewall (WAF) is enabled.</li>
         * </ul>
         */
        public Builder gatewayOption(GatewayOption gatewayOption) {
            String gatewayOptionShrink = shrink(gatewayOption, "GatewayOption", "json");
            this.putQueryParameter("GatewayOption", gatewayOptionShrink);
            this.gatewayOption = gatewayOption;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-83b0ddb569434f82b9fe8e4c60c4****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        @Override
        public UpdateGatewayOptionRequest build() {
            return new UpdateGatewayOptionRequest(this);
        } 

    } 

}
