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
 * {@link QueryDevicePropertiesDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePropertiesDataRequest</p>
 */
public class QueryDevicePropertiesDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Asc")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer asc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> identifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long startTime;

    private QueryDevicePropertiesDataRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.identifier = builder.identifier;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePropertiesDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return asc
     */
    public Integer getAsc() {
        return this.asc;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return identifier
     */
    public java.util.List<String> getIdentifier() {
        return this.identifier;
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

    public static final class Builder extends Request.Builder<QueryDevicePropertiesDataRequest, Builder> {
        private Integer asc; 
        private String deviceName; 
        private Long endTime; 
        private java.util.List<String> identifier; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePropertiesDataRequest request) {
            super(request);
            this.asc = request.asc;
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.identifier = request.identifier;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The sorting order of the returned property records. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: in reverse chronological order. In this case, the time that is specified by the <strong>StartTime</strong> parameter must be later than the time that is specified by the <strong>EndTime</strong> parameter.</li>
         * <li><strong>1</strong>: in chronological order. In this case, the time that is specified by the <strong>StartTime</strong> parameter must be earlier than the time that is specified by the <strong>EndTime</strong> parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder asc(Integer asc) {
            this.putQueryParameter("Asc", asc);
            this.asc = asc;
            return this;
        }

        /**
         * <p>The DeviceName of the device.</p>
         * 
         * <strong>example:</strong>
         * <p>airconditioning</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value is a 13-digit timestamp in milliseconds, for example 1579249499000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1579249499000</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>temperature</p>
         */
        public Builder identifier(java.util.List<String> identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the device. The device ID is issued by IoT Platform.</p>
         * <blockquote>
         * <p> The <strong>IotId</strong> parameter is a globally unique identifier (GUID), and corresponds to a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong> parameter and a combination of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters at the same time, the <strong>IotId</strong> parameter is used.</p>
         * </blockquote>
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
         * <p>The ID of the instance. You can view the instance <strong>ID</strong> on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must configure this parameter. If you do not set this parameter, the call fails.</li>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to set this parameter.</li>
         * </ul>
         * </blockquote>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot_instc_pu****_c*-v64********</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The maximum number of records that is returned for each property. Maximum value: 100.</p>
         * <p>The number of records that are returned for an arbitrary property cannot exceed the limit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the device belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>a1BwAGV****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The start of the time range to query. The value is a 13-digit timestamp in milliseconds, for example, 1579249499000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1579249499000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryDevicePropertiesDataRequest build() {
            return new QueryDevicePropertiesDataRequest(this);
        } 

    } 

}
