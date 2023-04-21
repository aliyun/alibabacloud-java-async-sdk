// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNASFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNASFileSystemResponseBody</p>
 */
public class CreateNASFileSystemResponseBody extends TeaModel {
    @NameInMap("FileSystemId")
    private String fileSystemId;

    @NameInMap("FileSystemName")
    private String fileSystemName;

    @NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @NameInMap("OfficeSiteId")
    private String officeSiteId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateNASFileSystemResponseBody(Builder builder) {
        this.fileSystemId = builder.fileSystemId;
        this.fileSystemName = builder.fileSystemName;
        this.mountTargetDomain = builder.mountTargetDomain;
        this.officeSiteId = builder.officeSiteId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNASFileSystemResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return fileSystemName
     */
    public String getFileSystemName() {
        return this.fileSystemName;
    }

    /**
     * @return mountTargetDomain
     */
    public String getMountTargetDomain() {
        return this.mountTargetDomain;
    }

    /**
     * @return officeSiteId
     */
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String fileSystemId; 
        private String fileSystemName; 
        private String mountTargetDomain; 
        private String officeSiteId; 
        private String requestId; 

        /**
         * The ID of the NAS file system.
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * The name of the NAS file system.
         */
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }

        /**
         * The domain name of the mount target.
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * The ID of the workspace.
         */
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNASFileSystemResponseBody build() {
            return new CreateNASFileSystemResponseBody(this);
        } 

    } 

}
