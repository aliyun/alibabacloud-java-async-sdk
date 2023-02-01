// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDeployApiTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployApiTaskResponseBody</p>
 */
public class DescribeDeployApiTaskResponseBody extends TeaModel {
    @NameInMap("DeployedResults")
    private DeployedResults deployedResults;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDeployApiTaskResponseBody(Builder builder) {
        this.deployedResults = builder.deployedResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeployApiTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return deployedResults
     */
    public DeployedResults getDeployedResults() {
        return this.deployedResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeployedResults deployedResults; 
        private String requestId; 

        /**
         * The result returned.
         */
        public Builder deployedResults(DeployedResults deployedResults) {
            this.deployedResults = deployedResults;
            return this;
        }

        /**
         * The result returned.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeployApiTaskResponseBody build() {
            return new DescribeDeployApiTaskResponseBody(this);
        } 

    } 

    public static class DeployedResult extends TeaModel {
        @NameInMap("ApiUid")
        private String apiUid;

        @NameInMap("DeployedStatus")
        private String deployedStatus;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("StageName")
        private String stageName;

        private DeployedResult(Builder builder) {
            this.apiUid = builder.apiUid;
            this.deployedStatus = builder.deployedStatus;
            this.errorMsg = builder.errorMsg;
            this.groupId = builder.groupId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedResult create() {
            return builder().build();
        }

        /**
         * @return apiUid
         */
        public String getApiUid() {
            return this.apiUid;
        }

        /**
         * @return deployedStatus
         */
        public String getDeployedStatus() {
            return this.deployedStatus;
        }

        /**
         * @return errorMsg
         */
        public String getErrorMsg() {
            return this.errorMsg;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        public static final class Builder {
            private String apiUid; 
            private String deployedStatus; 
            private String errorMsg; 
            private String groupId; 
            private String stageName; 

            /**
             * The deployment status of the API.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * auditing
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * The runtime environment of the API. Valid values:
             * <p>
             * 
             * *   **RELEASE**
             * *   **TEST**
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The ID of the API.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public DeployedResult build() {
                return new DeployedResult(this);
            } 

        } 

    }
    public static class DeployedResults extends TeaModel {
        @NameInMap("DeployedResult")
        private java.util.List < DeployedResult> deployedResult;

        private DeployedResults(Builder builder) {
            this.deployedResult = builder.deployedResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeployedResults create() {
            return builder().build();
        }

        /**
         * @return deployedResult
         */
        public java.util.List < DeployedResult> getDeployedResult() {
            return this.deployedResult;
        }

        public static final class Builder {
            private java.util.List < DeployedResult> deployedResult; 

            /**
             * DeployedResult.
             */
            public Builder deployedResult(java.util.List < DeployedResult> deployedResult) {
                this.deployedResult = deployedResult;
                return this;
            }

            public DeployedResults build() {
                return new DeployedResults(this);
            } 

        } 

    }
}
