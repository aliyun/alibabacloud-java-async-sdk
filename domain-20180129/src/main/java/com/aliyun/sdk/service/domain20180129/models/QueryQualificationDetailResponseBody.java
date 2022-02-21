// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryQualificationDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryQualificationDetailResponseBody</p>
 */
public class QueryQualificationDetailResponseBody extends TeaModel {
    @NameInMap("AuditStatus")
    private Integer auditStatus;

    @NameInMap("Credentials")
    private Credentials credentials;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TrackId")
    private String trackId;

    private QueryQualificationDetailResponseBody(Builder builder) {
        this.auditStatus = builder.auditStatus;
        this.credentials = builder.credentials;
        this.requestId = builder.requestId;
        this.trackId = builder.trackId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryQualificationDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return auditStatus
     */
    public Integer getAuditStatus() {
        return this.auditStatus;
    }

    /**
     * @return credentials
     */
    public Credentials getCredentials() {
        return this.credentials;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trackId
     */
    public String getTrackId() {
        return this.trackId;
    }

    public static final class Builder {
        private Integer auditStatus; 
        private Credentials credentials; 
        private String requestId; 
        private String trackId; 

        /**
         * AuditStatus.
         */
        public Builder auditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }

        /**
         * Credentials.
         */
        public Builder credentials(Credentials credentials) {
            this.credentials = credentials;
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
         * TrackId.
         */
        public Builder trackId(String trackId) {
            this.trackId = trackId;
            return this;
        }

        public QueryQualificationDetailResponseBody build() {
            return new QueryQualificationDetailResponseBody(this);
        } 

    } 

    public static class QualificationCredential extends TeaModel {
        @NameInMap("CredentialNo")
        private String credentialNo;

        @NameInMap("CredentialType")
        private String credentialType;

        @NameInMap("CredentialUrl")
        private String credentialUrl;

        private QualificationCredential(Builder builder) {
            this.credentialNo = builder.credentialNo;
            this.credentialType = builder.credentialType;
            this.credentialUrl = builder.credentialUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static QualificationCredential create() {
            return builder().build();
        }

        /**
         * @return credentialNo
         */
        public String getCredentialNo() {
            return this.credentialNo;
        }

        /**
         * @return credentialType
         */
        public String getCredentialType() {
            return this.credentialType;
        }

        /**
         * @return credentialUrl
         */
        public String getCredentialUrl() {
            return this.credentialUrl;
        }

        public static final class Builder {
            private String credentialNo; 
            private String credentialType; 
            private String credentialUrl; 

            /**
             * CredentialNo.
             */
            public Builder credentialNo(String credentialNo) {
                this.credentialNo = credentialNo;
                return this;
            }

            /**
             * CredentialType.
             */
            public Builder credentialType(String credentialType) {
                this.credentialType = credentialType;
                return this;
            }

            /**
             * CredentialUrl.
             */
            public Builder credentialUrl(String credentialUrl) {
                this.credentialUrl = credentialUrl;
                return this;
            }

            public QualificationCredential build() {
                return new QualificationCredential(this);
            } 

        } 

    }
    public static class Credentials extends TeaModel {
        @NameInMap("QualificationCredential")
        private java.util.List < QualificationCredential> qualificationCredential;

        private Credentials(Builder builder) {
            this.qualificationCredential = builder.qualificationCredential;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Credentials create() {
            return builder().build();
        }

        /**
         * @return qualificationCredential
         */
        public java.util.List < QualificationCredential> getQualificationCredential() {
            return this.qualificationCredential;
        }

        public static final class Builder {
            private java.util.List < QualificationCredential> qualificationCredential; 

            /**
             * QualificationCredential.
             */
            public Builder qualificationCredential(java.util.List < QualificationCredential> qualificationCredential) {
                this.qualificationCredential = qualificationCredential;
                return this;
            }

            public Credentials build() {
                return new Credentials(this);
            } 

        } 

    }
}
