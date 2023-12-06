// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProductDeploymentResponseBody} extends {@link TeaModel}
 *
 * <p>GetProductDeploymentResponseBody</p>
 */
public class GetProductDeploymentResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetProductDeploymentResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProductDeploymentResponseBody create() {
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

        public GetProductDeploymentResponseBody build() {
            return new GetProductDeploymentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("envParams")
        private String envParams;

        @NameInMap("envUID")
        private String envUID;

        @NameInMap("status")
        private String status;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.envParams = builder.envParams;
            this.envUID = builder.envUID;
            this.status = builder.status;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return envParams
         */
        public String getEnvParams() {
            return this.envParams;
        }

        /**
         * @return envUID
         */
        public String getEnvUID() {
            return this.envUID;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String envParams; 
            private String envUID; 
            private String status; 
            private String uid; 

            /**
             * envParams.
             */
            public Builder envParams(String envParams) {
                this.envParams = envParams;
                return this;
            }

            /**
             * envUID.
             */
            public Builder envUID(String envUID) {
                this.envUID = envUID;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
