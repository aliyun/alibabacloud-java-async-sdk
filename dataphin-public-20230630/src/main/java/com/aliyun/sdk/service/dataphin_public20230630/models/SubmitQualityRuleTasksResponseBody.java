// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link SubmitQualityRuleTasksResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitQualityRuleTasksResponseBody</p>
 */
public class SubmitQualityRuleTasksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubmitResult")
    private SubmitResult submitResult;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private SubmitQualityRuleTasksResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.submitResult = builder.submitResult;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitQualityRuleTasksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return submitResult
     */
    public SubmitResult getSubmitResult() {
        return this.submitResult;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private SubmitResult submitResult; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(SubmitQualityRuleTasksResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.submitResult = model.submitResult;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SubmitResult.
         */
        public Builder submitResult(SubmitResult submitResult) {
            this.submitResult = submitResult;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public SubmitQualityRuleTasksResponseBody build() {
            return new SubmitQualityRuleTasksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SubmitQualityRuleTasksResponseBody} extends {@link TeaModel}
     *
     * <p>SubmitQualityRuleTasksResponseBody</p>
     */
    public static class SubmitResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RuleTaskIdList")
        private java.util.List<Long> ruleTaskIdList;

        @com.aliyun.core.annotation.NameInMap("WatchTaskIdList")
        private java.util.List<Long> watchTaskIdList;

        private SubmitResult(Builder builder) {
            this.ruleTaskIdList = builder.ruleTaskIdList;
            this.watchTaskIdList = builder.watchTaskIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubmitResult create() {
            return builder().build();
        }

        /**
         * @return ruleTaskIdList
         */
        public java.util.List<Long> getRuleTaskIdList() {
            return this.ruleTaskIdList;
        }

        /**
         * @return watchTaskIdList
         */
        public java.util.List<Long> getWatchTaskIdList() {
            return this.watchTaskIdList;
        }

        public static final class Builder {
            private java.util.List<Long> ruleTaskIdList; 
            private java.util.List<Long> watchTaskIdList; 

            private Builder() {
            } 

            private Builder(SubmitResult model) {
                this.ruleTaskIdList = model.ruleTaskIdList;
                this.watchTaskIdList = model.watchTaskIdList;
            } 

            /**
             * RuleTaskIdList.
             */
            public Builder ruleTaskIdList(java.util.List<Long> ruleTaskIdList) {
                this.ruleTaskIdList = ruleTaskIdList;
                return this;
            }

            /**
             * WatchTaskIdList.
             */
            public Builder watchTaskIdList(java.util.List<Long> watchTaskIdList) {
                this.watchTaskIdList = watchTaskIdList;
                return this;
            }

            public SubmitResult build() {
                return new SubmitResult(this);
            } 

        } 

    }
}
