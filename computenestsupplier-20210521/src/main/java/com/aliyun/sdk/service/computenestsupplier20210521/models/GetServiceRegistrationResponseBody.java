// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link GetServiceRegistrationResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceRegistrationResponseBody</p>
 */
public class GetServiceRegistrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Comment")
    private String comment;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private Detail detail;

    @com.aliyun.core.annotation.NameInMap("FinishTime")
    private String finishTime;

    @com.aliyun.core.annotation.NameInMap("RegistrationId")
    private String registrationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceId")
    private String serviceId;

    @com.aliyun.core.annotation.NameInMap("ServiceInfo")
    private ServiceInfo serviceInfo;

    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("SubmitTime")
    private String submitTime;

    private GetServiceRegistrationResponseBody(Builder builder) {
        this.comment = builder.comment;
        this.detail = builder.detail;
        this.finishTime = builder.finishTime;
        this.registrationId = builder.registrationId;
        this.requestId = builder.requestId;
        this.serviceId = builder.serviceId;
        this.serviceInfo = builder.serviceInfo;
        this.serviceVersion = builder.serviceVersion;
        this.status = builder.status;
        this.submitTime = builder.submitTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceRegistrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return comment
     */
    public String getComment() {
        return this.comment;
    }

    /**
     * @return detail
     */
    public Detail getDetail() {
        return this.detail;
    }

    /**
     * @return finishTime
     */
    public String getFinishTime() {
        return this.finishTime;
    }

    /**
     * @return registrationId
     */
    public String getRegistrationId() {
        return this.registrationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceId
     */
    public String getServiceId() {
        return this.serviceId;
    }

    /**
     * @return serviceInfo
     */
    public ServiceInfo getServiceInfo() {
        return this.serviceInfo;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return submitTime
     */
    public String getSubmitTime() {
        return this.submitTime;
    }

    public static final class Builder {
        private String comment; 
        private Detail detail; 
        private String finishTime; 
        private String registrationId; 
        private String requestId; 
        private String serviceId; 
        private ServiceInfo serviceInfo; 
        private String serviceVersion; 
        private String status; 
        private String submitTime; 

        /**
         * <p>Comment from reviewer.</p>
         * 
         * <strong>example:</strong>
         * <p>comment message</p>
         */
        public Builder comment(String comment) {
            this.comment = comment;
            return this;
        }

        /**
         * <p>The details of service audit.</p>
         */
        public Builder detail(Detail detail) {
            this.detail = detail;
            return this;
        }

        /**
         * <p>Finish time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T11:05:50Z</p>
         */
        public Builder finishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }

        /**
         * <p>Service registration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sr-1b4aabc1c9eb4109****</p>
         */
        public Builder registrationId(String registrationId) {
            this.registrationId = registrationId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A361BA9E-xxxx-xxxx-xxxx-C26E5180456E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service ID.</p>
         * 
         * <strong>example:</strong>
         * <p>service-c2d118c9193e49xxxxxx</p>
         */
        public Builder serviceId(String serviceId) {
            this.serviceId = serviceId;
            return this;
        }

        /**
         * <p>The service details.</p>
         */
        public Builder serviceInfo(ServiceInfo serviceInfo) {
            this.serviceInfo = serviceInfo;
            return this;
        }

        /**
         * <p>The service version.</p>
         * 
         * <strong>example:</strong>
         * <p>beta</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.serviceVersion = serviceVersion;
            return this;
        }

        /**
         * <p>The status of service registration. Valid values:</p>
         * <ul>
         * <li>Submitted</li>
         * <li>Approved</li>
         * <li>Rejected</li>
         * <li>Canceled</li>
         * <li>Executed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Submitted</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Submit time.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-07T11:05:50Z</p>
         */
        public Builder submitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }

        public GetServiceRegistrationResponseBody build() {
            return new GetServiceRegistrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceRegistrationResponseBody</p>
     */
    public static class Detail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AtRisk")
        private Boolean atRisk;

        @com.aliyun.core.annotation.NameInMap("HasRelatedArtifact")
        private Boolean hasRelatedArtifact;

        @com.aliyun.core.annotation.NameInMap("Reports")
        private String reports;

        @com.aliyun.core.annotation.NameInMap("TemplateDiffUrl")
        private String templateDiffUrl;

        private Detail(Builder builder) {
            this.atRisk = builder.atRisk;
            this.hasRelatedArtifact = builder.hasRelatedArtifact;
            this.reports = builder.reports;
            this.templateDiffUrl = builder.templateDiffUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Detail create() {
            return builder().build();
        }

        /**
         * @return atRisk
         */
        public Boolean getAtRisk() {
            return this.atRisk;
        }

        /**
         * @return hasRelatedArtifact
         */
        public Boolean getHasRelatedArtifact() {
            return this.hasRelatedArtifact;
        }

        /**
         * @return reports
         */
        public String getReports() {
            return this.reports;
        }

        /**
         * @return templateDiffUrl
         */
        public String getTemplateDiffUrl() {
            return this.templateDiffUrl;
        }

        public static final class Builder {
            private Boolean atRisk; 
            private Boolean hasRelatedArtifact; 
            private String reports; 
            private String templateDiffUrl; 

            /**
             * <p>Whether risk exists.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder atRisk(Boolean atRisk) {
                this.atRisk = atRisk;
                return this;
            }

            /**
             * <p>Whether service is associated with artifact.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasRelatedArtifact(Boolean hasRelatedArtifact) {
                this.hasRelatedArtifact = hasRelatedArtifact;
                return this;
            }

            /**
             * <p>The reports.</p>
             * 
             * <strong>example:</strong>
             * <p>{ &quot;template1&quot;:&quot;<a href="https://compute-nest-security-audit-bucket.oss-cn-hangzhou.aliyuncs.com/report">https://compute-nest-security-audit-bucket.oss-cn-hangzhou.aliyuncs.com/report</a>&quot; }</p>
             */
            public Builder reports(String reports) {
                this.reports = reports;
                return this;
            }

            /**
             * <p>The url of template diff file.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://compute-nest-template-diff-bucket.oss-cn-hangzhou.aliyuncs.com/service-abc/diff">https://compute-nest-template-diff-bucket.oss-cn-hangzhou.aliyuncs.com/service-abc/diff</a></p>
             */
            public Builder templateDiffUrl(String templateDiffUrl) {
                this.templateDiffUrl = templateDiffUrl;
                return this;
            }

            public Detail build() {
                return new Detail(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceRegistrationResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceRegistrationResponseBody</p>
     */
    public static class ServiceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private String serviceType;

        @com.aliyun.core.annotation.NameInMap("TrialType")
        private String trialType;

        @com.aliyun.core.annotation.NameInMap("VersionName")
        private String versionName;

        private ServiceInfo(Builder builder) {
            this.serviceType = builder.serviceType;
            this.trialType = builder.trialType;
            this.versionName = builder.versionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return serviceType
         */
        public String getServiceType() {
            return this.serviceType;
        }

        /**
         * @return trialType
         */
        public String getTrialType() {
            return this.trialType;
        }

        /**
         * @return versionName
         */
        public String getVersionName() {
            return this.versionName;
        }

        public static final class Builder {
            private String serviceType; 
            private String trialType; 
            private String versionName; 

            /**
             * <p>The type of the service. Valid values:</p>
             * <ul>
             * <li>private: The service is a private service and is deployed within the account of a customer.</li>
             * <li>managed: The service is a fully managed service and is deployed within the account of a service provider.</li>
             * <li>operation: The service is a hosted O&amp;M service.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>private</p>
             */
            public Builder serviceType(String serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The trial policy. Valid values:</p>
             * <ul>
             * <li>Trial: Trials are supported.</li>
             * <li>NotTrial: Trials are not supported.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Trial</p>
             */
            public Builder trialType(String trialType) {
                this.trialType = trialType;
                return this;
            }

            /**
             * <p>The version name.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.0</p>
             */
            public Builder versionName(String versionName) {
                this.versionName = versionName;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
}
