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
 * {@link ListTaskFlowCooperatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTaskFlowCooperatorsResponseBody</p>
 */
public class ListTaskFlowCooperatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CooperatorList")
    private CooperatorList cooperatorList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ListTaskFlowCooperatorsResponseBody model) {
            this.cooperatorList = model.cooperatorList;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The users that are involved in the task flow.</p>
         */
        public Builder cooperatorList(CooperatorList cooperatorList) {
            this.cooperatorList = cooperatorList;
            return this;
        }

        /**
         * <p>The error code returned if the request failed.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
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
         * <p>The ID of the request. You can use the ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>54C99C70-2DFF-5A8C-A252-EBAA1EB668EC</p>
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

        public ListTaskFlowCooperatorsResponseBody build() {
            return new ListTaskFlowCooperatorsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTaskFlowCooperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowCooperatorsResponseBody</p>
     */
    public static class Cooperator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("LoginName")
        private String loginName;

        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UserId")
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

            private Builder() {
            } 

            private Builder(Cooperator model) {
                this.email = model.email;
                this.loginName = model.loginName;
                this.nickName = model.nickName;
                this.userId = model.userId;
            } 

            /**
             * <p>The email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@XX.com">test@XX.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder loginName(String loginName) {
                this.loginName = loginName;
                return this;
            }

            /**
             * <p>The alias of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>userId.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
    /**
     * 
     * {@link ListTaskFlowCooperatorsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTaskFlowCooperatorsResponseBody</p>
     */
    public static class CooperatorList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cooperator")
        private java.util.List<Cooperator> cooperator;

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
        public java.util.List<Cooperator> getCooperator() {
            return this.cooperator;
        }

        public static final class Builder {
            private java.util.List<Cooperator> cooperator; 

            private Builder() {
            } 

            private Builder(CooperatorList model) {
                this.cooperator = model.cooperator;
            } 

            /**
             * Cooperator.
             */
            public Builder cooperator(java.util.List<Cooperator> cooperator) {
                this.cooperator = cooperator;
                return this;
            }

            public CooperatorList build() {
                return new CooperatorList(this);
            } 

        } 

    }
}
