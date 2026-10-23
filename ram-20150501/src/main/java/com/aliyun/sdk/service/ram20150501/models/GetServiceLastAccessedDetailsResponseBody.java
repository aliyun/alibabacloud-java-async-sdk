// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetServiceLastAccessedDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceLastAccessedDetailsResponseBody</p>
 */
public class GetServiceLastAccessedDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("JobCompletionTime")
    private String jobCompletionTime;

    @com.aliyun.core.annotation.NameInMap("JobCreationTime")
    private String jobCreationTime;

    @com.aliyun.core.annotation.NameInMap("JobError")
    private JobError jobError;

    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("Marker")
    @com.aliyun.core.annotation.Validation(required = true)
    private String marker;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServicesLastAccessed")
    private java.util.List<ServicesLastAccessed> servicesLastAccessed;

    private GetServiceLastAccessedDetailsResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.jobCompletionTime = builder.jobCompletionTime;
        this.jobCreationTime = builder.jobCreationTime;
        this.jobError = builder.jobError;
        this.jobStatus = builder.jobStatus;
        this.jobType = builder.jobType;
        this.marker = builder.marker;
        this.requestId = builder.requestId;
        this.servicesLastAccessed = builder.servicesLastAccessed;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLastAccessedDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return jobCompletionTime
     */
    public String getJobCompletionTime() {
        return this.jobCompletionTime;
    }

    /**
     * @return jobCreationTime
     */
    public String getJobCreationTime() {
        return this.jobCreationTime;
    }

    /**
     * @return jobError
     */
    public JobError getJobError() {
        return this.jobError;
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return servicesLastAccessed
     */
    public java.util.List<ServicesLastAccessed> getServicesLastAccessed() {
        return this.servicesLastAccessed;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private String jobCompletionTime; 
        private String jobCreationTime; 
        private JobError jobError; 
        private String jobStatus; 
        private String jobType; 
        private String marker; 
        private String requestId; 
        private java.util.List<ServicesLastAccessed> servicesLastAccessed; 

        private Builder() {
        } 

        private Builder(GetServiceLastAccessedDetailsResponseBody model) {
            this.isTruncated = model.isTruncated;
            this.jobCompletionTime = model.jobCompletionTime;
            this.jobCreationTime = model.jobCreationTime;
            this.jobError = model.jobError;
            this.jobStatus = model.jobStatus;
            this.jobType = model.jobType;
            this.marker = model.marker;
            this.requestId = model.requestId;
            this.servicesLastAccessed = model.servicesLastAccessed;
        } 

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * JobCompletionTime.
         */
        public Builder jobCompletionTime(String jobCompletionTime) {
            this.jobCompletionTime = jobCompletionTime;
            return this;
        }

        /**
         * JobCreationTime.
         */
        public Builder jobCreationTime(String jobCreationTime) {
            this.jobCreationTime = jobCreationTime;
            return this;
        }

        /**
         * JobError.
         */
        public Builder jobError(JobError jobError) {
            this.jobError = jobError;
            return this;
        }

        /**
         * JobStatus.
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>CgxMaXN0UmFtVXNlcnMSEDE5OTQ5NTMxMDYwOTAzNzkaAjQ0IGQ=</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
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
         * ServicesLastAccessed.
         */
        public Builder servicesLastAccessed(java.util.List<ServicesLastAccessed> servicesLastAccessed) {
            this.servicesLastAccessed = servicesLastAccessed;
            return this;
        }

        public GetServiceLastAccessedDetailsResponseBody build() {
            return new GetServiceLastAccessedDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceLastAccessedDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLastAccessedDetailsResponseBody</p>
     */
    public static class JobError extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private JobError(Builder builder) {
            this.code = builder.code;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobError create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private String code; 
            private String message; 

            private Builder() {
            } 

            private Builder(JobError model) {
                this.code = model.code;
                this.message = model.message;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public JobError build() {
                return new JobError(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLastAccessedDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLastAccessedDetailsResponseBody</p>
     */
    public static class GrantPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedEntity")
        private String attachedEntity;

        @com.aliyun.core.annotation.NameInMap("AttachedScope")
        private String attachedScope;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private GrantPolicies(Builder builder) {
            this.attachedEntity = builder.attachedEntity;
            this.attachedScope = builder.attachedScope;
            this.policyName = builder.policyName;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantPolicies create() {
            return builder().build();
        }

        /**
         * @return attachedEntity
         */
        public String getAttachedEntity() {
            return this.attachedEntity;
        }

        /**
         * @return attachedScope
         */
        public String getAttachedScope() {
            return this.attachedScope;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String attachedEntity; 
            private String attachedScope; 
            private String policyName; 
            private String policyType; 

            private Builder() {
            } 

            private Builder(GrantPolicies model) {
                this.attachedEntity = model.attachedEntity;
                this.attachedScope = model.attachedScope;
                this.policyName = model.policyName;
                this.policyType = model.policyType;
            } 

            /**
             * AttachedEntity.
             */
            public Builder attachedEntity(String attachedEntity) {
                this.attachedEntity = attachedEntity;
                return this;
            }

            /**
             * AttachedScope.
             */
            public Builder attachedScope(String attachedScope) {
                this.attachedScope = attachedScope;
                return this;
            }

            /**
             * PolicyName.
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public GrantPolicies build() {
                return new GrantPolicies(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLastAccessedDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLastAccessedDetailsResponseBody</p>
     */
    public static class TrackedActionsLastAccessed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActionName")
        private String actionName;

        @com.aliyun.core.annotation.NameInMap("LastAccessedEntity")
        private String lastAccessedEntity;

        @com.aliyun.core.annotation.NameInMap("LastAccessedTime")
        private String lastAccessedTime;

        @com.aliyun.core.annotation.NameInMap("ServiceCodes")
        private java.util.List<String> serviceCodes;

        private TrackedActionsLastAccessed(Builder builder) {
            this.actionName = builder.actionName;
            this.lastAccessedEntity = builder.lastAccessedEntity;
            this.lastAccessedTime = builder.lastAccessedTime;
            this.serviceCodes = builder.serviceCodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrackedActionsLastAccessed create() {
            return builder().build();
        }

        /**
         * @return actionName
         */
        public String getActionName() {
            return this.actionName;
        }

        /**
         * @return lastAccessedEntity
         */
        public String getLastAccessedEntity() {
            return this.lastAccessedEntity;
        }

        /**
         * @return lastAccessedTime
         */
        public String getLastAccessedTime() {
            return this.lastAccessedTime;
        }

        /**
         * @return serviceCodes
         */
        public java.util.List<String> getServiceCodes() {
            return this.serviceCodes;
        }

        public static final class Builder {
            private String actionName; 
            private String lastAccessedEntity; 
            private String lastAccessedTime; 
            private java.util.List<String> serviceCodes; 

            private Builder() {
            } 

            private Builder(TrackedActionsLastAccessed model) {
                this.actionName = model.actionName;
                this.lastAccessedEntity = model.lastAccessedEntity;
                this.lastAccessedTime = model.lastAccessedTime;
                this.serviceCodes = model.serviceCodes;
            } 

            /**
             * ActionName.
             */
            public Builder actionName(String actionName) {
                this.actionName = actionName;
                return this;
            }

            /**
             * LastAccessedEntity.
             */
            public Builder lastAccessedEntity(String lastAccessedEntity) {
                this.lastAccessedEntity = lastAccessedEntity;
                return this;
            }

            /**
             * LastAccessedTime.
             */
            public Builder lastAccessedTime(String lastAccessedTime) {
                this.lastAccessedTime = lastAccessedTime;
                return this;
            }

            /**
             * ServiceCodes.
             */
            public Builder serviceCodes(java.util.List<String> serviceCodes) {
                this.serviceCodes = serviceCodes;
                return this;
            }

            public TrackedActionsLastAccessed build() {
                return new TrackedActionsLastAccessed(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceLastAccessedDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceLastAccessedDetailsResponseBody</p>
     */
    public static class ServicesLastAccessed extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GrantPolicies")
        private java.util.List<GrantPolicies> grantPolicies;

        @com.aliyun.core.annotation.NameInMap("LastAuthenticated")
        private String lastAuthenticated;

        @com.aliyun.core.annotation.NameInMap("LastAuthenticatedEntity")
        private String lastAuthenticatedEntity;

        @com.aliyun.core.annotation.NameInMap("RAMCode")
        private String RAMCode;

        @com.aliyun.core.annotation.NameInMap("ServiceCodes")
        private java.util.List<String> serviceCodes;

        @com.aliyun.core.annotation.NameInMap("TotalAuthenticatedEntities")
        private Integer totalAuthenticatedEntities;

        @com.aliyun.core.annotation.NameInMap("TrackedActionsLastAccessed")
        private java.util.List<TrackedActionsLastAccessed> trackedActionsLastAccessed;

        private ServicesLastAccessed(Builder builder) {
            this.grantPolicies = builder.grantPolicies;
            this.lastAuthenticated = builder.lastAuthenticated;
            this.lastAuthenticatedEntity = builder.lastAuthenticatedEntity;
            this.RAMCode = builder.RAMCode;
            this.serviceCodes = builder.serviceCodes;
            this.totalAuthenticatedEntities = builder.totalAuthenticatedEntities;
            this.trackedActionsLastAccessed = builder.trackedActionsLastAccessed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServicesLastAccessed create() {
            return builder().build();
        }

        /**
         * @return grantPolicies
         */
        public java.util.List<GrantPolicies> getGrantPolicies() {
            return this.grantPolicies;
        }

        /**
         * @return lastAuthenticated
         */
        public String getLastAuthenticated() {
            return this.lastAuthenticated;
        }

        /**
         * @return lastAuthenticatedEntity
         */
        public String getLastAuthenticatedEntity() {
            return this.lastAuthenticatedEntity;
        }

        /**
         * @return RAMCode
         */
        public String getRAMCode() {
            return this.RAMCode;
        }

        /**
         * @return serviceCodes
         */
        public java.util.List<String> getServiceCodes() {
            return this.serviceCodes;
        }

        /**
         * @return totalAuthenticatedEntities
         */
        public Integer getTotalAuthenticatedEntities() {
            return this.totalAuthenticatedEntities;
        }

        /**
         * @return trackedActionsLastAccessed
         */
        public java.util.List<TrackedActionsLastAccessed> getTrackedActionsLastAccessed() {
            return this.trackedActionsLastAccessed;
        }

        public static final class Builder {
            private java.util.List<GrantPolicies> grantPolicies; 
            private String lastAuthenticated; 
            private String lastAuthenticatedEntity; 
            private String RAMCode; 
            private java.util.List<String> serviceCodes; 
            private Integer totalAuthenticatedEntities; 
            private java.util.List<TrackedActionsLastAccessed> trackedActionsLastAccessed; 

            private Builder() {
            } 

            private Builder(ServicesLastAccessed model) {
                this.grantPolicies = model.grantPolicies;
                this.lastAuthenticated = model.lastAuthenticated;
                this.lastAuthenticatedEntity = model.lastAuthenticatedEntity;
                this.RAMCode = model.RAMCode;
                this.serviceCodes = model.serviceCodes;
                this.totalAuthenticatedEntities = model.totalAuthenticatedEntities;
                this.trackedActionsLastAccessed = model.trackedActionsLastAccessed;
            } 

            /**
             * GrantPolicies.
             */
            public Builder grantPolicies(java.util.List<GrantPolicies> grantPolicies) {
                this.grantPolicies = grantPolicies;
                return this;
            }

            /**
             * LastAuthenticated.
             */
            public Builder lastAuthenticated(String lastAuthenticated) {
                this.lastAuthenticated = lastAuthenticated;
                return this;
            }

            /**
             * LastAuthenticatedEntity.
             */
            public Builder lastAuthenticatedEntity(String lastAuthenticatedEntity) {
                this.lastAuthenticatedEntity = lastAuthenticatedEntity;
                return this;
            }

            /**
             * RAMCode.
             */
            public Builder RAMCode(String RAMCode) {
                this.RAMCode = RAMCode;
                return this;
            }

            /**
             * ServiceCodes.
             */
            public Builder serviceCodes(java.util.List<String> serviceCodes) {
                this.serviceCodes = serviceCodes;
                return this;
            }

            /**
             * TotalAuthenticatedEntities.
             */
            public Builder totalAuthenticatedEntities(Integer totalAuthenticatedEntities) {
                this.totalAuthenticatedEntities = totalAuthenticatedEntities;
                return this;
            }

            /**
             * TrackedActionsLastAccessed.
             */
            public Builder trackedActionsLastAccessed(java.util.List<TrackedActionsLastAccessed> trackedActionsLastAccessed) {
                this.trackedActionsLastAccessed = trackedActionsLastAccessed;
                return this;
            }

            public ServicesLastAccessed build() {
                return new ServicesLastAccessed(this);
            } 

        } 

    }
}
