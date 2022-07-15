// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceSnapshotRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceSnapshotRequest</p>
 */
public class CreateInstanceSnapshotRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("ImageUrl")
    private String imageUrl;

    @Body
    @NameInMap("SnapshotDescription")
    private String snapshotDescription;

    @Body
    @NameInMap("SnapshotName")
    private String snapshotName;

    private CreateInstanceSnapshotRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.imageUrl = builder.imageUrl;
        this.snapshotDescription = builder.snapshotDescription;
        this.snapshotName = builder.snapshotName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceSnapshotRequest create() {
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
     * @return imageUrl
     */
    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     * @return snapshotDescription
     */
    public String getSnapshotDescription() {
        return this.snapshotDescription;
    }

    /**
     * @return snapshotName
     */
    public String getSnapshotName() {
        return this.snapshotName;
    }

    public static final class Builder extends Request.Builder<CreateInstanceSnapshotRequest, Builder> {
        private String instanceId; 
        private String imageUrl; 
        private String snapshotDescription; 
        private String snapshotName; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceSnapshotRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.imageUrl = request.imageUrl;
            this.snapshotDescription = request.snapshotDescription;
            this.snapshotName = request.snapshotName;
        } 

        /**
         * 实例Id
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * 镜像地址
         */
        public Builder imageUrl(String imageUrl) {
            this.putBodyParameter("ImageUrl", imageUrl);
            this.imageUrl = imageUrl;
            return this;
        }

        /**
         * 实例快照描述
         */
        public Builder snapshotDescription(String snapshotDescription) {
            this.putBodyParameter("SnapshotDescription", snapshotDescription);
            this.snapshotDescription = snapshotDescription;
            return this;
        }

        /**
         * 实例快照名称
         */
        public Builder snapshotName(String snapshotName) {
            this.putBodyParameter("SnapshotName", snapshotName);
            this.snapshotName = snapshotName;
            return this;
        }

        @Override
        public CreateInstanceSnapshotRequest build() {
            return new CreateInstanceSnapshotRequest(this);
        } 

    } 

}
