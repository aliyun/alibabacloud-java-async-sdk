// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkitemTimeResponseBody} extends {@link TeaModel}
 *
 * <p>ListWorkitemTimeResponseBody</p>
 */
public class ListWorkitemTimeResponseBody extends TeaModel {
    @NameInMap("code")
    private Long code;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    @NameInMap("workitemTime")
    private java.util.List < WorkitemTime> workitemTime;

    private ListWorkitemTimeResponseBody(Builder builder) {
        this.code = builder.code;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.workitemTime = builder.workitemTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWorkitemTimeResponseBody create() {
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
     * @return workitemTime
     */
    public java.util.List < WorkitemTime> getWorkitemTime() {
        return this.workitemTime;
    }

    public static final class Builder {
        private Long code; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 
        private java.util.List < WorkitemTime> workitemTime; 

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
         * workitemTime.
         */
        public Builder workitemTime(java.util.List < WorkitemTime> workitemTime) {
            this.workitemTime = workitemTime;
            return this;
        }

        public ListWorkitemTimeResponseBody build() {
            return new ListWorkitemTimeResponseBody(this);
        } 

    } 

    public static class WorkitemTime extends TeaModel {
        @NameInMap("actualTime")
        private Float actualTime;

        @NameInMap("description")
        private String description;

        @NameInMap("gmtCreate")
        private Long gmtCreate;

        @NameInMap("gmtEnd")
        private Long gmtEnd;

        @NameInMap("gmtModified")
        private Long gmtModified;

        @NameInMap("gmtStart")
        private Long gmtStart;

        @NameInMap("identifier")
        private String identifier;

        @NameInMap("recordUser")
        private String recordUser;

        @NameInMap("type")
        private String type;

        @NameInMap("workitemIdentifier")
        private String workitemIdentifier;

        private WorkitemTime(Builder builder) {
            this.actualTime = builder.actualTime;
            this.description = builder.description;
            this.gmtCreate = builder.gmtCreate;
            this.gmtEnd = builder.gmtEnd;
            this.gmtModified = builder.gmtModified;
            this.gmtStart = builder.gmtStart;
            this.identifier = builder.identifier;
            this.recordUser = builder.recordUser;
            this.type = builder.type;
            this.workitemIdentifier = builder.workitemIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WorkitemTime create() {
            return builder().build();
        }

        /**
         * @return actualTime
         */
        public Float getActualTime() {
            return this.actualTime;
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
        public String getRecordUser() {
            return this.recordUser;
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
            private Float actualTime; 
            private String description; 
            private Long gmtCreate; 
            private Long gmtEnd; 
            private Long gmtModified; 
            private Long gmtStart; 
            private String identifier; 
            private String recordUser; 
            private String type; 
            private String workitemIdentifier; 

            /**
             * actualTime.
             */
            public Builder actualTime(Float actualTime) {
                this.actualTime = actualTime;
                return this;
            }

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
            public Builder recordUser(String recordUser) {
                this.recordUser = recordUser;
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

            public WorkitemTime build() {
                return new WorkitemTime(this);
            } 

        } 

    }
}
