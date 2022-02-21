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
    @Query
    @NameInMap("CustomTemplate")
    @Validation(required = true)
    private String customTemplate;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Template")
    @Validation(required = true)
    private String template;

    private CreateCustomTemplateRequest(Builder builder) {
        super(builder);
        this.customTemplate = builder.customTemplate;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder extends Request.Builder<CreateCustomTemplateRequest, Builder> {
        private String customTemplate; 
        private Long ownerId; 
        private String regionId; 
        private String template; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomTemplateRequest response) {
            super(response);
            this.customTemplate = response.customTemplate;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.template = response.template;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
