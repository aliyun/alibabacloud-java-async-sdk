// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceStatsRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceStatsRequest</p>
 */
public class GetDeviceStatsRequest extends Request {
    @Body
    @NameInMap("CorpIdList")
    private String corpIdList;

    @Body
    @NameInMap("DeviceStatus")
    private String deviceStatus;

    @Body
    @NameInMap("DeviceType")
    private String deviceType;

    private GetDeviceStatsRequest(Builder builder) {
        super(builder);
        this.corpIdList = builder.corpIdList;
        this.deviceStatus = builder.deviceStatus;
        this.deviceType = builder.deviceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceStatsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdList
     */
    public String getCorpIdList() {
        return this.corpIdList;
    }

    /**
     * @return deviceStatus
     */
    public String getDeviceStatus() {
        return this.deviceStatus;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    public static final class Builder extends Request.Builder<GetDeviceStatsRequest, Builder> {
        private String corpIdList; 
        private String deviceStatus; 
        private String deviceType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceStatsRequest response) {
            super(response);
            this.corpIdList = response.corpIdList;
            this.deviceStatus = response.deviceStatus;
            this.deviceType = response.deviceType;
        } 

        /**
         * CorpIdList.
         */
        public Builder corpIdList(String corpIdList) {
            this.putBodyParameter("CorpIdList", corpIdList);
            this.corpIdList = corpIdList;
            return this;
        }

        /**
         * DeviceStatus.
         */
        public Builder deviceStatus(String deviceStatus) {
            this.putBodyParameter("DeviceStatus", deviceStatus);
            this.deviceStatus = deviceStatus;
            return this;
        }

        /**
         * DeviceType.
         */
        public Builder deviceType(String deviceType) {
            this.putBodyParameter("DeviceType", deviceType);
            this.deviceType = deviceType;
            return this;
        }

        @Override
        public GetDeviceStatsRequest build() {
            return new GetDeviceStatsRequest(this);
        } 

    } 

}
