// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotReposByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotReposByInstanceIdResponseBody</p>
 */
public class ListSnapshotReposByInstanceIdResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private java.util.List < Result> result;

    private ListSnapshotReposByInstanceIdResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSnapshotReposByInstanceIdResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public java.util.List < Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < Result> result; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListSnapshotReposByInstanceIdResponseBody build() {
            return new ListSnapshotReposByInstanceIdResponseBody(this);
        } 

    } 

    public static class Result extends TeaModel {
        @NameInMap("instanceId")
        private String instanceId;

        @NameInMap("repoPath")
        private String repoPath;

        @NameInMap("snapWarehouse")
        private String snapWarehouse;

        @NameInMap("status")
        private String status;

        private Result(Builder builder) {
            this.instanceId = builder.instanceId;
            this.repoPath = builder.repoPath;
            this.snapWarehouse = builder.snapWarehouse;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return repoPath
         */
        public String getRepoPath() {
            return this.repoPath;
        }

        /**
         * @return snapWarehouse
         */
        public String getSnapWarehouse() {
            return this.snapWarehouse;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String instanceId; 
            private String repoPath; 
            private String snapWarehouse; 
            private String status; 

            /**
             * instanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * repoPath.
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            /**
             * snapWarehouse.
             */
            public Builder snapWarehouse(String snapWarehouse) {
                this.snapWarehouse = snapWarehouse;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
