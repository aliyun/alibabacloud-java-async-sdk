// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDcdnSLSRealTimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnSLSRealTimeLogDeliveryRequest</p>
 */
public class CreateDcdnSLSRealTimeLogDeliveryRequest extends Request {
    @Body
    @NameInMap("BusinessType")
    private String businessType;

    @Body
    @NameInMap("DataCenter")
    @Validation(required = true)
    private String dataCenter;

    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("ProjectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("SLSLogStore")
    @Validation(required = true)
    private String SLSLogStore;

    @Body
    @NameInMap("SLSProject")
    @Validation(required = true)
    private String SLSProject;

    @Body
    @NameInMap("SLSRegion")
    @Validation(required = true)
    private String SLSRegion;

    @Body
    @NameInMap("SamplingRate")
    private String samplingRate;

    private CreateDcdnSLSRealTimeLogDeliveryRequest(Builder builder) {
        super(builder);
        this.businessType = builder.businessType;
        this.dataCenter = builder.dataCenter;
        this.domainName = builder.domainName;
        this.projectName = builder.projectName;
        this.SLSLogStore = builder.SLSLogStore;
        this.SLSProject = builder.SLSProject;
        this.SLSRegion = builder.SLSRegion;
        this.samplingRate = builder.samplingRate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDcdnSLSRealTimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return businessType
     */
    public String getBusinessType() {
        return this.businessType;
    }

    /**
     * @return dataCenter
     */
    public String getDataCenter() {
        return this.dataCenter;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return SLSLogStore
     */
    public String getSLSLogStore() {
        return this.SLSLogStore;
    }

    /**
     * @return SLSProject
     */
    public String getSLSProject() {
        return this.SLSProject;
    }

    /**
     * @return SLSRegion
     */
    public String getSLSRegion() {
        return this.SLSRegion;
    }

    /**
     * @return samplingRate
     */
    public String getSamplingRate() {
        return this.samplingRate;
    }

    public static final class Builder extends Request.Builder<CreateDcdnSLSRealTimeLogDeliveryRequest, Builder> {
        private String businessType; 
        private String dataCenter; 
        private String domainName; 
        private String projectName; 
        private String SLSLogStore; 
        private String SLSProject; 
        private String SLSRegion; 
        private String samplingRate; 

        private Builder() {
            super();
        } 

        private Builder(CreateDcdnSLSRealTimeLogDeliveryRequest request) {
            super(request);
            this.businessType = request.businessType;
            this.dataCenter = request.dataCenter;
            this.domainName = request.domainName;
            this.projectName = request.projectName;
            this.SLSLogStore = request.SLSLogStore;
            this.SLSProject = request.SLSProject;
            this.SLSRegion = request.SLSRegion;
            this.samplingRate = request.samplingRate;
        } 

        /**
         * The type of the collected logs. Default value: cdn_log_access_l1. Valid values:
         * <p>
         * 
         * *   **cdn_log_access_l1**: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)
         * *   **cdn_log_origin**: back-to-origin logs
         * *   **cdn_log_er**: EdgeRoutine logs
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * The data center. Valid values:
         * <p>
         * 
         * *   cn: China
         * *   sg: Singapore
         * *   in: India
         * *   eu: Europe
         * *   us: United States
         */
        public Builder dataCenter(String dataCenter) {
            this.putBodyParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * The name of a real-time log delivery project.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the Log Service Logstore.
         */
        public Builder SLSLogStore(String SLSLogStore) {
            this.putBodyParameter("SLSLogStore", SLSLogStore);
            this.SLSLogStore = SLSLogStore;
            return this;
        }

        /**
         * The name of the Log Service project.
         */
        public Builder SLSProject(String SLSProject) {
            this.putBodyParameter("SLSProject", SLSProject);
            this.SLSProject = SLSProject;
            return this;
        }

        /**
         * The region to which real-time logs are delivered.
         */
        public Builder SLSRegion(String SLSRegion) {
            this.putBodyParameter("SLSRegion", SLSRegion);
            this.SLSRegion = SLSRegion;
            return this;
        }

        /**
         * The sampling rate.
         */
        public Builder samplingRate(String samplingRate) {
            this.putBodyParameter("SamplingRate", samplingRate);
            this.samplingRate = samplingRate;
            return this;
        }

        @Override
        public CreateDcdnSLSRealTimeLogDeliveryRequest build() {
            return new CreateDcdnSLSRealTimeLogDeliveryRequest(this);
        } 

    } 

}
