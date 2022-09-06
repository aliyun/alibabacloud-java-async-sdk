// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySpeechLicenseDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechLicenseDeviceListRequest</p>
 */
public class QuerySpeechLicenseDeviceListRequest extends Request {
    @Body
    @NameInMap("CheckGroupId")
    private String checkGroupId;

    @Body
    @NameInMap("DeviceName")
    private String deviceName;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("LicenseStatusList")
    private java.util.List < String > licenseStatusList;

    @Query
    @NameInMap("PageId")
    private Integer pageId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Body
    @NameInMap("ProductKey")
    private String productKey;

    private QuerySpeechLicenseDeviceListRequest(Builder builder) {
        super(builder);
        this.checkGroupId = builder.checkGroupId;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseStatusList = builder.licenseStatusList;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySpeechLicenseDeviceListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkGroupId
     */
    public String getCheckGroupId() {
        return this.checkGroupId;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return licenseStatusList
     */
    public java.util.List < String > getLicenseStatusList() {
        return this.licenseStatusList;
    }

    /**
     * @return pageId
     */
    public Integer getPageId() {
        return this.pageId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QuerySpeechLicenseDeviceListRequest, Builder> {
        private String checkGroupId; 
        private String deviceName; 
        private String iotInstanceId; 
        private java.util.List < String > licenseStatusList; 
        private Integer pageId; 
        private Integer pageSize; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QuerySpeechLicenseDeviceListRequest request) {
            super(request);
            this.checkGroupId = request.checkGroupId;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.licenseStatusList = request.licenseStatusList;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
        } 

        /**
         * CheckGroupId.
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putBodyParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * LicenseStatusList.
         */
        public Builder licenseStatusList(java.util.List < String > licenseStatusList) {
            this.putBodyParameter("LicenseStatusList", licenseStatusList);
            this.licenseStatusList = licenseStatusList;
            return this;
        }

        /**
         * PageId.
         */
        public Builder pageId(Integer pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putBodyParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public QuerySpeechLicenseDeviceListRequest build() {
            return new QuerySpeechLicenseDeviceListRequest(this);
        } 

    } 

}
