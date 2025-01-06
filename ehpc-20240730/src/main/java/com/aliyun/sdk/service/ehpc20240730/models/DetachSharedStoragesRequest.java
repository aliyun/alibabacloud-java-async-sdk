// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20240730.models;

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
    private java.util.List<SharedStorages> sharedStorages;

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
    public java.util.List<SharedStorages> getSharedStorages() {
        return this.sharedStorages;
    }

    public static final class Builder extends Request.Builder<DetachSharedStoragesRequest, Builder> {
        private String clusterId; 
        private java.util.List<SharedStorages> sharedStorages; 

        private Builder() {
            super();
        } 

        private Builder(DetachSharedStoragesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.sharedStorages = request.sharedStorages;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The information about mounted shared storage resources.</p>
         * <p>This parameter is required.</p>
         */
        public Builder sharedStorages(java.util.List<SharedStorages> sharedStorages) {
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

    /**
     * 
     * {@link DetachSharedStoragesRequest} extends {@link TeaModel}
     *
     * <p>DetachSharedStoragesRequest</p>
     */
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
             * <p>The local mount directory of the mounted file system.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>/test</p>
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
