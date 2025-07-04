// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link DeleteTemplateRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateRequest</p>
 */
public class DeleteTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoDeleteExecutions")
    private Boolean autoDeleteExecutions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DeleteTemplateRequest request) {
            super(request);
            this.autoDeleteExecutions = request.autoDeleteExecutions;
            this.regionId = request.regionId;
            this.templateName = request.templateName;
        } 

        /**
         * <p>Specifies whether to delete the related executions when a template is deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoDeleteExecutions(Boolean autoDeleteExecutions) {
            this.putQueryParameter("AutoDeleteExecutions", autoDeleteExecutions);
            this.autoDeleteExecutions = autoDeleteExecutions;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the template. The name can be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MyTemplate</p>
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
