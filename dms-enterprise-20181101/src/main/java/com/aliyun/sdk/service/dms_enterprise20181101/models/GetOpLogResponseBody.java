// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetOpLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpLogResponseBody</p>
 */
public class GetOpLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("OpLogDetails")
    private OpLogDetails opLogDetails;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private GetOpLogResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.opLogDetails = builder.opLogDetails;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return opLogDetails
     */
    public OpLogDetails getOpLogDetails() {
        return this.opLogDetails;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private OpLogDetails opLogDetails; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>403</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The details of the operation log.</p>
         */
        public Builder opLogDetails(OpLogDetails opLogDetails) {
            this.opLogDetails = opLogDetails;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>47D56208-DB1D-4FD3-BE32-300E43185488</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request was successful.</li>
         * <li><strong>false</strong>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of operation logs that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetOpLogResponseBody build() {
            return new GetOpLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOpLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpLogResponseBody</p>
     */
    public static class OpLogDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Database")
        private String database;

        @com.aliyun.core.annotation.NameInMap("Module")
        private String module;

        @com.aliyun.core.annotation.NameInMap("OpContent")
        private String opContent;

        @com.aliyun.core.annotation.NameInMap("OpTime")
        private String opTime;

        @com.aliyun.core.annotation.NameInMap("OpUserId")
        private Long opUserId;

        @com.aliyun.core.annotation.NameInMap("OrderId")
        private Long orderId;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("UserNick")
        private String userNick;

        private OpLogDetail(Builder builder) {
            this.database = builder.database;
            this.module = builder.module;
            this.opContent = builder.opContent;
            this.opTime = builder.opTime;
            this.opUserId = builder.opUserId;
            this.orderId = builder.orderId;
            this.userId = builder.userId;
            this.userNick = builder.userNick;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpLogDetail create() {
            return builder().build();
        }

        /**
         * @return database
         */
        public String getDatabase() {
            return this.database;
        }

        /**
         * @return module
         */
        public String getModule() {
            return this.module;
        }

        /**
         * @return opContent
         */
        public String getOpContent() {
            return this.opContent;
        }

        /**
         * @return opTime
         */
        public String getOpTime() {
            return this.opTime;
        }

        /**
         * @return opUserId
         */
        public Long getOpUserId() {
            return this.opUserId;
        }

        /**
         * @return orderId
         */
        public Long getOrderId() {
            return this.orderId;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userNick
         */
        public String getUserNick() {
            return this.userNick;
        }

        public static final class Builder {
            private String database; 
            private String module; 
            private String opContent; 
            private String opTime; 
            private Long opUserId; 
            private Long orderId; 
            private String userId; 
            private String userNick; 

            /**
             * <p>The endpoint of the database instance.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>This parameter is valid only for database instances of the LocalInstance type.</p>
             * </li>
             * <li><p>This parameter is valid only for operations on the functional modules related to tasks.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:dmstest_prod_database@dmstest.rds">dmstest_prod_database@dmstest.rds</a>... [Test instance]</p>
             */
            public Builder database(String database) {
                this.database = database;
                return this;
            }

            /**
             * <p>The functional module for which the operation log is queried.</p>
             * 
             * <strong>example:</strong>
             * <p>SECURITY_RULE</p>
             */
            public Builder module(String module) {
                this.module = module;
                return this;
            }

            /**
             * <p>The details of the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>SELECT * FROM <code>orders</code> \n LIMIT 20</p>
             */
            public Builder opContent(String opContent) {
                this.opContent = opContent;
                return this;
            }

            /**
             * <p>The time when the operation was performed.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-28 16:45:19</p>
             */
            public Builder opTime(String opTime) {
                this.opTime = opTime;
                return this;
            }

            /**
             * <p>The ID of the user who performed the operation.</p>
             * 
             * <strong>example:</strong>
             * <p>51****</p>
             */
            public Builder opUserId(Long opUserId) {
                this.opUserId = opUserId;
                return this;
            }

            /**
             * <p>The ID of the ticket or task.</p>
             * <blockquote>
             * <p> This parameter is valid only for operations on the functional modules related to tasks and the task management module in system management.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>509****</p>
             */
            public Builder orderId(Long orderId) {
                this.orderId = orderId;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account.</p>
             * 
             * <strong>example:</strong>
             * <p>22275482072787****</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * <p>The display name of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>test_name</p>
             */
            public Builder userNick(String userNick) {
                this.userNick = userNick;
                return this;
            }

            public OpLogDetail build() {
                return new OpLogDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOpLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOpLogResponseBody</p>
     */
    public static class OpLogDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OpLogDetail")
        private java.util.List<OpLogDetail> opLogDetail;

        private OpLogDetails(Builder builder) {
            this.opLogDetail = builder.opLogDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OpLogDetails create() {
            return builder().build();
        }

        /**
         * @return opLogDetail
         */
        public java.util.List<OpLogDetail> getOpLogDetail() {
            return this.opLogDetail;
        }

        public static final class Builder {
            private java.util.List<OpLogDetail> opLogDetail; 

            /**
             * OpLogDetail.
             */
            public Builder opLogDetail(java.util.List<OpLogDetail> opLogDetail) {
                this.opLogDetail = opLogDetail;
                return this;
            }

            public OpLogDetails build() {
                return new OpLogDetails(this);
            } 

        } 

    }
}
