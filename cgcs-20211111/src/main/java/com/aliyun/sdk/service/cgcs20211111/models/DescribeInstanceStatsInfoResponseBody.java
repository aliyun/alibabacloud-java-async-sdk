// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceStatsInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceStatsInfoResponseBody</p>
 */
public class DescribeInstanceStatsInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceStatsInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceStatsInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceStatsInfoResponseBody build() {
            return new DescribeInstanceStatsInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("OperatingInstanceCount")
        private Integer operatingInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("ReleasingInstanceCount")
        private Integer releasingInstanceCount;

        @com.aliyun.core.annotation.NameInMap("ReservingInstanceCount")
        private Integer reservingInstanceCount;

        @com.aliyun.core.annotation.NameInMap("RunningInstanceCount")
        private Integer runningInstanceCount;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.districtId = builder.districtId;
            this.instanceType = builder.instanceType;
            this.operatingInstanceCount = builder.operatingInstanceCount;
            this.projectId = builder.projectId;
            this.releasingInstanceCount = builder.releasingInstanceCount;
            this.reservingInstanceCount = builder.reservingInstanceCount;
            this.runningInstanceCount = builder.runningInstanceCount;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return operatingInstanceCount
         */
        public Integer getOperatingInstanceCount() {
            return this.operatingInstanceCount;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return releasingInstanceCount
         */
        public Integer getReleasingInstanceCount() {
            return this.releasingInstanceCount;
        }

        /**
         * @return reservingInstanceCount
         */
        public Integer getReservingInstanceCount() {
            return this.reservingInstanceCount;
        }

        /**
         * @return runningInstanceCount
         */
        public Integer getRunningInstanceCount() {
            return this.runningInstanceCount;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String districtId; 
            private String instanceType; 
            private Integer operatingInstanceCount; 
            private String projectId; 
            private Integer releasingInstanceCount; 
            private Integer reservingInstanceCount; 
            private Integer runningInstanceCount; 
            private Integer totalCount; 

            /**
             * DistrictId.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
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
             * OperatingInstanceCount.
             */
            public Builder operatingInstanceCount(Integer operatingInstanceCount) {
                this.operatingInstanceCount = operatingInstanceCount;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * ReleasingInstanceCount.
             */
            public Builder releasingInstanceCount(Integer releasingInstanceCount) {
                this.releasingInstanceCount = releasingInstanceCount;
                return this;
            }

            /**
             * ReservingInstanceCount.
             */
            public Builder reservingInstanceCount(Integer reservingInstanceCount) {
                this.reservingInstanceCount = reservingInstanceCount;
                return this;
            }

            /**
             * RunningInstanceCount.
             */
            public Builder runningInstanceCount(Integer runningInstanceCount) {
                this.runningInstanceCount = runningInstanceCount;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
