// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Platform} extends {@link TeaModel}
 *
 * <p>Platform</p>
 */
public class Platform extends TeaModel {
    @NameInMap("architecture")
    private String architecture;

    @NameInMap("os")
    private String os;

    private Platform(Builder builder) {
        this.architecture = builder.architecture;
        this.os = builder.os;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Platform create() {
        return builder().build();
    }

    /**
     * @return architecture
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * @return os
     */
    public String getOs() {
        return this.os;
    }

    public static final class Builder {
        private String architecture; 
        private String os; 

        /**
         * architecture.
         */
        public Builder architecture(String architecture) {
            this.architecture = architecture;
            return this;
        }

        /**
         * os.
         */
        public Builder os(String os) {
            this.os = os;
            return this;
        }

        public Platform build() {
            return new Platform(this);
        } 

    } 

}
