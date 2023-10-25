// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadServerCertificateResponseBody} extends {@link TeaModel}
 *
 * <p>UploadServerCertificateResponseBody</p>
 */
public class UploadServerCertificateResponseBody extends TeaModel {
    @NameInMap("AliCloudCertificateId")
    private String aliCloudCertificateId;

    @NameInMap("AliCloudCertificateName")
    private String aliCloudCertificateName;

    @NameInMap("CommonName")
    private String commonName;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("CreateTimeStamp")
    private Long createTimeStamp;

    @NameInMap("ExpireTime")
    private String expireTime;

    @NameInMap("ExpireTimeStamp")
    private Long expireTimeStamp;

    @NameInMap("Fingerprint")
    private String fingerprint;

    @NameInMap("IsAliCloudCertificate")
    private Integer isAliCloudCertificate;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @NameInMap("ServerCertificateId")
    private String serverCertificateId;

    @NameInMap("ServerCertificateName")
    private String serverCertificateName;

    @NameInMap("SubjectAlternativeNames")
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
         * The AliCloud certificate ID.
         */
        public Builder aliCloudCertificateId(String aliCloudCertificateId) {
            this.aliCloudCertificateId = aliCloudCertificateId;
            return this;
        }

        /**
         * The AliCloud certificate name.
         */
        public Builder aliCloudCertificateName(String aliCloudCertificateName) {
            this.aliCloudCertificateName = aliCloudCertificateName;
            return this;
        }

        /**
         * The domain name of the CA certificate.
         */
        public Builder commonName(String commonName) {
            this.commonName = commonName;
            return this;
        }

        /**
         * The time when the CA certificate is uploaded.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * The timestamp generated when the CA certificate is uploaded.
         */
        public Builder createTimeStamp(Long createTimeStamp) {
            this.createTimeStamp = createTimeStamp;
            return this;
        }

        /**
         * The time when the CA certificate expires.
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * The timestamp generated when the CA certificate expires.
         */
        public Builder expireTimeStamp(Long expireTimeStamp) {
            this.expireTimeStamp = expireTimeStamp;
            return this;
        }

        /**
         * The fingerprint of the CA certificate.
         */
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }

        /**
         * Indicates whether the certificate is provided by Alibaba Cloud Certificate Management Service. Valid values:
         * <p>
         * - **0**: The certificate is not provided by Alibaba Cloud Certificate Management Service.
         * - **1**: The certificate is provided by Alibaba Cloud Certificate Management Service.
         */
        public Builder isAliCloudCertificate(Integer isAliCloudCertificate) {
            this.isAliCloudCertificate = isAliCloudCertificate;
            return this;
        }

        /**
         * The ID of the region where the Classic Load Balancer (CLB) instance is deployed.
         * <p>
         * 
         * You can call the [DescribeRegions](~~27584~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The resource group ID.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * The ID of the server certificate.
         */
        public Builder serverCertificateId(String serverCertificateId) {
            this.serverCertificateId = serverCertificateId;
            return this;
        }

        /**
         * The name of the server certificate.
         * <p>
         * 
         * The name must be 1 to 80 characters in length. It must start with an English letter. It can contain letters, numbers, periods (.), underscores (\_), and hyphens (-).
         */
        public Builder serverCertificateName(String serverCertificateName) {
            this.serverCertificateName = serverCertificateName;
            return this;
        }

        /**
         * The subject alternative names.
         * <p>
         * 
         * A domain name list is supported. A maximum of 10 domain names are supported.
         */
        public Builder subjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }

        public UploadServerCertificateResponseBody build() {
            return new UploadServerCertificateResponseBody(this);
        } 

    } 

    public static class SubjectAlternativeNames extends TeaModel {
        @NameInMap("SubjectAlternativeName")
        private java.util.List < String > subjectAlternativeName;

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
        public java.util.List < String > getSubjectAlternativeName() {
            return this.subjectAlternativeName;
        }

        public static final class Builder {
            private java.util.List < String > subjectAlternativeName; 

            /**
             * SubjectAlternativeName.
             */
            public Builder subjectAlternativeName(java.util.List < String > subjectAlternativeName) {
                this.subjectAlternativeName = subjectAlternativeName;
                return this;
            }

            public SubjectAlternativeNames build() {
                return new SubjectAlternativeNames(this);
            } 

        } 

    }
}
