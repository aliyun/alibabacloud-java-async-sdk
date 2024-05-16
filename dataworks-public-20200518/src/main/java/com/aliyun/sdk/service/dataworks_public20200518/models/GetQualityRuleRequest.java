// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>GetQualityRuleRequest</p>
 */
public class GetQualityRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long ruleId;

    private GetQualityRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualityRuleRequest create() {
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
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
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

    public static final class Builder extends Request.Builder<GetQualityRuleRequest, Builder> {
        private String regionId; 
        private Long projectId; 
        private String projectName; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.ruleId = request.ruleId;
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
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The name of the compute engine instance or data source.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The ID of the monitoring rule. You can call the [ListQualityRules](~~173995~~) operation to query the ID.
         */
        public Builder ruleId(Long ruleId) {
            this.putBodyParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public GetQualityRuleRequest build() {
            return new GetQualityRuleRequest(this);
        } 

    } 

}
