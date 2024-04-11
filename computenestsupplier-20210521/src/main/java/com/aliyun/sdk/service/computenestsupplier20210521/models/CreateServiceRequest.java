// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceRequest</p>
 */
public class CreateServiceRequest extends Request {
    @Query
    @NameInMap("AlarmMetadata")
    private String alarmMetadata;

    @Query
    @NameInMap("ApprovalType")
    private String approvalType;

    @Query
    @NameInMap("BuildParameters")
    private String buildParameters;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DeployMetadata")
    private String deployMetadata;

    @Query
    @NameInMap("DeployType")
    @Validation(required = true)
    private String deployType;

    @Query
    @NameInMap("Duration")
    private Long duration;

    @Query
    @NameInMap("IsSupportOperated")
    private Boolean isSupportOperated;

    @Query
    @NameInMap("LicenseMetadata")
    private String licenseMetadata;

    @Query
    @NameInMap("LogMetadata")
    private String logMetadata;

    @Query
    @NameInMap("OperationMetadata")
    private String operationMetadata;

    @Query
    @NameInMap("PolicyNames")
    private String policyNames;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Resellable")
    private Boolean resellable;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ServiceId")
    private String serviceId;

    @Query
    @NameInMap("ServiceInfo")
    private java.util.List < ServiceInfo> serviceInfo;

    @Query
    @NameInMap("ServiceType")
    private String serviceType;

    @Query
    @NameInMap("ShareType")
    private String shareType;

    @Query
    @NameInMap("SourceServiceId")
    private String sourceServiceId;

    @Query
    @NameInMap("SourceServiceVersion")
    private String sourceServiceVersion;

    @Query
    @NameInMap("Tag")
    private java.util.List < Tag> tag;

    @Query
    @NameInMap("TenantType")
    private String tenantType;

    @Query
    @NameInMap("TrialDuration")
    private Long trialDuration;

    @Query
    @NameInMap("UpgradeMetadata")
    private String upgradeMetadata;

    @Query
    @NameInMap("VersionName")
    private String versionName;

    private CreateServiceRequest(Builder builder) {
        super(builder);
        this.alarmMetadata = builder.alarmMetadata;
        this.approvalType = builder.approvalType;
        this.buildParameters = builder.buildParameters;
        this.clientToken = builder.clientToken;
        this.deployMetadata = builder.deployMetadata;
        this.deployType = builder.deployType;
        this.duration = builder.duration;
        this.isSupportOperated = builder.isSupportOperated;
        this.licenseMetadata = builder.licenseMetadata;
        this.logMetadata = builder.logMetadata;
        this.operationMetadata = builder.operationMetadata;
        this.policyNames = builder.policyNames;
        this.regionId = builder.regionId;
        this.resellable = builder.resellable;
        this.resourceGroupId = builder.resourceGroupId;
        this.serviceId = builder.serviceId;
        this.serviceInfo = builder.serviceInfo;
        this.serviceType = builder.serviceType;
        this.shareType = builder.shareType;
        this.sourceServiceId = builder.sourceServiceId;
        this.sourceServiceVersion = builder.sourceServiceVersion;
        this.tag = builder.tag;
        this.tenantType = builder.tenantType;
        this.trialDuration = builder.trialDuration;
        this.upgradeMetadata = builder.upgradeMetadata;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmMetadata
     */
    public String getAlarmMetadata() {
        return this.alarmMetadata;
    }

    /**
     * @return approvalType
     */
    public String getApprovalType() {
        return this.approvalType;
    }

    /**
     * @return buildParameters
     */
    public String getBuildParameters() {
        return this.buildParameters;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deployMetadata
     */
    public String getDeployMetadata() {
        return this.deployMetadata;
    }

    /**
     * @return deployType
     */
    public String getDeployType() {
        return this.deployType;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return isSupportOperated
     */
    public Boolean getIsSupportOperated() {
        return this.isSupportOperated;
    }

    /**
     * @return licenseMetadata
     */
    public String getLicenseMetadata() {
        return this.licenseMetadata;
    }

    /**
     * @return logMetadata
     */
    public String getLogMetadata() {
        return this.logMetadata;
    }

    /**
     * @return operationMetadata
     */
    public String getOperationMetadata() {
        return this.operationMetadata;
    }

    /**
     * @return policyNames
     */
    public String getPolicyNames() {
        return this.policyNames;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resellable
     */
    public Boolean getResellable() {
        return this.resellable;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
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
    public java.util.List < ServiceInfo> getServiceInfo() {
        return this.serviceInfo;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return shareType
     */
    public String getShareType() {
        return this.shareType;
    }

    /**
     * @return sourceServiceId
     */
    public String getSourceServiceId() {
        return this.sourceServiceId;
    }

    /**
     * @return sourceServiceVersion
     */
    public String getSourceServiceVersion() {
        return this.sourceServiceVersion;
    }

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
    }

    /**
     * @return tenantType
     */
    public String getTenantType() {
        return this.tenantType;
    }

    /**
     * @return trialDuration
     */
    public Long getTrialDuration() {
        return this.trialDuration;
    }

    /**
     * @return upgradeMetadata
     */
    public String getUpgradeMetadata() {
        return this.upgradeMetadata;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<CreateServiceRequest, Builder> {
        private String alarmMetadata; 
        private String approvalType; 
        private String buildParameters; 
        private String clientToken; 
        private String deployMetadata; 
        private String deployType; 
        private Long duration; 
        private Boolean isSupportOperated; 
        private String licenseMetadata; 
        private String logMetadata; 
        private String operationMetadata; 
        private String policyNames; 
        private String regionId; 
        private Boolean resellable; 
        private String resourceGroupId; 
        private String serviceId; 
        private java.util.List < ServiceInfo> serviceInfo; 
        private String serviceType; 
        private String shareType; 
        private String sourceServiceId; 
        private String sourceServiceVersion; 
        private java.util.List < Tag> tag; 
        private String tenantType; 
        private Long trialDuration; 
        private String upgradeMetadata; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceRequest request) {
            super(request);
            this.alarmMetadata = request.alarmMetadata;
            this.approvalType = request.approvalType;
            this.buildParameters = request.buildParameters;
            this.clientToken = request.clientToken;
            this.deployMetadata = request.deployMetadata;
            this.deployType = request.deployType;
            this.duration = request.duration;
            this.isSupportOperated = request.isSupportOperated;
            this.licenseMetadata = request.licenseMetadata;
            this.logMetadata = request.logMetadata;
            this.operationMetadata = request.operationMetadata;
            this.policyNames = request.policyNames;
            this.regionId = request.regionId;
            this.resellable = request.resellable;
            this.resourceGroupId = request.resourceGroupId;
            this.serviceId = request.serviceId;
            this.serviceInfo = request.serviceInfo;
            this.serviceType = request.serviceType;
            this.shareType = request.shareType;
            this.sourceServiceId = request.sourceServiceId;
            this.sourceServiceVersion = request.sourceServiceVersion;
            this.tag = request.tag;
            this.tenantType = request.tenantType;
            this.trialDuration = request.trialDuration;
            this.upgradeMetadata = request.upgradeMetadata;
            this.versionName = request.versionName;
        } 

        /**
         * AlarmMetadata.
         */
        public Builder alarmMetadata(String alarmMetadata) {
            this.putQueryParameter("AlarmMetadata", alarmMetadata);
            this.alarmMetadata = alarmMetadata;
            return this;
        }

        /**
         * ApprovalType.
         */
        public Builder approvalType(String approvalType) {
            this.putQueryParameter("ApprovalType", approvalType);
            this.approvalType = approvalType;
            return this;
        }

        /**
         * BuildParameters.
         */
        public Builder buildParameters(String buildParameters) {
            this.putQueryParameter("BuildParameters", buildParameters);
            this.buildParameters = buildParameters;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * DeployMetadata.
         */
        public Builder deployMetadata(String deployMetadata) {
            this.putQueryParameter("DeployMetadata", deployMetadata);
            this.deployMetadata = deployMetadata;
            return this;
        }

        /**
         * DeployType.
         */
        public Builder deployType(String deployType) {
            this.putQueryParameter("DeployType", deployType);
            this.deployType = deployType;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Long duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * IsSupportOperated.
         */
        public Builder isSupportOperated(Boolean isSupportOperated) {
            this.putQueryParameter("IsSupportOperated", isSupportOperated);
            this.isSupportOperated = isSupportOperated;
            return this;
        }

        /**
         * LicenseMetadata.
         */
        public Builder licenseMetadata(String licenseMetadata) {
            this.putQueryParameter("LicenseMetadata", licenseMetadata);
            this.licenseMetadata = licenseMetadata;
            return this;
        }

        /**
         * LogMetadata.
         */
        public Builder logMetadata(String logMetadata) {
            this.putQueryParameter("LogMetadata", logMetadata);
            this.logMetadata = logMetadata;
            return this;
        }

        /**
         * OperationMetadata.
         */
        public Builder operationMetadata(String operationMetadata) {
            this.putQueryParameter("OperationMetadata", operationMetadata);
            this.operationMetadata = operationMetadata;
            return this;
        }

        /**
         * PolicyNames.
         */
        public Builder policyNames(String policyNames) {
            this.putQueryParameter("PolicyNames", policyNames);
            this.policyNames = policyNames;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Resellable.
         */
        public Builder resellable(Boolean resellable) {
            this.putQueryParameter("Resellable", resellable);
            this.resellable = resellable;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ServiceId.
         */
        public Builder serviceId(String serviceId) {
            this.putQueryParameter("ServiceId", serviceId);
            this.serviceId = serviceId;
            return this;
        }

        /**
         * ServiceInfo.
         */
        public Builder serviceInfo(java.util.List < ServiceInfo> serviceInfo) {
            this.putQueryParameter("ServiceInfo", serviceInfo);
            this.serviceInfo = serviceInfo;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * ShareType.
         */
        public Builder shareType(String shareType) {
            this.putQueryParameter("ShareType", shareType);
            this.shareType = shareType;
            return this;
        }

        /**
         * SourceServiceId.
         */
        public Builder sourceServiceId(String sourceServiceId) {
            this.putQueryParameter("SourceServiceId", sourceServiceId);
            this.sourceServiceId = sourceServiceId;
            return this;
        }

        /**
         * SourceServiceVersion.
         */
        public Builder sourceServiceVersion(String sourceServiceVersion) {
            this.putQueryParameter("SourceServiceVersion", sourceServiceVersion);
            this.sourceServiceVersion = sourceServiceVersion;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List < Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * TenantType.
         */
        public Builder tenantType(String tenantType) {
            this.putQueryParameter("TenantType", tenantType);
            this.tenantType = tenantType;
            return this;
        }

        /**
         * TrialDuration.
         */
        public Builder trialDuration(Long trialDuration) {
            this.putQueryParameter("TrialDuration", trialDuration);
            this.trialDuration = trialDuration;
            return this;
        }

        /**
         * UpgradeMetadata.
         */
        public Builder upgradeMetadata(String upgradeMetadata) {
            this.putQueryParameter("UpgradeMetadata", upgradeMetadata);
            this.upgradeMetadata = upgradeMetadata;
            return this;
        }

        /**
         * VersionName.
         */
        public Builder versionName(String versionName) {
            this.putQueryParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreateServiceRequest build() {
            return new CreateServiceRequest(this);
        } 

    } 

    public static class Agreements extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Url")
        private String url;

        private Agreements(Builder builder) {
            this.name = builder.name;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Agreements create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String name; 
            private String url; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Agreements build() {
                return new Agreements(this);
            } 

        } 

    }
    public static class ServiceInfo extends TeaModel {
        @NameInMap("Agreements")
        private java.util.List < Agreements> agreements;

        @NameInMap("Image")
        private String image;

        @NameInMap("Locale")
        @Validation(required = true)
        private String locale;

        @NameInMap("LongDescriptionUrl")
        private String longDescriptionUrl;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        @NameInMap("ShortDescription")
        private String shortDescription;

        private ServiceInfo(Builder builder) {
            this.agreements = builder.agreements;
            this.image = builder.image;
            this.locale = builder.locale;
            this.longDescriptionUrl = builder.longDescriptionUrl;
            this.name = builder.name;
            this.shortDescription = builder.shortDescription;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceInfo create() {
            return builder().build();
        }

        /**
         * @return agreements
         */
        public java.util.List < Agreements> getAgreements() {
            return this.agreements;
        }

        /**
         * @return image
         */
        public String getImage() {
            return this.image;
        }

        /**
         * @return locale
         */
        public String getLocale() {
            return this.locale;
        }

        /**
         * @return longDescriptionUrl
         */
        public String getLongDescriptionUrl() {
            return this.longDescriptionUrl;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortDescription
         */
        public String getShortDescription() {
            return this.shortDescription;
        }

        public static final class Builder {
            private java.util.List < Agreements> agreements; 
            private String image; 
            private String locale; 
            private String longDescriptionUrl; 
            private String name; 
            private String shortDescription; 

            /**
             * Agreements.
             */
            public Builder agreements(java.util.List < Agreements> agreements) {
                this.agreements = agreements;
                return this;
            }

            /**
             * Image.
             */
            public Builder image(String image) {
                this.image = image;
                return this;
            }

            /**
             * Locale.
             */
            public Builder locale(String locale) {
                this.locale = locale;
                return this;
            }

            /**
             * LongDescriptionUrl.
             */
            public Builder longDescriptionUrl(String longDescriptionUrl) {
                this.longDescriptionUrl = longDescriptionUrl;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ShortDescription.
             */
            public Builder shortDescription(String shortDescription) {
                this.shortDescription = shortDescription;
                return this;
            }

            public ServiceInfo build() {
                return new ServiceInfo(this);
            } 

        } 

    }
    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
