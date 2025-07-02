// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetOSSRegionId")
    private String targetOSSRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WithDataDisks")
    private Boolean withDataDisks;

    private CreateImageRequest(Builder builder) {
        super(builder);
        this.deleteAfterImageUpload = builder.deleteAfterImageUpload;
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.snapshotId = builder.snapshotId;
        this.targetOSSRegionId = builder.targetOSSRegionId;
        this.withDataDisks = builder.withDataDisks;
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

    /**
     * @return targetOSSRegionId
     */
    public String getTargetOSSRegionId() {
        return this.targetOSSRegionId;
    }

    /**
     * @return withDataDisks
     */
    public Boolean getWithDataDisks() {
        return this.withDataDisks;
    }

    public static final class Builder extends Request.Builder<CreateImageRequest, Builder> {
        private String deleteAfterImageUpload; 
        private String imageName; 
        private String instanceId; 
        private String snapshotId; 
        private String targetOSSRegionId; 
        private Boolean withDataDisks; 

        private Builder() {
            super();
        } 

        private Builder(CreateImageRequest request) {
            super(request);
            this.deleteAfterImageUpload = request.deleteAfterImageUpload;
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.snapshotId = request.snapshotId;
            this.targetOSSRegionId = request.targetOSSRegionId;
            this.withDataDisks = request.withDataDisks;
        } 

        /**
         * <p>Specifies whether to automatically release the instance after the image is packaged and uploaded. Only image builders are supported. Default value: false. Valid values:</p>
         * <ul>
         * <li>true: The image is released when the instance is released.</li>
         * <li>false: The image is retained when the instance is released.</li>
         * <li>If you leave this property empty, false is used by default.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder deleteAfterImageUpload(String deleteAfterImageUpload) {
            this.putQueryParameter("DeleteAfterImageUpload", deleteAfterImageUpload);
            this.deleteAfterImageUpload = deleteAfterImageUpload;
            return this;
        }

        /**
         * <p>The name of the image. The name must be 2 to 128 characters in length. The name can contain letters, digits, colons (:), underscores (<em>), and hyphens (-). It must start with a letter but cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (:), underscores (</em>), and hyphens (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ImageName</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-5rr1bnyrc4tswr8cq3w6y****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>s-bp67acfmxazb4p****</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        /**
         * <p>The region of the destination OSS bucket where the image is to be stored.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder targetOSSRegionId(String targetOSSRegionId) {
            this.putQueryParameter("TargetOSSRegionId", targetOSSRegionId);
            this.targetOSSRegionId = targetOSSRegionId;
            return this;
        }

        /**
         * <p>Specifies whether to include data disk snapshots in the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>Value true false (default)</p>
         */
        public Builder withDataDisks(Boolean withDataDisks) {
            this.putQueryParameter("WithDataDisks", withDataDisks);
            this.withDataDisks = withDataDisks;
            return this;
        }

        @Override
        public CreateImageRequest build() {
            return new CreateImageRequest(this);
        } 

    } 

}
