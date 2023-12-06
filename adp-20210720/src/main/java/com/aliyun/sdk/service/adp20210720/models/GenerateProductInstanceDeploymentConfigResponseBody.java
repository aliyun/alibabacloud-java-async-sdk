// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateProductInstanceDeploymentConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateProductInstanceDeploymentConfigResponseBody</p>
 */
public class GenerateProductInstanceDeploymentConfigResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GenerateProductInstanceDeploymentConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateProductInstanceDeploymentConfigResponseBody create() {
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

        public GenerateProductInstanceDeploymentConfigResponseBody build() {
            return new GenerateProductInstanceDeploymentConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("packageConfig")
        private String packageConfig;

        private Data(Builder builder) {
            this.packageConfig = builder.packageConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return packageConfig
         */
        public String getPackageConfig() {
            return this.packageConfig;
        }

        public static final class Builder {
            private String packageConfig; 

            /**
             * packageConfig.
             */
            public Builder packageConfig(String packageConfig) {
                this.packageConfig = packageConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
