// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectFeatureViewRequest} extends {@link RequestModel}
 *
 * <p>GetProjectFeatureViewRequest</p>
 */
public class GetProjectFeatureViewRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("FeatureViewName")
    @Validation(required = true)
    private String featureViewName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetProjectFeatureViewRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.featureViewName = builder.featureViewName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectFeatureViewRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return featureViewName
     */
    public String getFeatureViewName() {
        return this.featureViewName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetProjectFeatureViewRequest, Builder> {
        private String instanceId; 
        private String projectId; 
        private String featureViewName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectFeatureViewRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.featureViewName = request.featureViewName;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * FeatureViewName.
         */
        public Builder featureViewName(String featureViewName) {
            this.putPathParameter("FeatureViewName", featureViewName);
            this.featureViewName = featureViewName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public GetProjectFeatureViewRequest build() {
            return new GetProjectFeatureViewRequest(this);
        } 

    } 

}
