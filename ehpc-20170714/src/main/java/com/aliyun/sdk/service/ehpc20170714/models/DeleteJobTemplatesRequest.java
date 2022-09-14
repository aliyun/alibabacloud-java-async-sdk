// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteJobTemplatesRequest} extends {@link RequestModel}
 *
 * <p>DeleteJobTemplatesRequest</p>
 */
public class DeleteJobTemplatesRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Templates")
    @Validation(required = true)
    private String templates;

    private DeleteJobTemplatesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.templates = builder.templates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteJobTemplatesRequest create() {
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
     * @return templates
     */
    public String getTemplates() {
        return this.templates;
    }

    public static final class Builder extends Request.Builder<DeleteJobTemplatesRequest, Builder> {
        private String regionId; 
        private String templates; 

        private Builder() {
            super();
        } 

        private Builder(DeleteJobTemplatesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.templates = request.templates;
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
         * Templates.
         */
        public Builder templates(String templates) {
            this.putQueryParameter("Templates", templates);
            this.templates = templates;
            return this;
        }

        @Override
        public DeleteJobTemplatesRequest build() {
            return new DeleteJobTemplatesRequest(this);
        } 

    } 

}
