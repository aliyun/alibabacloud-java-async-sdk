// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetCustomTemplateRequest</p>
 */
public class GetCustomTemplateRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private GetCustomTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<GetCustomTemplateRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerId = request.ownerId;
            this.template = request.template;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Template.
         */
        public Builder template(String template) {
            this.putQueryParameter("Template", template);
            this.template = template;
            return this;
        }

        @Override
        public GetCustomTemplateRequest build() {
            return new GetCustomTemplateRequest(this);
        } 

    } 

}
