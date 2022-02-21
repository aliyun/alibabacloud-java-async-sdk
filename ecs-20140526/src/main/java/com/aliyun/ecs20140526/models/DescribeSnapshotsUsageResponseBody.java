// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSnapshotsUsageResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSnapshotsUsageResponseBody</p>
 */
public class DescribeSnapshotsUsageResponseBody extends TeaModel {
    @NameInMap("SnapshotSize")
    private Long snapshotSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotCount")
    private Integer snapshotCount;

    private DescribeSnapshotsUsageResponseBody(Builder builder) {
        this.snapshotSize = builder.snapshotSize;
        this.requestId = builder.requestId;
        this.snapshotCount = builder.snapshotCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSnapshotsUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return snapshotSize
     */
    public Long getSnapshotSize() {
        return this.snapshotSize;
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

    public static final class Builder {
        private Long snapshotSize; 
        private String requestId; 
        private Integer snapshotCount; 

        /**
         * The size of a snapshot in the current region. Unit: bytes.
         */
        public Builder snapshotSize(Long snapshotSize) {
            this.snapshotSize = snapshotSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of snapshots in the current region.
         */
        public Builder snapshotCount(Integer snapshotCount) {
            this.snapshotCount = snapshotCount;
            return this;
        }

        public DescribeSnapshotsUsageResponseBody build() {
            return new DescribeSnapshotsUsageResponseBody(this);
        } 

    } 

}
