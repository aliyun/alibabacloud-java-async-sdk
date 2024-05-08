// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsUsageResponseBody</p>
 */
public class DescribeSnapshotsUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotCount")
    private Integer snapshotCount;

    @com.aliyun.core.annotation.NameInMap("SnapshotSize")
    private Long snapshotSize;

    private DescribeSnapshotsUsageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotCount = builder.snapshotCount;
        this.snapshotSize = builder.snapshotSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotCount
     */
    public Integer getSnapshotCount() {
        return this.snapshotCount;
    }

    /**
     * @return snapshotSize
     */
    public Long getSnapshotSize() {
        return this.snapshotSize;
    }

    public static final class Builder {
        private String requestId; 
        private Integer snapshotCount; 
        private Long snapshotSize; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of snapshots stored in the current region.
         */
        public Builder snapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }

        /**
         * The total size of snapshots stored in the current region. Unit: bytes.
         */
        public Builder snapshotSize(Long snapshotSize) {
            this.snapshotSize = snapshotSize;
            return this;
        }

        public DescribeSnapshotsUsageResponseBody build() {
            return new DescribeSnapshotsUsageResponseBody(this);
        } 

    } 

}
