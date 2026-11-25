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
 * {@link AttachApplicationPolarFSResponseBody} extends {@link TeaModel}
 *
 * <p>AttachApplicationPolarFSResponseBody</p>
 */
public class AttachApplicationPolarFSResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.NameInMap("ContainerMountPath")
    private String containerMountPath;

    @com.aliyun.core.annotation.NameInMap("PolarFSInstanceId")
    private String polarFSInstanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private AttachApplicationPolarFSResponseBody(Builder builder) {
        this.applicationId = builder.applicationId;
        this.containerMountPath = builder.containerMountPath;
        this.polarFSInstanceId = builder.polarFSInstanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachApplicationPolarFSResponseBody create() {
        return builder().build();
    }

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
     * @return polarFSInstanceId
     */
    public String getPolarFSInstanceId() {
        return this.polarFSInstanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String applicationId; 
        private String containerMountPath; 
        private String polarFSInstanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(AttachApplicationPolarFSResponseBody model) {
            this.applicationId = model.applicationId;
            this.containerMountPath = model.containerMountPath;
            this.polarFSInstanceId = model.polarFSInstanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }

        /**
         * <p>The actual container path to which the file system is mounted. If ContainerMountPath is not specified, the effective default value /mnt/<PolarFSInstanceId> is returned. If the file system is repeatedly mounted without changing the path, the original mount point of the instance is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>/mnt/datasets</p>
         */
        public Builder containerMountPath(String containerMountPath) {
            this.containerMountPath = containerMountPath;
            return this;
        }

        /**
         * <p>The ID of the PolarLakebase instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pcs-**************</p>
         */
        public Builder polarFSInstanceId(String polarFSInstanceId) {
            this.polarFSInstanceId = polarFSInstanceId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3E5CD764-FCCA-5C9C-838E-20E0DE84B2AF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachApplicationPolarFSResponseBody build() {
            return new AttachApplicationPolarFSResponseBody(this);
        } 

    } 

}
