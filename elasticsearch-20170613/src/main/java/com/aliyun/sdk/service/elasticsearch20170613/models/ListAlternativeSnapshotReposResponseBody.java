// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListAlternativeSnapshotReposResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlternativeSnapshotReposResponseBody</p>
 */
public class ListAlternativeSnapshotReposResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List < Result> result;

    private ListAlternativeSnapshotReposResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlternativeSnapshotReposResponseBody create() {
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
         * <p>5FFD9ED4-C2EC-4E89-B22B-1ACB6FE1D***</p>
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

        public ListAlternativeSnapshotReposResponseBody build() {
            return new ListAlternativeSnapshotReposResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAlternativeSnapshotReposResponseBody} extends {@link TeaModel}
     *
     * <p>ListAlternativeSnapshotReposResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("instanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("repoPath")
        private String repoPath;

        private Result(Builder builder) {
            this.instanceId = builder.instanceId;
            this.repoPath = builder.repoPath;
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

        public static final class Builder {
            private String instanceId; 
            private String repoPath; 

            /**
             * <p>The ID of the instance.</p>
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
             * <p>RepoPath</p>
             */
            public Builder repoPath(String repoPath) {
                this.repoPath = repoPath;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
