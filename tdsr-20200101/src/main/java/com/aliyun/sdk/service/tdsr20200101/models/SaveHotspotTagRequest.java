// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SaveHotspotTagRequest} extends {@link RequestModel}
 *
 * <p>SaveHotspotTagRequest</p>
 */
public class SaveHotspotTagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParamTag")
    private String paramTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SubSceneUuid")
    private String subSceneUuid;

    private SaveHotspotTagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.paramTag = builder.paramTag;
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
     * @return subSceneUuid
     */
    public String getSubSceneUuid() {
        return this.subSceneUuid;
    }

    public static final class Builder extends Request.Builder<SaveHotspotTagRequest, Builder> {
        private String regionId; 
        private String paramTag; 
        private String subSceneUuid; 

        private Builder() {
            super();
        } 

        private Builder(SaveHotspotTagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.paramTag = request.paramTag;
            this.subSceneUuid = request.subSceneUuid;
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
