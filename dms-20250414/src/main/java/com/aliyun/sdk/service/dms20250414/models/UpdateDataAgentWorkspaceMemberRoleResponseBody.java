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
 * {@link UpdateDataAgentWorkspaceMemberRoleResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateDataAgentWorkspaceMemberRoleResponseBody</p>
 */
public class UpdateDataAgentWorkspaceMemberRoleResponseBody extends TeaModel {
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

    private UpdateDataAgentWorkspaceMemberRoleResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentWorkspaceMemberRoleResponseBody create() {
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

        private Builder(UpdateDataAgentWorkspaceMemberRoleResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public UpdateDataAgentWorkspaceMemberRoleResponseBody build() {
            return new UpdateDataAgentWorkspaceMemberRoleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataAgentWorkspaceMemberRoleResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateDataAgentWorkspaceMemberRoleResponseBody</p>
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
             * JoinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * RoleName.
             */
            public Builder roleName(String roleName) {
                this.roleName = roleName;
                return this;
            }

            /**
             * RunningTaskNumber.
             */
            public Builder runningTaskNumber(Long runningTaskNumber) {
                this.runningTaskNumber = runningTaskNumber;
                return this;
            }

            /**
             * TotalTaskNumber.
             */
            public Builder totalTaskNumber(Long totalTaskNumber) {
                this.totalTaskNumber = totalTaskNumber;
                return this;
            }

            /**
             * UserName.
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
