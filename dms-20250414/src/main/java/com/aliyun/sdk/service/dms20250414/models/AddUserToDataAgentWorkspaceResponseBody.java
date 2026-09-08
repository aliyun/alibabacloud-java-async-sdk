// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link AddUserToDataAgentWorkspaceResponseBody} extends {@link TeaModel}
 *
 * <p>AddUserToDataAgentWorkspaceResponseBody</p>
 */
public class AddUserToDataAgentWorkspaceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private AddUserToDataAgentWorkspaceResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserToDataAgentWorkspaceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(AddUserToDataAgentWorkspaceResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>DMS-DA-40114</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>67E910F2-***-695C</p>
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

        public AddUserToDataAgentWorkspaceResponseBody build() {
            return new AddUserToDataAgentWorkspaceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link AddUserToDataAgentWorkspaceResponseBody} extends {@link TeaModel}
     *
     * <p>AddUserToDataAgentWorkspaceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("RoleName")
        private String roleName;

        @com.aliyun.core.annotation.NameInMap("RunningTaskNumber")
        private Long runningTaskNumber;

        @com.aliyun.core.annotation.NameInMap("TotalTaskNumber")
        private Long totalTaskNumber;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.joinTime = builder.joinTime;
            this.memberId = builder.memberId;
            this.roleName = builder.roleName;
            this.runningTaskNumber = builder.runningTaskNumber;
            this.totalTaskNumber = builder.totalTaskNumber;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return roleName
         */
        public String getRoleName() {
            return this.roleName;
        }

        /**
         * @return runningTaskNumber
         */
        public Long getRunningTaskNumber() {
            return this.runningTaskNumber;
        }

        /**
         * @return totalTaskNumber
         */
        public Long getTotalTaskNumber() {
            return this.totalTaskNumber;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private Long joinTime; 
            private String memberId; 
            private String roleName; 
            private Long runningTaskNumber; 
            private Long totalTaskNumber; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.joinTime = model.joinTime;
                this.memberId = model.memberId;
                this.roleName = model.roleName;
                this.runningTaskNumber = model.runningTaskNumber;
                this.totalTaskNumber = model.totalTaskNumber;
                this.userName = model.userName;
            } 

            /**
             * <p>The time when the user joined the workspace. This is a UNIX timestamp in seconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1765960516</p>
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * <p>The Alibaba Cloud UID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>20282*****7591</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>The name of the user\&quot;s role in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>admin</p>
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * <p>The number of tasks that the user is running in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder runningTaskNumber(Long runningTaskNumber) {
                this.runningTaskNumber = runningTaskNumber;
                return this;
            }

            /**
             * <p>The total number of tasks that the user initiated in the workspace.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalTaskNumber(Long totalTaskNumber) {
                this.totalTaskNumber = totalTaskNumber;
                return this;
            }

            /**
             * <p>The RAM username.</p>
             * 
             * <strong>example:</strong>
             * <p>agentTest</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
