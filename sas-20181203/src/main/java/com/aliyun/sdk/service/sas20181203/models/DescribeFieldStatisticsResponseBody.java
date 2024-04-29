// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFieldStatisticsResponseBody</p>
 */
public class DescribeFieldStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFieldStatisticsResponseBody(Builder builder) {
        this.groupedFields = builder.groupedFields;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFieldStatisticsResponseBody create() {
        return builder().build();
    }

    /**
     * @return groupedFields
     */
    public GroupedFields getGroupedFields() {
        return this.groupedFields;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private GroupedFields groupedFields; 
        private String requestId; 

        /**
         * The information about servers that are returned.
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFieldStatisticsResponseBody build() {
            return new DescribeFieldStatisticsResponseBody(this);
        } 

    } 

    public static class GroupedFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliYunInstanceCount")
        private Integer aliYunInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AwsInstanceCount")
        private Integer awsInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AzureInstanceCount")
        private Integer azureInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ExposedInstanceCount")
        private Integer exposedInstanceCount;

        @com.aliyun.core.annotation.NameInMap("GeneralAssetCount")
        private Integer generalAssetCount;

        @com.aliyun.core.annotation.NameInMap("GroupCount")
        private Integer groupCount;

        @com.aliyun.core.annotation.NameInMap("HuaweiInstanceCount")
        private Integer huaweiInstanceCount;

        @com.aliyun.core.annotation.NameInMap("IdcInstanceCount")
        private Integer idcInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ImportantAssetCount")
        private Integer importantAssetCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceSyncTaskCount")
        private Integer instanceSyncTaskCount;

        @com.aliyun.core.annotation.NameInMap("NewInstanceCount")
        private Integer newInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NoRiskInstanceCount")
        private Integer noRiskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NotRunningStatusCount")
        private Integer notRunningStatusCount;

        @com.aliyun.core.annotation.NameInMap("OfflineInstanceCount")
        private Integer offlineInstanceCount;

        @com.aliyun.core.annotation.NameInMap("OutMachineInstanceCount")
        private Integer outMachineInstanceCount;

        @com.aliyun.core.annotation.NameInMap("PauseInstanceCount")
        private Integer pauseInstanceCount;

        @com.aliyun.core.annotation.NameInMap("RegionCount")
        private Integer regionCount;

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCount")
        private Integer riskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("TencentInstanceCount")
        private Integer tencentInstanceCount;

        @com.aliyun.core.annotation.NameInMap("TestAssetCount")
        private Integer testAssetCount;

        @com.aliyun.core.annotation.NameInMap("TripartiteInstanceCount")
        private Integer tripartiteInstanceCount;

        @com.aliyun.core.annotation.NameInMap("UnKnowStatusInstanceCount")
        private Integer unKnowStatusInstanceCount;

        @com.aliyun.core.annotation.NameInMap("UnprotectedInstanceCount")
        private Integer unprotectedInstanceCount;

        @com.aliyun.core.annotation.NameInMap("VpcCount")
        private Integer vpcCount;

        private GroupedFields(Builder builder) {
            this.aliYunInstanceCount = builder.aliYunInstanceCount;
            this.awsInstanceCount = builder.awsInstanceCount;
            this.azureInstanceCount = builder.azureInstanceCount;
            this.exposedInstanceCount = builder.exposedInstanceCount;
            this.generalAssetCount = builder.generalAssetCount;
            this.groupCount = builder.groupCount;
            this.huaweiInstanceCount = builder.huaweiInstanceCount;
            this.idcInstanceCount = builder.idcInstanceCount;
            this.importantAssetCount = builder.importantAssetCount;
            this.instanceCount = builder.instanceCount;
            this.instanceSyncTaskCount = builder.instanceSyncTaskCount;
            this.newInstanceCount = builder.newInstanceCount;
            this.noRiskInstanceCount = builder.noRiskInstanceCount;
            this.notRunningStatusCount = builder.notRunningStatusCount;
            this.offlineInstanceCount = builder.offlineInstanceCount;
            this.outMachineInstanceCount = builder.outMachineInstanceCount;
            this.pauseInstanceCount = builder.pauseInstanceCount;
            this.regionCount = builder.regionCount;
            this.riskInstanceCount = builder.riskInstanceCount;
            this.tencentInstanceCount = builder.tencentInstanceCount;
            this.testAssetCount = builder.testAssetCount;
            this.tripartiteInstanceCount = builder.tripartiteInstanceCount;
            this.unKnowStatusInstanceCount = builder.unKnowStatusInstanceCount;
            this.unprotectedInstanceCount = builder.unprotectedInstanceCount;
            this.vpcCount = builder.vpcCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GroupedFields create() {
            return builder().build();
        }

        /**
         * @return aliYunInstanceCount
         */
        public Integer getAliYunInstanceCount() {
            return this.aliYunInstanceCount;
        }

        /**
         * @return awsInstanceCount
         */
        public Integer getAwsInstanceCount() {
            return this.awsInstanceCount;
        }

        /**
         * @return azureInstanceCount
         */
        public Integer getAzureInstanceCount() {
            return this.azureInstanceCount;
        }

        /**
         * @return exposedInstanceCount
         */
        public Integer getExposedInstanceCount() {
            return this.exposedInstanceCount;
        }

        /**
         * @return generalAssetCount
         */
        public Integer getGeneralAssetCount() {
            return this.generalAssetCount;
        }

        /**
         * @return groupCount
         */
        public Integer getGroupCount() {
            return this.groupCount;
        }

        /**
         * @return huaweiInstanceCount
         */
        public Integer getHuaweiInstanceCount() {
            return this.huaweiInstanceCount;
        }

        /**
         * @return idcInstanceCount
         */
        public Integer getIdcInstanceCount() {
            return this.idcInstanceCount;
        }

        /**
         * @return importantAssetCount
         */
        public Integer getImportantAssetCount() {
            return this.importantAssetCount;
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return instanceSyncTaskCount
         */
        public Integer getInstanceSyncTaskCount() {
            return this.instanceSyncTaskCount;
        }

        /**
         * @return newInstanceCount
         */
        public Integer getNewInstanceCount() {
            return this.newInstanceCount;
        }

        /**
         * @return noRiskInstanceCount
         */
        public Integer getNoRiskInstanceCount() {
            return this.noRiskInstanceCount;
        }

        /**
         * @return notRunningStatusCount
         */
        public Integer getNotRunningStatusCount() {
            return this.notRunningStatusCount;
        }

        /**
         * @return offlineInstanceCount
         */
        public Integer getOfflineInstanceCount() {
            return this.offlineInstanceCount;
        }

        /**
         * @return outMachineInstanceCount
         */
        public Integer getOutMachineInstanceCount() {
            return this.outMachineInstanceCount;
        }

        /**
         * @return pauseInstanceCount
         */
        public Integer getPauseInstanceCount() {
            return this.pauseInstanceCount;
        }

        /**
         * @return regionCount
         */
        public Integer getRegionCount() {
            return this.regionCount;
        }

        /**
         * @return riskInstanceCount
         */
        public Integer getRiskInstanceCount() {
            return this.riskInstanceCount;
        }

        /**
         * @return tencentInstanceCount
         */
        public Integer getTencentInstanceCount() {
            return this.tencentInstanceCount;
        }

        /**
         * @return testAssetCount
         */
        public Integer getTestAssetCount() {
            return this.testAssetCount;
        }

        /**
         * @return tripartiteInstanceCount
         */
        public Integer getTripartiteInstanceCount() {
            return this.tripartiteInstanceCount;
        }

        /**
         * @return unKnowStatusInstanceCount
         */
        public Integer getUnKnowStatusInstanceCount() {
            return this.unKnowStatusInstanceCount;
        }

        /**
         * @return unprotectedInstanceCount
         */
        public Integer getUnprotectedInstanceCount() {
            return this.unprotectedInstanceCount;
        }

        /**
         * @return vpcCount
         */
        public Integer getVpcCount() {
            return this.vpcCount;
        }

        public static final class Builder {
            private Integer aliYunInstanceCount; 
            private Integer awsInstanceCount; 
            private Integer azureInstanceCount; 
            private Integer exposedInstanceCount; 
            private Integer generalAssetCount; 
            private Integer groupCount; 
            private Integer huaweiInstanceCount; 
            private Integer idcInstanceCount; 
            private Integer importantAssetCount; 
            private Integer instanceCount; 
            private Integer instanceSyncTaskCount; 
            private Integer newInstanceCount; 
            private Integer noRiskInstanceCount; 
            private Integer notRunningStatusCount; 
            private Integer offlineInstanceCount; 
            private Integer outMachineInstanceCount; 
            private Integer pauseInstanceCount; 
            private Integer regionCount; 
            private Integer riskInstanceCount; 
            private Integer tencentInstanceCount; 
            private Integer testAssetCount; 
            private Integer tripartiteInstanceCount; 
            private Integer unKnowStatusInstanceCount; 
            private Integer unprotectedInstanceCount; 
            private Integer vpcCount; 

            /**
             * The number of assets that are deployed on Alibaba Cloud.
             */
            public Builder aliYunInstanceCount(Integer aliYunInstanceCount) {
                this.aliYunInstanceCount = aliYunInstanceCount;
                return this;
            }

            /**
             * The number of servers.
             */
            public Builder awsInstanceCount(Integer awsInstanceCount) {
                this.awsInstanceCount = awsInstanceCount;
                return this;
            }

            /**
             * The number of third-party cloud servers.
             */
            public Builder azureInstanceCount(Integer azureInstanceCount) {
                this.azureInstanceCount = azureInstanceCount;
                return this;
            }

            /**
             * The number of exposed servers.
             */
            public Builder exposedInstanceCount(Integer exposedInstanceCount) {
                this.exposedInstanceCount = exposedInstanceCount;
                return this;
            }

            /**
             * The number of assets whose importance is common.
             */
            public Builder generalAssetCount(Integer generalAssetCount) {
                this.generalAssetCount = generalAssetCount;
                return this;
            }

            /**
             * The number of server groups.
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The number of instances that are provisioned by third-party providers.
             */
            public Builder huaweiInstanceCount(Integer huaweiInstanceCount) {
                this.huaweiInstanceCount = huaweiInstanceCount;
                return this;
            }

            /**
             * The number of assets that can be protected by Security Center.
             */
            public Builder idcInstanceCount(Integer idcInstanceCount) {
                this.idcInstanceCount = idcInstanceCount;
                return this;
            }

            /**
             * The number of assets whose importance is important.
             */
            public Builder importantAssetCount(Integer importantAssetCount) {
                this.importantAssetCount = importantAssetCount;
                return this;
            }

            /**
             * The total number of assets of the specified type. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The total number of tasks for the specified type of assets. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.
             */
            public Builder instanceSyncTaskCount(Integer instanceSyncTaskCount) {
                this.instanceSyncTaskCount = instanceSyncTaskCount;
                return this;
            }

            /**
             * The number of newly added servers.
             */
            public Builder newInstanceCount(Integer newInstanceCount) {
                this.newInstanceCount = newInstanceCount;
                return this;
            }

            /**
             * The number of servers on which no risks are detected.
             */
            public Builder noRiskInstanceCount(Integer noRiskInstanceCount) {
                this.noRiskInstanceCount = noRiskInstanceCount;
                return this;
            }

            /**
             * The number of servers that are shut down.
             */
            public Builder notRunningStatusCount(Integer notRunningStatusCount) {
                this.notRunningStatusCount = notRunningStatusCount;
                return this;
            }

            /**
             * The number of servers whose Security Center agent status is Offline.
             */
            public Builder offlineInstanceCount(Integer offlineInstanceCount) {
                this.offlineInstanceCount = offlineInstanceCount;
                return this;
            }

            /**
             * The number of servers outside the cloud.
             */
            public Builder outMachineInstanceCount(Integer outMachineInstanceCount) {
                this.outMachineInstanceCount = outMachineInstanceCount;
                return this;
            }

            /**
             * The number of servers for which the Security Center agent suspends protection.
             */
            public Builder pauseInstanceCount(Integer pauseInstanceCount) {
                this.pauseInstanceCount = pauseInstanceCount;
                return this;
            }

            /**
             * The number of regions to which the servers belong.
             */
            public Builder regionCount(Integer regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * The number of assets that are at risk.
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * The total number of cloud services that are protected by Security Center.
             */
            public Builder tencentInstanceCount(Integer tencentInstanceCount) {
                this.tencentInstanceCount = tencentInstanceCount;
                return this;
            }

            /**
             * The number of assets whose importance is test.
             */
            public Builder testAssetCount(Integer testAssetCount) {
                this.testAssetCount = testAssetCount;
                return this;
            }

            /**
             * The number of simple application servers.
             */
            public Builder tripartiteInstanceCount(Integer tripartiteInstanceCount) {
                this.tripartiteInstanceCount = tripartiteInstanceCount;
                return this;
            }

            /**
             * The number of servers that are in the Unknown state.
             */
            public Builder unKnowStatusInstanceCount(Integer unKnowStatusInstanceCount) {
                this.unKnowStatusInstanceCount = unKnowStatusInstanceCount;
                return this;
            }

            /**
             * The number of unprotected assets.
             */
            public Builder unprotectedInstanceCount(Integer unprotectedInstanceCount) {
                this.unprotectedInstanceCount = unprotectedInstanceCount;
                return this;
            }

            /**
             * The number of virtual private clouds (VPCs).
             */
            public Builder vpcCount(Integer vpcCount) {
                this.vpcCount = vpcCount;
                return this;
            }

            public GroupedFields build() {
                return new GroupedFields(this);
            } 

        } 

    }
}
