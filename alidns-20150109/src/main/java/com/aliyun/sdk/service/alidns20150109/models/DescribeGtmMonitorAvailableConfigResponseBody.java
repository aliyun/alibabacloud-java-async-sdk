// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmMonitorAvailableConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGtmMonitorAvailableConfigResponseBody</p>
 */
public class DescribeGtmMonitorAvailableConfigResponseBody extends TeaModel {
    @NameInMap("IspCityNodes")
    private IspCityNodes ispCityNodes;

    @NameInMap("RequestId")
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
         * IspCityNodes.
         */
        public Builder ispCityNodes(IspCityNodes ispCityNodes) {
            this.ispCityNodes = ispCityNodes;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeGtmMonitorAvailableConfigResponseBody build() {
            return new DescribeGtmMonitorAvailableConfigResponseBody(this);
        } 

    } 

    public static class IspCityNode extends TeaModel {
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

        @NameInMap("IspCode")
        private String ispCode;

        @NameInMap("IspName")
        private String ispName;

        @NameInMap("Mainland")
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
             * Mainland.
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
    public static class IspCityNodes extends TeaModel {
        @NameInMap("IspCityNode")
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
