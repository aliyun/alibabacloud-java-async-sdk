// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.easygene20210315.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetPublicDatasetEntityRequest} extends {@link RequestModel}
 *
 * <p>GetPublicDatasetEntityRequest</p>
 */
public class GetPublicDatasetEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String datasetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    private GetPublicDatasetEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetName = builder.datasetName;
        this.entityType = builder.entityType;
        this.location = builder.location;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPublicDatasetEntityRequest create() {
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
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
    }

    public static final class Builder extends Request.Builder<GetPublicDatasetEntityRequest, Builder> {
        private String regionId; 
        private String datasetName; 
        private String entityType; 
        private String location; 

        private Builder() {
            super();
        } 

        private Builder(GetPublicDatasetEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetName = request.datasetName;
            this.entityType = request.entityType;
            this.location = request.location;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>西蒙斯基因组多样性计划</p>
         */
        public Builder datasetName(String datasetName) {
            this.putQueryParameter("DatasetName", datasetName);
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sample</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.putQueryParameter("Location", location);
            this.location = location;
            return this;
        }

        @Override
        public GetPublicDatasetEntityRequest build() {
            return new GetPublicDatasetEntityRequest(this);
        } 

    } 

}
