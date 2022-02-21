// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateExecutionPolicyRequest} extends {@link RequestModel}
 *
 * <p>GenerateExecutionPolicyRequest</p>
 */
public class GenerateExecutionPolicyRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private GenerateExecutionPolicyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateExecutionPolicyRequest create() {
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
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<GenerateExecutionPolicyRequest, Builder> {
        private String regionId; 
        private String templateName; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GenerateExecutionPolicyRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.templateName = response.templateName;
            this.templateVersion = response.templateVersion;
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

        /**
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GenerateExecutionPolicyRequest build() {
            return new GenerateExecutionPolicyRequest(this);
        } 

    } 

}
