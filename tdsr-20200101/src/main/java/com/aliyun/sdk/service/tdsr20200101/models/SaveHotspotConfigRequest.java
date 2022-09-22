// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveHotspotConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveHotspotConfigRequest</p>
 */
public class SaveHotspotConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ParamTag")
    private String paramTag;

    @Query
    @NameInMap("PreviewToken")
    private String previewToken;

    private SaveHotspotConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramTag = builder.paramTag;
        this.previewToken = builder.previewToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveHotspotConfigRequest create() {
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
     * @return paramTag
     */
    public String getParamTag() {
        return this.paramTag;
    }

    /**
     * @return previewToken
     */
    public String getPreviewToken() {
        return this.previewToken;
    }

    public static final class Builder extends Request.Builder<SaveHotspotConfigRequest, Builder> {
        private String regionId; 
        private String paramTag; 
        private String previewToken; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramTag = request.paramTag;
            this.previewToken = request.previewToken;
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
         * ParamTag.
         */
        public Builder paramTag(String paramTag) {
            this.putQueryParameter("ParamTag", paramTag);
            this.paramTag = paramTag;
            return this;
        }

        /**
         * PreviewToken.
         */
        public Builder previewToken(String previewToken) {
            this.putQueryParameter("PreviewToken", previewToken);
            this.previewToken = previewToken;
            return this;
        }

        @Override
        public SaveHotspotConfigRequest build() {
            return new SaveHotspotConfigRequest(this);
        } 

    } 

}
