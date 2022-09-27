// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReadWritePolicy} extends {@link TeaModel}
 *
 * <p>ReadWritePolicy</p>
 */
public class ReadWritePolicy extends TeaModel {
    @NameInMap("autoGeneratePk")
    private Boolean autoGeneratePk;

    @NameInMap("writeHa")
    private Boolean writeHa;

    @NameInMap("writePolicy")
    private String writePolicy;

    private ReadWritePolicy(Builder builder) {
        this.autoGeneratePk = builder.autoGeneratePk;
        this.writeHa = builder.writeHa;
        this.writePolicy = builder.writePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReadWritePolicy create() {
        return builder().build();
    }

    /**
     * @return autoGeneratePk
     */
    public Boolean getAutoGeneratePk() {
        return this.autoGeneratePk;
    }

    /**
     * @return writeHa
     */
    public Boolean getWriteHa() {
        return this.writeHa;
    }

    /**
     * @return writePolicy
     */
    public String getWritePolicy() {
        return this.writePolicy;
    }

    public static final class Builder {
        private Boolean autoGeneratePk; 
        private Boolean writeHa; 
        private String writePolicy; 

        /**
         * 是否开启自动主键
         */
        public Builder autoGeneratePk(Boolean autoGeneratePk) {
            this.autoGeneratePk = autoGeneratePk;
            return this;
        }

        /**
         * 是否开启读写分离
         */
        public Builder writeHa(Boolean writeHa) {
            this.writeHa = writeHa;
            return this;
        }

        /**
         * 读写分离方式
         */
        public Builder writePolicy(String writePolicy) {
            this.writePolicy = writePolicy;
            return this;
        }

        public ReadWritePolicy build() {
            return new ReadWritePolicy(this);
        } 

    } 

}
