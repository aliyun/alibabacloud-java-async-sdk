// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFoundationReferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetFoundationReferenceResponseBody</p>
 */
public class GetFoundationReferenceResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private GetFoundationReferenceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFoundationReferenceResponseBody create() {
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

        public GetFoundationReferenceResponseBody build() {
            return new GetFoundationReferenceResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("clusterConfig")
        private String clusterConfig;

        @NameInMap("foundationVersionUID")
        private String foundationVersionUID;

        @NameInMap("uid")
        private String uid;

        private Data(Builder builder) {
            this.clusterConfig = builder.clusterConfig;
            this.foundationVersionUID = builder.foundationVersionUID;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return clusterConfig
         */
        public String getClusterConfig() {
            return this.clusterConfig;
        }

        /**
         * @return foundationVersionUID
         */
        public String getFoundationVersionUID() {
            return this.foundationVersionUID;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String clusterConfig; 
            private String foundationVersionUID; 
            private String uid; 

            /**
             * clusterConfig.
             */
            public Builder clusterConfig(String clusterConfig) {
                this.clusterConfig = clusterConfig;
                return this;
            }

            /**
             * foundationVersionUID.
             */
            public Builder foundationVersionUID(String foundationVersionUID) {
                this.foundationVersionUID = foundationVersionUID;
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
