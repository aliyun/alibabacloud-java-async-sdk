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
 * {@link UpdateAlertNotifyTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertNotifyTemplateRequest</p>
 */
public class UpdateAlertNotifyTemplateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String alertNotifyTemplateId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("alertNotifyTemplateName")
    private String alertNotifyTemplateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("templates")
    private java.util.Map<String, java.util.Map<String, ?>> templates;

    private UpdateAlertNotifyTemplateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.alertNotifyTemplateId = builder.alertNotifyTemplateId;
        this.alertNotifyTemplateName = builder.alertNotifyTemplateName;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertNotifyTemplateRequest create() {
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
     * @return templates
     */
    public java.util.Map<String, java.util.Map<String, ?>> getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<UpdateAlertNotifyTemplateRequest, Builder> {
        private String regionId; 
        private String alertNotifyTemplateId; 
        private String alertNotifyTemplateName; 
        private java.util.Map<String, java.util.Map<String, ?>> templates; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertNotifyTemplateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.alertNotifyTemplateId = request.alertNotifyTemplateId;
            this.alertNotifyTemplateName = request.alertNotifyTemplateName;
            this.templates = request.templates;
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
            this.putPathParameter("alertNotifyTemplateId", alertNotifyTemplateId);
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
         * templates.
         */
        public Builder templates(java.util.Map<String, java.util.Map<String, ?>> templates) {
            this.putBodyParameter("templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public UpdateAlertNotifyTemplateRequest build() {
            return new UpdateAlertNotifyTemplateRequest(this);
        } 

    } 

}
