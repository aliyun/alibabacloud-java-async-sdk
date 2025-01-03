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
 * {@link GetTestResultListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTestResultListResponseBody</p>
 */
public class GetTestResultListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("testResult")
    private java.util.List<TestResult> testResult;

    private GetTestResultListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.testResult = builder.testResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTestResultListResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
     * @return testResult
     */
    public java.util.List<TestResult> getTestResult() {
        return this.testResult;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private java.util.List<TestResult> testResult; 

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
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
         * testResult.
         */
        public Builder testResult(java.util.List<TestResult> testResult) {
            this.testResult = testResult;
            return this;
        }

        public GetTestResultListResponseBody build() {
            return new GetTestResultListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetTestResultListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTestResultListResponseBody</p>
     */
    public static class AssignedTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedToIdenttifier")
        private String assignedToIdenttifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private AssignedTo(Builder builder) {
            this.assignedToIdenttifier = builder.assignedToIdenttifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignedTo create() {
            return builder().build();
        }

        /**
         * @return assignedToIdenttifier
         */
        public String getAssignedToIdenttifier() {
            return this.assignedToIdenttifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String assignedToIdenttifier; 
            private String name; 

            /**
             * assignedToIdenttifier.
             */
            public Builder assignedToIdenttifier(String assignedToIdenttifier) {
                this.assignedToIdenttifier = assignedToIdenttifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public AssignedTo build() {
                return new AssignedTo(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTestResultListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTestResultListResponseBody</p>
     */
    public static class CustomFields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("fieldClassName")
        private String fieldClassName;

        @com.aliyun.core.annotation.NameInMap("fieldFormat")
        private String fieldFormat;

        @com.aliyun.core.annotation.NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private CustomFields(Builder builder) {
            this.fieldClassName = builder.fieldClassName;
            this.fieldFormat = builder.fieldFormat;
            this.fieldIdentifier = builder.fieldIdentifier;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomFields create() {
            return builder().build();
        }

        /**
         * @return fieldClassName
         */
        public String getFieldClassName() {
            return this.fieldClassName;
        }

        /**
         * @return fieldFormat
         */
        public String getFieldFormat() {
            return this.fieldFormat;
        }

        /**
         * @return fieldIdentifier
         */
        public String getFieldIdentifier() {
            return this.fieldIdentifier;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String fieldClassName; 
            private String fieldFormat; 
            private String fieldIdentifier; 
            private String value; 

            /**
             * fieldClassName.
             */
            public Builder fieldClassName(String fieldClassName) {
                this.fieldClassName = fieldClassName;
                return this;
            }

            /**
             * fieldFormat.
             */
            public Builder fieldFormat(String fieldFormat) {
                this.fieldFormat = fieldFormat;
                return this;
            }

            /**
             * fieldIdentifier.
             */
            public Builder fieldIdentifier(String fieldIdentifier) {
                this.fieldIdentifier = fieldIdentifier;
                return this;
            }

            /**
             * value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public CustomFields build() {
                return new CustomFields(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTestResultListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTestResultListResponseBody</p>
     */
    public static class TestResultExecutor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("executorIdentifier")
        private String executorIdentifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private TestResultExecutor(Builder builder) {
            this.executorIdentifier = builder.executorIdentifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestResultExecutor create() {
            return builder().build();
        }

        /**
         * @return executorIdentifier
         */
        public String getExecutorIdentifier() {
            return this.executorIdentifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String executorIdentifier; 
            private String name; 

            /**
             * executorIdentifier.
             */
            public Builder executorIdentifier(String executorIdentifier) {
                this.executorIdentifier = executorIdentifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TestResultExecutor build() {
                return new TestResultExecutor(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetTestResultListResponseBody} extends {@link TeaModel}
     *
     * <p>GetTestResultListResponseBody</p>
     */
    public static class TestResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedTo")
        private AssignedTo assignedTo;

        @com.aliyun.core.annotation.NameInMap("bugCount")
        private Long bugCount;

        @com.aliyun.core.annotation.NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.List<CustomFields> customFields;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("testResultExecutor")
        private TestResultExecutor testResultExecutor;

        @com.aliyun.core.annotation.NameInMap("testResultGmtCreate")
        private Long testResultGmtCreate;

        @com.aliyun.core.annotation.NameInMap("testResultIdentifier")
        private String testResultIdentifier;

        @com.aliyun.core.annotation.NameInMap("testResultStatus")
        private String testResultStatus;

        @com.aliyun.core.annotation.NameInMap("testcaseIdentifier")
        private String testcaseIdentifier;

        private TestResult(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.bugCount = builder.bugCount;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.customFields = builder.customFields;
            this.gmtCreate = builder.gmtCreate;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.subject = builder.subject;
            this.testResultExecutor = builder.testResultExecutor;
            this.testResultGmtCreate = builder.testResultGmtCreate;
            this.testResultIdentifier = builder.testResultIdentifier;
            this.testResultStatus = builder.testResultStatus;
            this.testcaseIdentifier = builder.testcaseIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestResult create() {
            return builder().build();
        }

        /**
         * @return assignedTo
         */
        public AssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        /**
         * @return bugCount
         */
        public Long getBugCount() {
            return this.bugCount;
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return customFields
         */
        public java.util.List<CustomFields> getCustomFields() {
            return this.customFields;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return spaceIdentifier
         */
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return testResultExecutor
         */
        public TestResultExecutor getTestResultExecutor() {
            return this.testResultExecutor;
        }

        /**
         * @return testResultGmtCreate
         */
        public Long getTestResultGmtCreate() {
            return this.testResultGmtCreate;
        }

        /**
         * @return testResultIdentifier
         */
        public String getTestResultIdentifier() {
            return this.testResultIdentifier;
        }

        /**
         * @return testResultStatus
         */
        public String getTestResultStatus() {
            return this.testResultStatus;
        }

        /**
         * @return testcaseIdentifier
         */
        public String getTestcaseIdentifier() {
            return this.testcaseIdentifier;
        }

        public static final class Builder {
            private AssignedTo assignedTo; 
            private Long bugCount; 
            private String categoryIdentifier; 
            private java.util.List<CustomFields> customFields; 
            private Long gmtCreate; 
            private String spaceIdentifier; 
            private String subject; 
            private TestResultExecutor testResultExecutor; 
            private Long testResultGmtCreate; 
            private String testResultIdentifier; 
            private String testResultStatus; 
            private String testcaseIdentifier; 

            /**
             * assignedTo.
             */
            public Builder assignedTo(AssignedTo assignedTo) {
                this.assignedTo = assignedTo;
                return this;
            }

            /**
             * bugCount.
             */
            public Builder bugCount(Long bugCount) {
                this.bugCount = bugCount;
                return this;
            }

            /**
             * categoryIdentifier.
             */
            public Builder categoryIdentifier(String categoryIdentifier) {
                this.categoryIdentifier = categoryIdentifier;
                return this;
            }

            /**
             * customFields.
             */
            public Builder customFields(java.util.List<CustomFields> customFields) {
                this.customFields = customFields;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * spaceIdentifier.
             */
            public Builder spaceIdentifier(String spaceIdentifier) {
                this.spaceIdentifier = spaceIdentifier;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * testResultExecutor.
             */
            public Builder testResultExecutor(TestResultExecutor testResultExecutor) {
                this.testResultExecutor = testResultExecutor;
                return this;
            }

            /**
             * testResultGmtCreate.
             */
            public Builder testResultGmtCreate(Long testResultGmtCreate) {
                this.testResultGmtCreate = testResultGmtCreate;
                return this;
            }

            /**
             * testResultIdentifier.
             */
            public Builder testResultIdentifier(String testResultIdentifier) {
                this.testResultIdentifier = testResultIdentifier;
                return this;
            }

            /**
             * testResultStatus.
             */
            public Builder testResultStatus(String testResultStatus) {
                this.testResultStatus = testResultStatus;
                return this;
            }

            /**
             * testcaseIdentifier.
             */
            public Builder testcaseIdentifier(String testcaseIdentifier) {
                this.testcaseIdentifier = testcaseIdentifier;
                return this;
            }

            public TestResult build() {
                return new TestResult(this);
            } 

        } 

    }
}
