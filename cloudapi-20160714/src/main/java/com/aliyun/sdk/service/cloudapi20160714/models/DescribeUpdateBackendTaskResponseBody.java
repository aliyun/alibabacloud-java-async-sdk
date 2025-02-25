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
 * {@link DescribeUpdateBackendTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpdateBackendTaskResponseBody</p>
 */
public class DescribeUpdateBackendTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiUpdateBackendResults")
    private ApiUpdateBackendResults apiUpdateBackendResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeUpdateBackendTaskResponseBody(Builder builder) {
        this.apiUpdateBackendResults = builder.apiUpdateBackendResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpdateBackendTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiUpdateBackendResults
     */
    public ApiUpdateBackendResults getApiUpdateBackendResults() {
        return this.apiUpdateBackendResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiUpdateBackendResults apiUpdateBackendResults; 
        private String requestId; 

        /**
         * ApiUpdateBackendResults.
         */
        public Builder apiUpdateBackendResults(ApiUpdateBackendResults apiUpdateBackendResults) {
            this.apiUpdateBackendResults = apiUpdateBackendResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpdateBackendTaskResponseBody build() {
            return new DescribeUpdateBackendTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUpdateBackendTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpdateBackendTaskResponseBody</p>
     */
    public static class ApiUpdateBackendResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiUid")
        private String apiUid;

        @com.aliyun.core.annotation.NameInMap("BackendId")
        private String backendId;

        @com.aliyun.core.annotation.NameInMap("ErrorMsg")
        private String errorMsg;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("StageId")
        private String stageId;

        @com.aliyun.core.annotation.NameInMap("StageName")
        private String stageName;

        @com.aliyun.core.annotation.NameInMap("UpdateStatus")
        private String updateStatus;

        private ApiUpdateBackendResult(Builder builder) {
            this.apiName = builder.apiName;
            this.apiUid = builder.apiUid;
            this.backendId = builder.backendId;
            this.errorMsg = builder.errorMsg;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
            this.updateStatus = builder.updateStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiUpdateBackendResult create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return apiUid
         */
        public String getApiUid() {
            return this.apiUid;
        }

        /**
         * @return backendId
         */
        public String getBackendId() {
            return this.backendId;
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
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return stageId
         */
        public String getStageId() {
            return this.stageId;
        }

        /**
         * @return stageName
         */
        public String getStageName() {
            return this.stageName;
        }

        /**
         * @return updateStatus
         */
        public String getUpdateStatus() {
            return this.updateStatus;
        }

        public static final class Builder {
            private String apiName; 
            private String apiUid; 
            private String backendId; 
            private String errorMsg; 
            private String groupId; 
            private String groupName; 
            private String stageId; 
            private String stageName; 
            private String updateStatus; 

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * ApiUid.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * BackendId.
             */
            public Builder backendId(String backendId) {
                this.backendId = backendId;
                return this;
            }

            /**
             * ErrorMsg.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * GroupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * StageId.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * StageName.
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            /**
             * UpdateStatus.
             */
            public Builder updateStatus(String updateStatus) {
                this.updateStatus = updateStatus;
                return this;
            }

            public ApiUpdateBackendResult build() {
                return new ApiUpdateBackendResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeUpdateBackendTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUpdateBackendTaskResponseBody</p>
     */
    public static class ApiUpdateBackendResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiUpdateBackendResult")
        private java.util.List<ApiUpdateBackendResult> apiUpdateBackendResult;

        private ApiUpdateBackendResults(Builder builder) {
            this.apiUpdateBackendResult = builder.apiUpdateBackendResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiUpdateBackendResults create() {
            return builder().build();
        }

        /**
         * @return apiUpdateBackendResult
         */
        public java.util.List<ApiUpdateBackendResult> getApiUpdateBackendResult() {
            return this.apiUpdateBackendResult;
        }

        public static final class Builder {
            private java.util.List<ApiUpdateBackendResult> apiUpdateBackendResult; 

            /**
             * ApiUpdateBackendResult.
             */
            public Builder apiUpdateBackendResult(java.util.List<ApiUpdateBackendResult> apiUpdateBackendResult) {
                this.apiUpdateBackendResult = apiUpdateBackendResult;
                return this;
            }

            public ApiUpdateBackendResults build() {
                return new ApiUpdateBackendResults(this);
            } 

        } 

    }
}
