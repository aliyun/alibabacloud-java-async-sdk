// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteQualityRuleRequest</p>
 */
public class DeleteQualityRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private DeleteQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectName = builder.projectName;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteQualityRuleRequest create() {
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DeleteQualityRuleRequest, Builder> {
        private String regionId; 
        private String projectName; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectName = request.projectName;
            this.ruleId = request.ruleId;
        } 

        /**
         * The ID of the region where your project resides.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the database engine or data source.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DeleteQualityRuleRequest build() {
            return new DeleteQualityRuleRequest(this);
        } 

    } 

}
