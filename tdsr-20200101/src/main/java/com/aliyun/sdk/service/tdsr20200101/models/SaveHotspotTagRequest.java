// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveHotspotTagRequest} extends {@link RequestModel}
 *
 * <p>SaveHotspotTagRequest</p>
 */
public class SaveHotspotTagRequest extends Request {
    @Query
    @NameInMap("ParamTag")
    private String paramTag;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("SubSceneUuid")
    private String subSceneUuid;

    private SaveHotspotTagRequest(Builder builder) {
        super(builder);
        this.paramTag = builder.paramTag;
        this.regionId = builder.regionId;
        this.subSceneUuid = builder.subSceneUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveHotspotTagRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return subSceneUuid
     */
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    public static final class Builder extends Request.Builder<SaveHotspotTagRequest, Builder> {
        private String paramTag; 
        private String regionId; 
        private String subSceneUuid; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotTagRequest request) {
            super(request);
            this.paramTag = request.paramTag;
            this.regionId = request.regionId;
            this.subSceneUuid = request.subSceneUuid;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SubSceneUuid.
         */
        public Builder subSceneUuid(String subSceneUuid) {
            this.putQueryParameter("SubSceneUuid", subSceneUuid);
            this.subSceneUuid = subSceneUuid;
            return this;
        }

        @Override
        public SaveHotspotTagRequest build() {
            return new SaveHotspotTagRequest(this);
        } 

    } 

}
