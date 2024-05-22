// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReInitDiskRequest} extends {@link RequestModel}
 *
 * <p>ReInitDiskRequest</p>
 */
public class ReInitDiskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    private ReInitDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.imageId = builder.imageId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReInitDiskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    public static final class Builder extends Request.Builder<ReInitDiskRequest, Builder> {
        private String diskId; 
        private String imageId; 

        private Builder() {
            super();
        } 

        private Builder(ReInitDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.imageId = request.imageId;
        } 

        /**
         * The ID of the disk to be initialized. You can initialize only one disk at a time.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The ID of the image to use to create the instance.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        @Override
        public ReInitDiskRequest build() {
            return new ReInitDiskRequest(this);
        } 

    } 

}
