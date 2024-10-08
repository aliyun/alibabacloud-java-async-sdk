// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDevicesRequest} extends {@link RequestModel}
 *
 * <p>ListDevicesRequest</p>
 */
public class ListDevicesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Alias")
    private String alias;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BuildId")
    private String buildId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientType")
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceGroupId")
    private String deviceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceIpV4")
    private String deviceIpV4;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceOS")
    private String deviceOS;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DevicePlatform")
    private String devicePlatform;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelContent")
    private String labelContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LabelId")
    private String labelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LocationInfo")
    private String locationInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNo")
    private String serialNo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserType")
    private String userType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private ListDevicesRequest(Builder builder) {
        super(builder);
        this.alias = builder.alias;
        this.buildId = builder.buildId;
        this.clientType = builder.clientType;
        this.deviceGroupId = builder.deviceGroupId;
        this.deviceIpV4 = builder.deviceIpV4;
        this.deviceName = builder.deviceName;
        this.deviceOS = builder.deviceOS;
        this.devicePlatform = builder.devicePlatform;
        this.endUserId = builder.endUserId;
        this.labelContent = builder.labelContent;
        this.labelId = builder.labelId;
        this.locationInfo = builder.locationInfo;
        this.model = builder.model;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.serialNo = builder.serialNo;
        this.userType = builder.userType;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alias
     */
    public String getAlias() {
        return this.alias;
    }

    /**
     * @return buildId
     */
    public String getBuildId() {
        return this.buildId;
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return deviceGroupId
     */
    public String getDeviceGroupId() {
        return this.deviceGroupId;
    }

    /**
     * @return deviceIpV4
     */
    public String getDeviceIpV4() {
        return this.deviceIpV4;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return deviceOS
     */
    public String getDeviceOS() {
        return this.deviceOS;
    }

    /**
     * @return devicePlatform
     */
    public String getDevicePlatform() {
        return this.devicePlatform;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return labelContent
     */
    public String getLabelContent() {
        return this.labelContent;
    }

    /**
     * @return labelId
     */
    public String getLabelId() {
        return this.labelId;
    }

    /**
     * @return locationInfo
     */
    public String getLocationInfo() {
        return this.locationInfo;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
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
     * @return serialNo
     */
    public String getSerialNo() {
        return this.serialNo;
    }

    /**
     * @return userType
     */
    public String getUserType() {
        return this.userType;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder extends Request.Builder<ListDevicesRequest, Builder> {
        private String alias; 
        private String buildId; 
        private Integer clientType; 
        private String deviceGroupId; 
        private String deviceIpV4; 
        private String deviceName; 
        private String deviceOS; 
        private String devicePlatform; 
        private String endUserId; 
        private String labelContent; 
        private String labelId; 
        private String locationInfo; 
        private String model; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String serialNo; 
        private String userType; 
        private String uuid; 

        private Builder() {
            super();
        } 

        private Builder(ListDevicesRequest request) {
            super(request);
            this.alias = request.alias;
            this.buildId = request.buildId;
            this.clientType = request.clientType;
            this.deviceGroupId = request.deviceGroupId;
            this.deviceIpV4 = request.deviceIpV4;
            this.deviceName = request.deviceName;
            this.deviceOS = request.deviceOS;
            this.devicePlatform = request.devicePlatform;
            this.endUserId = request.endUserId;
            this.labelContent = request.labelContent;
            this.labelId = request.labelId;
            this.locationInfo = request.locationInfo;
            this.model = request.model;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.serialNo = request.serialNo;
            this.userType = request.userType;
            this.uuid = request.uuid;
        } 

        /**
         * Alias.
         */
        public Builder alias(String alias) {
            this.putBodyParameter("Alias", alias);
            this.alias = alias;
            return this;
        }

        /**
         * BuildId.
         */
        public Builder buildId(String buildId) {
            this.putBodyParameter("BuildId", buildId);
            this.buildId = buildId;
            return this;
        }

        /**
         * ClientType.
         */
        public Builder clientType(Integer clientType) {
            this.putQueryParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * DeviceGroupId.
         */
        public Builder deviceGroupId(String deviceGroupId) {
            this.putBodyParameter("DeviceGroupId", deviceGroupId);
            this.deviceGroupId = deviceGroupId;
            return this;
        }

        /**
         * DeviceIpV4.
         */
        public Builder deviceIpV4(String deviceIpV4) {
            this.putQueryParameter("DeviceIpV4", deviceIpV4);
            this.deviceIpV4 = deviceIpV4;
            return this;
        }

        /**
         * DeviceName.
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * DeviceOS.
         */
        public Builder deviceOS(String deviceOS) {
            this.putQueryParameter("DeviceOS", deviceOS);
            this.deviceOS = deviceOS;
            return this;
        }

        /**
         * DevicePlatform.
         */
        public Builder devicePlatform(String devicePlatform) {
            this.putQueryParameter("DevicePlatform", devicePlatform);
            this.devicePlatform = devicePlatform;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putBodyParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * LabelContent.
         */
        public Builder labelContent(String labelContent) {
            this.putBodyParameter("LabelContent", labelContent);
            this.labelContent = labelContent;
            return this;
        }

        /**
         * LabelId.
         */
        public Builder labelId(String labelId) {
            this.putBodyParameter("LabelId", labelId);
            this.labelId = labelId;
            return this;
        }

        /**
         * LocationInfo.
         */
        public Builder locationInfo(String locationInfo) {
            this.putQueryParameter("LocationInfo", locationInfo);
            this.locationInfo = locationInfo;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * SerialNo.
         */
        public Builder serialNo(String serialNo) {
            this.putBodyParameter("SerialNo", serialNo);
            this.serialNo = serialNo;
            return this;
        }

        /**
         * UserType.
         */
        public Builder userType(String userType) {
            this.putQueryParameter("UserType", userType);
            this.userType = userType;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.putBodyParameter("Uuid", uuid);
            this.uuid = uuid;
            return this;
        }

        @Override
        public ListDevicesRequest build() {
            return new ListDevicesRequest(this);
        } 

    } 

}
