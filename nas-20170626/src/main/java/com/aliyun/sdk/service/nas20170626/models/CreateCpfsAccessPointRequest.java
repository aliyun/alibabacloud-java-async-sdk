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
 * {@link CreateCpfsAccessPointRequest} extends {@link RequestModel}
 *
 * <p>CreateCpfsAccessPointRequest</p>
 */
public class CreateCpfsAccessPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileSystemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileSystemId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RootDirectory")
    private RootDirectory rootDirectory;

    private CreateCpfsAccessPointRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.fileSystemId = builder.fileSystemId;
        this.regionId = builder.regionId;
        this.rootDirectory = builder.rootDirectory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCpfsAccessPointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return fileSystemId
     */
    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return rootDirectory
     */
    public RootDirectory getRootDirectory() {
        return this.rootDirectory;
    }

    public static final class Builder extends Request.Builder<CreateCpfsAccessPointRequest, Builder> {
        private String description; 
        private String fileSystemId; 
        private String regionId; 
        private RootDirectory rootDirectory; 

        private Builder() {
            super();
        } 

        private Builder(CreateCpfsAccessPointRequest request) {
            super(request);
            this.description = request.description;
            this.fileSystemId = request.fileSystemId;
            this.regionId = request.regionId;
            this.rootDirectory = request.rootDirectory;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bmcpfs-099394bd928c****</p>
         */
        public Builder fileSystemId(String fileSystemId) {
            this.putQueryParameter("FileSystemId", fileSystemId);
            this.fileSystemId = fileSystemId;
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

        /**
         * RootDirectory.
         */
        public Builder rootDirectory(RootDirectory rootDirectory) {
            this.putQueryParameter("RootDirectory", rootDirectory);
            this.rootDirectory = rootDirectory;
            return this;
        }

        @Override
        public CreateCpfsAccessPointRequest build() {
            return new CreateCpfsAccessPointRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCpfsAccessPointRequest} extends {@link TeaModel}
     *
     * <p>CreateCpfsAccessPointRequest</p>
     */
    public static class RootDirectory extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RootPath")
        private String rootPath;

        private RootDirectory(Builder builder) {
            this.rootPath = builder.rootPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RootDirectory create() {
            return builder().build();
        }

        /**
         * @return rootPath
         */
        public String getRootPath() {
            return this.rootPath;
        }

        public static final class Builder {
            private String rootPath; 

            private Builder() {
            } 

            private Builder(RootDirectory model) {
                this.rootPath = model.rootPath;
            } 

            /**
             * RootPath.
             */
            public Builder rootPath(String rootPath) {
                this.rootPath = rootPath;
                return this;
            }

            public RootDirectory build() {
                return new RootDirectory(this);
            } 

        } 

    }
}
