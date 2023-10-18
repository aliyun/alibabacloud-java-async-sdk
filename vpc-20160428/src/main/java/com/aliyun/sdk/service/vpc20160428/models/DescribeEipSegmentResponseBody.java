// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEipSegmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipSegmentResponseBody</p>
 */
public class DescribeEipSegmentResponseBody extends TeaModel {
    @NameInMap("EipSegments")
    private EipSegments eipSegments;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEipSegmentResponseBody(Builder builder) {
        this.eipSegments = builder.eipSegments;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEipSegmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return eipSegments
     */
    public EipSegments getEipSegments() {
        return this.eipSegments;
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
        private EipSegments eipSegments; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * The details of the contiguous EIP group.
         */
        public Builder eipSegments(EipSegments eipSegments) {
            this.eipSegments = eipSegments;
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
         * The total number of entries returned.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipSegmentResponseBody build() {
            return new DescribeEipSegmentResponseBody(this);
        } 

    } 

    public static class EipSegment extends TeaModel {
        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Descritpion")
        private String descritpion;

        @NameInMap("InstanceId")
        private String instanceId;

        @NameInMap("IpCount")
        private String ipCount;

        @NameInMap("Name")
        private String name;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Segment")
        private String segment;

        @NameInMap("Status")
        private String status;

        @NameInMap("Zone")
        private String zone;

        private EipSegment(Builder builder) {
            this.creationTime = builder.creationTime;
            this.descritpion = builder.descritpion;
            this.instanceId = builder.instanceId;
            this.ipCount = builder.ipCount;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.segment = builder.segment;
            this.status = builder.status;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipSegment create() {
            return builder().build();
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return descritpion
         */
        public String getDescritpion() {
            return this.descritpion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return ipCount
         */
        public String getIpCount() {
            return this.ipCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return segment
         */
        public String getSegment() {
            return this.segment;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String creationTime; 
            private String descritpion; 
            private String instanceId; 
            private String ipCount; 
            private String name; 
            private String regionId; 
            private String segment; 
            private String status; 
            private String zone; 

            /**
             * The time when the contiguous EIP group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the contiguous EIP group.
             */
            public Builder descritpion(String descritpion) {
                this.descritpion = descritpion;
                return this;
            }

            /**
             * The ID of the contiguous EIP group.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * The number of EIPs in the contiguous EIP group.
             */
            public Builder ipCount(String ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * The name of the contiguous EIP group.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the region to which the contiguous EIP group belongs.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The CIDR block and mask of the contiguous EIP group.
             */
            public Builder segment(String segment) {
                this.segment = segment;
                return this;
            }

            /**
             * The status of the contiguous EIP group. Valid values:
             * <p>
             * 
             * *   **Allocating**
             * *   **Allocated**
             * *   **Releasing**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The zone of the contiguous EIP group.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public EipSegment build() {
                return new EipSegment(this);
            } 

        } 

    }
    public static class EipSegments extends TeaModel {
        @NameInMap("EipSegment")
        private java.util.List < EipSegment> eipSegment;

        private EipSegments(Builder builder) {
            this.eipSegment = builder.eipSegment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EipSegments create() {
            return builder().build();
        }

        /**
         * @return eipSegment
         */
        public java.util.List < EipSegment> getEipSegment() {
            return this.eipSegment;
        }

        public static final class Builder {
            private java.util.List < EipSegment> eipSegment; 

            /**
             * EipSegment.
             */
            public Builder eipSegment(java.util.List < EipSegment> eipSegment) {
                this.eipSegment = eipSegment;
                return this;
            }

            public EipSegments build() {
                return new EipSegments(this);
            } 

        } 

    }
}
