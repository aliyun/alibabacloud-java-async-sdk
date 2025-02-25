// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AkSkIdentityConfig} extends {@link TeaModel}
 *
 * <p>AkSkIdentityConfig</p>
 */
public class AkSkIdentityConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ak")
    private String ak;

    @com.aliyun.core.annotation.NameInMap("generateMode")
    private String generateMode;

    @com.aliyun.core.annotation.NameInMap("sk")
    private String sk;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private AkSkIdentityConfig(Builder builder) {
        this.ak = builder.ak;
        this.generateMode = builder.generateMode;
        this.sk = builder.sk;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AkSkIdentityConfig create() {
        return builder().build();
    }

    /**
     * @return ak
     */
    public String getAk() {
        return this.ak;
    }

    /**
     * @return generateMode
     */
    public String getGenerateMode() {
        return this.generateMode;
    }

    /**
     * @return sk
     */
    public String getSk() {
        return this.sk;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String ak; 
        private String generateMode; 
        private String sk; 
        private String type; 

        /**
         * ak.
         */
        public Builder ak(String ak) {
            this.ak = ak;
            return this;
        }

        /**
         * generateMode.
         */
        public Builder generateMode(String generateMode) {
            this.generateMode = generateMode;
            return this;
        }

        /**
         * sk.
         */
        public Builder sk(String sk) {
            this.sk = sk;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public AkSkIdentityConfig build() {
            return new AkSkIdentityConfig(this);
        } 

    } 

}
