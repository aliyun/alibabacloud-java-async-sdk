// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link GetGitBranchResponseBody} extends {@link TeaModel}
 *
 * <p>GetGitBranchResponseBody</p>
 */
public class GetGitBranchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Commit")
    private Commit commit;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetGitBranchResponseBody(Builder builder) {
        this.commit = builder.commit;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGitBranchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return commit
     */
    public Commit getCommit() {
        return this.commit;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Commit commit; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetGitBranchResponseBody model) {
            this.commit = model.commit;
            this.requestId = model.requestId;
        } 

        /**
         * Commit.
         */
        public Builder commit(Commit commit) {
            this.commit = commit;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetGitBranchResponseBody build() {
            return new GetGitBranchResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetGitBranchResponseBody} extends {@link TeaModel}
     *
     * <p>GetGitBranchResponseBody</p>
     */
    public static class Commit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Sha")
        private String sha;

        private Commit(Builder builder) {
            this.message = builder.message;
            this.sha = builder.sha;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commit create() {
            return builder().build();
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return sha
         */
        public String getSha() {
            return this.sha;
        }

        public static final class Builder {
            private String message; 
            private String sha; 

            private Builder() {
            } 

            private Builder(Commit model) {
                this.message = model.message;
                this.sha = model.sha;
            } 

            /**
             * <p>git commit message</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>git commit hash</p>
             * 
             * <strong>example:</strong>
             * <p>51417755</p>
             */
            public Builder sha(String sha) {
                this.sha = sha;
                return this;
            }

            public Commit build() {
                return new Commit(this);
            } 

        } 

    }
}
