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
        private String description; 
        private String dubboRules; 
        private Long greyTagRouteId; 
        private String scRules; 

        private Builder() {
            super();
        } 

        private Builder(UpdateGreyTagRouteRequest response) {
            super(response);
            this.description = response.description;
            this.dubboRules = response.dubboRules;
            this.greyTagRouteId = response.greyTagRouteId;
            this.scRules = response.scRules;
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
         * 规则ID
         */
        public Builder greyTagRouteId(Long greyTagRouteId) {
            this.putQueryParameter("GreyTagRouteId", greyTagRouteId);
            this.greyTagRouteId = greyTagRouteId;
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
        public UpdateGreyTagRouteRequest build() {
            return new UpdateGreyTagRouteRequest(this);
        } 

    } 

}
