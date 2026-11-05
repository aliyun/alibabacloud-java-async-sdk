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
 * {@link DescribePolarClawSkillTemplateRequest} extends {@link RequestModel}
 *
 * <p>DescribePolarClawSkillTemplateRequest</p>
 */
public class DescribePolarClawSkillTemplateRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("SkillTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String skillTemplateId;

    private DescribePolarClawSkillTemplateRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.applicationType = builder.applicationType;
        this.regionId = builder.regionId;
        this.skillTemplateId = builder.skillTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarClawSkillTemplateRequest create() {
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
     * @return skillTemplateId
     */
    public String getSkillTemplateId() {
        return this.skillTemplateId;
    }

    public static final class Builder extends Request.Builder<DescribePolarClawSkillTemplateRequest, Builder> {
        private String applicationId; 
        private String applicationType; 
        private String regionId; 
        private String skillTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePolarClawSkillTemplateRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.applicationType = request.applicationType;
            this.regionId = request.regionId;
            this.skillTemplateId = request.skillTemplateId;
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
         * <p>If you call this operation for the first time, you do not need to specify this parameter.</p>
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
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query available regions.</p>
         * </blockquote>
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
         * <p>The skill template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pcpg-skill-**************</p>
         */
        public Builder skillTemplateId(String skillTemplateId) {
            this.putQueryParameter("SkillTemplateId", skillTemplateId);
            this.skillTemplateId = skillTemplateId;
            return this;
        }

        @Override
        public DescribePolarClawSkillTemplateRequest build() {
            return new DescribePolarClawSkillTemplateRequest(this);
        } 

    } 

}
