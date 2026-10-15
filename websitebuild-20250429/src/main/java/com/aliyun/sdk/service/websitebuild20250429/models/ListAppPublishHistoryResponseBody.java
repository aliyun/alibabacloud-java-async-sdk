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
         * <p>The details of the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Indicates whether retries are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>False</p>
         */
        public Builder allowRetry(Boolean allowRetry) {
            this.allowRetry = allowRetry;
            return this;
        }

        /**
         * <p>The name of the frontend application.</p>
         * 
         * <strong>example:</strong>
         * <p>spring-cloud-b</p>
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * <p>The dynamic error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ERROR-oo1</p>
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * <p>The dynamic message. This parameter is not used and can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         */
        public Builder errorArgs(java.util.List<?> errorArgs) {
            this.errorArgs = errorArgs;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for a single query. Valid values: 10 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The data table module. Valid values:</p>
         * <ul>
         * <li>ABTest: experiment data table</li>
         * <li>ExperimentTool: experiment tool table</li>
         * <li>DataDiagnosis: data diagnostics</li>
         * </ul>
         */
        public Builder module(Module module) {
            this.module = module;
            return this;
        }

        /**
         * <p>The token used to start the next query. This parameter is empty if no next query is available.</p>
         * 
         * <strong>example:</strong>
         * <p>0l45bkwM022Dt+rOvPi/oQ==</p>
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
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM.ERROR</p>
         */
        public Builder rootErrorCode(String rootErrorCode) {
            this.rootErrorCode = rootErrorCode;
            return this;
        }

        /**
         * <p>The exception message.</p>
         * 
         * <strong>example:</strong>
         * <p>System exception</p>
         */
        public Builder rootErrorMsg(String rootErrorMsg) {
            this.rootErrorMsg = rootErrorMsg;
            return this;
        }

        /**
         * <p>The reserved parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
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

        @com.aliyun.core.annotation.NameInMap("CurrentStepCode")
        private String currentStepCode;

        @com.aliyun.core.annotation.NameInMap("DeployChannel")
        private String deployChannel;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ErrorStep")
        private String errorStep;

        @com.aliyun.core.annotation.NameInMap("ErrorStepCode")
        private String errorStepCode;

        @com.aliyun.core.annotation.NameInMap("IsFinish")
        private Boolean isFinish;

        @com.aliyun.core.annotation.NameInMap("IsSuccess")
        private Boolean isSuccess;

        @com.aliyun.core.annotation.NameInMap("Msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private String orderType;

        @com.aliyun.core.annotation.NameInMap("OrderTypeCode")
        private String orderTypeCode;

        @com.aliyun.core.annotation.NameInMap("Percent")
        private Integer percent;

        @com.aliyun.core.annotation.NameInMap("PublishNumber")
        private String publishNumber;

        @com.aliyun.core.annotation.NameInMap("PublishOrderId")
        private Long publishOrderId;

        @com.aliyun.core.annotation.NameInMap("PublishTime")
        private String publishTime;

        @com.aliyun.core.annotation.NameInMap("StepCodes")
        private java.util.List<String> stepCodes;

        @com.aliyun.core.annotation.NameInMap("Steps")
        private java.util.List<String> steps;

        @com.aliyun.core.annotation.NameInMap("Subchannel")
        private String subchannel;

        private History(Builder builder) {
            this.canQuickRevert = builder.canQuickRevert;
            this.commitHash = builder.commitHash;
            this.currentStep = builder.currentStep;
            this.currentStepCode = builder.currentStepCode;
            this.deployChannel = builder.deployChannel;
            this.description = builder.description;
            this.errorStep = builder.errorStep;
            this.errorStepCode = builder.errorStepCode;
            this.isFinish = builder.isFinish;
            this.isSuccess = builder.isSuccess;
            this.msg = builder.msg;
            this.orderType = builder.orderType;
            this.orderTypeCode = builder.orderTypeCode;
            this.percent = builder.percent;
            this.publishNumber = builder.publishNumber;
            this.publishOrderId = builder.publishOrderId;
            this.publishTime = builder.publishTime;
            this.stepCodes = builder.stepCodes;
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
         * @return currentStepCode
         */
        public String getCurrentStepCode() {
            return this.currentStepCode;
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
         * @return errorStepCode
         */
        public String getErrorStepCode() {
            return this.errorStepCode;
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
         * @return orderTypeCode
         */
        public String getOrderTypeCode() {
            return this.orderTypeCode;
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
         * @return stepCodes
         */
        public java.util.List<String> getStepCodes() {
            return this.stepCodes;
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
            private String currentStepCode; 
            private String deployChannel; 
            private String description; 
            private String errorStep; 
            private String errorStepCode; 
            private Boolean isFinish; 
            private Boolean isSuccess; 
            private String msg; 
            private String orderType; 
            private String orderTypeCode; 
            private Integer percent; 
            private String publishNumber; 
            private Long publishOrderId; 
            private String publishTime; 
            private java.util.List<String> stepCodes; 
            private java.util.List<String> steps; 
            private String subchannel; 

            private Builder() {
            } 

            private Builder(History model) {
                this.canQuickRevert = model.canQuickRevert;
                this.commitHash = model.commitHash;
                this.currentStep = model.currentStep;
                this.currentStepCode = model.currentStepCode;
                this.deployChannel = model.deployChannel;
                this.description = model.description;
                this.errorStep = model.errorStep;
                this.errorStepCode = model.errorStepCode;
                this.isFinish = model.isFinish;
                this.isSuccess = model.isSuccess;
                this.msg = model.msg;
                this.orderType = model.orderType;
                this.orderTypeCode = model.orderTypeCode;
                this.percent = model.percent;
                this.publishNumber = model.publishNumber;
                this.publishOrderId = model.publishOrderId;
                this.publishTime = model.publishTime;
                this.stepCodes = model.stepCodes;
                this.steps = model.steps;
                this.subchannel = model.subchannel;
            } 

            /**
             * <p>Indicates whether quick rollback is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canQuickRevert(String canQuickRevert) {
                this.canQuickRevert = canQuickRevert;
                return this;
            }

            /**
             * <p>The commit hash of the code.</p>
             */
            public Builder commitHash(String commitHash) {
                this.commitHash = commitHash;
                return this;
            }

            /**
             * <p>The current step number.</p>
             * 
             * <strong>example:</strong>
             * <p>PRE_CHECK</p>
             */
            public Builder currentStep(String currentStep) {
                this.currentStep = currentStep;
                return this;
            }

            /**
             * <p>The code of the current release step.</p>
             */
            public Builder currentStepCode(String currentStepCode) {
                this.currentStepCode = currentStepCode;
                return this;
            }

            /**
             * <p>The deployment channel.</p>
             * 
             * <strong>example:</strong>
             * <p>PC</p>
             */
            public Builder deployChannel(String deployChannel) {
                this.deployChannel = deployChannel;
                return this;
            }

            /**
             * <p>The application description.</p>
             * 
             * <strong>example:</strong>
             * <p>PSKB</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The release process.</p>
             * 
             * <strong>example:</strong>
             * <p>error</p>
             */
            public Builder errorStep(String errorStep) {
                this.errorStep = errorStep;
                return this;
            }

            /**
             * <p>The code of the release step where the error occurred.</p>
             */
            public Builder errorStepCode(String errorStepCode) {
                this.errorStepCode = errorStepCode;
                return this;
            }

            /**
             * <p>Indicates whether the operation is completed.</p>
             */
            public Builder isFinish(Boolean isFinish) {
                this.isFinish = isFinish;
                return this;
            }

            /**
             * <p>Indicates whether the resource allocation for the financial unit is successful. Valid values:</p>
             * <ul>
             * <li>true: successful</li>
             * <li>false: failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder isSuccess(Boolean isSuccess) {
                this.isSuccess = isSuccess;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>The sort order. Valid values: ASC and DESC.</p>
             * 
             * <strong>example:</strong>
             * <p>DESC</p>
             */
            public Builder orderType(String orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * <p>The code of the release order type.</p>
             */
            public Builder orderTypeCode(String orderTypeCode) {
                this.orderTypeCode = orderTypeCode;
                return this;
            }

            /**
             * <p>The transcoding progress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder percent(Integer percent) {
                this.percent = percent;
                return this;
            }

            /**
             * <p>The release number.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder publishNumber(String publishNumber) {
                this.publishNumber = publishNumber;
                return this;
            }

            /**
             * <p>The release order ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder publishOrderId(Long publishOrderId) {
                this.publishOrderId = publishOrderId;
                return this;
            }

            /**
             * <p>The release time, in the UTC format yyyy-MM-dd\&quot;T\&quot;HH:mm:ss.SSS\&quot;Z\&quot;.</p>
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
             * <p>The list of release step codes.</p>
             */
            public Builder stepCodes(java.util.List<String> stepCodes) {
                this.stepCodes = stepCodes;
                return this;
            }

            /**
             * <p>The specific configurations of the component.</p>
             */
            public Builder steps(java.util.List<String> steps) {
                this.steps = steps;
                return this;
            }

            /**
             * <p>The release subchannel.</p>
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
             * <p>The ID of the current release order.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder currentPublishOrderId(Long currentPublishOrderId) {
                this.currentPublishOrderId = currentPublishOrderId;
                return this;
            }

            /**
             * <p>Specifies whether to display the history of applying alert templates to application groups. Valid values:</p>
             * <ul>
             * <li>true: displayed.</li>
             * <li>false: not displayed. Default value.</li>
             * </ul>
             */
            public Builder history(java.util.List<History> history) {
                this.history = history;
                return this;
            }

            /**
             * <p>The page number. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The page size.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
