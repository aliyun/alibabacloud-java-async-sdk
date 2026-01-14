// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCImageRequest} extends {@link RequestModel}
 *
 * <p>CreateRCImageRequest</p>
 */
public class CreateRCImageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageName")
    private String imageName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SnapshotId")
    private String snapshotId;

    private CreateRCImageRequest(Builder builder) {
        super(builder);
        this.imageName = builder.imageName;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.snapshotId = builder.snapshotId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCImageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return snapshotId
     */
    public String getSnapshotId() {
        return this.snapshotId;
    }

    public static final class Builder extends Request.Builder<CreateRCImageRequest, Builder> {
        private String imageName; 
        private String instanceId; 
        private String regionId; 
        private String snapshotId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCImageRequest request) {
            super(request);
            this.imageName = request.imageName;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.snapshotId = request.snapshotId;
        } 

        /**
         * <p>The name of the custom image.</p>
         * 
         * <strong>example:</strong>
         * <p>Created_from_rc-vma9w5z699x9********</p>
         */
        public Builder imageName(String imageName) {
            this.putQueryParameter("ImageName", imageName);
            this.imageName = imageName;
            return this;
        }

        /**
         * <p>The ID of the RDS Custom instance.</p>
         * 
         * <strong>example:</strong>
         * <p>rc-vma9w5z699x93204****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID. You can call the DescribeRegions operation to query the most recent region list.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The ID of the snapshot from which to create the custom image. You can call the DescribeRCSnapshots operation to query the snapshot ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rcds-c9bjdl79vz5dx********</p>
         */
        public Builder snapshotId(String snapshotId) {
            this.putQueryParameter("SnapshotId", snapshotId);
            this.snapshotId = snapshotId;
            return this;
        }

        @Override
        public CreateRCImageRequest build() {
            return new CreateRCImageRequest(this);
        } 

    } 

}
