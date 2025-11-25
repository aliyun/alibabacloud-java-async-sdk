// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeConfiguredDestinationIPResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfiguredDestinationIPResponseBody</p>
 */
public class DescribeConfiguredDestinationIPResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Destinations")
    private java.util.List<Destinations> destinations;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeConfiguredDestinationIPResponseBody(Builder builder) {
        this.destinations = builder.destinations;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfiguredDestinationIPResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return destinations
     */
    public java.util.List<Destinations> getDestinations() {
        return this.destinations;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
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
        private java.util.List<Destinations> destinations; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeConfiguredDestinationIPResponseBody model) {
            this.destinations = model.destinations;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Destinations.
         */
        public Builder destinations(java.util.List<Destinations> destinations) {
            this.destinations = destinations;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
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

        public DescribeConfiguredDestinationIPResponseBody build() {
            return new DescribeConfiguredDestinationIPResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeConfiguredDestinationIPResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeConfiguredDestinationIPResponseBody</p>
     */
    public static class Destinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        @com.aliyun.core.annotation.NameInMap("DestinationIP")
        private String destinationIP;

        @com.aliyun.core.annotation.NameInMap("DestinationISP")
        private String destinationISP;

        @com.aliyun.core.annotation.NameInMap("DestinationRegion")
        private String destinationRegion;

        @com.aliyun.core.annotation.NameInMap("OperationTime")
        private Integer operationTime;

        private Destinations(Builder builder) {
            this.comment = builder.comment;
            this.destinationIP = builder.destinationIP;
            this.destinationISP = builder.destinationISP;
            this.destinationRegion = builder.destinationRegion;
            this.operationTime = builder.operationTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destinations create() {
            return builder().build();
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        /**
         * @return destinationIP
         */
        public String getDestinationIP() {
            return this.destinationIP;
        }

        /**
         * @return destinationISP
         */
        public String getDestinationISP() {
            return this.destinationISP;
        }

        /**
         * @return destinationRegion
         */
        public String getDestinationRegion() {
            return this.destinationRegion;
        }

        /**
         * @return operationTime
         */
        public Integer getOperationTime() {
            return this.operationTime;
        }

        public static final class Builder {
            private String comment; 
            private String destinationIP; 
            private String destinationISP; 
            private String destinationRegion; 
            private Integer operationTime; 

            private Builder() {
            } 

            private Builder(Destinations model) {
                this.comment = model.comment;
                this.destinationIP = model.destinationIP;
                this.destinationISP = model.destinationISP;
                this.destinationRegion = model.destinationRegion;
                this.operationTime = model.operationTime;
            } 

            /**
             * Comment.
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            /**
             * DestinationIP.
             */
            public Builder destinationIP(String destinationIP) {
                this.destinationIP = destinationIP;
                return this;
            }

            /**
             * DestinationISP.
             */
            public Builder destinationISP(String destinationISP) {
                this.destinationISP = destinationISP;
                return this;
            }

            /**
             * DestinationRegion.
             */
            public Builder destinationRegion(String destinationRegion) {
                this.destinationRegion = destinationRegion;
                return this;
            }

            /**
             * OperationTime.
             */
            public Builder operationTime(Integer operationTime) {
                this.operationTime = operationTime;
                return this;
            }

            public Destinations build() {
                return new Destinations(this);
            } 

        } 

    }
}
