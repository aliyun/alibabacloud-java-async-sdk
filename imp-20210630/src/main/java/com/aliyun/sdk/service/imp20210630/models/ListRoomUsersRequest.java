// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRoomUsersRequest} extends {@link RequestModel}
 *
 * <p>ListRoomUsersRequest</p>
 */
public class ListRoomUsersRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Body
    @NameInMap("PageSize")
    @Validation(maximum = 50, minimum = 1)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RoomId")
    @Validation(required = true)
    private String roomId;

    private ListRoomUsersRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.roomId = builder.roomId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoomUsersRequest create() {
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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

    public static final class Builder extends Request.Builder<ListRoomUsersRequest, Builder> {
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String roomId; 

        private Builder() {
            super();
        } 

        private Builder(ListRoomUsersRequest request) {
            super(request);
            this.appId = request.appId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
            this.roomId = request.roomId;
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
         * 查询页码，从1开始，传空默认查询第1页。
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页显示个数，最大支持50，参数为空默认显示个数为10。
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
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

        @Override
        public ListRoomUsersRequest build() {
            return new ListRoomUsersRequest(this);
        } 

    } 

}
