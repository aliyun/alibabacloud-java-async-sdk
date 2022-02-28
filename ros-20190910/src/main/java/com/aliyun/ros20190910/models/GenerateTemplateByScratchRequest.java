// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

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
    private String regionId;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    private GenerateTemplateByScratchRequest(Builder builder) {
        super(builder);
        this.provisionRegionId = builder.provisionRegionId;
        this.regionId = builder.regionId;
        this.templateScratchId = builder.templateScratchId;
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

    public static final class Builder extends Request.Builder<GenerateTemplateByScratchRequest, Builder> {
        private String provisionRegionId; 
        private String regionId; 
        private String templateScratchId; 

        private Builder() {
            super();
        } 

        private Builder(GenerateTemplateByScratchRequest response) {
            super(response);
            this.provisionRegionId = response.provisionRegionId;
            this.regionId = response.regionId;
            this.templateScratchId = response.templateScratchId;
        } 

        /**
         * ProvisionRegionId.
         */
        public Builder provisionRegionId(String provisionRegionId) {
            this.putQueryParameter("ProvisionRegionId", provisionRegionId);
            this.provisionRegionId = provisionRegionId;
            return this;
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
         * TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        @Override
        public GenerateTemplateByScratchRequest build() {
            return new GenerateTemplateByScratchRequest(this);
        } 

    } 

}
