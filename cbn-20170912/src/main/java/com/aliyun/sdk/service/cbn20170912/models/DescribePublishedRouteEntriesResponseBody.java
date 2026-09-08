// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribePublishedRouteEntriesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePublishedRouteEntriesResponseBody</p>
 */
public class DescribePublishedRouteEntriesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("PublishedRouteEntries")
    private PublishedRouteEntries publishedRouteEntries;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribePublishedRouteEntriesResponseBody(Builder builder) {
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.publishedRouteEntries = builder.publishedRouteEntries;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePublishedRouteEntriesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return publishedRouteEntries
     */
    public PublishedRouteEntries getPublishedRouteEntries() {
        return this.publishedRouteEntries;
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
        private Integer pageNumber; 
        private Integer pageSize; 
        private PublishedRouteEntries publishedRouteEntries; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribePublishedRouteEntriesResponseBody model) {
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.publishedRouteEntries = model.publishedRouteEntries;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
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
         * <p>The number of entries per page in a paged query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * PublishedRouteEntries.
         */
        public Builder publishedRouteEntries(PublishedRouteEntries publishedRouteEntries) {
            this.publishedRouteEntries = publishedRouteEntries;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FF1A7B2A-677F-4F71-96EA-6002B329F437</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribePublishedRouteEntriesResponseBody build() {
            return new DescribePublishedRouteEntriesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePublishedRouteEntriesResponseBody</p>
     */
    public static class Conflict extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Conflict(Builder builder) {
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.instanceId = builder.instanceId;
            this.instanceType = builder.instanceType;
            this.regionId = builder.regionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conflict create() {
            return builder().build();
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String destinationCidrBlock; 
            private String instanceId; 
            private String instanceType; 
            private String regionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Conflict model) {
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.instanceId = model.instanceId;
                this.instanceType = model.instanceType;
                this.regionId = model.regionId;
                this.status = model.status;
            } 

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
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
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Conflict build() {
                return new Conflict(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePublishedRouteEntriesResponseBody</p>
     */
    public static class Conflicts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conflict")
        private java.util.List<Conflict> conflict;

        private Conflicts(Builder builder) {
            this.conflict = builder.conflict;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conflicts create() {
            return builder().build();
        }

        /**
         * @return conflict
         */
        public java.util.List<Conflict> getConflict() {
            return this.conflict;
        }

        public static final class Builder {
            private java.util.List<Conflict> conflict; 

            private Builder() {
            } 

            private Builder(Conflicts model) {
                this.conflict = model.conflict;
            } 

            /**
             * Conflict.
             */
            public Builder conflict(java.util.List<Conflict> conflict) {
                this.conflict = conflict;
                return this;
            }

            public Conflicts build() {
                return new Conflicts(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePublishedRouteEntriesResponseBody</p>
     */
    public static class PublishedRouteEntry extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildInstanceRouteTableId")
        private String childInstanceRouteTableId;

        @com.aliyun.core.annotation.NameInMap("Conflicts")
        private Conflicts conflicts;

        @com.aliyun.core.annotation.NameInMap("DestinationCidrBlock")
        private String destinationCidrBlock;

        @com.aliyun.core.annotation.NameInMap("NextHopId")
        private String nextHopId;

        @com.aliyun.core.annotation.NameInMap("NextHopType")
        private String nextHopType;

        @com.aliyun.core.annotation.NameInMap("OperationalMode")
        private Boolean operationalMode;

        @com.aliyun.core.annotation.NameInMap("PublishStatus")
        private String publishStatus;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        private PublishedRouteEntry(Builder builder) {
            this.childInstanceRouteTableId = builder.childInstanceRouteTableId;
            this.conflicts = builder.conflicts;
            this.destinationCidrBlock = builder.destinationCidrBlock;
            this.nextHopId = builder.nextHopId;
            this.nextHopType = builder.nextHopType;
            this.operationalMode = builder.operationalMode;
            this.publishStatus = builder.publishStatus;
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedRouteEntry create() {
            return builder().build();
        }

        /**
         * @return childInstanceRouteTableId
         */
        public String getChildInstanceRouteTableId() {
            return this.childInstanceRouteTableId;
        }

        /**
         * @return conflicts
         */
        public Conflicts getConflicts() {
            return this.conflicts;
        }

        /**
         * @return destinationCidrBlock
         */
        public String getDestinationCidrBlock() {
            return this.destinationCidrBlock;
        }

        /**
         * @return nextHopId
         */
        public String getNextHopId() {
            return this.nextHopId;
        }

        /**
         * @return nextHopType
         */
        public String getNextHopType() {
            return this.nextHopType;
        }

        /**
         * @return operationalMode
         */
        public Boolean getOperationalMode() {
            return this.operationalMode;
        }

        /**
         * @return publishStatus
         */
        public String getPublishStatus() {
            return this.publishStatus;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        public static final class Builder {
            private String childInstanceRouteTableId; 
            private Conflicts conflicts; 
            private String destinationCidrBlock; 
            private String nextHopId; 
            private String nextHopType; 
            private Boolean operationalMode; 
            private String publishStatus; 
            private String routeType; 

            private Builder() {
            } 

            private Builder(PublishedRouteEntry model) {
                this.childInstanceRouteTableId = model.childInstanceRouteTableId;
                this.conflicts = model.conflicts;
                this.destinationCidrBlock = model.destinationCidrBlock;
                this.nextHopId = model.nextHopId;
                this.nextHopType = model.nextHopType;
                this.operationalMode = model.operationalMode;
                this.publishStatus = model.publishStatus;
                this.routeType = model.routeType;
            } 

            /**
             * ChildInstanceRouteTableId.
             */
            public Builder childInstanceRouteTableId(String childInstanceRouteTableId) {
                this.childInstanceRouteTableId = childInstanceRouteTableId;
                return this;
            }

            /**
             * Conflicts.
             */
            public Builder conflicts(Conflicts conflicts) {
                this.conflicts = conflicts;
                return this;
            }

            /**
             * DestinationCidrBlock.
             */
            public Builder destinationCidrBlock(String destinationCidrBlock) {
                this.destinationCidrBlock = destinationCidrBlock;
                return this;
            }

            /**
             * NextHopId.
             */
            public Builder nextHopId(String nextHopId) {
                this.nextHopId = nextHopId;
                return this;
            }

            /**
             * NextHopType.
             */
            public Builder nextHopType(String nextHopType) {
                this.nextHopType = nextHopType;
                return this;
            }

            /**
             * OperationalMode.
             */
            public Builder operationalMode(Boolean operationalMode) {
                this.operationalMode = operationalMode;
                return this;
            }

            /**
             * PublishStatus.
             */
            public Builder publishStatus(String publishStatus) {
                this.publishStatus = publishStatus;
                return this;
            }

            /**
             * RouteType.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            public PublishedRouteEntry build() {
                return new PublishedRouteEntry(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribePublishedRouteEntriesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePublishedRouteEntriesResponseBody</p>
     */
    public static class PublishedRouteEntries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PublishedRouteEntry")
        private java.util.List<PublishedRouteEntry> publishedRouteEntry;

        private PublishedRouteEntries(Builder builder) {
            this.publishedRouteEntry = builder.publishedRouteEntry;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublishedRouteEntries create() {
            return builder().build();
        }

        /**
         * @return publishedRouteEntry
         */
        public java.util.List<PublishedRouteEntry> getPublishedRouteEntry() {
            return this.publishedRouteEntry;
        }

        public static final class Builder {
            private java.util.List<PublishedRouteEntry> publishedRouteEntry; 

            private Builder() {
            } 

            private Builder(PublishedRouteEntries model) {
                this.publishedRouteEntry = model.publishedRouteEntry;
            } 

            /**
             * PublishedRouteEntry.
             */
            public Builder publishedRouteEntry(java.util.List<PublishedRouteEntry> publishedRouteEntry) {
                this.publishedRouteEntry = publishedRouteEntry;
                return this;
            }

            public PublishedRouteEntries build() {
                return new PublishedRouteEntries(this);
            } 

        } 

    }
}
