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
 * {@link QueryRegistrantProfileRealNameVerificationInfoResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRegistrantProfileRealNameVerificationInfoResponseBody</p>
 */
public class QueryRegistrantProfileRealNameVerificationInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IdentityCredential")
    private String identityCredential;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialNo")
    private String identityCredentialNo;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialType")
    private String identityCredentialType;

    @com.aliyun.core.annotation.NameInMap("IdentityCredentialUrl")
    private String identityCredentialUrl;

    @com.aliyun.core.annotation.NameInMap("ModificationDate")
    private String modificationDate;

    @com.aliyun.core.annotation.NameInMap("RegistrantProfileId")
    private Long registrantProfileId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubmissionDate")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QueryRegistrantProfileRealNameVerificationInfoResponseBody model) {
            this.identityCredential = model.identityCredential;
            this.identityCredentialNo = model.identityCredentialNo;
            this.identityCredentialType = model.identityCredentialType;
            this.identityCredentialUrl = model.identityCredentialUrl;
            this.modificationDate = model.modificationDate;
            this.registrantProfileId = model.registrantProfileId;
            this.requestId = model.requestId;
            this.submissionDate = model.submissionDate;
        } 

        /**
         * <p>The Base64-encoded image of the identity verification documents.</p>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>The certificate number used for identity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>4111111111111110**</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>The type of certificate used for identity verification. Valid values:  </p>
         * <ul>
         * <li><strong>SFZ</strong>: Identity card.  </li>
         * <li><strong>HZ</strong>: Passport.  </li>
         * <li><strong>YYZZ</strong>: Business license.  </li>
         * <li><strong>ORG</strong>: Organization code certificate.  </li>
         * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
         * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
         * </ul>
         * <blockquote>
         * <p>For more certificate types, see <a href="https://help.aliyun.com/document_detail/72209.html">Certificate Types Supported for Identity Verification</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>SFZ</p>
         */
        public Builder identityCredentialType(String identityCredentialType) {
            this.identityCredentialType = identityCredentialType;
            return this;
        }

        /**
         * <p>The download URL of the identity verification image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg">http://test.oss-cn-hangzhou.aliyuncs.com/20170522/1219541161213057_070445190.jpg</a></p>
         */
        public Builder identityCredentialUrl(String identityCredentialUrl) {
            this.identityCredentialUrl = identityCredentialUrl;
            return this;
        }

        /**
         * <p>The update time of the identity verification documents.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-05-22 19:04:49</p>
         */
        public Builder modificationDate(String modificationDate) {
            this.modificationDate = modificationDate;
            return this;
        }

        /**
         * <p>The ID of the queried information template.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder registrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4D73432C-7600-4779-ACBB-C3B5CA145D32</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The submission time of the identity verification documents.</p>
         * 
         * <strong>example:</strong>
         * <p>2017-05-22 19:04:49</p>
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
