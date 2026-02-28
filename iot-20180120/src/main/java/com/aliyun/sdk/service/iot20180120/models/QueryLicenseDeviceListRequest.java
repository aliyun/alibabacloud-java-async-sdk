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
 * {@link QueryLicenseDeviceListRequest} extends {@link RequestModel}
 *
 * <p>QueryLicenseDeviceListRequest</p>
 */
public class QueryLicenseDeviceListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LicenseCode")
    private String licenseCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageId")
    private Integer pageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private QueryLicenseDeviceListRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.licenseCode = builder.licenseCode;
        this.pageId = builder.pageId;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryLicenseDeviceListRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return licenseCode
     */
    public String getLicenseCode() {
        return this.licenseCode;
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

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryLicenseDeviceListRequest, Builder> {
        private Long endTime; 
        private String iotId; 
        private String iotInstanceId; 
        private String licenseCode; 
        private Integer pageId; 
        private Integer pageSize; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryLicenseDeviceListRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.licenseCode = request.licenseCode;
            this.pageId = request.pageId;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The end time of the time range in which the license is bound to the devices.The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1620934297000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the device.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/69905.html">QueryDevice</a> operation to query the <strong>IotId</strong> values of all devices that belong to a specific product.</p>
         * 
         * <strong>example:</strong>
         * <p>Q7uOhVRdZRRlDnTLv****00100</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
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
         * <p>iot-ws4***</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The license type that specifies the audio and video specifications. Valid values: <strong>480P</strong> and <strong>720P</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
         */
        public Builder licenseCode(String licenseCode) {
            this.putQueryParameter("LicenseCode", licenseCode);
            this.licenseCode = licenseCode;
            return this;
        }

        /**
         * <p>The page number.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the devices belong.</p>
         * <p>You can go to the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to view the information about all products of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>es****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The start time of the time range in which the license is bound to the devices. The timestamp follows the UNIX time format. It is the number of seconds that have elapsed since 00:00:00 Thursday, January 1, 1970.</p>
         * 
         * <strong>example:</strong>
         * <p>1620634297000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryLicenseDeviceListRequest build() {
            return new QueryLicenseDeviceListRequest(this);
        } 

    } 

}
