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
 * {@link DeleteDevicePropRequest} extends {@link RequestModel}
 *
 * <p>DeleteDevicePropRequest</p>
 */
public class DeleteDevicePropRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String propKey;

    private DeleteDevicePropRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.propKey = builder.propKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDevicePropRequest create() {
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return propKey
     */
    public String getPropKey() {
        return this.propKey;
    }

    public static final class Builder extends Request.Builder<DeleteDevicePropRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String propKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDevicePropRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.propKey = request.propKey;
        } 

        /**
         * <p>The name of the device.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>ProductKey</strong> parameter.</p>
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
         * <p>The ID of the device.</p>
         * <blockquote>
         * <p> If you specify this parameter, you do not need to specify <strong>ProductKey</strong> or <strong>DeviceName</strong>. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) of the device, which corresponds to a combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>. If you specify both <strong>IotId</strong> and the combination of <strong>ProductKey</strong> and <strong>DeviceName</strong>, <strong>IotId</strong> takes precedence.</p>
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
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <blockquote>
         * <p> If you specify this parameter, you must also specify the <strong>DeviceName</strong> parameter.</p>
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
         * <p>The key of the tag.</p>
         * <blockquote>
         * <p> IoT Platform searches for the specified tag key and then deletes the tag. If no result is found, no operation is performed.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>room</p>
         */
        public Builder propKey(String propKey) {
            this.putQueryParameter("PropKey", propKey);
            this.propKey = propKey;
            return this;
        }

        @Override
        public DeleteDevicePropRequest build() {
            return new DeleteDevicePropRequest(this);
        } 

    } 

}
