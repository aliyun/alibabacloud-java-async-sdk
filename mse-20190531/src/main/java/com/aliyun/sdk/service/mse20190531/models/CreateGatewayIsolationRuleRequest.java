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
 * {@link CreateGatewayIsolationRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayIsolationRuleRequest</p>
 */
public class CreateGatewayIsolationRuleRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("MaxConcurrency")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxConcurrency;

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

    private CreateGatewayIsolationRuleRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.behaviorType = builder.behaviorType;
        this.bodyEncoding = builder.bodyEncoding;
        this.enable = builder.enable;
        this.gatewayId = builder.gatewayId;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.maxConcurrency = builder.maxConcurrency;
        this.responseContentBody = builder.responseContentBody;
        this.responseRedirectUrl = builder.responseRedirectUrl;
        this.responseStatusCode = builder.responseStatusCode;
        this.routeId = builder.routeId;
        this.routeName = builder.routeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayIsolationRuleRequest create() {
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
     * @return maxConcurrency
     */
    public Integer getMaxConcurrency() {
        return this.maxConcurrency;
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

    public static final class Builder extends Request.Builder<CreateGatewayIsolationRuleRequest, Builder> {
        private String acceptLanguage; 
        private Integer behaviorType; 
        private Integer bodyEncoding; 
        private Integer enable; 
        private Long gatewayId; 
        private String gatewayUniqueId; 
        private Integer maxConcurrency; 
        private String responseContentBody; 
        private String responseRedirectUrl; 
        private Integer responseStatusCode; 
        private Long routeId; 
        private String routeName; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayIsolationRuleRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.behaviorType = request.behaviorType;
            this.bodyEncoding = request.bodyEncoding;
            this.enable = request.enable;
            this.gatewayId = request.gatewayId;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.maxConcurrency = request.maxConcurrency;
            this.responseContentBody = request.responseContentBody;
            this.responseRedirectUrl = request.responseRedirectUrl;
            this.responseStatusCode = request.responseStatusCode;
            this.routeId = request.routeId;
            this.routeName = request.routeName;
        } 

        /**
         * <p>The language in which you want to display the results. Valid values: zh and en. zh is the default value, which indicates Chinese. en indicates English.</p>
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
         * <p>The type of a web fallback behavior.</p>
         * <p>0: The specified content is returned.</p>
         * <p>1: The specified page is displayed.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder behaviorType(Integer behaviorType) {
            this.putQueryParameter("BehaviorType", behaviorType);
            this.behaviorType = behaviorType;
            return this;
        }

        /**
         * <p>The encoding type.</p>
         * <p>0: plain text</p>
         * <p>1: JSON</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder bodyEncoding(Integer bodyEncoding) {
            this.putQueryParameter("BodyEncoding", bodyEncoding);
            this.bodyEncoding = bodyEncoding;
            return this;
        }

        /**
         * <p>Specifies whether to enable the rule.</p>
         * <p>0: disabled.</p>
         * <p>1: enabled.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder enable(Integer enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
            return this;
        }

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>14407</p>
         */
        public Builder gatewayId(Long gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The unique ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-e2d226bba4b2445c9e29fa7f8216****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The maximum number of concurrent requests.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxConcurrency(Integer maxConcurrency) {
            this.putQueryParameter("MaxConcurrency", maxConcurrency);
            this.maxConcurrency = maxConcurrency;
            return this;
        }

        /**
         * <p>The HTTP text to be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder responseContentBody(String responseContentBody) {
            this.putQueryParameter("ResponseContentBody", responseContentBody);
            this.responseContentBody = responseContentBody;
            return this;
        }

        /**
         * <p>The address to be redirected to.</p>
         * 
         * <strong>example:</strong>
         * <p>www.******.com</p>
         */
        public Builder responseRedirectUrl(String responseRedirectUrl) {
            this.putQueryParameter("ResponseRedirectUrl", responseRedirectUrl);
            this.responseRedirectUrl = responseRedirectUrl;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>429</p>
         */
        public Builder responseStatusCode(Integer responseStatusCode) {
            this.putQueryParameter("ResponseStatusCode", responseStatusCode);
            this.responseStatusCode = responseStatusCode;
            return this;
        }

        /**
         * <p>The route ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>52853</p>
         */
        public Builder routeId(Long routeId) {
            this.putQueryParameter("RouteId", routeId);
            this.routeId = routeId;
            return this;
        }

        /**
         * <p>The name of the route.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>routeName</p>
         */
        public Builder routeName(String routeName) {
            this.putQueryParameter("RouteName", routeName);
            this.routeName = routeName;
            return this;
        }

        @Override
        public CreateGatewayIsolationRuleRequest build() {
            return new CreateGatewayIsolationRuleRequest(this);
        } 

    } 

}
