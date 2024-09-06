// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachSharedStoragesRequest} extends {@link RequestModel}
 *
 * <p>DetachSharedStoragesRequest</p>
 */
public class DetachSharedStoragesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SharedStorages")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < SharedStorages> sharedStorages;

    private DetachSharedStoragesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.sharedStorages = builder.sharedStorages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachSharedStoragesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return sharedStorages
     */
    public java.util.List < SharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public static final class Builder extends Request.Builder<DetachSharedStoragesRequest, Builder> {
        private String clusterId; 
        private java.util.List < SharedStorages> sharedStorages; 

        private Builder() {
            super();
        } 

        private Builder(DetachSharedStoragesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.sharedStorages = request.sharedStorages;
        } 

        /**
         * The cluster ID.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The information about mounted shared storage resources.
         */
        public Builder sharedStorages(java.util.List < SharedStorages> sharedStorages) {
            String sharedStoragesShrink = shrink(sharedStorages, "SharedStorages", "json");
            this.putQueryParameter("SharedStorages", sharedStoragesShrink);
            this.sharedStorages = sharedStorages;
            return this;
        }

        @Override
        public DetachSharedStoragesRequest build() {
            return new DetachSharedStoragesRequest(this);
        } 

    } 

    public static class SharedStorages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MountDirectory")
        @com.aliyun.core.annotation.Validation(required = true)
        private String mountDirectory;

        private SharedStorages(Builder builder) {
            this.mountDirectory = builder.mountDirectory;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedStorages create() {
            return builder().build();
        }

        /**
         * @return mountDirectory
         */
        public String getMountDirectory() {
            return this.mountDirectory;
        }

        public static final class Builder {
            private String mountDirectory; 

            /**
             * The local mount directory of the mounted file system.
             */
            public Builder mountDirectory(String mountDirectory) {
                this.mountDirectory = mountDirectory;
                return this;
            }

            public SharedStorages build() {
                return new SharedStorages(this);
            } 

        } 

    }
}
