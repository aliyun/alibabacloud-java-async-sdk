// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateKibanaWhiteIpsResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateKibanaWhiteIpsResponseBody</p>
 */
public class UpdateKibanaWhiteIpsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    private UpdateKibanaWhiteIpsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateKibanaWhiteIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        /**
         * The details of the Elasticsearch cluster.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The private IP address whitelists for access to the Kibana console of the cluster.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public UpdateKibanaWhiteIpsResponseBody build() {
            return new UpdateKibanaWhiteIpsResponseBody(this);
        } 

    } 

    public static class WhiteIpGroupList extends TeaModel {
        @NameInMap("groupName")
        private String groupName;

        @NameInMap("ips")
        private java.util.List < String > ips;

        @NameInMap("whiteIpType")
        private String whiteIpType;

        private WhiteIpGroupList(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.whiteIpType = builder.whiteIpType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroupList create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List < String > getIps() {
            return this.ips;
        }

        /**
         * @return whiteIpType
         */
        public String getWhiteIpType() {
            return this.whiteIpType;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List < String > ips; 
            private String whiteIpType; 

            /**
             * The IP addresses in the whitelist.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The IP addresses in the whitelist.
             */
            public Builder ips(java.util.List < String > ips) {
                this.ips = ips;
                return this;
            }

            /**
             * whiteIpType.
             */
            public Builder whiteIpType(String whiteIpType) {
                this.whiteIpType = whiteIpType;
                return this;
            }

            public WhiteIpGroupList build() {
                return new WhiteIpGroupList(this);
            } 

        } 

    }
    public static class NetworkConfig extends TeaModel {
        @NameInMap("type")
        private String type;

        @NameInMap("vpcId")
        private String vpcId;

        @NameInMap("vsArea")
        private String vsArea;

        @NameInMap("vswitchId")
        private String vswitchId;

        @NameInMap("whiteIpGroupList")
        private java.util.List < WhiteIpGroupList> whiteIpGroupList;

        private NetworkConfig(Builder builder) {
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.vsArea = builder.vsArea;
            this.vswitchId = builder.vswitchId;
            this.whiteIpGroupList = builder.whiteIpGroupList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NetworkConfig create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vsArea
         */
        public String getVsArea() {
            return this.vsArea;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        /**
         * @return whiteIpGroupList
         */
        public java.util.List < WhiteIpGroupList> getWhiteIpGroupList() {
            return this.whiteIpGroupList;
        }

        public static final class Builder {
            private String type; 
            private String vpcId; 
            private String vsArea; 
            private String vswitchId; 
            private java.util.List < WhiteIpGroupList> whiteIpGroupList; 

            /**
             * The IP address whitelists.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The ID of the vSwitch.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The network type.
             */
            public Builder vsArea(String vsArea) {
                this.vsArea = vsArea;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * The IP address whitelists.
             */
            public Builder whiteIpGroupList(java.util.List < WhiteIpGroupList> whiteIpGroupList) {
                this.whiteIpGroupList = whiteIpGroupList;
                return this;
            }

            public NetworkConfig build() {
                return new NetworkConfig(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("kibanaIPWhitelist")
        private java.util.List < String > kibanaIPWhitelist;

        @NameInMap("kibanaPrivateIPWhitelist")
        private java.util.List < String > kibanaPrivateIPWhitelist;

        @NameInMap("networkConfig")
        private NetworkConfig networkConfig;

        private Result(Builder builder) {
            this.kibanaIPWhitelist = builder.kibanaIPWhitelist;
            this.kibanaPrivateIPWhitelist = builder.kibanaPrivateIPWhitelist;
            this.networkConfig = builder.networkConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return kibanaIPWhitelist
         */
        public java.util.List < String > getKibanaIPWhitelist() {
            return this.kibanaIPWhitelist;
        }

        /**
         * @return kibanaPrivateIPWhitelist
         */
        public java.util.List < String > getKibanaPrivateIPWhitelist() {
            return this.kibanaPrivateIPWhitelist;
        }

        /**
         * @return networkConfig
         */
        public NetworkConfig getNetworkConfig() {
            return this.networkConfig;
        }

        public static final class Builder {
            private java.util.List < String > kibanaIPWhitelist; 
            private java.util.List < String > kibanaPrivateIPWhitelist; 
            private NetworkConfig networkConfig; 

            /**
             * The public IP address whitelists for access to the Kibana console of the cluster.
             */
            public Builder kibanaIPWhitelist(java.util.List < String > kibanaIPWhitelist) {
                this.kibanaIPWhitelist = kibanaIPWhitelist;
                return this;
            }

            /**
             * The private IP address whitelists for access to the Kibana console of the cluster.
             */
            public Builder kibanaPrivateIPWhitelist(java.util.List < String > kibanaPrivateIPWhitelist) {
                this.kibanaPrivateIPWhitelist = kibanaPrivateIPWhitelist;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder networkConfig(NetworkConfig networkConfig) {
                this.networkConfig = networkConfig;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
