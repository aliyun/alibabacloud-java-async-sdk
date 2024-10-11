// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGatewayRouteCORSRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayRouteCORSRequest</p>
 */
public class UpdateGatewayRouteCORSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CorsJSON")
    private CorsJSON corsJSON;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    private UpdateGatewayRouteCORSRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.corsJSON = builder.corsJSON;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayRouteCORSRequest create() {
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
     * @return corsJSON
     */
    public CorsJSON getCorsJSON() {
        return this.corsJSON;
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

    public static final class Builder extends Request.Builder<UpdateGatewayRouteCORSRequest, Builder> {
        private String acceptLanguage; 
        private CorsJSON corsJSON; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayRouteCORSRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.corsJSON = request.corsJSON;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
        } 

        /**
         * <p>The language of the response. In compliance with <a href="https://tools.ietf.org/html/rfc7231">RFC 7231</a>, the backend service must return a response based on the language used by the user.</p>
         * <ul>
         * <li>No default value.</li>
         * <li>zh-CN: Chinese</li>
         * <li>en-US: English</li>
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
         * <p>The information about the CORS policy.</p>
         */
        public Builder corsJSON(CorsJSON corsJSON) {
            String corsJSONShrink = shrink(corsJSON, "CorsJSON", "json");
            this.putQueryParameter("CorsJSON", corsJSONShrink);
            this.corsJSON = corsJSON;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>85</p>
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
         * <p>gw-f70a6ddf2f0941a2bb997b2d16028f37</p>
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
         * <p>55</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        @Override
        public UpdateGatewayRouteCORSRequest build() {
            return new UpdateGatewayRouteCORSRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateGatewayRouteCORSRequest} extends {@link TeaModel}
     *
     * <p>UpdateGatewayRouteCORSRequest</p>
     */
    public static class CorsJSON extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowCredentials")
        private Boolean allowCredentials;

        @com.aliyun.core.annotation.NameInMap("AllowHeaders")
        private String allowHeaders;

        @com.aliyun.core.annotation.NameInMap("AllowMethods")
        private String allowMethods;

        @com.aliyun.core.annotation.NameInMap("AllowOrigins")
        private String allowOrigins;

        @com.aliyun.core.annotation.NameInMap("ExposeHeaders")
        private String exposeHeaders;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TimeUnit")
        private String timeUnit;

        @com.aliyun.core.annotation.NameInMap("UnitNum")
        private Long unitNum;

        private CorsJSON(Builder builder) {
            this.allowCredentials = builder.allowCredentials;
            this.allowHeaders = builder.allowHeaders;
            this.allowMethods = builder.allowMethods;
            this.allowOrigins = builder.allowOrigins;
            this.exposeHeaders = builder.exposeHeaders;
            this.status = builder.status;
            this.timeUnit = builder.timeUnit;
            this.unitNum = builder.unitNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CorsJSON create() {
            return builder().build();
        }

        /**
         * @return allowCredentials
         */
        public Boolean getAllowCredentials() {
            return this.allowCredentials;
        }

        /**
         * @return allowHeaders
         */
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        /**
         * @return allowMethods
         */
        public String getAllowMethods() {
            return this.allowMethods;
        }

        /**
         * @return allowOrigins
         */
        public String getAllowOrigins() {
            return this.allowOrigins;
        }

        /**
         * @return exposeHeaders
         */
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return timeUnit
         */
        public String getTimeUnit() {
            return this.timeUnit;
        }

        /**
         * @return unitNum
         */
        public Long getUnitNum() {
            return this.unitNum;
        }

        public static final class Builder {
            private Boolean allowCredentials; 
            private String allowHeaders; 
            private String allowMethods; 
            private String allowOrigins; 
            private String exposeHeaders; 
            private String status; 
            private String timeUnit; 
            private Long unitNum; 

            /**
             * <p>The credentials allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowCredentials(Boolean allowCredentials) {
                this.allowCredentials = allowCredentials;
                return this;
            }

            /**
             * <p>The request headers allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>content-type</p>
             */
            public Builder allowHeaders(String allowHeaders) {
                this.allowHeaders = allowHeaders;
                return this;
            }

            /**
             * <p>The HTTP methods allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>GET,POST</p>
             */
            public Builder allowMethods(String allowMethods) {
                this.allowMethods = allowMethods;
                return this;
            }

            /**
             * <p>The origins from which access is allowed.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://api.aliyun-inc.com/">https://api.aliyun-inc.com/</a></p>
             */
            public Builder allowOrigins(String allowOrigins) {
                this.allowOrigins = allowOrigins;
                return this;
            }

            /**
             * <p>The response headers allowed.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li></li>
             * </ul>
             */
            public Builder exposeHeaders(String exposeHeaders) {
                this.exposeHeaders = exposeHeaders;
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

            /**
             * <p>The unit of time.</p>
             * 
             * <strong>example:</strong>
             * <p>h</p>
             */
            public Builder timeUnit(String timeUnit) {
                this.timeUnit = timeUnit;
                return this;
            }

            /**
             * <p>The value of time.</p>
             * 
             * <strong>example:</strong>
             * <p>24</p>
             */
            public Builder unitNum(Long unitNum) {
                this.unitNum = unitNum;
                return this;
            }

            public CorsJSON build() {
                return new CorsJSON(this);
            } 

        } 

    }
}
