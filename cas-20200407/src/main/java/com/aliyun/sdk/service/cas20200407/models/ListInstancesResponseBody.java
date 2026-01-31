// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link ListInstancesResponseBody} extends {@link TeaModel}
 *
 * <p>ListInstancesResponseBody</p>
 */
public class ListInstancesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("InstanceList")
    private java.util.List<InstanceList> instanceList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ShowSize")
    private Integer showSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListInstancesResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.instanceList = builder.instanceList;
        this.requestId = builder.requestId;
        this.showSize = builder.showSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return instanceList
     */
    public java.util.List<InstanceList> getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return showSize
     */
    public Integer getShowSize() {
        return this.showSize;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<InstanceList> instanceList; 
        private String requestId; 
        private Integer showSize; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListInstancesResponseBody model) {
            this.currentPage = model.currentPage;
            this.instanceList = model.instanceList;
            this.requestId = model.requestId;
            this.showSize = model.showSize;
            this.totalCount = model.totalCount;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * InstanceList.
         */
        public Builder instanceList(java.util.List<InstanceList> instanceList) {
            this.instanceList = instanceList;
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
         * ShowSize.
         */
        public Builder showSize(Integer showSize) {
            this.showSize = showSize;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListInstancesResponseBody build() {
            return new ListInstancesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListInstancesResponseBody} extends {@link TeaModel}
     *
     * <p>ListInstancesResponseBody</p>
     */
    public static class InstanceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoReissue")
        private String autoReissue;

        @com.aliyun.core.annotation.NameInMap("Brand")
        private String brand;

        @com.aliyun.core.annotation.NameInMap("CertIdentifier")
        private String certIdentifier;

        @com.aliyun.core.annotation.NameInMap("CertificateId")
        private Long certificateId;

        @com.aliyun.core.annotation.NameInMap("CertificateName")
        private String certificateName;

        @com.aliyun.core.annotation.NameInMap("CertificateNotAfter")
        private Long certificateNotAfter;

        @com.aliyun.core.annotation.NameInMap("CertificateRevokeTime")
        private Long certificateRevokeTime;

        @com.aliyun.core.annotation.NameInMap("CertificateStatus")
        private String certificateStatus;

        @com.aliyun.core.annotation.NameInMap("CertificateType")
        private String certificateType;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("FullDomainCount")
        private Integer fullDomainCount;

        @com.aliyun.core.annotation.NameInMap("InstanceEndTime")
        private Long instanceEndTime;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceStartTime")
        private Long instanceStartTime;

        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        @com.aliyun.core.annotation.NameInMap("KeyAlgorithm")
        private String keyAlgorithm;

        @com.aliyun.core.annotation.NameInMap("OrderEndTime")
        private Long orderEndTime;

        @com.aliyun.core.annotation.NameInMap("OrderStartTime")
        private Long orderStartTime;

        @com.aliyun.core.annotation.NameInMap("PendingResult")
        private String pendingResult;

        @com.aliyun.core.annotation.NameInMap("Spec")
        private String spec;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("WildcardDomainCount")
        private Integer wildcardDomainCount;

        private InstanceList(Builder builder) {
            this.autoReissue = builder.autoReissue;
            this.brand = builder.brand;
            this.certIdentifier = builder.certIdentifier;
            this.certificateId = builder.certificateId;
            this.certificateName = builder.certificateName;
            this.certificateNotAfter = builder.certificateNotAfter;
            this.certificateRevokeTime = builder.certificateRevokeTime;
            this.certificateStatus = builder.certificateStatus;
            this.certificateType = builder.certificateType;
            this.domain = builder.domain;
            this.fullDomainCount = builder.fullDomainCount;
            this.instanceEndTime = builder.instanceEndTime;
            this.instanceId = builder.instanceId;
            this.instanceStartTime = builder.instanceStartTime;
            this.instanceType = builder.instanceType;
            this.keyAlgorithm = builder.keyAlgorithm;
            this.orderEndTime = builder.orderEndTime;
            this.orderStartTime = builder.orderStartTime;
            this.pendingResult = builder.pendingResult;
            this.spec = builder.spec;
            this.status = builder.status;
            this.wildcardDomainCount = builder.wildcardDomainCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InstanceList create() {
            return builder().build();
        }

        /**
         * @return autoReissue
         */
        public String getAutoReissue() {
            return this.autoReissue;
        }

        /**
         * @return brand
         */
        public String getBrand() {
            return this.brand;
        }

        /**
         * @return certIdentifier
         */
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        /**
         * @return certificateId
         */
        public Long getCertificateId() {
            return this.certificateId;
        }

        /**
         * @return certificateName
         */
        public String getCertificateName() {
            return this.certificateName;
        }

        /**
         * @return certificateNotAfter
         */
        public Long getCertificateNotAfter() {
            return this.certificateNotAfter;
        }

        /**
         * @return certificateRevokeTime
         */
        public Long getCertificateRevokeTime() {
            return this.certificateRevokeTime;
        }

        /**
         * @return certificateStatus
         */
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        /**
         * @return certificateType
         */
        public String getCertificateType() {
            return this.certificateType;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return fullDomainCount
         */
        public Integer getFullDomainCount() {
            return this.fullDomainCount;
        }

        /**
         * @return instanceEndTime
         */
        public Long getInstanceEndTime() {
            return this.instanceEndTime;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceStartTime
         */
        public Long getInstanceStartTime() {
            return this.instanceStartTime;
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        /**
         * @return keyAlgorithm
         */
        public String getKeyAlgorithm() {
            return this.keyAlgorithm;
        }

        /**
         * @return orderEndTime
         */
        public Long getOrderEndTime() {
            return this.orderEndTime;
        }

        /**
         * @return orderStartTime
         */
        public Long getOrderStartTime() {
            return this.orderStartTime;
        }

        /**
         * @return pendingResult
         */
        public String getPendingResult() {
            return this.pendingResult;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return wildcardDomainCount
         */
        public Integer getWildcardDomainCount() {
            return this.wildcardDomainCount;
        }

        public static final class Builder {
            private String autoReissue; 
            private String brand; 
            private String certIdentifier; 
            private Long certificateId; 
            private String certificateName; 
            private Long certificateNotAfter; 
            private Long certificateRevokeTime; 
            private String certificateStatus; 
            private String certificateType; 
            private String domain; 
            private Integer fullDomainCount; 
            private Long instanceEndTime; 
            private String instanceId; 
            private Long instanceStartTime; 
            private String instanceType; 
            private String keyAlgorithm; 
            private Long orderEndTime; 
            private Long orderStartTime; 
            private String pendingResult; 
            private String spec; 
            private String status; 
            private Integer wildcardDomainCount; 

            private Builder() {
            } 

            private Builder(InstanceList model) {
                this.autoReissue = model.autoReissue;
                this.brand = model.brand;
                this.certIdentifier = model.certIdentifier;
                this.certificateId = model.certificateId;
                this.certificateName = model.certificateName;
                this.certificateNotAfter = model.certificateNotAfter;
                this.certificateRevokeTime = model.certificateRevokeTime;
                this.certificateStatus = model.certificateStatus;
                this.certificateType = model.certificateType;
                this.domain = model.domain;
                this.fullDomainCount = model.fullDomainCount;
                this.instanceEndTime = model.instanceEndTime;
                this.instanceId = model.instanceId;
                this.instanceStartTime = model.instanceStartTime;
                this.instanceType = model.instanceType;
                this.keyAlgorithm = model.keyAlgorithm;
                this.orderEndTime = model.orderEndTime;
                this.orderStartTime = model.orderStartTime;
                this.pendingResult = model.pendingResult;
                this.spec = model.spec;
                this.status = model.status;
                this.wildcardDomainCount = model.wildcardDomainCount;
            } 

            /**
             * AutoReissue.
             */
            public Builder autoReissue(String autoReissue) {
                this.autoReissue = autoReissue;
                return this;
            }

            /**
             * Brand.
             */
            public Builder brand(String brand) {
                this.brand = brand;
                return this;
            }

            /**
             * CertIdentifier.
             */
            public Builder certIdentifier(String certIdentifier) {
                this.certIdentifier = certIdentifier;
                return this;
            }

            /**
             * CertificateId.
             */
            public Builder certificateId(Long certificateId) {
                this.certificateId = certificateId;
                return this;
            }

            /**
             * CertificateName.
             */
            public Builder certificateName(String certificateName) {
                this.certificateName = certificateName;
                return this;
            }

            /**
             * CertificateNotAfter.
             */
            public Builder certificateNotAfter(Long certificateNotAfter) {
                this.certificateNotAfter = certificateNotAfter;
                return this;
            }

            /**
             * CertificateRevokeTime.
             */
            public Builder certificateRevokeTime(Long certificateRevokeTime) {
                this.certificateRevokeTime = certificateRevokeTime;
                return this;
            }

            /**
             * CertificateStatus.
             */
            public Builder certificateStatus(String certificateStatus) {
                this.certificateStatus = certificateStatus;
                return this;
            }

            /**
             * CertificateType.
             */
            public Builder certificateType(String certificateType) {
                this.certificateType = certificateType;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * FullDomainCount.
             */
            public Builder fullDomainCount(Integer fullDomainCount) {
                this.fullDomainCount = fullDomainCount;
                return this;
            }

            /**
             * InstanceEndTime.
             */
            public Builder instanceEndTime(Long instanceEndTime) {
                this.instanceEndTime = instanceEndTime;
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
             * InstanceStartTime.
             */
            public Builder instanceStartTime(Long instanceStartTime) {
                this.instanceStartTime = instanceStartTime;
                return this;
            }

            /**
             * InstanceType.
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            /**
             * KeyAlgorithm.
             */
            public Builder keyAlgorithm(String keyAlgorithm) {
                this.keyAlgorithm = keyAlgorithm;
                return this;
            }

            /**
             * OrderEndTime.
             */
            public Builder orderEndTime(Long orderEndTime) {
                this.orderEndTime = orderEndTime;
                return this;
            }

            /**
             * OrderStartTime.
             */
            public Builder orderStartTime(Long orderStartTime) {
                this.orderStartTime = orderStartTime;
                return this;
            }

            /**
             * PendingResult.
             */
            public Builder pendingResult(String pendingResult) {
                this.pendingResult = pendingResult;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * WildcardDomainCount.
             */
            public Builder wildcardDomainCount(Integer wildcardDomainCount) {
                this.wildcardDomainCount = wildcardDomainCount;
                return this;
            }

            public InstanceList build() {
                return new InstanceList(this);
            } 

        } 

    }
}
