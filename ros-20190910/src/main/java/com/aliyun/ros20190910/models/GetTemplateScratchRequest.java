// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link GetTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateScratchRequest</p>
 */
public class GetTemplateScratchRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ShowDataOption")
    private String showDataOption;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;


    private GetTemplateScratchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.showDataOption = builder.showDataOption;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateScratchRequest create() {
        return builder().build();
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return showDataOption
     */
    public String getShowDataOption() {
        return this.showDataOption;
    }

    /**
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder extends Request.Builder<Builder> {
        private String regionId; 
        private String showDataOption; 
        private String templateScratchId; 

        /**
         * <p>RegionId.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>ShowDataOption.</p>
         */
        public Builder showDataOption(String showDataOption) {
            this.putQueryParameter("ShowDataOption", showDataOption);
            this.showDataOption = showDataOption;
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

        public GetTemplateScratchRequest build() {
            return new GetTemplateScratchRequest(this);
        } 

    } 

}
