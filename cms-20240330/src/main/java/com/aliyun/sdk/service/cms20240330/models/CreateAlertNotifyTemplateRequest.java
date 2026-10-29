// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateAlertNotifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertNotifyTemplateRequest</p>
 */
public class CreateAlertNotifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertNotifyTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateName")
    private String alertNotifyTemplateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("programLang")
    private String programLang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templates")
    private java.util.Map<String, java.util.Map<String, ?>> templates;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private CreateAlertNotifyTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNotifyTemplateId = builder.alertNotifyTemplateId;
        this.alertNotifyTemplateName = builder.alertNotifyTemplateName;
        this.programLang = builder.programLang;
        this.templates = builder.templates;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertNotifyTemplateRequest create() {
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
     * @return alertNotifyTemplateId
     */
    public String getAlertNotifyTemplateId() {
        return this.alertNotifyTemplateId;
    }

    /**
     * @return alertNotifyTemplateName
     */
    public String getAlertNotifyTemplateName() {
        return this.alertNotifyTemplateName;
    }

    /**
     * @return programLang
     */
    public String getProgramLang() {
        return this.programLang;
    }

    /**
     * @return templates
     */
    public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
        return this.templates;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateAlertNotifyTemplateRequest, Builder> {
        private String regionId; 
        private String alertNotifyTemplateId; 
        private String alertNotifyTemplateName; 
        private String programLang; 
        private java.util.Map<String, java.util.Map<String, ?>> templates; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertNotifyTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNotifyTemplateId = request.alertNotifyTemplateId;
            this.alertNotifyTemplateName = request.alertNotifyTemplateName;
            this.programLang = request.programLang;
            this.templates = request.templates;
            this.type = request.type;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder alertNotifyTemplateId(String alertNotifyTemplateId) {
            this.putBodyParameter("alertNotifyTemplateId", alertNotifyTemplateId);
            this.alertNotifyTemplateId = alertNotifyTemplateId;
            return this;
        }

        /**
         * alertNotifyTemplateName.
         */
        public Builder alertNotifyTemplateName(String alertNotifyTemplateName) {
            this.putBodyParameter("alertNotifyTemplateName", alertNotifyTemplateName);
            this.alertNotifyTemplateName = alertNotifyTemplateName;
            return this;
        }

        /**
         * programLang.
         */
        public Builder programLang(String programLang) {
            this.putBodyParameter("programLang", programLang);
            this.programLang = programLang;
            return this;
        }

        /**
         * templates.
         */
        public Builder templates(java.util.Map<String, java.util.Map<String, ?>> templates) {
            this.putBodyParameter("templates", templates);
            this.templates = templates;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateAlertNotifyTemplateRequest build() {
            return new CreateAlertNotifyTemplateRequest(this);
        } 

    } 

}
