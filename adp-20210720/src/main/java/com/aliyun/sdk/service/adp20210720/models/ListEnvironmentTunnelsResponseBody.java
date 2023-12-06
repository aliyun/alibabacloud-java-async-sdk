// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentTunnelsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentTunnelsResponseBody</p>
 */
public class ListEnvironmentTunnelsResponseBody extends TeaModel {
    @NameInMap("code")
    private String code;

    @NameInMap("data")
    private Data data;

    @NameInMap("msg")
    private String msg;

    private ListEnvironmentTunnelsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentTunnelsResponseBody create() {
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

        public ListEnvironmentTunnelsResponseBody build() {
            return new ListEnvironmentTunnelsResponseBody(this);
        } 

    } 

    public static class TunnelConfig extends TeaModel {
        @NameInMap("hostname")
        private String hostname;

        @NameInMap("password")
        private String password;

        @NameInMap("regionId")
        private String regionId;

        @NameInMap("sshPort")
        private Integer sshPort;

        @NameInMap("username")
        private String username;

        @NameInMap("vpcId")
        private String vpcId;

        private TunnelConfig(Builder builder) {
            this.hostname = builder.hostname;
            this.password = builder.password;
            this.regionId = builder.regionId;
            this.sshPort = builder.sshPort;
            this.username = builder.username;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TunnelConfig create() {
            return builder().build();
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return sshPort
         */
        public Integer getSshPort() {
            return this.sshPort;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String hostname; 
            private String password; 
            private String regionId; 
            private Integer sshPort; 
            private String username; 
            private String vpcId; 

            /**
             * hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * regionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * sshPort.
             */
            public Builder sshPort(Integer sshPort) {
                this.sshPort = sshPort;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public TunnelConfig build() {
                return new TunnelConfig(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("tunnelConfig")
        private TunnelConfig tunnelConfig;

        @NameInMap("tunnelType")
        private String tunnelType;

        private List(Builder builder) {
            this.tunnelConfig = builder.tunnelConfig;
            this.tunnelType = builder.tunnelType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return tunnelConfig
         */
        public TunnelConfig getTunnelConfig() {
            return this.tunnelConfig;
        }

        /**
         * @return tunnelType
         */
        public String getTunnelType() {
            return this.tunnelType;
        }

        public static final class Builder {
            private TunnelConfig tunnelConfig; 
            private String tunnelType; 

            /**
             * tunnelConfig.
             */
            public Builder tunnelConfig(TunnelConfig tunnelConfig) {
                this.tunnelConfig = tunnelConfig;
                return this;
            }

            /**
             * tunnelType.
             */
            public Builder tunnelType(String tunnelType) {
                this.tunnelType = tunnelType;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("list")
        private java.util.List < List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < List> list; 

            /**
             * list.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
