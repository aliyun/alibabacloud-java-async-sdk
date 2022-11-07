// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkitemRelationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkitemRelationsResponseBody</p>
 */
public class GetWorkitemRelationsResponseBody extends TeaModel {
    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("relationList")
    private java.util.List < RelationList> relationList;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetWorkitemRelationsResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.relationList = builder.relationList;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkitemRelationsResponseBody create() {
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
     * @return relationList
     */
    public java.util.List < RelationList> getRelationList() {
        return this.relationList;
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
        private String errorCode; 
        private String errorMsg; 
        private java.util.List < RelationList> relationList; 
        private String requestId; 
        private Boolean success; 

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
         * relationList.
         */
        public Builder relationList(java.util.List < RelationList> relationList) {
            this.relationList = relationList;
            return this;
        }

        /**
         * Id of the request
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

        public GetWorkitemRelationsResponseBody build() {
            return new GetWorkitemRelationsResponseBody(this);
        } 

    } 

    public static class RelationList extends TeaModel {
        @NameInMap("assignedTo")
        private String assignedTo;

        @NameInMap("categoryIdentifier")
        private String categoryIdentifier;

        @NameInMap("gmtCreate")
        private String gmtCreate;

        @NameInMap("gmtModified")
        private String gmtModified;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @NameInMap("subject")
        private String subject;

        @NameInMap("workitemTypeIdentifier")
        private String workitemTypeIdentifier;

        private RelationList(Builder builder) {
            this.assignedTo = builder.assignedTo;
            this.categoryIdentifier = builder.categoryIdentifier;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.subject = builder.subject;
            this.workitemTypeIdentifier = builder.workitemTypeIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return assignedTo
         */
        public String getAssignedTo() {
            return this.assignedTo;
        }

        /**
         * @return categoryIdentifier
         */
        public String getCategoryIdentifier() {
            return this.categoryIdentifier;
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
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
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
         * @return workitemTypeIdentifier
         */
        public String getWorkitemTypeIdentifier() {
            return this.workitemTypeIdentifier;
        }

        public static final class Builder {
            private String assignedTo; 
            private String categoryIdentifier; 
            private String gmtCreate; 
            private String gmtModified; 
            private String identifier; 
            private String spaceIdentifier; 
            private String subject; 
            private String workitemTypeIdentifier; 

            /**
             * assignedTo.
             */
            public Builder assignedTo(String assignedTo) {
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
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
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
             * workitemTypeIdentifier.
             */
            public Builder workitemTypeIdentifier(String workitemTypeIdentifier) {
                this.workitemTypeIdentifier = workitemTypeIdentifier;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
}
