// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayOptionRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayOptionRequest</p>
 */
public class UpdateGatewayOptionRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayOption")
    private GatewayOption gatewayOption;

    @Query
    @NameInMap("GatewayUniqueId")
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
         * The language of the response. Valid values:
         * <p>
         * 
         * *   zh: Chinese
         * *   en: English
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * The ID of the gateway.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * The detailed configurations of the gateway.
         * <p>
         * 
         * *   **TraceDetails**: the sampling description of Tracing Analysis. Content: TraceEnabled specifies whether to activate Tracing Analysis. Sample specifies the sampling rate of Tracing Analysis.
         * *   **LogConfigDetails**: the description of Log Service. Content: LogEnabled specifies whether to activate Log Service. ProjectName specifies the Log Service project to which logs are delivered. LogStoreName specifies the name of the Logstore.
         * *   **EnableHardwareAcceleration**: specifies whether to enable hardware acceleration.
         * *   **DisableHttp2Alpn**: specifies whether to disable the HTTP/2 protocol.
         * *   **EnableWaf**: specifies whether to activate Web Application Firewall (WAF).
         */
        public Builder gatewayOption(GatewayOption gatewayOption) {
            String gatewayOptionShrink = shrink(gatewayOption, "GatewayOption", "json");
            this.putQueryParameter("GatewayOption", gatewayOptionShrink);
            this.gatewayOption = gatewayOption;
            return this;
        }

        /**
         * The unique ID of the gateway.
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
