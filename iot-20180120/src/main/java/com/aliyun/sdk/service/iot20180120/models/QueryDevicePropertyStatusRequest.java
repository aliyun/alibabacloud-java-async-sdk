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
 * {@link QueryDevicePropertyStatusRequest} extends {@link RequestModel}
 *
 * <p>QueryDevicePropertyStatusRequest</p>
 */
public class QueryDevicePropertyStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private QueryDevicePropertyStatusRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.functionBlockId = builder.functionBlockId;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDevicePropertyStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * @return functionBlockId
     */
    public String getFunctionBlockId() {
        return this.functionBlockId;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryDevicePropertyStatusRequest, Builder> {
        private String deviceName; 
        private String functionBlockId; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryDevicePropertyStatusRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.functionBlockId = request.functionBlockId;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The DeviceName of the device.</p>
         * <blockquote>
         * <p>If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
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
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
         * <p>If you do not specify this parameter, the system queries the data of the default module.</p>
         * 
         * <strong>example:</strong>
         * <p>BatteryModule</p>
         */
        public Builder functionBlockId(String functionBlockId) {
            this.putQueryParameter("FunctionBlockId", functionBlockId);
            this.functionBlockId = functionBlockId;
            return this;
        }

        /**
         * <p>The ID of the device or digital twin node whose property data you want to query.</p>
         * <ul>
         * <li>You can call the <a href="https://help.aliyun.com/document_detail/257184.html">QueryDeviceInfo</a> operation to query the <strong>ID</strong> of the device.</li>
         * <li>Log on to the IoT Platform console. On the <strong>Twin Details</strong> page, click the digital twin node to view its <strong>ID</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or instance ID appears in the console, you do not need to configure this parameter.</li>
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
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <blockquote>
         * <p>If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
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

        @Override
        public QueryDevicePropertyStatusRequest build() {
            return new QueryDevicePropertyStatusRequest(this);
        } 

    } 

}
