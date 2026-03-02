// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link EnvInfoDO} extends {@link TeaModel}
 *
 * <p>EnvInfoDO</p>
 */
public class EnvInfoDO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("env")
    private String env;

    @com.aliyun.core.annotation.NameInMap("envType")
    private String envType;

    @com.aliyun.core.annotation.NameInMap("orgType")
    private String orgType;

    @com.aliyun.core.annotation.NameInMap("productId")
    private Long productId;

    @com.aliyun.core.annotation.NameInMap("productName")
    private String productName;

    @com.aliyun.core.annotation.NameInMap("region")
    private String region;

    private EnvInfoDO(Builder builder) {
        this.env = builder.env;
        this.envType = builder.envType;
        this.orgType = builder.orgType;
        this.productId = builder.productId;
        this.productName = builder.productName;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnvInfoDO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return orgType
     */
    public String getOrgType() {
        return this.orgType;
    }

    /**
     * @return productId
     */
    public Long getProductId() {
        return this.productId;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder {
        private String env; 
        private String envType; 
        private String orgType; 
        private Long productId; 
        private String productName; 
        private String region; 

        private Builder() {
        } 

        private Builder(EnvInfoDO model) {
            this.env = model.env;
            this.envType = model.envType;
            this.orgType = model.orgType;
            this.productId = model.productId;
            this.productName = model.productName;
            this.region = model.region;
        } 

        /**
         * env.
         */
        public Builder env(String env) {
            this.env = env;
            return this;
        }

        /**
         * envType.
         */
        public Builder envType(String envType) {
            this.envType = envType;
            return this;
        }

        /**
         * orgType.
         */
        public Builder orgType(String orgType) {
            this.orgType = orgType;
            return this;
        }

        /**
         * productId.
         */
        public Builder productId(Long productId) {
            this.productId = productId;
            return this;
        }

        /**
         * productName.
         */
        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        /**
         * region.
         */
        public Builder region(String region) {
            this.region = region;
            return this;
        }

        public EnvInfoDO build() {
            return new EnvInfoDO(this);
        } 

    } 

}
