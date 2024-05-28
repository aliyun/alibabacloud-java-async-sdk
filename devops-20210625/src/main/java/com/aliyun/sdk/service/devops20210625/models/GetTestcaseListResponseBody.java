// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTestcaseListResponseBody} extends {@link TeaModel}
 *
 * <p>GetTestcaseListResponseBody</p>
 */
public class GetTestcaseListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("testcase")
    private java.util.List < Testcase> testcase;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Long totalCount;

    private GetTestcaseListResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.testcase = builder.testcase;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTestcaseListResponseBody create() {
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
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return testcase
     */
    public java.util.List < Testcase> getTestcase() {
        return this.testcase;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMsg; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < Testcase> testcase; 
        private Long totalCount; 

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
         * maxResults.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
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
         * testcase.
         */
        public Builder testcase(java.util.List < Testcase> testcase) {
            this.testcase = testcase;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetTestcaseListResponseBody build() {
            return new GetTestcaseListResponseBody(this);
        } 

    } 

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
    public static class Space extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Space(Builder builder) {
            this.spaceIdentifier = builder.spaceIdentifier;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Space create() {
            return builder().build();
        }

        /**
         * @return spaceIdentifier
         */
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String spaceIdentifier; 
            private String type; 

            /**
             * spaceIdentifier.
             */
            public Builder spaceIdentifier(String spaceIdentifier) {
                this.spaceIdentifier = spaceIdentifier;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Space build() {
                return new Space(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("tagIdentifier")
        private String tagIdentifier;

        private Tags(Builder builder) {
            this.name = builder.name;
            this.tagIdentifier = builder.tagIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return tagIdentifier
         */
        public String getTagIdentifier() {
            return this.tagIdentifier;
        }

        public static final class Builder {
            private String name; 
            private String tagIdentifier; 

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * tagIdentifier.
             */
            public Builder tagIdentifier(String tagIdentifier) {
                this.tagIdentifier = tagIdentifier;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Testcase extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assignedTo")
        private AssignedTo assignedTo;

        @com.aliyun.core.annotation.NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @com.aliyun.core.annotation.NameInMap("customFields")
        private java.util.List < CustomFields> customFields;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("space")
        private Space space;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("tags")
        private java.util.List < Tags> tags;

        private Testcase(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.customFields = builder.customFields;
            this.gmtCreate = builder.gmtCreate;
            this.identifier = builder.identifier;
            this.space = builder.space;
            this.subject = builder.subject;
            this.tags = builder.tags;
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
         * @return customFields
         */
        public java.util.List < CustomFields> getCustomFields() {
            return this.customFields;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return space
         */
        public Space getSpace() {
            return this.space;
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private AssignedTo assignedTo; 
            private String categoryIdentifier; 
            private java.util.List < CustomFields> customFields; 
            private Long gmtCreate; 
            private String identifier; 
            private Space space; 
            private String subject; 
            private java.util.List < Tags> tags; 

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
             * customFields.
             */
            public Builder customFields(java.util.List < CustomFields> customFields) {
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
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * space.
             */
            public Builder space(Space space) {
                this.space = space;
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
             * tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Testcase build() {
                return new Testcase(this);
            } 

        } 

    }
}
