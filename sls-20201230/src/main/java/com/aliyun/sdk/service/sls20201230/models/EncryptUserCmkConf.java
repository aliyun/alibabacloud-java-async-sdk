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
 * {@link EncryptUserCmkConf} extends {@link TeaModel}
 *
 * <p>EncryptUserCmkConf</p>
 */
public class EncryptUserCmkConf extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("arn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String arn;

    @com.aliyun.core.annotation.NameInMap("cmk_key_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cmkKeyId;

    @com.aliyun.core.annotation.NameInMap("region_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private EncryptUserCmkConf(Builder builder) {
        this.arn = builder.arn;
        this.cmkKeyId = builder.cmkKeyId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EncryptUserCmkConf create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return cmkKeyId
     */
    public String getCmkKeyId() {
        return this.cmkKeyId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder {
        private String arn; 
        private String cmkKeyId; 
        private String regionId; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder cmkKeyId(String cmkKeyId) {
            this.cmkKeyId = cmkKeyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        public EncryptUserCmkConf build() {
            return new EncryptUserCmkConf(this);
        } 

    } 

}
