// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAntChainContractContentRequest} extends {@link RequestModel}
 *
 * <p>DeleteAntChainContractContentRequest</p>
 */
public class DeleteAntChainContractContentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contentId;

    private DeleteAntChainContractContentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentId = builder.contentId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contentId
     */
    public String getContentId() {
        return this.contentId;
    }

    public static final class Builder extends Request.Builder<DeleteAntChainContractContentRequest, Builder> {
        private String regionId; 
        private String contentId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAntChainContractContentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentId = request.contentId;
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
         * ContentId.
         */
        public Builder contentId(String contentId) {
            this.putBodyParameter("ContentId", contentId);
            this.contentId = contentId;
            return this;
        }

        @Override
        public DeleteAntChainContractContentRequest build() {
            return new DeleteAntChainContractContentRequest(this);
        } 

    } 

}
