// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTaskFlowCooperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowCooperatorsResponseBody</p>
 */
public class ListTaskFlowCooperatorsResponseBody extends TeaModel {
    @NameInMap("CooperatorList")
    private CooperatorList cooperatorList;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListTaskFlowCooperatorsResponseBody(Builder builder) {
        this.cooperatorList = builder.cooperatorList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTaskFlowCooperatorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return cooperatorList
     */
    public CooperatorList getCooperatorList() {
        return this.cooperatorList;
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
        private CooperatorList cooperatorList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * The users that are involved in the task flow.
         */
        public Builder cooperatorList(CooperatorList cooperatorList) {
            this.cooperatorList = cooperatorList;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request. You can use the ID to locate logs and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   **true**: The request was successful.
         * *   **false**: The request failed.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListTaskFlowCooperatorsResponseBody build() {
            return new ListTaskFlowCooperatorsResponseBody(this);
        } 

    } 

    public static class Cooperator extends TeaModel {
        @NameInMap("Email")
        private String email;

        @NameInMap("LoginName")
        private String loginName;

        @NameInMap("NickName")
        private String nickName;

        @NameInMap("UserId")
        private String userId;

        private Cooperator(Builder builder) {
            this.email = builder.email;
            this.loginName = builder.loginName;
            this.nickName = builder.nickName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cooperator create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return loginName
         */
        public String getLoginName() {
            return this.loginName;
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String email; 
            private String loginName; 
            private String nickName; 
            private String userId; 

            /**
             * The email address of the user.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * The username.
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * The alias of the user.
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Cooperator build() {
                return new Cooperator(this);
            } 

        } 

    }
    public static class CooperatorList extends TeaModel {
        @NameInMap("Cooperator")
        private java.util.List < Cooperator> cooperator;

        private CooperatorList(Builder builder) {
            this.cooperator = builder.cooperator;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CooperatorList create() {
            return builder().build();
        }

        /**
         * @return cooperator
         */
        public java.util.List < Cooperator> getCooperator() {
            return this.cooperator;
        }

        public static final class Builder {
            private java.util.List < Cooperator> cooperator; 

            /**
             * Cooperator.
             */
            public Builder cooperator(java.util.List < Cooperator> cooperator) {
                this.cooperator = cooperator;
                return this;
            }

            public CooperatorList build() {
                return new CooperatorList(this);
            } 

        } 

    }
}
