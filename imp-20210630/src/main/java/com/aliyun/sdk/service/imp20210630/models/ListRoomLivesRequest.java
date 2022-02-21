// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomLivesRequest} extends {@link RequestModel}
 *
 * <p>ListRoomLivesRequest</p>
 */
public class ListRoomLivesRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("QueryTimestamp")
    private Long queryTimestamp;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    private String roomId;

    @Body
    @NameInMap("RoomIdList")
    private java.util.List < String > roomIdList;

    @Body
    @NameInMap("Size")
    private Integer size;

    @Body
    @NameInMap("Status")
    private Integer status;

    private ListRoomLivesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.queryTimestamp = builder.queryTimestamp;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
        this.roomIdList = builder.roomIdList;
        this.size = builder.size;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoomLivesRequest create() {
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
     * @return queryTimestamp
     */
    public Long getQueryTimestamp() {
        return this.queryTimestamp;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roomId
     */
    public String getRoomId() {
        return this.roomId;
    }

    /**
     * @return roomIdList
     */
    public java.util.List < String > getRoomIdList() {
        return this.roomIdList;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListRoomLivesRequest, Builder> {
        private String appId; 
        private Long queryTimestamp; 
        private String regionId; 
        private String roomId; 
        private java.util.List < String > roomIdList; 
        private Integer size; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(ListRoomLivesRequest response) {
            super(response);
            this.appId = response.appId;
            this.queryTimestamp = response.queryTimestamp;
            this.regionId = response.regionId;
            this.roomId = response.roomId;
            this.roomIdList = response.roomIdList;
            this.size = response.size;
            this.status = response.status;
        } 

        /**
         * 应用唯一标识，可以包含小写字母、数字，长度为6个字符。
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * 拉取在这个时间戳之前创建的直播，单位毫秒，不传则默认拉取最新创建的。
         */
        public Builder queryTimestamp(Long queryTimestamp) {
            this.putBodyParameter("QueryTimestamp", queryTimestamp);
            this.queryTimestamp = queryTimestamp;
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
         * 房间ID，最大长度36个字符。
         */
        public Builder roomId(String roomId) {
            this.putBodyParameter("RoomId", roomId);
            this.roomId = roomId;
            return this;
        }

        /**
         * 房间ID列表，可指定多个房间id，过滤优先级高于RoomId。
         */
        public Builder roomIdList(java.util.List < String > roomIdList) {
            this.putBodyParameter("RoomIdList", roomIdList);
            this.roomIdList = roomIdList;
            return this;
        }

        /**
         * 拉取直播数量。
         */
        public Builder size(Integer size) {
            this.putBodyParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * 直播状态筛选条件，0-直播 1-下播，不传则返回全部状态
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListRoomLivesRequest build() {
            return new ListRoomLivesRequest(this);
        } 

    } 

}
