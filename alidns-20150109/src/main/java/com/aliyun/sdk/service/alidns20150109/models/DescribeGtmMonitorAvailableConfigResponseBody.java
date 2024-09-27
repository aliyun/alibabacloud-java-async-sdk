// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmMonitorAvailableConfigResponseBody</p>
 */
public class DescribeGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IspCityNodes")
    private IspCityNodes ispCityNodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeGtmMonitorAvailableConfigResponseBody(Builder builder) {
        this.ispCityNodes = builder.ispCityNodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmMonitorAvailableConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return ispCityNodes
     */
    public IspCityNodes getIspCityNodes() {
        return this.ispCityNodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private IspCityNodes ispCityNodes; 
        private String requestId; 

        /**
         * <p>The monitored nodes.</p>
         */
        public Builder ispCityNodes(IspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6856BCF6-11D6-4D7E-AC53-FD579933522B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGtmMonitorAvailableConfigResponseBody build() {
            return new DescribeGtmMonitorAvailableConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class IspCityNode extends TeaModel {
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

        @com.aliyun.core.annotation.NameInMap("IspCode")
        private String ispCode;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("Mainland")
        private Boolean mainland;

        private IspCityNode(Builder builder) {
            this.cityCode = builder.cityCode;
            this.cityName = builder.cityName;
            this.defaultSelected = builder.defaultSelected;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.ispCode = builder.ispCode;
            this.ispName = builder.ispName;
            this.mainland = builder.mainland;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNode create() {
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
         * @return mainland
         */
        public Boolean getMainland() {
            return this.mainland;
        }

        public static final class Builder {
            private String cityCode; 
            private String cityName; 
            private Boolean defaultSelected; 
            private String groupName; 
            private String groupType; 
            private String ispCode; 
            private String ispName; 
            private Boolean mainland; 

            /**
             * <p>The code of the city where the monitored node is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>503</p>
             */
            public Builder cityCode(String cityCode) {
                this.cityCode = cityCode;
                return this;
            }

            /**
             * <p>The display name of the city where the monitored node is deployed.</p>
             * 
             * <strong>example:</strong>
             * <p>Zhangjiakou</p>
             */
            public Builder cityName(String cityName) {
                this.cityName = cityName;
                return this;
            }

            /**
             * <p>Indicates whether the monitored node is selected for the health check by default.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder defaultSelected(Boolean defaultSelected) {
                this.defaultSelected = defaultSelected;
                return this;
            }

            /**
             * <p>The name of the group to which the monitored node belongs.</p>
             * <p>Valid values: Overseas Nodes, BGP Nodes, and ISP Nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>Overseas Nodes</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The type of the group to which the monitored node belongs.</p>
             * <p>Valid values: BGP, OVERSEAS, and ISP.</p>
             * 
             * <strong>example:</strong>
             * <p>OVERSEAS</p>
             */
            public Builder groupType(String groupType) {
                this.groupType = groupType;
                return this;
            }

            /**
             * <p>The code of the Internet service provider (ISP) to which the monitored node belongs.</p>
             * <ul>
             * <li>If the value of the GroupType parameter is BGP or OVERSEAS, the value of IspCode is 465 by default.</li>
             * <li>If the value of the GroupType parameter is not BGP or OVERSEAS, valid values of IspCode are 232, 132, and 5. and is used together with CityCode.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>465</p>
             */
            public Builder ispCode(String ispCode) {
                this.ispCode = ispCode;
                return this;
            }

            /**
             * <p>The display name of the ISP to which the monitored node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>Indicates whether the monitored node is deployed in the Chinese mainland.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder mainland(Boolean mainland) {
                this.mainland = mainland;
                return this;
            }

            public IspCityNode build() {
                return new IspCityNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeGtmMonitorAvailableConfigResponseBody</p>
     */
    public static class IspCityNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("IspCityNode")
        private java.util.List < IspCityNode> ispCityNode;

        private IspCityNodes(Builder builder) {
            this.ispCityNode = builder.ispCityNode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IspCityNodes create() {
            return builder().build();
        }

        /**
         * @return ispCityNode
         */
        public java.util.List < IspCityNode> getIspCityNode() {
            return this.ispCityNode;
        }

        public static final class Builder {
            private java.util.List < IspCityNode> ispCityNode; 

            /**
             * IspCityNode.
             */
            public Builder ispCityNode(java.util.List < IspCityNode> ispCityNode) {
                this.ispCityNode = ispCityNode;
                return this;
            }

            public IspCityNodes build() {
                return new IspCityNodes(this);
            } 

        } 

    }
}
