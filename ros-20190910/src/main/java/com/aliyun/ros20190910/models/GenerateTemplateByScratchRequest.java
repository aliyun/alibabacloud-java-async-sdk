// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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

    public static final class Builder extends Request.Builder {
        private String provisionRegionId; 
        private String regionId; 
        private String templateScratchId; 

        /**
         * <p>ProvisionRegionId.</p>
         */
        public Builder provisionRegionId(String provisionRegionId) {
            this.putQueryParameter("ProvisionRegionId", provisionRegionId);
            this.provisionRegionId = provisionRegionId;
            return this;
        }

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>TemplateScratchId.</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        public GenerateTemplateByScratchRequest build() {
            return new GenerateTemplateByScratchRequest(this);
        } 

    } 

}
