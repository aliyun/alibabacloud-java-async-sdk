// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNewDeviceRequest} extends {@link RequestModel}
 *
 * <p>CreateNewDeviceRequest</p>
 */
public class CreateNewDeviceRequest extends Request {
    @Body
    @NameInMap("CityCode")
    private String cityCode;

    @Body
    @NameInMap("CorpId")
    @Validation(required = true)
    private String corpId;

    @Body
    @NameInMap("DataSourceType")
    @Validation(required = true)
    private String dataSourceType;

    @Body
    @NameInMap("DeviceAddress")
    @Validation(required = true)
    private String deviceAddress;

    @Body
    @NameInMap("DeviceId")
    private String deviceId;

    @Body
    @NameInMap("DeviceModel")
    private String deviceModel;

    @Body
    @NameInMap("DeviceName")
    @Validation(required = true)
    private String deviceName;

    @Body
    @NameInMap("DeviceType")
    @Validation(required = true)
    private String deviceType;

    @Body
    @NameInMap("FilePath")
    private String filePath;

    @Body
    @NameInMap("InProtocol")
    @Validation(required = true)
    private String inProtocol;

    @Body
    @NameInMap("Latitude")
    private String latitude;

    @Body
    @NameInMap("Longitude")
    private String longitude;

    @Body
    @NameInMap("SubDeviceCount")
    private Long subDeviceCount;

    @Body
    @NameInMap("Vendor")
    @Validation(required = true)
    private String vendor;

    private CreateNewDeviceRequest(Builder builder) {
        super(builder);
        this.cityCode = builder.cityCode;
        this.corpId = builder.corpId;
        this.dataSourceType = builder.dataSourceType;
        this.deviceAddress = builder.deviceAddress;
        this.deviceId = builder.deviceId;
        this.deviceModel = builder.deviceModel;
        this.deviceName = builder.deviceName;
        this.deviceType = builder.deviceType;
        this.filePath = builder.filePath;
        this.inProtocol = builder.inProtocol;
        this.latitude = builder.latitude;
        this.longitude = builder.longitude;
        this.subDeviceCount = builder.subDeviceCount;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNewDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cityCode
     */
    public String getCityCode() {
        return this.cityCode;
    }

    /**
     * @return corpId
     */
    public String getCorpId() {
        return this.corpId;
    }

    /**
     * @return dataSourceType
     */
    public String getDataSourceType() {
        return this.dataSourceType;
    }

    /**
     * @return deviceAddress
     */
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return deviceModel
     */
    public String getDeviceModel() {
        return this.deviceModel;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceType
     */
    public String getDeviceType() {
        return this.deviceType;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return inProtocol
     */
    public String getInProtocol() {
        return this.inProtocol;
    }

    /**
     * @return latitude
     */
    public String getLatitude() {
        return this.latitude;
    }

    /**
     * @return longitude
     */
    public String getLongitude() {
        return this.longitude;
    }

    /**
     * @return subDeviceCount
     */
    public Long getSubDeviceCount() {
        return this.subDeviceCount;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateNewDeviceRequest, Builder> {
        private String cityCode; 
        private String corpId; 
        private String dataSourceType; 
        private String deviceAddress; 
        private String deviceId; 
        private String deviceModel; 
        private String deviceName; 
        private String deviceType; 
        private String filePath; 
        private String inProtocol; 
        private String latitude; 
        private String longitude; 
        private Long subDeviceCount; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateNewDeviceRequest response) {
            super(response);
            this.cityCode = response.cityCode;
            this.corpId = response.corpId;
            this.dataSourceType = response.dataSourceType;
            this.deviceAddress = response.deviceAddress;
            this.deviceId = response.deviceId;
            this.deviceModel = response.deviceModel;
            this.deviceName = response.deviceName;
            this.deviceType = response.deviceType;
            this.filePath = response.filePath;
            this.inProtocol = response.inProtocol;
            this.latitude = response.latitude;
            this.longitude = response.longitude;
            this.subDeviceCount = response.subDeviceCount;
            this.vendor = response.vendor;
        } 

        /**
         * CityCode.
         */
        public Builder cityCode(String cityCode) {
            this.putBodyParameter("CityCode", cityCode);
            this.cityCode = cityCode;
            return this;
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
         * DataSourceType.
         */
        public Builder dataSourceType(String dataSourceType) {
            this.putBodyParameter("DataSourceType", dataSourceType);
            this.dataSourceType = dataSourceType;
            return this;
        }

        /**
         * DeviceAddress.
         */
        public Builder deviceAddress(String deviceAddress) {
            this.putBodyParameter("DeviceAddress", deviceAddress);
            this.deviceAddress = deviceAddress;
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
         * DeviceModel.
         */
        public Builder deviceModel(String deviceModel) {
            this.putBodyParameter("DeviceModel", deviceModel);
            this.deviceModel = deviceModel;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
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

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * InProtocol.
         */
        public Builder inProtocol(String inProtocol) {
            this.putBodyParameter("InProtocol", inProtocol);
            this.inProtocol = inProtocol;
            return this;
        }

        /**
         * Latitude.
         */
        public Builder latitude(String latitude) {
            this.putBodyParameter("Latitude", latitude);
            this.latitude = latitude;
            return this;
        }

        /**
         * Longitude.
         */
        public Builder longitude(String longitude) {
            this.putBodyParameter("Longitude", longitude);
            this.longitude = longitude;
            return this;
        }

        /**
         * SubDeviceCount.
         */
        public Builder subDeviceCount(Long subDeviceCount) {
            this.putBodyParameter("SubDeviceCount", subDeviceCount);
            this.subDeviceCount = subDeviceCount;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.putBodyParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateNewDeviceRequest build() {
            return new CreateNewDeviceRequest(this);
        } 

    } 

}
