// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateThingModelRequest} extends {@link RequestModel}
 *
 * <p>CreateThingModelRequest</p>
 */
public class CreateThingModelRequest extends Request {
    @Query
    @NameInMap("FunctionBlockId")
    private String functionBlockId;

    @Query
    @NameInMap("FunctionBlockName")
    private String functionBlockName;

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
        public CreateThingModelRequest build() {
            return new CreateThingModelRequest(this);
        } 

    } 

}
