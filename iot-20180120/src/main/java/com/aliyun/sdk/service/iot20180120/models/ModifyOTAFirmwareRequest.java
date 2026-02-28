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
 * {@link ModifyOTAFirmwareRequest} extends {@link RequestModel}
 *
 * <p>ModifyOTAFirmwareRequest</p>
 */
public class ModifyOTAFirmwareRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareDesc")
    private String firmwareDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String firmwareId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareName")
    private String firmwareName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FirmwareUdi")
    private String firmwareUdi;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productKey;

    private ModifyOTAFirmwareRequest(Builder builder) {
        super(builder);
        this.firmwareDesc = builder.firmwareDesc;
        this.firmwareId = builder.firmwareId;
        this.firmwareName = builder.firmwareName;
        this.firmwareUdi = builder.firmwareUdi;
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOTAFirmwareRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return firmwareDesc
     */
    public String getFirmwareDesc() {
        return this.firmwareDesc;
    }

    /**
     * @return firmwareId
     */
    public String getFirmwareId() {
        return this.firmwareId;
    }

    /**
     * @return firmwareName
     */
    public String getFirmwareName() {
        return this.firmwareName;
    }

    /**
     * @return firmwareUdi
     */
    public String getFirmwareUdi() {
        return this.firmwareUdi;
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

    public static final class Builder extends Request.Builder<ModifyOTAFirmwareRequest, Builder> {
        private String firmwareDesc; 
        private String firmwareId; 
        private String firmwareName; 
        private String firmwareUdi; 
        private String iotInstanceId; 
        private String productKey; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOTAFirmwareRequest request) {
            super(request);
            this.firmwareDesc = request.firmwareDesc;
            this.firmwareId = request.firmwareId;
            this.firmwareName = request.firmwareName;
            this.firmwareUdi = request.firmwareUdi;
            this.iotInstanceId = request.iotInstanceId;
            this.productKey = request.productKey;
        } 

        /**
         * FirmwareDesc.
         */
        public Builder firmwareDesc(String firmwareDesc) {
            this.putQueryParameter("FirmwareDesc", firmwareDesc);
            this.firmwareDesc = firmwareDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>s8SSHiKjpBfrM3BSN0z803****</p>
         */
        public Builder firmwareId(String firmwareId) {
            this.putQueryParameter("FirmwareId", firmwareId);
            this.firmwareId = firmwareId;
            return this;
        }

        /**
         * FirmwareName.
         */
        public Builder firmwareName(String firmwareName) {
            this.putQueryParameter("FirmwareName", firmwareName);
            this.firmwareName = firmwareName;
            return this;
        }

        /**
         * FirmwareUdi.
         */
        public Builder firmwareUdi(String firmwareUdi) {
            this.putQueryParameter("FirmwareUdi", firmwareUdi);
            this.firmwareUdi = firmwareUdi;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a1uctKe****</p>
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        @Override
        public ModifyOTAFirmwareRequest build() {
            return new ModifyOTAFirmwareRequest(this);
        } 

    } 

}
