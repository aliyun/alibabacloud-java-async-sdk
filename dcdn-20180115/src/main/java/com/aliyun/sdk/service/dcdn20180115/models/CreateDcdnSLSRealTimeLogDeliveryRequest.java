// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateDcdnSLSRealTimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>CreateDcdnSLSRealTimeLogDeliveryRequest</p>
 */
public class CreateDcdnSLSRealTimeLogDeliveryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessType")
    private String businessType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataCenter")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataCenter;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SLSLogStore")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SLSLogStore;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SLSProject")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SLSProject;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SLSRegion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String SLSRegion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SamplingRate")
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
         * <p>The type of the collected logs. Default value: cdn_log_access_l1. Valid values:</p>
         * <ul>
         * <li><strong>cdn_log_access_l1</strong>: access logs of Dynamic Content Delivery Network (DCDN) points of presence (POPs)</li>
         * <li><strong>cdn_log_origin</strong>: back-to-origin logs</li>
         * <li><strong>cdn_log_er</strong>: EdgeRoutine logs</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cdn_log_access_l1</p>
         */
        public Builder businessType(String businessType) {
            this.putBodyParameter("BusinessType", businessType);
            this.businessType = businessType;
            return this;
        }

        /**
         * <p>The data center. Valid values:</p>
         * <ul>
         * <li>cn: China</li>
         * <li>sg: Singapore</li>
         * <li>eu: Europe</li>
         * <li>us: United States</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        public Builder dataCenter(String dataCenter) {
            this.putBodyParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * <p>The domain names from which logs were collected. You can specify one or more domain names. Separate multiple domain names with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The name of a real-time log delivery project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The name of the Log Service Logstore.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder SLSLogStore(String SLSLogStore) {
            this.putBodyParameter("SLSLogStore", SLSLogStore);
            this.SLSLogStore = SLSLogStore;
            return this;
        }

        /**
         * <p>The name of the Log Service project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyundoc</p>
         */
        public Builder SLSProject(String SLSProject) {
            this.putBodyParameter("SLSProject", SLSProject);
            this.SLSProject = SLSProject;
            return this;
        }

        /**
         * <p>The region to which real-time logs are delivered.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder SLSRegion(String SLSRegion) {
            this.putBodyParameter("SLSRegion", SLSRegion);
            this.SLSRegion = SLSRegion;
            return this;
        }

        /**
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
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
