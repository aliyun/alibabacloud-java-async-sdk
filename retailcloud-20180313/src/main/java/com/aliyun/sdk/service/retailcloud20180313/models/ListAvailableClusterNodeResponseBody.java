// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableClusterNodeResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvailableClusterNodeResponseBody</p>
 */
public class ListAvailableClusterNodeResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("ErrorMsg")
    private String errorMsg;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListAvailableClusterNodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMsg = builder.errorMsg;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableClusterNodeResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private String errorMsg; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAvailableClusterNodeResponseBody build() {
            return new ListAvailableClusterNodeResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BusinessCode")
        private String businessCode;

        @NameInMap("EcsConfiguration")
        private String ecsConfiguration;

        @NameInMap("EcsCpu")
        private String ecsCpu;

        @NameInMap("EcsEip")
        private String ecsEip;

        @NameInMap("EcsExpiredTime")
        private String ecsExpiredTime;

        @NameInMap("EcsLocalStorageCapacity")
        private String ecsLocalStorageCapacity;

        @NameInMap("EcsMemory")
        private String ecsMemory;

        @NameInMap("EcsOsType")
        private String ecsOsType;

        @NameInMap("EcsPrivateIp")
        private String ecsPrivateIp;

        @NameInMap("EcsPublicIp")
        private String ecsPublicIp;

        @NameInMap("EcsZone")
        private String ecsZone;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceName")
        private String instanceName;

        @NameInMap("InstanceNetworkType")
        private String instanceNetworkType;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("InternetMaxBandwidthIn")
        private String internetMaxBandwidthIn;

        @NameInMap("InternetMaxBandwidthOut")
        private String internetMaxBandwidthOut;

        @NameInMap("OSName")
        private String OSName;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("VpcId")
        private String vpcId;

        private Data(Builder builder) {
            this.businessCode = builder.businessCode;
            this.ecsConfiguration = builder.ecsConfiguration;
            this.ecsCpu = builder.ecsCpu;
            this.ecsEip = builder.ecsEip;
            this.ecsExpiredTime = builder.ecsExpiredTime;
            this.ecsLocalStorageCapacity = builder.ecsLocalStorageCapacity;
            this.ecsMemory = builder.ecsMemory;
            this.ecsOsType = builder.ecsOsType;
            this.ecsPrivateIp = builder.ecsPrivateIp;
            this.ecsPublicIp = builder.ecsPublicIp;
            this.ecsZone = builder.ecsZone;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
            this.instanceNetworkType = builder.instanceNetworkType;
            this.instanceType = builder.instanceType;
            this.internetMaxBandwidthIn = builder.internetMaxBandwidthIn;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.OSName = builder.OSName;
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return businessCode
         */
        public String getBusinessCode() {
            return this.businessCode;
        }

        /**
         * @return ecsConfiguration
         */
        public String getEcsConfiguration() {
            return this.ecsConfiguration;
        }

        /**
         * @return ecsCpu
         */
        public String getEcsCpu() {
            return this.ecsCpu;
        }

        /**
         * @return ecsEip
         */
        public String getEcsEip() {
            return this.ecsEip;
        }

        /**
         * @return ecsExpiredTime
         */
        public String getEcsExpiredTime() {
            return this.ecsExpiredTime;
        }

        /**
         * @return ecsLocalStorageCapacity
         */
        public String getEcsLocalStorageCapacity() {
            return this.ecsLocalStorageCapacity;
        }

        /**
         * @return ecsMemory
         */
        public String getEcsMemory() {
            return this.ecsMemory;
        }

        /**
         * @return ecsOsType
         */
        public String getEcsOsType() {
            return this.ecsOsType;
        }

        /**
         * @return ecsPrivateIp
         */
        public String getEcsPrivateIp() {
            return this.ecsPrivateIp;
        }

        /**
         * @return ecsPublicIp
         */
        public String getEcsPublicIp() {
            return this.ecsPublicIp;
        }

        /**
         * @return ecsZone
         */
        public String getEcsZone() {
            return this.ecsZone;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        /**
         * @return instanceNetworkType
         */
        public String getInstanceNetworkType() {
            return this.instanceNetworkType;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return internetMaxBandwidthIn
         */
        public String getInternetMaxBandwidthIn() {
            return this.internetMaxBandwidthIn;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public String getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return OSName
         */
        public String getOSName() {
            return this.OSName;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String businessCode; 
            private String ecsConfiguration; 
            private String ecsCpu; 
            private String ecsEip; 
            private String ecsExpiredTime; 
            private String ecsLocalStorageCapacity; 
            private String ecsMemory; 
            private String ecsOsType; 
            private String ecsPrivateIp; 
            private String ecsPublicIp; 
            private String ecsZone; 
            private String instanceId; 
            private String instanceName; 
            private String instanceNetworkType; 
            private String instanceType; 
            private String internetMaxBandwidthIn; 
            private String internetMaxBandwidthOut; 
            private String OSName; 
            private String regionId; 
            private String vpcId; 

            /**
             * BusinessCode.
             */
            public Builder businessCode(String businessCode) {
                this.businessCode = businessCode;
                return this;
            }

            /**
             * EcsConfiguration.
             */
            public Builder ecsConfiguration(String ecsConfiguration) {
                this.ecsConfiguration = ecsConfiguration;
                return this;
            }

            /**
             * EcsCpu.
             */
            public Builder ecsCpu(String ecsCpu) {
                this.ecsCpu = ecsCpu;
                return this;
            }

            /**
             * EcsEip.
             */
            public Builder ecsEip(String ecsEip) {
                this.ecsEip = ecsEip;
                return this;
            }

            /**
             * EcsExpiredTime.
             */
            public Builder ecsExpiredTime(String ecsExpiredTime) {
                this.ecsExpiredTime = ecsExpiredTime;
                return this;
            }

            /**
             * EcsLocalStorageCapacity.
             */
            public Builder ecsLocalStorageCapacity(String ecsLocalStorageCapacity) {
                this.ecsLocalStorageCapacity = ecsLocalStorageCapacity;
                return this;
            }

            /**
             * EcsMemory.
             */
            public Builder ecsMemory(String ecsMemory) {
                this.ecsMemory = ecsMemory;
                return this;
            }

            /**
             * EcsOsType.
             */
            public Builder ecsOsType(String ecsOsType) {
                this.ecsOsType = ecsOsType;
                return this;
            }

            /**
             * EcsPrivateIp.
             */
            public Builder ecsPrivateIp(String ecsPrivateIp) {
                this.ecsPrivateIp = ecsPrivateIp;
                return this;
            }

            /**
             * EcsPublicIp.
             */
            public Builder ecsPublicIp(String ecsPublicIp) {
                this.ecsPublicIp = ecsPublicIp;
                return this;
            }

            /**
             * EcsZone.
             */
            public Builder ecsZone(String ecsZone) {
                this.ecsZone = ecsZone;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            /**
             * InstanceNetworkType.
             */
            public Builder instanceNetworkType(String instanceNetworkType) {
                this.instanceNetworkType = instanceNetworkType;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * InternetMaxBandwidthIn.
             */
            public Builder internetMaxBandwidthIn(String internetMaxBandwidthIn) {
                this.internetMaxBandwidthIn = internetMaxBandwidthIn;
                return this;
            }

            /**
             * InternetMaxBandwidthOut.
             */
            public Builder internetMaxBandwidthOut(String internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * OSName.
             */
            public Builder OSName(String OSName) {
                this.OSName = OSName;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
