// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned.</p>
         * 
         * <strong>example:</strong>
         * <p>Message returned</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>RequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAccountRelationResponseBody build() {
            return new GetAccountRelationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAccountRelationResponseBody} extends {@link TeaModel}
     *
     * <p>GetAccountRelationResponseBody</p>
     */
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
             * <p>The ID of the Alibaba Cloud account that is used as a member.</p>
             * 
             * <strong>example:</strong>
             * <p>ID of the Alibaba Cloud account that is used as a member</p>
             */
            public Builder childUserId(Long childUserId) {
                this.childUserId = childUserId;
                return this;
            }

            /**
             * <p>The time when the financial relationship between the management account and the member was terminated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The time when the financial relationship between the management account and the member was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the financial relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>ID of the financial relationship</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used as the management account.</p>
             * 
             * <strong>example:</strong>
             * <p>ID of the Alibaba Cloud account that is used as the management account</p>
             */
            public Builder parentUserId(Long parentUserId) {
                this.parentUserId = parentUserId;
                return this;
            }

            /**
             * <p>The time when the financial relationship between the management account and the member was established.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the financial relationship between the management account and the member.</p>
             * <ul>
             * <li>RELATED 【Association established】</li>
             * <li>CONFIRMING 【To be confirmed by the other party】</li>
             * <li>REJECTED 【Refused by the other party】</li>
             * <li>CONNECTION_CANCELED 【Financial sub-account cancel request】</li>
             * <li>CONNECTION_MASTER_CANCEL 【Financial master account cancel invitation】</li>
             * <li>CHANGE_CONFIRMING 【Relationship change to be confirmed】</li>
             * <li>INITIAL 【Initial new relationship status】</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELATED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the financial relationship.</p>
             * 
             * <strong>example:</strong>
             * <p>enterprise_group</p>
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
