// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainRealNameVerificationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainRealNameVerificationInfoResponseBody</p>
 */
public class QueryDomainRealNameVerificationInfoResponseBody extends TeaModel {
    @NameInMap("DomainName")
    private String domainName;

    @NameInMap("IdentityCredential")
    private String identityCredential;

    @NameInMap("IdentityCredentialNo")
    private String identityCredentialNo;

    @NameInMap("IdentityCredentialType")
    private String identityCredentialType;

    @NameInMap("IdentityCredentialUrl")
    private String identityCredentialUrl;

    @NameInMap("InstanceId")
    private String instanceId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SubmissionDate")
    private String submissionDate;

    private QueryDomainRealNameVerificationInfoResponseBody(Builder builder) {
        this.domainName = builder.domainName;
        this.identityCredential = builder.identityCredential;
        this.identityCredentialNo = builder.identityCredentialNo;
        this.identityCredentialType = builder.identityCredentialType;
        this.identityCredentialUrl = builder.identityCredentialUrl;
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
        this.submissionDate = builder.submissionDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainRealNameVerificationInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
        private String domainName; 
        private String identityCredential; 
        private String identityCredentialNo; 
        private String identityCredentialType; 
        private String identityCredentialUrl; 
        private String instanceId; 
        private String requestId; 
        private String submissionDate; 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
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

        public QueryDomainRealNameVerificationInfoResponseBody build() {
            return new QueryDomainRealNameVerificationInfoResponseBody(this);
        } 

    } 

}
