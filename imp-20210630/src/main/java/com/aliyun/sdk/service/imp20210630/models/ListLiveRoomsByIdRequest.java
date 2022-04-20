// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveRoomsByIdRequest} extends {@link RequestModel}
 *
 * <p>ListLiveRoomsByIdRequest</p>
 */
public class ListLiveRoomsByIdRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LiveIdList")
    @Validation(required = true)
    private java.util.List < String > liveIdList;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListLiveRoomsByIdRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveIdList = builder.liveIdList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveRoomsByIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return liveIdList
     */
    public java.util.List < String > getLiveIdList() {
        return this.liveIdList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListLiveRoomsByIdRequest, Builder> {
        private String appId; 
        private java.util.List < String > liveIdList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListLiveRoomsByIdRequest request) {
            super(request);
            this.appId = request.appId;
            this.liveIdList = request.liveIdList;
            this.regionId = request.regionId;
        } 

        /**
         * 应用唯一标识，由6位小写字母、数字组成。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 直播ID列表。
         */
        public Builder liveIdList(java.util.List < String > liveIdList) {
            String liveIdListShrink = shrink(liveIdList, "LiveIdList", "json");
            this.putBodyParameter("LiveIdList", liveIdListShrink);
            this.liveIdList = liveIdList;
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
        public ListLiveRoomsByIdRequest build() {
            return new ListLiveRoomsByIdRequest(this);
        } 

    } 

}
