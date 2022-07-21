// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetThingModelTslRequest} extends {@link RequestModel}
 *
 * <p>GetThingModelTslRequest</p>
 */
public class GetThingModelTslRequest extends Request {
    @Query
    @NameInMap("FunctionBlockId")
    private String functionBlockId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ModelVersion")
    private String modelVersion;

    @Query
    @NameInMap("ProductKey")
    private String productKey;

    @Query
    @NameInMap("Simple")
    private Boolean simple;

    private GetThingModelTslRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.iotInstanceId = builder.iotInstanceId;
        this.modelVersion = builder.modelVersion;
        this.productKey = builder.productKey;
        this.simple = builder.simple;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingModelTslRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return modelVersion
     */
    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return simple
     */
    public Boolean getSimple() {
        return this.simple;
    }

    public static final class Builder extends Request.Builder<GetThingModelTslRequest, Builder> {
        private String functionBlockId; 
        private String iotInstanceId; 
        private String modelVersion; 
        private String productKey; 
        private Boolean simple; 

        private Builder() {
            super();
        } 

        private Builder(GetThingModelTslRequest request) {
            super(request);
            this.functionBlockId = request.functionBlockId;
            this.iotInstanceId = request.iotInstanceId;
            this.modelVersion = request.modelVersion;
            this.productKey = request.productKey;
            this.simple = request.simple;
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
         * ModelVersion.
         */
        public Builder modelVersion(String modelVersion) {
            this.putQueryParameter("ModelVersion", modelVersion);
            this.modelVersion = modelVersion;
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
         * Simple.
         */
        public Builder simple(Boolean simple) {
            this.putQueryParameter("Simple", simple);
            this.simple = simple;
            return this;
        }

        @Override
        public GetThingModelTslRequest build() {
            return new GetThingModelTslRequest(this);
        } 

    } 

}
