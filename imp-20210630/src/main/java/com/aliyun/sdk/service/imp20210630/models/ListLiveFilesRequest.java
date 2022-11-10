// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveFilesRequest} extends {@link RequestModel}
 *
 * <p>ListLiveFilesRequest</p>
 */
public class ListLiveFilesRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    private ListLiveFilesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.liveId = builder.liveId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveFilesRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    public static final class Builder extends Request.Builder<ListLiveFilesRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String liveId; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveFilesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
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
         * 应用ID。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 直播ID。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        @Override
        public ListLiveFilesRequest build() {
            return new ListLiveFilesRequest(this);
        } 

    } 

}
