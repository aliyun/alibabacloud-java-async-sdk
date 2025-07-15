// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link DeleteSnapshotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotFilesResponseBody</p>
 */
public class DeleteSnapshotFilesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailureCount")
    private Integer failureCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotDeleteInfoList")
    private SnapshotDeleteInfoList snapshotDeleteInfoList;

    @com.aliyun.core.annotation.NameInMap("SuccessCount")
    private Integer successCount;

    private DeleteSnapshotFilesResponseBody(Builder builder) {
        this.failureCount = builder.failureCount;
        this.requestId = builder.requestId;
        this.snapshotDeleteInfoList = builder.snapshotDeleteInfoList;
        this.successCount = builder.successCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSnapshotFilesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failureCount
     */
    public Integer getFailureCount() {
        return this.failureCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotDeleteInfoList
     */
    public SnapshotDeleteInfoList getSnapshotDeleteInfoList() {
        return this.snapshotDeleteInfoList;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    public static final class Builder {
        private Integer failureCount; 
        private String requestId; 
        private SnapshotDeleteInfoList snapshotDeleteInfoList; 
        private Integer successCount; 

        private Builder() {
        } 

        private Builder(DeleteSnapshotFilesResponseBody model) {
            this.failureCount = model.failureCount;
            this.requestId = model.requestId;
            this.snapshotDeleteInfoList = model.snapshotDeleteInfoList;
            this.successCount = model.successCount;
        } 

        /**
         * <p>The number of snapshots that failed to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder failureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>90F60327-ABEC-5A93-BF1F-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the snapshots.</p>
         */
        public Builder snapshotDeleteInfoList(SnapshotDeleteInfoList snapshotDeleteInfoList) {
            this.snapshotDeleteInfoList = snapshotDeleteInfoList;
            return this;
        }

        /**
         * <p>The number of successful screenshot deletions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DeleteSnapshotFilesResponseBody build() {
            return new DeleteSnapshotFilesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSnapshotFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSnapshotFilesResponseBody</p>
     */
    public static class SnapshotDeleteInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private SnapshotDeleteInfo(Builder builder) {
            this.createTimestamp = builder.createTimestamp;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotDeleteInfo create() {
            return builder().build();
        }

        /**
         * @return createTimestamp
         */
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Long createTimestamp; 
            private String message; 

            private Builder() {
            } 

            private Builder(SnapshotDeleteInfo model) {
                this.createTimestamp = model.createTimestamp;
                this.message = model.message;
            } 

            /**
             * <p>The timestamp when the snapshot was captured. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1653641526637</p>
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * <p>The processing result of the snapshot. Valid values:</p>
             * <ul>
             * <li><strong>OK</strong>: The snapshot was deleted.</li>
             * <li><strong>FileNotFound</strong>: The snapshot was not found.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public SnapshotDeleteInfo build() {
                return new SnapshotDeleteInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteSnapshotFilesResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSnapshotFilesResponseBody</p>
     */
    public static class SnapshotDeleteInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotDeleteInfo")
        private java.util.List<SnapshotDeleteInfo> snapshotDeleteInfo;

        private SnapshotDeleteInfoList(Builder builder) {
            this.snapshotDeleteInfo = builder.snapshotDeleteInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotDeleteInfoList create() {
            return builder().build();
        }

        /**
         * @return snapshotDeleteInfo
         */
        public java.util.List<SnapshotDeleteInfo> getSnapshotDeleteInfo() {
            return this.snapshotDeleteInfo;
        }

        public static final class Builder {
            private java.util.List<SnapshotDeleteInfo> snapshotDeleteInfo; 

            private Builder() {
            } 

            private Builder(SnapshotDeleteInfoList model) {
                this.snapshotDeleteInfo = model.snapshotDeleteInfo;
            } 

            /**
             * SnapshotDeleteInfo.
             */
            public Builder snapshotDeleteInfo(java.util.List<SnapshotDeleteInfo> snapshotDeleteInfo) {
                this.snapshotDeleteInfo = snapshotDeleteInfo;
                return this;
            }

            public SnapshotDeleteInfoList build() {
                return new SnapshotDeleteInfoList(this);
            } 

        } 

    }
}
