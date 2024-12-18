// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link GetProjectFeatureEntityRequest} extends {@link RequestModel}
 *
 * <p>GetProjectFeatureEntityRequest</p>
 */
public class GetProjectFeatureEntityRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FeatureEntityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureEntityName;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private GetProjectFeatureEntityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.projectId = builder.projectId;
        this.featureEntityName = builder.featureEntityName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetProjectFeatureEntityRequest create() {
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

    public static final class Builder extends Request.Builder<GetProjectFeatureEntityRequest, Builder> {
        private String instanceId; 
        private String projectId; 
        private String featureEntityName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetProjectFeatureEntityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.projectId = request.projectId;
            this.featureEntityName = request.featureEntityName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder projectId(String projectId) {
            this.putPathParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>feature_entity_1</p>
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
        public GetProjectFeatureEntityRequest build() {
            return new GetProjectFeatureEntityRequest(this);
        } 

    } 

}
