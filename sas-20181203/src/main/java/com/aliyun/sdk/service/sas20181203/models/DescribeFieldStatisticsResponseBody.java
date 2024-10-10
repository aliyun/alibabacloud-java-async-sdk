// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about servers that are returned.</p>
         */
        public Builder groupedFields(GroupedFields groupedFields) {
            this.groupedFields = groupedFields;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>7E0618A9-D5EF-4220-9471-C42B5E92719F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFieldStatisticsResponseBody build() {
            return new DescribeFieldStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFieldStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeFieldStatisticsResponseBody</p>
     */
    public static class GroupedFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliYunInstanceCount")
        private Integer aliYunInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AwsInstanceCount")
        private Integer awsInstanceCount;

        @com.aliyun.core.annotation.NameInMap("AzureInstanceCount")
        private Integer azureInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ExposedInstanceCoreCount")
        private Long exposedInstanceCoreCount;

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

        @com.aliyun.core.annotation.NameInMap("InstanceCoreCount")
        private Long instanceCoreCount;

        @com.aliyun.core.annotation.NameInMap("InstanceCount")
        private Integer instanceCount;

        @com.aliyun.core.annotation.NameInMap("InstanceSyncTaskCount")
        private Integer instanceSyncTaskCount;

        @com.aliyun.core.annotation.NameInMap("NewInstanceCoreCount")
        private Long newInstanceCoreCount;

        @com.aliyun.core.annotation.NameInMap("NewInstanceCount")
        private Integer newInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NoRiskInstanceCount")
        private Integer noRiskInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NotBindMachineInstanceCount")
        private Integer notBindMachineInstanceCount;

        @com.aliyun.core.annotation.NameInMap("NotRunningStatusCoreCount")
        private Long notRunningStatusCoreCount;

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

        @com.aliyun.core.annotation.NameInMap("RiskInstanceCoreCount")
        private Long riskInstanceCoreCount;

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

        @com.aliyun.core.annotation.NameInMap("UnprotectedInstanceCoreCount")
        private Long unprotectedInstanceCoreCount;

        @com.aliyun.core.annotation.NameInMap("UnprotectedInstanceCount")
        private Integer unprotectedInstanceCount;

        @com.aliyun.core.annotation.NameInMap("VpcCount")
        private Integer vpcCount;

        private GroupedFields(Builder builder) {
            this.aliYunInstanceCount = builder.aliYunInstanceCount;
            this.awsInstanceCount = builder.awsInstanceCount;
            this.azureInstanceCount = builder.azureInstanceCount;
            this.exposedInstanceCoreCount = builder.exposedInstanceCoreCount;
            this.exposedInstanceCount = builder.exposedInstanceCount;
            this.generalAssetCount = builder.generalAssetCount;
            this.groupCount = builder.groupCount;
            this.huaweiInstanceCount = builder.huaweiInstanceCount;
            this.idcInstanceCount = builder.idcInstanceCount;
            this.importantAssetCount = builder.importantAssetCount;
            this.instanceCoreCount = builder.instanceCoreCount;
            this.instanceCount = builder.instanceCount;
            this.instanceSyncTaskCount = builder.instanceSyncTaskCount;
            this.newInstanceCoreCount = builder.newInstanceCoreCount;
            this.newInstanceCount = builder.newInstanceCount;
            this.noRiskInstanceCount = builder.noRiskInstanceCount;
            this.notBindMachineInstanceCount = builder.notBindMachineInstanceCount;
            this.notRunningStatusCoreCount = builder.notRunningStatusCoreCount;
            this.notRunningStatusCount = builder.notRunningStatusCount;
            this.offlineInstanceCount = builder.offlineInstanceCount;
            this.outMachineInstanceCount = builder.outMachineInstanceCount;
            this.pauseInstanceCount = builder.pauseInstanceCount;
            this.regionCount = builder.regionCount;
            this.riskInstanceCoreCount = builder.riskInstanceCoreCount;
            this.riskInstanceCount = builder.riskInstanceCount;
            this.tencentInstanceCount = builder.tencentInstanceCount;
            this.testAssetCount = builder.testAssetCount;
            this.tripartiteInstanceCount = builder.tripartiteInstanceCount;
            this.unKnowStatusInstanceCount = builder.unKnowStatusInstanceCount;
            this.unprotectedInstanceCoreCount = builder.unprotectedInstanceCoreCount;
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
         * @return exposedInstanceCoreCount
         */
        public Long getExposedInstanceCoreCount() {
            return this.exposedInstanceCoreCount;
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
         * @return instanceCoreCount
         */
        public Long getInstanceCoreCount() {
            return this.instanceCoreCount;
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
         * @return newInstanceCoreCount
         */
        public Long getNewInstanceCoreCount() {
            return this.newInstanceCoreCount;
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
         * @return notBindMachineInstanceCount
         */
        public Integer getNotBindMachineInstanceCount() {
            return this.notBindMachineInstanceCount;
        }

        /**
         * @return notRunningStatusCoreCount
         */
        public Long getNotRunningStatusCoreCount() {
            return this.notRunningStatusCoreCount;
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
         * @return riskInstanceCoreCount
         */
        public Long getRiskInstanceCoreCount() {
            return this.riskInstanceCoreCount;
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
         * @return unprotectedInstanceCoreCount
         */
        public Long getUnprotectedInstanceCoreCount() {
            return this.unprotectedInstanceCoreCount;
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
            private Long exposedInstanceCoreCount; 
            private Integer exposedInstanceCount; 
            private Integer generalAssetCount; 
            private Integer groupCount; 
            private Integer huaweiInstanceCount; 
            private Integer idcInstanceCount; 
            private Integer importantAssetCount; 
            private Long instanceCoreCount; 
            private Integer instanceCount; 
            private Integer instanceSyncTaskCount; 
            private Long newInstanceCoreCount; 
            private Integer newInstanceCount; 
            private Integer noRiskInstanceCount; 
            private Integer notBindMachineInstanceCount; 
            private Long notRunningStatusCoreCount; 
            private Integer notRunningStatusCount; 
            private Integer offlineInstanceCount; 
            private Integer outMachineInstanceCount; 
            private Integer pauseInstanceCount; 
            private Integer regionCount; 
            private Long riskInstanceCoreCount; 
            private Integer riskInstanceCount; 
            private Integer tencentInstanceCount; 
            private Integer testAssetCount; 
            private Integer tripartiteInstanceCount; 
            private Integer unKnowStatusInstanceCount; 
            private Long unprotectedInstanceCoreCount; 
            private Integer unprotectedInstanceCount; 
            private Integer vpcCount; 

            /**
             * <p>The number of assets that are deployed on Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder aliYunInstanceCount(Integer aliYunInstanceCount) {
                this.aliYunInstanceCount = aliYunInstanceCount;
                return this;
            }

            /**
             * <p>The number of servers.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder awsInstanceCount(Integer awsInstanceCount) {
                this.awsInstanceCount = awsInstanceCount;
                return this;
            }

            /**
             * <p>The number of third-party cloud servers.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder azureInstanceCount(Integer azureInstanceCount) {
                this.azureInstanceCount = azureInstanceCount;
                return this;
            }

            /**
             * <p>The number of cores of exposed assets.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder exposedInstanceCoreCount(Long exposedInstanceCoreCount) {
                this.exposedInstanceCoreCount = exposedInstanceCoreCount;
                return this;
            }

            /**
             * <p>The number of exposed servers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder exposedInstanceCount(Integer exposedInstanceCount) {
                this.exposedInstanceCount = exposedInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets whose importance is common.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder generalAssetCount(Integer generalAssetCount) {
                this.generalAssetCount = generalAssetCount;
                return this;
            }

            /**
             * <p>The number of server groups.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder groupCount(Integer groupCount) {
                this.groupCount = groupCount;
                return this;
            }

            /**
             * <p>The number of instances that are provisioned by third-party providers.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder huaweiInstanceCount(Integer huaweiInstanceCount) {
                this.huaweiInstanceCount = huaweiInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets that can be protected by Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder idcInstanceCount(Integer idcInstanceCount) {
                this.idcInstanceCount = idcInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets whose importance is important.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder importantAssetCount(Integer importantAssetCount) {
                this.importantAssetCount = importantAssetCount;
                return this;
            }

            /**
             * <p>The number of cores of assets in the specified asset type. If the asset type is not specified, the value of this parameter indicates the total number of cores of servers and Alibaba Cloud services within your account.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder instanceCoreCount(Long instanceCoreCount) {
                this.instanceCoreCount = instanceCoreCount;
                return this;
            }

            /**
             * <p>The total number of assets of the specified type. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * <p>The total number of tasks for the specified type of assets. If no asset types are specified, this parameter indicates the total number of all servers and Alibaba Cloud services within your account.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder instanceSyncTaskCount(Integer instanceSyncTaskCount) {
                this.instanceSyncTaskCount = instanceSyncTaskCount;
                return this;
            }

            /**
             * <p>The number of cores of new servers.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder newInstanceCoreCount(Long newInstanceCoreCount) {
                this.newInstanceCoreCount = newInstanceCoreCount;
                return this;
            }

            /**
             * <p>The number of newly added servers.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder newInstanceCount(Integer newInstanceCount) {
                this.newInstanceCount = newInstanceCount;
                return this;
            }

            /**
             * <p>The number of servers on which no risks are detected.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder noRiskInstanceCount(Integer noRiskInstanceCount) {
                this.noRiskInstanceCount = noRiskInstanceCount;
                return this;
            }

            /**
             * NotBindMachineInstanceCount.
             */
            public Builder notBindMachineInstanceCount(Integer notBindMachineInstanceCount) {
                this.notBindMachineInstanceCount = notBindMachineInstanceCount;
                return this;
            }

            /**
             * <p>The number of cores of servers that are not started.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder notRunningStatusCoreCount(Long notRunningStatusCoreCount) {
                this.notRunningStatusCoreCount = notRunningStatusCoreCount;
                return this;
            }

            /**
             * <p>The number of servers that are shut down.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder notRunningStatusCount(Integer notRunningStatusCount) {
                this.notRunningStatusCount = notRunningStatusCount;
                return this;
            }

            /**
             * <p>The number of servers whose Security Center agent status is Offline.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder offlineInstanceCount(Integer offlineInstanceCount) {
                this.offlineInstanceCount = offlineInstanceCount;
                return this;
            }

            /**
             * <p>The number of servers outside the cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder outMachineInstanceCount(Integer outMachineInstanceCount) {
                this.outMachineInstanceCount = outMachineInstanceCount;
                return this;
            }

            /**
             * <p>The number of servers for which the Security Center agent suspends protection.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pauseInstanceCount(Integer pauseInstanceCount) {
                this.pauseInstanceCount = pauseInstanceCount;
                return this;
            }

            /**
             * <p>The number of regions to which the servers belong.</p>
             * 
             * <strong>example:</strong>
             * <p>11</p>
             */
            public Builder regionCount(Integer regionCount) {
                this.regionCount = regionCount;
                return this;
            }

            /**
             * <p>The number of cores of vulnerable assets.</p>
             * 
             * <strong>example:</strong>
             * <p>201</p>
             */
            public Builder riskInstanceCoreCount(Long riskInstanceCoreCount) {
                this.riskInstanceCoreCount = riskInstanceCoreCount;
                return this;
            }

            /**
             * <p>The number of assets that are at risk.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder riskInstanceCount(Integer riskInstanceCount) {
                this.riskInstanceCount = riskInstanceCount;
                return this;
            }

            /**
             * <p>The total number of cloud services that are protected by Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder tencentInstanceCount(Integer tencentInstanceCount) {
                this.tencentInstanceCount = tencentInstanceCount;
                return this;
            }

            /**
             * <p>The number of assets whose importance is test.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder testAssetCount(Integer testAssetCount) {
                this.testAssetCount = testAssetCount;
                return this;
            }

            /**
             * <p>The number of simple application servers.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder tripartiteInstanceCount(Integer tripartiteInstanceCount) {
                this.tripartiteInstanceCount = tripartiteInstanceCount;
                return this;
            }

            /**
             * <p>The number of servers that are in the Unknown state.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unKnowStatusInstanceCount(Integer unKnowStatusInstanceCount) {
                this.unKnowStatusInstanceCount = unKnowStatusInstanceCount;
                return this;
            }

            /**
             * <p>The number of cores of unprotected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder unprotectedInstanceCoreCount(Long unprotectedInstanceCoreCount) {
                this.unprotectedInstanceCoreCount = unprotectedInstanceCoreCount;
                return this;
            }

            /**
             * <p>The number of unprotected assets.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder unprotectedInstanceCount(Integer unprotectedInstanceCount) {
                this.unprotectedInstanceCount = unprotectedInstanceCount;
                return this;
            }

            /**
             * <p>The number of virtual private clouds (VPCs).</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
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
