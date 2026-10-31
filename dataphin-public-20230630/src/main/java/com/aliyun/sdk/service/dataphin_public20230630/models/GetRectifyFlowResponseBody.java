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
 * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetRectifyFlowResponseBody</p>
 */
public class GetRectifyFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetRectifyFlowResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRectifyFlowResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetRectifyFlowResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The rectification details.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
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
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetRectifyFlowResponseBody build() {
            return new GetRectifyFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class Owners extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Owners(Builder builder) {
            this.displayName = builder.displayName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Owners create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String displayName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Owners model) {
                this.displayName = model.displayName;
                this.userId = model.userId;
            } 

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Owners build() {
                return new Owners(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class Problem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ObjectId")
        private String objectId;

        @com.aliyun.core.annotation.NameInMap("ParentObjectId")
        private String parentObjectId;

        @com.aliyun.core.annotation.NameInMap("ProblemContactMail")
        private String problemContactMail;

        @com.aliyun.core.annotation.NameInMap("ProblemContactOther")
        private String problemContactOther;

        @com.aliyun.core.annotation.NameInMap("ProblemContactPhone")
        private String problemContactPhone;

        @com.aliyun.core.annotation.NameInMap("ProblemDesc")
        private String problemDesc;

        @com.aliyun.core.annotation.NameInMap("ProblemSubmitType")
        private String problemSubmitType;

        @com.aliyun.core.annotation.NameInMap("ProblemSubmitter")
        private String problemSubmitter;

        @com.aliyun.core.annotation.NameInMap("ProblemSubmitterUserName")
        private String problemSubmitterUserName;

        @com.aliyun.core.annotation.NameInMap("ProblemTypes")
        private java.util.List<String> problemTypes;

        private Problem(Builder builder) {
            this.objectId = builder.objectId;
            this.parentObjectId = builder.parentObjectId;
            this.problemContactMail = builder.problemContactMail;
            this.problemContactOther = builder.problemContactOther;
            this.problemContactPhone = builder.problemContactPhone;
            this.problemDesc = builder.problemDesc;
            this.problemSubmitType = builder.problemSubmitType;
            this.problemSubmitter = builder.problemSubmitter;
            this.problemSubmitterUserName = builder.problemSubmitterUserName;
            this.problemTypes = builder.problemTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Problem create() {
            return builder().build();
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return parentObjectId
         */
        public String getParentObjectId() {
            return this.parentObjectId;
        }

        /**
         * @return problemContactMail
         */
        public String getProblemContactMail() {
            return this.problemContactMail;
        }

        /**
         * @return problemContactOther
         */
        public String getProblemContactOther() {
            return this.problemContactOther;
        }

        /**
         * @return problemContactPhone
         */
        public String getProblemContactPhone() {
            return this.problemContactPhone;
        }

        /**
         * @return problemDesc
         */
        public String getProblemDesc() {
            return this.problemDesc;
        }

        /**
         * @return problemSubmitType
         */
        public String getProblemSubmitType() {
            return this.problemSubmitType;
        }

        /**
         * @return problemSubmitter
         */
        public String getProblemSubmitter() {
            return this.problemSubmitter;
        }

        /**
         * @return problemSubmitterUserName
         */
        public String getProblemSubmitterUserName() {
            return this.problemSubmitterUserName;
        }

        /**
         * @return problemTypes
         */
        public java.util.List<String> getProblemTypes() {
            return this.problemTypes;
        }

        public static final class Builder {
            private String objectId; 
            private String parentObjectId; 
            private String problemContactMail; 
            private String problemContactOther; 
            private String problemContactPhone; 
            private String problemDesc; 
            private String problemSubmitType; 
            private String problemSubmitter; 
            private String problemSubmitterUserName; 
            private java.util.List<String> problemTypes; 

            private Builder() {
            } 

            private Builder(Problem model) {
                this.objectId = model.objectId;
                this.parentObjectId = model.parentObjectId;
                this.problemContactMail = model.problemContactMail;
                this.problemContactOther = model.problemContactOther;
                this.problemContactPhone = model.problemContactPhone;
                this.problemDesc = model.problemDesc;
                this.problemSubmitType = model.problemSubmitType;
                this.problemSubmitter = model.problemSubmitter;
                this.problemSubmitterUserName = model.problemSubmitterUserName;
                this.problemTypes = model.problemTypes;
            } 

            /**
             * <p>The ID of the object.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The ID of the parent object.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder parentObjectId(String parentObjectId) {
                this.parentObjectId = parentObjectId;
                return this;
            }

            /**
             * <p>The contact email for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@test.com">123@test.com</a></p>
             */
            public Builder problemContactMail(String problemContactMail) {
                this.problemContactMail = problemContactMail;
                return this;
            }

            /**
             * <p>Other contact information for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder problemContactOther(String problemContactOther) {
                this.problemContactOther = problemContactOther;
                return this;
            }

            /**
             * <p>The contact phone number for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder problemContactPhone(String problemContactPhone) {
                this.problemContactPhone = problemContactPhone;
                return this;
            }

            /**
             * <p>The description of the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder problemDesc(String problemDesc) {
                this.problemDesc = problemDesc;
                return this;
            }

            /**
             * <p>The submission method of the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>OPENAPI</p>
             */
            public Builder problemSubmitType(String problemSubmitType) {
                this.problemSubmitType = problemSubmitType;
                return this;
            }

            /**
             * <p>The user who submitted the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder problemSubmitter(String problemSubmitter) {
                this.problemSubmitter = problemSubmitter;
                return this;
            }

            /**
             * <p>The name of the user who submitted the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder problemSubmitterUserName(String problemSubmitterUserName) {
                this.problemSubmitterUserName = problemSubmitterUserName;
                return this;
            }

            /**
             * <p>The type of the governance issue.</p>
             */
            public Builder problemTypes(java.util.List<String> problemTypes) {
                this.problemTypes = problemTypes;
                return this;
            }

            public Problem build() {
                return new Problem(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class RelatedKnowledge extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cause")
        private String cause;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("KnowledgeId")
        private Long knowledgeId;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("OwnerName")
        private String ownerName;

        @com.aliyun.core.annotation.NameInMap("Solution")
        private String solution;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private RelatedKnowledge(Builder builder) {
            this.cause = builder.cause;
            this.desc = builder.desc;
            this.knowledgeId = builder.knowledgeId;
            this.owner = builder.owner;
            this.ownerName = builder.ownerName;
            this.solution = builder.solution;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelatedKnowledge create() {
            return builder().build();
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return knowledgeId
         */
        public Long getKnowledgeId() {
            return this.knowledgeId;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return solution
         */
        public String getSolution() {
            return this.solution;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String cause; 
            private String desc; 
            private Long knowledgeId; 
            private String owner; 
            private String ownerName; 
            private String solution; 
            private String title; 

            private Builder() {
            } 

            private Builder(RelatedKnowledge model) {
                this.cause = model.cause;
                this.desc = model.desc;
                this.knowledgeId = model.knowledgeId;
                this.owner = model.owner;
                this.ownerName = model.ownerName;
                this.solution = model.solution;
                this.title = model.title;
            } 

            /**
             * <p>The cause of the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The ID of the knowledge.</p>
             * 
             * <strong>example:</strong>
             * <p>649144693069</p>
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The owner.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>teset</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>teset</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public RelatedKnowledge build() {
                return new RelatedKnowledge(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class IssuesData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CommitTime")
        private String commitTime;

        @com.aliyun.core.annotation.NameInMap("GovernItemId")
        private Long governItemId;

        @com.aliyun.core.annotation.NameInMap("GovernObjectId")
        private Long governObjectId;

        @com.aliyun.core.annotation.NameInMap("IsRectify")
        private Boolean isRectify;

        @com.aliyun.core.annotation.NameInMap("Owners")
        private java.util.List<Owners> owners;

        @com.aliyun.core.annotation.NameInMap("Problem")
        private Problem problem;

        @com.aliyun.core.annotation.NameInMap("Properties")
        private java.util.Map<String, String> properties;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        private Long rectifyId;

        @com.aliyun.core.annotation.NameInMap("RectifyName")
        private String rectifyName;

        @com.aliyun.core.annotation.NameInMap("RectifyStatus")
        private String rectifyStatus;

        @com.aliyun.core.annotation.NameInMap("RectifyUser")
        private String rectifyUser;

        @com.aliyun.core.annotation.NameInMap("RectifyUserName")
        private String rectifyUserName;

        @com.aliyun.core.annotation.NameInMap("RelatedKnowledge")
        private java.util.List<RelatedKnowledge> relatedKnowledge;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitType")
        private String submitType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        private IssuesData(Builder builder) {
            this.commitTime = builder.commitTime;
            this.governItemId = builder.governItemId;
            this.governObjectId = builder.governObjectId;
            this.isRectify = builder.isRectify;
            this.owners = builder.owners;
            this.problem = builder.problem;
            this.properties = builder.properties;
            this.rectifyId = builder.rectifyId;
            this.rectifyName = builder.rectifyName;
            this.rectifyStatus = builder.rectifyStatus;
            this.rectifyUser = builder.rectifyUser;
            this.rectifyUserName = builder.rectifyUserName;
            this.relatedKnowledge = builder.relatedKnowledge;
            this.status = builder.status;
            this.submitType = builder.submitType;
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IssuesData create() {
            return builder().build();
        }

        /**
         * @return commitTime
         */
        public String getCommitTime() {
            return this.commitTime;
        }

        /**
         * @return governItemId
         */
        public Long getGovernItemId() {
            return this.governItemId;
        }

        /**
         * @return governObjectId
         */
        public Long getGovernObjectId() {
            return this.governObjectId;
        }

        /**
         * @return isRectify
         */
        public Boolean getIsRectify() {
            return this.isRectify;
        }

        /**
         * @return owners
         */
        public java.util.List<Owners> getOwners() {
            return this.owners;
        }

        /**
         * @return problem
         */
        public Problem getProblem() {
            return this.problem;
        }

        /**
         * @return properties
         */
        public java.util.Map<String, String> getProperties() {
            return this.properties;
        }

        /**
         * @return rectifyId
         */
        public Long getRectifyId() {
            return this.rectifyId;
        }

        /**
         * @return rectifyName
         */
        public String getRectifyName() {
            return this.rectifyName;
        }

        /**
         * @return rectifyStatus
         */
        public String getRectifyStatus() {
            return this.rectifyStatus;
        }

        /**
         * @return rectifyUser
         */
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        /**
         * @return rectifyUserName
         */
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        /**
         * @return relatedKnowledge
         */
        public java.util.List<RelatedKnowledge> getRelatedKnowledge() {
            return this.relatedKnowledge;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitType
         */
        public String getSubmitType() {
            return this.submitType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String commitTime; 
            private Long governItemId; 
            private Long governObjectId; 
            private Boolean isRectify; 
            private java.util.List<Owners> owners; 
            private Problem problem; 
            private java.util.Map<String, String> properties; 
            private Long rectifyId; 
            private String rectifyName; 
            private String rectifyStatus; 
            private String rectifyUser; 
            private String rectifyUserName; 
            private java.util.List<RelatedKnowledge> relatedKnowledge; 
            private String status; 
            private String submitType; 
            private Long tenantId; 

            private Builder() {
            } 

            private Builder(IssuesData model) {
                this.commitTime = model.commitTime;
                this.governItemId = model.governItemId;
                this.governObjectId = model.governObjectId;
                this.isRectify = model.isRectify;
                this.owners = model.owners;
                this.problem = model.problem;
                this.properties = model.properties;
                this.rectifyId = model.rectifyId;
                this.rectifyName = model.rectifyName;
                this.rectifyStatus = model.rectifyStatus;
                this.rectifyUser = model.rectifyUser;
                this.rectifyUserName = model.rectifyUserName;
                this.relatedKnowledge = model.relatedKnowledge;
                this.status = model.status;
                this.submitType = model.submitType;
                this.tenantId = model.tenantId;
            } 

            /**
             * <p>The submission time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-22</p>
             */
            public Builder commitTime(String commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The ID of the governance object.</p>
             * 
             * <strong>example:</strong>
             * <p>768244593451</p>
             */
            public Builder governItemId(Long governItemId) {
                this.governItemId = governItemId;
                return this;
            }

            /**
             * <p>The ID of the governance object.</p>
             * 
             * <strong>example:</strong>
             * <p>28783986302</p>
             */
            public Builder governObjectId(Long governObjectId) {
                this.governObjectId = governObjectId;
                return this;
            }

            /**
             * <p>Specifies whether the rectification is in progress.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isRectify(Boolean isRectify) {
                this.isRectify = isRectify;
                return this;
            }

            /**
             * <p>The list of owners.</p>
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * <p>The governance issue object.</p>
             */
            public Builder problem(Problem problem) {
                this.problem = problem;
                return this;
            }

            /**
             * <p>The property map of the governance object.</p>
             */
            public Builder properties(java.util.Map<String, String> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The ID of the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>813969529153</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * <p>The name of the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * <p>The status of the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder rectifyStatus(String rectifyStatus) {
                this.rectifyStatus = rectifyStatus;
                return this;
            }

            /**
             * <p>The ID of the user who performs the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder rectifyUser(String rectifyUser) {
                this.rectifyUser = rectifyUser;
                return this;
            }

            /**
             * <p>The display name of the user who performs the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyUserName(String rectifyUserName) {
                this.rectifyUserName = rectifyUserName;
                return this;
            }

            /**
             * <p>The related knowledge base.</p>
             */
            public Builder relatedKnowledge(java.util.List<RelatedKnowledge> relatedKnowledge) {
                this.relatedKnowledge = relatedKnowledge;
                return this;
            }

            /**
             * <p>The status of the governance object.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The submission method.</p>
             * 
             * <strong>example:</strong>
             * <p>OPEN API</p>
             */
            public Builder submitType(String submitType) {
                this.submitType = submitType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>575244494646</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public IssuesData build() {
                return new IssuesData(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class Issues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<IssuesData> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Issues(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issues create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<IssuesData> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<IssuesData> data; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Issues model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The issues on the current page. The fields are consistent with the issue list.</p>
             */
            public Builder data(java.util.List<IssuesData> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The total number of issues.</p>
             * 
             * <strong>example:</strong>
             * <p>467439222172</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetRectifyFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FinishTime")
        private Long finishTime;

        @com.aliyun.core.annotation.NameInMap("Issues")
        private Issues issues;

        @com.aliyun.core.annotation.NameInMap("ProblemCount")
        private Long problemCount;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        private Long rectifyId;

        @com.aliyun.core.annotation.NameInMap("RectifyName")
        private String rectifyName;

        @com.aliyun.core.annotation.NameInMap("RectifyPriority")
        private String rectifyPriority;

        @com.aliyun.core.annotation.NameInMap("RectifyUser")
        private String rectifyUser;

        @com.aliyun.core.annotation.NameInMap("RectifyUserName")
        private String rectifyUserName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SubmitUser")
        private String submitUser;

        @com.aliyun.core.annotation.NameInMap("SubmitUserName")
        private String submitUserName;

        @com.aliyun.core.annotation.NameInMap("VerifyUser")
        private String verifyUser;

        @com.aliyun.core.annotation.NameInMap("VerifyUserName")
        private String verifyUserName;

        private Data(Builder builder) {
            this.finishTime = builder.finishTime;
            this.issues = builder.issues;
            this.problemCount = builder.problemCount;
            this.rectifyId = builder.rectifyId;
            this.rectifyName = builder.rectifyName;
            this.rectifyPriority = builder.rectifyPriority;
            this.rectifyUser = builder.rectifyUser;
            this.rectifyUserName = builder.rectifyUserName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.submitUser = builder.submitUser;
            this.submitUserName = builder.submitUserName;
            this.verifyUser = builder.verifyUser;
            this.verifyUserName = builder.verifyUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return finishTime
         */
        public Long getFinishTime() {
            return this.finishTime;
        }

        /**
         * @return issues
         */
        public Issues getIssues() {
            return this.issues;
        }

        /**
         * @return problemCount
         */
        public Long getProblemCount() {
            return this.problemCount;
        }

        /**
         * @return rectifyId
         */
        public Long getRectifyId() {
            return this.rectifyId;
        }

        /**
         * @return rectifyName
         */
        public String getRectifyName() {
            return this.rectifyName;
        }

        /**
         * @return rectifyPriority
         */
        public String getRectifyPriority() {
            return this.rectifyPriority;
        }

        /**
         * @return rectifyUser
         */
        public String getRectifyUser() {
            return this.rectifyUser;
        }

        /**
         * @return rectifyUserName
         */
        public String getRectifyUserName() {
            return this.rectifyUserName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return submitUser
         */
        public String getSubmitUser() {
            return this.submitUser;
        }

        /**
         * @return submitUserName
         */
        public String getSubmitUserName() {
            return this.submitUserName;
        }

        /**
         * @return verifyUser
         */
        public String getVerifyUser() {
            return this.verifyUser;
        }

        /**
         * @return verifyUserName
         */
        public String getVerifyUserName() {
            return this.verifyUserName;
        }

        public static final class Builder {
            private Long finishTime; 
            private Issues issues; 
            private Long problemCount; 
            private Long rectifyId; 
            private String rectifyName; 
            private String rectifyPriority; 
            private String rectifyUser; 
            private String rectifyUserName; 
            private Long startTime; 
            private String status; 
            private String submitUser; 
            private String submitUserName; 
            private String verifyUser; 
            private String verifyUserName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.finishTime = model.finishTime;
                this.issues = model.issues;
                this.problemCount = model.problemCount;
                this.rectifyId = model.rectifyId;
                this.rectifyName = model.rectifyName;
                this.rectifyPriority = model.rectifyPriority;
                this.rectifyUser = model.rectifyUser;
                this.rectifyUserName = model.rectifyUserName;
                this.startTime = model.startTime;
                this.status = model.status;
                this.submitUser = model.submitUser;
                this.submitUserName = model.submitUserName;
                this.verifyUser = model.verifyUser;
                this.verifyUserName = model.verifyUserName;
            } 

            /**
             * <p>The completion time as a UNIX timestamp in milliseconds. This parameter is empty if the rectification is not completed.</p>
             * 
             * <strong>example:</strong>
             * <p>57753888419</p>
             */
            public Builder finishTime(Long finishTime) {
                this.finishTime = finishTime;
                return this;
            }

            /**
             * <p>The pagination information for rectification issues. If the rectification has been accepted, the acceptance snapshot is used.</p>
             */
            public Builder issues(Issues issues) {
                this.issues = issues;
                return this;
            }

            /**
             * <p>The total number of current issues in the process.</p>
             * 
             * <strong>example:</strong>
             * <p>415492404179</p>
             */
            public Builder problemCount(Long problemCount) {
                this.problemCount = problemCount;
                return this;
            }

            /**
             * <p>The process ID.</p>
             * 
             * <strong>example:</strong>
             * <p>14561234364</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * <p>The process name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * <p>The priority.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder rectifyPriority(String rectifyPriority) {
                this.rectifyPriority = rectifyPriority;
                return this;
            }

            /**
             * <p>The rectifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder rectifyUser(String rectifyUser) {
                this.rectifyUser = rectifyUser;
                return this;
            }

            /**
             * <p>The rectifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder rectifyUserName(String rectifyUserName) {
                this.rectifyUserName = rectifyUserName;
                return this;
            }

            /**
             * <p>The start time, in UNIX milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>496002949493</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The process status.</p>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The initiator ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder submitUser(String submitUser) {
                this.submitUser = submitUser;
                return this;
            }

            /**
             * <p>The initiator name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder submitUserName(String submitUserName) {
                this.submitUserName = submitUserName;
                return this;
            }

            /**
             * <p>The verifier ID.</p>
             * 
             * <strong>example:</strong>
             * <p>3001</p>
             */
            public Builder verifyUser(String verifyUser) {
                this.verifyUser = verifyUser;
                return this;
            }

            /**
             * <p>The verifier name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder verifyUserName(String verifyUserName) {
                this.verifyUserName = verifyUserName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
