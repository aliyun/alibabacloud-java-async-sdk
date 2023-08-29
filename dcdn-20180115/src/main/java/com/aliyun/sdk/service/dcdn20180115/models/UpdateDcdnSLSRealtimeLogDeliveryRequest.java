// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDcdnSLSRealtimeLogDeliveryRequest} extends {@link RequestModel}
 *
 * <p>UpdateDcdnSLSRealtimeLogDeliveryRequest</p>
 */
public class UpdateDcdnSLSRealtimeLogDeliveryRequest extends Request {
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

    private UpdateDcdnSLSRealtimeLogDeliveryRequest(Builder builder) {
        super(builder);
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

    public static UpdateDcdnSLSRealtimeLogDeliveryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<UpdateDcdnSLSRealtimeLogDeliveryRequest, Builder> {
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

        private Builder(UpdateDcdnSLSRealtimeLogDeliveryRequest request) {
            super(request);
            this.dataCenter = request.dataCenter;
            this.domainName = request.domainName;
            this.projectName = request.projectName;
            this.SLSLogStore = request.SLSLogStore;
            this.SLSProject = request.SLSProject;
            this.SLSRegion = request.SLSRegion;
            this.samplingRate = request.samplingRate;
        } 

        /**
         * The region from which logs are collected.
         * <p>
         * 
         * *   **cn**: Chinese mainland
         * *   **sg**: Singapore
         * *   **in**: India
         * *   **eu**: Europe
         * *   **us**: United States
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
         * The name of the project.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * The name of the Logstore.
         */
        public Builder SLSLogStore(String SLSLogStore) {
            this.putBodyParameter("SLSLogStore", SLSLogStore);
            this.SLSLogStore = SLSLogStore;
            return this;
        }

        /**
         * The name of the log file.
         */
        public Builder SLSProject(String SLSProject) {
            this.putBodyParameter("SLSProject", SLSProject);
            this.SLSProject = SLSProject;
            return this;
        }

        /**
         * The region to which logs were delivered.
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
        public UpdateDcdnSLSRealtimeLogDeliveryRequest build() {
            return new UpdateDcdnSLSRealtimeLogDeliveryRequest(this);
        } 

    } 

}
