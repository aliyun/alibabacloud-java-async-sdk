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
 * {@link UpdateThingModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateThingModelRequest</p>
 */
public class UpdateThingModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockName")
    private String functionBlockName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Identifier")
    private String identifier;

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

    private UpdateThingModelRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.functionBlockName = builder.functionBlockName;
        this.identifier = builder.identifier;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.thingModelJson = builder.thingModelJson;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateThingModelRequest create() {
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
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
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

    public static final class Builder extends Request.Builder<UpdateThingModelRequest, Builder> {
        private String functionBlockId; 
        private String functionBlockName; 
        private String identifier; 
        private String iotInstanceId; 
        private String productKey; 
        private String thingModelJson; 

        private Builder() {
            super();
        } 

        private Builder(UpdateThingModelRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.functionBlockName = request.functionBlockName;
            this.identifier = request.identifier;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.thingModelJson = request.thingModelJson;
        } 

        /**
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
         * <p>If you do not specify this parameter or the <strong>FunctionBlockName</strong> parameter, the system updates the features of the default module.</p>
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
         * <ul>
         * <li>If you do not specify this parameter or the <strong>FunctionBlockId</strong> parameter, the system updates the features of the default module.</li>
         * <li>If you specify this parameter, the parameter must be used in combination with the <strong>FunctionBlockId</strong> parameter. You can modify the name of the specified custom module. The name corresponds to the value of the <strong>FunctionBlockId</strong> parameter.</li>
         * </ul>
         * <blockquote>
         * <p> You cannot modify the name of the default module.</p>
         * </blockquote>
         */
        public Builder functionBlockName(String functionBlockName) {
            this.putQueryParameter("FunctionBlockName", functionBlockName);
            this.functionBlockName = functionBlockName;
            return this;
        }

        /**
         * <p>The identifier of the feature.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/150319.html">GetThingModelTsl</a> operation and view the identifier in the <strong>TslStr</strong> response parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>Temperature</p>
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
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
         * <p>The updated details of the feature.</p>
         * <ul>
         * <li>If you specify the <strong>Identifier</strong> parameter, you can define only the identifier of the feature.</li>
         * <li>If you do not specify the <strong>Identifier</strong> parameter, you can define a maximum of 50 input and output parameters for a service or event.</li>
         * </ul>
         * <p>For more information about how to specify this parameter, see <a href="https://help.aliyun.com/document_detail/150457.html">Data structure of ThingModelJson</a>.</p>
         */
        public Builder thingModelJson(String thingModelJson) {
            this.putQueryParameter("ThingModelJson", thingModelJson);
            this.thingModelJson = thingModelJson;
            return this;
        }

        @Override
        public UpdateThingModelRequest build() {
            return new UpdateThingModelRequest(this);
        } 

    } 

}
