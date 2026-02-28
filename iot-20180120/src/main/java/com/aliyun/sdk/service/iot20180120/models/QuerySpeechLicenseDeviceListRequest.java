// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QuerySpeechLicenseDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QuerySpeechLicenseDeviceListRequest</p>
 */
public class QuerySpeechLicenseDeviceListRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckGroupId")
    private String checkGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LicenseStatusList")
    private java.util.List<String> licenseStatusList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    private Integer pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductKey")
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
    public java.util.List<String> getLicenseStatusList() {
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
        private java.util.List<String> licenseStatusList; 
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
         * <p>The ID of a device group. The InSpecifiedGroup response parameter indicates whether the devices belong to the specified group.</p>
         * 
         * <strong>example:</strong>
         * <p>4de2c367**<strong>8c585e5992</strong></p>
         */
        public Builder checkGroupId(String checkGroupId) {
            this.putBodyParameter("CheckGroupId", checkGroupId);
            this.checkGroupId = checkGroupId;
            return this;
        }

        /**
         * <p>The keyword in the DeviceName of the device whose information you want to query. Fuzzy match is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder deviceName(String deviceName) {
            this.putBodyParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The instance ID. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <p> You must specify this parameter for a public instance of the new version or an Enterprise Edition instance. You do not need to specify this parameter for a public instance of the previous version.</p>
         * </blockquote>
         * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a> topic of IoT instances.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-e3***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The license status.</p>
         * <ul>
         * <li><strong>NORMAL</strong>: The license is valid.</li>
         * <li><strong>EXPIRE</strong>: The license is expired.</li>
         * <li><strong>EXPIRING</strong>: The license is about to expire.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder licenseStatusList(java.util.List<String> licenseStatusList) {
            this.putBodyParameter("LicenseStatusList", licenseStatusList);
            this.licenseStatusList = licenseStatusList;
            return this;
        }

        /**
         * <p>The page number. Valid values: 1 to 10000.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageId(Integer pageId) {
            this.putQueryParameter("PageId", pageId);
            this.pageId = pageId;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 50. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
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
