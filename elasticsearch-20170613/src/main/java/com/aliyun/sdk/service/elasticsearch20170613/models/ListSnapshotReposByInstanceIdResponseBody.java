// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListSnapshotReposByInstanceIdResponseBody} extends {@link TeaModel}
 *
 * <p>ListSnapshotReposByInstanceIdResponseBody</p>
 */
public class ListSnapshotReposByInstanceIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The return results.</p>
         */
        public Builder result(java.util.List < Result> result) {
            this.result = result;
            return this;
        }

        public ListSnapshotReposByInstanceIdResponseBody build() {
            return new ListSnapshotReposByInstanceIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListSnapshotReposByInstanceIdResponseBody} extends {@link TeaModel}
     *
     * <p>ListSnapshotReposByInstanceIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        @com.aliyun.core.annotation.NameInMap("snapWarehouse")
        private String snapWarehouse;

        @com.aliyun.core.annotation.NameInMap("status")
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
             * <p>Reference instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-6ja1ro4jt000c****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>The address of the repository.</p>
             * 
             * <strong>example:</strong>
             * <p>es-cn-6ja1ro4jt000c****</p>
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            /**
             * <p>Reference warehouse name.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun_snapshot_from_es-cn-6ja1ro4jt000c****</p>
             */
            public Builder snapWarehouse(String snapWarehouse) {
                this.snapWarehouse = snapWarehouse;
                return this;
            }

            /**
             * <p>Reference warehouse status. available indicates that it is valid. unavailable indicates that it is invalid.</p>
             * 
             * <strong>example:</strong>
             * <p>available</p>
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
