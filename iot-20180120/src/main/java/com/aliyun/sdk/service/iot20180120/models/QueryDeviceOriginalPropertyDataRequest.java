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
 * {@link QueryDeviceOriginalPropertyDataRequest} extends {@link RequestModel}
 *
 * <p>QueryDeviceOriginalPropertyDataRequest</p>
 */
public class QueryDeviceOriginalPropertyDataRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

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

    private QueryDeviceOriginalPropertyDataRequest(Builder builder) {
        super(builder);
        this.asc = builder.asc;
        this.deviceName = builder.deviceName;
        this.endTime = builder.endTime;
        this.identifier = builder.identifier;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.productKey = builder.productKey;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceOriginalPropertyDataRequest create() {
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
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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

    public static final class Builder extends Request.Builder<QueryDeviceOriginalPropertyDataRequest, Builder> {
        private Integer asc; 
        private String deviceName; 
        private Long endTime; 
        private String identifier; 
        private String iotId; 
        private String iotInstanceId; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String productKey; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryDeviceOriginalPropertyDataRequest request) {
            super(request);
            this.asc = request.asc;
            this.deviceName = request.deviceName;
            this.endTime = request.endTime;
            this.identifier = request.identifier;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.nextPageToken = request.nextPageToken;
            this.pageSize = request.pageSize;
            this.productKey = request.productKey;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The order in which you want to sort the returned property records. Valid values:</p>
         * <ul>
         * <li>0: descending.</li>
         * <li>1: ascending.</li>
         * </ul>
         * <blockquote>
         * <p> The <strong>start time</strong> must be earlier than the <strong>end time</strong>. The system sorts the returned records based on the specified order.</p>
         * </blockquote>
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
         * <blockquote>
         * <p>If you specify a value for this parameter, you must configure the <strong>ProductKey</strong> parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>light</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The end of the time range to query. The value must be a 13-digit timestamp.</p>
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
         * <p>The identifier of the property.</p>
         * <ul>
         * <li>If weak verification is used, you can perform the following steps to view the <strong>Identifier</strong> of a device property: Log on to the IoT Platform console and go to the Define Feature tab of the Product Details page. You can also call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the property identifier in the returned TSL data.</li>
         * <li>If no verification is used, the value must be the same as the custom <strong>identifier</strong> that is submitted by the device.</li>
         * </ul>
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
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p>The IotId parameter specifies a unique ID for the device. The value of the <strong>IotId</strong> parameter is equivalent to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName.N</strong> parameters. If you specify the IotId parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName.N</strong> parameter. If you specify values for the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName.N</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>The ID of the instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.****</li>
         * <li>If no <strong>Overview</strong> page or <strong>ID</strong> is generated for your instance, you do not need to configure this parameter.</li>
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
         * <p>The token that is used to retrieve the next page of the query results. If the next page exists, this parameter is returned. In this case, you must add the value of the parameter to the next request.</p>
         * 
         * <strong>example:</strong>
         * <p>Bo***x44Qx</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The maximum number of records that can be returned for each property. Maximum value: 100.</p>
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
         * <p>The ProductKey of the product to which the device belongs.****</p>
         * <blockquote>
         * <p>If you specify a value for this parameter, you must configure the <strong>DeviceName</strong> parameter.</p>
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
         * <p>The start of the time range to query. The value must be a 13-digit timestamp.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1569249488000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryDeviceOriginalPropertyDataRequest build() {
            return new QueryDeviceOriginalPropertyDataRequest(this);
        } 

    } 

}
