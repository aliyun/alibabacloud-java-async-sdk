// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAccessPointsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAccessPointsResponseBody</p>
 */
public class DescribeAccessPointsResponseBody extends TeaModel {
    @NameInMap("AccessPointSet")
    private AccessPointSet accessPointSet;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAccessPointsResponseBody(Builder builder) {
        this.accessPointSet = builder.accessPointSet;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAccessPointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessPointSet
     */
    public AccessPointSet getAccessPointSet() {
        return this.accessPointSet;
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
        private AccessPointSet accessPointSet; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * AccessPointSet.
         */
        public Builder accessPointSet(AccessPointSet accessPointSet) {
            this.accessPointSet = accessPointSet;
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

        public DescribeAccessPointsResponseBody build() {
            return new DescribeAccessPointsResponseBody(this);
        } 

    } 

    public static class AccessPointType extends TeaModel {
        @NameInMap("AccessPointId")
        private String accessPointId;

        @NameInMap("AttachedRegionNo")
        private String attachedRegionNo;

        @NameInMap("Description")
        private String description;

        @NameInMap("HostOperator")
        private String hostOperator;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private AccessPointType(Builder builder) {
            this.accessPointId = builder.accessPointId;
            this.attachedRegionNo = builder.attachedRegionNo;
            this.description = builder.description;
            this.hostOperator = builder.hostOperator;
            this.location = builder.location;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointType create() {
            return builder().build();
        }

        /**
         * @return accessPointId
         */
        public String getAccessPointId() {
            return this.accessPointId;
        }

        /**
         * @return attachedRegionNo
         */
        public String getAttachedRegionNo() {
            return this.attachedRegionNo;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostOperator
         */
        public String getHostOperator() {
            return this.hostOperator;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String accessPointId; 
            private String attachedRegionNo; 
            private String description; 
            private String hostOperator; 
            private String location; 
            private String name; 
            private String status; 
            private String type; 

            /**
             * AccessPointId.
             */
            public Builder accessPointId(String accessPointId) {
                this.accessPointId = accessPointId;
                return this;
            }

            /**
             * AttachedRegionNo.
             */
            public Builder attachedRegionNo(String attachedRegionNo) {
                this.attachedRegionNo = attachedRegionNo;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HostOperator.
             */
            public Builder hostOperator(String hostOperator) {
                this.hostOperator = hostOperator;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
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
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AccessPointType build() {
                return new AccessPointType(this);
            } 

        } 

    }
    public static class AccessPointSet extends TeaModel {
        @NameInMap("AccessPointType")
        private java.util.List < AccessPointType> accessPointType;

        private AccessPointSet(Builder builder) {
            this.accessPointType = builder.accessPointType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessPointSet create() {
            return builder().build();
        }

        /**
         * @return accessPointType
         */
        public java.util.List < AccessPointType> getAccessPointType() {
            return this.accessPointType;
        }

        public static final class Builder {
            private java.util.List < AccessPointType> accessPointType; 

            /**
             * AccessPointType.
             */
            public Builder accessPointType(java.util.List < AccessPointType> accessPointType) {
                this.accessPointType = accessPointType;
                return this;
            }

            public AccessPointSet build() {
                return new AccessPointSet(this);
            } 

        } 

    }
}
