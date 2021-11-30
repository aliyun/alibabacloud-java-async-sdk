// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DeleteTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateScratchRequest</p>
 */
public class DeleteTemplateScratchRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;


    private DeleteTemplateScratchRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templateScratchId = builder.templateScratchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTemplateScratchRequest create() {
        return builder().build();
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
        private String regionId; 
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
         * <p>TemplateScratchId.</p>
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        public DeleteTemplateScratchRequest build() {
            return new DeleteTemplateScratchRequest(this);
        } 

    } 

}
