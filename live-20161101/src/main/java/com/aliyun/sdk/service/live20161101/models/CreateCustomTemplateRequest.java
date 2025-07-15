// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCustomTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomTemplateRequest</p>
 */
public class CreateCustomTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomTemplate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customTemplate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Template")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(CreateCustomTemplateRequest request) {
            super(request);
            this.customTemplate = request.customTemplate;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.template = request.template;
        } 

        /**
         * <p>The configuration of the template. The value is in the following JSON format: {height:xxx,scale:xxx,gop:xxx,bframes:xxx,cdesc:xxx}. All fields are required. If any field is left empty, the call fails.</p>
         * <blockquote>
         * <p> For more information, see <strong>Fields of the CustomTemplate parameter</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{height:1080,scale:[16:9],gop:60,bframes:30,cdesc:h264}</p>
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the template.</p>
         * <blockquote>
         * <p>Record the template name. The template name is required if you want to use, query, or delete the template.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TestTemplate</p>
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
