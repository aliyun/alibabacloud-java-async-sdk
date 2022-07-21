// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAModuleRequest} extends {@link RequestModel}
 *
 * <p>CreateOTAModuleRequest</p>
 */
public class CreateOTAModuleRequest extends Request {
    @Query
    @NameInMap("AliasName")
    private String aliasName;

    @Query
    @NameInMap("Desc")
    private String desc;

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

    private CreateOTAModuleRequest(Builder builder) {
        super(builder);
        this.aliasName = builder.aliasName;
        this.desc = builder.desc;
        this.iotInstanceId = builder.iotInstanceId;
        this.moduleName = builder.moduleName;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOTAModuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliasName
     */
    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
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

    public static final class Builder extends Request.Builder<CreateOTAModuleRequest, Builder> {
        private String aliasName; 
        private String desc; 
        private String iotInstanceId; 
        private String moduleName; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(CreateOTAModuleRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.desc = request.desc;
            this.iotInstanceId = request.iotInstanceId;
            this.moduleName = request.moduleName;
            this.productKey = request.productKey;
        } 

        /**
         * AliasName.
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
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
        public CreateOTAModuleRequest build() {
            return new CreateOTAModuleRequest(this);
        } 

    } 

}
