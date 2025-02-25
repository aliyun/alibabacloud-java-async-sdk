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
 * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateTestCaseResponseBody</p>
 */
public class CreateTestCaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("testcase")
    private Testcase testcase;

    private CreateTestCaseResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.testcase = builder.testcase;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTestCaseResponseBody create() {
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
     * @return testcase
     */
    public Testcase getTestcase() {
        return this.testcase;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private Testcase testcase; 

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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>18E50717-93A4-53BC-A30D-963F742A1CE6</p>
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
         * testcase.
         */
        public Builder testcase(Testcase testcase) {
            this.testcase = testcase;
            return this;
        }

        public CreateTestCaseResponseBody build() {
            return new CreateTestCaseResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class AssignedTo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignIdentifier")
        private String assignIdentifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tbRoleId")
        private String tbRoleId;

        private AssignedTo(Builder builder) {
            this.assignIdentifier = builder.assignIdentifier;
            this.name = builder.name;
            this.tbRoleId = builder.tbRoleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssignedTo create() {
            return builder().build();
        }

        /**
         * @return assignIdentifier
         */
        public String getAssignIdentifier() {
            return this.assignIdentifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tbRoleId
         */
        public String getTbRoleId() {
            return this.tbRoleId;
        }

        public static final class Builder {
            private String assignIdentifier; 
            private String name; 
            private String tbRoleId; 

            /**
             * assignIdentifier.
             */
            public Builder assignIdentifier(String assignIdentifier) {
                this.assignIdentifier = assignIdentifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * tbRoleId.
             */
            public Builder tbRoleId(String tbRoleId) {
                this.tbRoleId = tbRoleId;
                return this;
            }

            public AssignedTo build() {
                return new AssignedTo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class Creator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("createIdentifier")
        private String createIdentifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Creator(Builder builder) {
            this.createIdentifier = builder.createIdentifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Creator create() {
            return builder().build();
        }

        /**
         * @return createIdentifier
         */
        public String getCreateIdentifier() {
            return this.createIdentifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String createIdentifier; 
            private String name; 

            /**
             * createIdentifier.
             */
            public Builder createIdentifier(String createIdentifier) {
                this.createIdentifier = createIdentifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Creator build() {
                return new Creator(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class ExpectedResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectContent")
        private String expectContent;

        @com.aliyun.core.annotation.NameInMap("expectContentType")
        private String expectContentType;

        @com.aliyun.core.annotation.NameInMap("expectIdentifier")
        private String expectIdentifier;

        private ExpectedResult(Builder builder) {
            this.expectContent = builder.expectContent;
            this.expectContentType = builder.expectContentType;
            this.expectIdentifier = builder.expectIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExpectedResult create() {
            return builder().build();
        }

        /**
         * @return expectContent
         */
        public String getExpectContent() {
            return this.expectContent;
        }

        /**
         * @return expectContentType
         */
        public String getExpectContentType() {
            return this.expectContentType;
        }

        /**
         * @return expectIdentifier
         */
        public String getExpectIdentifier() {
            return this.expectIdentifier;
        }

        public static final class Builder {
            private String expectContent; 
            private String expectContentType; 
            private String expectIdentifier; 

            /**
             * expectContent.
             */
            public Builder expectContent(String expectContent) {
                this.expectContent = expectContent;
                return this;
            }

            /**
             * expectContentType.
             */
            public Builder expectContentType(String expectContentType) {
                this.expectContentType = expectContentType;
                return this;
            }

            /**
             * expectIdentifier.
             */
            public Builder expectIdentifier(String expectIdentifier) {
                this.expectIdentifier = expectIdentifier;
                return this;
            }

            public ExpectedResult build() {
                return new ExpectedResult(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class Precondition extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("preContent")
        private String preContent;

        @com.aliyun.core.annotation.NameInMap("preContentType")
        private String preContentType;

        @com.aliyun.core.annotation.NameInMap("preIdentifier")
        private String preIdentifier;

        private Precondition(Builder builder) {
            this.preContent = builder.preContent;
            this.preContentType = builder.preContentType;
            this.preIdentifier = builder.preIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Precondition create() {
            return builder().build();
        }

        /**
         * @return preContent
         */
        public String getPreContent() {
            return this.preContent;
        }

        /**
         * @return preContentType
         */
        public String getPreContentType() {
            return this.preContentType;
        }

        /**
         * @return preIdentifier
         */
        public String getPreIdentifier() {
            return this.preIdentifier;
        }

        public static final class Builder {
            private String preContent; 
            private String preContentType; 
            private String preIdentifier; 

            /**
             * preContent.
             */
            public Builder preContent(String preContent) {
                this.preContent = preContent;
                return this;
            }

            /**
             * preContentType.
             */
            public Builder preContentType(String preContentType) {
                this.preContentType = preContentType;
                return this;
            }

            /**
             * preIdentifier.
             */
            public Builder preIdentifier(String preIdentifier) {
                this.preIdentifier = preIdentifier;
                return this;
            }

            public Precondition build() {
                return new Precondition(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class StepContent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("stepContent")
        private String stepContent;

        @com.aliyun.core.annotation.NameInMap("stepContentType")
        private String stepContentType;

        @com.aliyun.core.annotation.NameInMap("stepIdentifier")
        private String stepIdentifier;

        private StepContent(Builder builder) {
            this.stepContent = builder.stepContent;
            this.stepContentType = builder.stepContentType;
            this.stepIdentifier = builder.stepIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepContent create() {
            return builder().build();
        }

        /**
         * @return stepContent
         */
        public String getStepContent() {
            return this.stepContent;
        }

        /**
         * @return stepContentType
         */
        public String getStepContentType() {
            return this.stepContentType;
        }

        /**
         * @return stepIdentifier
         */
        public String getStepIdentifier() {
            return this.stepIdentifier;
        }

        public static final class Builder {
            private String stepContent; 
            private String stepContentType; 
            private String stepIdentifier; 

            /**
             * stepContent.
             */
            public Builder stepContent(String stepContent) {
                this.stepContent = stepContent;
                return this;
            }

            /**
             * stepContentType.
             */
            public Builder stepContentType(String stepContentType) {
                this.stepContentType = stepContentType;
                return this;
            }

            /**
             * stepIdentifier.
             */
            public Builder stepIdentifier(String stepIdentifier) {
                this.stepIdentifier = stepIdentifier;
                return this;
            }

            public StepContent build() {
                return new StepContent(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class DetailInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expectedResult")
        private ExpectedResult expectedResult;

        @com.aliyun.core.annotation.NameInMap("precondition")
        private Precondition precondition;

        @com.aliyun.core.annotation.NameInMap("stepContent")
        private StepContent stepContent;

        @com.aliyun.core.annotation.NameInMap("stepType")
        private String stepType;

        private DetailInfo(Builder builder) {
            this.expectedResult = builder.expectedResult;
            this.precondition = builder.precondition;
            this.stepContent = builder.stepContent;
            this.stepType = builder.stepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DetailInfo create() {
            return builder().build();
        }

        /**
         * @return expectedResult
         */
        public ExpectedResult getExpectedResult() {
            return this.expectedResult;
        }

        /**
         * @return precondition
         */
        public Precondition getPrecondition() {
            return this.precondition;
        }

        /**
         * @return stepContent
         */
        public StepContent getStepContent() {
            return this.stepContent;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        public static final class Builder {
            private ExpectedResult expectedResult; 
            private Precondition precondition; 
            private StepContent stepContent; 
            private String stepType; 

            /**
             * expectedResult.
             */
            public Builder expectedResult(ExpectedResult expectedResult) {
                this.expectedResult = expectedResult;
                return this;
            }

            /**
             * precondition.
             */
            public Builder precondition(Precondition precondition) {
                this.precondition = precondition;
                return this;
            }

            /**
             * stepContent.
             */
            public Builder stepContent(StepContent stepContent) {
                this.stepContent = stepContent;
                return this;
            }

            /**
             * stepType.
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            public DetailInfo build() {
                return new DetailInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class Directory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("childIdentifier")
        private String childIdentifier;

        @com.aliyun.core.annotation.NameInMap("directoryIdentifier")
        private String directoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("pathName")
        private java.util.List<String> pathName;

        private Directory(Builder builder) {
            this.childIdentifier = builder.childIdentifier;
            this.directoryIdentifier = builder.directoryIdentifier;
            this.name = builder.name;
            this.pathName = builder.pathName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directory create() {
            return builder().build();
        }

        /**
         * @return childIdentifier
         */
        public String getChildIdentifier() {
            return this.childIdentifier;
        }

        /**
         * @return directoryIdentifier
         */
        public String getDirectoryIdentifier() {
            return this.directoryIdentifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return pathName
         */
        public java.util.List<String> getPathName() {
            return this.pathName;
        }

        public static final class Builder {
            private String childIdentifier; 
            private String directoryIdentifier; 
            private String name; 
            private java.util.List<String> pathName; 

            /**
             * childIdentifier.
             */
            public Builder childIdentifier(String childIdentifier) {
                this.childIdentifier = childIdentifier;
                return this;
            }

            /**
             * directoryIdentifier.
             */
            public Builder directoryIdentifier(String directoryIdentifier) {
                this.directoryIdentifier = directoryIdentifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * pathName.
             */
            public Builder pathName(java.util.List<String> pathName) {
                this.pathName = pathName;
                return this;
            }

            public Directory build() {
                return new Directory(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class Modifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("modifyIdentifier")
        private String modifyIdentifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private Modifier(Builder builder) {
            this.modifyIdentifier = builder.modifyIdentifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Modifier create() {
            return builder().build();
        }

        /**
         * @return modifyIdentifier
         */
        public String getModifyIdentifier() {
            return this.modifyIdentifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String modifyIdentifier; 
            private String name; 

            /**
             * modifyIdentifier.
             */
            public Builder modifyIdentifier(String modifyIdentifier) {
                this.modifyIdentifier = modifyIdentifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Modifier build() {
                return new Modifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateTestCaseResponseBody} extends {@link TeaModel}
     *
     * <p>CreateTestCaseResponseBody</p>
     */
    public static class Testcase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedTo")
        private AssignedTo assignedTo;

        @com.aliyun.core.annotation.NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("creator")
        private Creator creator;

        @com.aliyun.core.annotation.NameInMap("detailInfo")
        private DetailInfo detailInfo;

        @com.aliyun.core.annotation.NameInMap("directory")
        private Directory directory;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private Modifier modifier;

        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("spaceType")
        private String spaceType;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        private Testcase(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.creator = builder.creator;
            this.detailInfo = builder.detailInfo;
            this.directory = builder.directory;
            this.identifier = builder.identifier;
            this.modifier = builder.modifier;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.spaceType = builder.spaceType;
            this.subject = builder.subject;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Testcase create() {
            return builder().build();
        }

        /**
         * @return assignedTo
         */
        public AssignedTo getAssignedTo() {
            return this.assignedTo;
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
        }

        /**
         * @return creator
         */
        public Creator getCreator() {
            return this.creator;
        }

        /**
         * @return detailInfo
         */
        public DetailInfo getDetailInfo() {
            return this.detailInfo;
        }

        /**
         * @return directory
         */
        public Directory getDirectory() {
            return this.directory;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return modifier
         */
        public Modifier getModifier() {
            return this.modifier;
        }

        /**
         * @return spaceIdentifier
         */
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        /**
         * @return spaceType
         */
        public String getSpaceType() {
            return this.spaceType;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        public static final class Builder {
            private AssignedTo assignedTo; 
            private String categoryIdentifier; 
            private Creator creator; 
            private DetailInfo detailInfo; 
            private Directory directory; 
            private String identifier; 
            private Modifier modifier; 
            private String spaceIdentifier; 
            private String spaceType; 
            private String subject; 

            /**
             * assignedTo.
             */
            public Builder assignedTo(AssignedTo assignedTo) {
                this.assignedTo = assignedTo;
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
             * creator.
             */
            public Builder creator(Creator creator) {
                this.creator = creator;
                return this;
            }

            /**
             * detailInfo.
             */
            public Builder detailInfo(DetailInfo detailInfo) {
                this.detailInfo = detailInfo;
                return this;
            }

            /**
             * directory.
             */
            public Builder directory(Directory directory) {
                this.directory = directory;
                return this;
            }

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * modifier.
             */
            public Builder modifier(Modifier modifier) {
                this.modifier = modifier;
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
             * spaceType.
             */
            public Builder spaceType(String spaceType) {
                this.spaceType = spaceType;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            public Testcase build() {
                return new Testcase(this);
            } 

        } 

    }
}
