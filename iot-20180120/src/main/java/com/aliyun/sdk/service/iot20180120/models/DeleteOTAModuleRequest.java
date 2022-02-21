// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteOTAModuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteOTAModuleRequest</p>
 */
public class DeleteOTAModuleRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ModuleName")
    @Validation(required = true)
    private String moduleName;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    private DeleteOTAModuleRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.moduleName = builder.moduleName;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteOTAModuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return moduleName
     */
    public String getModuleName() {
        return this.moduleName;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    public static final class Builder extends Request.Builder<DeleteOTAModuleRequest, Builder> {
        private String iotInstanceId; 
        private String moduleName; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(DeleteOTAModuleRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.moduleName = response.moduleName;
            this.productKey = response.productKey;
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
         * ModuleName.
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
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

        @Override
        public DeleteOTAModuleRequest build() {
            return new DeleteOTAModuleRequest(this);
        } 

    } 

}
