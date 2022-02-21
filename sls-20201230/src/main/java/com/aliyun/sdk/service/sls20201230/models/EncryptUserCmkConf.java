// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link EncryptUserCmkConf} extends {@link TeaModel}
 *
 * <p>EncryptUserCmkConf</p>
 */
public class EncryptUserCmkConf extends TeaModel {
    @NameInMap("arn")
    @Validation(required = true)
    private String arn;

    @NameInMap("cmk_key_id")
    @Validation(required = true)
    private String cmkKeyId;

    @NameInMap("region_id")
    @Validation(required = true)
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
         * arn
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * cmk_key_id
         */
        public Builder cmkKeyId(String cmkKeyId) {
            this.cmkKeyId = cmkKeyId;
            return this;
        }

        /**
         * region_id
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
