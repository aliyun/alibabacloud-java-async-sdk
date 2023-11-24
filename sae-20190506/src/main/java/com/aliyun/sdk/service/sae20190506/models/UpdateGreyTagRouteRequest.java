// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGreyTagRouteRequest</p>
 */
public class UpdateGreyTagRouteRequest extends Request {
    @Query
    @NameInMap("AlbRules")
    private String albRules;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DubboRules")
    private String dubboRules;

    @Query
    @NameInMap("GreyTagRouteId")
    @Validation(required = true)
    private Long greyTagRouteId;

    @Query
    @NameInMap("ScRules")
    private String scRules;

    private UpdateGreyTagRouteRequest(Builder builder) {
        super(builder);
        this.albRules = builder.albRules;
        this.description = builder.description;
        this.dubboRules = builder.dubboRules;
        this.greyTagRouteId = builder.greyTagRouteId;
        this.scRules = builder.scRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateGreyTagRouteRequest create() {
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
     * @return greyTagRouteId
     */
    public Long getGreyTagRouteId() {
        return this.greyTagRouteId;
    }

    /**
     * @return scRules
     */
    public String getScRules() {
        return this.scRules;
    }

    public static final class Builder extends Request.Builder<UpdateGreyTagRouteRequest, Builder> {
        private String albRules; 
        private String description; 
        private String dubboRules; 
        private Long greyTagRouteId; 
        private String scRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGreyTagRouteRequest request) {
            super(request);
            this.albRules = request.albRules;
            this.description = request.description;
            this.dubboRules = request.dubboRules;
            this.greyTagRouteId = request.greyTagRouteId;
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
         * Canary Release - Regions
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * \[{"condition":"OR","group":"DUBBO","items":\[{"cond":"==","expr":".key1","index":0,"operator":"rawvalue","value":"value1"},{"cond":"==","expr":".key2","index":0,"operator":"rawvalue","value":"value2"}],"methodName":"echo","serviceName":"com.alibaba.edas.boot.EchoService","version":"1.0.0"}]
         */
        public Builder dubboRules(String dubboRules) {
            this.putQueryParameter("DubboRules", dubboRules);
            this.dubboRules = dubboRules;
            return this;
        }

        /**
         * 1
         */
        public Builder greyTagRouteId(Long greyTagRouteId) {
            this.putQueryParameter("GreyTagRouteId", greyTagRouteId);
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }

        /**
         * \[{"condition":"OR","items":\[{"cond":"==","name":"grey","operator":"rawvalue","type":"param","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"cookie","value":"true"},{"cond":"==","name":"grey","operator":"rawvalue","type":"header","value":"true"}],"path":"/post-echo/hi"}]
         */
        public Builder scRules(String scRules) {
            this.putQueryParameter("ScRules", scRules);
            this.scRules = scRules;
            return this;
        }

        @Override
        public UpdateGreyTagRouteRequest build() {
            return new UpdateGreyTagRouteRequest(this);
        } 

    } 

}
