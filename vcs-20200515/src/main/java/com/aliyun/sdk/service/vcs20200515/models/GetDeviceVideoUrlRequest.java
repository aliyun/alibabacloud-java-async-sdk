// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDeviceVideoUrlRequest} extends {@link RequestModel}
 *
 * <p>GetDeviceVideoUrlRequest</p>
 */
public class GetDeviceVideoUrlRequest extends Request {
    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("EndTime")
    private Long endTime;

    @Body
    @NameInMap("GbId")
    private String gbId;

    @Body
    @NameInMap("OutProtocol")
    private String outProtocol;

    @Body
    @NameInMap("StartTime")
    private Long startTime;

    @Body
    @NameInMap("StorageType")
    private String storageType;

    private GetDeviceVideoUrlRequest(Builder builder) {
        super(builder);
        this.corpId = builder.corpId;
        this.deviceId = builder.deviceId;
        this.endTime = builder.endTime;
        this.gbId = builder.gbId;
        this.outProtocol = builder.outProtocol;
        this.startTime = builder.startTime;
        this.storageType = builder.storageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDeviceVideoUrlRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return gbId
     */
    public String getGbId() {
        return this.gbId;
    }

    /**
     * @return outProtocol
     */
    public String getOutProtocol() {
        return this.outProtocol;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return storageType
     */
    public String getStorageType() {
        return this.storageType;
    }

    public static final class Builder extends Request.Builder<GetDeviceVideoUrlRequest, Builder> {
        private String corpId; 
        private String deviceId; 
        private Long endTime; 
        private String gbId; 
        private String outProtocol; 
        private Long startTime; 
        private String storageType; 

        private Builder() {
            super();
        } 

        private Builder(GetDeviceVideoUrlRequest response) {
            super(response);
            this.corpId = response.corpId;
            this.deviceId = response.deviceId;
            this.endTime = response.endTime;
            this.gbId = response.gbId;
            this.outProtocol = response.outProtocol;
            this.startTime = response.startTime;
            this.storageType = response.storageType;
        } 

        /**
         * CorpId.
         */
        public Builder corpId(String corpId) {
            this.putBodyParameter("CorpId", corpId);
            this.corpId = corpId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putBodyParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * GbId.
         */
        public Builder gbId(String gbId) {
            this.putBodyParameter("GbId", gbId);
            this.gbId = gbId;
            return this;
        }

        /**
         * OutProtocol.
         */
        public Builder outProtocol(String outProtocol) {
            this.putBodyParameter("OutProtocol", outProtocol);
            this.outProtocol = outProtocol;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * StorageType.
         */
        public Builder storageType(String storageType) {
            this.putBodyParameter("StorageType", storageType);
            this.storageType = storageType;
            return this;
        }

        @Override
        public GetDeviceVideoUrlRequest build() {
            return new GetDeviceVideoUrlRequest(this);
        } 

    } 

}
