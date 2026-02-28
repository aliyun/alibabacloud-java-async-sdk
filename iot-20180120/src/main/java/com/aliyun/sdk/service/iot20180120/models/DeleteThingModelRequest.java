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
 * {@link DeleteThingModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteThingModelRequest</p>
 */
public class DeleteThingModelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EventIdentifier")
    private java.util.List<String> eventIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionBlockId")
    private String functionBlockId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    private String productKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PropertyIdentifier")
    private java.util.List<String> propertyIdentifier;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceIdentifier")
    private java.util.List<String> serviceIdentifier;

    private DeleteThingModelRequest(Builder builder) {
        super(builder);
        this.eventIdentifier = builder.eventIdentifier;
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.propertyIdentifier = builder.propertyIdentifier;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceIdentifier = builder.serviceIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteThingModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventIdentifier
     */
    public java.util.List<String> getEventIdentifier() {
        return this.eventIdentifier;
    }

    /**
     * @return functionBlockId
     */
    public String getFunctionBlockId() {
        return this.functionBlockId;
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
     * @return propertyIdentifier
     */
    public java.util.List<String> getPropertyIdentifier() {
        return this.propertyIdentifier;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serviceIdentifier
     */
    public java.util.List<String> getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public static final class Builder extends Request.Builder<DeleteThingModelRequest, Builder> {
        private java.util.List<String> eventIdentifier; 
        private String functionBlockId; 
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List<String> propertyIdentifier; 
        private String resourceGroupId; 
        private java.util.List<String> serviceIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(DeleteThingModelRequest request) {
            super(request);
            this.eventIdentifier = request.eventIdentifier;
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
            this.propertyIdentifier = request.propertyIdentifier;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceIdentifier = request.serviceIdentifier;
        } 

        /**
         * EventIdentifier.
         */
        public Builder eventIdentifier(java.util.List<String> eventIdentifier) {
            this.putQueryParameter("EventIdentifier", eventIdentifier);
            this.eventIdentifier = eventIdentifier;
            return this;
        }

        /**
         * <p>The identifier of the custom TSL module. Each identifier is unique in a product.</p>
         * <ul>
         * <li>If you configure the BatteryModule parameter when a value is specified for the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, or <strong>EventIdentifier.N</strong> parameter, the operation removes one or more specified features from the specified custom TSL module. If you do not configure the BatteryModule parameter, the operation removes one or more specified features from the default TSL module.</li>
         * <li>If you configure the BatteryModule parameter when the <strong>PropertyIdentifier.N</strong>, <strong>ServiceIdentifier.N</strong>, and <strong>EventIdentifier.N</strong> parameters are empty, the operation removes all features from the specified custom TSL module.</li>
         * </ul>
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
         * <p>The ID of the instance. You can view the <strong>ID</strong> of the instance on the <strong>Overview</strong> page in the IoT Platform console.</p>
         * <blockquote>
         * <ul>
         * <li>If your instance has an ID, you must specify the ID for this parameter. Otherwise, the call fails.</li>
         * <li>If no <strong>Overview</strong> page or ID is generated for your instance, you do not need to configure this parameter.</li>
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
         * <p>The ProductKey of the product.</p>
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
         * PropertyIdentifier.
         */
        public Builder propertyIdentifier(java.util.List<String> propertyIdentifier) {
            this.putQueryParameter("PropertyIdentifier", propertyIdentifier);
            this.propertyIdentifier = propertyIdentifier;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * <blockquote>
         * <p> You cannot configure this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm4l5tcwd****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServiceIdentifier.
         */
        public Builder serviceIdentifier(java.util.List<String> serviceIdentifier) {
            this.putQueryParameter("ServiceIdentifier", serviceIdentifier);
            this.serviceIdentifier = serviceIdentifier;
            return this;
        }

        @Override
        public DeleteThingModelRequest build() {
            return new DeleteThingModelRequest(this);
        } 

    } 

}
