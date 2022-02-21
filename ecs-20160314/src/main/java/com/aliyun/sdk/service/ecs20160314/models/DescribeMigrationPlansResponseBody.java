// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20160314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMigrationPlansResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMigrationPlansResponseBody</p>
 */
public class DescribeMigrationPlansResponseBody extends TeaModel {
    @NameInMap("MigrationPlanSet")
    private MigrationPlanSet migrationPlanSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeMigrationPlansResponseBody(Builder builder) {
        this.migrationPlanSet = builder.migrationPlanSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMigrationPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return migrationPlanSet
     */
    public MigrationPlanSet getMigrationPlanSet() {
        return this.migrationPlanSet;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
        private MigrationPlanSet migrationPlanSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * MigrationPlanSet.
         */
        public Builder migrationPlanSet(MigrationPlanSet migrationPlanSet) {
            this.migrationPlanSet = migrationPlanSet;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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

        public DescribeMigrationPlansResponseBody build() {
            return new DescribeMigrationPlansResponseBody(this);
        } 

    } 

    public static class SecurityGroupNos extends TeaModel {
        @NameInMap("SecurityGroupNo")
        private java.util.List < String > securityGroupNo;

        private SecurityGroupNos(Builder builder) {
            this.securityGroupNo = builder.securityGroupNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroupNos create() {
            return builder().build();
        }

        /**
         * @return securityGroupNo
         */
        public java.util.List < String > getSecurityGroupNo() {
            return this.securityGroupNo;
        }

        public static final class Builder {
            private java.util.List < String > securityGroupNo; 

            /**
             * SecurityGroupNo.
             */
            public Builder securityGroupNo(java.util.List < String > securityGroupNo) {
                this.securityGroupNo = securityGroupNo;
                return this;
            }

            public SecurityGroupNos build() {
                return new SecurityGroupNos(this);
            } 

        } 

    }
    public static class MigrationPlan extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("EnableAutoCreateVSwitch")
        private Boolean enableAutoCreateVSwitch;

        @NameInMap("EnableNetworkConnectivity")
        private Boolean enableNetworkConnectivity;

        @NameInMap("FinishInstanceCount")
        private Integer finishInstanceCount;

        @NameInMap("MigrationPlanId")
        private String migrationPlanId;

        @NameInMap("Name")
        private String name;

        @NameInMap("RemainPrivateIp")
        private Boolean remainPrivateIp;

        @NameInMap("RemainPublicMacAsPriority")
        private Boolean remainPublicMacAsPriority;

        @NameInMap("SecurityGroupNos")
        private SecurityGroupNos securityGroupNos;

        @NameInMap("Status")
        private String status;

        @NameInMap("TargetVSwitchId")
        private String targetVSwitchId;

        @NameInMap("TargetVpcId")
        private String targetVpcId;

        @NameInMap("TargetZoneId")
        private String targetZoneId;

        @NameInMap("TotalInstanceCount")
        private Integer totalInstanceCount;

        @NameInMap("Type")
        private String type;

        private MigrationPlan(Builder builder) {
            this.createTime = builder.createTime;
            this.enableAutoCreateVSwitch = builder.enableAutoCreateVSwitch;
            this.enableNetworkConnectivity = builder.enableNetworkConnectivity;
            this.finishInstanceCount = builder.finishInstanceCount;
            this.migrationPlanId = builder.migrationPlanId;
            this.name = builder.name;
            this.remainPrivateIp = builder.remainPrivateIp;
            this.remainPublicMacAsPriority = builder.remainPublicMacAsPriority;
            this.securityGroupNos = builder.securityGroupNos;
            this.status = builder.status;
            this.targetVSwitchId = builder.targetVSwitchId;
            this.targetVpcId = builder.targetVpcId;
            this.targetZoneId = builder.targetZoneId;
            this.totalInstanceCount = builder.totalInstanceCount;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationPlan create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return enableAutoCreateVSwitch
         */
        public Boolean getEnableAutoCreateVSwitch() {
            return this.enableAutoCreateVSwitch;
        }

        /**
         * @return enableNetworkConnectivity
         */
        public Boolean getEnableNetworkConnectivity() {
            return this.enableNetworkConnectivity;
        }

        /**
         * @return finishInstanceCount
         */
        public Integer getFinishInstanceCount() {
            return this.finishInstanceCount;
        }

        /**
         * @return migrationPlanId
         */
        public String getMigrationPlanId() {
            return this.migrationPlanId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return remainPrivateIp
         */
        public Boolean getRemainPrivateIp() {
            return this.remainPrivateIp;
        }

        /**
         * @return remainPublicMacAsPriority
         */
        public Boolean getRemainPublicMacAsPriority() {
            return this.remainPublicMacAsPriority;
        }

        /**
         * @return securityGroupNos
         */
        public SecurityGroupNos getSecurityGroupNos() {
            return this.securityGroupNos;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetVSwitchId
         */
        public String getTargetVSwitchId() {
            return this.targetVSwitchId;
        }

        /**
         * @return targetVpcId
         */
        public String getTargetVpcId() {
            return this.targetVpcId;
        }

        /**
         * @return targetZoneId
         */
        public String getTargetZoneId() {
            return this.targetZoneId;
        }

        /**
         * @return totalInstanceCount
         */
        public Integer getTotalInstanceCount() {
            return this.totalInstanceCount;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String createTime; 
            private Boolean enableAutoCreateVSwitch; 
            private Boolean enableNetworkConnectivity; 
            private Integer finishInstanceCount; 
            private String migrationPlanId; 
            private String name; 
            private Boolean remainPrivateIp; 
            private Boolean remainPublicMacAsPriority; 
            private SecurityGroupNos securityGroupNos; 
            private String status; 
            private String targetVSwitchId; 
            private String targetVpcId; 
            private String targetZoneId; 
            private Integer totalInstanceCount; 
            private String type; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * EnableAutoCreateVSwitch.
             */
            public Builder enableAutoCreateVSwitch(Boolean enableAutoCreateVSwitch) {
                this.enableAutoCreateVSwitch = enableAutoCreateVSwitch;
                return this;
            }

            /**
             * EnableNetworkConnectivity.
             */
            public Builder enableNetworkConnectivity(Boolean enableNetworkConnectivity) {
                this.enableNetworkConnectivity = enableNetworkConnectivity;
                return this;
            }

            /**
             * FinishInstanceCount.
             */
            public Builder finishInstanceCount(Integer finishInstanceCount) {
                this.finishInstanceCount = finishInstanceCount;
                return this;
            }

            /**
             * MigrationPlanId.
             */
            public Builder migrationPlanId(String migrationPlanId) {
                this.migrationPlanId = migrationPlanId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RemainPrivateIp.
             */
            public Builder remainPrivateIp(Boolean remainPrivateIp) {
                this.remainPrivateIp = remainPrivateIp;
                return this;
            }

            /**
             * RemainPublicMacAsPriority.
             */
            public Builder remainPublicMacAsPriority(Boolean remainPublicMacAsPriority) {
                this.remainPublicMacAsPriority = remainPublicMacAsPriority;
                return this;
            }

            /**
             * SecurityGroupNos.
             */
            public Builder securityGroupNos(SecurityGroupNos securityGroupNos) {
                this.securityGroupNos = securityGroupNos;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TargetVSwitchId.
             */
            public Builder targetVSwitchId(String targetVSwitchId) {
                this.targetVSwitchId = targetVSwitchId;
                return this;
            }

            /**
             * TargetVpcId.
             */
            public Builder targetVpcId(String targetVpcId) {
                this.targetVpcId = targetVpcId;
                return this;
            }

            /**
             * TargetZoneId.
             */
            public Builder targetZoneId(String targetZoneId) {
                this.targetZoneId = targetZoneId;
                return this;
            }

            /**
             * TotalInstanceCount.
             */
            public Builder totalInstanceCount(Integer totalInstanceCount) {
                this.totalInstanceCount = totalInstanceCount;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public MigrationPlan build() {
                return new MigrationPlan(this);
            } 

        } 

    }
    public static class MigrationPlanSet extends TeaModel {
        @NameInMap("MigrationPlan")
        private java.util.List < MigrationPlan> migrationPlan;

        private MigrationPlanSet(Builder builder) {
            this.migrationPlan = builder.migrationPlan;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MigrationPlanSet create() {
            return builder().build();
        }

        /**
         * @return migrationPlan
         */
        public java.util.List < MigrationPlan> getMigrationPlan() {
            return this.migrationPlan;
        }

        public static final class Builder {
            private java.util.List < MigrationPlan> migrationPlan; 

            /**
             * MigrationPlan.
             */
            public Builder migrationPlan(java.util.List < MigrationPlan> migrationPlan) {
                this.migrationPlan = migrationPlan;
                return this;
            }

            public MigrationPlanSet build() {
                return new MigrationPlanSet(this);
            } 

        } 

    }
}
