// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTestCaseRequest} extends {@link RequestModel}
 *
 * <p>CreateTestCaseRequest</p>
 */
public class CreateTestCaseRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("assignedTo")
    @Validation(required = true)
    private String assignedTo;

    @Body
    @NameInMap("directoryIdentifier")
    @Validation(required = true)
    private String directoryIdentifier;

    @Body
    @NameInMap("fieldValueList")
    private java.util.List < FieldValueList> fieldValueList;

    @Body
    @NameInMap("priority")
    private String priority;

    @Body
    @NameInMap("spaceIdentifier")
    @Validation(required = true)
    private String spaceIdentifier;

    @Body
    @NameInMap("subject")
    @Validation(required = true)
    private String subject;

    @Body
    @NameInMap("tags")
    private java.util.List < String > tags;

    @Body
    @NameInMap("testcaseStepContentInfo")
    private TestcaseStepContentInfo testcaseStepContentInfo;

    private CreateTestCaseRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.assignedTo = builder.assignedTo;
        this.directoryIdentifier = builder.directoryIdentifier;
        this.fieldValueList = builder.fieldValueList;
        this.priority = builder.priority;
        this.spaceIdentifier = builder.spaceIdentifier;
        this.subject = builder.subject;
        this.tags = builder.tags;
        this.testcaseStepContentInfo = builder.testcaseStepContentInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTestCaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return assignedTo
     */
    public String getAssignedTo() {
        return this.assignedTo;
    }

    /**
     * @return directoryIdentifier
     */
    public String getDirectoryIdentifier() {
        return this.directoryIdentifier;
    }

    /**
     * @return fieldValueList
     */
    public java.util.List < FieldValueList> getFieldValueList() {
        return this.fieldValueList;
    }

    /**
     * @return priority
     */
    public String getPriority() {
        return this.priority;
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
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return testcaseStepContentInfo
     */
    public TestcaseStepContentInfo getTestcaseStepContentInfo() {
        return this.testcaseStepContentInfo;
    }

    public static final class Builder extends Request.Builder<CreateTestCaseRequest, Builder> {
        private String organizationId; 
        private String assignedTo; 
        private String directoryIdentifier; 
        private java.util.List < FieldValueList> fieldValueList; 
        private String priority; 
        private String spaceIdentifier; 
        private String subject; 
        private java.util.List < String > tags; 
        private TestcaseStepContentInfo testcaseStepContentInfo; 

        private Builder() {
            super();
        } 

        private Builder(CreateTestCaseRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.assignedTo = request.assignedTo;
            this.directoryIdentifier = request.directoryIdentifier;
            this.fieldValueList = request.fieldValueList;
            this.priority = request.priority;
            this.spaceIdentifier = request.spaceIdentifier;
            this.subject = request.subject;
            this.tags = request.tags;
            this.testcaseStepContentInfo = request.testcaseStepContentInfo;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * assignedTo.
         */
        public Builder assignedTo(String assignedTo) {
            this.putBodyParameter("assignedTo", assignedTo);
            this.assignedTo = assignedTo;
            return this;
        }

        /**
         * directoryIdentifier.
         */
        public Builder directoryIdentifier(String directoryIdentifier) {
            this.putBodyParameter("directoryIdentifier", directoryIdentifier);
            this.directoryIdentifier = directoryIdentifier;
            return this;
        }

        /**
         * fieldValueList.
         */
        public Builder fieldValueList(java.util.List < FieldValueList> fieldValueList) {
            this.putBodyParameter("fieldValueList", fieldValueList);
            this.fieldValueList = fieldValueList;
            return this;
        }

        /**
         * priority.
         */
        public Builder priority(String priority) {
            this.putBodyParameter("priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * spaceIdentifier.
         */
        public Builder spaceIdentifier(String spaceIdentifier) {
            this.putBodyParameter("spaceIdentifier", spaceIdentifier);
            this.spaceIdentifier = spaceIdentifier;
            return this;
        }

        /**
         * subject.
         */
        public Builder subject(String subject) {
            this.putBodyParameter("subject", subject);
            this.subject = subject;
            return this;
        }

        /**
         * tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.putBodyParameter("tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * testcaseStepContentInfo.
         */
        public Builder testcaseStepContentInfo(TestcaseStepContentInfo testcaseStepContentInfo) {
            this.putBodyParameter("testcaseStepContentInfo", testcaseStepContentInfo);
            this.testcaseStepContentInfo = testcaseStepContentInfo;
            return this;
        }

        @Override
        public CreateTestCaseRequest build() {
            return new CreateTestCaseRequest(this);
        } 

    } 

    public static class FieldValueList extends TeaModel {
        @NameInMap("fieldIdentifier")
        private String fieldIdentifier;

        @NameInMap("value")
        private String value;

        private FieldValueList(Builder builder) {
            this.fieldIdentifier = builder.fieldIdentifier;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FieldValueList create() {
            return builder().build();
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
            private String fieldIdentifier; 
            private String value; 

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

            public FieldValueList build() {
                return new FieldValueList(this);
            } 

        } 

    }
    public static class StepResultList extends TeaModel {
        @NameInMap("expected")
        private String expected;

        @NameInMap("step")
        private String step;

        private StepResultList(Builder builder) {
            this.expected = builder.expected;
            this.step = builder.step;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StepResultList create() {
            return builder().build();
        }

        /**
         * @return expected
         */
        public String getExpected() {
            return this.expected;
        }

        /**
         * @return step
         */
        public String getStep() {
            return this.step;
        }

        public static final class Builder {
            private String expected; 
            private String step; 

            /**
             * expected.
             */
            public Builder expected(String expected) {
                this.expected = expected;
                return this;
            }

            /**
             * step.
             */
            public Builder step(String step) {
                this.step = step;
                return this;
            }

            public StepResultList build() {
                return new StepResultList(this);
            } 

        } 

    }
    public static class TestcaseStepContentInfo extends TeaModel {
        @NameInMap("precondition")
        private String precondition;

        @NameInMap("stepResultList")
        private java.util.List < StepResultList> stepResultList;

        @NameInMap("stepType")
        @Validation(required = true)
        private String stepType;

        private TestcaseStepContentInfo(Builder builder) {
            this.precondition = builder.precondition;
            this.stepResultList = builder.stepResultList;
            this.stepType = builder.stepType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TestcaseStepContentInfo create() {
            return builder().build();
        }

        /**
         * @return precondition
         */
        public String getPrecondition() {
            return this.precondition;
        }

        /**
         * @return stepResultList
         */
        public java.util.List < StepResultList> getStepResultList() {
            return this.stepResultList;
        }

        /**
         * @return stepType
         */
        public String getStepType() {
            return this.stepType;
        }

        public static final class Builder {
            private String precondition; 
            private java.util.List < StepResultList> stepResultList; 
            private String stepType; 

            /**
             * precondition.
             */
            public Builder precondition(String precondition) {
                this.precondition = precondition;
                return this;
            }

            /**
             * stepResultList.
             */
            public Builder stepResultList(java.util.List < StepResultList> stepResultList) {
                this.stepResultList = stepResultList;
                return this;
            }

            /**
             * stepType.
             */
            public Builder stepType(String stepType) {
                this.stepType = stepType;
                return this;
            }

            public TestcaseStepContentInfo build() {
                return new TestcaseStepContentInfo(this);
            } 

        } 

    }
}
