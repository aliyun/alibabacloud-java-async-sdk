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
 * {@link InvokeThingServiceRequest} extends {@link RequestModel}
 *
 * <p>InvokeThingServiceRequest</p>
 */
public class InvokeThingServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Args")
    @com.aliyun.core.annotation.Validation(required = true)
    private String args;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceName")
    private String deviceName;

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
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Qos")
    @com.aliyun.core.annotation.Validation(maximum = 1)
    private Integer qos;

    private InvokeThingServiceRequest(Builder builder) {
        super(builder);
        this.args = builder.args;
        this.deviceName = builder.deviceName;
        this.identifier = builder.identifier;
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.qos = builder.qos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvokeThingServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return args
     */
    public String getArgs() {
        return this.args;
    }

    /**
     * @return deviceName
     */
    public String getDeviceName() {
        return this.deviceName;
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
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return qos
     */
    public Integer getQos() {
        return this.qos;
    }

    public static final class Builder extends Request.Builder<InvokeThingServiceRequest, Builder> {
        private String args; 
        private String deviceName; 
        private String identifier; 
        private String iotId; 
        private String iotInstanceId; 
        private String productKey; 
        private Integer qos; 

        private Builder() {
            super();
        } 

        private Builder(InvokeThingServiceRequest request) {
            super(request);
            this.args = request.args;
            this.deviceName = request.deviceName;
            this.identifier = request.identifier;
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.qos = request.qos;
        } 

        /**
         * <p>The input parameter of the service. The value is a JSON string. Example: <strong>Args={&quot;param1&quot;: 1}</strong>.</p>
         * <p>If this parameter is left empty, set the value to <strong>Args={}</strong>.</p>
         * <blockquote>
         * <p>If the TSL data is of the float or double type, the parameter values that correspond to the TSL data contain at least one decimal place. Examples: 10.0 and 11.1.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;param1&quot;:1}</p>
         */
        public Builder args(String args) {
            this.putQueryParameter("Args", args);
            this.args = args;
            return this;
        }

        /**
         * <p>The DeviceName of the device to which the required service belongs.</p>
         * <blockquote>
         * <p>If you configure this parameter, you must specify a value for the <strong>ProductKey</strong> parameter.</p>
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
         * <p>The identifier of the service.</p>
         * <p>You can use one of the following methods to view the <strong>identifier</strong> of the service:</p>
         * <ul>
         * <li>Log on to the <a href="https://iot.console.aliyun.com/">IoT Platform console</a>. On the <strong>Define Feature</strong> tab of the product to which the device belongs, view the identifier.</li>
         * <li>Call the <a href="https://help.aliyun.com/document_detail/150321.html">QueryThingModel</a> operation and view the identifier in the TSL information that is returned.</li>
         * </ul>
         * <blockquote>
         * <p> If a service named testService belongs to a custom module named testFb, you can set this parameter to <strong><strong><strong>testFb:testService</strong></strong></strong>. The custom module is not the default module.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Set</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The ID of the device. The ID is a unique identifier that is issued by IoT Platform to the device.</p>
         * <blockquote>
         * <p>The IotId parameter specifies a globally unique identifier (GUID) for the device. The value of the <strong>IotId</strong> parameter corresponds to a combination of the values of the <strong>ProductKey</strong> and <strong>DeviceName</strong> parameters. If you specify a value for this parameter, you do not need to configure the <strong>ProductKey</strong> or <strong>DeviceName</strong> parameter. If you specify values for the <strong>IotId</strong>,<strong>ProductKey</strong>, and <strong>DeviceName</strong> parameters, the value of the <strong>IotId</strong> parameter takes precedence.</p>
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
         * <p>The ID of the elastic container instance. On the <strong>Overview</strong> page in the IoT Platform console, you can view the ID of the instance.****</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for the parameter. Otherwise, the call fails.********</li>
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
         * <blockquote>
         * <p>If you configure this parameter, you must specify a value for the <strong>DeviceName</strong> parameter.</p>
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
         * Qos.
         */
        public Builder qos(Integer qos) {
            this.putQueryParameter("Qos", qos);
            this.qos = qos;
            return this;
        }

        @Override
        public InvokeThingServiceRequest build() {
            return new InvokeThingServiceRequest(this);
        } 

    } 

}
