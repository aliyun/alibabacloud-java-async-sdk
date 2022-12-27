// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReInitDiskRequest} extends {@link RequestModel}
 *
 * <p>ReInitDiskRequest</p>
 */
public class ReInitDiskRequest extends Request {
    @Query
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Query
    @NameInMap("ImageId")
    @Validation(required = true)
    private String imageId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private ReInitDiskRequest(Builder builder) {
        super(builder);
        this.diskId = builder.diskId;
        this.imageId = builder.imageId;
        this.version = builder.version;
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

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<ReInitDiskRequest, Builder> {
        private String diskId; 
        private String imageId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(ReInitDiskRequest request) {
            super(request);
            this.diskId = request.diskId;
            this.imageId = request.imageId;
            this.version = request.version;
        } 

        /**
         * DiskId.
         */
        public Builder diskId(String diskId) {
            this.putQueryParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * 2017-11-10
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public ReInitDiskRequest build() {
            return new ReInitDiskRequest(this);
        } 

    } 

}
