// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeDeployApiTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeployApiTaskResponseBody</p>
 */
public class DescribeDeployApiTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeployedResults")
    private DeployedResults deployedResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The returned result.</p>
         */
        public Builder deployedResults(DeployedResults deployedResults) {
            this.deployedResults = deployedResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>CA4B3261-F14A-5E33-8608-F75A1DF27AD4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDeployApiTaskResponseBody build() {
            return new DescribeDeployApiTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeployApiTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeployApiTaskResponseBody</p>
     */
    public static class DeployedResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiUid")
        private String apiUid;

        @com.aliyun.core.annotation.NameInMap("DeployedStatus")
        private String deployedStatus;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("StageName")
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
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>0433c1cd84724923b7a4f9ca1cfc249c</p>
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * <p>The deployment status of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>OVER</p>
             */
            public Builder deployedStatus(String deployedStatus) {
                this.deployedStatus = deployedStatus;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>Success. Request Success.</p>
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * <p>The ID of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>e8da6f6346184da9a30d0dc1888b1f3b</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The runtime environment of the API. Valid values:</p>
             * <ul>
             * <li><strong>RELEASE</strong></li>
             * <li><strong>TEST</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELEASE</p>
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
    /**
     * 
     * {@link DescribeDeployApiTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeployApiTaskResponseBody</p>
     */
    public static class DeployedResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeployedResult")
        private java.util.List<DeployedResult> deployedResult;

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
        public java.util.List<DeployedResult> getDeployedResult() {
            return this.deployedResult;
        }

        public static final class Builder {
            private java.util.List<DeployedResult> deployedResult; 

            /**
             * DeployedResult.
             */
            public Builder deployedResult(java.util.List<DeployedResult> deployedResult) {
                this.deployedResult = deployedResult;
                return this;
            }

            public DeployedResults build() {
                return new DeployedResults(this);
            } 

        } 

    }
}
