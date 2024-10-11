// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPluginsRequest} extends {@link RequestModel}
 *
 * <p>GetPluginsRequest</p>
 */
public class GetPluginsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private Integer category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableOnly")
    private Boolean enableOnly;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GatewayUniqueId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayUniqueId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    private GetPluginsRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.category = builder.category;
        this.enableOnly = builder.enableOnly;
        this.gatewayUniqueId = builder.gatewayUniqueId;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPluginsRequest create() {
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
     * @return category
     */
    public Integer getCategory() {
        return this.category;
    }

    /**
     * @return enableOnly
     */
    public Boolean getEnableOnly() {
        return this.enableOnly;
    }

    /**
     * @return gatewayUniqueId
     */
    public String getGatewayUniqueId() {
        return this.gatewayUniqueId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<GetPluginsRequest, Builder> {
        private String acceptLanguage; 
        private Integer category; 
        private Boolean enableOnly; 
        private String gatewayUniqueId; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(GetPluginsRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.category = request.category;
            this.enableOnly = request.enableOnly;
            this.gatewayUniqueId = request.gatewayUniqueId;
            this.name = request.name;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <p>zh: Chinese en: English</p>
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
         * <p>The type of the plug-in. Valid values:</p>
         * <ul>
         * <li>0: custom</li>
         * <li>1: permission authorization</li>
         * <li>2: security protection</li>
         * <li>3: transmission protocol</li>
         * <li>4: traffic control</li>
         * <li>5: traffic observation</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Specifies whether to enable the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableOnly(Boolean enableOnly) {
            this.putQueryParameter("EnableOnly", enableOnly);
            this.enableOnly = enableOnly;
            return this;
        }

        /**
         * <p>The ID of the gateway.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-0adf3ad751284cc69fcf9669fba*****</p>
         */
        public Builder gatewayUniqueId(String gatewayUniqueId) {
            this.putQueryParameter("GatewayUniqueId", gatewayUniqueId);
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }

        /**
         * <p>The name of the plug-in.</p>
         * 
         * <strong>example:</strong>
         * <p>key-auth</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public GetPluginsRequest build() {
            return new GetPluginsRequest(this);
        } 

    } 

}
