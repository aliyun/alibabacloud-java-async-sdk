// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayRouteRetryRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteRetryRequest</p>
 */
public class UpdateGatewayRouteRetryRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("GatewayId")
    private Long gatewayId;

    @Query
    @NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @Query
    @NameInMap("Id")
    private Long id;

    @Query
    @NameInMap("RetryJSON")
    private RetryJSON retryJSON;

    private UpdateGatewayRouteRetryRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.retryJSON = builder.retryJSON;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteRetryRequest create() {
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
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return retryJSON
     */
    public RetryJSON getRetryJSON() {
        return this.retryJSON;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayRouteRetryRequest, Builder> {
        private String acceptLanguage; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 
        private RetryJSON retryJSON; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteRetryRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.retryJSON = request.retryJSON;
        } 

        /**
         * 返回结果显示的语言。取值：zh（默认值）：中文，en：英文
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * GatewayId.
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * GatewayUniqueId.
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * RetryJSON.
         */
        public Builder retryJSON(RetryJSON retryJSON) {
            String retryJSONShrink = shrink(retryJSON, "RetryJSON", "json");
            this.putQueryParameter("RetryJSON", retryJSONShrink);
            this.retryJSON = retryJSON;
            return this;
        }

        @Override
        public UpdateGatewayRouteRetryRequest build() {
            return new UpdateGatewayRouteRetryRequest(this);
        } 

    } 

    public static class RetryJSON extends TeaModel {
        @NameInMap("Attempts")
        private Integer attempts;

        @NameInMap("HttpCodes")
        private java.util.List < String > httpCodes;

        @NameInMap("RetryOn")
        private java.util.List < String > retryOn;

        @NameInMap("Status")
        private String status;

        private RetryJSON(Builder builder) {
            this.attempts = builder.attempts;
            this.httpCodes = builder.httpCodes;
            this.retryOn = builder.retryOn;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryJSON create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return httpCodes
         */
        public java.util.List < String > getHttpCodes() {
            return this.httpCodes;
        }

        /**
         * @return retryOn
         */
        public java.util.List < String > getRetryOn() {
            return this.retryOn;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Integer attempts; 
            private java.util.List < String > httpCodes; 
            private java.util.List < String > retryOn; 
            private String status; 

            /**
             * Attempts.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * HttpCodes.
             */
            public Builder httpCodes(java.util.List < String > httpCodes) {
                this.httpCodes = httpCodes;
                return this;
            }

            /**
             * RetryOn.
             */
            public Builder retryOn(java.util.List < String > retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public RetryJSON build() {
                return new RetryJSON(this);
            } 

        } 

    }
}
