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
 * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
 *
 * <p>ListGovernObjectsResponseBody</p>
 */
public class ListGovernObjectsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageResult")
    private PageResult pageResult;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListGovernObjectsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageResult = builder.pageResult;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGovernObjectsResponseBody create() {
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
     * @return pageResult
     */
    public PageResult getPageResult() {
        return this.pageResult;
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
        private Integer httpStatusCode; 
        private String message; 
        private PageResult pageResult; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListGovernObjectsResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.pageResult = model.pageResult;
            this.requestId = model.requestId;
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
         * PageResult.
         */
        public Builder pageResult(PageResult pageResult) {
            this.pageResult = pageResult;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListGovernObjectsResponseBody build() {
            return new ListGovernObjectsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsResponseBody</p>
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
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * UserId.
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
     * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsResponseBody</p>
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
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * ParentObjectId.
             */
            public Builder parentObjectId(String parentObjectId) {
                this.parentObjectId = parentObjectId;
                return this;
            }

            /**
             * ProblemContactMail.
             */
            public Builder problemContactMail(String problemContactMail) {
                this.problemContactMail = problemContactMail;
                return this;
            }

            /**
             * ProblemContactOther.
             */
            public Builder problemContactOther(String problemContactOther) {
                this.problemContactOther = problemContactOther;
                return this;
            }

            /**
             * ProblemContactPhone.
             */
            public Builder problemContactPhone(String problemContactPhone) {
                this.problemContactPhone = problemContactPhone;
                return this;
            }

            /**
             * ProblemDesc.
             */
            public Builder problemDesc(String problemDesc) {
                this.problemDesc = problemDesc;
                return this;
            }

            /**
             * ProblemSubmitType.
             */
            public Builder problemSubmitType(String problemSubmitType) {
                this.problemSubmitType = problemSubmitType;
                return this;
            }

            /**
             * ProblemSubmitter.
             */
            public Builder problemSubmitter(String problemSubmitter) {
                this.problemSubmitter = problemSubmitter;
                return this;
            }

            /**
             * ProblemSubmitterUserName.
             */
            public Builder problemSubmitterUserName(String problemSubmitterUserName) {
                this.problemSubmitterUserName = problemSubmitterUserName;
                return this;
            }

            /**
             * ProblemTypes.
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
     * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsResponseBody</p>
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
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * Desc.
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * KnowledgeId.
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * Solution.
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * Title.
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
     * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsResponseBody</p>
     */
    public static class Data extends TeaModel {
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
        private java.util.Map<String, ?> properties;

        @com.aliyun.core.annotation.NameInMap("RectifyId")
        private Long rectifyId;

        @com.aliyun.core.annotation.NameInMap("RectifyName")
        private String rectifyName;

        @com.aliyun.core.annotation.NameInMap("RectifyStatus")
        private String rectifyStatus;

        @com.aliyun.core.annotation.NameInMap("RelatedKnowledge")
        private java.util.List<RelatedKnowledge> relatedKnowledge;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
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
            this.relatedKnowledge = builder.relatedKnowledge;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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
        public java.util.Map<String, ?> getProperties() {
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

        public static final class Builder {
            private String commitTime; 
            private Long governItemId; 
            private Long governObjectId; 
            private Boolean isRectify; 
            private java.util.List<Owners> owners; 
            private Problem problem; 
            private java.util.Map<String, ?> properties; 
            private Long rectifyId; 
            private String rectifyName; 
            private String rectifyStatus; 
            private java.util.List<RelatedKnowledge> relatedKnowledge; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
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
                this.relatedKnowledge = model.relatedKnowledge;
                this.status = model.status;
            } 

            /**
             * CommitTime.
             */
            public Builder commitTime(String commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * GovernItemId.
             */
            public Builder governItemId(Long governItemId) {
                this.governItemId = governItemId;
                return this;
            }

            /**
             * GovernObjectId.
             */
            public Builder governObjectId(Long governObjectId) {
                this.governObjectId = governObjectId;
                return this;
            }

            /**
             * IsRectify.
             */
            public Builder isRectify(Boolean isRectify) {
                this.isRectify = isRectify;
                return this;
            }

            /**
             * Owners.
             */
            public Builder owners(java.util.List<Owners> owners) {
                this.owners = owners;
                return this;
            }

            /**
             * Problem.
             */
            public Builder problem(Problem problem) {
                this.problem = problem;
                return this;
            }

            /**
             * Properties.
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * RectifyId.
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * RectifyName.
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * RectifyStatus.
             */
            public Builder rectifyStatus(String rectifyStatus) {
                this.rectifyStatus = rectifyStatus;
                return this;
            }

            /**
             * RelatedKnowledge.
             */
            public Builder relatedKnowledge(java.util.List<RelatedKnowledge> relatedKnowledge) {
                this.relatedKnowledge = relatedKnowledge;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListGovernObjectsResponseBody} extends {@link TeaModel}
     *
     * <p>ListGovernObjectsResponseBody</p>
     */
    public static class PageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private PageResult(Builder builder) {
            this.data = builder.data;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageResult create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(PageResult model) {
                this.data = model.data;
                this.totalCount = model.totalCount;
            } 

            /**
             * Data.
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PageResult build() {
                return new PageResult(this);
            } 

        } 

    }
}
