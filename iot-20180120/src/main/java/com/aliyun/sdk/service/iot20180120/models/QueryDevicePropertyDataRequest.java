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
 * {@link QueryDevicePropertyDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePropertyDataRequest</p>
 */
public class QueryDevicePropertyDataRequest extends Request {
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
    private String identifier;

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

    private QueryDevicePropertyDataRequest(Builder builder) {
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

    public static QueryDevicePropertyDataRequest create() {
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
    public String getIdentifier() {
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

    public static final class Builder extends Request.Builder<QueryDevicePropertyDataRequest, Builder> {
        private Integer asc; 
        private String deviceName; 
        private Long endTime; 
        private String identifier; 
        private String iotId; 
        private String iotInstanceId; 
        private Integer pageSize; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePropertyDataRequest request) {
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
         * <p>The order in which you want to sort the property records that are returned. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: reverse chronological order</li>
         * <li><strong>1</strong>: chronological order</li>
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
         * <p>The name of the device.</p>
         * <blockquote>
         * <p>If you specify a value for this parameter, you must also specify a value for the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
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
         * <p>The end of the time range to query. The value of the EndTime parameter must be greater than the value of the <strong>StartTime</strong> parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
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
         * <p>The identifier of the property that you want to query.</p>
         * <p>You can view the property <strong>identifier</strong> on the Define Feature tab of the Product Details page in the IoT Platform console. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the property identifier in the returned TSL data.</p>
         * <blockquote>
         * <p> If a property named temperature belongs to a custom module named testFb, set this parameter to <strong>testFb:temperature</strong>. The custom module is not the default module.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>temperature</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the device to which the property belongs.:</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/257184.html">QueryDeviceInfo</a> operation to query the <strong>ID</strong> of the device.</p>
         * <blockquote>
         * <p>If you specify a value for this parameter, you do not need to specify a value for the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for the <strong>IotId</strong> parameter and values for the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <li>If your instance has an ID, you must configure this parameter. If you do not configure this parameter, the call fails.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>If your instance has no <strong>Overview</strong> page or ID, you do not need to configure this parameter.</li>
         * </ul>
         * <p>For more information, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Valid values: 1 to 50.</p>
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
         * <blockquote>
         * <p>If you specify a value for this parameter, you must also specify a value for the <strong>DeviceName</strong> parameter.</p>
         * </blockquote>
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
         * <p>The start of the time range to query. The value of the StartTime parameter must be less than the value of the <strong>EndTime</strong> parameter. The value is a timestamp in milliseconds, for example, 1579249499000.</p>
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
        public QueryDevicePropertyDataRequest build() {
            return new QueryDevicePropertyDataRequest(this);
        } 

    } 

}
