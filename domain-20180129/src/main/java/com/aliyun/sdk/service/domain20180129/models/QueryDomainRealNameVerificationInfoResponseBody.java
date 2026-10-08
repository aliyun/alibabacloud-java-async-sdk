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
         * <p>Domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Base64-encoded image of the real-name verification certificate. Requirements for the image:  </p>
         * <ul>
         * <li>Format must be <strong>jpg</strong> or <strong>bmp</strong>.  </li>
         * <li>Original image size must be between <strong>55 KB and 1 MB</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dGVzdA==</p>
         */
        public Builder identityCredential(String identityCredential) {
            this.identityCredential = identityCredential;
            return this;
        }

        /**
         * <p>Certificate number used for real-name verification, such as an identity card number or Unified Social Credit Code.</p>
         * 
         * <strong>example:</strong>
         * <p>5****************9</p>
         */
        public Builder identityCredentialNo(String identityCredentialNo) {
            this.identityCredentialNo = identityCredentialNo;
            return this;
        }

        /**
         * <p>The type of certificate used for real-name verification. Valid values:  </p>
         * <ul>
         * <li><strong>SFZ</strong>: Identity card.  </li>
         * <li><strong>HZ</strong>: Passport.  </li>
         * <li><strong>YYZZ</strong>: Business license.  </li>
         * <li><strong>ORG</strong>: Organization code certificate.  </li>
         * <li><strong>XYDM</strong>: Unified Social Credit Code certificate.  </li>
         * <li><strong>TXZ</strong>: Mainland Travel Permits for Hong Kong and Macao Residents.</li>
         * </ul>
         * <p>If your certificate type is not listed above, see the section <a href="https://help.aliyun.com/document_detail/72209.html">Supported Certificate Types for Real-Name Verification</a> for the corresponding value.  </p>
         * <blockquote>
         * <p>You must select the certificate type that matches the certificate you provide.</p>
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
         * <p>Download URL of the real-name verification image.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg">http://dbu-nap-p.oss-cn-hangzhou.aliyuncs.com/20190219/140692647406xxxx_5d6baea3e7314fd986afdd86e33exxxx.jpg</a></p>
         */
        public Builder identityCredentialUrl(String identityCredentialUrl) {
            this.identityCredentialUrl = identityCredentialUrl;
            return this;
        }

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S2019270W570****</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Unique request access token.</p>
         * 
         * <strong>example:</strong>
         * <p>4DF9D693-0D5B-4EB7-8922-7ECA6BD59314</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Updated At.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-03-28 00:41:42</p>
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
