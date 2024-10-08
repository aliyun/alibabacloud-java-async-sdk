// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyDevicesSecureNetworkTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDevicesSecureNetworkTypeRequest</p>
 */
public class ModifyDevicesSecureNetworkTypeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllDevices")
    private Long allDevices;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SecureNetworkType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secureNetworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SerialNos")
    private String serialNos;

    private ModifyDevicesSecureNetworkTypeRequest(Builder builder) {
        super(builder);
        this.allDevices = builder.allDevices;
        this.secureNetworkType = builder.secureNetworkType;
        this.serialNos = builder.serialNos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDevicesSecureNetworkTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allDevices
     */
    public Long getAllDevices() {
        return this.allDevices;
    }

    /**
     * @return secureNetworkType
     */
    public String getSecureNetworkType() {
        return this.secureNetworkType;
    }

    /**
     * @return serialNos
     */
    public String getSerialNos() {
        return this.serialNos;
    }

    public static final class Builder extends Request.Builder<ModifyDevicesSecureNetworkTypeRequest, Builder> {
        private Long allDevices; 
        private String secureNetworkType; 
        private String serialNos; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDevicesSecureNetworkTypeRequest request) {
            super(request);
            this.allDevices = request.allDevices;
            this.secureNetworkType = request.secureNetworkType;
            this.serialNos = request.serialNos;
        } 

        /**
         * AllDevices.
         */
        public Builder allDevices(Long allDevices) {
            this.putBodyParameter("AllDevices", allDevices);
            this.allDevices = allDevices;
            return this;
        }

        /**
         * SecureNetworkType.
         */
        public Builder secureNetworkType(String secureNetworkType) {
            this.putBodyParameter("SecureNetworkType", secureNetworkType);
            this.secureNetworkType = secureNetworkType;
            return this;
        }

        /**
         * SerialNos.
         */
        public Builder serialNos(String serialNos) {
            this.putBodyParameter("SerialNos", serialNos);
            this.serialNos = serialNos;
            return this;
        }

        @Override
        public ModifyDevicesSecureNetworkTypeRequest build() {
            return new ModifyDevicesSecureNetworkTypeRequest(this);
        } 

    } 

}
