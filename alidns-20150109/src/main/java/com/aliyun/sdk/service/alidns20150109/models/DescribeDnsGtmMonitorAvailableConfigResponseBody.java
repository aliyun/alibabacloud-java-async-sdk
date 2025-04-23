// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
 */
public class DescribeDnsGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainIpv4IspCityNodes")
    private DomainIpv4IspCityNodes domainIpv4IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("DomainIpv6IspCityNodes")
    private DomainIpv6IspCityNodes domainIpv6IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("Ipv4IspCityNodes")
    private Ipv4IspCityNodes ipv4IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("Ipv6IspCityNodes")
    private Ipv6IspCityNodes ipv6IspCityNodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDnsGtmMonitorAvailableConfigResponseBody(Builder builder) {
        this.domainIpv4IspCityNodes = builder.domainIpv4IspCityNodes;
        this.domainIpv6IspCityNodes = builder.domainIpv6IspCityNodes;
        this.ipv4IspCityNodes = builder.ipv4IspCityNodes;
        this.ipv6IspCityNodes = builder.ipv6IspCityNodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDnsGtmMonitorAvailableConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainIpv4IspCityNodes
     */
    public DomainIpv4IspCityNodes getDomainIpv4IspCityNodes() {
        return this.domainIpv4IspCityNodes;
    }

    /**
     * @return domainIpv6IspCityNodes
     */
    public DomainIpv6IspCityNodes getDomainIpv6IspCityNodes() {
        return this.domainIpv6IspCityNodes;
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
        private DomainIpv4IspCityNodes domainIpv4IspCityNodes; 
        private DomainIpv6IspCityNodes domainIpv6IspCityNodes; 
        private Ipv4IspCityNodes ipv4IspCityNodes; 
        private Ipv6IspCityNodes ipv6IspCityNodes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeDnsGtmMonitorAvailableConfigResponseBody model) {
            this.domainIpv4IspCityNodes = model.domainIpv4IspCityNodes;
            this.domainIpv6IspCityNodes = model.domainIpv6IspCityNodes;
            this.ipv4IspCityNodes = model.ipv4IspCityNodes;
            this.ipv6IspCityNodes = model.ipv6IspCityNodes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The nodes that perform health checks on domain names that use public IPv4 addresses.</p>
         */
        public Builder domainIpv4IspCityNodes(DomainIpv4IspCityNodes domainIpv4IspCityNodes) {
            this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
            return this;
        }

        /**
         * <p>The nodes that perform health checks on domain names that use public IPv6 addresses.</p>
         */
        public Builder domainIpv6IspCityNodes(DomainIpv6IspCityNodes domainIpv6IspCityNodes) {
            this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
            return this;
        }

        /**
         * <p>The nodes that perform health checks on public IPv4 addresses.</p>
         */
        public Builder ipv4IspCityNodes(Ipv4IspCityNodes ipv4IspCityNodes) {
            this.ipv4IspCityNodes = ipv4IspCityNodes;
            return this;
        }

        /**
         * <p>The nodes that perform health checks on public IPv6 addresses.</p>
         */
        public Builder ipv6IspCityNodes(Ipv6IspCityNodes ipv6IspCityNodes) {
            this.ipv6IspCityNodes = ipv6IspCityNodes;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDnsGtmMonitorAvailableConfigResponseBody build() {
            return new DescribeDnsGtmMonitorAvailableConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ips extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

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
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            private Builder() {
            } 

            private Builder(Ips model) {
                this.ip = model.ip;
            } 

            /**
             * Ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public Ips build() {
                return new Ips(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class DomainIpv4IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

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

        private DomainIpv4IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainIpv4IspCityNode create() {
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

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private Ips ips; 
            private String ispCode; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(DomainIpv4IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.defaultSelected = model.defaultSelected;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.ips = model.ips;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangjiakou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>Indicates whether the health check node is selected by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * <p>The name of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP Nodes</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the node group. Valid values:</p>
             * <ul>
             * <li>BGP: BGP node</li>
             * <li>OVERSEAS: node outside the Chinese mainland</li>
             * <li>ISP: ISP node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The IP addresses of the health check nodes.</p>
             */
            public Builder ips(Ips ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The ISP code.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public DomainIpv4IspCityNode build() {
                return new DomainIpv4IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class DomainIpv4IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainIpv4IspCityNode")
        private java.util.List<DomainIpv4IspCityNode> domainIpv4IspCityNode;

        private DomainIpv4IspCityNodes(Builder builder) {
            this.domainIpv4IspCityNode = builder.domainIpv4IspCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainIpv4IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return domainIpv4IspCityNode
         */
        public java.util.List<DomainIpv4IspCityNode> getDomainIpv4IspCityNode() {
            return this.domainIpv4IspCityNode;
        }

        public static final class Builder {
            private java.util.List<DomainIpv4IspCityNode> domainIpv4IspCityNode; 

            private Builder() {
            } 

            private Builder(DomainIpv4IspCityNodes model) {
                this.domainIpv4IspCityNode = model.domainIpv4IspCityNode;
            } 

            /**
             * DomainIpv4IspCityNode.
             */
            public Builder domainIpv4IspCityNode(java.util.List<DomainIpv4IspCityNode> domainIpv4IspCityNode) {
                this.domainIpv4IspCityNode = domainIpv4IspCityNode;
                return this;
            }

            public DomainIpv4IspCityNodes build() {
                return new DomainIpv4IspCityNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class DomainIpv6IspCityNodeIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ip")
        private java.util.List<String> ip;

        private DomainIpv6IspCityNodeIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainIpv6IspCityNodeIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            private Builder() {
            } 

            private Builder(DomainIpv6IspCityNodeIps model) {
                this.ip = model.ip;
            } 

            /**
             * ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public DomainIpv6IspCityNodeIps build() {
                return new DomainIpv6IspCityNodeIps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class DomainIpv6IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private DomainIpv6IspCityNodeIps ips;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        private DomainIpv6IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainIpv6IspCityNode create() {
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
        public DomainIpv6IspCityNodeIps getIps() {
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

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private DomainIpv6IspCityNodeIps ips; 
            private String ispCode; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(DomainIpv6IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.defaultSelected = model.defaultSelected;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.ips = model.ips;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangjiakou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>Indicates whether the health check node is selected by default.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * <p>The name of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP Nodes</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the node group. Valid values:</p>
             * <ul>
             * <li>BGP: BGP node</li>
             * <li>OVERSEAS: node outside the Chinese mainland</li>
             * <li>ISP: ISP node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>This parameter is not returned.</p>
             */
            public Builder ips(DomainIpv6IspCityNodeIps ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The ISP code.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public DomainIpv6IspCityNode build() {
                return new DomainIpv6IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class DomainIpv6IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainIpv6IspCityNode")
        private java.util.List<DomainIpv6IspCityNode> domainIpv6IspCityNode;

        private DomainIpv6IspCityNodes(Builder builder) {
            this.domainIpv6IspCityNode = builder.domainIpv6IspCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainIpv6IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return domainIpv6IspCityNode
         */
        public java.util.List<DomainIpv6IspCityNode> getDomainIpv6IspCityNode() {
            return this.domainIpv6IspCityNode;
        }

        public static final class Builder {
            private java.util.List<DomainIpv6IspCityNode> domainIpv6IspCityNode; 

            private Builder() {
            } 

            private Builder(DomainIpv6IspCityNodes model) {
                this.domainIpv6IspCityNode = model.domainIpv6IspCityNode;
            } 

            /**
             * DomainIpv6IspCityNode.
             */
            public Builder domainIpv6IspCityNode(java.util.List<DomainIpv6IspCityNode> domainIpv6IspCityNode) {
                this.domainIpv6IspCityNode = domainIpv6IspCityNode;
                return this;
            }

            public DomainIpv6IspCityNodes build() {
                return new DomainIpv6IspCityNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv4IspCityNodeIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

        private Ipv4IspCityNodeIps(Builder builder) {
            this.ip = builder.ip;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ipv4IspCityNodeIps create() {
            return builder().build();
        }

        /**
         * @return ip
         */
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            private Builder() {
            } 

            private Builder(Ipv4IspCityNodeIps model) {
                this.ip = model.ip;
            } 

            /**
             * Ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public Ipv4IspCityNodeIps build() {
                return new Ipv4IspCityNodeIps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv4IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

        @com.aliyun.core.annotation.NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("GroupType")
        private String groupType;

        @com.aliyun.core.annotation.NameInMap("Ips")
        private Ipv4IspCityNodeIps ips;

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        private Ipv4IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
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
        public Ipv4IspCityNodeIps getIps() {
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

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private Ipv4IspCityNodeIps ips; 
            private String ispCode; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(Ipv4IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.defaultSelected = model.defaultSelected;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.ips = model.ips;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangjiakou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>Indicates whether the health check node is selected by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * <p>The name of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP Nodes</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the node group. Valid values:</p>
             * <ul>
             * <li>BGP: Border Gateway Protocol (BGP) node</li>
             * <li>OVERSEAS: node outside the Chinese mainland</li>
             * <li>ISP: ISP node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The IP addresses of the health check nodes.</p>
             */
            public Builder ips(Ipv4IspCityNodeIps ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The Internet service provider (ISP) code.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public Ipv4IspCityNode build() {
                return new Ipv4IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv4IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv4IspCityNode")
        private java.util.List<Ipv4IspCityNode> ipv4IspCityNode;

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
        public java.util.List<Ipv4IspCityNode> getIpv4IspCityNode() {
            return this.ipv4IspCityNode;
        }

        public static final class Builder {
            private java.util.List<Ipv4IspCityNode> ipv4IspCityNode; 

            private Builder() {
            } 

            private Builder(Ipv4IspCityNodes model) {
                this.ipv4IspCityNode = model.ipv4IspCityNode;
            } 

            /**
             * Ipv4IspCityNode.
             */
            public Builder ipv4IspCityNode(java.util.List<Ipv4IspCityNode> ipv4IspCityNode) {
                this.ipv4IspCityNode = ipv4IspCityNode;
                return this;
            }

            public Ipv4IspCityNodes build() {
                return new Ipv4IspCityNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv6IspCityNodeIps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ip")
        private java.util.List<String> ip;

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
        public java.util.List<String> getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List<String> ip; 

            private Builder() {
            } 

            private Builder(Ipv6IspCityNodeIps model) {
                this.ip = model.ip;
            } 

            /**
             * Ip.
             */
            public Builder ip(java.util.List<String> ip) {
                this.ip = ip;
                return this;
            }

            public Ipv6IspCityNodeIps build() {
                return new Ipv6IspCityNodeIps(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv6IspCityNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CityCode")
        private String cityCode;

        @com.aliyun.core.annotation.NameInMap("CityName")
        private String cityName;

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

        private Ipv6IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ips = builder.ips;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
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

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private Ipv6IspCityNodeIps ips; 
            private String ispCode; 
            private String ispName; 

            private Builder() {
            } 

            private Builder(Ipv6IspCityNode model) {
                this.cityCode = model.cityCode;
                this.cityName = model.cityName;
                this.defaultSelected = model.defaultSelected;
                this.groupName = model.groupName;
                this.groupType = model.groupType;
                this.ips = model.ips;
                this.ispCode = model.ispCode;
                this.ispName = model.ispName;
            } 

            /**
             * <p>The city code.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangjiakou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>Indicates whether the health check node is selected by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * <p>The name of the node group.</p>
             * 
             * <strong>example:</strong>
             * <p>BGP Nodes</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the node group. Valid values:</p>
             * <ul>
             * <li>BGP: BGP node</li>
             * <li>OVERSEAS: node outside the Chinese mainland</li>
             * <li>ISP: ISP node</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>BGP</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>This parameter is not returned.</p>
             */
            public Builder ips(Ipv6IspCityNodeIps ips) {
                this.ips = ips;
                return this;
            }

            /**
             * <p>The ISP code.</p>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            public Ipv6IspCityNode build() {
                return new Ipv6IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class Ipv6IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ipv6IspCityNode")
        private java.util.List<Ipv6IspCityNode> ipv6IspCityNode;

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
        public java.util.List<Ipv6IspCityNode> getIpv6IspCityNode() {
            return this.ipv6IspCityNode;
        }

        public static final class Builder {
            private java.util.List<Ipv6IspCityNode> ipv6IspCityNode; 

            private Builder() {
            } 

            private Builder(Ipv6IspCityNodes model) {
                this.ipv6IspCityNode = model.ipv6IspCityNode;
            } 

            /**
             * Ipv6IspCityNode.
             */
            public Builder ipv6IspCityNode(java.util.List<Ipv6IspCityNode> ipv6IspCityNode) {
                this.ipv6IspCityNode = ipv6IspCityNode;
                return this;
            }

            public Ipv6IspCityNodes build() {
                return new Ipv6IspCityNodes(this);
            } 

        } 

    }
}
