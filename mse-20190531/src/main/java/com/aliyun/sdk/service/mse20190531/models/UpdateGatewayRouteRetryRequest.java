// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

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
 * {@link UpdateGatewayRouteRetryRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteRetryRequest</p>
 */
public class UpdateGatewayRouteRetryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetryJSON")
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
         * <p>501</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-3f97e2989c344f35ab3fd62b19f1d10a</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The ID of the associated record.</p>
         * 
         * <strong>example:</strong>
         * <p>508</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The information about the retry policy.</p>
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

    /**
     * 
     * {@link UpdateGatewayRouteRetryRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayRouteRetryRequest</p>
     */
    public static class RetryJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        private Integer attempts;

        @com.aliyun.core.annotation.NameInMap("HttpCodes")
        private java.util.List<String> httpCodes;

        @com.aliyun.core.annotation.NameInMap("RetryOn")
        private java.util.List<String> retryOn;

        @com.aliyun.core.annotation.NameInMap("Status")
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
        public java.util.List<String> getHttpCodes() {
            return this.httpCodes;
        }

        /**
         * @return retryOn
         */
        public java.util.List<String> getRetryOn() {
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
            private java.util.List<String> httpCodes; 
            private java.util.List<String> retryOn; 
            private String status; 

            private Builder() {
            } 

            private Builder(RetryJSON model) {
                this.attempts = model.attempts;
                this.httpCodes = model.httpCodes;
                this.retryOn = model.retryOn;
                this.status = model.status;
            } 

            /**
             * <p>The number of retries.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>The HTTP status codes.</p>
             */
            public Builder httpCodes(java.util.List<String> httpCodes) {
                this.httpCodes = httpCodes;
                return this;
            }

            /**
             * <p>The retry conditions.</p>
             */
            public Builder retryOn(java.util.List<String> retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * <p>The status of the policy.</p>
             * 
             * <strong>example:</strong>
             * <p>off</p>
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
