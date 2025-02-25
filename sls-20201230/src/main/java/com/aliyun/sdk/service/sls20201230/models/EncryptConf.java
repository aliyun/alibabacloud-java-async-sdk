// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link EncryptConf} extends {@link TeaModel}
 *
 * <p>EncryptConf</p>
 */
public class EncryptConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("enable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enable;

    @com.aliyun.core.annotation.NameInMap("encrypt_type")
    private String encryptType;

    @com.aliyun.core.annotation.NameInMap("user_cmk_info")
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
         * <p>This parameter is required.</p>
         */
        public Builder enable(Boolean enable) {
            this.enable = enable;
            return this;
        }

        /**
         * encrypt_type.
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
