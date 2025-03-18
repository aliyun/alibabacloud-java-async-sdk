// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeDomainResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainResponseBody</p>
 */
public class DescribeDomainResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CertificateBody")
    private String certificateBody;

    @com.aliyun.core.annotation.NameInMap("CertificateId")
    private String certificateId;

    @com.aliyun.core.annotation.NameInMap("CertificateName")
    private String certificateName;

    @com.aliyun.core.annotation.NameInMap("CertificatePrivateKey")
    private String certificatePrivateKey;

    @com.aliyun.core.annotation.NameInMap("CertificateValidEnd")
    private Long certificateValidEnd;

    @com.aliyun.core.annotation.NameInMap("CertificateValidStart")
    private Long certificateValidStart;

    @com.aliyun.core.annotation.NameInMap("DomainBindingStatus")
    private String domainBindingStatus;

    @com.aliyun.core.annotation.NameInMap("DomainCNAMEStatus")
    private String domainCNAMEStatus;

    @com.aliyun.core.annotation.NameInMap("DomainLegalStatus")
    private String domainLegalStatus;

    @com.aliyun.core.annotation.NameInMap("DomainName")
    private String domainName;

    @com.aliyun.core.annotation.NameInMap("DomainRemark")
    private String domainRemark;

    @com.aliyun.core.annotation.NameInMap("DomainWebSocketStatus")
    private String domainWebSocketStatus;

    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SubDomain")
    private String subDomain;

    private DescribeDomainResponseBody(Builder builder) {
        this.certificateBody = builder.certificateBody;
        this.certificateId = builder.certificateId;
        this.certificateName = builder.certificateName;
        this.certificatePrivateKey = builder.certificatePrivateKey;
        this.certificateValidEnd = builder.certificateValidEnd;
        this.certificateValidStart = builder.certificateValidStart;
        this.domainBindingStatus = builder.domainBindingStatus;
        this.domainCNAMEStatus = builder.domainCNAMEStatus;
        this.domainLegalStatus = builder.domainLegalStatus;
        this.domainName = builder.domainName;
        this.domainRemark = builder.domainRemark;
        this.domainWebSocketStatus = builder.domainWebSocketStatus;
        this.groupId = builder.groupId;
        this.requestId = builder.requestId;
        this.subDomain = builder.subDomain;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certificateBody
     */
    public String getCertificateBody() {
        return this.certificateBody;
    }

    /**
     * @return certificateId
     */
    public String getCertificateId() {
        return this.certificateId;
    }

    /**
     * @return certificateName
     */
    public String getCertificateName() {
        return this.certificateName;
    }

    /**
     * @return certificatePrivateKey
     */
    public String getCertificatePrivateKey() {
        return this.certificatePrivateKey;
    }

    /**
     * @return certificateValidEnd
     */
    public Long getCertificateValidEnd() {
        return this.certificateValidEnd;
    }

    /**
     * @return certificateValidStart
     */
    public Long getCertificateValidStart() {
        return this.certificateValidStart;
    }

    /**
     * @return domainBindingStatus
     */
    public String getDomainBindingStatus() {
        return this.domainBindingStatus;
    }

    /**
     * @return domainCNAMEStatus
     */
    public String getDomainCNAMEStatus() {
        return this.domainCNAMEStatus;
    }

    /**
     * @return domainLegalStatus
     */
    public String getDomainLegalStatus() {
        return this.domainLegalStatus;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return domainRemark
     */
    public String getDomainRemark() {
        return this.domainRemark;
    }

    /**
     * @return domainWebSocketStatus
     */
    public String getDomainWebSocketStatus() {
        return this.domainWebSocketStatus;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return subDomain
     */
    public String getSubDomain() {
        return this.subDomain;
    }

    public static final class Builder {
        private String certificateBody; 
        private String certificateId; 
        private String certificateName; 
        private String certificatePrivateKey; 
        private Long certificateValidEnd; 
        private Long certificateValidStart; 
        private String domainBindingStatus; 
        private String domainCNAMEStatus; 
        private String domainLegalStatus; 
        private String domainName; 
        private String domainRemark; 
        private String domainWebSocketStatus; 
        private String groupId; 
        private String requestId; 
        private String subDomain; 

        private Builder() {
        } 

        private Builder(DescribeDomainResponseBody model) {
            this.certificateBody = model.certificateBody;
            this.certificateId = model.certificateId;
            this.certificateName = model.certificateName;
            this.certificatePrivateKey = model.certificatePrivateKey;
            this.certificateValidEnd = model.certificateValidEnd;
            this.certificateValidStart = model.certificateValidStart;
            this.domainBindingStatus = model.domainBindingStatus;
            this.domainCNAMEStatus = model.domainCNAMEStatus;
            this.domainLegalStatus = model.domainLegalStatus;
            this.domainName = model.domainName;
            this.domainRemark = model.domainRemark;
            this.domainWebSocketStatus = model.domainWebSocketStatus;
            this.groupId = model.groupId;
            this.requestId = model.requestId;
            this.subDomain = model.subDomain;
        } 

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder certificateBody(String certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }

        /**
         * <p>The unique ID of the SSL certificate, which is automatically generated by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
         */
        public Builder certificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }

        /**
         * <p>The name of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>myCertificate</p>
         */
        public Builder certificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        /**
         * <p>The private key of the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        public Builder certificatePrivateKey(String certificatePrivateKey) {
            this.certificatePrivateKey = certificatePrivateKey;
            return this;
        }

        /**
         * <p>证书失效时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1704038400000</p>
         */
        public Builder certificateValidEnd(Long certificateValidEnd) {
            this.certificateValidEnd = certificateValidEnd;
            return this;
        }

        /**
         * <p>证书生效时间戳（毫秒）</p>
         * 
         * <strong>example:</strong>
         * <p>1672502400000</p>
         */
        public Builder certificateValidStart(Long certificateValidStart) {
            this.certificateValidStart = certificateValidStart;
            return this;
        }

        /**
         * <p>The binding status of the custom domain name. Valid values:</p>
         * <ul>
         * <li>BINDING: The domain name has been bound.</li>
         * <li>BOUND: The domain name has not been bound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BINDING</p>
         */
        public Builder domainBindingStatus(String domainBindingStatus) {
            this.domainBindingStatus = domainBindingStatus;
            return this;
        }

        /**
         * <p>The domain name resolution status. Valid values:</p>
         * <ul>
         * <li>RESOLVED: The domain name has been resolved.</li>
         * <li>UNRESOLVED: The domain name has not been resolved.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RESOLVED</p>
         */
        public Builder domainCNAMEStatus(String domainCNAMEStatus) {
            this.domainCNAMEStatus = domainCNAMEStatus;
            return this;
        }

        /**
         * <p>The validity status of the domain name. Valid values:</p>
         * <ul>
         * <li>NORMAL</li>
         * <li>ABNORMAL: This status affects API calls and must be resolved as soon as possible.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder domainLegalStatus(String domainLegalStatus) {
            this.domainLegalStatus = domainLegalStatus;
            return this;
        }

        /**
         * <p>The custom domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>api.demo.com</p>
         */
        public Builder domainName(String domainName) {
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Remarks about the domain name, such as the cause of an exception.</p>
         * 
         * <strong>example:</strong>
         * <p>The domain name does not have an ICP filing.</p>
         */
        public Builder domainRemark(String domainRemark) {
            this.domainRemark = domainRemark;
            return this;
        }

        /**
         * <p>The status of the domain name that uses WebSocket.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder domainWebSocketStatus(String domainWebSocketStatus) {
            this.domainWebSocketStatus = domainWebSocketStatus;
            return this;
        }

        /**
         * <p>The ID of the API group. This ID is generated by the system and globally unique.</p>
         * 
         * <strong>example:</strong>
         * <p>927d50c0f2e54b359919923d908bb015</p>
         */
        public Builder groupId(String groupId) {
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>6EF60BEC-0242-43AF-BB20-270359FB54A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The second-level domain name that is automatically assigned to the API group.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx-cn-hangzhou.alicloudapi.com</p>
         */
        public Builder subDomain(String subDomain) {
            this.subDomain = subDomain;
            return this;
        }

        public DescribeDomainResponseBody build() {
            return new DescribeDomainResponseBody(this);
        } 

    } 

}
