// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EncryptConf} extends {@link TeaModel}
 *
 * <p>EncryptConf</p>
 */
public class EncryptConf extends TeaModel {
    @NameInMap("enable")
    @Validation(required = true)
    private Boolean enable;

    @NameInMap("encrypt_type")
    @Validation(required = true)
    private String encryptType;

    @NameInMap("user_cmk_info")
    private EncryptUserCmkConf userCmkInfo;

    private EncryptConf(Builder builder) {
        this.enable = builder.enable;
        this.encryptType = builder.encryptType;
        this.userCmkInfo = builder.userCmkInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptConf create() {
        return builder().build();
    }

    /**
     * @return enable
     */
    public Boolean getEnable() {
        return this.enable;
    }

    /**
     * @return encryptType
     */
    public String getEncryptType() {
        return this.encryptType;
    }

    /**
     * @return userCmkInfo
     */
    public EncryptUserCmkConf getUserCmkInfo() {
        return this.userCmkInfo;
    }

    public static final class Builder {
        private Boolean enable; 
        private String encryptType; 
        private EncryptUserCmkConf userCmkInfo; 

        /**
         * enable
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * encrypt_type
         */
        public Builder encryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }

        /**
         * user_cmk_info.
         */
        public Builder userCmkInfo(EncryptUserCmkConf userCmkInfo) {
            this.userCmkInfo = userCmkInfo;
            return this;
        }

        public EncryptConf build() {
            return new EncryptConf(this);
        } 

    } 

}
