// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link CreateNASFileSystemResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNASFileSystemResponseBody</p>
 */
public class CreateNASFileSystemResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    private String fileSystemId;

    @com.aliyun.core.annotation.NameInMap("FileSystemName")
    private String fileSystemName;

    @com.aliyun.core.annotation.NameInMap("MountTargetDomain")
    private String mountTargetDomain;

    @com.aliyun.core.annotation.NameInMap("OfficeSiteId")
    private String officeSiteId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>ID of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>04f314****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.fileSystemId = fileSystemId;
            return this;
        }

        /**
         * <p>Name of the NAS file system.</p>
         * 
         * <strong>example:</strong>
         * <p>testNAS</p>
         */
        public Builder fileSystemName(String fileSystemName) {
            this.fileSystemName = fileSystemName;
            return this;
        }

        /**
         * <p>Mount point domain.</p>
         * 
         * <strong>example:</strong>
         * <p>04f314****-at***.cn-hangzhou.nas.aliyuncs.com</p>
         */
        public Builder mountTargetDomain(String mountTargetDomain) {
            this.mountTargetDomain = mountTargetDomain;
            return this;
        }

        /**
         * <p>Workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-363353****</p>
         */
        public Builder officeSiteId(String officeSiteId) {
            this.officeSiteId = officeSiteId;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>269BDB16-2CD8-4865-84BD-11C40BC21DB0</p>
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
