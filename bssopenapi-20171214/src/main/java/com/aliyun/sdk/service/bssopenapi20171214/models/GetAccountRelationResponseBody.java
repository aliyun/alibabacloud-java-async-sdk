// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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

        private Builder() {
        } 

        private Builder(GetAccountRelationResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The request status code.</p>
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
         * <p>The message.</p>
         * 
         * <strong>example:</strong>
         * <p>Message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>RequestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.childUserId = model.childUserId;
                this.endTime = model.endTime;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.parentUserId = model.parentUserId;
                this.startTime = model.startTime;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The UID of the child account.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud account UID of the child account</p>
             */
            public Builder childUserId(Long childUserId) {
                this.childUserId = childUserId;
                return this;
            }

            /**
             * <p>The end time of the account linking, in the YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The update time of the account linking.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-12-01</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The account linking ID.</p>
             * 
             * <strong>example:</strong>
             * <p>Account linking ID</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The UID of the parent account.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba Cloud UID of the main account</p>
             */
            public Builder parentUserId(Long parentUserId) {
                this.parentUserId = parentUserId;
                return this;
            }

            /**
             * <p>The start time of the account linking, in the YYYY-MM-DD format.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The account linking status. Valid values:</p>
             * <ul>
             * <li>RELATED: linked.</li>
             * <li>CONFIRMING: pending confirmation from the other party.</li>
             * <li>REJECTED: rejected by the other party.</li>
             * <li>CONNECTION_CANCELED: application canceled by the child account.</li>
             * <li>CONNECTION_MASTER_CANCEL: invitation canceled by the main account.</li>
             * <li>CHANGE_CONFIRMING: pending confirmation for relationship change.</li>
             * <li>INITIAL: initial status of a newly created linking.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RELATED: linked</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The account linking type.</p>
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
