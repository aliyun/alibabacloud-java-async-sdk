// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateTemplateByScratchRequest} extends {@link RequestModel}
 *
 * <p>GenerateTemplateByScratchRequest</p>
 */
public class GenerateTemplateByScratchRequest extends Request {
    @Query
    @NameInMap("ProvisionRegionId")
    private String provisionRegionId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TemplateScratchId")
    @Validation(required = true)
    private String templateScratchId;

    @Query
    @NameInMap("TemplateType")
    private String templateType;

    private GenerateTemplateByScratchRequest(Builder builder) {
        super(builder);
        this.provisionRegionId = builder.provisionRegionId;
        this.regionId = builder.regionId;
        this.templateScratchId = builder.templateScratchId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateTemplateByScratchRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return provisionRegionId
     */
    public String getProvisionRegionId() {
        return this.provisionRegionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<GenerateTemplateByScratchRequest, Builder> {
        private String provisionRegionId; 
        private String regionId; 
        private String templateScratchId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTemplateByScratchRequest request) {
            super(request);
            this.provisionRegionId = request.provisionRegionId;
            this.regionId = request.regionId;
            this.templateScratchId = request.templateScratchId;
            this.templateType = request.templateType;
        } 

        /**
         * The region ID of the new node.
         */
        public Builder provisionRegionId(String provisionRegionId) {
            this.putQueryParameter("ProvisionRegionId", provisionRegionId);
            this.provisionRegionId = provisionRegionId;
            return this;
        }

        /**
         * The region ID of the scenario.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the scenario.
         * <p>
         * 
         * For more information about how to query the IDs of scenarios, see [ListTemplateScratches](~~363050~~).
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * The type of the template that Resource Orchestration Service (ROS) generates. ROS can generate templates of the ROS and Terraform types. Default value: ROS.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public GenerateTemplateByScratchRequest build() {
            return new GenerateTemplateByScratchRequest(this);
        } 

    } 

}
