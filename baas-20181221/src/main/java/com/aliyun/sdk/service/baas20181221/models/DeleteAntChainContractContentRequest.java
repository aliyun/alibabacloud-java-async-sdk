// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainContractContentRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntChainContractContentRequest</p>
 */
public class DeleteAntChainContractContentRequest extends Request {
    @Body
    @NameInMap("ContentId")
    @Validation(required = true)
    private String contentId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteAntChainContractContentRequest(Builder builder) {
        super(builder);
        this.contentId = builder.contentId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAntChainContractContentRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentId
     */
    public String getContentId() {
        return this.contentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteAntChainContractContentRequest, Builder> {
        private String contentId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntChainContractContentRequest response) {
            super(response);
            this.contentId = response.contentId;
            this.regionId = response.regionId;
        } 

        /**
         * ContentId.
         */
        public Builder contentId(String contentId) {
            this.putBodyParameter("ContentId", contentId);
            this.contentId = contentId;
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

        @Override
        public DeleteAntChainContractContentRequest build() {
            return new DeleteAntChainContractContentRequest(this);
        } 

    } 

}
