// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @Query
    @NameInMap("DeleteAfterImageUpload")
    private String deleteAfterImageUpload;

    @Query
    @NameInMap("ImageName")
    @Validation(required = true)
    private String imageName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("SnapshotId")
    private String snapshotId;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.deleteAfterImageUpload = builder.deleteAfterImageUpload;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateImageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deleteAfterImageUpload
     */
    public String getDeleteAfterImageUpload() {
        return this.deleteAfterImageUpload;
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String deleteAfterImageUpload; 
        private String imageName; 
        private String instanceId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.deleteAfterImageUpload = request.deleteAfterImageUpload;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * DeleteAfterImageUpload.
         */
        public Builder deleteAfterImageUpload(String deleteAfterImageUpload) {
            this.putQueryParameter("DeleteAfterImageUpload", deleteAfterImageUpload);
            this.deleteAfterImageUpload = deleteAfterImageUpload;
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
         * SnapshotId.
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

}
