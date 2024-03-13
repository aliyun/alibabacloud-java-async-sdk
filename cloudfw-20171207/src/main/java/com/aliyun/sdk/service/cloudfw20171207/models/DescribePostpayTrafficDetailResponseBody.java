// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePostpayTrafficDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePostpayTrafficDetailResponseBody</p>
 */
public class DescribePostpayTrafficDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("TrafficList")
    private java.util.List < TrafficList> trafficList;

    private DescribePostpayTrafficDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficList = builder.trafficList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePostpayTrafficDetailResponseBody create() {
        return builder().build();
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

    /**
     * @return trafficList
     */
    public java.util.List < TrafficList> getTrafficList() {
        return this.trafficList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < TrafficList> trafficList; 

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

        /**
         * TrafficList.
         */
        public Builder trafficList(java.util.List < TrafficList> trafficList) {
            this.trafficList = trafficList;
            return this;
        }

        public DescribePostpayTrafficDetailResponseBody build() {
            return new DescribePostpayTrafficDetailResponseBody(this);
        } 

    } 

    public static class TrafficList extends TeaModel {
        @NameInMap("InBytes")
        private Long inBytes;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("InstanceType")
        private String instanceType;

        @NameInMap("OutBytes")
        private Long outBytes;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("TotalBytes")
        private Long totalBytes;

        @NameInMap("TrafficDay")
        private String trafficDay;

        @NameInMap("TrafficType")
        private String trafficType;

        private TrafficList(Builder builder) {
            this.inBytes = builder.inBytes;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.outBytes = builder.outBytes;
            this.resourceId = builder.resourceId;
            this.totalBytes = builder.totalBytes;
            this.trafficDay = builder.trafficDay;
            this.trafficType = builder.trafficType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficList create() {
            return builder().build();
        }

        /**
         * @return inBytes
         */
        public Long getInBytes() {
            return this.inBytes;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return outBytes
         */
        public Long getOutBytes() {
            return this.outBytes;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return totalBytes
         */
        public Long getTotalBytes() {
            return this.totalBytes;
        }

        /**
         * @return trafficDay
         */
        public String getTrafficDay() {
            return this.trafficDay;
        }

        /**
         * @return trafficType
         */
        public String getTrafficType() {
            return this.trafficType;
        }

        public static final class Builder {
            private Long inBytes; 
            private String instanceId; 
            private String instanceType; 
            private Long outBytes; 
            private String resourceId; 
            private Long totalBytes; 
            private String trafficDay; 
            private String trafficType; 

            /**
             * InBytes.
             */
            public Builder inBytes(Long inBytes) {
                this.inBytes = inBytes;
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
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * OutBytes.
             */
            public Builder outBytes(Long outBytes) {
                this.outBytes = outBytes;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * TotalBytes.
             */
            public Builder totalBytes(Long totalBytes) {
                this.totalBytes = totalBytes;
                return this;
            }

            /**
             * TrafficDay.
             */
            public Builder trafficDay(String trafficDay) {
                this.trafficDay = trafficDay;
                return this;
            }

            /**
             * TrafficType.
             */
            public Builder trafficType(String trafficType) {
                this.trafficType = trafficType;
                return this;
            }

            public TrafficList build() {
                return new TrafficList(this);
            } 

        } 

    }
}
