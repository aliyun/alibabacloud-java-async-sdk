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
    @Query
    @NameInMap("ParamTag")
    private String paramTag;

    @Query
    @NameInMap("PreviewToken")
    private String previewToken;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private SaveHotspotConfigRequest(Builder builder) {
        super(builder);
        this.paramTag = builder.paramTag;
        this.previewToken = builder.previewToken;
        this.regionId = builder.regionId;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SaveHotspotConfigRequest, Builder> {
        private String paramTag; 
        private String previewToken; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotConfigRequest response) {
            super(response);
            this.paramTag = response.paramTag;
            this.previewToken = response.previewToken;
            this.regionId = response.regionId;
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

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SaveHotspotConfigRequest build() {
            return new SaveHotspotConfigRequest(this);
        } 

    } 

}
