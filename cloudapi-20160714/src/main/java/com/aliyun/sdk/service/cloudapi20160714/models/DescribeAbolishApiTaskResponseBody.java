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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeAbolishApiTaskResponseBody model) {
            this.apiAbolishResults = model.apiAbolishResults;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The result returned.</p>
         */
        public Builder apiAbolishResults(ApiAbolishResults apiAbolishResults) {
            this.apiAbolishResults = apiAbolishResults;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E8515BA6-81CD-4191-A7CF-C4FCDD3C0D99</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAbolishApiTaskResponseBody build() {
            return new DescribeAbolishApiTaskResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAbolishApiTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbolishApiTaskResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ApiAbolishResult model) {
                this.abolishStatus = model.abolishStatus;
                this.apiName = model.apiName;
                this.apiUid = model.apiUid;
                this.errorMsg = model.errorMsg;
                this.groupId = model.groupId;
                this.groupName = model.groupName;
                this.stageId = model.stageId;
                this.stageName = model.stageName;
            } 

            /**
             * <p>The unpublishing status.</p>
             * 
             * <strong>example:</strong>
             * <p>OVER</p>
             */
            public Builder abolishStatus(String abolishStatus) {
                this.abolishStatus = abolishStatus;
                return this;
            }

            /**
             * <p>The name of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>v2_page_consent</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The ID of the API.</p>
             * 
             * <strong>example:</strong>
             * <p>4e26cdbbb113416dba1f0285bed29979</p>
             */
            public Builder apiUid(String apiUid) {
                this.apiUid = apiUid;
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
             * <p>160cb6505e1c43a6b84346856d74eb47</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the API group.</p>
             * 
             * <strong>example:</strong>
             * <p>wb2022021401619286</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The ID of the runtime environment.</p>
             * 
             * <strong>example:</strong>
             * <p>0919f2854a88484c91dc9253347c78f9</p>
             */
            public Builder stageId(String stageId) {
                this.stageId = stageId;
                return this;
            }

            /**
             * <p>The name of the runtime environment. Valid values:</p>
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

            public ApiAbolishResult build() {
                return new ApiAbolishResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAbolishApiTaskResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAbolishApiTaskResponseBody</p>
     */
    public static class ApiAbolishResults extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiAbolishResult")
        private java.util.List<ApiAbolishResult> apiAbolishResult;

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
        public java.util.List<ApiAbolishResult> getApiAbolishResult() {
            return this.apiAbolishResult;
        }

        public static final class Builder {
            private java.util.List<ApiAbolishResult> apiAbolishResult; 

            private Builder() {
            } 

            private Builder(ApiAbolishResults model) {
                this.apiAbolishResult = model.apiAbolishResult;
            } 

            /**
             * ApiAbolishResult.
             */
            public Builder apiAbolishResult(java.util.List<ApiAbolishResult> apiAbolishResult) {
                this.apiAbolishResult = apiAbolishResult;
                return this;
            }

            public ApiAbolishResults build() {
                return new ApiAbolishResults(this);
            } 

        } 

    }
}
