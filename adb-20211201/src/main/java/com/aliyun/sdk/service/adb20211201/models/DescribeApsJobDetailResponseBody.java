// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link DescribeApsJobDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeApsJobDetailResponseBody</p>
 */
public class DescribeApsJobDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("APSJobDetail")
    private APSJobDetail APSJobDetail;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeApsJobDetailResponseBody(Builder builder) {
        this.APSJobDetail = builder.APSJobDetail;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApsJobDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return APSJobDetail
     */
    public APSJobDetail getAPSJobDetail() {
        return this.APSJobDetail;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private APSJobDetail APSJobDetail; 
        private String requestId; 

        /**
         * APSJobDetail.
         */
        public Builder APSJobDetail(APSJobDetail APSJobDetail) {
            this.APSJobDetail = APSJobDetail;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeApsJobDetailResponseBody build() {
            return new DescribeApsJobDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeApsJobDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeApsJobDetailResponseBody</p>
     */
    public static class APSJobDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbList")
        private String dbList;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointInstanceID")
        private String destinationEndpointInstanceID;

        @com.aliyun.core.annotation.NameInMap("DestinationEndpointRegion")
        private String destinationEndpointRegion;

        @com.aliyun.core.annotation.NameInMap("PartitionList")
        private String partitionList;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointInstanceID")
        private String sourceEndpointInstanceID;

        @com.aliyun.core.annotation.NameInMap("SourceEndpointRegion")
        private String sourceEndpointRegion;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TargetTableMode")
        private String targetTableMode;

        private APSJobDetail(Builder builder) {
            this.dbList = builder.dbList;
            this.destinationEndpointInstanceID = builder.destinationEndpointInstanceID;
            this.destinationEndpointRegion = builder.destinationEndpointRegion;
            this.partitionList = builder.partitionList;
            this.sourceEndpointInstanceID = builder.sourceEndpointInstanceID;
            this.sourceEndpointRegion = builder.sourceEndpointRegion;
            this.status = builder.status;
            this.targetTableMode = builder.targetTableMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static APSJobDetail create() {
            return builder().build();
        }

        /**
         * @return dbList
         */
        public String getDbList() {
            return this.dbList;
        }

        /**
         * @return destinationEndpointInstanceID
         */
        public String getDestinationEndpointInstanceID() {
            return this.destinationEndpointInstanceID;
        }

        /**
         * @return destinationEndpointRegion
         */
        public String getDestinationEndpointRegion() {
            return this.destinationEndpointRegion;
        }

        /**
         * @return partitionList
         */
        public String getPartitionList() {
            return this.partitionList;
        }

        /**
         * @return sourceEndpointInstanceID
         */
        public String getSourceEndpointInstanceID() {
            return this.sourceEndpointInstanceID;
        }

        /**
         * @return sourceEndpointRegion
         */
        public String getSourceEndpointRegion() {
            return this.sourceEndpointRegion;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return targetTableMode
         */
        public String getTargetTableMode() {
            return this.targetTableMode;
        }

        public static final class Builder {
            private String dbList; 
            private String destinationEndpointInstanceID; 
            private String destinationEndpointRegion; 
            private String partitionList; 
            private String sourceEndpointInstanceID; 
            private String sourceEndpointRegion; 
            private String status; 
            private String targetTableMode; 

            /**
             * DbList.
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * DestinationEndpointInstanceID.
             */
            public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
                this.destinationEndpointInstanceID = destinationEndpointInstanceID;
                return this;
            }

            /**
             * DestinationEndpointRegion.
             */
            public Builder destinationEndpointRegion(String destinationEndpointRegion) {
                this.destinationEndpointRegion = destinationEndpointRegion;
                return this;
            }

            /**
             * PartitionList.
             */
            public Builder partitionList(String partitionList) {
                this.partitionList = partitionList;
                return this;
            }

            /**
             * SourceEndpointInstanceID.
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * SourceEndpointRegion.
             */
            public Builder sourceEndpointRegion(String sourceEndpointRegion) {
                this.sourceEndpointRegion = sourceEndpointRegion;
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
             * TargetTableMode.
             */
            public Builder targetTableMode(String targetTableMode) {
                this.targetTableMode = targetTableMode;
                return this;
            }

            public APSJobDetail build() {
                return new APSJobDetail(this);
            } 

        } 

    }
}
