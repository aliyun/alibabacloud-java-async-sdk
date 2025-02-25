// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link ListPipelinesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPipelinesResponseBody</p>
 */
public class ListPipelinesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("pipelines")
    private java.util.List<Pipelines> pipelines;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private ListPipelinesResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.nextToken = builder.nextToken;
        this.pipelines = builder.pipelines;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelinesResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pipelines
     */
    public java.util.List<Pipelines> getPipelines() {
        return this.pipelines;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String nextToken; 
        private java.util.List<Pipelines> pipelines; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * pipelines.
         */
        public Builder pipelines(java.util.List<Pipelines> pipelines) {
            this.pipelines = pipelines;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPipelinesResponseBody build() {
            return new ListPipelinesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPipelinesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPipelinesResponseBody</p>
     */
    public static class Pipelines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("creatorAccountId")
        private String creatorAccountId;

        @com.aliyun.core.annotation.NameInMap("groupId")
        private Long groupId;

        @com.aliyun.core.annotation.NameInMap("pipelineId")
        private Long pipelineId;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        private Pipelines(Builder builder) {
            this.createTime = builder.createTime;
            this.creatorAccountId = builder.creatorAccountId;
            this.groupId = builder.groupId;
            this.pipelineId = builder.pipelineId;
            this.pipelineName = builder.pipelineName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pipelines create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creatorAccountId
         */
        public String getCreatorAccountId() {
            return this.creatorAccountId;
        }

        /**
         * @return groupId
         */
        public Long getGroupId() {
            return this.groupId;
        }

        /**
         * @return pipelineId
         */
        public Long getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        public static final class Builder {
            private Long createTime; 
            private String creatorAccountId; 
            private Long groupId; 
            private Long pipelineId; 
            private String pipelineName; 

            /**
             * createTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * creatorAccountId.
             */
            public Builder creatorAccountId(String creatorAccountId) {
                this.creatorAccountId = creatorAccountId;
                return this;
            }

            /**
             * groupId.
             */
            public Builder groupId(Long groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * pipelineId.
             */
            public Builder pipelineId(Long pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * pipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            public Pipelines build() {
                return new Pipelines(this);
            } 

        } 

    }
}
