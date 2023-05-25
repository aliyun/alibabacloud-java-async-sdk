// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpdateVpcInfoTaskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUpdateVpcInfoTaskResponseBody</p>
 */
public class DescribeUpdateVpcInfoTaskResponseBody extends TeaModel {
    @NameInMap("ApiUpdateVpcInfoResults")
    private ApiUpdateVpcInfoResults apiUpdateVpcInfoResults;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeUpdateVpcInfoTaskResponseBody(Builder builder) {
        this.apiUpdateVpcInfoResults = builder.apiUpdateVpcInfoResults;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpdateVpcInfoTaskResponseBody create() {
        return builder().build();
    }

    /**
     * @return apiUpdateVpcInfoResults
     */
    public ApiUpdateVpcInfoResults getApiUpdateVpcInfoResults() {
        return this.apiUpdateVpcInfoResults;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ApiUpdateVpcInfoResults apiUpdateVpcInfoResults; 
        private String requestId; 

        /**
         * ApiUpdateVpcInfoResults.
         */
        public Builder apiUpdateVpcInfoResults(ApiUpdateVpcInfoResults apiUpdateVpcInfoResults) {
            this.apiUpdateVpcInfoResults = apiUpdateVpcInfoResults;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeUpdateVpcInfoTaskResponseBody build() {
            return new DescribeUpdateVpcInfoTaskResponseBody(this);
        } 

    } 

    public static class ApiUpdateVpcInfoResult extends TeaModel {
        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("ApiUid")
        private String apiUid;

        @NameInMap("ErrorMsg")
        private String errorMsg;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("GroupName")
        private String groupName;

        @NameInMap("StageId")
        private String stageId;

        @NameInMap("StageName")
        private String stageName;

        @NameInMap("UpdateStatus")
        private String updateStatus;

        private ApiUpdateVpcInfoResult(Builder builder) {
            this.apiName = builder.apiName;
            this.apiUid = builder.apiUid;
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

        public static ApiUpdateVpcInfoResult create() {
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

            public ApiUpdateVpcInfoResult build() {
                return new ApiUpdateVpcInfoResult(this);
            } 

        } 

    }
    public static class ApiUpdateVpcInfoResults extends TeaModel {
        @NameInMap("ApiUpdateVpcInfoResult")
        private java.util.List < ApiUpdateVpcInfoResult> apiUpdateVpcInfoResult;

        private ApiUpdateVpcInfoResults(Builder builder) {
            this.apiUpdateVpcInfoResult = builder.apiUpdateVpcInfoResult;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiUpdateVpcInfoResults create() {
            return builder().build();
        }

        /**
         * @return apiUpdateVpcInfoResult
         */
        public java.util.List < ApiUpdateVpcInfoResult> getApiUpdateVpcInfoResult() {
            return this.apiUpdateVpcInfoResult;
        }

        public static final class Builder {
            private java.util.List < ApiUpdateVpcInfoResult> apiUpdateVpcInfoResult; 

            /**
             * ApiUpdateVpcInfoResult.
             */
            public Builder apiUpdateVpcInfoResult(java.util.List < ApiUpdateVpcInfoResult> apiUpdateVpcInfoResult) {
                this.apiUpdateVpcInfoResult = apiUpdateVpcInfoResult;
                return this;
            }

            public ApiUpdateVpcInfoResults build() {
                return new ApiUpdateVpcInfoResults(this);
            } 

        } 

    }
}
