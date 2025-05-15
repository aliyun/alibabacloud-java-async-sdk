// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link GetExperimentResultDataRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentResultDataRequest</p>
 */
public class GetExperimentResultDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExperimentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long experimentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Hostname")
    private String hostname;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkloadType")
    private String workloadType;

    private GetExperimentResultDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.experimentId = builder.experimentId;
        this.hostname = builder.hostname;
        this.resourceGroupId = builder.resourceGroupId;
        this.workloadType = builder.workloadType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentResultDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return experimentId
     */
    public Long getExperimentId() {
        return this.experimentId;
    }

    /**
     * @return hostname
     */
    public String getHostname() {
        return this.hostname;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return workloadType
     */
    public String getWorkloadType() {
        return this.workloadType;
    }

    public static final class Builder extends Request.Builder<GetExperimentResultDataRequest, Builder> {
        private String regionId; 
        private Long experimentId; 
        private String hostname; 
        private String resourceGroupId; 
        private String workloadType; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentResultDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.experimentId = request.experimentId;
            this.hostname = request.hostname;
            this.resourceGroupId = request.resourceGroupId;
            this.workloadType = request.workloadType;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Experiment ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>234</p>
         */
        public Builder experimentId(Long experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
            return this;
        }

        /**
         * <p>Hostname</p>
         * 
         * <strong>example:</strong>
         * <p>iZj6ccwd7zwfms7hzaz2riZ</p>
         */
        public Builder hostname(String hostname) {
            this.putQueryParameter("Hostname", hostname);
            this.hostname = hostname;
            return this;
        }

        /**
         * <p>Resource Group Id</p>
         * 
         * <strong>example:</strong>
         * <p>rg-sfjgskdfj3k4</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>Workload Type</p>
         * 
         * <strong>example:</strong>
         * <p>AI</p>
         */
        public Builder workloadType(String workloadType) {
            this.putQueryParameter("WorkloadType", workloadType);
            this.workloadType = workloadType;
            return this;
        }

        @Override
        public GetExperimentResultDataRequest build() {
            return new GetExperimentResultDataRequest(this);
        } 

    } 

}
