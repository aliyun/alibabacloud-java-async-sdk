// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTemplateScratchRequest} extends {@link RequestModel}
 *
 * <p>DeleteTemplateScratchRequest</p>
 */
public class DeleteTemplateScratchRequest extends Request {
    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("TemplateScratchId")
    @Validation(required = true)
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
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    public static final class Builder extends Request.Builder<DeleteTemplateScratchRequest, Builder> {
        private String regionId; 
        private String templateScratchId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTemplateScratchRequest response) {
            super(response);
            this.regionId = response.regionId;
            this.templateScratchId = response.templateScratchId;
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
        public DeleteTemplateScratchRequest build() {
            return new DeleteTemplateScratchRequest(this);
        } 

    } 

}
