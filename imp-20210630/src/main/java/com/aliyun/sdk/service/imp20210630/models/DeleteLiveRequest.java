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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    private DeleteLiveRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.liveId = builder.liveId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveRequest, Builder> {
        private String regionId; 
        private String liveId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.liveId = request.liveId;
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
         * 直播资源的唯一标识ID
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        @Override
        public DeleteLiveRequest build() {
            return new DeleteLiveRequest(this);
        } 

    } 

}
