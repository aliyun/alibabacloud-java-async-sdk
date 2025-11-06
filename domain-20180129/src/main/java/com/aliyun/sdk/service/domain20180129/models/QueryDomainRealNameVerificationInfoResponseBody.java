// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link QueryDomainRealNameVerificationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainRealNameVerificationInfoResponseBody</p>
 */
public class QueryDomainRealNameVerificationInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("IdentityCredential")
    private String identityCredential;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialNo")
    private String identityCredentialNo;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialType")
    private String identityCredentialType;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialUrl")
    private String identityCredentialUrl;

    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubmissionDate")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryDomainRealNameVerificationInfoResponseBody model) {
            this.domainName = model.domainName;
            this.identityCredential = model.identityCredential;
            this.identityCredentialNo = model.identityCredentialNo;
            this.identityCredentialType = model.identityCredentialType;
            this.identityCredentialUrl = model.identityCredentialUrl;
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
            this.submissionDate = model.submissionDate;
        } 

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
