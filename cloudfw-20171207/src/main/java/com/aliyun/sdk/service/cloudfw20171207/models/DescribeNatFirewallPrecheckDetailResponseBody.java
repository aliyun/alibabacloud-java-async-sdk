// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeNatFirewallPrecheckDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNatFirewallPrecheckDetailResponseBody</p>
 */
public class DescribeNatFirewallPrecheckDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsFound")
    private Boolean isFound;

    @com.aliyun.core.annotation.NameInMap("PrecheckDetail")
    private PrecheckDetail precheckDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNatFirewallPrecheckDetailResponseBody(Builder builder) {
        this.isFound = builder.isFound;
        this.precheckDetail = builder.precheckDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNatFirewallPrecheckDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isFound
     */
    public Boolean getIsFound() {
        return this.isFound;
    }

    /**
     * @return precheckDetail
     */
    public PrecheckDetail getPrecheckDetail() {
        return this.precheckDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean isFound; 
        private PrecheckDetail precheckDetail; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNatFirewallPrecheckDetailResponseBody model) {
            this.isFound = model.isFound;
            this.precheckDetail = model.precheckDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether a task exists.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isFound(Boolean isFound) {
            this.isFound = isFound;
            return this;
        }

        /**
         * <p>The details of the precheck.</p>
         */
        public Builder precheckDetail(PrecheckDetail precheckDetail) {
            this.precheckDetail = precheckDetail;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>99A65AA0-C5B5-5092-BFCF-8111B436****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNatFirewallPrecheckDetailResponseBody build() {
            return new DescribeNatFirewallPrecheckDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNatFirewallPrecheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallPrecheckDetailResponseBody</p>
     */
    public static class PrecheckEntities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private PrecheckEntities(Builder builder) {
            this.info = builder.info;
            this.name = builder.name;
            this.status = builder.status;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckEntities create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String info; 
            private String name; 
            private String status; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(PrecheckEntities model) {
                this.info = model.info;
                this.name = model.name;
                this.status = model.status;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The information about the failed precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>VPC Firewall Quota Full</p>
             */
            public Builder info(String info) {
                this.info = info;
                return this;
            }

            /**
             * <p>The name of the precheck item.</p>
             * 
             * <strong>example:</strong>
             * <p>Precheck test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of each precheck item. Valid values:</p>
             * <ul>
             * <li><p><strong>running</strong>: The precheck is in progress.</p>
             * </li>
             * <li><p><strong>passed</strong>: The precheck is passed.</p>
             * </li>
             * <li><p><strong>failed</strong>: The precheck failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>passed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The suggested solution.</p>
             * 
             * <strong>example:</strong>
             * <p>The VPC firewall quota is full. We recommend that you increase the firewall quota</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public PrecheckEntities build() {
                return new PrecheckEntities(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatFirewallPrecheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallPrecheckDetailResponseBody</p>
     */
    public static class PrecheckEntityGroups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FailedCount")
        private Integer failedCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PrecheckEntities")
        private java.util.List<PrecheckEntities> precheckEntities;

        @com.aliyun.core.annotation.NameInMap("PrecheckEntityGroupStatus")
        private String precheckEntityGroupStatus;

        private PrecheckEntityGroups(Builder builder) {
            this.failedCount = builder.failedCount;
            this.name = builder.name;
            this.precheckEntities = builder.precheckEntities;
            this.precheckEntityGroupStatus = builder.precheckEntityGroupStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckEntityGroups create() {
            return builder().build();
        }

        /**
         * @return failedCount
         */
        public Integer getFailedCount() {
            return this.failedCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return precheckEntities
         */
        public java.util.List<PrecheckEntities> getPrecheckEntities() {
            return this.precheckEntities;
        }

        /**
         * @return precheckEntityGroupStatus
         */
        public String getPrecheckEntityGroupStatus() {
            return this.precheckEntityGroupStatus;
        }

        public static final class Builder {
            private Integer failedCount; 
            private String name; 
            private java.util.List<PrecheckEntities> precheckEntities; 
            private String precheckEntityGroupStatus; 

            private Builder() {
            } 

            private Builder(PrecheckEntityGroups model) {
                this.failedCount = model.failedCount;
                this.name = model.name;
                this.precheckEntities = model.precheckEntities;
                this.precheckEntityGroupStatus = model.precheckEntityGroupStatus;
            } 

            /**
             * <p>The number of failed precheck items.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder failedCount(Integer failedCount) {
                this.failedCount = failedCount;
                return this;
            }

            /**
             * <p>The name of the precheck instance.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The execution status of each precheck item.</p>
             */
            public Builder precheckEntities(java.util.List<PrecheckEntities> precheckEntities) {
                this.precheckEntities = precheckEntities;
                return this;
            }

            /**
             * <p>The status of the precheck. Valid values:</p>
             * <ul>
             * <li><p><strong>running</strong></p>
             * </li>
             * <li><p><strong>passed</strong></p>
             * </li>
             * <li><p><strong>failed</strong></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder precheckEntityGroupStatus(String precheckEntityGroupStatus) {
                this.precheckEntityGroupStatus = precheckEntityGroupStatus;
                return this;
            }

            public PrecheckEntityGroups build() {
                return new PrecheckEntityGroups(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeNatFirewallPrecheckDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNatFirewallPrecheckDetailResponseBody</p>
     */
    public static class PrecheckDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FirewallId")
        private String firewallId;

        @com.aliyun.core.annotation.NameInMap("NetworkInstanceId")
        private String networkInstanceId;

        @com.aliyun.core.annotation.NameInMap("PrecheckEntityGroups")
        private java.util.List<PrecheckEntityGroups> precheckEntityGroups;

        @com.aliyun.core.annotation.NameInMap("PrecheckStatus")
        private String precheckStatus;

        @com.aliyun.core.annotation.NameInMap("PrecheckTimestamp")
        private String precheckTimestamp;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        private PrecheckDetail(Builder builder) {
            this.firewallId = builder.firewallId;
            this.networkInstanceId = builder.networkInstanceId;
            this.precheckEntityGroups = builder.precheckEntityGroups;
            this.precheckStatus = builder.precheckStatus;
            this.precheckTimestamp = builder.precheckTimestamp;
            this.regionNo = builder.regionNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrecheckDetail create() {
            return builder().build();
        }

        /**
         * @return firewallId
         */
        public String getFirewallId() {
            return this.firewallId;
        }

        /**
         * @return networkInstanceId
         */
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        /**
         * @return precheckEntityGroups
         */
        public java.util.List<PrecheckEntityGroups> getPrecheckEntityGroups() {
            return this.precheckEntityGroups;
        }

        /**
         * @return precheckStatus
         */
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        /**
         * @return precheckTimestamp
         */
        public String getPrecheckTimestamp() {
            return this.precheckTimestamp;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        public static final class Builder {
            private String firewallId; 
            private String networkInstanceId; 
            private java.util.List<PrecheckEntityGroups> precheckEntityGroups; 
            private String precheckStatus; 
            private String precheckTimestamp; 
            private String regionNo; 

            private Builder() {
            } 

            private Builder(PrecheckDetail model) {
                this.firewallId = model.firewallId;
                this.networkInstanceId = model.networkInstanceId;
                this.precheckEntityGroups = model.precheckEntityGroups;
                this.precheckStatus = model.precheckStatus;
                this.precheckTimestamp = model.precheckTimestamp;
                this.regionNo = model.regionNo;
            } 

            /**
             * <p>The ID of the firewall instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vfw-tr-7a9c8901ed394****</p>
             */
            public Builder firewallId(String firewallId) {
                this.firewallId = firewallId;
                return this;
            }

            /**
             * <p>The ID of the network instance.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-m5emh0w6v2e15****</p>
             */
            public Builder networkInstanceId(String networkInstanceId) {
                this.networkInstanceId = networkInstanceId;
                return this;
            }

            /**
             * <p>The list of precheck item groups.</p>
             */
            public Builder precheckEntityGroups(java.util.List<PrecheckEntityGroups> precheckEntityGroups) {
                this.precheckEntityGroups = precheckEntityGroups;
                return this;
            }

            /**
             * <p>The status of the precheck. Valid values:</p>
             * <ul>
             * <li><p><strong>running</strong>: The precheck is in progress.</p>
             * </li>
             * <li><p><strong>passed</strong>: The precheck is passed.</p>
             * </li>
             * <li><p><strong>failed</strong>: The precheck failed.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder precheckStatus(String precheckStatus) {
                this.precheckStatus = precheckStatus;
                return this;
            }

            /**
             * <p>The timestamp of the precheck.</p>
             * 
             * <strong>example:</strong>
             * <p>1715136000</p>
             */
            public Builder precheckTimestamp(String precheckTimestamp) {
                this.precheckTimestamp = precheckTimestamp;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            public PrecheckDetail build() {
                return new PrecheckDetail(this);
            } 

        } 

    }
}
