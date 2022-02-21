// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDeviceRequest} extends {@link RequestModel}
 *
 * <p>VerifyDeviceRequest</p>
 */
public class VerifyDeviceRequest extends Request {
    @Body
    @NameInMap("DeviceAddress")
    @Validation(required = true)
    private String deviceAddress;

    @Body
    @NameInMap("FilePath")
    @Validation(required = true)
    private String filePath;

    @Body
    @NameInMap("NvrExisted")
    private Long nvrExisted;

    private VerifyDeviceRequest(Builder builder) {
        super(builder);
        this.deviceAddress = builder.deviceAddress;
        this.filePath = builder.filePath;
        this.nvrExisted = builder.nvrExisted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceAddress
     */
    public String getDeviceAddress() {
        return this.deviceAddress;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return nvrExisted
     */
    public Long getNvrExisted() {
        return this.nvrExisted;
    }

    public static final class Builder extends Request.Builder<VerifyDeviceRequest, Builder> {
        private String deviceAddress; 
        private String filePath; 
        private Long nvrExisted; 

        private Builder() {
            super();
        } 

        private Builder(VerifyDeviceRequest response) {
            super(response);
            this.deviceAddress = response.deviceAddress;
            this.filePath = response.filePath;
            this.nvrExisted = response.nvrExisted;
        } 

        /**
         * 设备安装地址
         */
        public Builder deviceAddress(String deviceAddress) {
            this.putBodyParameter("DeviceAddress", deviceAddress);
            this.deviceAddress = deviceAddress;
            return this;
        }

        /**
         * OSS路径
         */
        public Builder filePath(String filePath) {
            this.putBodyParameter("FilePath", filePath);
            this.filePath = filePath;
            return this;
        }

        /**
         * NvrExisted.
         */
        public Builder nvrExisted(Long nvrExisted) {
            this.putBodyParameter("NvrExisted", nvrExisted);
            this.nvrExisted = nvrExisted;
            return this;
        }

        @Override
        public VerifyDeviceRequest build() {
            return new VerifyDeviceRequest(this);
        } 

    } 

}
