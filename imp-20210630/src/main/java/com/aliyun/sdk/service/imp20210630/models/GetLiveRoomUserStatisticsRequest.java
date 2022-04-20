// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveRoomUserStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetLiveRoomUserStatisticsRequest</p>
 */
public class GetLiveRoomUserStatisticsRequest extends Request {
    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("LiveId")
    @Validation(required = true)
    private String liveId;

    @Body
    @NameInMap("PageNumber")
    private String pageNumber;

    @Body
    @NameInMap("PageSize")
    private String pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetLiveRoomUserStatisticsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.liveId = builder.liveId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRoomUserStatisticsRequest create() {
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
     * @return liveId
     */
    public String getLiveId() {
        return this.liveId;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetLiveRoomUserStatisticsRequest, Builder> {
        private String appId; 
        private String liveId; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetLiveRoomUserStatisticsRequest request) {
            super(request);
            this.appId = request.appId;
            this.liveId = request.liveId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
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
         * 直播ID。
         */
        public Builder liveId(String liveId) {
            this.putBodyParameter("LiveId", liveId);
            this.liveId = liveId;
            return this;
        }

        /**
         * 查询页码，从1开始，传空默认查询第1页。
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页显示个数，最大支持50，参数为空默认显示个数为10。
         */
        public Builder pageSize(String pageSize) {
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

        @Override
        public GetLiveRoomUserStatisticsRequest build() {
            return new GetLiveRoomUserStatisticsRequest(this);
        } 

    } 

}
