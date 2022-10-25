// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPluginsRequest} extends {@link RequestModel}
 *
 * <p>GetPluginsRequest</p>
 */
public class GetPluginsRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("Category")
    private Integer category;

    @Query
    @NameInMap("EnableOnly")
    private Boolean enableOnly;

    @Query
    @NameInMap("GatewayUniqueId")
    @Validation(required = true)
    private String gatewayUniqueId;

    @Query
    @NameInMap("Name")
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
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * Category.
         */
        public Builder category(Integer category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * EnableOnly.
         */
        public Builder enableOnly(Boolean enableOnly) {
            this.putQueryParameter("EnableOnly", enableOnly);
            this.enableOnly = enableOnly;
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
         * Name.
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
