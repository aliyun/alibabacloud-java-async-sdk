// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateRequest</p>
 */
public class DeleteTemplateRequest extends Request {
    @Query
    @NameInMap("AutoDeleteExecutions")
    private Boolean autoDeleteExecutions;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    private DeleteTemplateRequest(Builder builder) {
        super(builder);
        this.autoDeleteExecutions = builder.autoDeleteExecutions;
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoDeleteExecutions
     */
    public Boolean getAutoDeleteExecutions() {
        return this.autoDeleteExecutions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateRequest, Builder> {
        private Boolean autoDeleteExecutions; 
        private String regionId; 
        private String templateName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateRequest response) {
            super(response);
            this.autoDeleteExecutions = response.autoDeleteExecutions;
            this.regionId = response.regionId;
            this.templateName = response.templateName;
        } 

        /**
         * AutoDeleteExecutions.
         */
        public Builder autoDeleteExecutions(Boolean autoDeleteExecutions) {
            this.putQueryParameter("AutoDeleteExecutions", autoDeleteExecutions);
            this.autoDeleteExecutions = autoDeleteExecutions;
            return this;
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
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        @Override
        public DeleteTemplateRequest build() {
            return new DeleteTemplateRequest(this);
        } 

    } 

}
