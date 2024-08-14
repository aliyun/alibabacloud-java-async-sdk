// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskEventsResponseBody</p>
 */
public class DescribeDiskEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskEvents")
    private java.util.List < DiskEvents> diskEvents;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeDiskEventsResponseBody(Builder builder) {
        this.diskEvents = builder.diskEvents;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDiskEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return diskEvents
     */
    public java.util.List < DiskEvents> getDiskEvents() {
        return this.diskEvents;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < DiskEvents> diskEvents; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The risk events of the disk.
         */
        public Builder diskEvents(java.util.List < DiskEvents> diskEvents) {
            this.diskEvents = diskEvents;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskEventsResponseBody build() {
            return new DescribeDiskEventsResponseBody(this);
        } 

    } 

    public static class DiskEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DiskId")
        private String diskId;

        @com.aliyun.core.annotation.NameInMap("RecommendAction")
        private String recommendAction;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DiskEvents(Builder builder) {
            this.description = builder.description;
            this.diskId = builder.diskId;
            this.recommendAction = builder.recommendAction;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DiskEvents create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return diskId
         */
        public String getDiskId() {
            return this.diskId;
        }

        /**
         * @return recommendAction
         */
        public String getRecommendAction() {
            return this.recommendAction;
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

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String diskId; 
            private String recommendAction; 
            private String regionId; 
            private String status; 
            private String timestamp; 
            private String type; 

            /**
             * The description of the event.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the disk.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * The recommended action after the event occurred. Valid values:
             * <p>
             * 
             * *   Resize: resizes the disk.
             * *   ModifyDiskSpec: changes the category of the disk.
             * *   NoAction: performs no operation.
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * The region ID of the disk.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The state of the event. Valid values:
             * <p>
             * 
             * *   Solved
             * *   UnSolved
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the event occurred. The time follows the [ISO 8601](~~25696~~) standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * The type of the event. Only DataNeedProtect can be returned.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DiskEvents build() {
                return new DiskEvents(this);
            } 

        } 

    }
}
