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
 * {@link GetDataAssetsGovernObjectResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataAssetsGovernObjectResponseBody</p>
 */
public class GetDataAssetsGovernObjectResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("GovernObjectInfo")
    private GovernObjectInfo governObjectInfo;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetDataAssetsGovernObjectResponseBody(Builder builder) {
        this.code = builder.code;
        this.governObjectInfo = builder.governObjectInfo;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataAssetsGovernObjectResponseBody create() {
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
     * @return governObjectInfo
     */
    public GovernObjectInfo getGovernObjectInfo() {
        return this.governObjectInfo;
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
        private GovernObjectInfo governObjectInfo; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetDataAssetsGovernObjectResponseBody model) {
            this.code = model.code;
            this.governObjectInfo = model.governObjectInfo;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The governance object details.</p>
         */
        public Builder governObjectInfo(GovernObjectInfo governObjectInfo) {
            this.governObjectInfo = governObjectInfo;
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
         * <p>The backend response exception details.</p>
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
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetDataAssetsGovernObjectResponseBody build() {
            return new GetDataAssetsGovernObjectResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataAssetsGovernObjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAssetsGovernObjectResponseBody</p>
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
             * <p>龚恒菊2088822037866701</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The user ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300006218</p>
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
     * {@link GetDataAssetsGovernObjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAssetsGovernObjectResponseBody</p>
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
             * <p>The object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>36ea160807b14216b62a939327941e8b</p>
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * <p>The ID of the parent object.</p>
             * 
             * <strong>example:</strong>
             * <p>913836</p>
             */
            public Builder parentObjectId(String parentObjectId) {
                this.parentObjectId = parentObjectId;
                return this;
            }

            /**
             * <p>The contact email for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:178986769@gmail.com">178986769@gmail.com</a></p>
             */
            public Builder problemContactMail(String problemContactMail) {
                this.problemContactMail = problemContactMail;
                return this;
            }

            /**
             * <p>The other contact information for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>Jane</p>
             */
            public Builder problemContactOther(String problemContactOther) {
                this.problemContactOther = problemContactOther;
                return this;
            }

            /**
             * <p>The contact phone number for the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>12596178752</p>
             */
            public Builder problemContactPhone(String problemContactPhone) {
                this.problemContactPhone = problemContactPhone;
                return this;
            }

            /**
             * <p>The description of the governance issue.</p>
             * 
             * <strong>example:</strong>
             * <p>Test issue</p>
             */
            public Builder problemDesc(String problemDesc) {
                this.problemDesc = problemDesc;
                return this;
            }

            /**
             * <p>The submission method of the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder problemSubmitType(String problemSubmitType) {
                this.problemSubmitType = problemSubmitType;
                return this;
            }

            /**
             * <p>The user who submitted the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>300006218</p>
             */
            public Builder problemSubmitter(String problemSubmitter) {
                this.problemSubmitter = problemSubmitter;
                return this;
            }

            /**
             * <p>The username of the user who submitted the issue.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
             */
            public Builder problemSubmitterUserName(String problemSubmitterUserName) {
                this.problemSubmitterUserName = problemSubmitterUserName;
                return this;
            }

            /**
             * <p>The types of the governance issue.</p>
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
     * {@link GetDataAssetsGovernObjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAssetsGovernObjectResponseBody</p>
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
             * <p>NC tag test</p>
             */
            public Builder cause(String cause) {
                this.cause = cause;
                return this;
            }

            /**
             * <p>The description.</p>
             * 
             * <strong>example:</strong>
             * <p>Yangchun Maternal and Child Health Cloud Service Space</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The ID of the knowledge entry.</p>
             * 
             * <strong>example:</strong>
             * <p>522072057231</p>
             */
            public Builder knowledgeId(Long knowledgeId) {
                this.knowledgeId = knowledgeId;
                return this;
            }

            /**
             * <p>The owner.</p>
             * 
             * <strong>example:</strong>
             * <p>leisatc</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The name of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>buc_166994</p>
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * <p>The Solutions.</p>
             * 
             * <strong>example:</strong>
             * <p>RPBioOnly</p>
             */
            public Builder solution(String solution) {
                this.solution = solution;
                return this;
            }

            /**
             * <p>The title.</p>
             * 
             * <strong>example:</strong>
             * <p>Makassar International Eight Festival &amp; Forum (F8 Makassar)</p>
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
     * {@link GetDataAssetsGovernObjectResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataAssetsGovernObjectResponseBody</p>
     */
    public static class GovernObjectInfo extends TeaModel {
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

        private GovernObjectInfo(Builder builder) {
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

        public static GovernObjectInfo create() {
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
            private java.util.Map<String, ?> properties; 
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

            private Builder(GovernObjectInfo model) {
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
             * <p>The time when the governance object was reported.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-08-31 10:06:01</p>
             */
            public Builder commitTime(String commitTime) {
                this.commitTime = commitTime;
                return this;
            }

            /**
             * <p>The governance object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>96928483120</p>
             */
            public Builder governItemId(Long governItemId) {
                this.governItemId = governItemId;
                return this;
            }

            /**
             * <p>The governance object ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54295947412</p>
             */
            public Builder governObjectId(Long governObjectId) {
                this.governObjectId = governObjectId;
                return this;
            }

            /**
             * <p>Indicates whether rectification is in progress.</p>
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
             * <p>The properties.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;properties&quot;: {
             *                 &quot;gmt_create&quot;: &quot;2026-08-24 06:00:19.649&quot;,
             *                 &quot;index_compute_type&quot;: &quot;&quot;,
             *                 &quot;table_env&quot;: &quot;PROD&quot;,
             *                 &quot;table_datasource_id&quot;: &quot;1&quot;,
             *                 &quot;index_catalog&quot;: &quot;&quot;,
             *                 &quot;qd_feature_owner&quot;: &quot;&quot;,
             *                 &quot;rule_task_start_time&quot;: &quot;2026-08-24 06:00:01&quot;,
             *                 &quot;table_id&quot;: &quot;odps.300023201.fashion_ads.api2mysql_demo&quot;,
             *                 &quot;rule_strength&quot;: &quot;WEAK&quot;,
             *                 &quot;table_biz_unit_name&quot;: &quot;LD_Fashion&quot;,
             *                 &quot;table_name&quot;: &quot;fashion_ads.api2mysql_demo&quot;,
             *                 &quot;index_type&quot;: &quot;&quot;,
             *                 &quot;table_datasource_from&quot;: &quot;META_DATA&quot;,
             *                 &quot;datasource_type&quot;: &quot;MAX_COMPUTE&quot;,
             *                 &quot;datasource_scope&quot;: &quot;OFFLINE&quot;,
             *                 &quot;template_zh_tw_name&quot;: &quot;欄位空值校正&quot;,
             *                 &quot;problem_submit_type&quot;: &quot;SYSTEM&quot;,
             *                 &quot;template_type&quot;: &quot;FIELD_NULL_VALUE_VALIDATE&quot;,
             *                 &quot;index_name_cn&quot;: &quot;&quot;,
             *                 &quot;datasource_name&quot;: &quot;Dataphin&quot;,
             *                 &quot;id&quot;: &quot;909586&quot;,
             *                 &quot;index_id&quot;: &quot;&quot;,
             *                 &quot;validate_partition&quot;: &quot;ds=\&quot;20260824\&quot;&quot;,
             *                 &quot;index_owner_id&quot;: &quot;&quot;,
             *                 &quot;datasource_owner&quot;: &quot;300006218&quot;,
             *                 &quot;rule_name&quot;: &quot;date_odps_test_2025-09-22 20:32:07&quot;,
             *                 &quot;watch_type&quot;: &quot;TABLE&quot;,
             *                 &quot;validate_status&quot;: &quot;NOT_PASS&quot;,
             *                 &quot;qd_feature_id&quot;: &quot;&quot;,
             *                 &quot;table_desc&quot;: &quot;api2mysql_demo&quot;,
             *                 &quot;is_ignore&quot;: &quot;false&quot;,
             *                 &quot;rule_desc&quot;: &quot;&quot;,
             *                 &quot;table_partitioned&quot;: &quot;true&quot;,
             *                 &quot;template_owner&quot;: &quot;300006218&quot;,
             *                 &quot;index_biz_unit_id&quot;: &quot;&quot;,
             *                 &quot;table_biz_unit_id&quot;: &quot;6865277495315392&quot;,
             *                 &quot;index_biz_unit_name&quot;: &quot;&quot;,
             *                 &quot;watch_env&quot;: &quot;PROD&quot;,
             *                 &quot;problem_contact_other&quot;: &quot;&quot;,
             *                 &quot;status&quot;: &quot;NEW&quot;,
             *                 &quot;datasource_from&quot;: &quot;META_DATA&quot;,
             *                 &quot;table_project_name&quot;: &quot;fashion_ads&quot;,
             *                 &quot;tenant_id&quot;: &quot;300023201&quot;,
             *                 &quot;datasource_env&quot;: &quot;PROD&quot;,
             *                 &quot;template_en_name&quot;: &quot;Verify Field Null Values&quot;,
             *                 &quot;commit_time&quot;: &quot;2026-08-24 06:00:18.73&quot;,
             *                 &quot;gmt_modified&quot;: &quot;2026-08-24 06:00:19.649&quot;,
             *                 &quot;qd_feature_name&quot;: &quot;&quot;,
             *                 &quot;table_catalog&quot;: &quot;fashion_ads&quot;,
             *                 &quot;rule_status&quot;: &quot;ENABLE&quot;,
             *                 &quot;problem_contact_mail&quot;: &quot;&quot;,
             *                 &quot;rule_task_status&quot;: &quot;SUCCESS&quot;,
             *                 &quot;rule_validate_object_type&quot;: &quot;COLUMN&quot;,
             *                 &quot;watch_status&quot;: &quot;ENABLE&quot;,
             *                 &quot;index_guid&quot;: &quot;&quot;,
             *                 &quot;system_template&quot;: &quot;true&quot;,
             *                 &quot;quality_owners&quot;: &quot;300006218&quot;,
             *                 &quot;index_name&quot;: &quot;&quot;,
             *                 &quot;problem_contact_phone&quot;: &quot;&quot;,
             *                 &quot;watch_task_id&quot;: &quot;8199222&quot;,
             *                 &quot;rule_task_id&quot;: &quot;8199227&quot;,
             *                 &quot;index_desc&quot;: &quot;&quot;,
             *                 &quot;table_type&quot;: &quot;PHYSICAL_TABLE&quot;,
             *                 &quot;table_project_id&quot;: &quot;6865331520706176&quot;,
             *                 &quot;trace_id&quot;: &quot;time:4326023&quot;,
             *                 &quot;datasource_id&quot;: &quot;1&quot;,
             *                 &quot;qd_feature_code&quot;: &quot;&quot;,
             *                 &quot;rule_validate_object_name&quot;: &quot;date_odps&quot;,
             *                 &quot;problem_desc&quot;: &quot;date_odps_test_2025-09-22 20:32:07&quot;,
             *                 &quot;table_owner&quot;: &quot;300006218&quot;,
             *                 &quot;quality_owner_groups&quot;: &quot;&quot;,
             *                 &quot;govern_item_id&quot;: &quot;100&quot;,
             *                 &quot;rule_catalogs&quot;: &quot;COMPLETENESS&quot;,
             *                 &quot;table_datasource_type&quot;: &quot;MAX_COMPUTE&quot;,
             *                 &quot;template_zh_cn_name&quot;: &quot;字段空值校验&quot;,
             *                 &quot;rule_task_biz_date&quot;: &quot;20260824 06:00:00&quot;,
             *                 &quot;problem_types&quot;: &quot;[{\&quot;value\&quot;:\&quot;COMPLETENESS\&quot;}]&quot;,
             *                 &quot;rule_id&quot;: &quot;4322944&quot;,
             *                 &quot;problem_attachment_file_ids&quot;: &quot;null&quot;,
             *                 &quot;watch_name&quot;: &quot;&quot;,
             *                 &quot;template_name&quot;: &quot;&quot;,
             *                 &quot;schedule_params&quot;: &quot;&quot;,
             *                 &quot;is_rectify&quot;: &quot;false&quot;,
             *                 &quot;rule_task_end_time&quot;: &quot;&quot;,
             *                 &quot;watch_id&quot;: &quot;3841908&quot;,
             *                 &quot;validate_result&quot;: &quot;false&quot;,
             *                 &quot;qd_feature_guid&quot;: &quot;&quot;,
             *                 &quot;govern_object_id&quot;: &quot;910181&quot;,
             *                 &quot;template_id&quot;: &quot;100&quot;
             *             }</p>
             */
            public Builder properties(java.util.Map<String, ?> properties) {
                this.properties = properties;
                return this;
            }

            /**
             * <p>The ID of the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>49169072991</p>
             */
            public Builder rectifyId(Long rectifyId) {
                this.rectifyId = rectifyId;
                return this;
            }

            /**
             * <p>The name of the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>Rectification process 1</p>
             */
            public Builder rectifyName(String rectifyName) {
                this.rectifyName = rectifyName;
                return this;
            }

            /**
             * <p>The rectification status.</p>
             * 
             * <strong>example:</strong>
             * <p>NEW</p>
             */
            public Builder rectifyStatus(String rectifyStatus) {
                this.rectifyStatus = rectifyStatus;
                return this;
            }

            /**
             * <p>The ID of the user who performs the rectification.</p>
             * 
             * <strong>example:</strong>
             * <p>566777</p>
             */
            public Builder rectifyUser(String rectifyUser) {
                this.rectifyUser = rectifyUser;
                return this;
            }

            /**
             * <p>The display name of the rectification user.</p>
             * 
             * <strong>example:</strong>
             * <p>John</p>
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
             * <p>200</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The submission method.</p>
             * 
             * <strong>example:</strong>
             * <p>SYSTEM</p>
             */
            public Builder submitType(String submitType) {
                this.submitType = submitType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>-17163770809</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public GovernObjectInfo build() {
                return new GovernObjectInfo(this);
            } 

        } 

    }
}
