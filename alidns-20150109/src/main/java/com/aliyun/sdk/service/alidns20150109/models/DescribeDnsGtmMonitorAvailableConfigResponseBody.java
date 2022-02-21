// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDnsGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDnsGtmMonitorAvailableConfigResponseBody</p>
 */
public class DescribeDnsGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @NameInMap("DomainIpv4IspCityNodes")
    private DomainIpv4IspCityNodes domainIpv4IspCityNodes;

    @NameInMap("DomainIpv6IspCityNodes")
    private DomainIpv6IspCityNodes domainIpv6IspCityNodes;

    @NameInMap("Ipv4IspCityNodes")
    private Ipv4IspCityNodes ipv4IspCityNodes;

    @NameInMap("Ipv6IspCityNodes")
    private Ipv6IspCityNodes ipv6IspCityNodes;

    @NameInMap("RequestId")
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

        /**
         * DomainIpv4IspCityNodes.
         */
        public Builder domainIpv4IspCityNodes(DomainIpv4IspCityNodes domainIpv4IspCityNodes) {
            this.domainIpv4IspCityNodes = domainIpv4IspCityNodes;
            return this;
        }

        /**
         * DomainIpv6IspCityNodes.
         */
        public Builder domainIpv6IspCityNodes(DomainIpv6IspCityNodes domainIpv6IspCityNodes) {
            this.domainIpv6IspCityNodes = domainIpv6IspCityNodes;
            return this;
        }

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

        public DescribeDnsGtmMonitorAvailableConfigResponseBody build() {
            return new DescribeDnsGtmMonitorAvailableConfigResponseBody(this);
        } 

    } 

    public static class Ips extends TeaModel {
        @NameInMap("Ip")
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
    public static class DomainIpv4IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("Ips")
        private Ips ips;

        @NameInMap("IspCode")
        private String ispCode;

        @NameInMap("IspName")
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

            public DomainIpv4IspCityNode build() {
                return new DomainIpv4IspCityNode(this);
            } 

        } 

    }
    public static class DomainIpv4IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv4IspCityNode")
        private java.util.List < DomainIpv4IspCityNode> domainIpv4IspCityNode;

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
        public java.util.List < DomainIpv4IspCityNode> getDomainIpv4IspCityNode() {
            return this.domainIpv4IspCityNode;
        }

        public static final class Builder {
            private java.util.List < DomainIpv4IspCityNode> domainIpv4IspCityNode; 

            /**
             * DomainIpv4IspCityNode.
             */
            public Builder domainIpv4IspCityNode(java.util.List < DomainIpv4IspCityNode> domainIpv4IspCityNode) {
                this.domainIpv4IspCityNode = domainIpv4IspCityNode;
                return this;
            }

            public DomainIpv4IspCityNodes build() {
                return new DomainIpv4IspCityNodes(this);
            } 

        } 

    }
    public static class DomainIpv6IspCityNodeIps extends TeaModel {
        @NameInMap("ip")
        private java.util.List < String > ip;

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
        public java.util.List < String > getIp() {
            return this.ip;
        }

        public static final class Builder {
            private java.util.List < String > ip; 

            /**
             * ip.
             */
            public Builder ip(java.util.List < String > ip) {
                this.ip = ip;
                return this;
            }

            public DomainIpv6IspCityNodeIps build() {
                return new DomainIpv6IspCityNodeIps(this);
            } 

        } 

    }
    public static class DomainIpv6IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("Ips")
        private DomainIpv6IspCityNodeIps ips;

        @NameInMap("IspCode")
        private String ispCode;

        @NameInMap("IspName")
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
            public Builder ips(DomainIpv6IspCityNodeIps ips) {
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

            public DomainIpv6IspCityNode build() {
                return new DomainIpv6IspCityNode(this);
            } 

        } 

    }
    public static class DomainIpv6IspCityNodes extends TeaModel {
        @NameInMap("DomainIpv6IspCityNode")
        private java.util.List < DomainIpv6IspCityNode> domainIpv6IspCityNode;

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
        public java.util.List < DomainIpv6IspCityNode> getDomainIpv6IspCityNode() {
            return this.domainIpv6IspCityNode;
        }

        public static final class Builder {
            private java.util.List < DomainIpv6IspCityNode> domainIpv6IspCityNode; 

            /**
             * DomainIpv6IspCityNode.
             */
            public Builder domainIpv6IspCityNode(java.util.List < DomainIpv6IspCityNode> domainIpv6IspCityNode) {
                this.domainIpv6IspCityNode = domainIpv6IspCityNode;
                return this;
            }

            public DomainIpv6IspCityNodes build() {
                return new DomainIpv6IspCityNodes(this);
            } 

        } 

    }
    public static class Ipv4IspCityNodeIps extends TeaModel {
        @NameInMap("Ip")
        private java.util.List < String > ip;

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

            public Ipv4IspCityNodeIps build() {
                return new Ipv4IspCityNodeIps(this);
            } 

        } 

    }
    public static class Ipv4IspCityNode extends TeaModel {
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("Ips")
        private Ipv4IspCityNodeIps ips;

        @NameInMap("IspCode")
        private String ispCode;

        @NameInMap("IspName")
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
            public Builder ips(Ipv4IspCityNodeIps ips) {
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

            public Ipv4IspCityNode build() {
                return new Ipv4IspCityNode(this);
            } 

        } 

    }
    public static class Ipv4IspCityNodes extends TeaModel {
        @NameInMap("Ipv4IspCityNode")
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
        @NameInMap("Ip")
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
        @NameInMap("CityCode")
        private String cityCode;

        @NameInMap("CityName")
        private String cityName;

        @NameInMap("DefaultSelected")
        private Boolean defaultSelected;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("Ips")
        private Ipv6IspCityNodeIps ips;

        @NameInMap("IspCode")
        private String ispCode;

        @NameInMap("IspName")
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

            public Ipv6IspCityNode build() {
                return new Ipv6IspCityNode(this);
            } 

        } 

    }
    public static class Ipv6IspCityNodes extends TeaModel {
        @NameInMap("Ipv6IspCityNode")
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
