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

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

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
        this.ownerId = builder.ownerId;
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
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
        private Long ownerId; 
        private String projectName; 
        private String SLSLogStore; 
        private String SLSProject; 
        private String SLSRegion; 
        private String samplingRate; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDcdnSLSRealtimeLogDeliveryRequest response) {
            super(response);
            this.dataCenter = response.dataCenter;
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.projectName = response.projectName;
            this.SLSLogStore = response.SLSLogStore;
            this.SLSProject = response.SLSProject;
            this.SLSRegion = response.SLSRegion;
            this.samplingRate = response.samplingRate;
        } 

        /**
         * DataCenter.
         */
        public Builder dataCenter(String dataCenter) {
            this.putBodyParameter("DataCenter", dataCenter);
            this.dataCenter = dataCenter;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * SLSLogStore.
         */
        public Builder SLSLogStore(String SLSLogStore) {
            this.putBodyParameter("SLSLogStore", SLSLogStore);
            this.SLSLogStore = SLSLogStore;
            return this;
        }

        /**
         * SLSProject.
         */
        public Builder SLSProject(String SLSProject) {
            this.putBodyParameter("SLSProject", SLSProject);
            this.SLSProject = SLSProject;
            return this;
        }

        /**
         * SLSRegion.
         */
        public Builder SLSRegion(String SLSRegion) {
            this.putBodyParameter("SLSRegion", SLSRegion);
            this.SLSRegion = SLSRegion;
            return this;
        }

        /**
         * SamplingRate.
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
