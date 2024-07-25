// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreserveHeaderFormatRequest} extends {@link RequestModel}
 *
 * <p>PreserveHeaderFormatRequest</p>
 */
public class PreserveHeaderFormatRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreserveHeaderFormat")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean preserveHeaderFormat;

    private PreserveHeaderFormatRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.preserveHeaderFormat = builder.preserveHeaderFormat;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreserveHeaderFormatRequest create() {
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
     * @return preserveHeaderFormat
     */
    public Boolean getPreserveHeaderFormat() {
        return this.preserveHeaderFormat;
    }

    public static final class Builder extends Request.Builder<PreserveHeaderFormatRequest, Builder> {
        private String acceptLanguage; 
        private String gatewayUniqueId; 
        private Boolean preserveHeaderFormat; 

        private Builder() {
            super();
        } 

        private Builder(PreserveHeaderFormatRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.preserveHeaderFormat = request.preserveHeaderFormat;
        } 

        /**
         * The language in which you want to display the results. Valid values: zh and en. zh indicates Chinese, which is the default value. en indicates English.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
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

        /**
         * Specifies whether the request header is case-sensitive. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false**
         */
        public Builder preserveHeaderFormat(Boolean preserveHeaderFormat) {
            this.putQueryParameter("PreserveHeaderFormat", preserveHeaderFormat);
            this.preserveHeaderFormat = preserveHeaderFormat;
            return this;
        }

        @Override
        public PreserveHeaderFormatRequest build() {
            return new PreserveHeaderFormatRequest(this);
        } 

    } 

}
