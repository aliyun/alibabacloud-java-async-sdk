// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

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
 * {@link QueryMonthRecordRequest} extends {@link RequestModel}
 *
 * <p>QueryMonthRecordRequest</p>
 */
public class QueryMonthRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotId")
    private String iotId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Month")
    @com.aliyun.core.annotation.Validation(required = true)
    private String month;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    private QueryMonthRecordRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.month = builder.month;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMonthRecordRequest create() {
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
     * @return month
     */
    public String getMonth() {
        return this.month;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<QueryMonthRecordRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String month; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(QueryMonthRecordRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.month = request.month;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The DeviceName of the IP camera. You can view the <strong>DeviceName</strong> on the <strong>Devices</strong> page in the IoT Platform console.&gt;Notice:  If you specify this parameter, you must also specify <strong>ProductKey</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>camera1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The IotId of the IP camera. The IotId is the unique identifier issued by IoT Platform for the device. You can call the <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation of IoT Platform to query the IotId.&gt;Notice:  If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> is the unique identifier of the device and corresponds to the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>&lt;props=&quot;china&quot;&gt;You can view the <strong>ID</strong> of the current instance on the <strong>Instance Overview</strong> page in the IoT Platform console. If the instance has an ID, you must specify the ID. Otherwise, the call fails.</p>
         * <p>&lt;props=&quot;china&quot;&gt;</p>
         * <blockquote>
         * <p>If the public instance does not have an ID, see <a href="https://help.aliyun.com/document_detail/267533.html">How to obtain an instance ID</a>.</p>
         * </blockquote>
         * <p>&lt;props=&quot;intl&quot;&gt;You do not need to specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>iot-cn-n6w1y****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The month to query, in the YYYYMM format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>201901</p>
         */
        public Builder month(String month) {
            this.putQueryParameter("Month", month);
            this.month = month;
            return this;
        }

        /**
         * <p>The ProductKey of the product to which the IP camera belongs. You can view the ProductKey on the <strong>Products</strong> page in the IoT Platform console or call the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation to query all products under the current account.&gt;Notice:  If you specify this parameter, you must also specify <strong>DeviceName</strong>.</p>
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
        public QueryMonthRecordRequest build() {
            return new QueryMonthRecordRequest(this);
        } 

    } 

}
