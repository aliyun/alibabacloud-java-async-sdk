// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomTemplateRequest</p>
 */
public class CreateCustomTemplateRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CustomTemplate")
    @Validation(required = true)
    private String customTemplate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private CreateCustomTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.customTemplate = builder.customTemplate;
        this.ownerId = builder.ownerId;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomTemplateRequest create() {
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
     * @return customTemplate
     */
    public String getCustomTemplate() {
        return this.customTemplate;
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

    public static final class Builder extends Request.Builder<CreateCustomTemplateRequest, Builder> {
        private String regionId; 
        private String customTemplate; 
        private Long ownerId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.customTemplate = request.customTemplate;
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
         * CustomTemplate.
         */
        public Builder customTemplate(String customTemplate) {
            this.putQueryParameter("CustomTemplate", customTemplate);
            this.customTemplate = customTemplate;
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
        public CreateCustomTemplateRequest build() {
            return new CreateCustomTemplateRequest(this);
        } 

    } 

}
