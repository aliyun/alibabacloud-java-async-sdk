// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreatePolarClawSkillTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreatePolarClawSkillTemplateRequest</p>
 */
public class CreatePolarClawSkillTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationType")
    private String applicationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillTemplateDesc")
    private String skillTemplateDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillTemplateName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillTemplateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SkillTemplateParam")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillTemplateParam;

    private CreatePolarClawSkillTemplateRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.regionId = builder.regionId;
        this.skillTemplateDesc = builder.skillTemplateDesc;
        this.skillTemplateName = builder.skillTemplateName;
        this.skillTemplateParam = builder.skillTemplateParam;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePolarClawSkillTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return applicationType
     */
    public String getApplicationType() {
        return this.applicationType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return skillTemplateDesc
     */
    public String getSkillTemplateDesc() {
        return this.skillTemplateDesc;
    }

    /**
     * @return skillTemplateName
     */
    public String getSkillTemplateName() {
        return this.skillTemplateName;
    }

    /**
     * @return skillTemplateParam
     */
    public String getSkillTemplateParam() {
        return this.skillTemplateParam;
    }

    public static final class Builder extends Request.Builder<CreatePolarClawSkillTemplateRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private String regionId; 
        private String skillTemplateDesc; 
        private String skillTemplateName; 
        private String skillTemplateParam; 

        private Builder() {
            super();
        } 

        private Builder(CreatePolarClawSkillTemplateRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.regionId = request.regionId;
            this.skillTemplateDesc = request.skillTemplateDesc;
            this.skillTemplateName = request.skillTemplateName;
            this.skillTemplateParam = request.skillTemplateParam;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The application type.</p>
         * <blockquote>
         * <p>If you are calling this operation for the first time, you do not need to specify this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>polardb_polarclaw</p>
         */
        public Builder applicationType(String applicationType) {
            this.putQueryParameter("ApplicationType", applicationType);
            this.applicationType = applicationType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query all available regions for the current account, including region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The description of the skill template.</p>
         * 
         * <strong>example:</strong>
         * <p>skill template for test.</p>
         */
        public Builder skillTemplateDesc(String skillTemplateDesc) {
            this.putQueryParameter("SkillTemplateDesc", skillTemplateDesc);
            this.skillTemplateDesc = skillTemplateDesc;
            return this;
        }

        /**
         * <p>The name of the skill template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>skill_template_test</p>
         */
        public Builder skillTemplateName(String skillTemplateName) {
            this.putQueryParameter("SkillTemplateName", skillTemplateName);
            this.skillTemplateName = skillTemplateName;
            return this;
        }

        /**
         * <p>The skill template parameters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;skillName\&quot;:\&quot;polarclawhub\&quot;,\&quot;version\&quot;:\&quot;0.0.0\&quot;},{\&quot;skillName\&quot;:\&quot;github\&quot;,\&quot;version\&quot;:\&quot;1.0.0\&quot;}]</p>
         */
        public Builder skillTemplateParam(String skillTemplateParam) {
            this.putQueryParameter("SkillTemplateParam", skillTemplateParam);
            this.skillTemplateParam = skillTemplateParam;
            return this;
        }

        @Override
        public CreatePolarClawSkillTemplateRequest build() {
            return new CreatePolarClawSkillTemplateRequest(this);
        } 

    } 

}
