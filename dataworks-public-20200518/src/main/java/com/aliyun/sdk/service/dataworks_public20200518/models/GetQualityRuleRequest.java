// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetQualityRuleRequest} extends {@link RequestModel}
 *
 * <p>GetQualityRuleRequest</p>
 */
public class GetQualityRuleRequest extends Request {
    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Body
    @NameInMap("RuleId")
    @Validation(required = true, maximum = 2147483647, minimum = 1)
    private Long ruleId;

    private GetQualityRuleRequest(Builder builder) {
        super(builder);
        this.projectName = builder.projectName;
        this.regionId = builder.regionId;
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<GetQualityRuleRequest, Builder> {
        private String projectName; 
        private String regionId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(GetQualityRuleRequest request) {
            super(request);
            this.projectName = request.projectName;
            this.regionId = request.regionId;
            this.ruleId = request.ruleId;
        } 

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
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
         * RuleId.
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
