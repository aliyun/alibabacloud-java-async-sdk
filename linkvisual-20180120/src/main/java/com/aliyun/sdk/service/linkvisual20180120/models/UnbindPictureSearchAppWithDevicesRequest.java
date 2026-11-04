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
 * {@link UnbindPictureSearchAppWithDevicesRequest} extends {@link RequestModel}
 *
 * <p>UnbindPictureSearchAppWithDevicesRequest</p>
 */
public class UnbindPictureSearchAppWithDevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceIotIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> deviceIotIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    private UnbindPictureSearchAppWithDevicesRequest(Builder builder) {
        super(builder);
        this.appInstanceId = builder.appInstanceId;
        this.deviceIotIds = builder.deviceIotIds;
        this.iotInstanceId = builder.iotInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindPictureSearchAppWithDevicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return this.appInstanceId;
    }

    /**
     * @return deviceIotIds
     */
    public java.util.List<String> getDeviceIotIds() {
        return this.deviceIotIds;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public static final class Builder extends Request.Builder<UnbindPictureSearchAppWithDevicesRequest, Builder> {
        private String appInstanceId; 
        private java.util.List<String> deviceIotIds; 
        private String iotInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindPictureSearchAppWithDevicesRequest request) {
            super(request);
            this.appInstanceId = request.appInstanceId;
            this.deviceIotIds = request.deviceIotIds;
            this.iotInstanceId = request.iotInstanceId;
        } 

        /**
         * <p>Instance ID of the image search application instance. You can call the <a href="https://help.aliyun.com/document_detail/206608.html">QueryPictureSearchApps</a> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5a502d3fbab8410e8fd4be9037c7****</p>
         */
        public Builder appInstanceId(String appInstanceId) {
            this.putQueryParameter("AppInstanceId", appInstanceId);
            this.appInstanceId = appInstanceId;
            return this;
        }

        /**
         * <p>The list of device IoT IDs. You can specify the IoT IDs of V-series edge all-in-one machines or cameras.</p>
         * <p>An IoT ID is the unique identifier issued by IoT Platform for a device. You can call the IoT Platform <a href="https://help.aliyun.com/document_detail/69594.html">QueryDeviceDetail</a> operation to query the IoT ID.</p>
         * <p>You can specify up to 20 device IoT IDs in a single call.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VrJwPGjC1sJlqPjZA3cxg4****</p>
         */
        public Builder deviceIotIds(java.util.List<String> deviceIotIds) {
            this.putQueryParameter("DeviceIotIds", deviceIotIds);
            this.deviceIotIds = deviceIotIds;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <ul>
         * <li>Enterprise Enterprise instance: You must specify this parameter. You can view the ID of your Enterprise Enterprise instance on the <strong>Instance Overview</strong> page in the IoT Platform console.</li>
         * <li>Public instance: You do not need to specify this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>iot-060a****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        @Override
        public UnbindPictureSearchAppWithDevicesRequest build() {
            return new UnbindPictureSearchAppWithDevicesRequest(this);
        } 

    } 

}
