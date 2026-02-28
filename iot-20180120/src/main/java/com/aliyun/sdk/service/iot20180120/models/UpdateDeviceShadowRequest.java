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
 * {@link UpdateDeviceShadowRequest} extends {@link RequestModel}
 *
 * <p>UpdateDeviceShadowRequest</p>
 */
public class UpdateDeviceShadowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeltaUpdate")
    private Boolean deltaUpdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ShadowMessage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String shadowMessage;

    private UpdateDeviceShadowRequest(Builder builder) {
        super(builder);
        this.deltaUpdate = builder.deltaUpdate;
        this.deviceName = builder.deviceName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.shadowMessage = builder.shadowMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDeviceShadowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deltaUpdate
     */
    public Boolean getDeltaUpdate() {
        return this.deltaUpdate;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return shadowMessage
     */
    public String getShadowMessage() {
        return this.shadowMessage;
    }

    public static final class Builder extends Request.Builder<UpdateDeviceShadowRequest, Builder> {
        private Boolean deltaUpdate; 
        private String deviceName; 
        private String iotInstanceId; 
        private String productKey; 
        private String shadowMessage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDeviceShadowRequest request) {
            super(request);
            this.deltaUpdate = request.deltaUpdate;
            this.deviceName = request.deviceName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.shadowMessage = request.shadowMessage;
        } 

        /**
         * <p>Specifies whether to perform an incremental update on the <strong>desired</strong> parameter. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs an incremental update.</li>
         * <li><strong>false</strong>: performs a full update. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deltaUpdate(Boolean deltaUpdate) {
            this.putQueryParameter("DeltaUpdate", deltaUpdate);
            this.deltaUpdate = deltaUpdate;
            return this;
        }

        /**
         * <p>The name of the device whose shadow information you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>device1</p>
         */
        public Builder deviceName(String deviceName) {
            this.putQueryParameter("DeviceName", deviceName);
            this.deviceName = deviceName;
            return this;
        }

        /**
         * <p>The ID of the elastic container instance. You can view the ID of the instance on the <strong>Overview</strong> page in the IoT Platform console.****</p>
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
         * <p>The ProductKey of the product to which the device belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1T27vz****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * <p>The information that you want to specify for the device shadow.</p>
         * <p>The information includes the following parameters:</p>
         * <ul>
         * <li><p><strong>method</strong>: the type of the operation. Data type: string. Set the value to <strong>update</strong>.</p>
         * </li>
         * <li><p><strong>state</strong>: the status of the device shadow. Data type: string. The <strong>desired</strong> parameter specifies the expected shadow status.</p>
         * </li>
         * <li><p><strong>version</strong>: the version of the device shadow. Data type: long.</p>
         * <ul>
         * <li>If versioning is not required, set this parameter to 0.</li>
         * <li>If versioning is required, specify a version that is later than the current version.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>**</p>
         * <p><strong>Important</strong> If versioning is required, do not query the version of a device shadow in the IoT Platform console. If a large number of update and query operations are concurrently performed, multiple update operations may return the same version. In this case, the most recent update operation may first be completed. As a result, the current shadow information is not the latest shadow information. We recommend that you maintain the versions of device shadows on the on-premises device. When you call this operation, use an on-premises application to obtain the latest version of the device shadow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;method&quot;:&quot;update&quot;,&quot;state&quot;:{&quot;desired&quot;:{&quot;color&quot;:&quot;green&quot;}},&quot;version&quot;:2}</p>
         */
        public Builder shadowMessage(String shadowMessage) {
            this.putQueryParameter("ShadowMessage", shadowMessage);
            this.shadowMessage = shadowMessage;
            return this;
        }

        @Override
        public UpdateDeviceShadowRequest build() {
            return new UpdateDeviceShadowRequest(this);
        } 

    } 

}
