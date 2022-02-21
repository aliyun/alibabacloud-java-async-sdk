// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRegistrantProfileRealNameVerificationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfileRealNameVerificationInfoResponseBody</p>
 */
public class QueryRegistrantProfileRealNameVerificationInfoResponseBody extends TeaModel {
    @NameInMap("IdentityCredential")
    private String identityCredential;

    @NameInMap("IdentityCredentialNo")
    private String identityCredentialNo;

    @NameInMap("IdentityCredentialType")
    private String identityCredentialType;

    @NameInMap("IdentityCredentialUrl")
    private String identityCredentialUrl;

    @NameInMap("ModificationDate")
    private String modificationDate;

    @NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubmissionDate")
    private String submissionDate;

    private QueryRegistrantProfileRealNameVerificationInfoResponseBody(Builder builder) {
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.identityCredentialUrl = builder.identityCredentialUrl;
        this.modificationDate = builder.modificationDate;
        this.registrantProfileId = builder.registrantProfileId;
        this.requestId = builder.requestId;
        this.submissionDate = builder.submissionDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRegistrantProfileRealNameVerificationInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return identityCredential
     */
    public String getIdentityCredential() {
        return this.identityCredential;
    }

    /**
     * @return identityCredentialNo
     */
    public String getIdentityCredentialNo() {
        return this.identityCredentialNo;
    }

    /**
     * @return identityCredentialType
     */
    public String getIdentityCredentialType() {
        return this.identityCredentialType;
    }

    /**
     * @return identityCredentialUrl
     */
    public String getIdentityCredentialUrl() {
        return this.identityCredentialUrl;
    }

    /**
     * @return modificationDate
     */
    public String getModificationDate() {
        return this.modificationDate;
    }

    /**
     * @return registrantProfileId
     */
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return submissionDate
     */
    public String getSubmissionDate() {
        return this.submissionDate;
    }

    public static final class Builder {
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String identityCredentialUrl; 
        private String modificationDate; 
        private Long registrantProfileId; 
        private String requestId; 
        private String submissionDate; 

        /**
         * IdentityCredential.
         */
        public Builder identityCredential(String identityCredential) {
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * IdentityCredentialNo.
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * IdentityCredentialType.
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.identityCredentialType = identityCredentialType;
            return this;
        }

        /**
         * IdentityCredentialUrl.
         */
        public Builder identityCredentialUrl(String identityCredentialUrl) {
            this.identityCredentialUrl = identityCredentialUrl;
            return this;
        }

        /**
         * ModificationDate.
         */
        public Builder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        /**
         * RegistrantProfileId.
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
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
         * SubmissionDate.
         */
        public Builder submissionDate(String submissionDate) {
            this.submissionDate = submissionDate;
            return this;
        }

        public QueryRegistrantProfileRealNameVerificationInfoResponseBody build() {
            return new QueryRegistrantProfileRealNameVerificationInfoResponseBody(this);
        } 

    } 

}
