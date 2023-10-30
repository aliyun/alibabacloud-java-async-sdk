// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetProjectFeatureEntityHotIdsRequest} extends {@link RequestModel}
 *
 * <p>GetProjectFeatureEntityHotIdsRequest</p>
 */
public class GetProjectFeatureEntityHotIdsRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Path
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Path
    @NameInMap("NextSeqNumber")
    @Validation(required = true)
    private String nextSeqNumber;

    @Path
    @NameInMap("FeatureEntityName")
    @Validation(required = true)
    private String featureEntityName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private GetProjectFeatureEntityHotIdsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.nextSeqNumber = builder.nextSeqNumber;
        this.featureEntityName = builder.featureEntityName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectFeatureEntityHotIdsRequest create() {
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
     * @return nextSeqNumber
     */
    public String getNextSeqNumber() {
        return this.nextSeqNumber;
    }

    /**
     * @return featureEntityName
     */
    public String getFeatureEntityName() {
        return this.featureEntityName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetProjectFeatureEntityHotIdsRequest, Builder> {
        private String instanceId; 
        private String projectId; 
        private String nextSeqNumber; 
        private String featureEntityName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectFeatureEntityHotIdsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.nextSeqNumber = request.nextSeqNumber;
            this.featureEntityName = request.featureEntityName;
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
         * NextSeqNumber.
         */
        public Builder nextSeqNumber(String nextSeqNumber) {
            this.putPathParameter("NextSeqNumber", nextSeqNumber);
            this.nextSeqNumber = nextSeqNumber;
            return this;
        }

        /**
         * FeatureEntityName.
         */
        public Builder featureEntityName(String featureEntityName) {
            this.putPathParameter("FeatureEntityName", featureEntityName);
            this.featureEntityName = featureEntityName;
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
        public GetProjectFeatureEntityHotIdsRequest build() {
            return new GetProjectFeatureEntityHotIdsRequest(this);
        } 

    } 

}
