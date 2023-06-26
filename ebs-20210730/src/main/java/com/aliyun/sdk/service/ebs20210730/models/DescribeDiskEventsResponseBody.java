// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDiskEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskEventsResponseBody</p>
 */
public class DescribeDiskEventsResponseBody extends TeaModel {
    @NameInMap("DiskEvents")
    private java.util.List < DiskEvents> diskEvents;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * DiskEvents.
         */
        public Builder diskEvents(java.util.List < DiskEvents> diskEvents) {
            this.diskEvents = diskEvents;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskEventsResponseBody build() {
            return new DescribeDiskEventsResponseBody(this);
        } 

    } 

    public static class DiskEvents extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("DiskId")
        private String diskId;

        @NameInMap("RecommendAction")
        private String recommendAction;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Timestamp")
        private String timestamp;

        @NameInMap("Type")
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
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DiskId.
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * RecommendAction.
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
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

            /**
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Type.
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
