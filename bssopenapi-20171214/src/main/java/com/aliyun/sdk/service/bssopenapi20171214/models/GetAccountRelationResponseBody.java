// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountRelationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountRelationResponseBody</p>
 */
public class GetAccountRelationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAccountRelationResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountRelationResponseBody create() {
        return builder().build();
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The status code returned.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the call is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAccountRelationResponseBody build() {
            return new GetAccountRelationResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildUserId")
        private Long childUserId;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ParentUserId")
        private Long parentUserId;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.childUserId = builder.childUserId;
            this.endTime = builder.endTime;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.parentUserId = builder.parentUserId;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return childUserId
         */
        public Long getChildUserId() {
            return this.childUserId;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return parentUserId
         */
        public Long getParentUserId() {
            return this.parentUserId;
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
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long childUserId; 
            private Long endTime; 
            private Long gmtModified; 
            private Long id; 
            private Long parentUserId; 
            private Long startTime; 
            private String status; 
            private String type; 

            /**
             * The ID of the Alibaba Cloud account that is used as a member.
             */
            public Builder childUserId(Long childUserId) {
                this.childUserId = childUserId;
                return this;
            }

            /**
             * The time when the financial relationship between the management account and the member was terminated.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The time when the financial relationship between the management account and the member was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the financial relationship.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used as the management account.
             */
            public Builder parentUserId(Long parentUserId) {
                this.parentUserId = parentUserId;
                return this;
            }

            /**
             * The time when the financial relationship between the management account and the member was established.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the financial relationship between the management account and the member.
             * <p>
             * 
             * - RELATED 【Association established】
             * - CONFIRMING 【To be confirmed by the other party】
             * - REJECTED 【Refused by the other party】
             * - CONNECTION_CANCELED 【Financial sub-account cancel request】
             * - CONNECTION_MASTER_CANCEL 【Financial master account cancel invitation】
             * - CHANGE_CONFIRMING 【Relationship change to be confirmed】
             * - INITIAL 【Initial new relationship status】
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The type of the financial relationship.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
