// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportThingModelTslRequest} extends {@link RequestModel}
 *
 * <p>ImportThingModelTslRequest</p>
 */
public class ImportThingModelTslRequest extends Request {
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
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("TslStr")
    private String tslStr;

    @Query
    @NameInMap("TslUrl")
    private String tslUrl;

    private ImportThingModelTslRequest(Builder builder) {
        super(builder);
        this.functionBlockId = builder.functionBlockId;
        this.functionBlockName = builder.functionBlockName;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.resourceGroupId = builder.resourceGroupId;
        this.tslStr = builder.tslStr;
        this.tslUrl = builder.tslUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ImportThingModelTslRequest create() {
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tslStr
     */
    public String getTslStr() {
        return this.tslStr;
    }

    /**
     * @return tslUrl
     */
    public String getTslUrl() {
        return this.tslUrl;
    }

    public static final class Builder extends Request.Builder<ImportThingModelTslRequest, Builder> {
        private String functionBlockId; 
        private String functionBlockName; 
        private String iotInstanceId; 
        private String productKey; 
        private String resourceGroupId; 
        private String tslStr; 
        private String tslUrl; 

        private Builder() {
            super();
        } 

        private Builder(ImportThingModelTslRequest response) {
            super(response);
            this.functionBlockId = response.functionBlockId;
            this.functionBlockName = response.functionBlockName;
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.resourceGroupId = response.resourceGroupId;
            this.tslStr = response.tslStr;
            this.tslUrl = response.tslUrl;
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
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * TslStr.
         */
        public Builder tslStr(String tslStr) {
            this.putQueryParameter("TslStr", tslStr);
            this.tslStr = tslStr;
            return this;
        }

        /**
         * TslUrl.
         */
        public Builder tslUrl(String tslUrl) {
            this.putQueryParameter("TslUrl", tslUrl);
            this.tslUrl = tslUrl;
            return this;
        }

        @Override
        public ImportThingModelTslRequest build() {
            return new ImportThingModelTslRequest(this);
        } 

    } 

}
