// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

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
 * {@link UploadServerCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadServerCertificateResponseBody</p>
 */
public class UploadServerCertificateResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliCloudCertificateId")
    private String aliCloudCertificateId;

    @com.aliyun.core.annotation.NameInMap("AliCloudCertificateName")
    private String aliCloudCertificateName;

    @com.aliyun.core.annotation.NameInMap("CommonName")
    private String commonName;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTimeStamp")
    private Long expireTimeStamp;

    @com.aliyun.core.annotation.NameInMap("Fingerprint")
    private String fingerprint;

    @com.aliyun.core.annotation.NameInMap("IsAliCloudCertificate")
    private Integer isAliCloudCertificate;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @com.aliyun.core.annotation.NameInMap("ServerCertificateName")
    private String serverCertificateName;

    @com.aliyun.core.annotation.NameInMap("SubjectAlternativeNames")
    private SubjectAlternativeNames subjectAlternativeNames;

    private UploadServerCertificateResponseBody(Builder builder) {
        this.aliCloudCertificateId = builder.aliCloudCertificateId;
        this.aliCloudCertificateName = builder.aliCloudCertificateName;
        this.commonName = builder.commonName;
        this.createTime = builder.createTime;
        this.createTimeStamp = builder.createTimeStamp;
        this.expireTime = builder.expireTime;
        this.expireTimeStamp = builder.expireTimeStamp;
        this.fingerprint = builder.fingerprint;
        this.isAliCloudCertificate = builder.isAliCloudCertificate;
        this.regionId = builder.regionId;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.serverCertificateId = builder.serverCertificateId;
        this.serverCertificateName = builder.serverCertificateName;
        this.subjectAlternativeNames = builder.subjectAlternativeNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadServerCertificateResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliCloudCertificateId
     */
    public String getAliCloudCertificateId() {
        return this.aliCloudCertificateId;
    }

    /**
     * @return aliCloudCertificateName
     */
    public String getAliCloudCertificateName() {
        return this.aliCloudCertificateName;
    }

    /**
     * @return commonName
     */
    public String getCommonName() {
        return this.commonName;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return this.createTimeStamp;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return expireTimeStamp
     */
    public Long getExpireTimeStamp() {
        return this.expireTimeStamp;
    }

    /**
     * @return fingerprint
     */
    public String getFingerprint() {
        return this.fingerprint;
    }

    /**
     * @return isAliCloudCertificate
     */
    public Integer getIsAliCloudCertificate() {
        return this.isAliCloudCertificate;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return serverCertificateId
     */
    public String getServerCertificateId() {
        return this.serverCertificateId;
    }

    /**
     * @return serverCertificateName
     */
    public String getServerCertificateName() {
        return this.serverCertificateName;
    }

    /**
     * @return subjectAlternativeNames
     */
    public SubjectAlternativeNames getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public static final class Builder {
        private String aliCloudCertificateId; 
        private String aliCloudCertificateName; 
        private String commonName; 
        private String createTime; 
        private Long createTimeStamp; 
        private String expireTime; 
        private Long expireTimeStamp; 
        private String fingerprint; 
        private Integer isAliCloudCertificate; 
        private String regionId; 
        private String requestId; 
        private String resourceGroupId; 
        private String serverCertificateId; 
        private String serverCertificateName; 
        private SubjectAlternativeNames subjectAlternativeNames; 

        /**
         * <p>The AliCloud certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>775****</p>
         */
        public Builder aliCloudCertificateId(String aliCloudCertificateId) {
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }

        /**
         * <p>The AliCloud certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudcertificate****</p>
         */
        public Builder aliCloudCertificateName(String aliCloudCertificateName) {
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }

        /**
         * <p>The domain name of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * <p>The time when the CA certificate is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-02-21T02:49:05Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The timestamp generated when the CA certificate is uploaded.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * <p>The time when the CA certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-10-18T23:59:59Z</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The timestamp generated when the CA certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>1504147745000</p>
         */
        public Builder expireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }

        /**
         * <p>The fingerprint of the CA certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>8f:7d:cb:e5:f8:c8:33:9c:17:65:c1:92:30:9e:45:55:9c:3a:85:60</p>
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * <p>Indicates whether the certificate is provided by Alibaba Cloud Certificate Management Service. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The certificate is not provided by Alibaba Cloud Certificate Management Service.</li>
         * <li><strong>1</strong>: The certificate is provided by Alibaba Cloud Certificate Management Service.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isAliCloudCertificate(Integer isAliCloudCertificate) {
            this.isAliCloudCertificate = isAliCloudCertificate;
            return this;
        }

        /**
         * <p>The ID of the region where the Classic Load Balancer (CLB) instance is deployed.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/27584.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-atstuj3rt****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The ID of the server certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1321932713******<em>17f1b4b696b_1114720822</em>-1671******</p>
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * <p>The name of the server certificate.</p>
         * <p>The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>mycert01</p>
         */
        public Builder serverCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }

        /**
         * <p>The subject alternative names.</p>
         * <p>A domain name list is supported. A maximum of 10 domain names are supported.</p>
         */
        public Builder subjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public UploadServerCertificateResponseBody build() {
            return new UploadServerCertificateResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadServerCertificateResponseBody} extends {@link TeaModel}
     *
     * <p>UploadServerCertificateResponseBody</p>
     */
    public static class SubjectAlternativeNames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SubjectAlternativeName")
        private java.util.List<String> subjectAlternativeName;

        private SubjectAlternativeNames(Builder builder) {
            this.subjectAlternativeName = builder.subjectAlternativeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SubjectAlternativeNames create() {
            return builder().build();
        }

        /**
         * @return subjectAlternativeName
         */
        public java.util.List<String> getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

        public static final class Builder {
            private java.util.List<String> subjectAlternativeName; 

            /**
             * SubjectAlternativeName.
             */
            public Builder subjectAlternativeName(java.util.List<String> subjectAlternativeName) {
                this.subjectAlternativeName = subjectAlternativeName;
                return this;
            }

            public SubjectAlternativeNames build() {
                return new SubjectAlternativeNames(this);
            } 

        } 

    }
}
