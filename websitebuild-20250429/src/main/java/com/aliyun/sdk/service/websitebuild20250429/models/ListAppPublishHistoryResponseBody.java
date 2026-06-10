// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link ListAppPublishHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppPublishHistoryResponseBody</p>
 */
public class ListAppPublishHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("AllowRetry")
    private Boolean allowRetry;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("DynamicCode")
    private String dynamicCode;

    @com.aliyun.core.annotation.NameInMap("DynamicMessage")
    private String dynamicMessage;

    @com.aliyun.core.annotation.NameInMap("ErrorArgs")
    private java.util.List<?> errorArgs;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Module")
    private Module module;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RootErrorCode")
    private String rootErrorCode;

    @com.aliyun.core.annotation.NameInMap("RootErrorMsg")
    private String rootErrorMsg;

    @com.aliyun.core.annotation.NameInMap("Synchro")
    private Boolean synchro;

    private ListAppPublishHistoryResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.allowRetry = builder.allowRetry;
        this.appName = builder.appName;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorArgs = builder.errorArgs;
        this.maxResults = builder.maxResults;
        this.module = builder.module;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rootErrorCode = builder.rootErrorCode;
        this.rootErrorMsg = builder.rootErrorMsg;
        this.synchro = builder.synchro;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppPublishHistoryResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return allowRetry
     */
    public Boolean getAllowRetry() {
        return this.allowRetry;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorArgs
     */
    public java.util.List<?> getErrorArgs() {
        return this.errorArgs;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return module
     */
    public Module getModule() {
        return this.module;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rootErrorCode
     */
    public String getRootErrorCode() {
        return this.rootErrorCode;
    }

    /**
     * @return rootErrorMsg
     */
    public String getRootErrorMsg() {
        return this.rootErrorMsg;
    }

    /**
     * @return synchro
     */
    public Boolean getSynchro() {
        return this.synchro;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private Boolean allowRetry; 
        private String appName; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private java.util.List<?> errorArgs; 
        private Integer maxResults; 
        private Module module; 
        private String nextToken; 
        private String requestId; 
        private String rootErrorCode; 
        private String rootErrorMsg; 
        private Boolean synchro; 

        private Builder() {
        } 

        private Builder(ListAppPublishHistoryResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.allowRetry = model.allowRetry;
            this.appName = model.appName;
            this.dynamicCode = model.dynamicCode;
            this.dynamicMessage = model.dynamicMessage;
            this.errorArgs = model.errorArgs;
            this.maxResults = model.maxResults;
            this.module = model.module;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.rootErrorCode = model.rootErrorCode;
            this.rootErrorMsg = model.rootErrorMsg;
            this.synchro = model.synchro;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * AllowRetry.
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorArgs.
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * Module.
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>6C6B99AC-39EC-5350-874C-204128C905E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RootErrorCode.
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * RootErrorMsg.
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * Synchro.
         */
        public Builder synchro(Boolean synchro) {
            this.synchro = synchro;
            return this;
        }

        public ListAppPublishHistoryResponseBody build() {
            return new ListAppPublishHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAppPublishHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPublishHistoryResponseBody</p>
     */
    public static class History extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CanQuickRevert")
        private String canQuickRevert;

        @com.aliyun.core.annotation.NameInMap("CommitHash")
        private String commitHash;

        @com.aliyun.core.annotation.NameInMap("CurrentStep")
        private String currentStep;

        @com.aliyun.core.annotation.NameInMap("DeployChannel")
        private String deployChannel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorStep")
        private String errorStep;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("PublishNumber")
        private String publishNumber;

        @com.aliyun.core.annotation.NameInMap("PublishOrderId")
        private Long publishOrderId;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List<String> steps;

        @com.aliyun.core.annotation.NameInMap("Subchannel")
        private String subchannel;

        private History(Builder builder) {
            this.canQuickRevert = builder.canQuickRevert;
            this.commitHash = builder.commitHash;
            this.currentStep = builder.currentStep;
            this.deployChannel = builder.deployChannel;
            this.description = builder.description;
            this.errorStep = builder.errorStep;
            this.isFinish = builder.isFinish;
            this.isSuccess = builder.isSuccess;
            this.msg = builder.msg;
            this.orderType = builder.orderType;
            this.percent = builder.percent;
            this.publishNumber = builder.publishNumber;
            this.publishOrderId = builder.publishOrderId;
            this.publishTime = builder.publishTime;
            this.steps = builder.steps;
            this.subchannel = builder.subchannel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static History create() {
            return builder().build();
        }

        /**
         * @return canQuickRevert
         */
        public String getCanQuickRevert() {
            return this.canQuickRevert;
        }

        /**
         * @return commitHash
         */
        public String getCommitHash() {
            return this.commitHash;
        }

        /**
         * @return currentStep
         */
        public String getCurrentStep() {
            return this.currentStep;
        }

        /**
         * @return deployChannel
         */
        public String getDeployChannel() {
            return this.deployChannel;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return errorStep
         */
        public String getErrorStep() {
            return this.errorStep;
        }

        /**
         * @return isFinish
         */
        public Boolean getIsFinish() {
            return this.isFinish;
        }

        /**
         * @return isSuccess
         */
        public Boolean getIsSuccess() {
            return this.isSuccess;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return orderType
         */
        public String getOrderType() {
            return this.orderType;
        }

        /**
         * @return percent
         */
        public Integer getPercent() {
            return this.percent;
        }

        /**
         * @return publishNumber
         */
        public String getPublishNumber() {
            return this.publishNumber;
        }

        /**
         * @return publishOrderId
         */
        public Long getPublishOrderId() {
            return this.publishOrderId;
        }

        /**
         * @return publishTime
         */
        public String getPublishTime() {
            return this.publishTime;
        }

        /**
         * @return steps
         */
        public java.util.List<String> getSteps() {
            return this.steps;
        }

        /**
         * @return subchannel
         */
        public String getSubchannel() {
            return this.subchannel;
        }

        public static final class Builder {
            private String canQuickRevert; 
            private String commitHash; 
            private String currentStep; 
            private String deployChannel; 
            private String description; 
            private String errorStep; 
            private Boolean isFinish; 
            private Boolean isSuccess; 
            private String msg; 
            private String orderType; 
            private Integer percent; 
            private String publishNumber; 
            private Long publishOrderId; 
            private String publishTime; 
            private java.util.List<String> steps; 
            private String subchannel; 

            private Builder() {
            } 

            private Builder(History model) {
                this.canQuickRevert = model.canQuickRevert;
                this.commitHash = model.commitHash;
                this.currentStep = model.currentStep;
                this.deployChannel = model.deployChannel;
                this.description = model.description;
                this.errorStep = model.errorStep;
                this.isFinish = model.isFinish;
                this.isSuccess = model.isSuccess;
                this.msg = model.msg;
                this.orderType = model.orderType;
                this.percent = model.percent;
                this.publishNumber = model.publishNumber;
                this.publishOrderId = model.publishOrderId;
                this.publishTime = model.publishTime;
                this.steps = model.steps;
                this.subchannel = model.subchannel;
            } 

            /**
             * CanQuickRevert.
             */
            public Builder canQuickRevert(String canQuickRevert) {
                this.canQuickRevert = canQuickRevert;
                return this;
            }

            /**
             * CommitHash.
             */
            public Builder commitHash(String commitHash) {
                this.commitHash = commitHash;
                return this;
            }

            /**
             * CurrentStep.
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * DeployChannel.
             */
            public Builder deployChannel(String deployChannel) {
                this.deployChannel = deployChannel;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * ErrorStep.
             */
            public Builder errorStep(String errorStep) {
                this.errorStep = errorStep;
                return this;
            }

            /**
             * IsFinish.
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * IsSuccess.
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * Msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * OrderType.
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * Percent.
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * PublishNumber.
             */
            public Builder publishNumber(String publishNumber) {
                this.publishNumber = publishNumber;
                return this;
            }

            /**
             * PublishOrderId.
             */
            public Builder publishOrderId(Long publishOrderId) {
                this.publishOrderId = publishOrderId;
                return this;
            }

            /**
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ss.SSSZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026</p>
             */
            public Builder publishTime(String publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            /**
             * Steps.
             */
            public Builder steps(java.util.List<String> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * Subchannel.
             */
            public Builder subchannel(String subchannel) {
                this.subchannel = subchannel;
                return this;
            }

            public History build() {
                return new History(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAppPublishHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAppPublishHistoryResponseBody</p>
     */
    public static class Module extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPublishOrderId")
        private Long currentPublishOrderId;

        @com.aliyun.core.annotation.NameInMap("History")
        private java.util.List<History> history;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Integer total;

        private Module(Builder builder) {
            this.currentPublishOrderId = builder.currentPublishOrderId;
            this.history = builder.history;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Module create() {
            return builder().build();
        }

        /**
         * @return currentPublishOrderId
         */
        public Long getCurrentPublishOrderId() {
            return this.currentPublishOrderId;
        }

        /**
         * @return history
         */
        public java.util.List<History> getHistory() {
            return this.history;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Long currentPublishOrderId; 
            private java.util.List<History> history; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer total; 

            private Builder() {
            } 

            private Builder(Module model) {
                this.currentPublishOrderId = model.currentPublishOrderId;
                this.history = model.history;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.total = model.total;
            } 

            /**
             * CurrentPublishOrderId.
             */
            public Builder currentPublishOrderId(Long currentPublishOrderId) {
                this.currentPublishOrderId = currentPublishOrderId;
                return this;
            }

            /**
             * History.
             */
            public Builder history(java.util.List<History> history) {
                this.history = history;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Module build() {
                return new Module(this);
            } 

        } 

    }
}
