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
         * EipSegments.
         */
        public Builder eipSegments(EipSegments eipSegments) {
            this.eipSegments = eipSegments;
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

        private EipSegment(Builder builder) {
            this.creationTime = builder.creationTime;
            this.descritpion = builder.descritpion;
            this.instanceId = builder.instanceId;
            this.ipCount = builder.ipCount;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.segment = builder.segment;
            this.status = builder.status;
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

        public static final class Builder {
            private String creationTime; 
            private String descritpion; 
            private String instanceId; 
            private String ipCount; 
            private String name; 
            private String regionId; 
            private String segment; 
            private String status; 

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Descritpion.
             */
            public Builder descritpion(String descritpion) {
                this.descritpion = descritpion;
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
             * IpCount.
             */
            public Builder ipCount(String ipCount) {
                this.ipCount = ipCount;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Segment.
             */
            public Builder segment(String segment) {
                this.segment = segment;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
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
