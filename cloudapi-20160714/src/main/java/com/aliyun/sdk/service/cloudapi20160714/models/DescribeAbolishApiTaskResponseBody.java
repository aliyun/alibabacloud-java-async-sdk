// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAbolishApiTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAbolishApiTaskResponseBody</p>
 */
public class DescribeAbolishApiTaskResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApiAbolishResults")
    private ApiAbolishResults apiAbolishResults;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeAbolishApiTaskResponseBody(Builder builder) {
        this.apiAbolishResults = builder.apiAbolishResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAbolishApiTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiAbolishResults
     */
    public ApiAbolishResults getApiAbolishResults() {
        return this.apiAbolishResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiAbolishResults apiAbolishResults; 
        private String requestId; 

        /**
         * The result returned.
         */
        public Builder apiAbolishResults(ApiAbolishResults apiAbolishResults) {
            this.apiAbolishResults = apiAbolishResults;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAbolishApiTaskResponseBody build() {
            return new DescribeAbolishApiTaskResponseBody(this);
        } 

    } 

    public static class ApiAbolishResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AbolishStatus")
        private String abolishStatus;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("ApiUid")
        private String apiUid;

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

        private ApiAbolishResult(Builder builder) {
            this.abolishStatus = builder.abolishStatus;
            this.apiName = builder.apiName;
            this.apiUid = builder.apiUid;
            this.errorMsg = builder.errorMsg;
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
            this.stageId = builder.stageId;
            this.stageName = builder.stageName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiAbolishResult create() {
            return builder().build();
        }

        /**
         * @return abolishStatus
         */
        public String getAbolishStatus() {
            return this.abolishStatus;
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

        public static final class Builder {
            private String abolishStatus; 
            private String apiName; 
            private String apiUid; 
            private String errorMsg; 
            private String groupId; 
            private String groupName; 
            private String stageId; 
            private String stageName; 

            /**
             * The unpublishing status.
             */
            public Builder abolishStatus(String abolishStatus) {
                this.abolishStatus = abolishStatus;
                return this;
            }

            /**
             * The name of the API.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The ID of the API.
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
                return this;
            }

            /**
             * The error message.
             */
            public Builder errorMsg(String errorMsg) {
                this.errorMsg = errorMsg;
                return this;
            }

            /**
             * The ID of the API group.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * The name of the API group.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * The ID of the runtime environment.
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * The name of the runtime environment. Valid values:
             * <p>
             * 
             * *   **RELEASE**
             * *   **TEST**
             */
            public Builder stageName(String stageName) {
                this.stageName = stageName;
                return this;
            }

            public ApiAbolishResult build() {
                return new ApiAbolishResult(this);
            } 

        } 

    }
    public static class ApiAbolishResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiAbolishResult")
        private java.util.List < ApiAbolishResult> apiAbolishResult;

        private ApiAbolishResults(Builder builder) {
            this.apiAbolishResult = builder.apiAbolishResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiAbolishResults create() {
            return builder().build();
        }

        /**
         * @return apiAbolishResult
         */
        public java.util.List < ApiAbolishResult> getApiAbolishResult() {
            return this.apiAbolishResult;
        }

        public static final class Builder {
            private java.util.List < ApiAbolishResult> apiAbolishResult; 

            /**
             * ApiAbolishResult.
             */
            public Builder apiAbolishResult(java.util.List < ApiAbolishResult> apiAbolishResult) {
                this.apiAbolishResult = apiAbolishResult;
                return this;
            }

            public ApiAbolishResults build() {
                return new ApiAbolishResults(this);
            } 

        } 

    }
}
