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
 * {@link SaveDevicePropRequest} extends {@link RequestModel}
 *
 * <p>SaveDevicePropRequest</p>
 */
public class SaveDevicePropRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Props")
    @com.aliyun.core.annotation.Validation(required = true)
    private String props;

    private SaveDevicePropRequest(Builder builder) {
        super(builder);
        this.deviceName = builder.deviceName;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.props = builder.props;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveDevicePropRequest create() {
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
     * @return props
     */
    public String getProps() {
        return this.props;
    }

    public static final class Builder extends Request.Builder<SaveDevicePropRequest, Builder> {
        private String deviceName; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private String props; 

        private Builder() {
            super();
        } 

        private Builder(SaveDevicePropRequest request) {
            super(request);
            this.deviceName = request.deviceName;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.props = request.props;
        } 

        /**
         * <p>The DeviceName of the device.</p>
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
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p> If you specify this parameter, you do not need to specify the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameters. The <strong>IotId</strong> parameter specifies a globally unique identifier (GUID) for the device. The value of the IotId parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify the <strong>IotId</strong>, <strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>The ID of the instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the <strong>ID</strong> of the instance.</p>
         * <p><strong>Important</strong></p>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If the <strong>Overview</strong> page or instance ID is not displayed in the IoT Platform console, you do not need to configure this parameter.</li>
         * </ul>
         * <p>For more information about the instance, see <a href="https://help.aliyun.com/document_detail/356505.html">Overview</a>.</p>
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
         * <p>The tag that you want to specify for the device. You can specify multiple tags.</p>
         * <p>The tags must be JSON data in the <strong>Key:Value</strong> format. <strong>Key</strong> indicates the tag name, and <strong>Value</strong> indicates the tag value.</p>
         * <p>Separate multiple tags with commas (,). Example: <strong>Props={&quot;color&quot;:&quot;red&quot;,&quot;shape&quot;:&quot;round&quot;}</strong></p>
         * <p><strong>Important</strong></p>
         * <ul>
         * <li>The maximum size of the <strong>Props</strong> parameter is 5 KB.</li>
         * <li><code>abc</code> is a <strong>key</strong> that is reserved by IoT Platform. You cannot set <strong>Key</strong> to abc. If you set <code>Key</code> to abc, the abc tag is automatically filtered when you query tags.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;color&quot;:&quot;red&quot;}</p>
         */
        public Builder props(String props) {
            this.putQueryParameter("Props", props);
            this.props = props;
            return this;
        }

        @Override
        public SaveDevicePropRequest build() {
            return new SaveDevicePropRequest(this);
        } 

    } 

}
