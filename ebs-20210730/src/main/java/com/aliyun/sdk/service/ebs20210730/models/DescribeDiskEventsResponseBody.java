// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeDiskEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDiskEventsResponseBody</p>
 */
public class DescribeDiskEventsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DiskEvents")
    private java.util.List<DiskEvents> diskEvents;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskEvents
     */
    public java.util.List<DiskEvents> getDiskEvents() {
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
        private java.util.List<DiskEvents> diskEvents; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeDiskEventsResponseBody model) {
            this.diskEvents = model.diskEvents;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The risk events of the disk.</p>
         */
        public Builder diskEvents(java.util.List<DiskEvents> diskEvents) {
            this.diskEvents = diskEvents;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>caeba0bbb2be03f84eb48b699f0a****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeDiskEventsResponseBody build() {
            return new DescribeDiskEventsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDiskEventsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDiskEventsResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(DiskEvents model) {
                this.description = model.description;
                this.diskId = model.diskId;
                this.recommendAction = model.recommendAction;
                this.regionId = model.regionId;
                this.status = model.status;
                this.timestamp = model.timestamp;
                this.type = model.type;
            } 

            /**
             * <p>The description of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>This is description.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>d-bp1bq5g3dxxo1x4o****</p>
             */
            public Builder diskId(String diskId) {
                this.diskId = diskId;
                return this;
            }

            /**
             * <p>The recommended action after the event occurred. Valid values:</p>
             * <ul>
             * <li>Resize: resizes the disk.</li>
             * <li>ModifyDiskSpec: changes the category of the disk.</li>
             * <li>NoAction: performs no operation.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NoAction</p>
             */
            public Builder recommendAction(String recommendAction) {
                this.recommendAction = recommendAction;
                return this;
            }

            /**
             * <p>The region ID of the disk.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The state of the event. Valid values:</p>
             * <ul>
             * <li>Solved</li>
             * <li>UnSolved</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Solved</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the event occurred. The time follows the <a href="https://help.aliyun.com/document_detail/25696.html">ISO 8601</a> standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-06-01T08:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * <p>The type of the event. Only DataNeedProtect can be returned.</p>
             * 
             * <strong>example:</strong>
             * <p>DataNeedProtect</p>
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
