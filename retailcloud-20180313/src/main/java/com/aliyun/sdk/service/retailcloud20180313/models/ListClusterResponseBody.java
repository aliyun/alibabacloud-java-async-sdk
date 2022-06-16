// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterResponseBody</p>
 */
public class ListClusterResponseBody extends TeaModel {
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

    private ListClusterResponseBody(Builder builder) {
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

    public static ListClusterResponseBody create() {
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

        public ListClusterResponseBody build() {
            return new ListClusterResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BusinessCode")
        private String businessCode;

        @NameInMap("ClusterTitle")
        private String clusterTitle;

        @NameInMap("CreateStatus")
        private String createStatus;

        @NameInMap("EcsIds")
        private java.util.List < String > ecsIds;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("KeyPair")
        private String keyPair;

        @NameInMap("NetPlug")
        private String netPlug;

        @NameInMap("Password")
        private String password;

        @NameInMap("PodCIDR")
        private String podCIDR;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        @NameInMap("ServiceCIDR")
        private String serviceCIDR;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchIds")
        private java.util.List < String > vswitchIds;

        @NameInMap("WorkLoadCpu")
        private String workLoadCpu;

        @NameInMap("WorkLoadMem")
        private String workLoadMem;

        private Data(Builder builder) {
            this.businessCode = builder.businessCode;
            this.clusterTitle = builder.clusterTitle;
            this.createStatus = builder.createStatus;
            this.ecsIds = builder.ecsIds;
            this.envType = builder.envType;
            this.id = builder.id;
            this.instanceId = builder.instanceId;
            this.keyPair = builder.keyPair;
            this.netPlug = builder.netPlug;
            this.password = builder.password;
            this.podCIDR = builder.podCIDR;
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
            this.serviceCIDR = builder.serviceCIDR;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
            this.vswitchIds = builder.vswitchIds;
            this.workLoadCpu = builder.workLoadCpu;
            this.workLoadMem = builder.workLoadMem;
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
         * @return clusterTitle
         */
        public String getClusterTitle() {
            return this.clusterTitle;
        }

        /**
         * @return createStatus
         */
        public String getCreateStatus() {
            return this.createStatus;
        }

        /**
         * @return ecsIds
         */
        public java.util.List < String > getEcsIds() {
            return this.ecsIds;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return keyPair
         */
        public String getKeyPair() {
            return this.keyPair;
        }

        /**
         * @return netPlug
         */
        public String getNetPlug() {
            return this.netPlug;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return podCIDR
         */
        public String getPodCIDR() {
            return this.podCIDR;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return serviceCIDR
         */
        public String getServiceCIDR() {
            return this.serviceCIDR;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchIds
         */
        public java.util.List < String > getVswitchIds() {
            return this.vswitchIds;
        }

        /**
         * @return workLoadCpu
         */
        public String getWorkLoadCpu() {
            return this.workLoadCpu;
        }

        /**
         * @return workLoadMem
         */
        public String getWorkLoadMem() {
            return this.workLoadMem;
        }

        public static final class Builder {
            private String businessCode; 
            private String clusterTitle; 
            private String createStatus; 
            private java.util.List < String > ecsIds; 
            private String envType; 
            private Long id; 
            private String instanceId; 
            private String keyPair; 
            private String netPlug; 
            private String password; 
            private String podCIDR; 
            private String regionId; 
            private String regionName; 
            private String serviceCIDR; 
            private String status; 
            private String vpcId; 
            private java.util.List < String > vswitchIds; 
            private String workLoadCpu; 
            private String workLoadMem; 

            /**
             * BusinessCode.
             */
            public Builder businessCode(String businessCode) {
                this.businessCode = businessCode;
                return this;
            }

            /**
             * ClusterTitle.
             */
            public Builder clusterTitle(String clusterTitle) {
                this.clusterTitle = clusterTitle;
                return this;
            }

            /**
             * CreateStatus.
             */
            public Builder createStatus(String createStatus) {
                this.createStatus = createStatus;
                return this;
            }

            /**
             * EcsIds.
             */
            public Builder ecsIds(java.util.List < String > ecsIds) {
                this.ecsIds = ecsIds;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * KeyPair.
             */
            public Builder keyPair(String keyPair) {
                this.keyPair = keyPair;
                return this;
            }

            /**
             * NetPlug.
             */
            public Builder netPlug(String netPlug) {
                this.netPlug = netPlug;
                return this;
            }

            /**
             * Password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * PodCIDR.
             */
            public Builder podCIDR(String podCIDR) {
                this.podCIDR = podCIDR;
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
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * ServiceCIDR.
             */
            public Builder serviceCIDR(String serviceCIDR) {
                this.serviceCIDR = serviceCIDR;
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
             * VpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * VswitchIds.
             */
            public Builder vswitchIds(java.util.List < String > vswitchIds) {
                this.vswitchIds = vswitchIds;
                return this;
            }

            /**
             * WorkLoadCpu.
             */
            public Builder workLoadCpu(String workLoadCpu) {
                this.workLoadCpu = workLoadCpu;
                return this;
            }

            /**
             * WorkLoadMem.
             */
            public Builder workLoadMem(String workLoadMem) {
                this.workLoadMem = workLoadMem;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
