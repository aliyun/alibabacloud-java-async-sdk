// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DescribeEpnInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEpnInstancesResponseBody</p>
 */
public class DescribeEpnInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EPNInstances")
    private EPNInstances EPNInstances;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeEpnInstancesResponseBody model) {
            this.EPNInstances = model.EPNInstances;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Details of EPN instances.</p>
         */
        public Builder EPNInstances(EPNInstances EPNInstances) {
            this.EPNInstances = EPNInstances;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A1707FC0-430C-423A-B624-284046B20399</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEpnInstancesResponseBody build() {
            return new DescribeEpnInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEpnInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnInstancesResponseBody</p>
     */
    public static class EPNInstance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EPNInstanceId")
        private String EPNInstanceId;

        @com.aliyun.core.annotation.NameInMap("EPNInstanceName")
        private String EPNInstanceName;

        @com.aliyun.core.annotation.NameInMap("EPNInstanceType")
        private String EPNInstanceType;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("InternetMaxBandwidthOut")
        private Integer internetMaxBandwidthOut;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private String modifyTime;

        @com.aliyun.core.annotation.NameInMap("NetworkingModel")
        private String networkingModel;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
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

            private Builder() {
            } 

            private Builder(EPNInstance model) {
                this.creationTime = model.creationTime;
                this.EPNInstanceId = model.EPNInstanceId;
                this.EPNInstanceName = model.EPNInstanceName;
                this.EPNInstanceType = model.EPNInstanceType;
                this.endTime = model.endTime;
                this.internetMaxBandwidthOut = model.internetMaxBandwidthOut;
                this.modifyTime = model.modifyTime;
                this.networkingModel = model.networkingModel;
                this.startTime = model.startTime;
                this.status = model.status;
            } 

            /**
             * <p>The time when the instance was created. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The ID of the EPN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>epn****</p>
             */
            public Builder EPNInstanceId(String EPNInstanceId) {
                this.EPNInstanceId = EPNInstanceId;
                return this;
            }

            /**
             * <p>The name of the EPN instance.</p>
             * 
             * <strong>example:</strong>
             * <p>ens_test_epn</p>
             */
            public Builder EPNInstanceName(String EPNInstanceName) {
                this.EPNInstanceName = EPNInstanceName;
                return this;
            }

            /**
             * <p>Set the value to EdgeToEdge.</p>
             * 
             * <strong>example:</strong>
             * <p>EdgeToEdge</p>
             */
            public Builder EPNInstanceType(String EPNInstanceType) {
                this.EPNInstanceType = EPNInstanceType;
                return this;
            }

            /**
             * <p>The end of the time range during which the data was queried. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The inbound bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>40</p>
             */
            public Builder internetMaxBandwidthOut(Integer internetMaxBandwidthOut) {
                this.internetMaxBandwidthOut = internetMaxBandwidthOut;
                return this;
            }

            /**
             * <p>The time when the instance was last modified. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder modifyTime(String modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The networking mode. Valid values:</p>
             * <ul>
             * <li>SpeedUp: intelligent acceleration network (Internet)</li>
             * <li>Connection: internal network</li>
             * <li>SpeedUpAndConnection: intelligent acceleration network and internal network</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SpeedUp</p>
             */
            public Builder networkingModel(String networkingModel) {
                this.networkingModel = networkingModel;
                return this;
            }

            /**
             * <p>The beginning of the time range during which the data was queried. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-11-01T06:08:46Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the instance. Valid values:</p>
             * <ul>
             * <li>Running</li>
             * <li>Excuting</li>
             * <li>Stopped</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
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
    /**
     * 
     * {@link DescribeEpnInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEpnInstancesResponseBody</p>
     */
    public static class EPNInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EPNInstance")
        private java.util.List<EPNInstance> EPNInstance;

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
        public java.util.List<EPNInstance> getEPNInstance() {
            return this.EPNInstance;
        }

        public static final class Builder {
            private java.util.List<EPNInstance> EPNInstance; 

            private Builder() {
            } 

            private Builder(EPNInstances model) {
                this.EPNInstance = model.EPNInstance;
            } 

            /**
             * EPNInstance.
             */
            public Builder EPNInstance(java.util.List<EPNInstance> EPNInstance) {
                this.EPNInstance = EPNInstance;
                return this;
            }

            public EPNInstances build() {
                return new EPNInstances(this);
            } 

        } 

    }
}
