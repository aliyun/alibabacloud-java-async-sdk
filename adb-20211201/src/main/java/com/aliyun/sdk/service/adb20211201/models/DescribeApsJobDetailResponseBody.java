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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeApsJobDetailResponseBody model) {
            this.APSJobDetail = model.APSJobDetail;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried job.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder APSJobDetail(APSJobDetail APSJobDetail) {
            this.APSJobDetail = APSJobDetail;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>-E606-4A42-BF6D-</strong></strong></strong></p>
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

            private Builder() {
            } 

            private Builder(APSJobDetail model) {
                this.dbList = model.dbList;
                this.destinationEndpointInstanceID = model.destinationEndpointInstanceID;
                this.destinationEndpointRegion = model.destinationEndpointRegion;
                this.partitionList = model.partitionList;
                this.sourceEndpointInstanceID = model.sourceEndpointInstanceID;
                this.sourceEndpointRegion = model.sourceEndpointRegion;
                this.status = model.status;
                this.targetTableMode = model.targetTableMode;
            } 

            /**
             * <p>The objects that are synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder dbList(String dbList) {
                this.dbList = dbList;
                return this;
            }

            /**
             * <p>The ID of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>amv-******</p>
             */
            public Builder destinationEndpointInstanceID(String destinationEndpointInstanceID) {
                this.destinationEndpointInstanceID = destinationEndpointInstanceID;
                return this;
            }

            /**
             * <p>The region of the destination cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder destinationEndpointRegion(String destinationEndpointRegion) {
                this.destinationEndpointRegion = destinationEndpointRegion;
                return this;
            }

            /**
             * <p>The partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder partitionList(String partitionList) {
                this.partitionList = partitionList;
                return this;
            }

            /**
             * <p>The ID of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-*******</p>
             */
            public Builder sourceEndpointInstanceID(String sourceEndpointInstanceID) {
                this.sourceEndpointInstanceID = sourceEndpointInstanceID;
                return this;
            }

            /**
             * <p>The region of the source instance.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder sourceEndpointRegion(String sourceEndpointRegion) {
                this.sourceEndpointRegion = sourceEndpointRegion;
                return this;
            }

            /**
             * <p>The status of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The mode of the destination table.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
