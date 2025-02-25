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
 * {@link UpdatePushRuleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePushRuleResponseBody</p>
 */
public class UpdatePushRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private UpdatePushRuleResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePushRuleResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdatePushRuleResponseBody build() {
            return new UpdatePushRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePushRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePushRuleResponseBody</p>
     */
    public static class RuleInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("checkerName")
        private String checkerName;

        @com.aliyun.core.annotation.NameInMap("checkerType")
        private String checkerType;

        @com.aliyun.core.annotation.NameInMap("extraMessage")
        private String extraMessage;

        @com.aliyun.core.annotation.NameInMap("fileRuleRegexes")
        private java.util.List<String> fileRuleRegexes;

        private RuleInfos(Builder builder) {
            this.checkerName = builder.checkerName;
            this.checkerType = builder.checkerType;
            this.extraMessage = builder.extraMessage;
            this.fileRuleRegexes = builder.fileRuleRegexes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuleInfos create() {
            return builder().build();
        }

        /**
         * @return checkerName
         */
        public String getCheckerName() {
            return this.checkerName;
        }

        /**
         * @return checkerType
         */
        public String getCheckerType() {
            return this.checkerType;
        }

        /**
         * @return extraMessage
         */
        public String getExtraMessage() {
            return this.extraMessage;
        }

        /**
         * @return fileRuleRegexes
         */
        public java.util.List<String> getFileRuleRegexes() {
            return this.fileRuleRegexes;
        }

        public static final class Builder {
            private String checkerName; 
            private String checkerType; 
            private String extraMessage; 
            private java.util.List<String> fileRuleRegexes; 

            /**
             * checkerName.
             */
            public Builder checkerName(String checkerName) {
                this.checkerName = checkerName;
                return this;
            }

            /**
             * checkerType.
             */
            public Builder checkerType(String checkerType) {
                this.checkerType = checkerType;
                return this;
            }

            /**
             * extraMessage.
             */
            public Builder extraMessage(String extraMessage) {
                this.extraMessage = extraMessage;
                return this;
            }

            /**
             * fileRuleRegexes.
             */
            public Builder fileRuleRegexes(java.util.List<String> fileRuleRegexes) {
                this.fileRuleRegexes = fileRuleRegexes;
                return this;
            }

            public RuleInfos build() {
                return new RuleInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePushRuleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePushRuleResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ruleInfos")
        private java.util.List<RuleInfos> ruleInfos;

        private Result(Builder builder) {
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.ruleInfos = builder.ruleInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ruleInfos
         */
        public java.util.List<RuleInfos> getRuleInfos() {
            return this.ruleInfos;
        }

        public static final class Builder {
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private java.util.List<RuleInfos> ruleInfos; 

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ruleInfos.
             */
            public Builder ruleInfos(java.util.List<RuleInfos> ruleInfos) {
                this.ruleInfos = ruleInfos;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
