// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVSwitchesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVSwitchesResponseBody</p>
 */
public class DescribeVSwitchesResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    @Validation(required = true)
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("VSwitches")
    private java.util.List < VSwitches> vSwitches;

    private DescribeVSwitchesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vSwitches = builder.vSwitches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVSwitchesResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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

    /**
     * @return vSwitches
     */
    public java.util.List < VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < VSwitches> vSwitches; 

        /**
         * The maximum number of entries returned.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. If NextToken is empty, no next page exists.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of vSwitches that are deployed in the VPC in the region. This parameter is optional and is not returned by default.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * The available vSwitches.
         */
        public Builder vSwitches(java.util.List < VSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        public DescribeVSwitchesResponseBody build() {
            return new DescribeVSwitchesResponseBody(this);
        } 

    } 

    public static class VSwitches extends TeaModel {
        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Status")
        private String status;

        @NameInMap("VSwitchId")
        private String vSwitchId;

        @NameInMap("VSwitchName")
        private String vSwitchName;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("ZoneId")
        private String zoneId;

        private VSwitches(Builder builder) {
            this.isDefault = builder.isDefault;
            this.status = builder.status;
            this.vSwitchId = builder.vSwitchId;
            this.vSwitchName = builder.vSwitchName;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vSwitchName
         */
        public String getVSwitchName() {
            return this.vSwitchName;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Boolean isDefault; 
            private String status; 
            private String vSwitchId; 
            private String vSwitchName; 
            private String vpcId; 
            private String zoneId; 

            /**
             * Indicates whether the vSwitch is the default vSwitch. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The state of the vSwitch. Valid values:
             * <p>
             * 
             * *   `Pending`: The vSwitch is being configured.
             * *   `Available`: The vSwitch is available.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The vSwitch ID.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * The name of the vSwitch.
             */
            public Builder vSwitchName(String vSwitchName) {
                this.vSwitchName = vSwitchName;
                return this;
            }

            /**
             * The ID of the VPC to which the vSwitch belongs.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * 交换机所属的可用区。
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
