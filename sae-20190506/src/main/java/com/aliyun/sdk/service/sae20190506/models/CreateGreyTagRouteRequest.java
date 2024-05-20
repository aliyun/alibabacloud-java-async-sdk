// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>CreateGreyTagRouteRequest</p>
 */
public class CreateGreyTagRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbRules")
    private String albRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DubboRules")
    private String dubboRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScRules")
    private String scRules;

    private CreateGreyTagRouteRequest(Builder builder) {
        super(builder);
        this.albRules = builder.albRules;
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
     * @return albRules
     */
    public String getAlbRules() {
        return this.albRules;
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
        private String albRules; 
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
            this.albRules = request.albRules;
            this.appId = request.appId;
            this.description = request.description;
            this.dubboRules = request.dubboRules;
            this.name = request.name;
            this.scRules = request.scRules;
        } 

        /**
         * AlbRules.
         */
        public Builder albRules(String albRules) {
            this.putQueryParameter("AlbRules", albRules);
            this.albRules = albRules;
            return this;
        }

        /**
         * dubbo-echo
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * \[{"condition":"OR","items":\[{"cond":"==","name":"grey","operator":"rawvalue","type":"param","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"cookie","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"header","value":"true"}],"path":"/post-echo/hi"}]
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder dubboRules(String dubboRules) {
            this.putQueryParameter("DubboRules", dubboRules);
            this.dubboRules = dubboRules;
            return this;
        }

        /**
         * Canary Release - Regions
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * \[{"condition":"OR","group":"DUBBO","items":\[{"cond":"==","expr":".key1","index":0,"operator":"rawvalue","value":"value1"},{"cond":"==","expr":".key2","index":0,"operator":"rawvalue","value":"value2"}],"methodName":"echo","serviceName":"com.alibaba.edas.boot.EchoService","version":"1.0.0"}]
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
