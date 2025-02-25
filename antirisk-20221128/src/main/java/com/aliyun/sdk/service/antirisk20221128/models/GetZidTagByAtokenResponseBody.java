// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.antirisk20221128.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZidTagByAtokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetZidTagByAtokenResponseBody</p>
 */
public class GetZidTagByAtokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetZidTagByAtokenResponseBody(Builder builder) {
        this.msg = builder.msg;
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetZidTagByAtokenResponseBody create() {
        return builder().build();
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String msg; 
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * code
         */
        public Builder code(Long code) {
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetZidTagByAtokenResponseBody build() {
            return new GetZidTagByAtokenResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("aHook")
        private String aHook;

        @com.aliyun.core.annotation.NameInMap("debug")
        private String debug;

        @com.aliyun.core.annotation.NameInMap("doubleOpen")
        private String doubleOpen;

        @com.aliyun.core.annotation.NameInMap("javaHook")
        private String javaHook;

        @com.aliyun.core.annotation.NameInMap("nativeHook")
        private String nativeHook;

        @com.aliyun.core.annotation.NameInMap("root")
        private String root;

        @com.aliyun.core.annotation.NameInMap("simulator")
        private String simulator;

        @com.aliyun.core.annotation.NameInMap("vpnProxy")
        private String vpnProxy;

        @com.aliyun.core.annotation.NameInMap("wifiProxy")
        private String wifiProxy;

        @com.aliyun.core.annotation.NameInMap("zid")
        private String zid;

        private Data(Builder builder) {
            this.aHook = builder.aHook;
            this.debug = builder.debug;
            this.doubleOpen = builder.doubleOpen;
            this.javaHook = builder.javaHook;
            this.nativeHook = builder.nativeHook;
            this.root = builder.root;
            this.simulator = builder.simulator;
            this.vpnProxy = builder.vpnProxy;
            this.wifiProxy = builder.wifiProxy;
            this.zid = builder.zid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aHook
         */
        public String getAHook() {
            return this.aHook;
        }

        /**
         * @return debug
         */
        public String getDebug() {
            return this.debug;
        }

        /**
         * @return doubleOpen
         */
        public String getDoubleOpen() {
            return this.doubleOpen;
        }

        /**
         * @return javaHook
         */
        public String getJavaHook() {
            return this.javaHook;
        }

        /**
         * @return nativeHook
         */
        public String getNativeHook() {
            return this.nativeHook;
        }

        /**
         * @return root
         */
        public String getRoot() {
            return this.root;
        }

        /**
         * @return simulator
         */
        public String getSimulator() {
            return this.simulator;
        }

        /**
         * @return vpnProxy
         */
        public String getVpnProxy() {
            return this.vpnProxy;
        }

        /**
         * @return wifiProxy
         */
        public String getWifiProxy() {
            return this.wifiProxy;
        }

        /**
         * @return zid
         */
        public String getZid() {
            return this.zid;
        }

        public static final class Builder {
            private String aHook; 
            private String debug; 
            private String doubleOpen; 
            private String javaHook; 
            private String nativeHook; 
            private String root; 
            private String simulator; 
            private String vpnProxy; 
            private String wifiProxy; 
            private String zid; 

            /**
             * aHook
             */
            public Builder aHook(String aHook) {
                this.aHook = aHook;
                return this;
            }

            /**
             * debug.
             */
            public Builder debug(String debug) {
                this.debug = debug;
                return this;
            }

            /**
             * doubleOpen.
             */
            public Builder doubleOpen(String doubleOpen) {
                this.doubleOpen = doubleOpen;
                return this;
            }

            /**
             * javaHook
             */
            public Builder javaHook(String javaHook) {
                this.javaHook = javaHook;
                return this;
            }

            /**
             * nativeHook.
             */
            public Builder nativeHook(String nativeHook) {
                this.nativeHook = nativeHook;
                return this;
            }

            /**
             * root.
             */
            public Builder root(String root) {
                this.root = root;
                return this;
            }

            /**
             * simulator.
             */
            public Builder simulator(String simulator) {
                this.simulator = simulator;
                return this;
            }

            /**
             * vpnProxy.
             */
            public Builder vpnProxy(String vpnProxy) {
                this.vpnProxy = vpnProxy;
                return this;
            }

            /**
             * wifiProxy.
             */
            public Builder wifiProxy(String wifiProxy) {
                this.wifiProxy = wifiProxy;
                return this;
            }

            /**
             * zid.
             */
            public Builder zid(String zid) {
                this.zid = zid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
