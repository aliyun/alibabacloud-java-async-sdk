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
 * {@link CreateThingModelRequest} extends {@link RequestModel}
 *
 * <p>CreateThingModelRequest</p>
 */
public class CreateThingModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockName")
    private String functionBlockName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ThingModelJson")
    private String thingModelJson;

    private CreateThingModelRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.functionBlockName = builder.functionBlockName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.thingModelJson = builder.thingModelJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThingModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionBlockId
     */
    public String getFunctionBlockId() {
        return this.functionBlockId;
    }

    /**
     * @return functionBlockName
     */
    public String getFunctionBlockName() {
        return this.functionBlockName;
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
     * @return thingModelJson
     */
    public String getThingModelJson() {
        return this.thingModelJson;
    }

    public static final class Builder extends Request.Builder<CreateThingModelRequest, Builder> {
        private String functionBlockId; 
        private String functionBlockName; 
        private String iotInstanceId; 
        private String productKey; 
        private String thingModelJson; 

        private Builder() {
            super();
        } 

        private Builder(CreateThingModelRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.functionBlockName = request.functionBlockName;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.thingModelJson = request.thingModelJson;
        } 

        /**
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product. The identifier must be 1 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter must be used in combination with the <strong>FunctionBlockName</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
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
         * <p>The name of the custom module. The name must be 4 to 30 characters in length, and can contain letters, digits, and underscores (_).</p>
         * <p>This parameter must be used in combination with the <strong>FunctionBlockId</strong> parameter. If you do not specify this parameter, the system imports the default module.</p>
         */
        public Builder functionBlockName(String functionBlockName) {
            this.putQueryParameter("FunctionBlockName", functionBlockName);
            this.functionBlockName = functionBlockName;
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
         * <p>iot-cn-0pp1n8t****</p>
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product.</p>
         * <p>You can view the ProductKey on the Product Details page of the IoT Platform console. You can also obtain the ProductKey by calling the <a href="https://help.aliyun.com/document_detail/69271.html">QueryProductList</a> operation.</p>
         * <p>This parameter is required.</p>
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
         * <p>The details of the new features.</p>
         * <blockquote>
         * <p> You can specify a maximum of 10 features.</p>
         * </blockquote>
         * <p>Example:</p>
         * <pre><code>
         * {
         *   &quot;properties&quot;: [
         *     {
         *       &quot;custom&quot;: true,
         *       &quot;dataSpecsList&quot;: [
         *         {
         *           &quot;childDataType&quot;: &quot;TEXT&quot;,
         *           &quot;childName&quot;: &quot;CCID number of the device SIM card&quot;,
         *           &quot;dataSpecs&quot;: {
         *             &quot;custom&quot;: true,
         *             &quot;dataType&quot;: &quot;TEXT&quot;,
         *             &quot;length&quot;: 20
         *           },
         *           &quot;dataType&quot;: &quot;STRUCT&quot;,
         *           &quot;identifier&quot;: &quot;CCID&quot;,
         *           &quot;name&quot;: &quot;CCID number of the device SIM card&quot;
         *         },
         *         {
         *           &quot;childDataType&quot;: &quot;INT&quot;,
         *           &quot;childName&quot;: &quot;Battery power&quot;,
         *           &quot;dataSpecs&quot;: {
         *             &quot;custom&quot;: true,
         *             &quot;dataType&quot;: &quot;INT&quot;,
         *             &quot;max&quot;: &quot;60000&quot;,
         *             &quot;min&quot;: &quot;0&quot;,
         *             &quot;step&quot;: &quot;1&quot;
         *           },
         *           &quot;dataType&quot;: &quot;STRUCT&quot;,
         *           &quot;identifier&quot;: &quot;battery&quot;,
         *           &quot;name&quot;: &quot;Battery power&quot;
         *         },
         *         {
         *           &quot;childDataType&quot;: &quot;TEXT&quot;,
         *           &quot;childName&quot;: &quot;Other information&quot;,
         *           &quot;dataSpecs&quot;: {
         *             &quot;custom&quot;: true,
         *             &quot;dataType&quot;: &quot;TEXT&quot;,
         *             &quot;length&quot;: 1024
         *           },
         *           &quot;dataType&quot;: &quot;STRUCT&quot;,
         *           &quot;identifier&quot;: &quot;other_info&quot;,
         *           &quot;name&quot;: &quot;Other information&quot;
         *         }
         *       ],
         *       &quot;dataType&quot;: &quot;STRUCT&quot;,
         *       &quot;identifier&quot;: &quot;DEV_INFO&quot;,
         *       &quot;name&quot;: &quot;Device information&quot;,
         *       &quot;productKey&quot;: &quot;a1T***&quot;,
         *       &quot;propertyId&quot;: 18786548,
         *       &quot;required&quot;: false,
         *       &quot;rwFlag&quot;: &quot;READ_ONLY&quot;
         *     },
         *     {
         *       &quot;custom&quot;: true,
         *       &quot;dataSpecs&quot;: {
         *         &quot;childDataType&quot;: &quot;INT&quot;,
         *         &quot;custom&quot;: true,
         *         &quot;dataType&quot;: &quot;ARRAY&quot;,
         *         &quot;size&quot;: 1,
         *         &quot;dataSpecs&quot;: {
         *           &quot;custom&quot;: true,
         *           &quot;dataType&quot;: &quot;INT&quot;,
         *           &quot;max&quot;: &quot;65535&quot;,
         *           &quot;min&quot;: &quot;0&quot;,
         *           &quot;step&quot;: &quot;1&quot;,
         *           &quot;unit&quot;: &quot;ppm&quot;,
         *           &quot;unitName&quot;: &quot;Parts per million&quot;
         *         }
         *       },
         *       &quot;dataType&quot;: &quot;ARRAY&quot;,
         *       &quot;identifier&quot;: &quot;airRH_SR&quot;,
         *       &quot;name&quot;: &quot;Dehumidifier humidity&quot;,
         *       &quot;productKey&quot;: &quot;a1T***&quot;,
         *       &quot;propertyId&quot;: 18786551,
         *       &quot;required&quot;: false,
         *       &quot;rwFlag&quot;: &quot;READ_ONLY&quot;
         *     }
         *   ],
         *   &quot;services&quot;: [...],
         *   &quot;events&quot;: [...]
         * }
         *                                 
         * </code></pre>
         * <p>In the <strong>properties</strong> structure of the <strong>ThingModelJson</strong> parameter, you can use the <strong>extendConfig</strong> parameter to define the extended information of the TSL model. For more information, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
         */
        public Builder thingModelJson(String thingModelJson) {
            this.putQueryParameter("ThingModelJson", thingModelJson);
            this.thingModelJson = thingModelJson;
            return this;
        }

        @Override
        public CreateThingModelRequest build() {
            return new CreateThingModelRequest(this);
        } 

    } 

}
