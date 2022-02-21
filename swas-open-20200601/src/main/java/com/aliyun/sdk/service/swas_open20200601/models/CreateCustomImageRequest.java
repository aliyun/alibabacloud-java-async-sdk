// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCustomImageRequest} extends {@link RequestModel}
 *
 * <p>CreateCustomImageRequest</p>
 */
public class CreateCustomImageRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DataSnapshotId")
    private String dataSnapshotId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SystemSnapshotId")
    @Validation(required = true)
    private String systemSnapshotId;

    private CreateCustomImageRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dataSnapshotId = builder.dataSnapshotId;
        this.description = builder.description;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.systemSnapshotId = builder.systemSnapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCustomImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataSnapshotId
     */
    public String getDataSnapshotId() {
        return this.dataSnapshotId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageName
     */
    public String getImageName() {
        return this.imageName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return systemSnapshotId
     */
    public String getSystemSnapshotId() {
        return this.systemSnapshotId;
    }

    public static final class Builder extends Request.Builder<CreateCustomImageRequest, Builder> {
        private String clientToken; 
        private String dataSnapshotId; 
        private String description; 
        private String imageName; 
        private String instanceId; 
        private String regionId; 
        private String systemSnapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CreateCustomImageRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.dataSnapshotId = response.dataSnapshotId;
            this.description = response.description;
            this.imageName = response.imageName;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.systemSnapshotId = response.systemSnapshotId;
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
         * DataSnapshotId.
         */
        public Builder dataSnapshotId(String dataSnapshotId) {
            this.putQueryParameter("DataSnapshotId", dataSnapshotId);
            this.dataSnapshotId = dataSnapshotId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ImageName.
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * SystemSnapshotId.
         */
        public Builder systemSnapshotId(String systemSnapshotId) {
            this.putQueryParameter("SystemSnapshotId", systemSnapshotId);
            this.systemSnapshotId = systemSnapshotId;
            return this;
        }

        @Override
        public CreateCustomImageRequest build() {
            return new CreateCustomImageRequest(this);
        } 

    } 

}
