// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeHybridCloudGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHybridCloudGroupsResponseBody</p>
 */
public class DescribeHybridCloudGroupsResponseBody extends TeaModel {
    @NameInMap("Groups")
    private java.util.List < Groups> groups;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeHybridCloudGroupsResponseBody(Builder builder) {
        this.groups = builder.groups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHybridCloudGroupsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groups
     */
    public java.util.List < Groups> getGroups() {
        return this.groups;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Groups> groups; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Groups.
         */
        public Builder groups(java.util.List < Groups> groups) {
            this.groups = groups;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeHybridCloudGroupsResponseBody build() {
            return new DescribeHybridCloudGroupsResponseBody(this);
        } 

    } 

    public static class Groups extends TeaModel {
        @NameInMap("BackSourceMark")
        private String backSourceMark;

        @NameInMap("ContinentsValue")
        private Integer continentsValue;

        @NameInMap("GroupId")
        private Integer groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("GroupType")
        private String groupType;

        @NameInMap("LoadBalanceIp")
        private String loadBalanceIp;

        @NameInMap("LocationId")
        private Long locationId;

        @NameInMap("OperatorValue")
        private Integer operatorValue;

        @NameInMap("Ports")
        private String ports;

        @NameInMap("RegionCodeValue")
        private Integer regionCodeValue;

        @NameInMap("Remark")
        private String remark;

        private Groups(Builder builder) {
            this.backSourceMark = builder.backSourceMark;
            this.continentsValue = builder.continentsValue;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.groupType = builder.groupType;
            this.loadBalanceIp = builder.loadBalanceIp;
            this.locationId = builder.locationId;
            this.operatorValue = builder.operatorValue;
            this.ports = builder.ports;
            this.regionCodeValue = builder.regionCodeValue;
            this.remark = builder.remark;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Groups create() {
            return builder().build();
        }

        /**
         * @return backSourceMark
         */
        public String getBackSourceMark() {
            return this.backSourceMark;
        }

        /**
         * @return continentsValue
         */
        public Integer getContinentsValue() {
            return this.continentsValue;
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
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
         * @return loadBalanceIp
         */
        public String getLoadBalanceIp() {
            return this.loadBalanceIp;
        }

        /**
         * @return locationId
         */
        public Long getLocationId() {
            return this.locationId;
        }

        /**
         * @return operatorValue
         */
        public Integer getOperatorValue() {
            return this.operatorValue;
        }

        /**
         * @return ports
         */
        public String getPorts() {
            return this.ports;
        }

        /**
         * @return regionCodeValue
         */
        public Integer getRegionCodeValue() {
            return this.regionCodeValue;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        public static final class Builder {
            private String backSourceMark; 
            private Integer continentsValue; 
            private Integer groupId; 
            private String groupName; 
            private String groupType; 
            private String loadBalanceIp; 
            private Long locationId; 
            private Integer operatorValue; 
            private String ports; 
            private Integer regionCodeValue; 
            private String remark; 

            /**
             * BackSourceMark.
             */
            public Builder backSourceMark(String backSourceMark) {
                this.backSourceMark = backSourceMark;
                return this;
            }

            /**
             * ContinentsValue.
             */
            public Builder continentsValue(Integer continentsValue) {
                this.continentsValue = continentsValue;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
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
             * LoadBalanceIp.
             */
            public Builder loadBalanceIp(String loadBalanceIp) {
                this.loadBalanceIp = loadBalanceIp;
                return this;
            }

            /**
             * LocationId.
             */
            public Builder locationId(Long locationId) {
                this.locationId = locationId;
                return this;
            }

            /**
             * OperatorValue.
             */
            public Builder operatorValue(Integer operatorValue) {
                this.operatorValue = operatorValue;
                return this;
            }

            /**
             * Ports.
             */
            public Builder ports(String ports) {
                this.ports = ports;
                return this;
            }

            /**
             * RegionCodeValue.
             */
            public Builder regionCodeValue(Integer regionCodeValue) {
                this.regionCodeValue = regionCodeValue;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            public Groups build() {
                return new Groups(this);
            } 

        } 

    }
}
