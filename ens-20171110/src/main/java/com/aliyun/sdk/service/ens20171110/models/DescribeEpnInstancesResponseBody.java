// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEpnInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnInstancesResponseBody</p>
 */
public class DescribeEpnInstancesResponseBody extends TeaModel {
    @NameInMap("EPNInstances")
    private EPNInstances EPNInstances;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEpnInstancesResponseBody(Builder builder) {
        this.EPNInstances = builder.EPNInstances;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEpnInstancesResponseBody create() {
        return builder().build();
    }

    /**
     * @return EPNInstances
     */
    public EPNInstances getEPNInstances() {
        return this.EPNInstances;
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
        private EPNInstances EPNInstances; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Details of EPN instances.
         */
        public Builder EPNInstances(EPNInstances EPNInstances) {
            this.EPNInstances = EPNInstances;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * The total number of pages returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEpnInstancesResponseBody build() {
            return new DescribeEpnInstancesResponseBody(this);
        } 

    } 

    public static class EPNInstance extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EPNInstanceId")
        private String EPNInstanceId;

        @NameInMap("EPNInstanceName")
        private String EPNInstanceName;

        @NameInMap("EPNInstanceType")
        private String EPNInstanceType;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @NameInMap("ModifyTime")
        private String modifyTime;

        @NameInMap("NetworkingModel")
        private String networkingModel;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private EPNInstance(Builder builder) {
            this.creationTime = builder.creationTime;
            this.EPNInstanceId = builder.EPNInstanceId;
            this.EPNInstanceName = builder.EPNInstanceName;
            this.EPNInstanceType = builder.EPNInstanceType;
            this.endTime = builder.endTime;
            this.internetMaxBandwidthOut = builder.internetMaxBandwidthOut;
            this.modifyTime = builder.modifyTime;
            this.networkingModel = builder.networkingModel;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EPNInstance create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return EPNInstanceId
         */
        public String getEPNInstanceId() {
            return this.EPNInstanceId;
        }

        /**
         * @return EPNInstanceName
         */
        public String getEPNInstanceName() {
            return this.EPNInstanceName;
        }

        /**
         * @return EPNInstanceType
         */
        public String getEPNInstanceType() {
            return this.EPNInstanceType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return internetMaxBandwidthOut
         */
        public Integer getInternetMaxBandwidthOut() {
            return this.internetMaxBandwidthOut;
        }

        /**
         * @return modifyTime
         */
        public String getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return networkingModel
         */
        public String getNetworkingModel() {
            return this.networkingModel;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creationTime; 
            private String EPNInstanceId; 
            private String EPNInstanceName; 
            private String EPNInstanceType; 
            private String endTime; 
            private Integer internetMaxBandwidthOut; 
            private String modifyTime; 
            private String networkingModel; 
            private String startTime; 
            private String status; 

            /**
             * The time when the instance was created. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the EPN instance.
             */
            public Builder EPNInstanceId(String EPNInstanceId) {
                this.EPNInstanceId = EPNInstanceId;
                return this;
            }

            /**
             * The name of the EPN instance.
             */
            public Builder EPNInstanceName(String EPNInstanceName) {
                this.EPNInstanceName = EPNInstanceName;
                return this;
            }

            /**
             * Set the value to EdgeToEdge.
             */
            public Builder EPNInstanceType(String EPNInstanceType) {
                this.EPNInstanceType = EPNInstanceType;
                return this;
            }

            /**
             * The end of the time range during which the data was queried. The time is displayed in UTC.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The inbound bandwidth. Unit: Mbit/s.
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * The time when the instance was last modified. The time is displayed in UTC.
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * The networking mode. Valid values:
             * <p>
             * 
             * *   SpeedUp: intelligent acceleration network (Internet)
             * *   Connection: internal network
             * *   SpeedUpAndConnection: intelligent acceleration network and internal network
             */
            public Builder networkingModel(String networkingModel) {
                this.networkingModel = networkingModel;
                return this;
            }

            /**
             * The beginning of the time range during which the data was queried. The time is displayed in UTC.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the instance. Valid values:
             * <p>
             * 
             * *   Running
             * *   Excuting
             * *   Stopped
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public EPNInstance build() {
                return new EPNInstance(this);
            } 

        } 

    }
    public static class EPNInstances extends TeaModel {
        @NameInMap("EPNInstance")
        private java.util.List < EPNInstance> EPNInstance;

        private EPNInstances(Builder builder) {
            this.EPNInstance = builder.EPNInstance;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EPNInstances create() {
            return builder().build();
        }

        /**
         * @return EPNInstance
         */
        public java.util.List < EPNInstance> getEPNInstance() {
            return this.EPNInstance;
        }

        public static final class Builder {
            private java.util.List < EPNInstance> EPNInstance; 

            /**
             * EPNInstance.
             */
            public Builder EPNInstance(java.util.List < EPNInstance> EPNInstance) {
                this.EPNInstance = EPNInstance;
                return this;
            }

            public EPNInstances build() {
                return new EPNInstances(this);
            } 

        } 

    }
}
