// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentDeliveryInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnvironmentDeliveryInstanceResponseBody</p>
 */
public class GetEnvironmentDeliveryInstanceResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetEnvironmentDeliveryInstanceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentDeliveryInstanceResponseBody create() {
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

        public GetEnvironmentDeliveryInstanceResponseBody build() {
            return new GetEnvironmentDeliveryInstanceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("clusterUID")
        private String clusterUID;

        @NameInMap("deliverableConfigUID")
        private String deliverableConfigUID;

        @NameInMap("deliverableUID")
        private String deliverableUID;

        @NameInMap("envUID")
        private String envUID;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.clusterUID = builder.clusterUID;
            this.deliverableConfigUID = builder.deliverableConfigUID;
            this.deliverableUID = builder.deliverableUID;
            this.envUID = builder.envUID;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterUID
         */
        public String getClusterUID() {
            return this.clusterUID;
        }

        /**
         * @return deliverableConfigUID
         */
        public String getDeliverableConfigUID() {
            return this.deliverableConfigUID;
        }

        /**
         * @return deliverableUID
         */
        public String getDeliverableUID() {
            return this.deliverableUID;
        }

        /**
         * @return envUID
         */
        public String getEnvUID() {
            return this.envUID;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String clusterUID; 
            private String deliverableConfigUID; 
            private String deliverableUID; 
            private String envUID; 
            private String uid; 

            /**
             * clusterUID.
             */
            public Builder clusterUID(String clusterUID) {
                this.clusterUID = clusterUID;
                return this;
            }

            /**
             * deliverableConfigUID.
             */
            public Builder deliverableConfigUID(String deliverableConfigUID) {
                this.deliverableConfigUID = deliverableConfigUID;
                return this;
            }

            /**
             * deliverableUID.
             */
            public Builder deliverableUID(String deliverableUID) {
                this.deliverableUID = deliverableUID;
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
