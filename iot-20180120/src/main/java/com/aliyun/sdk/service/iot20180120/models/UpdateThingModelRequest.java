// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateThingModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateThingModelRequest</p>
 */
public class UpdateThingModelRequest extends Request {
    @Query
    @NameInMap("FunctionBlockId")
    private String functionBlockId;

    @Query
    @NameInMap("FunctionBlockName")
    private String functionBlockName;

    @Query
    @NameInMap("Identifier")
    private String identifier;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ThingModelJson")
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

        private Builder(UpdateThingModelRequest response) {
            super(response);
            this.functionBlockId = response.functionBlockId;
            this.functionBlockName = response.functionBlockName;
            this.identifier = response.identifier;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.thingModelJson = response.thingModelJson;
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
         * FunctionBlockName.
         */
        public Builder functionBlockName(String functionBlockName) {
            this.putQueryParameter("FunctionBlockName", functionBlockName);
            this.functionBlockName = functionBlockName;
            return this;
        }

        /**
         * Identifier.
         */
        public Builder identifier(String identifier) {
            this.putQueryParameter("Identifier", identifier);
            this.identifier = identifier;
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
         * ThingModelJson.
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
