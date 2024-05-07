// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGatewayFlowRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateGatewayFlowRuleRequest</p>
 */
public class UpdateGatewayFlowRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BehaviorType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer behaviorType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BodyEncoding")
    private Integer bodyEncoding;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer enable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayId")
    private Long gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseContentBody")
    private String responseContentBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseRedirectUrl")
    private String responseRedirectUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResponseStatusCode")
    private Integer responseStatusCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long routeId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RouteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String routeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Threshold")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer threshold;

    private UpdateGatewayFlowRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.behaviorType = builder.behaviorType;
        this.bodyEncoding = builder.bodyEncoding;
        this.enable = builder.enable;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.id = builder.id;
        this.responseContentBody = builder.responseContentBody;
        this.responseRedirectUrl = builder.responseRedirectUrl;
        this.responseStatusCode = builder.responseStatusCode;
        this.routeId = builder.routeId;
        this.routeName = builder.routeName;
        this.threshold = builder.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGatewayFlowRuleRequest create() {
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
     * @return behaviorType
     */
    public Integer getBehaviorType() {
        return this.behaviorType;
    }

    /**
     * @return bodyEncoding
     */
    public Integer getBodyEncoding() {
        return this.bodyEncoding;
    }

    /**
     * @return enable
     */
    public Integer getEnable() {
        return this.enable;
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
     * @return responseContentBody
     */
    public String getResponseContentBody() {
        return this.responseContentBody;
    }

    /**
     * @return responseRedirectUrl
     */
    public String getResponseRedirectUrl() {
        return this.responseRedirectUrl;
    }

    /**
     * @return responseStatusCode
     */
    public Integer getResponseStatusCode() {
        return this.responseStatusCode;
    }

    /**
     * @return routeId
     */
    public Long getRouteId() {
        return this.routeId;
    }

    /**
     * @return routeName
     */
    public String getRouteName() {
        return this.routeName;
    }

    /**
     * @return threshold
     */
    public Integer getThreshold() {
        return this.threshold;
    }

    public static final class Builder extends Request.Builder<UpdateGatewayFlowRuleRequest, Builder> {
        private String acceptLanguage; 
        private Integer behaviorType; 
        private Integer bodyEncoding; 
        private Integer enable; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Long id; 
        private String responseContentBody; 
        private String responseRedirectUrl; 
        private Integer responseStatusCode; 
        private Long routeId; 
        private String routeName; 
        private Integer threshold; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGatewayFlowRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.behaviorType = request.behaviorType;
            this.bodyEncoding = request.bodyEncoding;
            this.enable = request.enable;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.id = request.id;
            this.responseContentBody = request.responseContentBody;
            this.responseRedirectUrl = request.responseRedirectUrl;
            this.responseStatusCode = request.responseStatusCode;
            this.routeId = request.routeId;
            this.routeName = request.routeName;
            this.threshold = request.threshold;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * BehaviorType.
         */
        public Builder behaviorType(Integer behaviorType) {
            this.putQueryParameter("BehaviorType", behaviorType);
            this.behaviorType = behaviorType;
            return this;
        }

        /**
         * BodyEncoding.
         */
        public Builder bodyEncoding(Integer bodyEncoding) {
            this.putQueryParameter("BodyEncoding", bodyEncoding);
            this.bodyEncoding = bodyEncoding;
            return this;
        }

        /**
         * Enable.
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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
         * ResponseContentBody.
         */
        public Builder responseContentBody(String responseContentBody) {
            this.putQueryParameter("ResponseContentBody", responseContentBody);
            this.responseContentBody = responseContentBody;
            return this;
        }

        /**
         * ResponseRedirectUrl.
         */
        public Builder responseRedirectUrl(String responseRedirectUrl) {
            this.putQueryParameter("ResponseRedirectUrl", responseRedirectUrl);
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }

        /**
         * ResponseStatusCode.
         */
        public Builder responseStatusCode(Integer responseStatusCode) {
            this.putQueryParameter("ResponseStatusCode", responseStatusCode);
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        /**
         * RouteId.
         */
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * RouteName.
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Integer threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        @Override
        public UpdateGatewayFlowRuleRequest build() {
            return new UpdateGatewayFlowRuleRequest(this);
        } 

    } 

}
