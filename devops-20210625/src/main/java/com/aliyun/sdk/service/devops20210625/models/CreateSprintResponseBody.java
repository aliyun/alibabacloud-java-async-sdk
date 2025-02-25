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
 * {@link CreateSprintResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSprintResponseBody</p>
 */
public class CreateSprintResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sprint")
    private Sprint sprint;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private CreateSprintResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.sprint = builder.sprint;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSprintResponseBody create() {
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
     * @return sprint
     */
    public Sprint getSprint() {
        return this.sprint;
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
        private String requestId; 
        private Sprint sprint; 
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
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * sprint.
         */
        public Builder sprint(Sprint sprint) {
            this.sprint = sprint;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateSprintResponseBody build() {
            return new CreateSprintResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSprintResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSprintResponseBody</p>
     */
    public static class Sprint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("endDate")
        private Long endDate;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("modifier")
        private String modifier;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("spaceIdentifier")
        private String spaceIdentifier;

        @com.aliyun.core.annotation.NameInMap("startDate")
        private Long startDate;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Sprint(Builder builder) {
            this.creator = builder.creator;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.identifier = builder.identifier;
            this.modifier = builder.modifier;
            this.name = builder.name;
            this.scope = builder.scope;
            this.spaceIdentifier = builder.spaceIdentifier;
            this.startDate = builder.startDate;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Sprint create() {
            return builder().build();
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endDate
         */
        public Long getEndDate() {
            return this.endDate;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
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
        public String getModifier() {
            return this.modifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return spaceIdentifier
         */
        public String getSpaceIdentifier() {
            return this.spaceIdentifier;
        }

        /**
         * @return startDate
         */
        public Long getStartDate() {
            return this.startDate;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String creator; 
            private String description; 
            private Long endDate; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private String identifier; 
            private String modifier; 
            private String name; 
            private String scope; 
            private String spaceIdentifier; 
            private Long startDate; 
            private String status; 

            /**
             * creator.
             */
            public Builder creator(String creator) {
                this.creator = creator;
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
             * endDate.
             */
            public Builder endDate(Long endDate) {
                this.endDate = endDate;
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
             * gmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
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
             * modifier.
             */
            public Builder modifier(String modifier) {
                this.modifier = modifier;
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
             * scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
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
             * startDate.
             */
            public Builder startDate(Long startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Sprint build() {
                return new Sprint(this);
            } 

        } 

    }
}
