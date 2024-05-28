// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCloudGtmMonitorNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCloudGtmMonitorNodesResponseBody</p>
 */
public class ListCloudGtmMonitorNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Ipv4IspCityNodes")
    private Ipv4IspCityNodes ipv4IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("Ipv6IspCityNodes")
    private Ipv6IspCityNodes ipv6IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCloudGtmMonitorNodesResponseBody(Builder builder) {
        this.ipv4IspCityNodes = builder.ipv4IspCityNodes;
        this.ipv6IspCityNodes = builder.ipv6IspCityNodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCloudGtmMonitorNodesResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipv4IspCityNodes
     */
    public Ipv4IspCityNodes getIpv4IspCityNodes() {
        return this.ipv4IspCityNodes;
    }

    /**
     * @return ipv6IspCityNodes
     */
    public Ipv6IspCityNodes getIpv6IspCityNodes() {
        return this.ipv6IspCityNodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Ipv4IspCityNodes ipv4IspCityNodes; 
        private Ipv6IspCityNodes ipv6IspCityNodes; 
        private String requestId; 

        /**
         * Ipv4IspCityNodes.
         */
        public Builder ipv4IspCityNodes(Ipv4IspCityNodes ipv4IspCityNodes) {
            this.ipv4IspCityNodes = ipv4IspCityNodes;
            return this;
        }

        /**
         * Ipv6IspCityNodes.
         */
        public Builder ipv6IspCityNodes(Ipv6IspCityNodes ipv6IspCityNodes) {
            this.ipv6IspCityNodes = ipv6IspCityNodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCloudGtmMonitorNodesResponseBody build() {
            return new ListCloudGtmMonitorNodesResponseBody(this);
        } 

    } 

    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List < String > ip;

        private Ips(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ips create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    public static class Ipv4IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private Ips ips;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Ipv4IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4IspCityNode create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return defaultSelected
         */
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return ips
         */
        public Ips getIps() {
            return this.ips;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private String countryCode; 
            private String countryName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private Ips ips; 
            private String ispCode; 
            private String ispName; 
            private String nodeId; 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * DefaultSelected.
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * Ips.
             */
            public Builder ips(Ips ips) {
                this.ips = ips;
                return this;
            }

            /**
             * IspCode.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Ipv4IspCityNode build() {
                return new Ipv4IspCityNode(this);
            } 

        } 

    }
    public static class Ipv4IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4IspCityNode")
        private java.util.List < Ipv4IspCityNode> ipv4IspCityNode;

        private Ipv4IspCityNodes(Builder builder) {
            this.ipv4IspCityNode = builder.ipv4IspCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return ipv4IspCityNode
         */
        public java.util.List < Ipv4IspCityNode> getIpv4IspCityNode() {
            return this.ipv4IspCityNode;
        }

        public static final class Builder {
            private java.util.List < Ipv4IspCityNode> ipv4IspCityNode; 

            /**
             * Ipv4IspCityNode.
             */
            public Builder ipv4IspCityNode(java.util.List < Ipv4IspCityNode> ipv4IspCityNode) {
                this.ipv4IspCityNode = ipv4IspCityNode;
                return this;
            }

            public Ipv4IspCityNodes build() {
                return new Ipv4IspCityNodes(this);
            } 

        } 

    }
    public static class Ipv6IspCityNodeIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List < String > ip;

        private Ipv6IspCityNodeIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6IspCityNodeIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * Ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public Ipv6IspCityNodeIps build() {
                return new Ipv6IspCityNodeIps(this);
            } 

        } 

    }
    public static class Ipv6IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("CountryCode")
        private String countryCode;

        @com.aliyun.core.annotation.NameInMap("CountryName")
        private String countryName;

        @com.aliyun.core.annotation.NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private Ipv6IspCityNodeIps ips;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private Ipv6IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.countryCode = builder.countryCode;
            this.countryName = builder.countryName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6IspCityNode create() {
            return builder().build();
        }

        /**
         * @return cityCode
         */
        public String getCityCode() {
            return this.cityCode;
        }

        /**
         * @return cityName
         */
        public String getCityName() {
            return this.cityName;
        }

        /**
         * @return countryCode
         */
        public String getCountryCode() {
            return this.countryCode;
        }

        /**
         * @return countryName
         */
        public String getCountryName() {
            return this.countryName;
        }

        /**
         * @return defaultSelected
         */
        public Boolean getDefaultSelected() {
            return this.defaultSelected;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return groupType
         */
        public String getGroupType() {
            return this.groupType;
        }

        /**
         * @return ips
         */
        public Ipv6IspCityNodeIps getIps() {
            return this.ips;
        }

        /**
         * @return ispCode
         */
        public String getIspCode() {
            return this.ispCode;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private String countryCode; 
            private String countryName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private Ipv6IspCityNodeIps ips; 
            private String ispCode; 
            private String ispName; 
            private String nodeId; 

            /**
             * CityCode.
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * CityName.
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * CountryCode.
             */
            public Builder countryCode(String countryCode) {
                this.countryCode = countryCode;
                return this;
            }

            /**
             * CountryName.
             */
            public Builder countryName(String countryName) {
                this.countryName = countryName;
                return this;
            }

            /**
             * DefaultSelected.
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * GroupType.
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * Ips.
             */
            public Builder ips(Ipv6IspCityNodeIps ips) {
                this.ips = ips;
                return this;
            }

            /**
             * IspCode.
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public Ipv6IspCityNode build() {
                return new Ipv6IspCityNode(this);
            } 

        } 

    }
    public static class Ipv6IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6IspCityNode")
        private java.util.List < Ipv6IspCityNode> ipv6IspCityNode;

        private Ipv6IspCityNodes(Builder builder) {
            this.ipv6IspCityNode = builder.ipv6IspCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv6IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return ipv6IspCityNode
         */
        public java.util.List < Ipv6IspCityNode> getIpv6IspCityNode() {
            return this.ipv6IspCityNode;
        }

        public static final class Builder {
            private java.util.List < Ipv6IspCityNode> ipv6IspCityNode; 

            /**
             * Ipv6IspCityNode.
             */
            public Builder ipv6IspCityNode(java.util.List < Ipv6IspCityNode> ipv6IspCityNode) {
                this.ipv6IspCityNode = ipv6IspCityNode;
                return this;
            }

            public Ipv6IspCityNodes build() {
                return new Ipv6IspCityNodes(this);
            } 

        } 

    }
}
