// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemEstimateResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkitemEstimateResponseBody</p>
 */
public class ListWorkitemEstimateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("workitemTimeEstimate")
    private java.util.List < WorkitemTimeEstimate> workitemTimeEstimate;

    private ListWorkitemEstimateResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitemTimeEstimate = builder.workitemTimeEstimate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemEstimateResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
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
     * @return workitemTimeEstimate
     */
    public java.util.List < WorkitemTimeEstimate> getWorkitemTimeEstimate() {
        return this.workitemTimeEstimate;
    }

    public static final class Builder {
        private Long code; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < WorkitemTimeEstimate> workitemTimeEstimate; 

        /**
         * code.
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

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
         * workitemTimeEstimate.
         */
        public Builder workitemTimeEstimate(java.util.List < WorkitemTimeEstimate> workitemTimeEstimate) {
            this.workitemTimeEstimate = workitemTimeEstimate;
            return this;
        }

        public ListWorkitemEstimateResponseBody build() {
            return new ListWorkitemEstimateResponseBody(this);
        } 

    } 

    public static class RecordUser extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        private RecordUser(Builder builder) {
            this.identifier = builder.identifier;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordUser create() {
            return builder().build();
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String identifier; 
            private String name; 

            /**
             * identifier.
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public RecordUser build() {
                return new RecordUser(this);
            } 

        } 

    }
    public static class WorkitemTimeEstimate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtEnd")
        private Long gmtEnd;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("gmtStart")
        private Long gmtStart;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("recordUser")
        private RecordUser recordUser;

        @com.aliyun.core.annotation.NameInMap("spentTime")
        private Float spentTime;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
        private String workitemIdentifier;

        private WorkitemTimeEstimate(Builder builder) {
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.identifier = builder.identifier;
            this.recordUser = builder.recordUser;
            this.spentTime = builder.spentTime;
            this.type = builder.type;
            this.workitemIdentifier = builder.workitemIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkitemTimeEstimate create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtEnd
         */
        public Long getGmtEnd() {
            return this.gmtEnd;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return gmtStart
         */
        public Long getGmtStart() {
            return this.gmtStart;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return recordUser
         */
        public RecordUser getRecordUser() {
            return this.recordUser;
        }

        /**
         * @return spentTime
         */
        public Float getSpentTime() {
            return this.spentTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return workitemIdentifier
         */
        public String getWorkitemIdentifier() {
            return this.workitemIdentifier;
        }

        public static final class Builder {
            private String description; 
            private Long gmtCreate; 
            private Long gmtEnd; 
            private Long gmtModified; 
            private Long gmtStart; 
            private String identifier; 
            private RecordUser recordUser; 
            private Float spentTime; 
            private String type; 
            private String workitemIdentifier; 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * gmtEnd.
             */
            public Builder gmtEnd(Long gmtEnd) {
                this.gmtEnd = gmtEnd;
                return this;
            }

            /**
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * gmtStart.
             */
            public Builder gmtStart(Long gmtStart) {
                this.gmtStart = gmtStart;
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
             * recordUser.
             */
            public Builder recordUser(RecordUser recordUser) {
                this.recordUser = recordUser;
                return this;
            }

            /**
             * spentTime.
             */
            public Builder spentTime(Float spentTime) {
                this.spentTime = spentTime;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * workitemIdentifier.
             */
            public Builder workitemIdentifier(String workitemIdentifier) {
                this.workitemIdentifier = workitemIdentifier;
                return this;
            }

            public WorkitemTimeEstimate build() {
                return new WorkitemTimeEstimate(this);
            } 

        } 

    }
}
