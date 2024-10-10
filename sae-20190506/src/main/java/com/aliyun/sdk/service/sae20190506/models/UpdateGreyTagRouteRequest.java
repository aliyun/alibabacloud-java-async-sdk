// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateGreyTagRouteRequest} extends {@link RequestModel}
 *
 * <p>UpdateGreyTagRouteRequest</p>
 */
public class UpdateGreyTagRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AlbRules")
    private String albRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DubboRules")
    private String dubboRules;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GreyTagRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long greyTagRouteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScRules")
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
         * <p>Canary Release - Regions</p>
         * 
         * <strong>example:</strong>
         * <p>灰度发布-地域灰度</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;group&quot;:&quot;DUBBO&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key1&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key2&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value2&quot;}],&quot;methodName&quot;:&quot;echo&quot;,&quot;serviceName&quot;:&quot;com.alibaba.edas.boot.EchoService&quot;,&quot;version&quot;:&quot;1.0.0&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;group&quot;:&quot;DUBBO&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key1&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value1&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;expr&quot;:&quot;.key2&quot;,&quot;index&quot;:0,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;value&quot;:&quot;value2&quot;}],&quot;methodName&quot;:&quot;echo&quot;,&quot;serviceName&quot;:&quot;com.alibaba.edas.boot.EchoService&quot;,&quot;version&quot;:&quot;1.0.0&quot;}]</p>
         */
        public Builder dubboRules(String dubboRules) {
            this.putQueryParameter("DubboRules", dubboRules);
            this.dubboRules = dubboRules;
            return this;
        }

        /**
         * <p>1</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder greyTagRouteId(Long greyTagRouteId) {
            this.putQueryParameter("GreyTagRouteId", greyTagRouteId);
            this.greyTagRouteId = greyTagRouteId;
            return this;
        }

        /**
         * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;param&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;condition&quot;:&quot;OR&quot;,&quot;items&quot;:[{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;param&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;cookie&quot;,&quot;value&quot;:&quot;true&quot;},{&quot;cond&quot;:&quot;==&quot;,&quot;name&quot;:&quot;grey&quot;,&quot;operator&quot;:&quot;rawvalue&quot;,&quot;type&quot;:&quot;header&quot;,&quot;value&quot;:&quot;true&quot;}],&quot;path&quot;:&quot;/post-echo/hi&quot;}]</p>
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
