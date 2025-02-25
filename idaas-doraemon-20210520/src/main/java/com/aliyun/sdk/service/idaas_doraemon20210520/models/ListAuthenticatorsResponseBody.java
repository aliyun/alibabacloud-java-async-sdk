// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.idaas_doraemon20210520.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthenticatorsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthenticatorsResponseBody</p>
 */
public class ListAuthenticatorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Authenticator")
    private java.util.List < Authenticator> authenticator;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListAuthenticatorsResponseBody(Builder builder) {
        this.authenticator = builder.authenticator;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthenticatorsResponseBody create() {
        return builder().build();
    }

    /**
     * @return authenticator
     */
    public java.util.List < Authenticator> getAuthenticator() {
        return this.authenticator;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Authenticator> authenticator; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Authenticator.
         */
        public Builder authenticator(java.util.List < Authenticator> authenticator) {
            this.authenticator = authenticator;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthenticatorsResponseBody build() {
            return new ListAuthenticatorsResponseBody(this);
        } 

    } 

    public static class Authenticator extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApplicationExternalId")
        private String applicationExternalId;

        @com.aliyun.core.annotation.NameInMap("AuthenticatorName")
        private String authenticatorName;

        @com.aliyun.core.annotation.NameInMap("AuthenticatorUuid")
        private String authenticatorUuid;

        @com.aliyun.core.annotation.NameInMap("CredentialId")
        private String credentialId;

        @com.aliyun.core.annotation.NameInMap("LastVerifyTime")
        private Long lastVerifyTime;

        @com.aliyun.core.annotation.NameInMap("RegisterTime")
        private Long registerTime;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Authenticator(Builder builder) {
            this.applicationExternalId = builder.applicationExternalId;
            this.authenticatorName = builder.authenticatorName;
            this.authenticatorUuid = builder.authenticatorUuid;
            this.credentialId = builder.credentialId;
            this.lastVerifyTime = builder.lastVerifyTime;
            this.registerTime = builder.registerTime;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authenticator create() {
            return builder().build();
        }

        /**
         * @return applicationExternalId
         */
        public String getApplicationExternalId() {
            return this.applicationExternalId;
        }

        /**
         * @return authenticatorName
         */
        public String getAuthenticatorName() {
            return this.authenticatorName;
        }

        /**
         * @return authenticatorUuid
         */
        public String getAuthenticatorUuid() {
            return this.authenticatorUuid;
        }

        /**
         * @return credentialId
         */
        public String getCredentialId() {
            return this.credentialId;
        }

        /**
         * @return lastVerifyTime
         */
        public Long getLastVerifyTime() {
            return this.lastVerifyTime;
        }

        /**
         * @return registerTime
         */
        public Long getRegisterTime() {
            return this.registerTime;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String applicationExternalId; 
            private String authenticatorName; 
            private String authenticatorUuid; 
            private String credentialId; 
            private Long lastVerifyTime; 
            private Long registerTime; 
            private String type; 

            /**
             * ApplicationExternalId.
             */
            public Builder applicationExternalId(String applicationExternalId) {
                this.applicationExternalId = applicationExternalId;
                return this;
            }

            /**
             * AuthenticatorName.
             */
            public Builder authenticatorName(String authenticatorName) {
                this.authenticatorName = authenticatorName;
                return this;
            }

            /**
             * AuthenticatorUuid.
             */
            public Builder authenticatorUuid(String authenticatorUuid) {
                this.authenticatorUuid = authenticatorUuid;
                return this;
            }

            /**
             * CredentialId.
             */
            public Builder credentialId(String credentialId) {
                this.credentialId = credentialId;
                return this;
            }

            /**
             * LastVerifyTime.
             */
            public Builder lastVerifyTime(Long lastVerifyTime) {
                this.lastVerifyTime = lastVerifyTime;
                return this;
            }

            /**
             * RegisterTime.
             */
            public Builder registerTime(Long registerTime) {
                this.registerTime = registerTime;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Authenticator build() {
                return new Authenticator(this);
            } 

        } 

    }
}
