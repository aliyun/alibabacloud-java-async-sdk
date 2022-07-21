// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteThingModelRequest} extends {@link RequestModel}
 *
 * <p>DeleteThingModelRequest</p>
 */
public class DeleteThingModelRequest extends Request {
    @Query
    @NameInMap("EventIdentifier")
    private java.util.List < String > eventIdentifier;

    @Query
    @NameInMap("FunctionBlockId")
    private String functionBlockId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("PropertyIdentifier")
    private java.util.List < String > propertyIdentifier;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServiceIdentifier")
    private java.util.List < String > serviceIdentifier;

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
    public java.util.List < String > getEventIdentifier() {
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
    public java.util.List < String > getPropertyIdentifier() {
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
    public java.util.List < String > getServiceIdentifier() {
        return this.serviceIdentifier;
    }

    public static final class Builder extends Request.Builder<DeleteThingModelRequest, Builder> {
        private java.util.List < String > eventIdentifier; 
        private String functionBlockId; 
        private String iotInstanceId; 
        private String productKey; 
        private java.util.List < String > propertyIdentifier; 
        private String resourceGroupId; 
        private java.util.List < String > serviceIdentifier; 

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
        public Builder eventIdentifier(java.util.List < String > eventIdentifier) {
            this.putQueryParameter("EventIdentifier", eventIdentifier);
            this.eventIdentifier = eventIdentifier;
            return this;
        }

        /**
         * FunctionBlockId.
         */
        public Builder functionBlockId(String functionBlockId) {
            this.putQueryParameter("FunctionBlockId", functionBlockId);
            this.functionBlockId = functionBlockId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * PropertyIdentifier.
         */
        public Builder propertyIdentifier(java.util.List < String > propertyIdentifier) {
            this.putQueryParameter("PropertyIdentifier", propertyIdentifier);
            this.propertyIdentifier = propertyIdentifier;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServiceIdentifier.
         */
        public Builder serviceIdentifier(java.util.List < String > serviceIdentifier) {
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
