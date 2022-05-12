// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateGreyTagRouteRequest</p>
 */
public class CreateGreyTagRouteRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DubboRules")
    private String dubboRules;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ScRules")
    private String scRules;

    private CreateGreyTagRouteRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.description = builder.description;
        this.dubboRules = builder.dubboRules;
        this.name = builder.name;
        this.scRules = builder.scRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGreyTagRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dubboRules
     */
    public String getDubboRules() {
        return this.dubboRules;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return scRules
     */
    public String getScRules() {
        return this.scRules;
    }

    public static final class Builder extends Request.Builder<CreateGreyTagRouteRequest, Builder> {
        private String appId; 
        private String description; 
        private String dubboRules; 
        private String name; 
        private String scRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateGreyTagRouteRequest request) {
            super(request);
            this.appId = request.appId;
            this.description = request.description;
            this.dubboRules = request.dubboRules;
            this.name = request.name;
            this.scRules = request.scRules;
        } 

        /**
         * 应用ID
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Dubbo规则
         */
        public Builder dubboRules(String dubboRules) {
            this.putQueryParameter("DubboRules", dubboRules);
            this.dubboRules = dubboRules;
            return this;
        }

        /**
         * 规则名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * SpringCloud规则
         */
        public Builder scRules(String scRules) {
            this.putQueryParameter("ScRules", scRules);
            this.scRules = scRules;
            return this;
        }

        @Override
        public CreateGreyTagRouteRequest build() {
            return new CreateGreyTagRouteRequest(this);
        } 

    } 

}
