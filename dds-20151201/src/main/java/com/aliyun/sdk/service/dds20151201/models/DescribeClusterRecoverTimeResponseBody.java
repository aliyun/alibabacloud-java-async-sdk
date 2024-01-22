// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterRecoverTimeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterRecoverTimeResponseBody</p>
 */
public class DescribeClusterRecoverTimeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RestoreRanges")
    private java.util.List < RestoreRanges> restoreRanges;

    private DescribeClusterRecoverTimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.restoreRanges = builder.restoreRanges;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterRecoverTimeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return restoreRanges
     */
    public java.util.List < RestoreRanges> getRestoreRanges() {
        return this.restoreRanges;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < RestoreRanges> restoreRanges; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The cluster backup sets of the instance. A cluster backup file contains the backup sets of each node.
         */
        public Builder restoreRanges(java.util.List < RestoreRanges> restoreRanges) {
            this.restoreRanges = restoreRanges;
            return this;
        }

        public DescribeClusterRecoverTimeResponseBody build() {
            return new DescribeClusterRecoverTimeResponseBody(this);
        } 

    } 

    public static class RestoreRanges extends TeaModel {
        @NameInMap("RestoreBeginTime")
        private String restoreBeginTime;

        @NameInMap("RestoreEndTime")
        private String restoreEndTime;

        @NameInMap("RestoreType")
        private String restoreType;

        private RestoreRanges(Builder builder) {
            this.restoreBeginTime = builder.restoreBeginTime;
            this.restoreEndTime = builder.restoreEndTime;
            this.restoreType = builder.restoreType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RestoreRanges create() {
            return builder().build();
        }

        /**
         * @return restoreBeginTime
         */
        public String getRestoreBeginTime() {
            return this.restoreBeginTime;
        }

        /**
         * @return restoreEndTime
         */
        public String getRestoreEndTime() {
            return this.restoreEndTime;
        }

        /**
         * @return restoreType
         */
        public String getRestoreType() {
            return this.restoreType;
        }

        public static final class Builder {
            private String restoreBeginTime; 
            private String restoreEndTime; 
            private String restoreType; 

            /**
             * The beginning of the time range to which data can be restored.
             */
            public Builder restoreBeginTime(String restoreBeginTime) {
                this.restoreBeginTime = restoreBeginTime;
                return this;
            }

            /**
             * The end of the time range to which data can be restored.
             */
            public Builder restoreEndTime(String restoreEndTime) {
                this.restoreEndTime = restoreEndTime;
                return this;
            }

            /**
             * The method used to restore data. Valid values:
             * <p>
             * 
             * *   **PointInTime** (default): Data is restored based on point in time
             */
            public Builder restoreType(String restoreType) {
                this.restoreType = restoreType;
                return this;
            }

            public RestoreRanges build() {
                return new RestoreRanges(this);
            } 

        } 

    }
}
