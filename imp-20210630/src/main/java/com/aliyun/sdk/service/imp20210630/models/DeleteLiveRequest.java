// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveRequest</p>
 */
public class DeleteLiveRequest extends Request {
    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteLiveRequest(Builder builder) {
        super(builder);
        this.liveId = builder.liveId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveRequest, Builder> {
        private String liveId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveRequest request) {
            super(request);
            this.liveId = request.liveId;
            this.regionId = request.regionId;
        } 

        /**
         * 直播资源的唯一标识ID
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
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
        public DeleteLiveRequest build() {
            return new DeleteLiveRequest(this);
        } 

    } 

}
