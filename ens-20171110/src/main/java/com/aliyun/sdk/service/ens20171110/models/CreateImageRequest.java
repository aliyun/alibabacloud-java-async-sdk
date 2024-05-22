// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateImageRequest} extends {@link RequestModel}
 *
 * <p>CreateImageRequest</p>
 */
public class CreateImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeleteAfterImageUpload")
    private String deleteAfterImageUpload;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
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
         * Specifies whether to automatically release the instance after the image is packaged and uploaded. Only image builders are supported. Default value: false. Valid values:
         * <p>
         * 
         * *   true: The image is released when the instance is released.
         * *   false: The image is retained when the instance is released.
         * *   If you leave this parameter empty, the default value is used.
         */
        public Builder deleteAfterImageUpload(String deleteAfterImageUpload) {
            this.putQueryParameter("DeleteAfterImageUpload", deleteAfterImageUpload);
            this.deleteAfterImageUpload = deleteAfterImageUpload;
            return this;
        }

        /**
         * The name of the image. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the snapshot.
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
