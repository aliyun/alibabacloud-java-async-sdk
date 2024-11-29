// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeEipSegmentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEipSegmentResponseBody</p>
 */
public class DescribeEipSegmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EipSegments")
    private EipSegments eipSegments;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>The details of the contiguous EIP group.</p>
         */
        public Builder eipSegments(EipSegments eipSegments) {
            this.eipSegments = eipSegments;
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
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F7A6301A-64BA-41EC-8284-8F4838C15D1F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEipSegmentResponseBody build() {
            return new DescribeEipSegmentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeEipSegmentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipSegmentResponseBody</p>
     */
    public static class EipSegment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Descritpion")
        private String descritpion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("IpCount")
        private String ipCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Segment")
        private String segment;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Zone")
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
             * <p>The time when the contiguous EIP group was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-03-06T12:30:07Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyEipSegment</p>
             */
            public Builder descritpion(String descritpion) {
                this.descritpion = descritpion;
                return this;
            }

            /**
             * <p>The ID of the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>eipsg-2zett8ba055tbsxme****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The number of EIPs in the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>16</p>
             */
            public Builder ipCount(String ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * <p>The name of the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>MyEipSegment</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region to which the contiguous EIP group belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The CIDR block and mask of the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>161.xx.xx.32/28</p>
             */
            public Builder segment(String segment) {
                this.segment = segment;
                return this;
            }

            /**
             * <p>The status of the contiguous EIP group. Valid values:</p>
             * <ul>
             * <li><strong>Allocating</strong></li>
             * <li><strong>Allocated</strong></li>
             * <li><strong>Releasing</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allocated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The zone of the contiguous EIP group.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-a</p>
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
    /**
     * 
     * {@link DescribeEipSegmentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeEipSegmentResponseBody</p>
     */
    public static class EipSegments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EipSegment")
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
