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
 * {@link UpdateOTAModuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateOTAModuleRequest</p>
 */
public class UpdateOTAModuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AliasName")
    private String aliasName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private UpdateOTAModuleRequest(Builder builder) {
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

    public static UpdateOTAModuleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateOTAModuleRequest, Builder> {
        private String aliasName; 
        private String desc; 
        private String iotInstanceId; 
        private String moduleName; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(UpdateOTAModuleRequest request) {
            super(request);
            this.aliasName = request.aliasName;
            this.desc = request.desc;
            this.iotInstanceId = request.iotInstanceId;
            this.moduleName = request.moduleName;
            this.productKey = request.productKey;
        } 

        /**
         * <p>The new alias of the OTA module. The alias must be 1 to 64 characters in length, and can contain letters, digits, periods(.), hyphens (-), and underscores (_).</p>
         */
        public Builder aliasName(String aliasName) {
            this.putQueryParameter("AliasName", aliasName);
            this.aliasName = aliasName;
            return this;
        }

        /**
         * <p>The new description of the OTA module. The description can be up to 100 characters in length.</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
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
         * <p>The name of the OTA module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>barcodeScanner</p>
         */
        public Builder moduleName(String moduleName) {
            this.putQueryParameter("ModuleName", moduleName);
            this.moduleName = moduleName;
            return this;
        }

        /**
         * <p>The <strong>ProductKey</strong> of the product to which the OTA module belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1Le6d0****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public UpdateOTAModuleRequest build() {
            return new UpdateOTAModuleRequest(this);
        } 

    } 

}
