// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nas20170626.models;

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
 * {@link DescribeFilesystemsAssociatedHpnZonesRequest} extends {@link RequestModel}
 *
 * <p>DescribeFilesystemsAssociatedHpnZonesRequest</p>
 */
public class DescribeFilesystemsAssociatedHpnZonesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filesystems")
    private java.util.List<Filesystems> filesystems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DescribeFilesystemsAssociatedHpnZonesRequest(Builder builder) {
        super(builder);
        this.filesystems = builder.filesystems;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFilesystemsAssociatedHpnZonesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filesystems
     */
    public java.util.List<Filesystems> getFilesystems() {
        return this.filesystems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFilesystemsAssociatedHpnZonesRequest, Builder> {
        private java.util.List<Filesystems> filesystems; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFilesystemsAssociatedHpnZonesRequest request) {
            super(request);
            this.filesystems = request.filesystems;
            this.regionId = request.regionId;
        } 

        /**
         * Filesystems.
         */
        public Builder filesystems(java.util.List<Filesystems> filesystems) {
            String filesystemsShrink = shrink(filesystems, "Filesystems", "json");
            this.putQueryParameter("Filesystems", filesystemsShrink);
            this.filesystems = filesystems;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFilesystemsAssociatedHpnZonesRequest build() {
            return new DescribeFilesystemsAssociatedHpnZonesRequest(this);
        } 

    } 

    /**
     * 
     * {@link DescribeFilesystemsAssociatedHpnZonesRequest} extends {@link TeaModel}
     *
     * <p>DescribeFilesystemsAssociatedHpnZonesRequest</p>
     */
    public static class Filesystems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FileSystemId")
        private String fileSystemId;

        private Filesystems(Builder builder) {
            this.fileSystemId = builder.fileSystemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Filesystems create() {
            return builder().build();
        }

        /**
         * @return fileSystemId
         */
        public String getFileSystemId() {
            return this.fileSystemId;
        }

        public static final class Builder {
            private String fileSystemId; 

            private Builder() {
            } 

            private Builder(Filesystems model) {
                this.fileSystemId = model.fileSystemId;
            } 

            /**
             * FileSystemId.
             */
            public Builder fileSystemId(String fileSystemId) {
                this.fileSystemId = fileSystemId;
                return this;
            }

            public Filesystems build() {
                return new Filesystems(this);
            } 

        } 

    }
}
