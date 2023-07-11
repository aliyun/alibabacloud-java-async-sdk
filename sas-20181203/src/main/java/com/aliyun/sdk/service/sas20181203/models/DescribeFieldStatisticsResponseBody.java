// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFieldStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFieldStatisticsResponseBody</p>
 */
public class DescribeFieldStatisticsResponseBody extends TeaModel {
    @NameInMap("GroupedFields")
    private GroupedFields groupedFields;

    @NameInMap("RequestId")
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
         * The information about the servers.
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * The information about servers that are returned.
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
        @NameInMap("AliYunInstanceCount")
        private Integer aliYunInstanceCount;

        @NameInMap("AwsInstanceCount")
        private Integer awsInstanceCount;

        @NameInMap("AzureInstanceCount")
        private Integer azureInstanceCount;

        @NameInMap("ExposedInstanceCount")
        private Integer exposedInstanceCount;

        @NameInMap("GeneralAssetCount")
        private Integer generalAssetCount;

        @NameInMap("GroupCount")
        private Integer groupCount;

        @NameInMap("HuaweiInstanceCount")
        private Integer huaweiInstanceCount;

        @NameInMap("IdcInstanceCount")
        private Integer idcInstanceCount;

        @NameInMap("ImportantAssetCount")
        private Integer importantAssetCount;

        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("InstanceSyncTaskCount")
        private Integer instanceSyncTaskCount;

        @NameInMap("NewInstanceCount")
        private Integer newInstanceCount;

        @NameInMap("NoRiskInstanceCount")
        private Integer noRiskInstanceCount;

        @NameInMap("NotRunningStatusCount")
        private Integer notRunningStatusCount;

        @NameInMap("OfflineInstanceCount")
        private Integer offlineInstanceCount;

        @NameInMap("OutMachineInstanceCount")
        private Integer outMachineInstanceCount;

        @NameInMap("PauseInstanceCount")
        private Integer pauseInstanceCount;

        @NameInMap("RegionCount")
        private Integer regionCount;

        @NameInMap("RiskInstanceCount")
        private Integer riskInstanceCount;

        @NameInMap("TencentInstanceCount")
        private Integer tencentInstanceCount;

        @NameInMap("TestAssetCount")
        private Integer testAssetCount;

        @NameInMap("TripartiteInstanceCount")
        private Integer tripartiteInstanceCount;

        @NameInMap("UnKnowStatusInstanceCount")
        private Integer unKnowStatusInstanceCount;

        @NameInMap("UnprotectedInstanceCount")
        private Integer unprotectedInstanceCount;

        @NameInMap("VpcCount")
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
             * AliYunInstanceCount.
             */
            public Builder aliYunInstanceCount(Integer aliYunInstanceCount) {
                this.aliYunInstanceCount = aliYunInstanceCount;
                return this;
            }

            /**
             * The number of third-party cloud servers.
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
             * The data returned.
             */
            public Builder exposedInstanceCount(Integer exposedInstanceCount) {
                this.exposedInstanceCount = exposedInstanceCount;
                return this;
            }

            /**
             * The number of server groups.
             */
            public Builder generalAssetCount(Integer generalAssetCount) {
                this.generalAssetCount = generalAssetCount;
                return this;
            }

            /**
             * The type of the asset to query. If no asset types are specified, all types of assets are returned. Valid values:
             * <p>
             * 
             * *   **ecs**: server
             * *   **cloud_product**: Alibaba Cloud service
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * The number of third-party cloud servers.
             */
            public Builder huaweiInstanceCount(Integer huaweiInstanceCount) {
                this.huaweiInstanceCount = huaweiInstanceCount;
                return this;
            }

            /**
             * DescribeFieldStatistics
             */
            public Builder idcInstanceCount(Integer idcInstanceCount) {
                this.idcInstanceCount = idcInstanceCount;
                return this;
            }

            /**
             * The number of assets that are at risk.
             */
            public Builder importantAssetCount(Integer importantAssetCount) {
                this.importantAssetCount = importantAssetCount;
                return this;
            }

            /**
             * The number of assets that are deployed on Alibaba Cloud.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * The number of assets whose importance is common.
             */
            public Builder instanceSyncTaskCount(Integer instanceSyncTaskCount) {
                this.instanceSyncTaskCount = instanceSyncTaskCount;
                return this;
            }

            /**
             * The number of assets whose statuses are unknown.
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
             * WB01224678
             */
            public Builder notRunningStatusCount(Integer notRunningStatusCount) {
                this.notRunningStatusCount = notRunningStatusCount;
                return this;
            }

            /**
             * The number of unprotected assets.
             */
            public Builder offlineInstanceCount(Integer offlineInstanceCount) {
                this.offlineInstanceCount = offlineInstanceCount;
                return this;
            }

            /**
             * OutMachineInstanceCount.
             */
            public Builder outMachineInstanceCount(Integer outMachineInstanceCount) {
                this.outMachineInstanceCount = outMachineInstanceCount;
                return this;
            }

            /**
             * Queries the statistics of assets that belong to your account.
             */
            public Builder pauseInstanceCount(Integer pauseInstanceCount) {
                this.pauseInstanceCount = pauseInstanceCount;
                return this;
            }

            /**
             * The number of virtual private clouds (VPCs).
             */
            public Builder regionCount(Integer regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * RiskInstanceCount.
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * The number of third-party cloud servers.
             */
            public Builder tencentInstanceCount(Integer tencentInstanceCount) {
                this.tencentInstanceCount = tencentInstanceCount;
                return this;
            }

            /**
             * The number of servers outside the cloud.
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
             * The number of servers whose Security Center agent status is Offline.
             */
            public Builder unprotectedInstanceCount(Integer unprotectedInstanceCount) {
                this.unprotectedInstanceCount = unprotectedInstanceCount;
                return this;
            }

            /**
             * The ID of the request, which is used to locate and troubleshoot issues.
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
