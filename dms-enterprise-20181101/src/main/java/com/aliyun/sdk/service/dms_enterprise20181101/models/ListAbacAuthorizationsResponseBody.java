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
 * {@link ListAbacAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAbacAuthorizationsResponseBody</p>
 */
public class ListAbacAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AuthorizationList")
    private java.util.List<AuthorizationList> authorizationList;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAbacAuthorizationsResponseBody(Builder builder) {
        this.authorizationList = builder.authorizationList;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAbacAuthorizationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizationList
     */
    public java.util.List<AuthorizationList> getAuthorizationList() {
        return this.authorizationList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<AuthorizationList> authorizationList; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * AuthorizationList.
         */
        public Builder authorizationList(java.util.List<AuthorizationList> authorizationList) {
            this.authorizationList = authorizationList;
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

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAbacAuthorizationsResponseBody build() {
            return new ListAbacAuthorizationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAbacAuthorizationsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAbacAuthorizationsResponseBody</p>
     */
    public static class AuthorizationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthorizationId")
        private Long authorizationId;

        @com.aliyun.core.annotation.NameInMap("IdentityId")
        private Long identityId;

        @com.aliyun.core.annotation.NameInMap("IdentityName")
        private String identityName;

        @com.aliyun.core.annotation.NameInMap("IdentityType")
        private String identityType;

        @com.aliyun.core.annotation.NameInMap("PolicyId")
        private Long policyId;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicySource")
        private String policySource;

        private AuthorizationList(Builder builder) {
            this.authorizationId = builder.authorizationId;
            this.identityId = builder.identityId;
            this.identityName = builder.identityName;
            this.identityType = builder.identityType;
            this.policyId = builder.policyId;
            this.policyName = builder.policyName;
            this.policySource = builder.policySource;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationList create() {
            return builder().build();
        }

        /**
         * @return authorizationId
         */
        public Long getAuthorizationId() {
            return this.authorizationId;
        }

        /**
         * @return identityId
         */
        public Long getIdentityId() {
            return this.identityId;
        }

        /**
         * @return identityName
         */
        public String getIdentityName() {
            return this.identityName;
        }

        /**
         * @return identityType
         */
        public String getIdentityType() {
            return this.identityType;
        }

        /**
         * @return policyId
         */
        public Long getPolicyId() {
            return this.policyId;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policySource
         */
        public String getPolicySource() {
            return this.policySource;
        }

        public static final class Builder {
            private Long authorizationId; 
            private Long identityId; 
            private String identityName; 
            private String identityType; 
            private Long policyId; 
            private String policyName; 
            private String policySource; 

            /**
             * AuthorizationId.
             */
            public Builder authorizationId(Long authorizationId) {
                this.authorizationId = authorizationId;
                return this;
            }

            /**
             * IdentityId.
             */
            public Builder identityId(Long identityId) {
                this.identityId = identityId;
                return this;
            }

            /**
             * IdentityName.
             */
            public Builder identityName(String identityName) {
                this.identityName = identityName;
                return this;
            }

            /**
             * IdentityType.
             */
            public Builder identityType(String identityType) {
                this.identityType = identityType;
                return this;
            }

            /**
             * PolicyId.
             */
            public Builder policyId(Long policyId) {
                this.policyId = policyId;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicySource.
             */
            public Builder policySource(String policySource) {
                this.policySource = policySource;
                return this;
            }

            public AuthorizationList build() {
                return new AuthorizationList(this);
            } 

        } 

    }
}
