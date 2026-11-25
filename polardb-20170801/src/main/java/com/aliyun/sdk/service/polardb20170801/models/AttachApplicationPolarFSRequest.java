// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link AttachApplicationPolarFSRequest} extends {@link RequestModel}
 *
 * <p>AttachApplicationPolarFSRequest</p>
 */
public class AttachApplicationPolarFSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContainerMountPath")
    private String containerMountPath;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSAccessKeyId")
    private String polarFSAccessKeyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSAccessKeySecret")
    private String polarFSAccessKeySecret;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFSInstanceId;

    private AttachApplicationPolarFSRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.containerMountPath = builder.containerMountPath;
        this.polarFSAccessKeyId = builder.polarFSAccessKeyId;
        this.polarFSAccessKeySecret = builder.polarFSAccessKeySecret;
        this.polarFSInstanceId = builder.polarFSInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachApplicationPolarFSRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return containerMountPath
     */
    public String getContainerMountPath() {
        return this.containerMountPath;
    }

    /**
     * @return polarFSAccessKeyId
     */
    public String getPolarFSAccessKeyId() {
        return this.polarFSAccessKeyId;
    }

    /**
     * @return polarFSAccessKeySecret
     */
    public String getPolarFSAccessKeySecret() {
        return this.polarFSAccessKeySecret;
    }

    /**
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    public static final class Builder extends Request.Builder<AttachApplicationPolarFSRequest, Builder> {
        private String applicationId; 
        private String containerMountPath; 
        private String polarFSAccessKeyId; 
        private String polarFSAccessKeySecret; 
        private String polarFSInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(AttachApplicationPolarFSRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.containerMountPath = request.containerMountPath;
            this.polarFSAccessKeyId = request.polarFSAccessKeyId;
            this.polarFSAccessKeySecret = request.polarFSAccessKeySecret;
            this.polarFSInstanceId = request.polarFSInstanceId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The mount point of the file system visible in the application container. If this parameter is not specified, the default value /mnt/<PolarFSInstanceId> is used for the first mount. For subsequent mounts, the current mount point of the instance remains unchanged. The value must be an absolute path that starts with a forward slash (/) but cannot be the root directory (/). It can only contain letters, digits, periods (.), underscores (_), hyphens (-), and forward slashes (/). The total length cannot exceed 128 characters, the directory depth cannot exceed 6 levels, and the length of a single level cannot exceed 63 characters. The mount point cannot be identical to or a subdirectory of the mount points of other file systems under the same application.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/datasets</p>
         */
        public Builder containerMountPath(String containerMountPath) {
            this.putQueryParameter("ContainerMountPath", containerMountPath);
            this.containerMountPath = containerMountPath;
            return this;
        }

        /**
         * <p>The AccessKey ID of the Alibaba Cloud account or RAM user. Ensure that the account or RAM user is authorized when you create the PolarLakebase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>LT**********************</p>
         */
        public Builder polarFSAccessKeyId(String polarFSAccessKeyId) {
            this.putQueryParameter("PolarFSAccessKeyId", polarFSAccessKeyId);
            this.polarFSAccessKeyId = polarFSAccessKeyId;
            return this;
        }

        /**
         * <p>The AccessKey secret of the Alibaba Cloud account or RAM user.</p>
         * 
         * <strong>example:</strong>
         * <p>H3****************************</p>
         */
        public Builder polarFSAccessKeySecret(String polarFSAccessKeySecret) {
            this.putQueryParameter("PolarFSAccessKeySecret", polarFSAccessKeySecret);
            this.polarFSAccessKeySecret = polarFSAccessKeySecret;
            return this;
        }

        /**
         * <p>The PolarLakebase cold storage instance ID.</p>
         * <p>Currently, only the following applications support cold storage instances:</p>
         * <ul>
         * <li>supabase</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-**************</p>
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.putQueryParameter("PolarFSInstanceId", polarFSInstanceId);
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        @Override
        public AttachApplicationPolarFSRequest build() {
            return new AttachApplicationPolarFSRequest(this);
        } 

    } 

}
