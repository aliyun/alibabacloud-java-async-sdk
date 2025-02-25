// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReadWritePolicy} extends {@link TeaModel}
 *
 * <p>ReadWritePolicy</p>
 */
public class ReadWritePolicy extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("autoGeneratePk")
    private Boolean autoGeneratePk;

    @com.aliyun.core.annotation.NameInMap("writeHa")
    private Boolean writeHa;

    @com.aliyun.core.annotation.NameInMap("writePolicy")
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
         * autoGeneratePk.
         */
        public Builder autoGeneratePk(Boolean autoGeneratePk) {
            this.autoGeneratePk = autoGeneratePk;
            return this;
        }

        /**
         * writeHa.
         */
        public Builder writeHa(Boolean writeHa) {
            this.writeHa = writeHa;
            return this;
        }

        /**
         * writePolicy.
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
