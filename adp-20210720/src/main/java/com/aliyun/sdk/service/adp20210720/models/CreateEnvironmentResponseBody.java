// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEnvironmentResponseBody</p>
 */
public class CreateEnvironmentResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private CreateEnvironmentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String msg; 

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        public CreateEnvironmentResponseBody build() {
            return new CreateEnvironmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("environmentUID")
        private String environmentUID;

        @NameInMap("vendorConfig")
        private String vendorConfig;

        private Data(Builder builder) {
            this.environmentUID = builder.environmentUID;
            this.vendorConfig = builder.vendorConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return environmentUID
         */
        public String getEnvironmentUID() {
            return this.environmentUID;
        }

        /**
         * @return vendorConfig
         */
        public String getVendorConfig() {
            return this.vendorConfig;
        }

        public static final class Builder {
            private String environmentUID; 
            private String vendorConfig; 

            /**
             * environmentUID.
             */
            public Builder environmentUID(String environmentUID) {
                this.environmentUID = environmentUID;
                return this;
            }

            /**
             * vendorConfig.
             */
            public Builder vendorConfig(String vendorConfig) {
                this.vendorConfig = vendorConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
