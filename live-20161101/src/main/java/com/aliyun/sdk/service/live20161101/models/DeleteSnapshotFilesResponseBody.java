// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSnapshotFilesResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSnapshotFilesResponseBody</p>
 */
public class DeleteSnapshotFilesResponseBody extends TeaModel {
    @NameInMap("FailureCount")
    private Integer failureCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotDeleteInfoList")
    private SnapshotDeleteInfoList snapshotDeleteInfoList;

    @NameInMap("SuccessCount")
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

        /**
         * FailureCount.
         */
        public Builder failureCount(Integer failureCount) {
            this.failureCount = failureCount;
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
         * SnapshotDeleteInfoList.
         */
        public Builder snapshotDeleteInfoList(SnapshotDeleteInfoList snapshotDeleteInfoList) {
            this.snapshotDeleteInfoList = snapshotDeleteInfoList;
            return this;
        }

        /**
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public DeleteSnapshotFilesResponseBody build() {
            return new DeleteSnapshotFilesResponseBody(this);
        } 

    } 

    public static class SnapshotDeleteInfo extends TeaModel {
        @NameInMap("CreateTimestamp")
        private Long createTimestamp;

        @NameInMap("Message")
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

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(Long createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * Message.
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
    public static class SnapshotDeleteInfoList extends TeaModel {
        @NameInMap("SnapshotDeleteInfo")
        private java.util.List < SnapshotDeleteInfo> snapshotDeleteInfo;

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
        public java.util.List < SnapshotDeleteInfo> getSnapshotDeleteInfo() {
            return this.snapshotDeleteInfo;
        }

        public static final class Builder {
            private java.util.List < SnapshotDeleteInfo> snapshotDeleteInfo; 

            /**
             * SnapshotDeleteInfo.
             */
            public Builder snapshotDeleteInfo(java.util.List < SnapshotDeleteInfo> snapshotDeleteInfo) {
                this.snapshotDeleteInfo = snapshotDeleteInfo;
                return this;
            }

            public SnapshotDeleteInfoList build() {
                return new SnapshotDeleteInfoList(this);
            } 

        } 

    }
}
