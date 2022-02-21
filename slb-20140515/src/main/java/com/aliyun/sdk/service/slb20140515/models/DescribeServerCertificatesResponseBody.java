// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.slb20140515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServerCertificatesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServerCertificatesResponseBody</p>
 */
public class DescribeServerCertificatesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ServerCertificates")
    private ServerCertificates serverCertificates;

    private DescribeServerCertificatesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serverCertificates = builder.serverCertificates;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServerCertificatesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serverCertificates
     */
    public ServerCertificates getServerCertificates() {
        return this.serverCertificates;
    }

    public static final class Builder {
        private String requestId; 
        private ServerCertificates serverCertificates; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServerCertificates.
         */
        public Builder serverCertificates(ServerCertificates serverCertificates) {
            this.serverCertificates = serverCertificates;
            return this;
        }

        public DescribeServerCertificatesResponseBody build() {
            return new DescribeServerCertificatesResponseBody(this);
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
    public static class ServerCertificate extends TeaModel {
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

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServerCertificateId")
        private String serverCertificateId;

        @NameInMap("ServerCertificateName")
        private String serverCertificateName;

        @NameInMap("SubjectAlternativeNames")
        private SubjectAlternativeNames subjectAlternativeNames;

        private ServerCertificate(Builder builder) {
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
            this.resourceGroupId = builder.resourceGroupId;
            this.serverCertificateId = builder.serverCertificateId;
            this.serverCertificateName = builder.serverCertificateName;
            this.subjectAlternativeNames = builder.subjectAlternativeNames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerCertificate create() {
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
            private String resourceGroupId; 
            private String serverCertificateId; 
            private String serverCertificateName; 
            private SubjectAlternativeNames subjectAlternativeNames; 

            /**
             * AliCloudCertificateId.
             */
            public Builder aliCloudCertificateId(String aliCloudCertificateId) {
                this.aliCloudCertificateId = aliCloudCertificateId;
                return this;
            }

            /**
             * AliCloudCertificateName.
             */
            public Builder aliCloudCertificateName(String aliCloudCertificateName) {
                this.aliCloudCertificateName = aliCloudCertificateName;
                return this;
            }

            /**
             * CommonName.
             */
            public Builder commonName(String commonName) {
                this.commonName = commonName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CreateTimeStamp.
             */
            public Builder createTimeStamp(Long createTimeStamp) {
                this.createTimeStamp = createTimeStamp;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * ExpireTimeStamp.
             */
            public Builder expireTimeStamp(Long expireTimeStamp) {
                this.expireTimeStamp = expireTimeStamp;
                return this;
            }

            /**
             * Fingerprint.
             */
            public Builder fingerprint(String fingerprint) {
                this.fingerprint = fingerprint;
                return this;
            }

            /**
             * IsAliCloudCertificate.
             */
            public Builder isAliCloudCertificate(Integer isAliCloudCertificate) {
                this.isAliCloudCertificate = isAliCloudCertificate;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * ServerCertificateId.
             */
            public Builder serverCertificateId(String serverCertificateId) {
                this.serverCertificateId = serverCertificateId;
                return this;
            }

            /**
             * ServerCertificateName.
             */
            public Builder serverCertificateName(String serverCertificateName) {
                this.serverCertificateName = serverCertificateName;
                return this;
            }

            /**
             * SubjectAlternativeNames.
             */
            public Builder subjectAlternativeNames(SubjectAlternativeNames subjectAlternativeNames) {
                this.subjectAlternativeNames = subjectAlternativeNames;
                return this;
            }

            public ServerCertificate build() {
                return new ServerCertificate(this);
            } 

        } 

    }
    public static class ServerCertificates extends TeaModel {
        @NameInMap("ServerCertificate")
        private java.util.List < ServerCertificate> serverCertificate;

        private ServerCertificates(Builder builder) {
            this.serverCertificate = builder.serverCertificate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServerCertificates create() {
            return builder().build();
        }

        /**
         * @return serverCertificate
         */
        public java.util.List < ServerCertificate> getServerCertificate() {
            return this.serverCertificate;
        }

        public static final class Builder {
            private java.util.List < ServerCertificate> serverCertificate; 

            /**
             * ServerCertificate.
             */
            public Builder serverCertificate(java.util.List < ServerCertificate> serverCertificate) {
                this.serverCertificate = serverCertificate;
                return this;
            }

            public ServerCertificates build() {
                return new ServerCertificates(this);
            } 

        } 

    }
}
