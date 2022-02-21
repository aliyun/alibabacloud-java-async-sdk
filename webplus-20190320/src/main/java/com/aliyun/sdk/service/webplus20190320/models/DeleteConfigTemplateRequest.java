// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteConfigTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteConfigTemplateRequest</p>
 */
public class DeleteConfigTemplateRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateId")
    @Validation(required = true)
    private String templateId;

    private DeleteConfigTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConfigTemplateRequest create() {
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
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<DeleteConfigTemplateRequest, Builder> {
        private String regionId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConfigTemplateRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.templateId = response.templateId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public DeleteConfigTemplateRequest build() {
            return new DeleteConfigTemplateRequest(this);
        } 

    } 

}
